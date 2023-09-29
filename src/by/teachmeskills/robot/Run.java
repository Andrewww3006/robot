package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SonyHands;
import by.teachmeskills.robot.hands.ToshibaHands;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLegs;
import by.teachmeskills.robot.legs.SonyLegs;

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

        IHead toshibaHead = new SonyHead(15000);
        IHand sonyHand = new SonyHands(1000);
        ILeg  sonyLeg = new SonyLegs(700);


        Robot robot1 = new Robot(sonyHead, sonyHand, );


    }
}
