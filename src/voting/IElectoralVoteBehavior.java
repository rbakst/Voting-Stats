package voting;

public interface IElectoralVoteBehavior {

	public VotingData[] calculateElectoralVotes(MyState[] states, VotingData[] votingData);
}
