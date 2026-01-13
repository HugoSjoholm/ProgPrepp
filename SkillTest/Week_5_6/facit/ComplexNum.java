public class ComplexNum {
    private float re;
    private float im;
    
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
    }
    
    public float getImaginary() {
        return im;
    }
    public void setImaginary(float imag) {
        im = imag;
    }

    public float getAbsolute() {
        double d = (Math.pow(re, 2) + Math.pow(im, 2));
        d = Math.sqrt(d);

        return (float) d;
    }

    public ComplexNum getConjugate() {
        return new ComplexNum(re, im * -1);
    }

    public String toString() {
        if (im >= 0) { //if posetive, print with a +. otherwise it's negative, so add a - täcken
            return re + " + " + Math.abs(im) + "i";
        }
        else {
            return re + " - " + Math.abs(im) + "i";
        }
    }

}