// Класс "Товар"
class Товар {
    // Поля класса
    private String название;
    private String датаПроизводства;
    private String производитель;
    private String странаПроисхождения;
    private double цена;
    private boolean забронирован;

    // Конструктор класса
    public Товар(String название, String датаПроизводства, String производитель,
                 String странаПроисхождения, double цена, boolean забронирован) {
        this.название = название;
        this.датаПроизводства = датаПроизводства;
        this.производитель = производитель;
        this.странаПроисхождения = странаПроисхождения;
        this.цена = цена;
        this.забронирован = забронирован;
    }

    // Метод для вывода информации о товаре
    public void вывестиИнформацию() {
        System.out.println("Название: " + название);
        System.out.println("Дата производства: " + датаПроизводства);
        System.out.println("Производитель: " + производитель);
        System.out.println("Страна происхождения: " + странаПроисхождения);
        System.out.println("Цена: " + цена);
        System.out.println("Состояние бронирования: " + (забронирован ? "Забронирован" : "Не забронирован"));
    }
}

// Класс "Парк" с внутренним классом "Аттракцион"
class Парк {
    // Внутренний класс для хранения информации об аттракционах
    class Аттракцион {
        private String название;
        private String времяРаботы;
        private double стоимость;

        // Конструктор внутреннего класса
        public Аттракцион(String название, String времяРаботы, double стоимость) {
            this.название = название;
            this.времяРаботы = времяРаботы;
            this.стоимость = стоимость;
        }

        // Метод для вывода информации об аттракционе
        public void вывестиИнформацию() {
            System.out.println("Аттракцион: " + название);
            System.out.println("Время работы: " + времяРаботы);
            System.out.println("Стоимость: " + стоимость);
        }
    }
}

// Основной класс программы
public class Main {
    public static void main(String[] args) {
        // Задача 1: Создание объекта товара и вывод информации
        Товар товар1 = new Товар("Ноутбук", "2023-10-01", "Dell", "США", 1500.0, false);
        товар1.вывестиИнформацию();
        System.out.println();

        // Задача 2: Создание массива из 5 товаров
        Товар[] массивТоваров = new Товар[5];
        массивТоваров[0] = new Товар("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        массивТоваров[1] = new Товар("iPhone 15", "15.09.2023", "Apple", "USA", 1299, false);
        массивТоваров[2] = new Товар("Xiaomi Mi 12", "20.03.2023", "Xiaomi", "China", 799, true);
        массивТоваров[3] = new Товар("Google Pixel 7", "10.10.2022", "Google", "USA", 899, false);
        массивТоваров[4] = new Товар("OnePlus 10 Pro", "05.01.2023", "OnePlus", "China", 999, true);

        // Вывод информации о всех товарах в массиве
        for (Товар товар : массивТоваров) {
            товар.вывестиИнформацию();
            System.out.println();
        }

        // Задача 3: Создание объекта парка и аттракционов
        Парк парк = new Парк();
        Парк.Аттракцион аттракцион1 = парк.new Аттракцион("Колесо обозрения", "10:00 - 22:00", 5.0);
        Парк.Аттракцион аттракцион2 = парк.new Аттракцион("Американские горки", "11:00 - 20:00", 10.0);

        // Вывод информации об аттракционах
        аттракцион1.вывестиИнформацию();
        System.out.println();
        аттракцион2.вывестиИнформацию();
    }
}