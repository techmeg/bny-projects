package bnym.casestudy.services;

import java.util.List;

import bnym.casestudy.entities.Winner;

public interface WinnerDAO {
	
	public List<Winner> getAllWinners();
	public Winner getWinnerById(Long id);
	public boolean saveWinner(Winner winner);
	public boolean deleteWinnerById(Long id);

}
