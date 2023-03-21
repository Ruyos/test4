package test2;


abstract class Shape{
    public abstract void getArea();
    public abstract void getLength();
}
class Circle extends Shape{
    double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void getArea() {
        System.out.println("圆形面积：" + 3.14*r*r);
    }
    public void getLength() {
        System.out.println("圆的周长："+ String.format("%.2f", 2 * 3.14 * r));
    }
}
class Triangle extends Shape{
    int length;
    int width;

    public int getwidth(){
        return width;
    }
    public int getlength(){
        return length;
    }
    public void getwidth(int width){
        this.width=width;
    }
    public void getlength(int length){
        this.length=length;
    }
    public void getArea(){
        System.out.println("长方形面积："+width*length);
    }
    public void getLength(){
    System.out.println(("长方形周长"+2*(length+width)));
    }
}
