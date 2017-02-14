package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.MovimentacaoFinanceira;

public class PerMovimentacaoFinanceira{ 
     public static boolean inserirMovimentacaoFinanceira(MovimentacaoFinanceira financeira){
        String SQL="insert into tbMovimentacaoFinanceira(dtMovmFinanceira,vlMovmFinanceira,dscrMovmFinanceira,tipoMovmFinanceira,movimentacaoEstoque,funcionario) values (?,?,?,?,?,?)";
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,financeira.getdtMovmFinanceira());
            pst.setDouble(2,financeira.getvlMovmFinanceira());
            pst.setString(3,financeira.getdscrMovmFinanceira());
            pst.setInt(4,financeira.gettipoMovmFinanceira());
            pst.setInt(5,financeira.getmovimentacaoEstoque());
            pst.setInt(6,financeira.getfuncionario());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
     }  
}
