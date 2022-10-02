import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        isLeapYear(2016);

        System.out.println("Задание №2");
        checkAppVersion(1, 2000);

        System.out.println("Задание №3");
        System.out.println("Количество дней доставки = " + getDeliverDays(61));
    }

    public static void isLeapYear(int year) {
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " — не високосный год");
        } else {
            System.out.println(year + " — високосный год");
        }
    }

    public static void checkAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для iOS");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite-версию приложения для iOS");
        }
        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для Android");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite-версию приложения для Android");
        }
    }

    public static int getDeliverDays(int deliveryDistance) {
        int deliveryInterval = 40;
        int deliveryDays;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else {
            deliveryDays = ((((deliveryDistance - 20) / deliveryInterval) + 1 + 1));
        }
        return deliveryDays;
    }
}