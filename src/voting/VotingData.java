package voting;

public class VotingData {
	
	private Integer calculatedRVotes;
	private Integer calculatedDVotes;
	private Integer calculatedERVotes;
	private Integer calculatedEDVotes;
	
	public VotingData( ){

		this.calculatedRVotes = 0;
		this.calculatedDVotes = 0;
		this.calculatedERVotes = 0;
		this.calculatedEDVotes = 0;
	}
	
	public int getCalculatedRVotes() {
		return calculatedRVotes;
	}

	public void setCalculatedRVotes(int calculatedRVotes) {
		this.calculatedRVotes = calculatedRVotes;
	}

	public int getCalculatedDVotes() {
		return calculatedDVotes;
	}

	public void setCalculatedDVotes(int calculatedDVotes) {
		this.calculatedDVotes = calculatedDVotes;
	}

	public Integer getCalculatedERVotes() {
		return calculatedERVotes;
	}

	public void setCalculatedERVotes(Integer calculatedERVotes) {
		this.calculatedERVotes = calculatedERVotes;
	}

	public Integer getCalculatedEDVotes() {
		return calculatedEDVotes;
	}

	public void setCalculatedEDVotes(Integer calculatedEDVotes) {
		this.calculatedEDVotes = calculatedEDVotes;
	}
	
}
