package Assignment2.Q4;

public class Q4_main {
    public static void main(String[] args) {
        Image i = new Image();
        //here default is 25,25 4545R
        System.out.println("For Default");
        System.out.println(i.getImageheight()+" is the image height");
        System.out.println(i.getImageWidth() +" is the image width");
        System.out.println(i.getColorCode()+" is the color code");
        System.out.println("The to string value is "+i.toString());

        Image i2 = new Image(45,67,"4567RT2");
        System.out.println("For parameterized constructure ");
        System.out.println(i2.getImageheight()+" is the image height");
        System.out.println(i2.getImageWidth() +" is the image width");
        System.out.println(i2.getColorCode()+" is the color code");
        System.out.println("The to string value is "+i2.toString());


    }
}
