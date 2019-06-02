import java.util.ArrayList;

public class VoteProcessor {
	int pope;
	int snowden;
	public Object calculateElectionWinner(ArrayList<String> votes) {
		for(String vote:votes) {
			vote=vote.toUpperCase();
			if(vote.equals("POPE FRANCIS")) {
				pope++;
			}
			else if(vote.equals("EDWARD SNOWDEN")) {
				snowden++;
			}
		}
		if(pope > snowden) {
			return "pope francis";
		}
		else if(snowden > pope) {
			return "edward snowden";
		}
		else if(snowden == pope) {
			return "TIE";
		}
		else {
			System.out.println("ERROR");
			return null;
		}
		
	}

}
