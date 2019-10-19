package attaque;

public class Pouvoir extends ForceDeCombat{
	private int nbUtilisationPouvoir;
	private int nbUtilisationPouvoirInitial;
	
	public Pouvoir(int pointDeDegat, String nom, int nbUtilisationPouvoir) {
		super(pointDeDegat, nom);
		this.nbUtilisationPouvoir=nbUtilisationPouvoir;
		this.nbUtilisationPouvoirInitial=nbUtilisationPouvoir;
	}
	
	public void regenererPouvoir() {
		super.operationnel=true;
		nbUtilisationPouvoir=nbUtilisationPouvoirInitial;
	}
	
	public int utiliser() {
		if (super.operationnel) {
			if (nbUtilisationPouvoir==1) super.operationnel=false;
			nbUtilisationPouvoir--;
			return super.getPointDeDegat();
		}
		return 0; //pouvoir non operationnel donc dégats = 0;
	}
}
