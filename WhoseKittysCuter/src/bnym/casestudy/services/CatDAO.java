package bnym.casestudy.services;

import java.util.List;

import bnym.casestudy.entities.Cat;




public interface CatDAO {
	
	public List<Cat> getAllCats();
	public Cat getCatById(Long id);
	public boolean saveCat(Cat cat);
	public boolean deleteCatById(Long id);

}
