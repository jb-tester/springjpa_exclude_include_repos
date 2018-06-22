package com.mytests.spring.jpa.exclude_include_repos.data;

import javax.persistence.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 5/30/2017.
 * Project: exclude_include_repos
 * *******************************
 */
@Entity
@Table(name = "tab_2", schema = "jbtests", catalog = "")
public class Tab2Entity {
    private int id;
    private String name;
    private int age;
    private String leavingAddress;
    private String mobilePhoneNumber;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 15)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "LeavingAddress", nullable = true, length = 25)
    public String getLeavingAddress() {
        return leavingAddress;
    }

    public void setLeavingAddress(String leavingAddress) {
        this.leavingAddress = leavingAddress;
    }

    @Basic
    @Column(name = "MobilePhoneNumber", nullable = true, length = 15)
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tab2Entity that = (Tab2Entity) o;

        if (id != that.id) return false;
        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (leavingAddress != null ? !leavingAddress.equals(that.leavingAddress) : that.leavingAddress != null)
            return false;
        if (mobilePhoneNumber != null ? !mobilePhoneNumber.equals(that.mobilePhoneNumber) : that.mobilePhoneNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (leavingAddress != null ? leavingAddress.hashCode() : 0);
        result = 31 * result + (mobilePhoneNumber != null ? mobilePhoneNumber.hashCode() : 0);
        return result;
    }
}
