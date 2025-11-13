package rvt;

public class Statistics {
    private int count;
    private int counter;
    private int sum;

    public Statistics(){
        this.count = count;
        this.counter = 0;
    }

    public void addNumber(int number){
        count = count + number;
        counter++;
    }
    
    public int getCount(){
        return counter;
    }
    
    public int sum(){
        return count;

    }
    public double average(){
        return count / counter;
    }

    public static void main(String[] args){
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
