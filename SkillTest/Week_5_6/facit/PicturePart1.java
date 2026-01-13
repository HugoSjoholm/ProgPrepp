import java.awt.Color;
public class PicturePart1 {
    public static void main(String[] args) {
        //Make a picture that has a seize of 600 x 400 and then show it. 
        Picture pic = new Picture(600, 400);
        pic.show();

        for (int x = 0; x < pic.width(); x++) {
            for (int y = 0; y < pic.height(); y++) {
                pic.set(x, y, Color.red);
            }
        }
    }
}
