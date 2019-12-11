package personmanager;

import personmanager.model.Person;

/**
 *
 * @author sscerbatiuc
 */
public class PersonManager {

    Person[] arr;

    public PersonManager() {
        arr = new Person[10];
        for (int p = 0; p < 10; p++) {
            arr[p] = new Person("Name" + p, "Surname" + p, p % 2 == 0 ? 'M' : 'F');
        }
    }

    public void printFullName() {
        for (Person p : arr) {
            System.out.println(p.getFullName());
        }
    }

    public void printInitials() {

    }

    public void printConditionals() {
     
    }

    public Person[] filterMale() {
        int count = 0;
        Person[] result;
        for (Person p : this.arr) {
            if (p.getGender() == 'M') {
                count++;
            }
        }

        result = new Person[count];
        for (int i = 0, j = 0; i < this.arr.length; i++) {
            if (this.arr[i].getGender() != 'M') {
                continue;
            }
            result[j++] = this.arr[i];
        }
        return result;

    }

}
