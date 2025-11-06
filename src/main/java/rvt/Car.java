package rvt;

class Car {
    String brand;
    double fuelAmount;
    double fuelConsumption;
 
    // Konstruktoru metode
    Car(String brand, double fuelAmount, double fuelConsumption) {
        this.brand = brand;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }
  // Metode, kas izvada informāciju par mašīnu
    void showInfo() {
        System.out.println("Brand: " + brand + ", Fuel: " + fuelAmount);
    }

    // Papildini šeit ar metodi drive()
    void drive(){
        fuelAmount -= 10;
        System.out.println("Fuel amount is: " + fuelAmount);

    }
    
    // Papildini šeit ar metodi refuel()
    void refuel(){
        fuelAmount += 10;
        System.out.println("Fuel amount is: " + fuelAmount);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Audi", 50, 5);
        Car car2 = new Car("BMW", 60, 6);

        car1.showInfo();
        car1.drive();
        car1.refuel();
    
        car2.showInfo();
        car2.drive();
        car2.refuel();
    }
}
