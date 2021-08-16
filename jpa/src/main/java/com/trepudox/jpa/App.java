package com.trepudox.jpa;

import com.trepudox.jpa.model.PessoaModel;
import com.trepudox.jpa.model.ProfissaoModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("trepudox-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        PessoaModel pess = entityManager.find(PessoaModel.class, 1);
        ProfissaoModel prof = entityManager.find(ProfissaoModel.class, 1);
        System.out.println(pess);
        System.out.println(prof);

        PessoaModel pessoaModel = PessoaModel.builder()
                .nome("Marcooo")
                .dataNasc(LocalDate.now())
                .profissao(ProfissaoModel.builder().id(1).build())
                .build();

        entityManager.getTransaction().begin();
        entityManager.persist(pessoaModel);
        entityManager.getTransaction().rollback();
//        entityManager.getTransaction().commit();


//        entityManager.contains()
    }

}
