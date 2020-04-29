package com.newspotzer.NewSpotzer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.newspotzer.NewSpotzer.Modele.Artiste;
import com.newspotzer.NewSpotzer.Modele.Bibliotheque;
import com.newspotzer.NewSpotzer.Modele.Genre;
import com.newspotzer.NewSpotzer.Modele.Morceau;

@Controller
public class TestController {

	@GetMapping("/")
	public String home(ModelMap modMap) {
		Bibliotheque b = new Bibliotheque();
		b.chargerLaBaseDeDonnéesEnMetier();
		String aff = "";
		for(Artiste a : b.getListeArtistes()) {
			aff += a.getNomArtiste()+" ";
			modMap.put("test", aff);
		}
		return "pages/accueil";
	}
}
