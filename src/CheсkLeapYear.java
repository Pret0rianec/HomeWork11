//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CheсkLeapYear {
        public static int year = 2021;

    public static boolean chekleapYear() {
        return ((year > 1584 && year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        if (chekleapYear()) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}