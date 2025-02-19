// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Rectangle{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        return (this.length*this.width);
    }
    public double perimeter(){
        return (2*(length+width));
    }

}
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(2.4);
        r.setWidth(3.0);
        System.out.println("The length and width of Rectangle given by us is "+r.getLength()+" "+r.getWidth());
        System.out.println("The area of the rectangle is "+r.area());
        System.out.println("The perimeter of the rectangle is "+r.perimeter());

    }
}