public class Produit {
    private String codeUnique;
    private String nom;
    private String description;
    private double prix;
    private String category;

    /***
     *
     * @param codeUnique
     * @param nom
     * @param description
     * @param prix
     * @param category
     */
    public Produit(String codeUnique, String nom, String description, double prix, String category) {
        this.codeUnique = codeUnique;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.category = category;
    }
    public String getCodeUnique() {
        return this.codeUnique;
    }
    public void changePrix(double newPrix) {
        this.prix = newPrix;
    }
    public String getNom() {
        return this.nom;
    }
    public String getDescription() {
        return this.description;
    }
    public double getPrix() {
        return this.prix;
    }
}
