package model;

import java.io.IOException;

public interface Action {
    public void robotMovement(String direction, int x, int y) throws IOException;
}
