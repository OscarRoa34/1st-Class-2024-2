package co.edu.uptc;

import co.edu.uptc.models.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Chico de las fantasias");
        System.out.println("Hola, que tal, soy el " + person.getName());
        System.out.println("Tu fiel admirador");
    }
}