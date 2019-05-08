package bnym.casestudy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entities.Contestant;

@Repository
public interface ContestantRepository extends CrudRepository <Contestant, String> {

}
