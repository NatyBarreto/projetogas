package prjgas.Modelo;

import java.sql.Date;



public class MovimentacaoEstoque {

    Date dtMovmEstoque;
    int qtdMovmEstoque,
            produto,
            tipoMovimentacao,
            idMovmEstoque;

    public Date getdtMovmEstoque() {
        return dtMovmEstoque;
    }

    public void setdtMovmEstoque(Date data) {
        this.dtMovmEstoque = data;
    }

    public int getqtdMovmEstoque() {
        return qtdMovmEstoque;
    }

    public void setqtdMovmEstoque(int qtd) {
        this.qtdMovmEstoque = qtd;
    }

    public int getproduto() {
        return produto;
    }

    public void setproduto(int produto) {
        this.produto = produto;
    }

    public int getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(int movm) {
        this.tipoMovimentacao = movm;
    }

    public int getidMovmEstoque() {
        return idMovmEstoque;
    }

    public void setidMovmEstoque(int estoque) {
        this.idMovmEstoque = estoque;
    }
}
