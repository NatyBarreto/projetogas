package prjgas.Modelo;

public class TipoMovimentacao {

    String nmTipoMovimentacao,
            dscrTipoMovimentacao;
    boolean situcao,
            saidaFinanceira,
            entradaFinanceira,
            saidaEstoque,
            entradaEstoque,
            requerFuncionario;
    int idTipoMovimentacao,
        idTipoMovimentacaoPai;
    
    public String getnmTipoMovimentacao() {
        return nmTipoMovimentacao;
    }

    public void setnmTipoMovimentacao(String nome) {
        this.nmTipoMovimentacao = nome;
    }

    public String getdscrTipoMovimentacao() {
        return dscrTipoMovimentacao;
    }

    public void setdscrTipoMovimentacao(String descricao) {
        this.dscrTipoMovimentacao = descricao;
    }
    
    public int getidTipoMovimentacao() {
        return idTipoMovimentacao;
    }

    public void setidTipoMovimentcao(int id) {
        this.idTipoMovimentacao = id;
    }
    
     public boolean isSituacao() {
        return situcao;
    }

    public void setSituacao(boolean status) {
        this.situcao = status;
    }
    
    public int getidTipoMovimentacaoPai() {
        return idTipoMovimentacaoPai;
    }

    public void setidTipoMovimentcaoPai(int id) {
        this.idTipoMovimentacaoPai = id;
    }

    @Override
    public String toString() {
        return nmTipoMovimentacao;
    }

    public boolean isSaidaFinanceira() {
        return saidaFinanceira;
    }

    public void setSaidaFinanceira(boolean saidaFinanceira) {
        this.saidaFinanceira = saidaFinanceira;
    }

    public boolean isEntradaFinanceira() {
        return entradaFinanceira;
    }

    public void setEntradaFinanceira(boolean entradaFinanceira) {
        this.entradaFinanceira = entradaFinanceira;
    }

    public boolean isSaidaEstoque() {
        return saidaEstoque;
    }

    public void setSaidaEstoque(boolean saidaEstoque) {
        this.saidaEstoque = saidaEstoque;
    }

    public boolean isEntradaEstoque() {
        return entradaEstoque;
    }

    public void setEntradaEstoque(boolean entradaEstoque) {
        this.entradaEstoque = entradaEstoque;
    }

    public boolean isRequerFuncionario() {
        return requerFuncionario;
    }

    public void setRequerFuncionario(boolean requerFuncionario) {
        this.requerFuncionario = requerFuncionario;
    }
    
  
}
