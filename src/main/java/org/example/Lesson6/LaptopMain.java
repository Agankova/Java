package org.example.Lesson6;
import java.util.*;

public class LaptopMain {
    public static void main (String[] args) {
        Laptop laptop1 = new Laptop(Breand.APPLE, Color.BLACK, Country.USA);
        Laptop laptop2 = new Laptop(Breand.HP, Color.GREY, Country.CHINA);
        Laptop laptop3 = new Laptop(Breand.ACER, Color.RED, Country.SOUTHKOREA);

        Set<Laptop> laptopList = new HashSet<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "Вывести все ноутбуки");
        criteria.put(2, "Бренд");
        criteria.put(3, "Цвет");
        criteria.put(4, "Страна");

        Map<Integer, Breand> brands = new HashMap<>();
        int counter = 1;
        for (Breand br : Breand.values()) {
            brands.put(counter++, br);
        }

        Map<Integer, Color> allColors = new HashMap<>();
        counter = 1;
        for (Color cl : Color.values()) {
            allColors.put(counter++, cl);
        }
        Map<Integer, Country> countrys = new HashMap<>();
        counter = 1;
        for (Country cl : Country.values()) {
            countrys.put(counter++, cl);
        }


        System.out.println("Раздел ноутбуков. \n" +
                "Воспользуйтесь фильтром, введя цифру:");
        System.out.println(criteria);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру: ");
        int userCriteria = scanner.nextInt();
        switch (userCriteria) {
            case 1 -> {
                System.out.println("Список ноутбуков: \n");
                for (Laptop model : laptopList) {
                    System.out.println(model);
                }
            }
            case 2 -> {
                System.out.println("Название бренда?\nВведите цифру:");
                System.out.println(brands);
                int userBreand = scanner.nextInt();
                switch (userBreand) {
                    case 1 -> {
                        for (Laptop model : laptopList) {
                            if (model.getBreand() == Breand.ACER) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 2 -> {
                        for (Laptop model : laptopList) {
                            if (model.getBreand() == Breand.APPLE) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 3 -> {
                        for (Laptop model : laptopList) {
                            if (model.getBreand() == Breand.HP) {
                                System.out.println(model);
                            }
                        }
                    }
                    default -> System.out.println("Нет такого номера.");
                }
            }
            case 3 -> {
                System.out.println("Выберите цвет.\nВведите цифру:");
                System.out.println(allColors);
                int userColor = scanner.nextInt();
                switch (userColor) {
                    case 1 -> {
                        for (Laptop model : laptopList) {
                            if (model.getColor() == Color.BLACK) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 2 -> {
                        for (Laptop model : laptopList) {
                            if (model.getColor() == Color.WHITE) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 3 -> {
                        for (Laptop model : laptopList) {
                            if (model.getColor() == Color.RED) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 4 -> {
                        for (Laptop model : laptopList) {
                            if (model.getColor() == Color.GREY) {
                                System.out.println(model);
                            }
                        }
                    }
                    default -> System.out.println("Нет такого номера.");
                }
            }
            case 4 -> {
                System.out.println("Выберите страну.\nВведите цифру:");
                System.out.println(countrys);
                int userCountry = scanner.nextInt();
                switch (userCountry) {
                    case 1 -> {
                        for (Laptop model : laptopList) {
                            if (model.getCountry() == Country.USA) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 2 -> {
                        for (Laptop model : laptopList) {
                            if (model.getCountry() == Country.SOUTHKOREA) {
                                System.out.println(model);
                            }
                        }
                    }
                    case 4 -> {
                        for (Laptop model : laptopList) {
                            if (model.getCountry() == Country.CHINA) {
                                System.out.println(model);
                            }
                        }
                    }
                    default -> System.out.println("Нет такого номера.");
                }
            }
            default -> System.out.println("Введен некорректный номер критерия.");
        }
    }
}

}
