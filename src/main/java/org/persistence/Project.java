package org.persistence;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Project")
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;

	public Project() {
	}

	enum ProjectState {
		NOT_STARTED,INPROGRES, FINISHED
	}
	
	@Id
	private long id;
	private String name;
	private String projectManager;
	private String description;
	@ManyToMany(mappedBy = "project")
	private Collection<User> user;
	@OneToMany
	private Collection<Task> task;
	private ProjectState state;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String param) {
		this.name = param;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String param) {
		this.projectManager = param;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String param) {
		this.description = param;
	}

	public Collection<User> getUser() {
		return user;
	}

	public void setUser(Collection<User> param) {
		this.user = param;
	}

	public Collection<Task> getTask() {
		return task;
	}

	public void setTask(Collection<Task> param) {
		this.task = param;
	}

	public ProjectState getState() {
		return state;
	}

	public void setState(ProjectState param) {
		this.state = param;
	}

}