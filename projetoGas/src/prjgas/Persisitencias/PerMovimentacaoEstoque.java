package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.MovimentacaoEstoque;

public class PerMovimentacaoEstoque{ 
     public static boolean inserirMovimentacaoEstoque(MovimentacaoEstoque estoque){
        String SQL="insert into tbMovimentacaoEstoque(dtMovmEstoque,qtdMovmEstoque,produto,tipoMovimentacao) values (?,?,?,?)";
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setDate(1,estoque.getdtMovmEstoque());
            pst.setInt(2,estoque.getqtdMovmEstoque());
            pst.setInt(3,estoque.getproduto());
            pst.setInt(4,estoque.getTipoMovimentacao());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
     }  
     
     public ArrayList<MovimentacaoEstoque> TodasMovmEstoque() {
        String SQL = "select * from tbMovimentacaoEstoque";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList clsmodel = new ArrayList();
            while (rs.next()) {
                MovimentacaoEstoque estoque = new MovimentacaoEstoque();
                estoque.setidMovmEstoque(rs.getInt(1));
                estoque.setdtMovmEstoque(rs.getDate(2));
                estoque.setqtdMovmEstoque(rs.getInt(3));
                estoque.setproduto(rs.getInt(4));
                estoque.setTipoMovimentacao(rs.getInt(3));
                clsmodel.add(estoque);
            }
            con.close();
            return clsmodel;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public boolean deletarMovmEstoque(int idMovmEstoque) {
        String sql = "delete from tbMovimentacaoEstoque where idMovmEstoque=" + idMovmEstoque;
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

    public boolean AlterarMovmEstoque(MovimentacaoEstoque estoque) {

        String SQL = "update tbMovimentacaoEstoque set dtMovmEstoque=?,qtdMovmEstoque=?, produto=?, tipoMovimentacao =? where idMovmEstoque =?";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Conexao.getConexao();

            pst = conn.prepareStatement(SQL);
            pst.setDate(1, estoque.getdtMovmEstoque());
            pst.setInt(2, estoque.getqtdMovmEstoque());
            pst.setInt(3, estoque.getproduto());
            pst.setInt(4, estoque.getTipoMovimentacao());
            pst.setInt(5, estoque.getidMovmEstoque());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        return true;
    }
}
