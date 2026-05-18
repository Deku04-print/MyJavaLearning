package PracticeUntilSuccess;

public class Cars_again {
    public static void main(String[] args){

        CarstoDrive car1=new CarstoDrive("Mustang","Black");
        CarstoDrive car2=new CarstoDrive("Maruti","Red");
        CarstoDrive car3=new CarstoDrive("Honda","Golden");

        CarstoDrive[] cars={car1,car2,car3};

        for(CarstoDrive car:cars){
            car.carDrive();
        }
    }

}

class CarstoDrive{

    String Carmodel;
    String Color;
    CarstoDrive(String carmodel,String color){

        this.Carmodel=carmodel;
        this.Color=color;

    }

    void carDrive(){
        System.out.println("You Drived the "+this.Color +" "+this.Carmodel);
    }
}
