package main.java.Classes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userid")
	private int userId;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	
	public User(int userId, String username, String password, String firstName, String lastName){
		super();
		this.setUserId(userId);
		this.setusername(username);
		this.setPassword(password);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	public User(){
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
