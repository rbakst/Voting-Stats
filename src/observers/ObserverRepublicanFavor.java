package observers;

import java.util.Observable;
import java.util.Observer;

import electoralVoteStrategy.RepublicanFavorSplit1StateElectoral;
import popularVoteStrategy.RepublicanFavorPopular;
import voting.MyState;
import voting.Subject;
import voting.VotingData;

public class ObserverRepublicanFavor extends AbstractObserver  {

	public ObserverRepublicanFavor(Observable observable){
		
		if(observable instanceof Subject)
		{
			Subject subject = (Subject)observable; 
			PVBehavior = new RepublicanFavorPopular();
			EVBehavior = new RepublicanFavorSplit1StateElectoral();
			this. votingData = new VotingData[subject.getStates().length];
			 for(int i = 0; i<votingData.length;i++)
				{
					votingData[i] = new VotingData();
				}
			 

			observable.addObserver(this);
		}
	}
	
	

}
