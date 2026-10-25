package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ana", LocalDate.of(2004, 1, 19));
        System.out.println(person);
    }
}
