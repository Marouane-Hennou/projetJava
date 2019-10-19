package attaque;

public class Arc extends Arme {
	private int nbFlechesRestantes;
	
	public Arc(int nbFlechesRestantes) {
		super(50, "Arc");
		this.nbFlechesRestantes=nbFlechesRestantes;
	}
	
	public int utiliser(int nbFlechesRestantes) {
		if (super.operationnel) {
			if (nbFlechesRestantes==1) super.operationnel=false;
			nbFlechesRestantes--;
			return super.getPointDeDegat();
		}
		return 0; //arme non operationnel donc dégats = 0;
	}

}
