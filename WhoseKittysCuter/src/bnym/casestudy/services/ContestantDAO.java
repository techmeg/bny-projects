package bnym.casestudy.services;

import java.util.List;

import bnym.casestudy.entities.Contestant;


public interface ContestantDAO {
	public List<Contestant> getAllContestants();
	public Contestant getContestantById(String email);
	public boolean saveContestant(Contestant contestant);
	public boolean deleteContestantById(String email);

}
