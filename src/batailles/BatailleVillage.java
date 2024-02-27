package batailles;

public class BatailleVillage implements Bataille {
    @Override
    public void decrireContexte() {
        System.out.println("Dans un petit village gaulois, une dispute éclate...");
    }

    @Override
    public void choisirCombattants() {
        System.out.println("Le forgeron et le poissonnier sont prêts à en découdre.");
    }

    @Override
    public void preparerCombat() {
        System.out.println("Les villageois forment un cercle autour des combattants.");
    }

    @Override
    public void decrireCombat() {
        System.out.println("Le forgeron brandit son marteau tandis que le poissonnier se défend avec une anguille.");
    }

    @Override
    public void donnerResultat() {
        System.out.println("Épuisés, les deux hommes finissent par se réconcilier devant une chope de cervoise.");
    }
}
