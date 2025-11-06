package rvt;

class Phone {
    String manufactor;
    String model;
    String color;
    int originalMemorySize;
    int memorySize;
    int batteryLevel;

    Phone(String manufactor, String model, String color, int memorySize, int originalMemorySize, int batteryLevel){
        this.manufactor = manufactor;
        this.model = model;
        this.color = color;
        this.memorySize = memorySize;
        this.originalMemorySize = originalMemorySize;
        this.batteryLevel = batteryLevel;
    }

    void call(){
        System.out.println("Trying to call your ex-girlfriend...");
    }
    
    void charge(){
        batteryLevel += 5;
    }

    void checkMemory(){
        System.out.println("Your memory is full by: " + memorySize);
    }

    void info(){
        System.out.println("Manufactor: " + manufactor);
        System.out.println("Model: " + model);
        System.out.println("Memory size: " + originalMemorySize);
        System.out.println("Battery Level: " + batteryLevel + " %");
    }

    public static void main(String[] args) {
        Phone iphone11 = new Phone("Apple", "iPhone 11", "White", 58, 64, 13);
        Phone nothingPhone = new Phone("Nothing", "Phone 2", "Black", 64, 128, 85);
    
        iphone11.info();
        nothingPhone.info();
    }
}
