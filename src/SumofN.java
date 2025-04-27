import java.lang.*;
import java.util.*;

    public class SumofN {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a value :");
            long n=sc.nextLong();
            long sum=0;


            for(int i=0;i<=n;++i){
                    sum+=i;

            }
            System.out.print(sum);


        }
    }

