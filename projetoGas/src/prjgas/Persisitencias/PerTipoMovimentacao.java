
package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.TipoMovimentacao;

public class PerTipoMovimentacao {
     public static boolean inserirTipoMovimentacao(TipoMovimentacao tipo){
        String SQL="insert into tbTipoMovimentacao(nmTipoMovimentacao,dscrTipoMovimentacao,situacao) values (?,?,?)"; 
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,tipo.getnmTipoMovimentacao());
            pst.setString(2,tipo.getdscrTipoMovimentacao());
            pst.setString(3,tipo.getSituacao());
          
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

        String SQL = "update tbTipoMovimentacao set nmTipoMovimentacao=?,dscrTipoMovimentacao =?, situacao=? where idTipoMovmFinanceira =?";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Conexao.getConexao();

            pst = conn.prepareStatement(SQL);
            pst.setString(1,tipo.getnmTipoMovimentacao());
            pst.setString(2, tipo.getdscrTipoMovimentacao());
            pst.setString(3,tipo.getSituacao());
            pst.setInt(4,tipo.getidTipoMovimentacao());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        } JOptionPane.showMessageDialog(null,"Alterado com sucesso");
        return true;
    }
}