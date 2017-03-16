
package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.TipoMovimentacao;

public class PerTipoMovimentacao {
     public static boolean inserirTipoMovimentacao(TipoMovimentacao tipo){
        String SQL="insert into tbTipoMovimentacao(nmTipoMovimentacao,dscrTipoMovimentacao,situacao,saidaFinanceira,entradaFinanceira,saidaEstoque,entradaEstoque,requerFuncionario,idTipoMovimentacaoPai) values (?,?,?,?,?,?,?,?,?)"; 
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,tipo.getnmTipoMovimentacao());
            pst.setString(2,tipo.getdscrTipoMovimentacao());
            pst.setBoolean(3,tipo.isSituacao());
            pst.setBoolean(4,tipo.isSaidaFinanceira());
            pst.setBoolean(5,tipo.isEntradaFinanceira());
            pst.setBoolean(6,tipo.isSaidaEstoque());
            pst.setBoolean(7,tipo.isEntradaEstoque());
            pst.setBoolean(8,tipo.isRequerFuncionario());
            if (tipo.getidTipoMovimentacaoPai() > 0) {
                pst.setInt(9, tipo.getidTipoMovimentacaoPai());
            } else {
                pst.setNull(9, Types.INTEGER);
                
            }
            pst.executeUpdate();// executa no banco de dados
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
    }
     
      public ArrayList<TipoMovimentacao> TodosTiposMovimentacao() {
        String SQL = "select * from tbTipoMovimentacao";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList classeTipoMovmFinanceira = new ArrayList();
            while (rs.next()) {
                TipoMovimentacao tipoMovm = new TipoMovimentacao();
                tipoMovm.setidTipoMovimentcao(rs.getInt(1));
                tipoMovm.setnmTipoMovimentacao(rs.getString(2));
                tipoMovm.setdscrTipoMovimentacao(rs.getString(3));
                classeTipoMovmFinanceira.add(tipoMovm);
            }
            con.close();
            return classeTipoMovmFinanceira;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
      
      
     public boolean deletarTipoMovimentacao(int idTipoMovimentacao){
       String sql="delete from tbTipoMovimentacao where idTipoMovimentacao="+idTipoMovimentacao;
       Connection conn= null;
       PreparedStatement pst=null;
       try{
           conn= Conexao.getConexao();
           pst=conn.prepareStatement(sql);
           pst.clearParameters();
           pst.executeUpdate();
           return true;
       }catch(SQLException ex){
           ex.printStackTrace();
       }
        return false;
    }
     
      public boolean AlterarTipoMovimentacao(TipoMovimentacao tipo) {

        String SQL = "update tbTipoMovimentacao set nmTipoMovimentacao=?,dscrTipoMovimentacao=?, situacao=?,saidaFinanceira=?,entradaFinanceira=?,saidaEstoque=?,entradaEstoque=?,requerFuncionario=?,idTipoMovimentacaoPai=? where idTipoMovimentacao=?";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Conexao.getConexao();

            pst = conn.prepareStatement(SQL);
            pst.setString(1,tipo.getnmTipoMovimentacao());
            pst.setString(2,tipo.getdscrTipoMovimentacao());
            pst.setBoolean(3,tipo.isSituacao());
            pst.setBoolean(4,tipo.isSaidaFinanceira());
            pst.setBoolean(5,tipo.isEntradaFinanceira());
            pst.setBoolean(6,tipo.isSaidaEstoque());
            pst.setBoolean(7,tipo.isEntradaEstoque());
            pst.setBoolean(8,tipo.isRequerFuncionario());
            if (tipo.getidTipoMovimentacaoPai() > 0) {
                pst.setInt(9, tipo.getidTipoMovimentacaoPai());
            } else {
                pst.setNull(9, Types.INTEGER);
                
            }
            pst.setInt(10,tipo.getidTipoMovimentacao());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        } JOptionPane.showMessageDialog(null,"Alterado com sucesso");
        return true;
    }
      
       public TipoMovimentacao ConsultarTipoMovimentacao(int tipo){
        String sql="select nmTipoMovimentacao,dscrTipoMovimentacao,situacao,saidaFinanceira,entradaFinanceira,saidaEstoque,entradaEstoque,requerFuncionario,idTipoMovimentacaoPai from tbTipoMovimentacao where idTipoMovimentacao="+tipo+"";
        TipoMovimentacao tipoMovm=new  TipoMovimentacao();
        try{
            Connection conn=Conexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultset;//guarda dados vindos do banco de dados ou da interface 
            prepared=conn.prepareStatement(sql);
            resultset=prepared.executeQuery(); //faz a consulta
            if(resultset.next()){
                tipoMovm.setnmTipoMovimentacao(resultset.getString(1));
                tipoMovm.setdscrTipoMovimentacao(resultset.getString(2));
                tipoMovm.setSituacao(resultset.getBoolean(3));
                tipoMovm.setSaidaFinanceira(resultset.getBoolean(4));
                tipoMovm.setEntradaFinanceira(resultset.getBoolean(5));
                tipoMovm.setSaidaEstoque(resultset.getBoolean(6));
                tipoMovm.setEntradaEstoque(resultset.getBoolean(7));
                tipoMovm.setRequerFuncionario(resultset.getBoolean(8));
                tipoMovm.setidTipoMovimentcaoPai(resultset.getInt(9));
            }
            conn.close();//fechar conexao
        }catch(SQLException e){
            
            System.out.println("Erro ao localizar dados"+e.toString());
          return null; 
        }
            
        return tipoMovm;
    }
       
    public boolean AlterarSituacao(TipoMovimentacao situacao) {

        String SQL = "update tbTipoMovimentacao set  situacao=? where idTipoMovimentacao=?";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
           
            conn = Conexao.getConexao();
            pst = conn.prepareStatement(SQL); 
           
            pst.setBoolean(1, situacao.isSituacao());
            pst.setInt(2, situacao.getidTipoMovimentacao());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        }
      if(situacao.isSituacao()){
          JOptionPane.showMessageDialog(null,"Ativado!");
          
      }else{
          JOptionPane.showMessageDialog(null,"Desativado!");
      }
        return true;
    }
}