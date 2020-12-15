public class MyPoint {
    public int x;
    public int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
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
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //setting value of XY
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    //getting value of XY
    public int[] getXY(){
        int[] XY = {x,y};
        return XY;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);
    }

    public double distance(int x, int y){
        double dist = 0.0;
        double dx = (this.x - x);
        double dy = (this.y - y);
        dist = Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
        return dist;
    }

    public double distance(MyPoint another){
        double dist = 0.0;
        dist = Math.sqrt(Math.pow((another.x-x),2)+Math.pow((another.y-y),2));
        return dist;
    }

    public double distance(){
        double dist = 0.0;
        double dx = (this.x - 0);
        double dy = (this.y - 0);
        dist = Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
        return dist;
    }

}
