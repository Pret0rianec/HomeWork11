public class CheckDelivery {
    public static void main() {
        int deliveryDistance = 95;
        calculateDelivDay(deliveryDistance);
    }

    public static void calculateDelivDay(int deliveryDistance) {
        int delivDay;
        if (deliveryDistance <= 20) {
            delivDay = 1;
            System.out.println("На доставку потребуется дней: " + delivDay);
        } else if (deliveryDistance <= 60) {
            delivDay = 2;
            System.out.println("На доставку потребуется дней: " + delivDay);
        } else if (deliveryDistance <= 100) {
            delivDay = 3;
            System.out.println("На доставку потребуется дней: " + delivDay);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

}