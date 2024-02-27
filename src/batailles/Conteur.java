package batailles;

public class Conteur {
    private String nom;

    public Conteur(String nom) {
        this.nom = nom;
    }

    public void conterHistoire(bataille bataille) {
        System.out.println("Je suis " + nom + " et je vais vous conter une histoire. Toute la Gaule est occupée par les Romains… Toute ? Non ! Un village peuplé d'irréductibles Gaulois résiste encore et toujours à l'envahisseur...");
        bataille.decrireContexte();
        bataille.choisirCombattants();
        bataille.preparerCombat();
        bataille.decrireCombat();
        bataille.donnerResultat();
    }
}