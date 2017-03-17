package prjgas.Modelo;

import java.sql.Date;

public class Movimentacao {

    Date dtMovimentacao;
    String dscrMovimentacao;
    double vlMovimentcao;
    int tipoMovimentacao,
            funcionario,
            idMovimentcao,
            qtdMovimentcao,
            produto;

    public Date getDtMovimentacao() {
        return dtMovimentacao;
    }

    public void setDtMovimentacao(Date dtMovimentacao) {
        this.dtMovimentacao = dtMovimentacao;
    }

    public String getDscrMovimentacao() {
        return dscrMovimentacao;
    }

    public void setDscrMovimentacao(String dscrMovimentacao) {
        this.dscrMovimentacao = dscrMovimentacao;
    }

    public double getVlMovimentcao() {
        return vlMovimentcao;
    }

    public void setVlMovimentcao(double vlMovimentcao) {
        this.vlMovimentcao = vlMovimentcao;
    }

    public int getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(int tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    public int getIdMovimentcao() {
        return idMovimentcao;
    }

    public void setIdMovimentcao(int idMovimentcao) {
        this.idMovimentcao = idMovimentcao;
    }

    public int getQtdMovimentcao() {
        return qtdMovimentcao;
    }

    public void setQtdMovimentcao(int qtdMovimentcao) {
        this.qtdMovimentcao = qtdMovimentcao;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

}