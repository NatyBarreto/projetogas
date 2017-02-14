package prjgas.Modelo;

public class MovimentacaoFinanceira {
    String dtMovmFinanceira,
           dscrMovmFinanceira;
    double vlMovmFinanceira;
    int tipoMovmFinanceira,
        movimentacaoEstoque,
        funcionario; 
    
    public String getdtMovmFinanceira() {
        return dtMovmFinanceira;
    }

    public void setdtMovmFinanceira(String data) {
        this.dtMovmFinanceira = data;
    }
    
    public String getdscrMovmFinanceira() {
        return dscrMovmFinanceira;
    }

    public void setdscrMovmFinanceira(String dscr) {
        this.dscrMovmFinanceira = dscr;
    }
    
    public double getvlMovmFinanceira() {
        return vlMovmFinanceira;
    }

    public void setvlMovmFinanceira(double movm) {
        this.vlMovmFinanceira = movm;
    }
    
    public int gettipoMovmFinanceira() {
        return tipoMovmFinanceira;
    }

    public void settipoMovmFinanceira(int tipo) {
        this.tipoMovmFinanceira = tipo;
    }
    
     public int getmovimentacaoEstoque() {
        return movimentacaoEstoque;
    }

    public void setmovimentacaoEstoque(int estoque) {
        this.movimentacaoEstoque = estoque;
    }
    
     public int getfuncionario() {
        return funcionario;
    }

    public void setfuncionario(int funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
