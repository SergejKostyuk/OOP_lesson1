package people;

import java.time.LocalDate;

public class Owner extends People{
    public Owner(String fullName, LocalDate age, int phoneNumber, String address) {
        super(fullName, age, phoneNumber, address);
    }

    public Owner() {
        super();
    }
}
