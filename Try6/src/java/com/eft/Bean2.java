/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eft;

import java.util.Iterator;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author EFT-10031
 */
@ManagedBean
@ViewScoped
public class Bean2 implements java.io.Serializable {

    private int id;
    private String name;
    private int rollno;
    private String classn;
    private String dob;
    private String bg;
    private String address;
    int last;
    String name1;
    private int rollno1;
    private String classn1;
    private String dob1;
    private String bg1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getRollno1() {
        return rollno1;
    }

    public void setRollno1(int rollno1) {
        this.rollno1 = rollno1;
    }

    public String getClassn1() {
        return classn1;
    }

    public void setClassn1(String classn1) {
        this.classn1 = classn1;
    }

    public String getDob1() {
        return dob1;
    }

    public void setDob1(String dob1) {
        this.dob1 = dob1;
    }

    public String getBg1() {
        return bg1;
    }

    public void setBg1(String bg1) {
        this.bg1 = bg1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }
    private String address1;


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

    public void view() {
        try {

            Session session = Try6Util.getSessionFactory().openSession();

            Transaction t = session.beginTransaction();

            NewEntity a = new NewEntity();


            Query q = session.createQuery("from NewEntity");

            for (Iterator iterator = q.list().iterator(); iterator.hasNext();) {
                NewEntity val = (NewEntity) iterator.next();
                if (this.id == val.getId()) {

                    last = val.getId();
                    System.out.println("Name:::" + val.getId());
                    System.out.println("Name:::" + val.getName());
                    System.out.println("Name:::" + val.getClassn());
                    System.out.println("Name:::" + val.getBg());
                    System.out.println("Name:::" + val.getDob());
                    System.out.println("Name:::" + val.getAddress());
                    address = val.getAddress();
                    bg = val.getBg();
                    classn = val.getClassn();
                    dob = val.getDob();
                    name = val.getName();
                    rollno = val.getRollno();


                }
            }


            //   session.save(a);

            // t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void update() {
        {
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

            session.update(a);

            t.commit();
            session.close();
        }
    }

}
