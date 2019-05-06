package bnym.casestudy.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.repository.CatRepository;

@Service
@Transactional
public class CatServices implements CatDAO{

	
	@Autowired
	CatRepository repository;
	
	@Override
	public List<Cat> getAllCats() {
		List <Cat> list = new ArrayList<Cat>();
		for (Cat cat : repository.findAll()) {
			list.add(cat);
		}
		return list;
	}

	@Override
	public Cat getCatById(Long id) {
		Cat cat = repository.findById(id).get();
		return cat;
	}

	@Override
	public boolean saveCat(Cat cat) {
		try {
			repository.save(cat);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteCatById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


}
