package entities;

public class Rectangle {
    public double width;
    public double height;

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return String.format("LARGURA: %.2f", width)
            + String.format("\nALTURA: %.2f", height)
            + String.format("\nAREA: %.2f", getArea())
            + String.format("\nPERIMETER: %.2f", getPerimeter())
            + String.format("\nDIAGONAL: %.2f", getDiagonal());
    }
}
