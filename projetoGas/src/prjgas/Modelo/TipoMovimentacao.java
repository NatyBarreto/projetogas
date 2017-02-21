package prjgas.Modelo;

public class TipoMovimentacao {

    String nmTipoMovimentacao,
            dscrTipoMovimentacao,
            situcao;
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
    
    
    
}
