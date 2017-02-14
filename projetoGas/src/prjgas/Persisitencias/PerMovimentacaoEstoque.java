package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.MovimentacaoEstoque;

public class PerMovimentacaoEstoque{ 
     public static boolean inserirMovimentacaoEstoque(MovimentacaoEstoque estoque){
        String SQL="insert into tbMovimentacaoEstoque(dtMovmEstoque,qtdMovmEstoque,produto,tipoMovmFinanceira) values (?,?,?,?)";
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,estoque.getdtMovmEstoque());
            pst.setInt(2,estoque.getqtdMovmEstoque());
            pst.setInt(3,estoque.getproduto());
            pst.setInt(4,estoque.gettipoMovmFinanceira());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
     }  
}
