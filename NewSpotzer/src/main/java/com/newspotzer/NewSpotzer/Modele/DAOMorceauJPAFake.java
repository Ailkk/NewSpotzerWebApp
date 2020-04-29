package com.newspotzer.NewSpotzer.Modele;

import java.util.HashSet;
import java.util.Set;

public class DAOMorceauJPAFake extends DAOJPAFake implements DAOMorceauFake {

	static private DAOMorceauJPAFake instance = null;

	private DAOMorceauJPAFake() {
	}

	static public DAOMorceauFake getInstance() {
		if (instance == null)
			instance = new DAOMorceauJPAFake();
		return instance;
	}

	@Override
	public void saveAll(Set<Morceau> listeM) {
		/*for(Morceau m : listeM) {
			System.out.println("-----------------------------------------------------------------------------------\n"+ m.toString()+"\n");
			save(m);
		}*/
	}
	
	@Override
	public void save(Morceau morceau) {
		/*try{
		DAOJPA.getManager().persist(morceau);
		DAOJPA.commit(); /* discutable de commiter ici */
		/*} catch(Exception e){
			e.printStackTrace(); System.out.println("Morceau null");}*/
	}

	@Override
	public Set<Morceau> loadAll() {
		Set<Morceau> lM = new HashSet<Morceau>();
		
		Morceau m1 = new Morceau("Titre 1", new Album("Album M1", 2015), new Artiste("Artiste M1"), null, null, 2015);
		lM.add(m1);
		
		return lM;
		//return new HashSet<Morceau>(DAOJPA.getManager().createQuery("SELECT m FROM Morceau m", Morceau.class).getResultList());
	}

}
