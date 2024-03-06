package people;

import java.time.LocalDate;

public class Nurse extends People{
    protected LocalDate employmentTime;

    public Nurse(String fullName, LocalDate age, int phoneNumber, String address, LocalDate employmentTime) {
        super(fullName, age, phoneNumber, address);
        this.employmentTime = employmentTime;
    }
}
