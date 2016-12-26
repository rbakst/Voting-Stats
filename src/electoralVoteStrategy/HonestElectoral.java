package electoralVoteStrategy;

import voting.IElectoralVoteBehavior;
import voting.MyState;
import voting.VotingData;

public class HonestElectoral implements IElectoralVoteBehavior {
	
	public VotingData[] calculateElectoralVotes(MyState[] states, VotingData[] votingData){
		
		int half;
		for(int i =0; i < states.length; i++)
		{
			if(states[i].getNumRVotes()>states[i].getNumDVotes())
			{
				votingData[i].setCalculatedERVotes(states[i].getNumElectoralVotes());
			}
			else if(states[i].getNumRVotes()<states[i].getNumDVotes())
			{
				votingData[i].setCalculatedEDVotes(states[i].getNumElectoralVotes());
			}
			else
			{
				half = states[i].getNumElectoralVotes()/2;
				votingData[i].setCalculatedEDVotes(half);
				votingData[i].setCalculatedERVotes(half);
			}
			
		}
		
		return votingData;
	}

}
