package by.teachmeskills.robot.hands;

public class ToshibaHands implements IHand{
    private int price;

    public ToshibaHands(int price) {
        this.price = price;
    }

    public ToshibaHands() {
    }

    @Override
    public void upHand() {
        System.out.println("Робот поднял руку от Toshiba");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
