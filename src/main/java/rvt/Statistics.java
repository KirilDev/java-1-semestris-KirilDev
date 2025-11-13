package rvt;

public class Statistics {
    private int count;


    public Statistics(){

    }

    public void addNumber(int number){

    }

    public int getCount(){

    }

    public static void main(String[] args){
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}
