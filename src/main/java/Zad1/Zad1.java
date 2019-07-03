package Zad1;

public class Zad1 {


    public int number(Character c) {
        return c.charValue() - 64;
    }

    public int modulo(String nameAndSurname) {
        nameAndSurname = nameAndSurname.toUpperCase();
        nameAndSurname = changePolishLetters(nameAndSurname);
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

    private String changePolishLetters(String nameAndSurname) {
        nameAndSurname = nameAndSurname.replace("Ł", "L");
        nameAndSurname = nameAndSurname.replace("Ó", "O");
        nameAndSurname = nameAndSurname.replace("Ż", "Z");
        nameAndSurname = nameAndSurname.replace("Ź", "Z");
        nameAndSurname = nameAndSurname.replace("Ą", "A");
        nameAndSurname = nameAndSurname.replace("Ę", "E");

        return nameAndSurname;
    }
}
