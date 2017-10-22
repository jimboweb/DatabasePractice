/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasething;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jimstewart
 */
public class DataWriter {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DatabaseThingPU");
    @PersistenceContext
    EntityManager em = emf.createEntityManager();
    public Customer createCustomer(Integer customerId, 
                                    String name, 
                                    String addressLine1,
                                    String addressLine2,
                                    String city,
                                    String state,
                                    String phone,
                                    String fax,
                                    String email,
                                    Integer creditLimit){
        Customer c = new Customer();
        c.setCustomerId(customerId);
        c.setName(name);
        c.setAddressline1(addressLine1);
        c.setAddressline2(addressLine2);
        c.setCity(city);
        c.setState(state);
        MicroMarket mm = em.find(MicroMarket.class, "95051");
        c.setZip(mm);
        c.setPhone(phone);
        c.setFax(fax);
        c.setEmail(email);
        c.setCreditLimit(creditLimit);
        DiscountCode dc = em.find(DiscountCode.class, "H");
        c.setDiscountCode(dc);
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(c);
        et.commit();
        try{
        Thread.sleep(1000);
        } catch(InterruptedException e) {
            
        }
        em.close();
        return c;
    }
    

}
