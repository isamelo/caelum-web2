package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelas {

		public static void main (String[] args) {
				EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
				
				System.out.println("rodou");
				factory.close();
		}
	}
