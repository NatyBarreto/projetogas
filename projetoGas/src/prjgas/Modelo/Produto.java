
package prjgas.Modelo;

public class Produto {
    String nmProduto,
           dscrProduto;
    int idProduto;
    
  public String getnmProduto() {
        return nmProduto;
  }

  public void setnmProduto(String nome) {
        this.nmProduto = nome;
  }
    
  public String getdscrProduto() {
        return dscrProduto;
  }

  public void setdscrProduto(String descricao) {
        this.dscrProduto = descricao;
  }
  
   public int getidProduto() {
        return idProduto;
  }

  public void setidProduto(int id) {
        this.idProduto = id;
  }
}
