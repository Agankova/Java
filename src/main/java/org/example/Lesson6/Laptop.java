package org.example.Lesson6;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков (Set).
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//отвечающие фильтру. Критерии фильтрации можно хранить в Map или в Сет. Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - цвет
//2 - бренд

import lombok.Getter;
import java.util.Objects;

@Getter
public class Laptop {
    Breand breand;
    Color color;
    Country country;

    public Laptop(Breand breand, Color color, Country country) {
        this.breand = breand;
        this.color = color;
        this.country = country;
    }

    public Laptop(Breand breand, Country country, Color color) {
        this.breand = breand;
        this.country = country;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Laptop {" +
                "brand=" + breand +
                ", color=" + color +
                ", country=" + country +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return breand == laptop.breand && color == laptop.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(breand, color);
    }
}
