package observers;
import java.util.Observable;
import java.util.Observer;
import electoralVoteStrategy.DemocraticFavorStateWithMostVotesElectoral;
import popularVoteStrategy.DemocraticFavorPopular;
import voting.MyState;
import voting.Subject;
import voting.VotingData;

public class ObserverDemocratFavor extends AbstractObserver{
	
	public ObserverDemocratFavor(Observable observable){
		
		if(observable instanceof Subject)
		{
			Subject subject = (Subject)observable; 
			EVBehavior = new DemocraticFavorStateWithMostVotesElectoral();
			PVBehavior = new DemocraticFavorPopular();
			this.votingData = new VotingData[subject.getStates().length];
			 for(int i = 0; i<votingData.length;i++)
				{
					votingData[i] = new VotingData();
				}
			
			observable.addObserver(this);
		}
		
		
	}
	
	
	
	
	
	
	

}
