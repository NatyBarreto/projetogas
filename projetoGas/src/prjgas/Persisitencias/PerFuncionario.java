
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
        String SQL="insert into tbFuncionario(nmFuncionario,nmCargoFuncionario) values (?,?)"; 
        Connection conn=null;
        PreparedStatement pst=null;
        
        try{
            conn=Conexao.getConexao();
            pst=conn.prepareStatement(SQL);
            pst.clearParameters();
            
            pst.setString(1,funci.getnmFuncionario());
            pst.setString(2,funci.getnmCargoFuncionario());
           // pst.setInt(3,funci.getidSalario());
          
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
                model.setidFuncionario(rs.getInt(1));
                model.setnmFuncionario(rs.getString(2));
                model.setnmCargoFuncionario(rs.getString(3));
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
            pst.setInt(3,funcionario.getidFuncionario());
            pst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão ao alterar: " + e.getMessage(), "ERRO", 0);
            return false;
        } JOptionPane.showMessageDialog(null,"Alterado com sucesso");
        return true;
    }
       public String FuncionarioPorNome(String Fun){
        String sql="select idFuncionario from tbFuncionariowhere nmFuncionario = '"+Fun+"'";
        String Funci="";
        try{
            Connection conn=Conexao.getConexao();
            PreparedStatement prepared;
            ResultSet resultset;//campos preeenchidos;cópia da tabela
            prepared = conn.prepareStatement(sql);
            resultset=prepared.executeQuery();
            if(resultset.next()){//enquanto estiver próximo registro...
                Funci=resultset.getString(1);
                return Funci;                
            }
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Erro ao localizar dados "+e.getMessage());                   
        }
        return null;
        
       }
       
        public ArrayList<Funcionario> FuncionarioPorId(int id) {
        String SQL = "select * from tbFuncionario where idFuncionario=" + id + "";
        Connection con = Conexao.getConexao();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(SQL);
            ResultSet rs;
            rs = pst.executeQuery();
            ArrayList funcionario = new ArrayList();
            while (rs.next()) {
                Funcionario model = new Funcionario();
                model.setidSalario(rs.getInt(4));
                funcionario.add(model);
            }
            con.close();
            return funcionario;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
