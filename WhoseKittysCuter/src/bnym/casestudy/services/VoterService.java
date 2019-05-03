/**
 * 
 */
package bnym.casestudy.services;

/**
 * @author margaret.parsons
 *
 */
public class VoterService implements VoterDAO {

	@Override
	public int vote(int numVotes) {
		// on click of Pick Me Key
		return numVotes++;
		
	}

	@Override
	public void contactUs() {
		// TODO Auto-generated method stub
		
	}

}
