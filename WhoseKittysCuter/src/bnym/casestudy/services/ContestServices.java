package bnym.casestudy.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Contest;
import bnym.casestudy.repository.ContestRepository;

@Service
@Transactional
public class ContestServices implements ContestDAO{

	
	@Autowired
	ContestRepository repository;
	
	@Override
	public List<Contest> getAllContests() {
		List<Contest> list = new ArrayList<Contest>();
		for (Contest contest : repository.findAll()){
			list.add(contest);
		}
		return list;
	}

	@Override
	public Contest getContestById(Long id) {
		Contest contest = repository.findById(id).get();
		return contest;
	}

	@Override
	public boolean saveContest(Contest contest) {
		try {
			repository.save(contest);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteContestById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
