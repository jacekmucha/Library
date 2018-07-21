package pl.sda;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Borrower {

    private long id;
    private String firstBame;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private boolean isRemoved;

}
