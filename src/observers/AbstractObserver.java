package observers;

import java.time.LocalTime;
import java.util.Observable;
import java.util.Observer;
import voting.IElectoralVoteBehavior;
import voting.IPopularVoteBehavior;
import voting.MyState;
import voting.Subject;
import voting.VotingData;


public abstract class AbstractObserver implements Observer{
	
	protected IElectoralVoteBehavior EVBehavior;
	protected IPopularVoteBehavior PVBehavior;
	protected VotingData[] votingData;
	protected MyState[] states;
	
	public void calculatePV(){
		votingData = PVBehavior.calculatePopularVotes( states, votingData);
		
	}
	public void calculateEV(){
		
		votingData = EVBehavior.calculateElectoralVotes(states, votingData);
	}
	
		
	public void displayMessage(){
		
	
		System.out.println("All reports are purely observational and not legally binding in any way. " + LocalTime.now());
		System.out.println();
	}
	
	//uses PULL - uses the subject and pulls the array of states from there
	public void update(Observable observable, Object stateObject)
	{
		if (observable instanceof Subject)
		{
			Subject subject  = (Subject) observable;
			this.states = subject.getStates();
			calculateAndDisplay();
		}
	}
	
	public void calculateAndDisplay(){
		int totalRVotes = 0;
		int totalDVotes = 0 ;
		int totalERVotes = 0 ;
		int totalEDVotes = 0 ;
		
		
		calculatePV();
		calculateEV();
		
		
		for(int i = 0; i < states.length; i++)
		{
			totalRVotes +=(votingData[i].getCalculatedRVotes());
			totalDVotes+=(votingData[i].getCalculatedDVotes());
			totalERVotes+=(votingData[i].getCalculatedERVotes());
			totalEDVotes+=(votingData[i].getCalculatedEDVotes());
		}
		
		System.out.println("Total Republican Votes: " + totalRVotes);
		System.out.println("Total Democratic Votes: " + totalDVotes);
		System.out.println("Total Electoral Republican Votes: " + totalERVotes);
		System.out.println("Total Electoral Democratic Votes: " + totalEDVotes);
		displayMessage();
	}
	
	
	

}
	
