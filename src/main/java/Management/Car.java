package Management;

import java.util.Scanner;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String engineType;

    public Car() {
        super();
    }

    public Car (String manufacturerName, int manufactureYear, float Price, String Color, int numberOfSeats, String engineType){
        super(manufacturerName,manufactureYear,Price, Color);
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }


    public void setNumberOfSeats() {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngineType() {
        this.engineType = engineType;
    }

    /*public void inputCarInfo() {
      //  super.inputVehicleInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" -Input number of seats:   ");
        numberOfSeats = scanner.nextInt();
        System.out.printf(" -Input type of engine:    ");
        scanner.nextLine();
        engineType = scanner.nextLine();
    }*/

    public String toString() {
        return super.toString() + ", Number of seats: " + numberOfSeats + ", Type of engine: " + engineType;
    }
}
