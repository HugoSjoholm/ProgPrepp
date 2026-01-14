import java.awt.Color;

public class PolkaDotsPart2 {
    public static void main(String[] args) {
        //This is a fortsättning på Part1. This will build on to Part1. 
        
        int n = 10; //ammount of circles;

        Circle[] allDots = new Circle[n];


        for (int i = 0; i < n; i++) {
            double r = Math.random() * 0.1;
            float x = (float) (Math.random() * 0.8 + 0.1);
            float y = (float) (Math.random() * 0.8 + 0.1);

            Color col = new Color(Color.HSBtoRGB((float) Math.random(), 1f, 1f));

            Circle dot = new Circle(r, new Cordinate2D(x, y), col);
            allDots[i] = dot;

            dot.draw();
        }

        int time = 0;
        while (true) {
            for (int i = 0; i < allDots.length; i++) {
                //allDots[i].color.getHSBColor(n, time, i)
                Color rainbowC = Color.getHSBColor((time%360)/360f, 1f, 1f);
                
                allDots[i].color = rainbowC;
                //allDots[i].center = new Cordinate2D(allDots[i].center.x + 0.01f, allDots[i].center.y + 0.01f);
                allDots[i].draw();
            }
        
            time++;
        }


    }

}
