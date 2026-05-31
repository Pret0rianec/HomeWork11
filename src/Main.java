import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("   Task_1");
        int checkTargetYear = 2021;
        if (checkLeapYear(checkTargetYear)) {
            System.out.println(checkTargetYear + " год является високосным");
        } else {
            System.out.println(checkTargetYear + " год не является високосным");
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year > 1584) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void task2() {
        System.out.println("   Task_2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        suggestAppVersion(clientOS, clientDeviceYear);
    }

    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        int targetYear = LocalDate.now().getYear();
        String osName;
        boolean isLightVersion;

        if (clientOS == 0) {
            osName = "iOS";
        } else {
            osName = "Android";
        }

        isLightVersion = clientDeviceYear < targetYear;

        if (isLightVersion) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + osName + " по ссылке");
        }
    }

    public static void task3() {
        System.out.println("   Task_3");
        int deliveryDistance = 95;
        calculateDelivDay(deliveryDistance);
    }

    public static void calculateDelivDay(int deliveryDistance) {
        int delivDay;
        if (deliveryDistance <= 20) {
            delivDay = 1;
            System.out.println(delivDay);
        } else if (deliveryDistance <= 60) {
            delivDay = 2;
            System.out.println(delivDay);
        } else if (deliveryDistance <= 100) {
            delivDay = 3;
            System.out.println(delivDay);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }
}