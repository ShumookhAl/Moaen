/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sefinal;

import javafx.scene.control.CheckBox;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Asus
 */
@Entity
@Table(name="medicne")
public class medicne implements java.io.Serializable {
    @Id
    @Column(name="name")
     private String name;
    @Column(name="sleepT")
     private String sleepT;
    @Column(name="numcap")
     private String numcap;
    @Column(name="period")
     private String period;
    @Column(name="username")
     private String username;
     @Column(name="ExpiryDate")
     private String ExpiryDate;
    @Column(name="eat")
     private boolean eat;
      @Column(name="Time")
      private String Time=null;
      @Column(name="done")
      private String checkk;

    public medicne() {
    }

    public medicne(String name, boolean eat, String Time) {
        this.name = name;
        this.eat=eat;
        this.Time = Time;
        checkk=null;
        CheckBox s =new CheckBox();

    }

   

 
    public boolean getEat() {
        return eat;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }
    

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSleepT() {
        return sleepT;
    }

    public void setSleepT(String sleepT) {
        this.sleepT = sleepT;
    }

    public String getNumcap() {
        return numcap;
    }

    public void setNumcap(String numcap) {
        this.numcap = numcap;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }


    public String getCheck() {
        return checkk;
    }

    public void setCheck(String check) {
        this.checkk = check;


  
    }
    
}