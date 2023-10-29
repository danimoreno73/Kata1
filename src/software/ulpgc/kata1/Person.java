package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {

    private final String nombre;

    private final LocalDate birthday;

    public Person(String nombre, LocalDate birthday) {
        this.nombre = nombre;
        this.birthday = birthday;
    }

    public String getNombre() {
        return nombre;
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
                "nombre='" + nombre + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
