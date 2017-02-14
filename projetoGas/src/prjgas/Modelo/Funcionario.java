
package prjgas.Modelo;

public class Funcionario {
    String  nmFuncionario,
            nmCargoFuncionario;
    int idSalario, idFuncionario;
    
    public String getnmFuncionario() {
        return nmFuncionario;
    }

    public void setnmFuncionario(String nome) {
        this.nmFuncionario = nome;
    }
    
    public String getnmCargoFuncionario() {
        return nmCargoFuncionario;
    }

    public void setnmCargoFuncionario(String cargo) {
        this.nmCargoFuncionario = cargo;
    }
    
     public int getidSalario() {
        return idSalario;
    }

    public void setidSalario(int salario) {
        this.idSalario = salario;
    }
    public int getidFuncionario() {
        return idFuncionario;
    }

    public void setidFuncionario(int funcionario) {
        this.idFuncionario = funcionario;
    }
}
