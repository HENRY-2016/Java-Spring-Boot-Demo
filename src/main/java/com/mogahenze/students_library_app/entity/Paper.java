package com.mogahenze.students_library_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Papers_table")
public class Paper {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String year;
    private String semi;

    // getters and setters methods

    public Integer getId(){return id;}
    public void setId(Integer id){this.id =id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getYear(){return year;}
    public void setYear(String year){this.year = year;}

    public String getSemi(){return semi;}
    public void setSemi(String semi){this.semi = semi;}

    
}
