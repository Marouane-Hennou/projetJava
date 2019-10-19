package livre;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import bataille.Bataille;
import bataille.Camp;
import protagoniste.Heros;
import protagoniste.Homme;

public class AideEcrivain{
	private Bataille bataille;
	
	
	public AideEcrivain(Bataille bataille) {
		this.bataille=bataille;
	}
	
	public LinkedList<Homme> visualiserForcesHumaines() {
		LinkedList<Homme> listeTriee= new LinkedList<Homme>();
		Camp<Homme> campHomme = bataille.getCampHumains();
		List<Homme> listeHomme=campHomme.getListe();
		int indiceHeros=0;
		for(ListIterator<Homme> ite= listeHomme.listIterator();ite.hasNext();) {
			Homme homme = ite.next();
			if (homme instanceof Heros) {
				listeTriee.add(indiceHeros, homme);
				indiceHeros++;
			}
			else if (homme instanceof Homme) {
				listeTriee.add(listeTriee.size(), homme);
			}
		}
		return listeTriee;
		
	}


}
