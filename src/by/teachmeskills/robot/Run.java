package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHands;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.legs.SamsungLegs;
import by.teachmeskills.robot.service.IHand;
import by.teachmeskills.robot.hands.SonyHands;
import by.teachmeskills.robot.hands.ToshibaHands;
import by.teachmeskills.robot.service.IHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.service.ILeg;
import by.teachmeskills.robot.legs.SonyLegs;
import by.teachmeskills.robot.legs.ToshibaLegs;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHead sonyHead = new SonyHead(15000);
        IHand sonyHand = new SonyHands(1000);
        ILeg  sonyLeg = new SonyLegs(700);

        IHead toshibaHead = new ToshibaHead(17500);
        IHand toshibaHand = new ToshibaHands(800);
        ILeg  toshibaLeg = new ToshibaLegs(650);

        IHead samsungHead = new SamsungHead(18000);
        IHand samsungHand = new SamsungHands(760);
        ILeg  samsungLeg = new SamsungLegs(620);


        Robot robot1 = new Robot("robot1",sonyHead, toshibaHand, samsungLeg);
        Robot robot2 = new Robot("robot2",toshibaHead, samsungHand, toshibaLeg);
        Robot robot3 = new Robot("robot3",samsungHead,sonyHand,sonyLeg);

        System.out.println(robot1.getPrice());
        System.out.println(robot2.getPrice());
        System.out.println(robot3.getPrice());
        robot2.action();

        ArrayList<Robot> robots = new ArrayList<Robot>();
        robots.add(robot1);
        robots.add(robot2);
        robots.add(robot3);

        robot1.count(robots);



    }
}
