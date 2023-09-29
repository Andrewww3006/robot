package by.teachmeskills.robot.legs;

public class SamsungLegs implements ILeg{

    private int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    public SamsungLegs() {
    }
    @Override
    public void step() {
        System.out.println("Робот сделал шаг ногой Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
