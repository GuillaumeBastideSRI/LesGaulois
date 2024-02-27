package test_fonctionnel;

import batailles.BatailleVillage;
import batailles.Conteur;
import personnages.Armure;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Romain;
import personnages.Soldat;

public class TestGaulois {
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix",5);
		Soldat minus = new Soldat ("Minus",Grade.SOLDAT,6);
		Gaulois obelix = new Gaulois("Obélix",15);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",4);
		Gaulois abraracourcix = new Gaulois("Abraracourcix",4);
		Gaulois agecanonix = new Gaulois("Agecanonix",4);
		Conteur conteur = new Conteur("Druide Raconteur");
		BatailleVillage bataille = new BatailleVillage();
		asterix.parler("Bonjour à tous");
		minus.parler("Un Gau... Un Gau Gau, Un Gaulois");
		
		Druide panoramix = new Druide("Panoramix",1);
		panoramix.fabriquerPotion(3);
		
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(agecanonix);
		
		minus.equiperArmure(Armure.BOUCLIER);
		minus.equiperArmure(Armure.CASQUE);
		minus.equiperArmure(Armure.PLASTRON);
		
		for (int i = 0; i<4; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
		
		conteur.conterHistoire(bataille);
	}
}
