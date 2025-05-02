package StringOperations;

public class StringBuild {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("I love Programming...!!");

        sb.append("and Tea..!!");
        System.out.println(sb);

        sb.replace(7,17,"Gaming.");
        System.out.println(sb);

        sb.delete(0,6);
        System.out.println(sb);

        sb.insert(0,"I hate");
        System.out.println(sb);


        String str1=sb.toString();
        System.out.println(sb);
    }
}
