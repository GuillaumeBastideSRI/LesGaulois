package personnages;

public class Druide extends Gaulois {

	private int quantitePotion;
	private int forcePotion;
	
	public Druide(String nom, int force) {
		super(nom, force);
	}
	
	public void fabriquerPotion(int quantite) {
		quantitePotion = quantite;
		forcePotion = 2 + (int)(Math.random() * 3);
		this.parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion );
	}
	
	
	public void donnerPotion(Gaulois gaulois) {
		if ( !"Obélix".equals(gaulois.getNom()) ) {
			if (quantitePotion>0) {
				this.parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
				gaulois.recevoirPotion(forcePotion);
				quantitePotion--;
			}
			else {
				this.parler("Désolé " + gaulois.getNom() + "il n'y a plus une seule goutte de potion.");
			}
		}		
		else {
			this.parler("Non, Obélix Non !... Et tu le sais très bien !");
		}
	}
		
	
	
	

}
