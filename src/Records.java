
import java.util.ArrayList;

public class Records {

    private ArrayList<Person>  records;

    public Records ()
    {
        this.records = new ArrayList<Person>();
    }

    public void addRecord(Person person)
    {
        records.add(person);
    }

    public void viewRecords()
    {
        System.out.printf("NAME %t%t SURNAME %t%t AGE %t%t PHONE NUMBER %n");
        for(Person person : records )
        {
            System.out.println(person);
        }
    }

    //need comments
}
