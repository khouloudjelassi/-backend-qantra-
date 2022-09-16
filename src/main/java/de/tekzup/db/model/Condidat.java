package de.tekzup.db.model;



import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="condidat")
public class Condidat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id ;
	@Column(name="nom")
private String nom;
	@Column(name="prenom")
private String prenom;
	@Column(name="email")
	private String email;
	@Column(name="numt")
private Long numt;
	@Column(name="lieu")
private String lieu;



	
public Condidat(Long id, String nom, String prenom, String email, Long numt, String lieu) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.numt = numt;
		this.lieu = lieu;
	}
public Condidat() {}

@OneToMany(mappedBy="condidat",cascade = CascadeType.ALL)
@JsonIgnore
private Set<Mail> mail=new LinkedHashSet<>();

@ManyToOne(fetch = FetchType.EAGER)
private Quiz quiz;


public Quiz getQuiz() {
	return quiz;
}
public void setQuiz(Quiz quiz) {
	this.quiz = quiz;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Long getNumt() {
	return numt;
}
public void setNumt(Long numt) {
	this.numt = numt;
}
public String getLieu() {
	return lieu;
}
public void setLieu(String lieu) {
	this.lieu = lieu;
}


}

