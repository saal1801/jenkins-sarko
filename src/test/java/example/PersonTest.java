package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class PersonTest {
    String name = "name";
    int age = 10;

    @Test
    void getName() {
        Person person = new Person();
        person.setName(name);
        assertTrue(person.getName().equals(name), "getName() failed");
    }

    @Test
    void setName() {
        Person person = new Person();
        person.setName(name);
        assertTrue(person.getName().equals(name), "setName() failed");
    }

    @Test
    void getNationality() {
        Person person = new Person();
        person.setNationality(name);
        assertTrue(person.getNationality().equals(name), "getNationality() failed");
    }

    @Test
    void setNationality() {
        Person person = new Person();
        person.setNationality(name);
        assertTrue(person.getNationality().equals(name), "setNationality() failed");
    }

    @Test
    void getEhtnicity() {
        Person person = new Person();
        person.setEhtnicity(name);
        assertTrue(person.getEhtnicity().equals(name), "getEhtnicity() failed");
    }

    @Test
    void setEhtnicity() {
        Person person = new Person();
        person.setEhtnicity(name);
        assertTrue(person.getEhtnicity().equals(name), "setEhtnicity() failed");
    }

    @Test
    void getAge() {
        Person person = new Person();
        person.setAge(age);
        assertTrue(person.getAge() == age, "getBirthdate() failed");
    }

    @Test
    void setAge() {
        Person person = new Person();
        person.setAge(age);
        assertTrue(person.getAge() == age , "setBirthdate() failed");
    }

    @Test
    void getGender() {
        Person person = new Person();
        person.setGender(name);
        assertTrue(person.getGender().equals(name), "getGender() failed");
    }

    @Test
    void setGender() {
        Person person = new Person();
        person.setGender(name);
        assertTrue(person.getGender().equals(name), "setBirthdate() failed");
    }
}