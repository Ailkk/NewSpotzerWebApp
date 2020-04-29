package com.newspotzer.NewSpotzer.Modele;

import java.util.HashSet;
import java.util.Set;

public class DAOAlbumJPAFake extends DAOJPAFake implements DAOAlbumFake {

	static private DAOAlbumJPAFake instance = null;

	private DAOAlbumJPAFake() {}

	static public DAOAlbumJPAFake getInstance() {
		if (instance == null)
			instance = new DAOAlbumJPAFake();
		return instance;
	}
	
	
	@Override
	public void saveAll(Set<Album> listeAlbum) {
		/*for(Album alb : listeAlbum) {
			save(alb);
		}*/
	}

	@Override
	public void save(Album Album) {
		/*DAOJPAFake.getManager().persist(Album);
		DAOJPAFake.commit(); /* discutable de commiter ici */
	}
	
	@Override
	public void deleteAlbum(Album alb) {
		//DAOJPAFake.getManager().remove(alb);
	}

	@Override
	public Set<Album> loadAll() {
		Set<Album> lA = new HashSet<Album>();
		Album a1 = new Album("Album 1", 2019);
		Album a2 = new Album("Album 2", 2012);
		Album a3 = new Album("Album 3", 2020);
		lA.add(a1);
		lA.add(a2);
		lA.add(a3);
		
		return lA;
		//return new HashSet<Album>(DAOJPAFake.getManager().createQuery("SELECT a FROM Album a", Album.class).getResultList());
	}

}

