import java.awt.Color;

public class PolkaDotsPart1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double r = Math.random()*0.1;
            float x = (float)(Math.random()*0.8 + 0.1);
            float y = (float)(Math.random()*0.8 + 0.1);

            Color col = new Color(Color.HSBtoRGB((float)Math.random(), 1f, 1f));

            Circle dot = new Circle(r, new Cordinate2D(x, y), col);
            dot.draw();
        }
    }
}
