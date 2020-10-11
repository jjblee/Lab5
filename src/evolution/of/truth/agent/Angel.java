package evolution.of.truth.agent;

import Wassup.Individual;
import evolution.of.truth.match.Match;

public class Angel extends Agent {
    public Angel(){
        super("Angel");
    }
    @Override
    public Individual clone(){
        return new Angel();
    }
    @Override
    public int choice(int previousOpponentChoice, int prepreOppChoice){
        return Match.COOPERATE;
    }
}
