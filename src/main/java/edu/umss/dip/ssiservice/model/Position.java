package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
public class Position extends ModelBase {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
