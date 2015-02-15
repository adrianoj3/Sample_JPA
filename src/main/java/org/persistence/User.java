package org.persistence;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DB_User")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public User() {
	}

	enum UserType {
		ADMIN, USER
	}

	enum UserRole {

		PROJECT_MANAGER, DEVELOPER
	}

	@Id 
	@GeneratedValue(generator = "UserGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "user_id_seq", name = "UserGenerator")
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	@ManyToMany
	private Collection<Project> project;
	private UserRole role;
	private UserType type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String param) {
		this.firstName = param;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String param) {
		this.lastName = param;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String param) {
		this.email = param;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String param) {
		this.password = param;
	}

	public Collection<Project> getProject() {
		return project;
	}

	public void setProject(Collection<Project> param) {
		this.project = param;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole param) {
		this.role = param;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType param) {
		this.type = param;
	}

}