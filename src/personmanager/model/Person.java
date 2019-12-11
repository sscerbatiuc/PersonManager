package personmanager.model;

/**
 *
 * @author sscerbatiuc
 */
public class Person {
    private String name, surname;
    private char gender;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, char gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getGender() {
        return gender;
    }
    
    public String getFullName(){
        return this.name + " " + this.surname + " " + this.gender;
    }
//    
//    public String getInitials(){
//        return this.name.charAt(0) + "." + this.surname.charAt(0) + ".";
//    }
    
    
}
