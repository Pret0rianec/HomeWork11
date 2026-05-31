//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CheсkLeapYear {
    public static int checkTargetYear = 2021;

    public static boolean chekleapYear() {
        return ((checkTargetYear > 1584 && checkTargetYear % 4 == 0 && checkTargetYear % 100 != 0) || (checkTargetYear % 400 == 0));
    }

    public static void main(String[] args) {
        if (chekleapYear()) {
            System.out.println(checkTargetYear + " год является високосным");
        } else {
            System.out.println(checkTargetYear + " год не является високосным");
        }
    }
}