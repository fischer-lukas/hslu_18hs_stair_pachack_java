package ch.stair.hackday.packhack.player;

public class Coordinate {
    private int x;
    private int y;
    private int steps;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return x;
    }

    public void setY(int x) {
        this.x = x;
    }
    public int getSteps(){
        return steps;
    }
    public void setSteps(int steps){
        this.steps = steps;
    }
}
