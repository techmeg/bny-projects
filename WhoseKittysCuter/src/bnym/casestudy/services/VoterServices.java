package bnym.casestudy.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entities.Voter;
import bnym.casestudy.repository.VoterRepository;

@Service
@Transactional
public class VoterServices implements VoterDAO{
	
	@Autowired
	VoterRepository repository;

	@Override
	public List<Voter> getAllVoters() {
		List<Voter> list = new ArrayList<Voter>();
		for(Voter voter : repository.findAll()) {
			list.add(voter);
		}
		return list;
	}

	@Override
	public Voter getVoterById(String email) {
		Voter voter = repository.findById(email).get();
		return voter;
	}

	@Override
	public boolean saveVoter(Voter voter) {
		try {
			repository.save(voter);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteVoterById(String email) {
		try {
			repository.deleteById(email);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	

}
