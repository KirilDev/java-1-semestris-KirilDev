package rvt;

class Animal {
    String name;
    int age;
 
    // Konstruktoru metode
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    // Metode run() trūkst
    void run() {
        // papildini kodu, lai izvadītu "Animal [name] is running"
        System.out.println("Animal " + name + " is running");
    }
 
    public static void main(String[] args) {
        Animal a1 = new Animal("Leo", 4);
        Animal a2 = new Animal("Mia", 2);
 
        // Pārbaudijam run() metodi šeit
        a1.run();
        a2.run();
    }
}