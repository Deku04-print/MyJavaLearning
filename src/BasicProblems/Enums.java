package BasicProblems;

public class Enums {

    public enum EnumsVal {

        SUNDAY("sunday"),
        MONDAY("monday"),
        TUESDAY("tuesday"),
        WEDNESDAY("wednesday"),
        THURSDAY("thursday"),
        FRIDAY("friday"),
        SATURDAY("saturday");

        private String lower;

        EnumsVal(String lower) {
            this.lower = lower;
        }

        public String getDay() {
            return this.lower;
        }
    }

    public static void main(String[] args) {
        EnumsVal day = EnumsVal.MONDAY;

        System.out.println(day.getDay());
        System.out.println(EnumsVal.SATURDAY.getDay());
    }
}