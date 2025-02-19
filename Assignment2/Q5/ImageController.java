package Assignment2.Q5;
import Assignment2.Q4.Image;


public class ImageController {
    public static void main(String[] args) {
        Image i1 = new Image(45,67,"RI45678");
        Image i2 = new Image(34,78,"RT3456");
        ImageLibrary lib = new ImageLibrary();
        lib.insert(i1);
        lib.insert(i2);
        lib.search("RI45678");
        Image i = lib.getImage("RT34568");
        if(i==null){
            System.out.println("No such image found");
        }
        else{
            System.out.println(i.toString());
        }

    }
}
