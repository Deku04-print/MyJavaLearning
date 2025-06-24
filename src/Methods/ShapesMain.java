package Methods;

import java.awt.*;

public class ShapesMain {

    // abstract = Used to define abstract classes and methods.
    //                   Abstraction is the process of hiding implementation details
    //                   and showing only the essential features.
    //                   Abstract classes CAN'T be instantiated directly.
    //                   Can contain 'abstract' methods (which must be implemented)
    //                   Can contain 'concrete' methods (which are inherited)


    public static void main(String[] args){

        //Shapes shape=new Shapes();//'Shapes' is abstract; cannot be instantiated

    }
}

abstract class Shapes{
    abstract double area();//ABSTRACT

    void display(){//CONCRETE
        System.out.println("This is a Shape....!!");
    }

}
class Rectangle extends Shapes{
    double length;
    double width;

    Rectangle(double length , double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double area(){
        return length*width;
    }
}

class Triangle extends Shapes{

    double height;
    double base;

    Triangle(double height , double base){
        this.height=height;
        this.base=base;
    }
    @Override
    double area(){
        return base*height*0.5;
    }
}
class Circle extends Shapes{

    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double area(){
        return radius*radius*Math.PI;
    }
}
