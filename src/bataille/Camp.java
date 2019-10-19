package bataille;

import protagoniste.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Camp <T extends EtreVivant> implements Iterable<T>{
	private List<T> liste = new LinkedList<T>();
	ListIterator<T> it = liste.listIterator();

	
	
	public void ajouter(T perso) {
		if (!liste.contains(perso)) {
			liste.add(perso);		}
	}
	
	public void eliminer(T perso) {
		liste.remove(liste.indexOf(perso)); 
	}
	
	
	
	public List<T> getListe() {
		return liste;
	}

	public String toString() {
		return liste.toString();
	}

	@Override
	public Iterator<T> iterator() {
		return it;
	}



	

}
