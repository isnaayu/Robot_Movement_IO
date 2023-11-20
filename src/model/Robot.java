package model;

import util.Direction;

import java.io.IOException;

public class Robot implements Action {
    RobotTracer robotTracer = new RobotTracer();
    private String direction;
    private String[] commands;
    private int x;
    private int y;

    public Robot() throws IOException {
    }

    @Override
    public void robotMovement(String direction, int x, int y) throws IOException {
        Direction direct = Direction.valueOf(direction);
        for (String c : commands){
            if (c.equalsIgnoreCase("A" ) && this.direction.equals(Direction.E.name())){
                this.x++;
                System.out.println(">"+c+" -> "+"( "+getX()+","+getY()+" )");
                robotTracer.writeTracer(this.direction,this.x,this.y);
            } else if (c.equalsIgnoreCase("A" ) && this.direction.equals(Direction.W.name())) {
                this.x--;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )");
                robotTracer.writeTracer(this.direction,this.x,this.y);
            } else if (c.equalsIgnoreCase("A" ) && this.direction.equals(Direction.N.name())) {
                this.y++;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )");
                robotTracer.writeTracer(this.direction,this.x,this.y);
            } else if (c.equalsIgnoreCase("A" ) && this.direction.equals(Direction.S.name())) {
                this.y--;
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )");
                robotTracer.writeTracer(this.direction,this.x,this.y);
            } else if (c.equalsIgnoreCase("R" )) {
                this.direction = String.valueOf(direct.turnRight());
                System.out.println(">"+c+" ->"+"( "+getX()+","+getY()+" )");
                robotTracer.writeTracer(this.direction,this.x,this.y);
            } else if (c.equalsIgnoreCase("L" )) {
                this.direction = String.valueOf(direct.turnLeft());
                System.out.println(">"+c+" ->"+"( "+getX()+" "+getY()+" )");
                robotTracer.writeTracer(this.direction,this.x,this.y);
            }else {
                System.out.println("Invalid command !!");
            }
        }
        robotTracer.cleanUp();
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
