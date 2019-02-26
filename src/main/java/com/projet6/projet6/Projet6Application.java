package com.projet6.projet6;


import com.projet6.Impl.Compte;
import com.projet6.contrat.CompteDao;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@SpringBootApplication
public class Projet6Application {

	@PersistenceContext
	public  EntityManager em ;

	public static void main(String[] args) {
		SpringApplication.run(Projet6Application.class, args);

		}



	}





