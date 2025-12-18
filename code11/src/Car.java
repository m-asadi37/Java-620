public class Car {

    Car(){

    }

    //alt + insert
    public Car(String colour, int year) {
        this.colour = colour;
        this.year = year;       //input value
        this.km = 0;            //default value
    }

    String colour;
    int year;
    int km;

    void move() {
        System.out.println("move...");
    }
}
