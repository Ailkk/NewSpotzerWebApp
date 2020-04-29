package com.newspotzer.NewSpotzer.Modele;

import java.util.Set;

public interface DAOMorceauFake {
	
	void saveAll(Set<Morceau> listeMorceaux);
	void save(Morceau morceau);
	Set<Morceau> loadAll();
}
