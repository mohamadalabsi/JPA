package org.ME.Learning;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
    @Id
    private int rollNumber;
    private String name;
    private int marks;
//    @ManyToMany  (mappedBy = "student")
//@ManyToMany  (mappedBy = "student" , fetch=FetchType.EAGER)
//private List < Laptop >laptop = new ArrayList< >();

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    //    public void setLaptop(List <Laptop> laptop) {
//        this.laptop = laptop;
//    }
    public int getId() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return marks;
    }

//    public List<Laptop> getLaptop() {
//        return laptop;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + marks +
//                ", laptop=" + laptop +
                '}';
    }
}