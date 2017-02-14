package prjgas.Modelo;

import java.sql.Connection;//conexão com o sql
import java.sql.DriverManager;// vai perguntar para cada Driver registrado, se ele aceita a String de conexão em questão. É o JDBC
import java.sql.SQLException;//caso não a conexão não efetuar

public class Conexao {//abrir a classe
    public static Connection con;//variavel de conxao
    public static Connection getConexao(){//metodo de conxexão
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";//estabelecer conexão com o banco de dados
        try{//tentar
            Class.forName(driver);//uma classe com nome de driver 
            con=DriverManager.getConnection("jdbc:sqlserver://localhost;database=dbGas;user=sa;password=naty");
            //conexão recebe(faz a conexão) o banco de dados
        }catch(ClassNotFoundException e){//se a classe(o driver) não for encontrada
            System.out.println("Driver não encontrado"+e.getMessage());
        }catch(SQLException e){//se o sql não existir
            System.out.println("Erro ao abrir conexão"+e.getMessage());
        }
        return con;//retornar a conexão
    }
}
//JDBC é um API(Interface de programação de aplicativo) para a execução e manipulação das consultas do sql atraves do java
//DriverManager é a responsável por se comunicar com todos os drivers