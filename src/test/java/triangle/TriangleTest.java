package triangle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TriangleTest {



    @Test
    public void checkIfTriangleCanBeCreatedIfYes() {
        Triangle triangle = new Triangle(5, 12, 13);
        Assertions.assertThat(triangle).isInstanceOf(Triangle.class);
    }

    @Test
    public void checkIfTriangleCanBeCreatedIfNo() {
        Assertions.assertThatThrownBy(() -> new Triangle(5, 12, 13).checkIfTraingleCanBeCreated(2, 3, 4)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void hypotenuseTest() {
        Triangle triangle = new Triangle(5, 12, 13);
        Double result = triangle.hypotenuse(triangle);
        Assertions.assertThat(result).isEqualTo(13);
    }

    @Test
    public void perimeterTest() {
        Triangle triangle = new Triangle(5, 12, 13);
        Double result = triangle.perimeter(triangle);
        Assertions.assertThat(result).isEqualTo(30);
    }

    @Test
    public void areaTest() {
        Triangle triangle = new Triangle(5, 12, 13);
        Double result = triangle.area(triangle);
        Assertions.assertThat(result).isEqualTo(30);
    }

}
