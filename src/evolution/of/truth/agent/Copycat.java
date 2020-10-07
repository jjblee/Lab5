package evolution.of.truth.agent;

import Wassup.Individual;
import evolution.of.truth.match.Match;

public class Copycat extends Agent{
    public Copycat(){
        super("Copycat");
    }
    public Individual clone(){
        return new Copycat();
    }
    @Override
    public int choice(int previousOpponentChoice){
        if(previousOpponentChoice== Match.UNDEFINED){
            return Match.COOPERATE;
        }else{
            return previousOpponentChoice;
        }
    }

}
