package observers;

import java.util.Observable;
import java.util.Observer;
import voting.Subject;
import electoralVoteStrategy.HonestElectoral;
import popularVoteStrategy.DemocraticFavorPopular;
import voting.MyState;
import voting.VotingData;

public class ObserverDemPopularHonestElectoral extends AbstractObserver{

	public ObserverDemPopularHonestElectoral(Observable observable){
		
		if(observable instanceof Subject)
		{
			Subject subject = (Subject)observable; 
			PVBehavior = new DemocraticFavorPopular();
			EVBehavior = new HonestElectoral();
			this.votingData = new VotingData[subject.getStates().length];
			 for(int i = 0; i<votingData.length;i++)
				{
					votingData[i] = new VotingData();
				}
		
			observable.addObserver(this);
		}
	}
	
}
