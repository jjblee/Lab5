package evolution.of.truth.match;

import evolution.of.truth.agent.Agent;

public class MistakeMatch extends Match{
    public MistakeMatch(Agent agentA, Agent agentB){
        super(agentA, agentB);
    }

    @Override
    public void playGame(){
        int choiceA=reverse(agentA.choice(previousChoiceB, prepreBChoice));
        int choiceB=reverse(agentB.choice(previousChoiceA, prepreAChoice));
        agentA.setScore(agentA.getScore()+ruleMatrix[choiceA][choiceB][0]);
        agentB.setScore(agentB.getScore()+ruleMatrix[choiceA][choiceB][1]);
        prepreAChoice=previousChoiceA;
        prepreBChoice=previousChoiceB;
        previousChoiceA=choiceA;
        previousChoiceB=choiceB;
    }

    public int reverse(int choice){
        int random=(int)(Math.random()*100+1);
        if(random<=5){
            if(choice==0){
                return 1;
            } else{
                return 0;
            }
        } else{
            return choice;
        }
    }
}
