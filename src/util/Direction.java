package util;

public enum Direction {
    N,
    E,
    S,
    W;

    private String direction;
    public String getDirection(){
        return direction;
    }


    public Direction turnRight(){
        return values()[(this.ordinal()+1)% values().length ];
    }
    public Direction turnLeft(){
        return values()[(this.ordinal()-1) % values().length ];
    }
}
