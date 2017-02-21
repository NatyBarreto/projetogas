package prjgas.Modelo;

public class Item {
   int id;
   String descricao;

    public Item(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }   

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
}
