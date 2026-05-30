import java.time.LocalDate;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CheckAppVersion {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        suggestAppVersion(clientOS, clientDeviceYear);
    }

    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        int targetYear = LocalDate.now().getYear();
        if (clientDeviceYear < targetYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
}
