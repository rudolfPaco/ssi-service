package edu.umss.dip.ssiservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
public class Category extends ModelBase {
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
