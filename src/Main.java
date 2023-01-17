public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 80;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется " + deliveryDays + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays++;
            System.out.println("На доставку потребуется " + deliveryDays + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("На доставку потребуется " + deliveryDays + " дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь, сезон зима");
                break;
            case 2:
                System.out.println("Февраль, сезон зима");
                break;
            case 3:
                System.out.println("Март, сезон весна");
                break;
            case 4:
                System.out.println("Апрель, сезон весна");
                break;
            case 5:
                System.out.println("Май, сезон весна");
                break;
            case 6:
                System.out.println("Июнь, сезон лето");
                break;
            case 7:
                System.out.println("Июль, сезон лето");
                break;
            case 8:
                System.out.println("Август, сезон лето");
                break;
            case 9:
                System.out.println("Сентябрь, сезон осень");
                break;
            case 10:
                System.out.println("Октябрь, сезон осень");
                break;
            case 11:
                System.out.println("Ноябрь, сезон осень");
                break;
            case 12:
                System.out.println("Декабрь, сезон зима");
                break;
            default:
                System.out.println("Такого месяца не существует.");

        }
    }
}