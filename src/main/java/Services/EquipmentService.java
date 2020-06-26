package Services;


import EntityFactory.Equipment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EquipmentService {

   // EntityManagerFactory entityManagerFactory;
    //entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
   public String Put(String producer, String model, String serial, String isWorking) {
        EntityManagerFactory obj;
        obj = Persistence.createEntityManagerFactory("equipment");
        EntityManager entityManager = obj.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(new Equipment(producer,model,serial,isWorking));
        entityManager.getTransaction().commit();
        entityManager.close();
return "ok";
    }
}