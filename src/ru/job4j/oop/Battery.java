package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(5);
        Battery secondBattery = new Battery(10);
        firstBattery.exchange(secondBattery);
        System.out.println("second " + secondBattery.load);
        System.out.println("first " + firstBattery.load);
    }
}
