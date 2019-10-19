package protagoniste;
import bataille.Bataille;

public abstract class EtreVivant {
	protected String nom;
	protected int forceDeVie;
	protected Bataille bataille;

	@Override
	public String toString() {
		return "EtreVivant [nom=" + nom + ", forceDeVie=" + forceDeVie + "]";
	}

	public EtreVivant(String nom, int forceDeVie) {
		this.nom=nom;
		this.forceDeVie=forceDeVie;
	}

	public String getNom() {
		return nom;
	}

	public int getForceDeVie() {
		return forceDeVie;
	}
	
	public void rejointBataille(Bataille bataille) {
		this.bataille=bataille;
	}
	
	public abstract void mourir();
	
	public boolean equals(Object obj) {
		if (obj instanceof EtreVivant) {
			EtreVivant ev = (EtreVivant) obj;
			return this.getNom().equals(ev.getNom());
		}
		return false;
		
	}
	
}
