package voting;

import java.util.Observable;

public class Subject extends Observable{
	
	private MyState[] states;
	
	public Subject(MyState[] states){
		this.states = states;
	}
	
	public void calculationsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setCalculations(MyState[] newStates){
		
		for(int i =0; i<states.length; i++)
		{
			this.states[i].setNumRVotes(newStates[i].getNumRVotes());
			this.states[i].setNumDVotes(newStates[i].getNumDVotes());
			
		}
		
		calculationsChanged();
	}
	
	public MyState[] getStates(){
		return this.states;
	}

}
