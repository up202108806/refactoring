package pt.up.fe.ldts.example5;

public class TurtleNorth extends TurtleState{
    public void moveForward(){
        turtle.setRow(turtle.getRow()-1);
    }
    public void rotateRight(){
        turtle.setDirection(new TurtleEast());
    }
    public void rotateLeft(){
        turtle.setDirection(new TurtleWest());
    }
}
