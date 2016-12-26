package voting;

public interface IPopularVoteBehavior {

	public VotingData[] calculatePopularVotes(MyState[] states, VotingData[] votingData);
}
