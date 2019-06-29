package triangle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    public void checkIfTriangleCanBeCreatedIfYes(){
        Boolean result = triangle.checkIfTraingleCanBeCreated(5,12,13);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void checkIfTriangleCanBeCreatedIfNo(){
        Assertions.assertThatThrownBy(() -> triangle.checkIfTraingleCanBeCreated(2,3,4)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void hypotenuseTest(){
        Double result = triangle.hypotenuse(3,4,2);
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void perimeterTest(){
        Double result = triangle.perimeter(2,3,4);
        Assertions.assertThat(result).isEqualTo(9);
    }

}
