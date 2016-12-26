package popularVoteStrategy;

import voting.IPopularVoteBehavior;
import voting.MyState;
import voting.VotingData;

public class DemocraticFavorPopular implements IPopularVoteBehavior{

	public VotingData[] calculatePopularVotes(MyState[] states, VotingData[] votingData){
		
		int numDVotes;
		int numRVotes;
		int maxRVotes = states[0].getNumRVotes();
		int maxRIndex = 0;
		
		for(int i = 0; i<states.length; i++)
		{
			numRVotes = states[i].getNumRVotes();
			if(maxRVotes < numRVotes)
			{
				maxRVotes = numRVotes;
				maxRIndex=i;
			}
			votingData[i].setCalculatedRVotes(numRVotes);
			numDVotes = states[i].getNumDVotes();
			votingData[i].setCalculatedDVotes(numDVotes);
		}
		
		votingData[maxRIndex].setCalculatedRVotes(0);
		
		
		
		return votingData; 
	}
	
}
