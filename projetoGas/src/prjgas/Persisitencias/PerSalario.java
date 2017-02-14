package prjgas.Persisitencias;

import Modelo.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import prjgas.Modelo.Salario;

public class PerSalario {
     public static boolean inserirSalario(Salario salario){
        String SQL="insert into tbSalario(dtInicioVigencia,dtTerminoVigencia,vlSalario) values (?,?,?)";
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,salario.getdtInicioVigencia());
            pst.setString(2,salario.getdtTerminoVigencia());
            pst.setDouble(3,salario.getvlSalario());
            pst.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
     }  
}
