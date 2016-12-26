package voting;

public class MyState {

	private USState name;
	private int numElectoralVotes;
	private int numRepublicanVotes;
	private int numDemocraticVotes;
	
	
	
	public MyState(String name, int numRVotes, int numDVotes, int numEVotes){
		
		this.name = USState.valueOf(name);
		
		numRepublicanVotes = numRVotes;
		numDemocraticVotes = numDVotes;
		numElectoralVotes = numEVotes; 
		
	}

	public int getNumElectoralVotes() {
		return numElectoralVotes;
	}
	
	public int getNumRVotes() {
		return numRepublicanVotes;
	}
	

	public void setNumRVotes(int numRepublicanVotes) {
		this.numRepublicanVotes = numRepublicanVotes;
	}
	

	public int getNumDVotes() {
		return numDemocraticVotes;
	}

	public void setNumDVotes(int numDemocraticVotes) {
		this.numDemocraticVotes = numDemocraticVotes;
	}


	public String getName() {
		return name.name();
	}
}
