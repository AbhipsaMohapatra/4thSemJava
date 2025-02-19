package Assignment2.Q4;

public class Image {

    int imageWidth;
    int imageheight;
    String colorCode;

    public Image(int imageWidth, int imageheight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageheight = imageheight;
        this.colorCode = colorCode;
    }
    public Image() {
        this.imageWidth = 25;
        this.imageheight = 25;
        this.colorCode = "4567R";
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageheight() {
        return imageheight;
    }

    public void setImageheight(int imageheight) {
        this.imageheight = imageheight;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String toString(){
        String str = "the height is "+this.imageheight+" "+"the width is "+this.imageWidth+" "+"the color code is "+this.colorCode;
        return str;
    }
}
