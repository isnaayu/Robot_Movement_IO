import model.Robot;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/user/Enigma/Batch14/java_OOP/challenge_robot/src/resource/Tracer.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
        String lastLine = "";
        String currenLine;

        try {
//            bw.write("\nE,2,5");
//            bw.close();
            while ((currenLine = br.readLine()) != null){
                lastLine = currenLine;
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        String[] position = lastLine.split(",");
        System.out.println("Current Position = "+lastLine);

//        System.out.println(position[2]);



        Scanner input = new Scanner(System.in);
        String value, command;

//        System.out.print("Determine the initial position of the Robot = ");
//        value = input.next();

        System.out.print("enter command = ");
        command = input.next();

//        String[] position = value.split(",");

        String[] commands = command.split("");

        Robot robot = new Robot();
        robot.setCommands(commands);
        robot.setX(Integer.parseInt(position[1]));
        robot.setY(Integer.parseInt(position[2]));
        robot.setDirection(position[0]);
        robot.robotMovement(position[0], Integer.parseInt(position[1]) , Integer.parseInt(position[2]));


    }
}