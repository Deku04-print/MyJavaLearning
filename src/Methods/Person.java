package Methods;

public class Person {

    protected String name;
    protected String lastname;

    Person(String Name, String Lastname) {
        this.name = Name;
        this.lastname = Lastname;

    }
    void showInfo() {
        System.out.println("Person : " + this.name + " " + this.lastname);
    }
    public static void main(String[] args) {

        Student st1 = new Student("Harry", "Portar", 9.8);
        Student st2 = new Student("John", "Cena", 9);
        Person per1 = new Person("Tom", "Riddle");
        Person per2 = new Person("Omni", "<Man>");
        Teachers teach1 = new Teachers("Albus", "Dumbledore", 50000);
        Teachers teach2 = new Teachers("Issac", "Newton", 6000);

        st1.showInfo();
        st2.showInfo();
        st1.showInfo();
        st2.showInfo();
        per1.showInfo();
        per2.showInfo();
        teach1.showInfo();
        teach2.showInfo();
        teach1.showInfo();
        teach2.showInfo();

    }
}

class Student extends Person{

    private double gpa;

    Student(String Name, String Lastname,double Gpa ){
        super(Name,Lastname);
        this.gpa=Gpa;

    }
    @Override
    void showInfo(){
        System.out.println("Student Info :"+this.name+ " "+this.lastname+" "+this.gpa);
    }
}

class Teachers extends Person{

    private int Salary;
    Teachers(String Name, String Lastname,int Sal){

        super(Name,Lastname);
        this.Salary=Sal;

    }

    @Override
    void showInfo() {
        System.out.println("Teacher Info :" +this.name+ " "+this.lastname+" "+this.Salary);

    }

}