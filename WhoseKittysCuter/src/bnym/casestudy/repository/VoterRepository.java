package bnym.casestudy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entities.Voter;

@Repository
public interface VoterRepository extends CrudRepository<Voter, String>{

}
