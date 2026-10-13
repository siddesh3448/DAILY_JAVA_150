class Car {
    String Model;
    int Year;

    Car(String Model, int Year) {
        this.Model = Model;
        this.Year = Year;
    }

    void display() {
        System.out.println(Model + " " + Year);
    }
}

public class Class {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota ", 2020);
        myCar.display();
    }
}
