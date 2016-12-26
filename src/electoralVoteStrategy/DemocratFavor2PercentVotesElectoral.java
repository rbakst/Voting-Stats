package electoralVoteStrategy;

import voting.IElectoralVoteBehavior;
import voting.MyState;
import voting.VotingData;

public class DemocratFavor2PercentVotesElectoral implements IElectoralVoteBehavior {

	public VotingData[] calculateElectoralVotes(MyState[] states, VotingData[] votingData){
		double calculatedRVotes;
		double calculatedDVotes;
		
		for(int i = 0; i< states.length; i++)
		{
			calculatedRVotes = states[i].getNumRVotes() - (states[i].getNumRVotes()*.02);
			calculatedDVotes = states[i].getNumDVotes() + (states[i].getNumDVotes()*.02);
			
			if(calculatedRVotes > calculatedDVotes)
			{
				votingData[i].setCalculatedERVotes(states[i].getNumElectoralVotes());
			}
			else
			{
				votingData[i].setCalculatedEDVotes(states[i].getNumElectoralVotes());
			}
		}
		
		return votingData;

		
		
	}
}
