package bnym.casestudy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Contestant;
import bnym.casestudy.entities.Winner;
import bnym.casestudy.services.CatDAO;
import bnym.casestudy.services.ContestantDAO;

public class WinnerController {
	
	@Autowired
	CatDAO catservices;
	
	@Autowired
	ContestantDAO contestantservices;
	
	// THE METHOD BELOW WOULD BE PART OF AUTOMATIC UPDATE IF I WERE ABLE TO
		// IMPLEMENT THE AUTOMATIC UPDATING OF THE GALLERY

		public Winner pickWinner() {
			// get list of cat entries
			List<Cat> catList = catservices.getAllCats();
			for (Cat c : catList) {
				// review list to see which has the highest numVotes
				int numVotes = 0;
				Cat cat = new Cat();
				if(c.getNumVotes()>numVotes) {
					cat.setId(c.getId());
				}
				//assign cat id and name to winner
				Winner winner = new Winner();
				winner.setId(cat.getId());
				winner.setCatName(cat.getcName());
				
				
				//find owner by comparing winner
				List<Contestant> ownerList = contestantservices.getAllContestants();
				for (Contestant o : ownerList) {
					if(o.getCat().equals(cat)) {
						winner.setContestantName(o.getName());
						
					}
					
				}return winner;
				
			}return null;
		}

}
