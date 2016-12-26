package electoralVoteStrategy;

import voting.IElectoralVoteBehavior;
import voting.MyState;
import voting.VotingData;

public class RepublicanFavorSplit1StateElectoral implements IElectoralVoteBehavior {

	public VotingData[] calculateElectoralVotes(MyState[] states, VotingData[] votingData){
		
		Integer voteDifference;
		Integer smallestDifference = states[0].getNumDVotes()-states[0].getNumRVotes();
		int indexSmallestDifference = 0;
		
		for(int i = 0; i < states.length; i++)
		{
			voteDifference = states[i].getNumDVotes()-states[i].getNumRVotes();
			
			if(voteDifference > 0)//democrat has lead
			{
				votingData[i].setCalculatedEDVotes(states[i].getNumElectoralVotes());
				if(voteDifference < smallestDifference)
				{
					smallestDifference = voteDifference;
					indexSmallestDifference = i;
				}
			}
			else
			{
				votingData[i].setCalculatedERVotes(states[i].getNumElectoralVotes());
			}
		}
		
		//take care of smallest lead
		int electoralVotes = states[indexSmallestDifference].getNumElectoralVotes();
		int halfElectoralVotes = states[indexSmallestDifference].getNumElectoralVotes()/2;
		
		votingData[indexSmallestDifference].setCalculatedEDVotes(halfElectoralVotes);
		votingData[indexSmallestDifference].setCalculatedERVotes(electoralVotes-halfElectoralVotes);//to account for the odd number going to republican
		
		return votingData;
		
	}
}
