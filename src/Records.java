/**
 * This class represents a records of a persons in a database and working with them.
 */

import java.util.ArrayList;

public class Records {
    /**
     * This variable will be used to store the list of people in the Insurance database.
     */
    private ArrayList<Person>  records;

    /**
     * Constructor for creating object Records
     */
    public Records ()
    {
        this.records = new ArrayList<Person>();
    }

    /**
     * This method will add a new person to the Insurance database.
     * It will ask the user for the person's name, surname, phone number and age and then create a new Person object and add it to the records list.
     */
    public void addRecord(Person person)
    {
        records.add(person);
    }

    /**
     * This method will display all people in the Insurance database.
     * It will loop through the records list and print out the name, surname, phone number and age of each person.
     */
    public void viewRecords()
    {
        System.out.printf("NAME %t%t SURNAME %t%t AGE %t%t PHONE NUMBER %n");
        for(Person person : records )
        {
            System.out.println(person);
        }
    }

            /**
             * * This method will be used to find a person in the Insurance database.
             * It will use the person's name and surname and then search the database for a person with that name and surname.
             * If a person is found, it will display the person's name, surname, phone number and age.
             * If no person is found, it will display a message to the user.
             */
    public void findRecord(String name, String surname) {
        int i = 0;
        for (Person person : records) {
            if (person.getName().equals(name) && person.getSurname().equals(surname)) {
                System.out.println(person);
                i++;
            }
        }
        if (i==0) {
            System.out.println("No person found with the name " + name + " and surname " + surname);
        }
    }
}
