package com.work.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name="company")

@JsonIgnoreProperties({"hibernateLazyInstaller" , "handler"})
public class employee {
	
	@Id
	@Column(name="id",nullable=false)
	@SequenceGenerator(name="employee_seq",sequenceName="emplyee_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="employee_seq")
	private Long id;
	public String getfirst() {
		return first_name;
	}
	public String getlast() {
		return last_name;
	}
	public void setfirst(String fname) {
		this.first_name=fname;
	}
	public void setlast(String lname) {
		this.last_name=lname;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getcontact() {
		return contact;
	}
	public void setcontact(String cont) {
		this.contact=cont;
	}
	public String getinterests() {
		return interests;
	}
	public void setinterests(String inte) {
		this.interests=inte;
	}
	public Date getjoining() {
		return joining;
	}
	public void setjoining(Date join) {
		this.joining=join;
	}
	private String email;
	private String first_name;
	private String last_name;
	private String contact;
	private String interests;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date joining;
}
