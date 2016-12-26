package electoralVoteStrategy;

import voting.IElectoralVoteBehavior;
import voting.MyState;
import voting.VotingData;

public class DemocraticFavorStateWithMostVotesElectoral implements IElectoralVoteBehavior{

	public VotingData[] calculateElectoralVotes(MyState[] states, VotingData[] votingData){
		
		int maxElectoralVotes = states[0].getNumElectoralVotes();
		int indexMaxElectoralVotes = 0;
		
		for(int i = 0; i < states.length; i++)
		{
			if(states[i].getNumElectoralVotes()>maxElectoralVotes)
			{
				maxElectoralVotes = states[i].getNumElectoralVotes();
				indexMaxElectoralVotes = i;
			}
			if(states[i].getNumRVotes()>states[i].getNumDVotes())
			{
				votingData[i].setCalculatedERVotes(states[i].getNumElectoralVotes());
			}
			else
			{
				votingData[i].setCalculatedEDVotes(states[i].getNumElectoralVotes());
			}
		}
		votingData[indexMaxElectoralVotes].setCalculatedERVotes(0);
		votingData[indexMaxElectoralVotes].setCalculatedEDVotes(states[indexMaxElectoralVotes].getNumElectoralVotes());
		return votingData;
	}
	
}
