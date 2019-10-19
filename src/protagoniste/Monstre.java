package protagoniste;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import attaque.Pouvoir;
import bataille.Bataille;

//@SuppressWarnings("hiding")
public class Monstre<T extends Pouvoir>extends EtreVivant {
	protected T[] attaques;
	protected ZoneDeCombat zoneDeCombat;
	protected Domaine domaine;



	@SafeVarargs
	public Monstre(String nom, int forceDeVie, ZoneDeCombat zoneDeCombat, Domaine domaine, T... attaques ) {
		super(nom, forceDeVie);
		this.zoneDeCombat=zoneDeCombat;
		this.domaine=domaine;
		this.attaques=attaques;
	}
	
	@SuppressWarnings("unused")
	private static class GestionAttaque implements Iterator<Pouvoir>{
		private Pouvoir[] attaquesPossibles;
        private int nbAttaquesPossibles;
        private int indiceIterateur;
        
        public GestionAttaque(Pouvoir[] attaques) {
            this.attaquesPossibles = attaques;
            this.nbAttaquesPossibles = attaquesPossibles.length;
            
        }
		
        public boolean hasNext() {
            for (int i=0; i<nbAttaquesPossibles;i++) {
                if (!attaquesPossibles[i].isOperationnel()) {
                    attaquesPossibles[i]=attaquesPossibles[nbAttaquesPossibles-1];
                    nbAttaquesPossibles--;
                }
            }
            return (nbAttaquesPossibles!=0);
    }
       
        public Pouvoir next() {
            if (hasNext()) {
            int r = new Random().nextInt(nbAttaquesPossibles);
            return attaquesPossibles[r];
            }
            return null;
	}
}
	
	public Domaine getDomaine() {
		return domaine;
	}

	public ZoneDeCombat getZoneDeCombat() {
		return zoneDeCombat;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Monstre nom=" + nom + "[attaques=" + Arrays.toString(attaques) + ", zoneDeCombat=" + zoneDeCombat + ", domaine="
				+ domaine +", forceDeVie=" + forceDeVie + "]";
	}

	public void entreEnCombat() {
		for (int i=0; i<attaques.length;i++) {
			attaques[i].regenererPouvoir();
		}
		GestionAttaque manage= new GestionAttaque(attaques);
	}
	
	public Pouvoir attaque() {
		GestionAttaque manage=new GestionAttaque(attaques);
		if (manage.hasNext()) {
			return(manage.next());
		}
		return null;
	}
	
	public void rejointBataille(Bataille bataille) {
		bataille.ajouter(this);
	}
	
	public void mourir() {
		bataille.eliminer(this);
	}
	
	
	
}
	

