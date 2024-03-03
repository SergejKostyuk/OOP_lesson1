package people;

import java.time.LocalDate;

public class Doctor extends People {

    protected String speciality;
    protected LocalDate employmentTime;

    public Doctor(String fullName, LocalDate age, int phoneNumber, String address, String speciality, LocalDate employmentTime) {
        super(fullName, age, phoneNumber, address);
        this.speciality = speciality;
        this.employmentTime = employmentTime;
    }

}
