package com.newspotzer.NewSpotzer.Modele;

import java.util.Set;

public interface DAOArtisteFake {
	void saveAll(Set<Artiste> listeArt);
	void save(Artiste artiste);
	Set<Artiste> loadAll();
}
