/**
 *Console application for recording insurance claims.
 * Adding person, removing person or searching person is possible.
 */

public class Main {
    public static void main(String[] args)
    {
        Communication communication = Communication.createCommunication();
        communication.menu();
        System.out .println("Program ended. have a nice day!");
    }
}

