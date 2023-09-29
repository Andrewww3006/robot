package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.service.ILeg;

public class SonyLegs implements ILeg {

    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    public SonyLegs() {
    }

    @Override
    public void step() {
        System.out.println("Робот сделал шаг ногой Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
