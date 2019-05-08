package bnym.casestudy.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entities.Contestant;
import bnym.casestudy.repository.ContestantRepository;

@Service
@Transactional
public class ContestantServices implements ContestantDAO{
	
	@Autowired
	ContestantRepository repository;

	@Override
	public List<Contestant> getAllContestants() {
		List<Contestant> list = new ArrayList<Contestant>();
		for(Contestant contestant : repository.findAll()) {
			list.add(contestant);
		}
		return list;
	}
	
	@Override
	public Contestant getContestantById(String email) {
		Contestant contestant = repository.findById(email).get();
		return contestant;
	}
	
	@Override
	public boolean saveContestant(Contestant contestant) {
		try {
			repository.save(contestant);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean deleteContestantById(String email) {
		try {
			repository.deleteById(email);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}	

}
