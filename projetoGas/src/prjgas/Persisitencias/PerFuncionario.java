
package prjgas.Persisitencias;

import prjgas.Modelo.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import prjgas.Modelo.Funcionario;

public class PerFuncionario {
     public boolean inserirFuncionario(Funcionario funci){
        String SQL="insert into tbFuncionario(nmFuncionario,nmCargoFuncionario,idSalario) values (?,?,?)"; 
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,funci.getnmFuncionario());
            pst.setString(2,funci.getnmCargoFuncionario());
             pst.setInt(3,funci.getidSalario());
          
            pst.executeUpdate();// executa no banco de dados
            return true;
        }catch(Exception e){
            System.out.println("Erro na conexão ao inserir: "+e.getMessage());
            return false;
        }
    }
     public ArrayList<Funcionario> TodosFuncionarios() {
        String SQL = "select * from tbFuncionario";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList clsmodel = new ArrayList();
            while (rs.next()) {
                Funcionario model = new Funcionario();
                model.setnmFuncionario(rs.getString(1));
                model.setnmCargoFuncionario(rs.getString(2));
                clsmodel.add(model);
            }
            con.close();
            return clsmodel;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
     public boolean deletarFuncionario(int codFuncionario){
       String sql="delete from tbFuncionario where idFuncionario="+codFuncionario;
       Connection conn= null;
       PreparedStatement pst=null;
       try{
           conn= Conexao.getConexao();
           pst=conn.prepareStatement(sql);
           pst.clearParameters();
           pst.executeUpdate();
           return true;
       }catch(SQLException ex){
           ex.printStackTrace();
       }
        return false;
    }
     
      public boolean AlterarFuncionario(Funcionario funcionario) {

        String SQL = "update tbFuncionario set nmFuncionario =?,nmCargoFuncionario =? where idFuncionario =?";
        Connection conn = null;
        PreparedStatement pst = null;
        try {
            conn = Conexao.getConexao();

            pst = conn.prepareStatement(SQL);
            pst.setString(1,funcionario.getnmFuncionario());
            pst.setString(2, funcionario.getnmCargoFuncionario());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        } JOptionPane.showMessageDialog(null,"Alterado com sucesso");
        return true;
    }
}
