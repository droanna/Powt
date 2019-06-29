package Zad1;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Zad1Test {

    Zad1 zad1 = new Zad1();



    @Test
    public void numberTestForUpperCase() {
        Zad1 zad1 = new Zad1();
        int result = zad1.number('A');
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void numberTestForZ() {
        Zad1 zad1 = new Zad1();
        int result = zad1.number('Z');
        Assertions.assertThat(result).isEqualTo(26);
    }

    @Test
    public void moduloTestFor0() {
        int modulo = zad1.modulo("AA");
        Assertions.assertThat(modulo).isEqualTo(0);
    }

    @Test
    public void moduloTestFor1() {
        int modulo = zad1.modulo("AB");
        Assertions.assertThat(modulo).isEqualTo(1);
    }

    @Test
    public void moduloTestWithSpace() {
        int modulo = zad1.modulo("A B");
        Assertions.assertThat(modulo).isEqualTo(1);
    }

}
