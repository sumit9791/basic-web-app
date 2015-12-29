package org.java.springsecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by CygnusX on 26-Dec-15.
 */
public class MyEncoder {


    public static void main(String[] args) {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
        System.out.println(encoder.encode("sumit"));
    }
}
