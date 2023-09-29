package by.teachmeskills.robot.hands;

import by.teachmeskills.robot.service.IHand;

public class SamsungHands implements IHand {

    private int price;

    public SamsungHands(int price) {
        this.price = price;
    }

    public SamsungHands() {
    }

    @Override
    public void upHand() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
