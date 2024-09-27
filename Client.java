public class Client {
    int uniqId;
    String nom;
    String mail;
    int tel;
    String adresse;

    /***
     *
     * @param uniqId
     * @param nom
     * @param mail
     * @param tel
     * @param adresse
     */
    public Client(int uniqId, String nom, String mail, int tel, String adresse) {
        this.uniqId = uniqId;
        this.nom = nom;
        this.mail = mail;
        this.tel = tel;
        this.adresse = adresse;
        System.out.println("Nouveau client crée: ");
        System.out.println(uniqId + " " + nom + " " + mail + " " + tel + " " + adresse);
    }
    public int getUniqId() {
        return uniqId;
    }
    public void setUniqId(int uniqId) {
        this.uniqId = uniqId;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
