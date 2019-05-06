package bnym.casestudy.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import bnym.casestudy.entities.Cat;

@Repository
public interface CatRepository extends CrudRepository<Cat, Long>{

}
