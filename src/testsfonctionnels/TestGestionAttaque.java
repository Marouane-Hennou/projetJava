package testsfonctionnels;

import attaque.BouleDeFeu;
import attaque.Eclair;
import attaque.Feu;
import attaque.Lave;
import protagoniste.Domaine;
import protagoniste.Monstre;
import protagoniste.ZoneDeCombat;
import attaque.Pouvoir;

public class TestGestionAttaque {
	public static void main(String[] args) {
		Monstre dragotenebre = new Monstre("dragotenebre", 200, ZoneDeCombat.AERIEN, Domaine.FEU, new BouleDeFeu(4), new Lave(1), new Eclair(3));
		System.out.println(dragotenebre);
		dragotenebre.entreEnCombat();
		System.out.println(dragotenebre.attaque());
		System.out.println(dragotenebre.attaque());
		System.out.println(dragotenebre.attaque());
		
		
		
	}

}
