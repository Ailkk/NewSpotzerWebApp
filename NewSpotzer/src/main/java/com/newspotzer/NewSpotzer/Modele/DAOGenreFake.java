package com.newspotzer.NewSpotzer.Modele;

import java.util.Set;

public interface DAOGenreFake {

	void save(Genre Genre);
	Set<Genre> loadAll();
	
}
