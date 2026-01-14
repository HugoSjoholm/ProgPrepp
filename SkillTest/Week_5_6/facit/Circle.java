import java.awt.Color;

public class Circle {
    //Define three variables, radius, center cordinate, color. This assumes Cordinate2D.java to be in the same folder. 
    double r; //radius
    Cordinate2D center;
    Color color;
    
    //this is a constructor. This is the method that "creates" the object. 
    public Circle(double r, Cordinate2D center, Color color) {
        this.r = r;
        this.center = center;
        this.color = color;
    }

    //make a method that will draw the circle with the correct radius and color. after the circle has been draw the pen- radius and color should be reset to their previous states/values
    //It's recomended to use StdDraw.point() for the drawing itself. 
    public void draw() {
        Color tmpC = StdDraw.getPenColor();
        double tmpR = StdDraw.getPenRadius();

        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(r);
        StdDraw.point(center.x, center.y);



        StdDraw.setPenColor(tmpC);
        StdDraw.setPenRadius(tmpR);

    }
    //make a method that can draw a lable/text for the circle. It's recomended to use StdDraw.text()
    public void drawLable(String lable) {
        StdDraw.text(center.x, center.y, lable);
    }
    
    public static void main(String[] args) {
        //Create two cricles, c1 and c2. they should have different values/attributes. 
        Circle c1 = new Circle(0.1, new Cordinate2D(0.5f, 0.5f), Color.red);
        Circle c2 = new Circle(0.05, new Cordinate2D(0.2f, 0.5f), Color.blue);

        //Draw c1 and it's lable
        c1.draw();
        c1.drawLable("c1");

        // Draw c2 and it's lable
        c2.draw();
        c2.drawLable("c2");

        //Change c1 in two ways, it's center position and some other aspect, like color or radius. 
        //Then draw c1 and a corresponding lable
        c1.r *= 2;
        c1.color = Color.blue;
        c1.center = new Cordinate2D(0.66f, 0.66f);
        c1.draw();
        c1.drawLable("c1");

        //This is for fun.
        c2.center = new Cordinate2D(0.2f, 0.2f);
        for (int i = 0; true; i++) { //for how long will this foor loop run? what is the condiftion that will determine if it should contine running?
            c2.color = new Color(Color.HSBtoRGB((i%360)/360f, 1f, 1f));
            c2.draw();
        }

    }    
}
