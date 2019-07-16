import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (c) by FWU Group - All rights reserved
 * <p>
 * NOTICE:  All information contained herein is, and remains the property of
 * FWU Group and its suppliers, if any. The intellectual and technical concepts
 * contained herein are confidential and proprietary to FWU Group and its suppliers
 * and may be covered by patents, patents in process, and are protected by trade secret
 * or copyright law.
 * <p>
 * Dissemination of this information or reproduction of this material is strictly
 * forbidden unless prior written permission is obtained from FWU Group.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 */
public class Testbed {

    public static void main(String args[])
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println("Student Info:");
        System.out.println("Student Name "+student.getName());
        System.out.println("Student Roll No "+student.getRollNo());
        System.out.println("Student Class "+student.getClassno());
        //System.out.println("Student Address"+student.getAddress());

        //Address address = (Address) applicationContext.getBean("address");
        Address address = student.getAddress();
        System.out.println("Student Address:");
        System.out.println("City Name "+address.getCity());
        System.out.println("Province Name "+address.getState());
        System.out.println("Country Name "+address.getCountry());

    }
}


