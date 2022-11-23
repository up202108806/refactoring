package pt.up.fe.ldts.example5;

public class TurtleSouth extends TurtleState {
    public void moveForward(){
        turtle.setRow(turtle.getRow()+1);
    }
    public void rotateRight(){
        turtle.setDirection(new TurtleWest());
    }
    public void rotateLeft(){
        turtle.setDirection(new TurtleEast());
    }
}

