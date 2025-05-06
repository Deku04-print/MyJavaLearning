package Methods;

public class VarargsConcept {

    static float GetAve(float... varargs){
        float sum=0;

        for(float num:varargs){
            sum+=num;
        }return sum/varargs.length;
    }
    public static void main(String[] args){
        float avg=GetAve(23,56,57,45,34,23,23);
        float avg2=GetAve(23,56,334,23,23);
        System.out.println(avg);
        System.out.println(avg2);
    }
}
