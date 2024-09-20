package org.ME.Learning;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        insert into the Database 
        Student student = new Student();
        student.setRollNumber(100);
        student.setName("Hamza");
        student.setMarks(77);

     EntityManagerFactory emf  =Persistence.createEntityManagerFactory("PU");
     EntityManager em = emf.createEntityManager();


      em.getTransaction().begin();
      em.persist(student);
      em.getTransaction().commit();


//     Fetching
//     Student student = em.find(Student.class,50);
//     System.out.println(student);

    }
}
