/**
 * 
 */
package bnym.casestudy.services;

import java.util.List;


import bnym.casestudy.entities.Contest;

/**
 * @author margaret.parsons
 *
 */
public interface ContestDAO {
	
	public List<Contest> getAllContests();
	public Contest getContestById(Long id);
	public boolean saveContest(Contest contest);
	public boolean deleteContestById(Long id);

}
