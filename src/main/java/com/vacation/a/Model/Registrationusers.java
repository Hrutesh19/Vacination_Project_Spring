package com.vacation.a.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Register_users")
public class Registrationusers {
    


    public Registrationusers() {
    }

    @Column
    @GeneratedValue()
    @Id
    private int id;
    private String name;
    private String contact;
    private String  age;
    private String  gender;
    private String    vaccinenames; 
     private String idtype;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getVaccinenames() {
        return vaccinenames;
    }
    public void setVaccinenames(String vaccinenames) {
        this.vaccinenames = vaccinenames;
    }
    public String getIdtype() {
        return idtype;
    }
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    @Override
    public String toString() {
        return "registrationusers [id=" + id + ", name=" + name + ", contact=" + contact + ", age=" + age + ", gender="
                + gender + ", vaccinenames=" + vaccinenames + ", idtype=" + idtype + "]";
    }

     

    
}

























    

