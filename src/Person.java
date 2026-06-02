public class Person {

    private String name;
    private String surname;
    private String phoneNumber;
    private int age;

    /**
     * @param name name of the person in database of records
     * @param surname surname of the person in database of records
     * @param phoneNumber phone number of the person in database of records
     * @param age age of the person in database of records
     */

    public Person (String   name, String surname, String phoneNumber, int age) {
        this.setName(name);
        this.setSurname(surname);
        this.setPhoneNumber(phoneNumber);
        this.setAge(age);
    }

    /**
     *
     * @return name of the person in database of records
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name set name of the person in database of records
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return surname of the person in database of records
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param surname set surname of the person in database of records
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @return phone number of the person in database of records
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber set phone number of the person in database of records
     *
     * phone number must be in the format 9 digits. It can start with +420 or 00420, but it is not required.
     * If the phone number is not in the correct format, person will not be added to the database
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        if(phoneNumber.startsWith(  "+420")) {
           // phoneNumber.replace("+420", "");
            phoneNumber.substring(4);
        }
        else if(phoneNumber.startsWith("00420")) {
            //phoneNumber.replace("00420", "");
            phoneNumber.substring(5);
        }
    }

    /**
     *
     * @return age of the person in database of records
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age set age of the person in database of records
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return string representation of the person in database of records
     */
    @Override
    public String toString()
    {
        return String.format("%s %t%t %s %t%t %d %t%t %s%n", name, surname, age, phoneNumber);
    }
}
