package prjgas.Modelo;

public class MovimentacaoEstoque {
    String dtMovmEstoque;
    int qtdMovmEstoque,
        produto,
        tipoMovmFinanceira;
    
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

public int gettipoMovmFinanceira() {
        return tipoMovmFinanceira;
}
public void settipoMovmFinanceira(int movm) {
        this.tipoMovmFinanceira = movm;
}
}
