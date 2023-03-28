package test6;

public class Complex {
    double real;
   double imaginary;
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        System.out.println("复数: " + real + " + " + imaginary + "i";
    }
    void ComplexSum(Complex c1, Complex c2) {
        real = c1.real + c2.real;
        imaginary = c1.imaginary + c2.imaginary;
        System.out.println("复数和: " + real + " + " + imaginary + "i");
    }
    void ComplexDifference(Complex c1, Complex c2) {
        real = c1.real - c2.real;
        imaginary = c1.imaginary - c2.imaginary;
        System.out.println("复数差: " + real + " + " + imaginary + "i");
    }
    void ComplexProduct(Complex c1, Complex c2) {
        real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        imaginary = c1.real * c2.imaginary + c1.imaginary * c2.real;
        System.out.println("复数乘积: " + real + " + " + imaginary + "i");
    }
    boolean ComplexEqual(Complex c1, Complex c2) {
        if (c1.real == c2.real && c1.imaginary == c2.imaginary) {
            System.out.println("相等");
            return true;
        } else {
            System.out.println("不相等");
            return false;
        }
    }

    public static void main(String[]args){
        Complex c1=new Complex(2,3);
        Complex c2=new Complex(2,4);
        Complex c3=new Complex(3,4);
        Complex c4=new Complex(3,4);
        c1.ComplexEqual(c1,c2);//等于
        c2.ComplexSum(c1,c2);//和
        c3.ComplexDifference(c1,c4);//和
        c4.ComplexProduct(c1,c2);//乘积
    }
}
