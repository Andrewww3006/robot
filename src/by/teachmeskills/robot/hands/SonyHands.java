package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.service.IHand;

public class SonyHands implements IHand {
    private int price;

    public SonyHands(int price) {
        this.price = price;
    }

    public SonyHands() {
    }


    @Override
    public void upHand() {
        System.out.println("Робот поднял руку Sony");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
