package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.security.AccessControlException;

public class AgeOfMajorityException {
    public int getAgeFromUser(int age) throws AccessControlException {
        try {
            if ((age < 18)) {
                throw new AccessControlException("User is under the age of majority");
            }
            return age;
        } catch (AccessControlException e) {
            System.out.println(e.toString());
            throw new AccessControlException(e.getMessage());
        }
    }
}
