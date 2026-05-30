//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CheсkLeapYear {
    public static int targetYear = 2021;

    public static boolean chekleapYear() {
        return ((targetYear > 1584 && targetYear % 4 == 0 && targetYear % 100 != 0) || (targetYear % 400 == 0));
    }

    public static void main(String[] args) {
        if (chekleapYear()) {
            System.out.println(targetYear + " год является високосным");
        } else {
            System.out.println(targetYear + " год не является високосным");
        }
    }
}