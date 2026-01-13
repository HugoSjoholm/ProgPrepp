public class ComplexNum {
    private float re;
    private float im;

    private float abs;
    
    //constructors
    public ComplexNum(float re, float im) { //constructor for two floats, real part and imaginary part
        this.re = re;
        this.im = im;
    }
    public ComplexNum(float re) {// constructor for one floats, real part
        this.re = re;

    }

    public ComplexNum(int re, int im) { // constructor for two ints, real part and imaginary part
        this.re = re;
        this.im = im;
    }
    public ComplexNum(int re) {// constructor for one int, real part
        this.re = re;

    }



    public float getReal() {
        return re;
    }
    public void setReal(float real) {
        re = real;

        // update absolute
        calculateAbsolute();
    }
    
    public float getImaginary() {
        return im;
    }
    public void setImaginary(float imag) {
        im = imag;

        //update absolute
        calculateAbsolute();
    }


    public float getAbsolute() {
        return abs;
    }
    private void calculateAbsolute() {
        double d = (Math.pow(re, 2) + Math.pow(im, 2));
        d = Math.sqrt(d);

        abs = (float)d;
    }

    public String toString() {
        return re + "+" + im + "i";
    }


}