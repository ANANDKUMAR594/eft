/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eft;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author EFT-10031
 */
@ManagedBean
@ViewScoped
public class bean implements java.io.Serializable {

    private int id;
    private String name;
    private int rollno;
    private String classn;
    private String dob;
    private String bg;
    private String address;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getClassn() {
        return classn;
    }

    public void setClassn(String classn) {
        this.classn = classn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String save() {
        try {
            Session session = Try6Util.getSessionFactory().openSession();

            Transaction t = session.beginTransaction();

            NewEntity a = new NewEntity();

            System.out.println(name);


            a.setName(name);
            a.setRollno(rollno);
            a.setAddress(address);
            a.setBg(bg);
            a.setDob(dob);
            a.setClassn(classn);
            a.setId(id);



            session.save(a);


            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "View";
    }



}

