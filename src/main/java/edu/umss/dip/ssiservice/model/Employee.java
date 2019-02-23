package edu.umss.dip.ssiservice.model;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Table
@Entity
public class Employee extends ModelBase {
    private String firstName;
    private String lastName;
    private Byte[] image;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Contract> contracts = new LinkedList<>();

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}