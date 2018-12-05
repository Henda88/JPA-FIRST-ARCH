package tn.esprit.imputation.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import webapp.firstArch.persistence.Todo;


@Entity
@Table(name="t_user")
public class user implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nom;
	private String prenom;
	private String mail;
	private List<Todo> todo; 
	
	
	@OneToMany(mappedBy="user")
	public List<Todo> getTodo() {
		return todo;
	}
	public void setTodo(List<Todo> todo) {
		this.todo = todo;
	}
	
	@Id    
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	} 
	
	public user() {
		super();
	}
	public user(String nom, String prenom, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
