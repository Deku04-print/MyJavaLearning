package PracticeUntilSuccess;

public class Inherit {
    public static void main(String[] args){

        Model mycar=new Model("Mustang","MH03BN8285");

        mycar.Display();
        mycar.honk();

    }
}

class Vehicle{
    protected String CarModel;

    void Display(){
        System.out.println("The Name of the Model :"+CarModel);
    }
    void honk(){
        System.out.println("Peeeep peeeeep");
    }
    Vehicle(String carModel){
        this.CarModel=carModel;

    }
}

class Model extends Vehicle{

    protected String NumPlate;

    Model(String carModel,String numPlate){
        super(carModel);
        this.NumPlate=numPlate;


    }
     void Display(){
        System.out.println("CarModel is :"+this.CarModel+"\nNumplate "+this.NumPlate);
    }

}
