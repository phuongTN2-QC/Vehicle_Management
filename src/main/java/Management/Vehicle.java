package Management;

import java.util.Scanner;

public class Vehicle {
    private String manufacturerName;
    private int manufactureYear;
    private float Price;
    private String Color;

    public Vehicle() {
    }

    public Vehicle(String manufacturerName, int manufactureYear, float Price, String Color) {
        this.manufacturerName = manufacturerName;
        this.manufactureYear = manufactureYear;
        this.Price = Price;
        this.Color = Color;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getManufacturerYear() {
        return manufactureYear;
    }

    public float getPrice() {
        return Price;
    }

    public String getColor() {
        return Color;
    }

    public void settManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setManufacturerYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setPrice(float price) {
        this.Price = price;
    }

    public void setColor(String color) {
        this.Color = Color;
    }

    public void inputVehicleInfo() {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        System.out.printf(" -Input name of manufacturer:  ");
        manufacturerName = scanner.nextLine();
        System.out.printf("\n" + " -Input year of manufacture:   ");
        manufactureYear = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("\n" + " -Input color: ");
        Color = scanner.nextLine();
        System.out.printf("\n" + " -Input price:  ");
        Price = scanner.nextFloat();

    }

    public String toString() {
        return "    - Name of manufacturer: " + manufacturerName + ", Year of manufacture: " + manufactureYear + ", Color: " + Color + ", Price: " + Price;
    }
}
