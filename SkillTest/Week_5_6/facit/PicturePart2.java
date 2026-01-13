import java.awt.Color;
public class PicturePart2 {
    public static void main(String[] args) {
        Picture pic = new Picture(600, 400);

        for (int x = 0; x < pic.width(); x++) {
            for (int y = 0; y < pic.height(); y++) {
                
                if (x < pic.width()/2) {
                    pic.set(x, y, Color.red);
                }
                else {
                    pic.set(x, y, Color.blue);
                }
                
            }
        }
        pic.show();

    }
}
