package by.teachmeskills.robot;

import by.teachmeskills.robot.service.IHand;
import by.teachmeskills.robot.service.IHead;
import by.teachmeskills.robot.service.ILeg;
import by.teachmeskills.robot.service.IRobot;

import java.util.ArrayList;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;
    private String name;

    public Robot(String name, IHead head, IHand hand, ILeg leg) {
        this.name = name;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        System.out.println(name + ":");
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }

    public void count(ArrayList<Robot> robots)
    {
        double maxPrice = robots.get(0).getPrice();
        int maxIndex = robots.indexOf(robots.get(0));
        for (Robot x: robots) {
            if (x.getPrice() >= maxPrice) {
                maxPrice = x.getPrice();
                maxIndex = robots.indexOf(x);
            }
        }
        System.out.println(robots.get(maxIndex).name + " самый дорогой, его цена = " + maxPrice + " $");
    }



}
