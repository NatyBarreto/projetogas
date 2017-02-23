package prjgas.Modelo;

public class TipoMovimentacao {

    String nmTipoMovimentacao,
            dscrTipoMovimentacao,
            situcao,
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
    
     public String getSituacao() {
        return situcao;
    }

    public void setSituacao(String status) {
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
    
    public String getSaidaFinanceira() {
        return saidaFinanceira;
    }

    public void setSaidaFinanceira(String saidaFi) {
        this.saidaFinanceira = saidaFi;
    }
    
    public String getEntradaFinanceira() {
        return entradaFinanceira;
    }

    public void setEntradaFinanceira(String entradaFi) {
        this.entradaFinanceira = entradaFi;
    }
    
    public String getSaidaEstoque() {
        return saidaEstoque;
    }

    public void setSaidaEstoque(String saidaEs) {
        this.saidaEstoque = saidaEs;
    }
    
    public String getEntradaEstoque() {
        return entradaEstoque;
    }

    public void setEntradaEstoque(String entradaEs) {
        this.entradaEstoque = entradaEs;
    }
    
    public String getRequerFuncionario() {
        return requerFuncionario;
    }

    public void setRequerFuncionario(String requerFun) {
        this.requerFuncionario = requerFun;
    }
    
}
