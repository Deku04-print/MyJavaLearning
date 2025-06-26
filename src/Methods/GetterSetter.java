package Methods;

import java.util.Scanner;

public class GetterSetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many cars do you have? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Create array to hold multiple CarModel objects
        CarModel[] cars = new CarModel[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Car " + (i + 1));

            System.out.print("Enter your Car name: ");
            String carName = sc.nextLine();

            System.out.print("Enter your Car Model: ");
            String carModel = sc.nextLine();

            System.out.print("Enter your Car Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // Consume newline

            // Create CarModel object and store it
            cars[i] = new CarModel(carName, carModel, price);
        }

        System.out.println("\nYour Car Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nCar " + (i + 1));
            System.out.println("Car Name: " + cars[i].getCar());
            System.out.println("Car Model: " + cars[i].getModel());
            System.out.println("Car Price: " + cars[i].getPrice());
        }

        sc.close();
    }
}

class CarModel {
    private String Car;
    private String Model;
    private int price;

    CarModel(String car, String model, int price) {
        this.Car = car;
        this.Model = model;
        setPrice(price); // using setter to validate
    }

    // Setters
    public void setCar(String car) {
        this.Car = car;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price Cannot be Negative. Setting it to 0.");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    // Getters
    public String getCar() {
        return this.Car;
    }

    public String getModel() {
        return this.Model; // Fixed: it was returning Car before
    }

    public String getPrice() {
        return "$" + this.price;
    }
}

/* output >>

How many cars do you have? 3

Enter details for Car 1
Enter your Car name: Honda
Enter your Car Model: creta
Enter your Car Price: 300000

Enter details for Car 2
Enter your Car name: Mercedes
Enter your Car Model: 320d
Enter your Car Price: 238882

Enter details for Car 3
Enter your Car name: BMW
Enter your Car Model: X3
Enter your Car Price: 40000

Your Car Details:

Car 1
Car Name: Honda
Car Model: creta
Car Price: $300000

Car 2
Car Name: Mercedes
Car Model: 320d
Car Price: $238882

Car 3
Car Name: BMW
Car Model: X3
Car Price: $40000

 */
