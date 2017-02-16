
package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import prjgas.Modelo.Conexao;
import prjgas.Modelo.TipoMovmFinanceira;

public class PerTipoMovmFinanceira {
     public static boolean inserirTipoMovmFinanceira(TipoMovmFinanceira tipo){
        String SQL="insert into tbTipoMovimentacaoFinanceira(nmTipoMovmFinanceira,dscrTipoMovmFinanceira) values (?,?)"; 
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
     
      public ArrayList<TipoMovmFinanceira> TodosTiposMovmFinanceira() {
        String SQL = "select * from tbTipoMovimentacaoFinanceira";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList classeTipoMovmFinanceira = new ArrayList();
            while (rs.next()) {
                TipoMovmFinanceira tipoMovmFinanceira = new TipoMovmFinanceira();
                tipoMovmFinanceira.setidTipoMovmFinanceira(rs.getInt(1));
                tipoMovmFinanceira.setnmTipoMovmFinanceira(rs.getString(2));
                tipoMovmFinanceira.setdscrTipoMovmFinanceira(rs.getString(3));
                classeTipoMovmFinanceira.add(tipoMovmFinanceira);
            }
            con.close();
            return classeTipoMovmFinanceira;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}