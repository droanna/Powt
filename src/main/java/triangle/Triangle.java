package triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triangle {


    public boolean checkIfTraingleCanBeCreated(double a, double b, double c) {
        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            return true;
        } else {
            throw new IllegalArgumentException("Nie można utworzyć trójkąta prostokątnego o zadanych bokach");
        }
    }

    public double hypotenuse(double a, double b, double c) {
        List<Double> values = Arrays.asList(a, b, c);
        return Collections.max(values);
    }

    public double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double area(double a, double b, double c) {
        List<Double> values = new ArrayList<>();
        values.add(a);
        values.add(b);
        values.add(c);
        values.remove(hypotenuse(a, b, c));
        return 0.5 * values.get(0) * values.get(1);
    }
}
