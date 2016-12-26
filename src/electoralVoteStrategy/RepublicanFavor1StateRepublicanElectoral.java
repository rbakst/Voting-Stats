package electoralVoteStrategy;

import voting.IElectoralVoteBehavior;
import voting.MyState;
import voting.VotingData;

public class RepublicanFavor1StateRepublicanElectoral implements IElectoralVoteBehavior{

	public VotingData[] calculateElectoralVotes(MyState[] states, VotingData[] votingData ){
		
	final String REPUBLICAN_STATE = "CALIFORNIA";
	
	for(int i = 0; i < states.length; i++){
		if(states[i].getName().equals(REPUBLICAN_STATE))
		{
			votingData[i].setCalculatedERVotes(states[i].getNumElectoralVotes());
		}
		else
		{
			if(states[i].getNumRVotes()>=states[i].getNumDVotes())
			{
				votingData[i].setCalculatedERVotes(states[i].getNumElectoralVotes());
			}
			else
			{
				votingData[i].setCalculatedEDVotes(states[i].getNumElectoralVotes());
			}
		}
	}
	
	return votingData;
		
		
	}
}
