package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    int numberOfBike;
    int numberOfCar;
    int numberOfTruck;

    int numberOfVehicle;
    ArrayList<Truck> truckArrayList = new ArrayList<Truck>();
    ArrayList<Car> carArrayList = new ArrayList<Car>();
    ArrayList<Bike> bikeArrayList = new ArrayList<Bike>();
    ArrayList<Vehicle> vehicleArrayList = new ArrayList<Vehicle>();

    public void bikeInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("List of bikes");
        System.out.printf("Please input number of bikes you want to input:    ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < amount; i++) {
            System.out.println("Bike:" + (i + 1));
            System.out.printf(" -Input name of manufacturer:  ");
            String manufacturerName = scanner.nextLine();
            System.out.printf(" -Input year of manufacture:   ");
            int manufactureYear = scanner.nextInt();
            scanner.nextLine();
            System.out.printf(" -Input color: ");
            String Color = scanner.nextLine();
            System.out.printf(" -Input price:  ");
            float Price = scanner.nextFloat();
            System.out.printf(" -Input wattage:   ");
            int wattage = scanner.nextInt();
            scanner.nextLine();
            vehicleArrayList.add(new Vehicle(manufacturerName, manufactureYear, Price, Color));
            bikeArrayList.add(new Bike(manufacturerName, manufactureYear, Price, Color, wattage));
            numberOfVehicle++;
            numberOfBike++;
        }
        chooseOptions();
    }

    public void carInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "------------------------------");
        System.out.println("list of cars");
        System.out.printf("Please input number of cars: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < amount; i++) {
            System.out.println("Car:" + (i + 1));
            System.out.printf(" -Input name of manufacturer:  ");
            String manufacturerName = scanner.nextLine();
            System.out.printf(" -Input year of manufacture:   ");
            int manufactureYear = scanner.nextInt();
            scanner.nextLine();
            System.out.printf(" -Input color: ");
            String Color = scanner.nextLine();
            System.out.printf(" -Input price:  ");
            float Price = scanner.nextFloat();
            System.out.printf(" -Input number of seats: ");
            int numberOfSeat = scanner.nextInt();
            scanner.nextLine();
            System.out.printf(" -Input type of engine:  ");
            String engineType = scanner.nextLine();
            vehicleArrayList.add(new Vehicle(manufacturerName, manufactureYear, Price, Color));
            carArrayList.add(new Car(manufacturerName, manufactureYear, Price, Color, numberOfSeat, engineType));
            numberOfVehicle++;
            numberOfCar++;
        }
        chooseOptions();
    }

    public void truckInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "------------------------------");
        System.out.println("list of trucks");
        System.out.printf("Please input number of trucks: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < amount; i++) {
            System.out.println("Truck:" + (i + 1));
            System.out.printf(" -Input name of manufacturer:  ");
            String manufacturerName = scanner.nextLine();
            System.out.printf(" -Input year of manufacture:   ");
            int manufactureYear = scanner.nextInt();
            scanner.nextLine();
            System.out.printf(" -Input color: ");
            String Color = scanner.nextLine();
            System.out.printf(" -Input price:  ");
            float Price = scanner.nextFloat();
            System.out.printf(" -Input tonnage: ");
            int tonnage = scanner.nextInt();
            scanner.nextLine();
            vehicleArrayList.add(new Vehicle(manufacturerName, manufactureYear, Price, Color));
            truckArrayList.add(new Truck(manufacturerName, manufactureYear, Price, Color, tonnage));
            numberOfVehicle++;
            numberOfTruck++;
        }
        chooseOptions();
    }

    public void bikeOutput() {
        System.out.println("\n" + "------------------------------");
        if(numberOfBike ==0){
            System.out.println("Have no bike to output");
        }
        else {
            System.out.println("List of bikes:");
            System.out.println("Number of bikes:" + numberOfBike);
            for (int i = 0; i < numberOfBike; i++) {
                System.out.println("Bike " + (i + 1));
                System.out.println(bikeArrayList.get(i).toString());
            }
            chooseOptions();
        }

    }

    public void carOutput() {
        System.out.println("\n" + "------------------------------");
        System.out.println("List of cars:");
        System.out.println("Number of cars:" + numberOfCar);
        for (int i = 0; i < numberOfCar; i++) {
            System.out.println("Car " + (i + 1));
            System.out.println(carArrayList.get(i).toString());
        }
        chooseOptions();
    }

    public void truckOutput() {
        System.out.println("\n" + "------------------------------");
        System.out.println("List of trucks:");
        System.out.println("Number of trucks:" + numberOfTruck);
        for (int i = 0; i < numberOfTruck; i++) {
            System.out.println("Truck " + (i + 1));
            System.out.println(truckArrayList.get(i).toString());
        }
        chooseOptions();
    }

    public void vehicleOutput() {
        System.out.println("\n" + "------------------------------");
        System.out.println("\n" + "------------------------------");
        System.out.println("\n" + "------------------------------");
        if(numberOfVehicle ==0){
            System.out.println("Have no vehicle to output");
        }
        else {
            if(numberOfBike!=0) {
                System.out.println("List of bikes:");
                System.out.println("Number of bikes:" + numberOfBike);
                for (int i = 0; i < numberOfBike; i++) {
                    System.out.println("Bike " + (i + 1));
                    System.out.println(bikeArrayList.get(i).toString());
                }
            }
            if(numberOfCar!=0){
                System.out.println("List of cars:");
                System.out.println("Number of cars:" + numberOfCar);
                for (int i = 0; i < numberOfCar; i++) {
                    System.out.println("Car " + (i + 1));
                    System.out.println(carArrayList.get(i).toString());
                }
            }
            if(numberOfTruck!=0){
                System.out.println("List of trucks:");
                System.out.println("Number of trucks:" + numberOfTruck);
                for (int i = 0; i < numberOfTruck; i++) {
                    System.out.println("Truck " + (i + 1));
                    System.out.println(truckArrayList.get(i).toString());
                }
            }
            chooseOptions();
        }

    }

    public void searchByYearOfManufacture(int year) {
            System.out.println("List of bikes:");
            System.out.println("Number of bikes:" + numberOfBike);
            for (int i = 0; i < numberOfBike; i++) {
                System.out.println("Bike " + (i + 1));
                System.out.println(bikeArrayList.get(i).toString());
            }
            chooseOptions();

    }

    public void searchByNameOfManufacturer() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        for (int i = 0; i < numberOfVehicle; i++) {
            if (name.equalsIgnoreCase(vehicleArrayList.get(i).getManufacturerName())) {
                System.out.println(vehicleArrayList.get(i).toString());
                count ++;
            }

        }
        if (count ==0){
            System.out.println("Have no record found");
        }
        chooseOptions();
    }

    public void editYearOfManuFacture() {
        int beforeYear, afterYear;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year want to change:");
        beforeYear = scanner.nextInt();
        System.out.println("Input new value:");
        afterYear = scanner.nextInt();
        for (int i = 0; i < numberOfVehicle; i++) {
            if (beforeYear == vehicleArrayList.get(i).getManufacturerYear()) {
            //   vehicleArrayList.get(i).toString();
            //    vehicleArrayList.set(i,afterYear);
                System.out.println(vehicleArrayList.get(i).toString());
              //  vehicleArrayList.get(i).setManufacturerYear(afterYear);
            }
        }
    //    vehicleOutput();
     //   chooseOptions();
    }

    public void deleteVehiclebyName() {
        if(numberOfVehicle ==0){
            System.out.println("Have no vehicle to delete");
        }
        else {
            String name;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input name of the vehicle you want to delete:");
            name = scanner.nextLine();
            for (int i = 0; i < numberOfVehicle; i++) {
                if (name.equalsIgnoreCase(vehicleArrayList.get(i).getManufacturerName())) {
                    vehicleArrayList.remove(vehicleArrayList.get(i));
                    numberOfVehicle = vehicleArrayList.size();
                }
                vehicleOutput();
            }
            chooseOptions();
        }

    }

    public void searchVehicle() {
        if (numberOfVehicle ==0){
            System.out.println("Have no vehicle to search");
        }
        else{
            System.out.println("\n" + "What criteria do you want to search by?");
            System.out.println("    - 1 : Name of manufacturer");
            System.out.println("    - 2 : Color of the vehicle");

            System.out.printf(" Your choice is:  ");
            Scanner scanner = new Scanner(System.in);
            int chosen = scanner.nextInt();
            switch (chosen) {
                case 1:
                    searchByNameOfManufacturer();
                    break;
                case 2:
                    System.out.printf("Input year:");
                    int year = scanner.nextInt();
                  //  searchByYearOfManufacture(year);
                    break;
                default:
                    System.out.println("Have no record found");
            }
            chooseOptions();
        }

    }


    public void chooseOptions() {
        System.out.println("What do you want to do?");
        System.out.println("    - 1 : Input list of bikes");
        System.out.println("    - 2 : Input list of cars");
        System.out.println("    - 3: Input list of trucks ");
        System.out.println("    - 4: Output list of vehicles ");
        System.out.println("    - 5: Search Vehicle by Name");
        System.out.println("    - 6: Edit Vehicle by Year");
        System.out.println("    - 7: Delete Vehicle by Name");
        System.out.println("    - 8: Quit");
        Scanner scanner = new Scanner(System.in);
        System.out.printf(" Your choice is:  ");
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                bikeInput();
                break;
            case "2":
                carInput();
                break;
            case "3":
                truckInput();
                break;
            case "4":
                vehicleOutput();
                break;
            case "5":
                searchByNameOfManufacturer();
                break;
            case "6":
                editYearOfManuFacture();
                break;
            case "7":
                deleteVehiclebyName();
                break;
            default:
                System.out.println("Quit. Bye Bye");
        }
    }


}







