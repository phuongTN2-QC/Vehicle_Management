package Management;

import java.util.Scanner;

public class Truck extends Vehicle {
    private int tonnage;

    public Truck() {

    }

    public Truck(String manufacturerName, int manufactureYear, float Price, String Color, int tonnage) {
        super(manufacturerName, manufactureYear, Price, Color);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    /*  public void inputTruckInfo() {
          Scanner scanner = new Scanner(System.in);
        //  super.inputVehicleInfo();
          System.out.printf(" -Input tonnage:   ");
          tonnage = scanner.nextInt();
      }
  */
    public String toString() {
        return super.toString() + ", Tonnage: " + tonnage;
    }
}
