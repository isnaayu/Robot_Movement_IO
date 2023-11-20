import model.Robot;
import model.RobotTracer;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        RobotTracer robotTracer = new RobotTracer();
        robotTracer.readTracer();
        String lastLine = robotTracer.getLastLine();

        String[] position = lastLine.split(",");
        System.out.println("Current Position = "+lastLine);

        Scanner input = new Scanner(System.in);
        String command;

        System.out.print("enter command = ");
        command = input.next();

        String[] commands = command.split("");

        Robot robot = new Robot();
        robot.setCommands(commands);
        robot.setX(Integer.parseInt(position[1]));
        robot.setY(Integer.parseInt(position[2]));
        robot.setDirection(position[0]);
        robot.robotMovement(position[0], Integer.parseInt(position[1]) , Integer.parseInt(position[2]));


    }
}