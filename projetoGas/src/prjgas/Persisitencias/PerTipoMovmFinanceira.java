
package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.Produto;
import prjgas.Modelo.TipoMovmFinanceira;

public class PerTipoMovmFinanceira {
     public static boolean inserirTipoMovmFinanceira(TipoMovmFinanceira tipo){
        String SQL="insert into tbTipoMovimentacaoFinanceira(nmProduto,dscrProduto) values (?,?)"; 
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,tipo.getnmTipoMovmFinanceira());
            pst.setString(2,tipo.getdscrTipoMovmFinanceira());
          
            pst.executeUpdate();// executa no banco de dados
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
    }
}