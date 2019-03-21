package ua.stqa.pft.sandbox;

public class Square {

    public double l;

    public Square(double l) {
        this.l = l;//передать значение в атрибут обєкта
    }

    public double area() {
        return this.l * this.l;
    }
}
