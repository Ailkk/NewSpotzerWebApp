package com.newspotzer.NewSpotzer.Modele;

import java.util.Set;

public interface DAOPlaylistFake {
	void saveAll(Set<Playlist> listeP);
	void save(Playlist pl);
	Set<Playlist> loadAll();
}
