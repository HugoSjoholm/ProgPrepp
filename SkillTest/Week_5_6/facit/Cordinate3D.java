public class Cordinate3D {
        float x;
        float y;
        float z;

        public Cordinate3D(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;

        }
        public String toString() {
            return "x:" + x + " y:" + y + " z:" + z;
        }
        public float[] toArray() {
            return new float[]{
                this.x,
                this.y,
                this.z
            };
        }
        public void add(Cordinate3D num) {
            this.x += num.x;
            this.y += num.y;
            this.z += num.z;

        }

    public static void main(String[] args) {
        Cordinate3D point = new Cordinate3D(100f, -100f, 50f);
        
        System.out.println(point);

        point.add(new Cordinate3D(100, 100, 100));

        System.out.println(point);
    }

}
