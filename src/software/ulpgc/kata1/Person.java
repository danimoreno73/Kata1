package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {

    private final String name;

    private final String surname;
    private final LocalDate birthday;

    public Person(String nombre, String surname, LocalDate birthday) {
        this.name = nombre;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public int getAge(){

        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365.25);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
