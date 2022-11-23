package pt.up.fe.ldts.example5;

public class TurtleWest extends TurtleState {
    public void moveForward(){
        turtle.setColumn(turtle.getColumn()-1);
    }
    public void rotateRight(){
        TurtleState newState = new TurtleNorth();
        newState.setTurtle(turtle);
        turtle.setDirection(newState);
    }
    public void rotateLeft(){
        TurtleState newState = new TurtleSouth();
        newState.setTurtle(turtle);
        turtle.setDirection(newState);
    }
}

