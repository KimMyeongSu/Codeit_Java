import java.util.ArrayList;

public class Painter {

    public static void main(String[] args) {
        ArrayList<Printable> shapes = new ArrayList<>();

        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(4, 2));
        shapes.add(new Square(3));
        shapes.add(new Square(1));

        for (Printable shape : shapes) {
            shape.print();
            System.out.println("---------");
        }
    }

}


abstract class AbstractShape{

    // 그림판에서의 위치
    protected double x;
    protected double y;

    // 생성자
    public AbstractShape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // 도형 움직이기
    public void move(double xDistance, double yDistance) {
        x += xDistance;
        y += yDistance;
    }


}


interface Printable {

    void print();

}


class Rectangle extends AbstractShape implements Printable{
    // 길이
    double side1; // 세로
    double side2; // 가로

    // 생성자
    public Rectangle(double side1, double side2) {
        super(0, 0);
        this.side1 = side1;
        this.side2 = side2;
    }

    // 넓이
    public double getArea() {
        return side1 * side2;
    }

    // 둘레
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public void print() {
        for (int i = 0; i <side1; i++) {
            for (int j = 0 ; j < side2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Square extends AbstractShape implements Printable {
    // 길이
    double side;

    // 생성자
    public Square(double side) {
        super(0, 0);
        this.side = side;
    }

    // 넓이
    public double getArea() {
        return side * side;
    }

    // 둘레
    public double getPerimeter() {
        return 4 * side;
    }


    @Override
    public void print() {
        for (int i = 0; i <side; i++) {
            for (int j = 0 ; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}