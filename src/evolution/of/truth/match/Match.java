package evolution.of.truth.match;

import evolution.of.truth.agent.Agent;

public class Match {
    public static int CHEAT=0;
    public static int COOPERATE=1;
    public static int UNDEFINED=-1;

    protected static int[][][] ruleMatrix ={
            {
                    {0,0},
                    {3,-1}
            },
            {
                    {-1,3},
                    {2,2}
            }
    };

    Agent agentA; Agent agentB;
    int previousChoiceA, previousChoiceB, prepreAChoice, prepreBChoice;

    public Match(Agent agentA, Agent agentB){
        this.agentA=agentA; this.agentB=agentB;
        previousChoiceA=UNDEFINED;
        prepreAChoice=UNDEFINED;
        previousChoiceB=UNDEFINED;
        prepreBChoice=UNDEFINED;
    }

    public void playGame(){
        int choiceA=agentA.choice(previousChoiceB, prepreBChoice);
        int choiceB=agentB.choice(previousChoiceA, prepreAChoice);
        agentA.setScore(agentA.getScore()+ruleMatrix[choiceA][choiceB][0]);
        agentB.setScore(agentB.getScore()+ruleMatrix[choiceA][choiceB][1]);
        prepreAChoice=previousChoiceA;
        prepreBChoice=previousChoiceB;
        previousChoiceA=choiceA;
        previousChoiceB=choiceB;
    }
}


