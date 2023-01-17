package org.fasttrackit.course7.code.interfaces2;

public interface Citizen extends Person{
    String getLanguage();
    long getIdentifier();
    String getCountry();
    void setCountry(String country);
}
