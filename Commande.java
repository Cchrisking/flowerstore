import java.util.ArrayList;

public class Commande {
    private ArrayList<DetailCommande> listCommande = new ArrayList<>();
    private Client client;

    /***
     *
     * @param client
     * @param commande
     */
    public Commande(Client client, DetailCommande commande) {
        this.listCommande.add(commande);
        this.client = client;
        System.out.println("Commande: " + commande.getProduit().getNom()+" "+
                commande.getProduit().getDescription());
    }
    public Client getClient() {
        return client;
    }
    public ArrayList<DetailCommande> getListCommande() {
        return listCommande;
    }

}
