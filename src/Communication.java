/**
 * This class is responsible for handling communication between the user and the program.
 * It will be used to display messages to the user and to get input from the user.
 */

import java.util.Scanner;

public class Communication {

    private Scanner scanner = new Scanner(System.in);
    private Records records = new Records();

    /**
     * input - This variable will be used to store the user's input from the menu.
     */
    private String input;

        /**
         *  menuChoice - It will be used to determine which action the user wants to perform.
         */
    private int menuChoice = 1;
    /**
     * Constructor for creating object Communication
     */
    public Communication()
    {

        this.input = input;
    }

    /**
     * This method will display the menu to the user and get the user's input.
     * It will continue to display the menu until the user chooses to exit the program.
     */
    public void menu()
    {
        do{
        System.out.println("Choose your action:");
        System.out.println("1 - Add a new person to the Insurance database");
        System.out.println("2 - View all people in the Insurance database");
        System.out.println("2 - Find person in the Insurance database");
        System.out.println("3 - Exit the program");
        input = scanner.nextLine();
        menuChoice = Integer.parseInt(input);

        switch (menuChoice){
            case 1: //Add person
                this.addPerson();
                break;
            case 2://view all people
                this.viewList();
                break;
            case 3: //find person
                this.findPerson();
                break;
            case 4: //exit the program
                break;
            default:
                System.out.println("Invalid option, please try again.");
                }
        }while(menuChoice!=4);

    }

    /** This method will be used to add a new person to the Insurance database.
     * It will ask the user for the person's name, surname, phone number and age.
     * If there will be no empty input, it will then create a new Person object and add it to the database.
     */
    private void addPerson()
    {
        // add method for adding a person
        String name = "",surname = "", phoneNumber = "", age = "";
        System.out  .println("Enter the person's name:");
        if(scanner.nextLine() == "")
            menuCall();
        name = scanner.nextLine();

        System.out.println("Enter the person's surname:");
        if(scanner.nextLine() == "")
            menuCall();
        surname = scanner.nextLine();

        System.out.println("Enter the person's phone number:");
        if(scanner.nextLine() == "")
            menuCall();
        phoneNumber = scanner.nextLine();

        System.out.println("Enter the person's age:");
        if(scanner.nextLine() == "")
            menuCall();
        age = scanner.nextLine();

        Person person = new Person(name, surname, phoneNumber, Integer.parseInt(age));
        records.addRecord(person);
    }

    /** This method reacts on if input is empty and will display a message to the user and call the menu method again.
     */
    private void menuCall()
    {
        System.out.println("Name cannot be empty. Going back to menu.");
        this.menu();
    }

    /** This method will be used to view all people in the Insurance database.
     * It will display the name, surname, phone number and age of each person in the database.
     */
    private void viewList()
    {
        records.viewRecords();
    }

    /** This method will be used to find a person in the Insurance database.
     * It will ask the user for the person's name and surname and then search the database for a person with that name and surname.
     * If a person is found, it will display the    person's name, surname, phone number and age.
     * If no person is found, it will display a message to the user.
     */
    private void findPerson()
    {
        System.out  .println("Enter the person's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the person's surname:");
        String surname = scanner.nextLine();
        records.findRecord(name, surname);
    }

}