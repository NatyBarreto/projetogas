
package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.Produto;

public class PerProduto {
     public static boolean inserirProduto(Produto produto){
        String SQL="insert into tbProduto(nmProduto,dscrProduto) values (?,?)"; 
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,produto.getnmProduto());
            pst.setString(2,produto.getdscrProduto());
          
            pst.executeUpdate();// executa no banco de dados
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
    }
     
      public ArrayList<Produto> TodosProdutos() {
        String SQL = "select * from tbProduto";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList clsmodel = new ArrayList();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setidProduto(rs.getInt(1));
                produto.setnmProduto(rs.getString(2));
                produto.setdscrProduto(rs.getString(3));
                clsmodel.add(produto);
            }
            con.close();
            return clsmodel;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public boolean deletarProduto(int idProduto) {
        String sql = "delete from tbProduto where idProduto=" + idProduto;
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

    public boolean AlterarProduto(Produto produto) {

        String SQL = "update tbProduto set nmProduto =?,dscrProduto =? where idProduto =?";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Conexao.getConexao();

            pst = conn.prepareStatement(SQL);
            pst.setString(1, produto.getnmProduto());
            pst.setString(2, produto.getdscrProduto());
            pst.setInt(3, produto.getidProduto());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        }
        JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        return true;
    }
}
