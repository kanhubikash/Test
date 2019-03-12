package com.biswa.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="LOGIN_TAB")
public class LoginEntity {

	@Id
	@GenericGenerator(name = "gen1", strategy ="increment")
    @GeneratedValue(generator = "gen1")
	@Column(name="SNO")
	private int sno;
	@Column(name="USERNAME")
	private String userName;
	@Column(name="PASSWORD")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
