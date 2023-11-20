package util;

public enum Properties {
    N,
    E,
    S,
    W;

    private String direction;
    public String getDirection(){
        return direction;
    }


    public Properties turnRight(){
        return values()[(this.ordinal()+1)% values().length ];
    }
    public Properties turnLeft(){
        return values()[(this.ordinal()-1) % values().length ];
    }
}
