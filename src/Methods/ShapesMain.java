package Methods;

import StringOperations.ReplaceChar;

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
        Rectangle rec1=new Rectangle(12.4,49.3);
        Rectangle rec2=new Rectangle(12.4,49.3);
        Triangle tri1=new Triangle(12.4,49.3);
        Triangle tri2=new Triangle(12.4,49.3);
        Circle cir1=new Circle(4);
        Circle cir2=new Circle(4);

        rec1.display();
        System.out.println(rec1.area());
//        tri1.display();
//        tri1.area();
//        cir1.display();
//        cir1.area();
//        rec2.display();
//        rec2.area();
//        tri2.display();
//        tri2.area();
//        cir2.display();
//        cir2.area();
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
