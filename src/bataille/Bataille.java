package bataille;

import protagoniste.Monstre;
import protagoniste.Homme;

public class Bataille {
	Camp<Homme> campHumains = new Camp<>();
	Camp<Monstre<?>> campMonstres = new Camp<>();
	
	public void ajouter(Homme homme) {
		campHumains.ajouter(homme);
	}
	
	public void ajouter(Monstre<?> monstre){
		campMonstres.ajouter(monstre);
	}
	
	public void eliminer(Homme homme) {
		campHumains.eliminer(homme);
	}
	
	public void eliminer(Monstre<?> monstre) {
		campMonstres.eliminer(monstre);
	}

	public Camp<Homme> getCampHumains() {
		return campHumains;
	}

	public Camp<Monstre<?>> getCampMonstres() {
		return campMonstres;
	}

	
	
}
