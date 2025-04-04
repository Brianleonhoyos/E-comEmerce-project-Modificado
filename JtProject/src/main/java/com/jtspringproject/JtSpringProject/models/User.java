package com.jtspringproject.JtSpringProject.models;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="CUSTOMER")
@Table
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String username;
	
	private String email;
	
	private String password;
	
	private String role;
	
	private String address;

	private User(Builder builder) {
		this.id = builder.id;
		this.username = builder.username;
		this.email = builder.email;
		this.password = builder.password;
		this.address = builder.address;
		this.role = builder.role;
	}

	public static class Builder {
		private int id;
		private String username;
		private String email;
		private String password;
		private String address;
		private String role;

		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder setRole(String role) {
			this.role = role;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
