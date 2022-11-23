package pt.up.fe.ldts.example5;

public class TurtleNorth extends TurtleState{
    public void moveForward(){
        turtle.setRow(turtle.getRow()-1);
    }
    public void rotateRight(){
        TurtleState newState = new TurtleEast();
        newState.setTurtle(turtle);
        turtle.setDirection(newState);
    }
    public void rotateLeft(){
        TurtleState newState = new TurtleWest();
        newState.setTurtle(turtle);
        turtle.setDirection(newState);
    }
}
