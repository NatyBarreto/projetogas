package prjgas.Modelo;

import java.sql.Date;

public class MovimentacaoFinanceira {

    Date dtMovmFinanceira;
    String dscrMovmFinanceira;
    double vlMovmFinanceira;
    int tipoMovimentacao,
            movimentacaoEstoque,
            funcionario,
            idMovmFInanceira;

    public Date getDtMovmFinanceira() {
        return dtMovmFinanceira;
    }

    public void setDtMovmFinanceira(Date dtMovmFinanceira) {
        this.dtMovmFinanceira = dtMovmFinanceira;
    }

    public int getIdMovmFInanceira() {
        return idMovmFInanceira;
    }

    public void setIdMovmFInanceira(int idMovmFInanceira) {
        this.idMovmFInanceira = idMovmFInanceira;
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

    public int getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(int tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
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
