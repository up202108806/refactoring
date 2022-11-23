package pt.up.fe.ldts.example5;

public class TurtleEast extends TurtleState {
    public void moveForward(){
        turtle.setColumn(turtle.getColumn()+1);
    }
    public void rotateRight(){
        TurtleState newState = new TurtleSouth();
        newState.setTurtle(turtle);
        turtle.setDirection(newState);
    }
    public void rotateLeft(){
        TurtleState newState = new TurtleNorth();
        newState.setTurtle(turtle);
        turtle.setDirection(newState);
    }
}
