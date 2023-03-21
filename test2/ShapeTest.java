package test2;

public class ShapeTest {
public static void main(String[] args) {
    Circle cir=new Circle();
    cir.setR(5);
    System.out.println("圆的半径:"+cir.getR());
    cir.getArea();
    cir.getLength();

    Triangle tri=new Triangle();
    tri.getlength(5);
    tri.getwidth(5);
    System.out.println("长方形的长:"+tri.getlength());
    System.out.println("长方形的宽:"+tri.getwidth());
    tri.getArea();
    tri.getLength();
}
}
