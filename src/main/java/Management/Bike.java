package Management;

import java.util.Scanner;

public class Bike extends Vehicle {
    private int wattage;

    public Bike() {
        super();
    }
    public Bike(String manufacturerName, int manufactureYear, float Price, String Color, int wattage ){
      super(manufacturerName,manufactureYear,Price,Color);
      this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage() {
        this.wattage = wattage;
    }

  /*  public void inputBikeInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf(" -Input wattage:   ");
        wattage = scanner.nextLine();
    }
*/
    public String toString() {
        return super.toString() + ", Wattage: " + wattage;
    }
}
