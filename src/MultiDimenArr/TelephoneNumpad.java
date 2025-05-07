package MultiDimenArr;

public class TelephoneNumpad {

    public static void main(String[] args){

        char[][] Telephone = {  {'1','2','3'},
                                {'4','5','6'},
                                {'7','8','9'},
                                {'*','0','#'}};

        for (char[] rows:Telephone){

            for (char num : rows){
                System.out.print(num);
            }
            System.out.println(" ");
        }
    }
}
