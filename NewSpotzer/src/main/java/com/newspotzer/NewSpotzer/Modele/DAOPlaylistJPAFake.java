package com.newspotzer.NewSpotzer.Modele;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DAOPlaylistJPAFake extends DAOJPAFake implements DAOPlaylistFake {

	static private DAOPlaylistJPAFake instance = null;

	private DAOPlaylistJPAFake() {

	}

	static public DAOPlaylistFake getInstance(){
		if (instance == null)
			instance = new DAOPlaylistJPAFake();
		return instance;
	}

	@Override
	public void saveAll(Set<Playlist> listeP) {
		/*for(Playlist p : listeP) {
			save(p);
		}*/
	}

	@Override
	public void save(Playlist pl) {
		/*DAOJPA.getManager().persist(pl);
		DAOJPA.commit();*/
	}

	@Override
	public Set<Playlist> loadAll() {
		Set<Playlist> lP = new HashSet<Playlist>();
		
		lP.add(new Playlist("Playlist 1", "Ma playlist 1"));
		
		return lP;
		/*return new HashSet<Playlist>(DAOJPA.getManager()
		.createQuery("SELECT p FROM Playlist p", Playlist.class).getResultList());*/
	}
}
