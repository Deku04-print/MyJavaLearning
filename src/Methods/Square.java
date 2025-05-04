package Methods;

public class Square {

    static int Squarenum(int num){
        return num*num;
    }
    static String[] heros(){
        String[] superheros={"Spider Man","Iron Man","Hulk"};
        return superheros;
    }
    public static void main(String[] args) {
//        System.out.println("Square of 9 :"+Squarenum(9));
//        System.out.println("Square of 5 :"+Squarenum(5));

        String[] arr=heros();

        for(String heros:arr){
            System.out.println(heros);
            System.out.println("Hello Heros....");
        }

    }
}
