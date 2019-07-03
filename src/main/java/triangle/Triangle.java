package triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if(checkIfTraingleCanBeCreated(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public boolean checkIfTraingleCanBeCreated(double a, double b, double c) {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            return true;
        } else {
            throw new IllegalArgumentException("Nie można utworzyć trójkąta prostokątnego o zadanych bokach");
        }
    }

    public double hypotenuse(Triangle triangle) {
        List<Double> values = Arrays.asList(triangle.getA(), triangle.getB(), triangle.getC());
        return Collections.max(values);
    }

    public double perimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    public double area(Triangle triangle) {
        List<Double> values = new ArrayList<>();
        values.add(triangle.getA());
        values.add(triangle.getB());
        values.add(triangle.getC());
        values.remove(hypotenuse(triangle));
        return 0.5 * values.get(0) * values.get(1);

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
