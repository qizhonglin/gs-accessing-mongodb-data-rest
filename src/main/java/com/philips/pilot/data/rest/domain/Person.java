package com.philips.pilot.data.rest.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by 310031267 on 2016/4/13.
 */
public class Person {
    @Id
    private String id ;

    private String firstName ;
    private String lastName ;
    private String age ;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
