package Methods;

public class OverLoad {
    static int add(int a , int b){
        System.out.println("Inside the first add Method -->");
        return a+b;
    }
    static String add(String a,String b){
        System.out.println("We are running the String addition method -->");
        return a + b;

    }

    static String add(String a,int b){
        System.out.println("The Int & String Addition method is Running Now -->");
        return a + b;
    }

    public static void main(String[] args){
        System.out.println(add(6,8));
        System.out.println(add("Harsh ","Dabhade"));
        System.out.println(add("Harsh",4));
    }
}
