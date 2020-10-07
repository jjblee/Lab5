package Wassup;

import java.util.ArrayList;
import java.util.Comparator;

public class Population {

    private ArrayList<Individual> individuals;

    public Population() {
        individuals = new ArrayList<>();
    }

    public int size() {
        return individuals.size(); //size() list의 원소 수
    }

    public void addIndividual(Individual newIndividual) {
        individuals.add(newIndividual); //arraylist의 add()메소드
    }

    private boolean sorted() {
        for(int i=1;i<individuals.size();i++) {
            if (individuals.get(i-1).sortKey() > individuals.get(i).sortKey()) {
                return false;
            }
        }
        return true;
    }

    public void toNextGeneration(int numReplace) {
        if (!sorted()) {
            individuals.sort(Comparator.comparingInt(Individual::sortKey));
        }
        int n = individuals.size(), k = numReplace;
        if (n < 2 * k) {
            throw new Error("Population is too small for the required number of replacement");
        }
        for (int i = k; i < n; i++) {       
            individuals.set(i - k, individuals.get(i));     //k-1~n-1을 0~n-k-1자리로 땡기기
        }
        for (int i = n - k; i < n; i++) {
            individuals.set(i, individuals.get(i).clone()); //비어있는 n-1~n-1 자리에 복사해넣기
        }
    }

    public Individual[] getIndividuals() {
        if (!sorted()) {
            individuals.sort(Comparator.comparingInt(Individual::sortKey));
        }
        Individual[] result = new Individual[individuals.size()];
        return individuals.toArray(result); //arraylist를 array로 변환
    }

}
