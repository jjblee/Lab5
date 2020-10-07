package evolution.of.truth.agent;

import Wassup.Individual;
import evolution.of.truth.match.Match;

public class Devil extends Agent {
    public Devil(){
        super("Devil");
    }
    @Override
    public Individual clone(){
        return new Devil();
    }
    @Override
    public int choice(int previousOpponentChoice){
        return Match.CHEAT;
    }

}
