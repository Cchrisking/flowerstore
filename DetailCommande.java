public class DetailCommande {
    private Produit produit;
    private int quantite;
    private double total;

    /***
     *
     * @param produit
     * @param quantite
     */
    public DetailCommande(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
        this.total = produit.getPrix()*quantite;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public Produit getProduit() {
        return produit;
    }
    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
