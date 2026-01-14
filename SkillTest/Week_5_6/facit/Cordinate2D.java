public class Cordinate2D {
    float x;
    float y;
    
    public Cordinate2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Cordinate2D point = new Cordinate2D( 6.7f, 6.9f);
        
        System.out.println(point.x);
    }
}
