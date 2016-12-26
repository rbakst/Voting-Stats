package popularVoteStrategy;

import voting.IPopularVoteBehavior;
import voting.MyState;
import voting.VotingData;

public class HonestPopular implements IPopularVoteBehavior {

	public VotingData[] calculatePopularVotes(MyState[] states, VotingData[] votingData){
		

		int numDVotes;
		int numRVotes;
		
		for(int i = 0; i<states.length; i++)
		{
			numRVotes = states[i].getNumRVotes();
			votingData[i].setCalculatedRVotes(numRVotes);
			numDVotes = states[i].getNumDVotes();
			votingData[i].setCalculatedDVotes(numDVotes);
			
		}
		
		return votingData; 
	}
}
