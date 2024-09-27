public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Client client = new Client(300,"Blackwell","amail@m.c",688,"Paris");
        Produit fleurRouge= new Produit("roserouge","rose","une rose est rouge",50.55,"fleur de jardin");
        Produit lila = new Produit("violet","lila", "lila est violet", 75,"fleur sauvage");
        Commande commande = new Commande(client,new DetailCommande(lila,3));
    }

}