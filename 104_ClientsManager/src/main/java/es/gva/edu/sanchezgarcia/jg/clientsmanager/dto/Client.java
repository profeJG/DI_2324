/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.edu.sanchezgarcia.jg.clientsmanager.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author josegaspar
 */
public class Client {
    private String name;
    private String surname;
    private Date registrationDate;
    private String province;
    
    private SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
/**
 * Constructor
 * @param name
 * @param surname
 * @param registrationDate
 * @param province 
 */
    public Client(String name, String surname, Date registrationDate, String province) {
        this.name = name;
        this.surname = surname;
        this.registrationDate = registrationDate;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    
    public String[] toArrayString(){
        String s[] =new String [4];
        s[0]=this.name;
        s[1]=this.surname;
        s[2]=sdf.format(this.registrationDate);
        s[3]=this.province;
        
        return s;
    }
}

