package prjgas.Modelo;

public class Salario {
   String dtInicioVigencia ,
          dtTerminoVigencia;        
   double vlSalario;
   int idSalario;
 
    
    public String getdtInicioVigencia() {
        return dtInicioVigencia;
    }

    public void setdtInicioVigencia(String data) {
        this.dtInicioVigencia = data;
    }
    
    public String getdtTerminoVigencia() {
        return dtTerminoVigencia;
    }

    public void setdtTerminoVigencia(String data) {
        this.dtTerminoVigencia = data;
    }

    public double getvlSalario() {
        return vlSalario;
    }
    public void setvlSalario(double salario) {
        this.vlSalario = salario;
    }
    
    public int getidSalario() {
        return idSalario;
    }
    public void setidSalario(int salario) {
        this.idSalario = salario;
    }

}
