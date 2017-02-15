package prjgas.Persisitencias;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import prjgas.Modelo.Conexao;
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
     public ArrayList<Salario> TodosSalarios() {
        String SQL = "select * from tbSalario";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList classeSalario = new ArrayList();
            while (rs.next()) {
                Salario salario=new Salario();
                salario.setdtInicioVigencia(rs.getString(1));
                salario.setdtTerminoVigencia(rs.getString(2));
                salario.setvlSalario(rs.getDouble(3));
                classeSalario.add(salario);
            }
            con.close();
            return classeSalario;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
