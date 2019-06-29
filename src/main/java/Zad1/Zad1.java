package Zad1;


public class Zad1 {

    public int number(Character c) {
        return c.charValue() - 64;
    }

    public int modulo(String nameAndSurname) {
        nameAndSurname = nameAndSurname.toUpperCase();
        int sum = 0;
        int value = 0;
        for (int i = 0; i < nameAndSurname.length(); i++) {
            Character character = nameAndSurname.charAt(i);
            if (!character.equals(' ')) {
                value = number(character);
            }
            sum += value;
            value = 0;
        }
        return sum % 2;
    }

}
