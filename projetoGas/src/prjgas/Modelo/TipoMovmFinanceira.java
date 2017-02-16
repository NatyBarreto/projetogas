package prjgas.Modelo;

public class TipoMovmFinanceira {

    String nmTipoMovmFinanceira,
            dscrTipoMovmFinanceira;
    int idTipoMovmFinanceira;
    
    public String getnmTipoMovmFinanceira() {
        return nmTipoMovmFinanceira;
    }

    public void setnmTipoMovmFinanceira(String nome) {
        this.nmTipoMovmFinanceira = nome;
    }

    public String getdscrTipoMovmFinanceira() {
        return dscrTipoMovmFinanceira;
    }

    public void setdscrTipoMovmFinanceira(String descricao) {
        this.dscrTipoMovmFinanceira = descricao;
    }
    
    public int getidTipoMovmFinanceira() {
        return idTipoMovmFinanceira;
    }

    public void setidTipoMovmFinanceira(int id) {
        this.idTipoMovmFinanceira = id;
    }
}
