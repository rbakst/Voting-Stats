package voting;

import observers.ObserverDemPopularHonestElectoral;
import observers.ObserverDemPopularRepubElectoral;
import observers.ObserverDemocratFavor;
import observers.ObserverHonest;
import observers.ObserverRepublicanFavor;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyState[] states = new MyState[5];
		
		Subject subject = new Subject(states);
		
		ObserverDemocratFavor observer1 = new ObserverDemocratFavor(subject);
		ObserverDemPopularHonestElectoral observer2 = new ObserverDemPopularHonestElectoral(subject);
		ObserverDemPopularRepubElectoral observer3 = new ObserverDemPopularRepubElectoral(subject);
		ObserverHonest observer4 = new ObserverHonest(subject);
		ObserverRepublicanFavor observer5 = new ObserverRepublicanFavor(subject);
		
		
		states[0] = new MyState(USState.NEWYORK.name(), 345, 567, 29);
		states[1] = new MyState(USState.NEWJERSEY.name(), 432, 987, 14);
		states[2] = new MyState(USState.CALIFORNIA.name(), 123, 345, 55);
		states[3] = new MyState(USState.TEXAS.name(), 456, 478, 38);
		states[4] = new MyState(USState.MISSOURI.name(), 234, 146, 10);
		
		//easy numbers used for testing
		/*states[0] = new MyState(USState.NEWYORK.name(), 10, 10, 2);
		states[1] = new MyState(USState.NEWJERSEY.name(), 10, 10, 2);
		states[2] = new MyState(USState.CALIFORNIA.name(), 10, 10, 2);
		states[3] = new MyState(USState.TEXAS.name(), 10, 10, 2);
		states[4] = new MyState(USState.MISSOURI.name(), 10, 10, 2);*/
		
		
		subject.setCalculations(states);
	
		System.out.println("new data");
	//change the votes with no logical method
	int fluctuatingRVotes = 456;
	int fluctuatingDVotes = 465;
	
	for(int i = 0; i< states.length; i++)
	{
		states[i].setNumDVotes(fluctuatingDVotes);
		states[i].setNumRVotes(fluctuatingRVotes);
		
		if(i % 2 ==0)
		{
			fluctuatingRVotes += 100;
			fluctuatingDVotes-=100;
		}
		else
		{
			fluctuatingRVotes-=100;
			fluctuatingDVotes+=100;
		}
	}
	
	System.out.println();
	subject.setCalculations(states);
	

	}

}
