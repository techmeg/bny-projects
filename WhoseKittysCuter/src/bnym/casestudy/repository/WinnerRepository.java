package bnym.casestudy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entities.Winner;

@Repository
public interface WinnerRepository extends CrudRepository <Winner, Long>{

}
