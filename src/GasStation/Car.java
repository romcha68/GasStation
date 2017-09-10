package GasStation;

import java.util.Random;

/**
 * Created by aroma on 06.08.2017.
 */
public class Car {
    /**
     * Реализовать класс автомобиль, который имеет следующие арактеристики:
     * - Имя автомобиля
     * - Объем бензобака
     * - Средний расход бензина на 1 км
     * - Пробег
     * - Запас бензина в текущий момент времени (Рандом)
     * - Кол-во денег у водителя (Рандом)
     * Методы класса:
     * - Конструктор: заданы все параметры, нет последних двух параметров (помеченых Рандом)
     * - Узнать сколько заправить (на вход подается цена за литр бензина)
     * - Метод залить бензин (получить заданное кол-во бензина)
     * - Метод расчитаться за бензин (заплатить за заданное кол-во литров бензина)
     * - Метод проехать заданное кол-во километров или как можно больше
     * - Метод toString для вывода типа: "Автомобиль_1, Объем бензобака: 10 л., Расход на 1 км.: 2 л., Пробег: 50 км., Бензин: 5 л., Баланс: 50.75 грн."
     */

    private String name;
    private int v;
    private int rashod;
    private int probeg;
    private int zapas;
    private int money;

    public Car(String name, int v, int rashod, int probeg, int zapas, int money) {
        this.name = name;
        this.v = v;
        this.rashod = rashod;
        this.probeg = probeg;
        this.zapas = zapas;
        this.money = money;
    }

    public Car(String name, int v, int rashod, int probeg) {
        this.name = name;
        this.v = v;
        this.rashod = rashod;
        this.probeg = probeg;
        Random z = new Random();
        this.zapas = z.nextInt(v);
        this.money = z.nextInt(200);
    }

    public int skolykoZapravityBenzina(int cena) {
        int benzin = (v - zapas);
        for (int i = 0; i <= benzin; i++) {
            if ((benzin - i) * cena <= money) {
                return benzin;
            }
        }
        return 0;
    }

    public void zapravka(int litr) {
        zapas += litr;
    }

    public void raschet(int summa) {
        money -= summa;
    }

    public void move(int distans) {
        int max = zapas / rashod;
        for (int i = distans; i >= 0; i--) {
            if (i <= max) {
                probeg += i;
                zapas -= i * rashod;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return name + ", Объем бензобака: " + v + " л., Расход на 1 км.:" + rashod + " л., Пробег: " + probeg + " км., Бензин: " + zapas + " л., Баланс: " + money + " грн.";
    }
}