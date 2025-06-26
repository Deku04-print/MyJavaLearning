package Methods;

import java.util.Scanner;

public class GetterSetter {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String Car,CarModel;
        int price;
        System.out.println("Enter your Car name :");
        Car=sc.nextLine();

        System.out.println("Enter your Car Model :");
        CarModel=sc.nextLine();

        System.out.println("Enter your Car Price :");
        price=sc.nextInt();

        CarModel car=new CarModel(Car,CarModel,price);

        System.out.println("Car Name is : "+car.getCar()+"Car Model :"+car.getModel()+"Car Price :"+car.getprice());
        sc.close();
    }
}

class CarModel{
    private String Car;
    private String Model;
    private int price;
    CarModel(String car,String model,int price){
        this.Car=car;
        this.Model=model;
        this.price=price;
    }

    public void setCar(String car) {
        this.Car = car;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public void setPrice(int price) {

        if(price<0){
            System.out.println("Price Cannot be Negative.....");
        }else {

        this.price = price;
        }
    }

     public String getCar(){
        return this.Car;
     }
     public String getModel(){
        return this.Car;
     }
     public String getprice(){
        return "$"+this.price;
     }


}