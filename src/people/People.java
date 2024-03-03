package people;

import java.time.LocalDate;

public class People {
    protected String fullName;
    protected LocalDate age;
    protected int phoneNumber;
    protected String address;

    public People(String fullName, LocalDate age, int phoneNumber, String address) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public People() {

    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }


    public String toString() {

        return String.format("name = %s, phoneNumber = %s", fullName, phoneNumber);
    }

}
