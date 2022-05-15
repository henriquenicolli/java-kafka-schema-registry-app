package com.kafka.broker.consumer.repository;

import com.kafka.broker.consumer.model.MensagemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public interface MensagemRepository extends CrudRepository<MensagemEntity, Long> {

    /*@PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(MensagemEntity mensagem) {
        EntityManager em = entityManager.getEntityManagerFactory().createEntityManager();

        try {
            em.getTransaction().begin();

            em.persist(mensagem);

            em.getTransaction().commit();
            System.out.println("saved = " + mensagem);
        }
        catch(Throwable th) {
            System.out.println(th);
            em.getTransaction().rollback();
            throw th;
        }
    }*/

}
