package com.company;

public class Osoba {

    private String firstName;
    private String lastName;
    private int age;
    private float eff;



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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getEff() {
        return eff;
    }

    public void setEff(float eff) {
        this.eff = eff;
    }

    @Override
    public String toString() {
        return
                firstName +
                " " + lastName +
                " " + age +
                " " + eff;
    }




}
