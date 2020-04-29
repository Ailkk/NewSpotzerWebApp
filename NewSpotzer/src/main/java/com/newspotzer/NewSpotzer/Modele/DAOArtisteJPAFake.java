package com.newspotzer.NewSpotzer.Modele;

import java.util.HashSet;
import java.util.Set;

public class DAOArtisteJPAFake extends DAOJPAFake implements DAOArtisteFake {

	static private DAOArtisteJPAFake instance = null;

	private DAOArtisteJPAFake() {
		}

	static public DAOArtisteFake getInstance() {
		if (instance == null)
			instance = new DAOArtisteJPAFake();
		return instance;
	}

	@Override
	public void saveAll(Set<Artiste> listeArtiste) {
		/*for(Artiste art : listeArtiste) {
			save(art);
		}*/
	}

	@Override
	public void save(Artiste Artiste) {
		/*DAOJPA.getManager().persist(Artiste);
		DAOJPA.commit(); /* discutable de commiter ici */

	}

	@Override
	public Set<Artiste> loadAll() {
		Set<Artiste> lA = new HashSet<Artiste>();
		Artiste a1 = new Artiste("Vincent");
		Artiste a2 = new Artiste("Artiste 2");
		Artiste a3 = new Artiste("Artiste 3");
		Artiste a4 = new Artiste("Artiste 4");
		Artiste a5 = new Artiste("Artiste 5");
		Artiste a6 = new Artiste("Artiste 6");
		
		lA.add(a1);
		lA.add(a2);
		lA.add(a3);		
		lA.add(a4);		
		lA.add(a5);		
		lA.add(a6);		
		
		return lA;
		//return new HashSet<Artiste>(DAOJPA.getManager().createQuery("SELECT a FROM Artiste a", Artiste.class).getResultList());
	}

}
