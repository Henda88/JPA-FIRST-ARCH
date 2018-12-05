package webapp.firstArch.services;

import java.util.List;

import javax.ejb.Local;

import webapp.firstArch.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
