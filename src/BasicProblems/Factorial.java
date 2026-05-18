package BasicProblems;

public class Factorial {

    public static void main(String[] args){

        System.out.println(factorial(5));

    }

//    public static int factorial(int n){
//        int res =1;
//        for (int i=1;i<=n;i++){
//            res = res*i;
//        }
//        return res;
//    }

    public static int factorial(int n){

        if (n == 0) return 1;
        return n*factorial(n-1);

    }
}
