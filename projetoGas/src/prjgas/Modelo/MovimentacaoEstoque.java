package prjgas.Modelo;

public class MovimentacaoEstoque {

    String dtMovmEstoque;
    int qtdMovmEstoque,
            produto,
            tipoMovimentacao,
            idMovmEstoque;

    public String getdtMovmEstoque() {
        return dtMovmEstoque;
    }

    public void setdtMovmEstoque(String data) {
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
