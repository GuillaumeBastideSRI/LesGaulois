package personnages;

public enum Armure {
	CASQUE("casque",2),
	PLASTRON("plastron",3),
	BOUCLIER("bouclier",3);
	
	private String chaine;
	private int resistance;
	
	private Armure(String type, int resistance) {
		this.chaine = type;
		this.resistance = resistance;
	}
	
	public int getResistance() {
		return resistance;
	}
	
	public String getNom() {
		return chaine;
	}
	
}
