package Assignment2.Q5;
import Assignment2.Q4.Image;

import java.util.ArrayList;


public class ImageLibrary {
    ArrayList<Image> al = new ArrayList<>();
    public void insert(Image img){
        al.add(img);
        System.out.println("image added successfully");
    }
    public void search(String colorCode){
        boolean b = false;
        for(Image e:al){
            if(e.getColorCode()==colorCode){
                System.out.println("Color code matches");
                System.out.println(e.toString() +" is your required Image");
                b = true;
                break;
            }
        }
        if(!b){
            System.out.println("Not found");

        }
    }

    public Image getImage(String colorCode){
        boolean b = false;
        Image a = new Image();
        for(Image e:al){
            if(e.getColorCode()==colorCode){
                a = e;
                b = true;
                break;
            }
        }
        if(!b){
           return null;

        }
        return a;

    }




}
