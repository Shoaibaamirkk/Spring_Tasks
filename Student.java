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
public class Student {

   private String name="";
   private String rollNo="";
   private String classno="";
   private Address address;

   public Student(Address address)
   {
       this.address = address;
   }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }
}
