package webapp.firstArch.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import tn.esprit.imputation.entity.user;


@Entity
@Table(name="t_todo")
public class Todo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String text;
	private todoTypes todoType; 
	private user user;  
	
	@ManyToOne
	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	public Todo() {
	}   
	
	public Todo(String text) {
		this.text = text;
	}

	@Id    
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public todoTypes getTodoType() {
		return todoType;
	}

	public void setTodoType(todoTypes todoType) {
		this.todoType = todoType;
	}
   
}

