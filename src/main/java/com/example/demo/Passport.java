package com.example.demo;



import javax.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String expDate;
    private String passportNumber;

    @OneToOne(mappedBy = "passport")
    private Person person;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
