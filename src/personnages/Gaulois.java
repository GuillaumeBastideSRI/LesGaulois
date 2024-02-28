package personnages;

public class Gaulois extends Personnage{
	private double puissancePotion = 1;
	private int forceBase;
	
	public Gaulois(String nom, int force) {
		super(nom, force);
		forceBase = force;
	}
	
	@Override
	protected String donnerAuteur() {
		return "gaulois";
	}
	
	@Override
	public int calculForceFrappe() {
		int forceFrappe = super.calculForceFrappe();
			if(puissancePotion > 1) {
				forceFrappe = forceBase * (int) puissancePotion;
				puissancePotion = puissancePotion - 0.5;
			}
			return forceFrappe;
	}
	
	public void recevoirPotion(double potion) {
		this.puissancePotion = potion;
		this.force = forceBase * (int)puissancePotion;	
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
}
