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
}
