package com.newspotzer.NewSpotzer.Modele;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DAOGenreJPAFake extends DAOJPAFake implements DAOGenreFake {

	static private DAOGenreJPAFake instance = null;

	private DAOGenreJPAFake() {
		}

	static public DAOGenreFake getInstance() {
		if (instance == null)
			instance = new DAOGenreJPAFake();
		return instance;
	}


	@Override
	public void save(Genre Genre) {
		/*DAOJPA.getManager().persist(Genre);
		DAOJPA.commit(); /* discutable de commiter ici */

	}

	@Override
	public Set<Genre> loadAll() {
		ArrayList<String> lG = DAOJPAFake.creerGenre();
		Set<Genre> sG = new HashSet<Genre>();
		for(String s: lG)
			sG.add(new Genre(s));
		return sG;
		//return new HashSet<Genre>(DAOJPA.getManager().createQuery("SELECT g FROM Genre g", Genre.class).getResultList());
	}

}
