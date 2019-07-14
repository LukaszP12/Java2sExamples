package com.java2s.common;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class Person {
	@Id
  @Column(name = "EMP_ID")
  private long id;
	
  @Column(columnDefinition = "VARCHAR(40)")
	private String name;
	private String surname;
	
	public Person() {}

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

  @Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
}