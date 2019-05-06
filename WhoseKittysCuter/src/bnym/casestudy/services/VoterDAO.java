/**
 * 
 */
package bnym.casestudy.services;

import java.util.List;


import bnym.casestudy.entities.Voter;

/**
 * @author margaret.parsons
 *
 */
public interface VoterDAO {

	public List<Voter> getAllVoters();
	public Voter getVoterById(String email);
	public boolean saveVoter(Voter voter);
	public boolean deleteVoterById(String email);
}
