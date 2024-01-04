package com.sthev.beanvalidation.dto;

import java.time.Instant;

import com.sthev.beanvalidation.entities.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class UserDTO {
	
	private Long id;
	
	@NotBlank(message = "name cannot be null or empty")
	private String name;
	
	@Email
	private String email;
	
	@Size(min = 9, max = 16, message = "Campo phone deve conter entre 9 e 16 caracteres")
	private String phone;
	
	@PastOrPresent(message = "Campo Data invalido")
	private Instant birthDate;
	
	@Positive(message = "Campo saldo deve ser positvo")
	private Double balance;
	
	public UserDTO() {
		
	}

	public UserDTO(Long id, String name, String email, String phone, Instant birthDate, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.birthDate = birthDate;
		this.balance = balance;
	}
	
	public UserDTO(User user) {
		id = user.getId();
		name = user.getName();
		email = user.getEmail();
		phone = user.getPhone();
		birthDate = user.getBirthDate();
		balance = user.getBalance();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
}
