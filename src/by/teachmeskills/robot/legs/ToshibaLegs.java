package by.teachmeskills.robot.legs;

import by.teachmeskills.robot.service.ILeg;

public class ToshibaLegs implements ILeg {
    private int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    public ToshibaLegs() {
    }
    @Override
    public void step() {
        System.out.println("Робот сделал шаг ногой Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
