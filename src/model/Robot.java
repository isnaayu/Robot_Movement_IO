package model;

import util.Properties;

public class Robot implements Action {
    private String direction;
    private String[] commands;
    private int x;
    private int y;
    @Override
    public void robotMovement(String direction, int x, int y) {
        Properties direct = Properties.valueOf(direction);
        for (String c : commands){
            if (c.equalsIgnoreCase("A" ) && this.direction.equals(Properties.E.name())){
                this.x++;
                System.out.println(">"+c+" -> "+"( "+getX()+","+getY()+" )");
            } else if (c.equalsIgnoreCase("A" ) && this.direction.equals(Properties.W.name())) {
                this.x--;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )");
            } else if (c.equalsIgnoreCase("A" ) && this.direction.equals(Properties.N.name())) {
                this.y++;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )");
            } else if (c.equalsIgnoreCase("A" ) && this.direction.equals(Properties.S.name())) {
                this.y--;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )");
            } else if (c.equalsIgnoreCase("R" )) {
                this.direction = String.valueOf(direct.turnRight());
//                direct.turnRight();
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )");
            } else if (c.equalsIgnoreCase("L" )) {
                this.direction = String.valueOf(direct.turnLeft());
//                direct.turnLeft();
                System.out.println(">"+c+" ->"+"( "+getX()+" "+getY()+" )");
            }else {
                System.out.println("Invalid command !!");
            }
        }
    }

    public String[] getCommands() {
        return commands;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
