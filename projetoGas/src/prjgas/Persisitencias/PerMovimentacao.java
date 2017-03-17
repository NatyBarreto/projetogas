package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.Movimentacao;

public class PerMovimentacao{ 
     public static boolean inserirMovimentacao(Movimentacao movm){
        String SQL="insert into tbMovimentacao(dtMovimentacao,vlMovimentacao,dscrMovimentacao,qtdMovimentacao,tipoMovimentacao,funcionario,produto) values (?,?,?,?,?,?,?)";
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setDate(1,movm.getDtMovimentacao());
            
            pst.setDouble(2,movm.getVlMovimentcao());
            pst.setString(3,movm.getDscrMovimentacao());
            pst.setInt(4, movm.getQtdMovimentcao());
                
            if (movm.getTipoMovimentacao() > 0) {
                pst.setInt(5, movm.getTipoMovimentacao());
            } else {
                pst.setNull(5, Types.INTEGER);
                
            }
            if (movm.getFuncionario() > 0) {
                pst.setInt(6, movm.getFuncionario());
            } else {
                pst.setNull(6, Types.INTEGER);
                
            }
            if (movm.getProduto() > 0) {
                pst.setInt(7, movm.getProduto());
            } else {
                pst.setNull(7, Types.INTEGER);
                
            }
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
     }  
  public ArrayList<Movimentacao> TodasMovimentacao() {
        String SQL = "select * from tbMovimentacao";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList clsmodel = new ArrayList();
            while (rs.next()) {
                Movimentacao movm = new Movimentacao();
                movm.setIdMovimentcao(rs.getInt(1));
                movm.setDtMovimentacao(rs.getDate(2));
                movm.setVlMovimentcao(rs.getDouble(3));
                movm.setDscrMovimentacao(rs.getString(4));
                movm.setQtdMovimentcao(rs.getInt(5));
                movm.setTipoMovimentacao(rs.getInt(6));
                movm.setFuncionario(rs.getInt(7));
                movm.setProduto(rs.getInt(8));
                clsmodel.add(movm);
            }
            con.close();
            return clsmodel;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public boolean deletarMovimentacao(int idMovimentacao) {
        String sql = "delete from tbMovimentacao where idMovimentacao=" + idMovimentacao;
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Conexao.getConexao();
            pst = conn.prepareStatement(sql);
            pst.clearParameters();
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean AlterarMovimentacao(Movimentacao movm) {

        String SQL = "update tbMovimentacaoEstoque set dtMovimentacao=?,vlMovimentacao=?, dscrMovimentacao=?, qtdMovimentacao =?, tipoMovimentacao=?, funcionario=?, produto=? where idMovimentacao=?";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Conexao.getConexao();

            pst = conn.prepareStatement(SQL);
            pst.setDate(1,movm.getDtMovimentacao());
            pst.setDouble(2,movm.getVlMovimentcao());
            pst.setString(3,movm.getDscrMovimentacao());
            pst.setInt(4,movm.getQtdMovimentcao());
              if (movm.getTipoMovimentacao() > 0) {
                pst.setInt(5, movm.getTipoMovimentacao());
            } else {
                pst.setNull(5, Types.INTEGER);
                
            }
            if (movm.getFuncionario() > 0) {
                pst.setInt(6, movm.getFuncionario());
            } else {
                pst.setNull(6, Types.INTEGER);
                
            }
            if (movm.getProduto() > 0) {
                pst.setInt(7, movm.getProduto());
            } else {
                pst.setNull(7, Types.INTEGER);
                
            }
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        return true;
    }
    
     public Movimentacao ConsultarMovimentacao(int movm) {
        String sql = "select dtMovimentacao,vlMovimentacao,dscrMovimentacao,qtdMovimentacao,tipoMovimentacao,funcionario,produto from tbMovimentacao where idMovimentacao=" + movm + "";
        Movimentacao movimentacao = new Movimentacao();
        try {
            Connection conn = Conexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultset;//guarda dados vindos do banco de dados ou da interface 
            prepared = conn.prepareStatement(sql);
            resultset = prepared.executeQuery(); //faz a consulta
            if (resultset.next()) {
                movimentacao.setDtMovimentacao(resultset.getDate(1));
                movimentacao.setVlMovimentcao(resultset.getDouble(2));
                movimentacao.setDscrMovimentacao(resultset.getString(3));
                movimentacao.setQtdMovimentcao(resultset.getInt(4));
                movimentacao.setTipoMovimentacao(resultset.getInt(5));
                movimentacao.setFuncionario(resultset.getInt(6));
                movimentacao.setProduto(resultset.getInt(7));
                movimentacao.setIdMovimentcao(resultset.getInt(8));
            }
            conn.close();//fechar conexao
        } catch (SQLException e) {

            System.out.println("Erro ao localizar dados" + e.toString());
            return null;
        }

        return movimentacao;
    }
}
