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

    }
}


//    public Individual clone(){
//        return new Copycat();
//    }
//    @Override
//    public int choice(int previousOpponentChoice){
//        if(previousOpponentChoice== Match.UNDEFINED){
//            return Match.COOPERATE;
//        }else{
//            return previousOpponentChoice;
//        }
//    }
//
//}
