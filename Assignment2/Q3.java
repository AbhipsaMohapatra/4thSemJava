package Assignment2;
class Point{
    int X;
    int Y;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    Point(int x, int y){
        this.X = x;
        this.Y = y;
    }
    Point(Point p){
        this.X = p.X;
        this.Y = p.Y;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Point p = new Point(4,6);
        System.out.println("the initial point X is "+p.getX());
        System.out.println("the initial point Y is "+p.getY());
        Point p1 = new Point(p);
        System.out.println("the copied point X is "+p.getX());
        System.out.println("the copied point Y is "+p.getY());
        p.setX(34);
        System.out.println("After change in p X equlas "+p.getX());
        System.out.println("Aftter change in p X in p1 equals "+p1.getX());


    }
}
