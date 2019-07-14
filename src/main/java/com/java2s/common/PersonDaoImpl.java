package com.java2s.common;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class PersonDaoImpl {
  public void test(){
    Person p1 = new Person("Tom", "Smith");
    p1.setId(1L);

    Person p2 = new Person("Jack", "Kook");
    p2.setId(2L);
    
    save(p1);
    save(p2);

    listAll();
    
  }
  private void listAll(){
    List<Person> persons = getAll();
    for (Person person : persons) {
      System.out.println(person);
    }

  }
	@PersistenceContext
	private EntityManager em;
	
	
	public Long save(Person person) {
		em.persist(person);
		return person.getId();
	}
	
	public List<Person>getAll() {
		return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
	}
	
}
