package Methods;

public class CallStack {
    public static void main(String[] args){
        int x = 10;
        System.out.println("We are inside The main() -- >Value of x::>>"+x);
        first();
    }
    static void first() {
        int x = 20;
        System.out.println("We are inside The main() -- >Value of x::>>" + x);
        second();
    }
        static void second() {
            int x = 30;
            System.out.println("We are inside The main() -- >Value of x::>>" + x);
            third();
    }
        static void third(){
        int x = 40;
        System.out.println("We are inside The main() -- >Value of x::>>"+x);
    }

    }



