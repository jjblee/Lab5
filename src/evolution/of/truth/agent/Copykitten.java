package evolution.of.truth.agent;

import Wassup.Individual;
import evolution.of.truth.match.MistakeMatch;

public class Copykitten extends Agent{
    public Copykitten(){
        super("Copykitten");
    }
    public Individual clone(){
        return new Copykitten();
    }
    @Override
    public int choice(int previousOpponentChoice, int prepreOppChoice){
        if(previousOpponentChoice== MistakeMatch.CHEAT&&prepreOppChoice==MistakeMatch.CHEAT){
            return MistakeMatch.CHEAT;
        }else{
            return MistakeMatch.COOPERATE;
        }
    }

}

