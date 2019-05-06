package bnym.casestudy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entities.Contest;

@Repository
public interface ContestRepository extends CrudRepository<Contest, Long> {

}
