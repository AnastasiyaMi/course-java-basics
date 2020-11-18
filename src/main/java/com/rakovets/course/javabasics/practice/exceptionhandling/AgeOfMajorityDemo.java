package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.security.AccessControlException;

public class AgeOfMajorityDemo {
    public static void main(String[] args) throws AccessControlException {
        AgeOfMajorityException ageOfMajority = new AgeOfMajorityException();
        try {
            ageOfMajority.getAgeFromUser(18);
        } catch (AccessControlException exception) {
            System.out.println(exception.toString());
        }
    }
}
