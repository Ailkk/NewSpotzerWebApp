package com.newspotzer.NewSpotzer.Modele;

import java.util.Set;

public interface DAOAlbumFake {

	void save(Album Album);
	
	void saveAll(Set<Album> listAlb);

	Set<Album> loadAll();
	
	void deleteAlbum(Album alb);

}
