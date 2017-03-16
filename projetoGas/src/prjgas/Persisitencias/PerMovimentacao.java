package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.MovimentacaoFinanceira;

public class PerMovimentacao{ 
     public static boolean inserirMovimentacaoFinanceira(MovimentacaoFinanceira financeira){
        String SQL="insert into tbMovimentacaoFinanceira(dtMovmFinanceira,vlMovmFinanceira,dscrMovmFinanceira,tipoMovmFinanceira,movimentacaoEstoque,funcionario) values (?,?,?,?,?,?)";
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setDate(1,financeira.getDtMovmFinanceira());
            pst.setDouble(2,financeira.getvlMovmFinanceira());
            pst.setString(3,financeira.getdscrMovmFinanceira());
            pst.setInt(4,financeira.getTipoMovimentacao());
            pst.setInt(5,financeira.getmovimentacaoEstoque());
            pst.setInt(6,financeira.getfuncionario());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
     }  
  public ArrayList<MovimentacaoFinanceira> TodasMovmFinanceira() {
        String SQL = "select * from tbMovimentacaoFinanceira";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList clsmodel = new ArrayList();
            while (rs.next()) {
                MovimentacaoFinanceira financeira = new MovimentacaoFinanceira();
                financeira.setIdMovmFInanceira(rs.getInt(1));
                financeira.setDtMovmFinanceira(rs.getDate(2));
                financeira.setvlMovmFinanceira(rs.getDouble(3));
                financeira.setdscrMovmFinanceira(rs.getString(4));
                financeira.setTipoMovimentacao(rs.getInt(5));
                financeira.setmovimentacaoEstoque(rs.getInt(6));
                financeira.setfuncionario(rs.getInt(7));
                clsmodel.add(financeira);
            }
            con.close();
            return clsmodel;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public boolean deletarMovmFinanceira(int idMovmFinanceira) {
        String sql = "delete from tbMovimentacaoFinanceira where idMovmFinanceira=" + idMovmFinanceira;
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

    public boolean AlterarMovmFinanceira(MovimentacaoFinanceira financeira) {

        String SQL = "update tbMovimentacaoEstoque set dtMovmFinanceira=?,vlMovmFinanceira=?, dscrMovmFinanceira=?, tipoMovimentacao =?, movimentacaoEstoque=?, funcionario=? where idMovmFinanceira=?";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Conexao.getConexao();

            pst = conn.prepareStatement(SQL);
            pst.setDate(1,financeira.getDtMovmFinanceira());
            pst.setDouble(2,financeira.getvlMovmFinanceira());
            pst.setString(3,financeira.getdscrMovmFinanceira());
            pst.setInt(4,financeira.getTipoMovimentacao());
            pst.setInt(5,financeira.getmovimentacaoEstoque());
            pst.setInt(6,financeira.getfuncionario());
            pst.setInt(7,financeira.getIdMovmFInanceira());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        return true;
    }
}
