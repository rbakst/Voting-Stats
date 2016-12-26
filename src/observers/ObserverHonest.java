package observers;

import java.util.Observable;
import java.util.Observer;

import electoralVoteStrategy.HonestElectoral;
import popularVoteStrategy.HonestPopular;
import voting.MyState;
import voting.Subject;
import voting.VotingData;

public class ObserverHonest extends AbstractObserver{

	public ObserverHonest(Observable observable){
		
		if(observable instanceof Subject)
		{
			Subject subject = (Subject)observable; 
			PVBehavior = new HonestPopular();
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
