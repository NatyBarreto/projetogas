
package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
