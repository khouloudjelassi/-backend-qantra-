package de.tekzup.db.model;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.List;

@Entity
@Table(name="quiz")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long qid;
	private String title;
	private String description;
	private String period;
	private String nombrechapitre;
	private String nombreexercice;
	private String nombreproject;
	private String meettype;
	private String nombreworkshps;
	private String nombrehore;
	private String goal1;
	private String goal2;
	private String goal3;
	private String goal4;
	private String goal5;
	private String price;

	
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	
	
	
	

	
	
	
	public Quiz(Long qid, String title, String description, String period, String nombrechapitre, String nombreexercice,
			String nombreproject, String meettype, String nombreworkshps, String nombrehore, String goal1, String goal2,
			String goal3, String goal4, String goal5,String price) {
		super();
		this.qid = qid;
		this.title = title;
		this.description = description;
		this.period = period;
		this.nombrechapitre = nombrechapitre;
		this.nombreexercice = nombreexercice;
		this.nombreproject = nombreproject;
		this.meettype = meettype;
		this.nombreworkshps = nombreworkshps;
		this.nombrehore = nombrehore;
		this.goal1 = goal1;
		this.goal2 = goal2;
		this.goal3 = goal3;
		this.goal4 = goal4;
		this.goal5 = goal5;
		this.price=price;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	private FileDB fileDB;
	
	@OneToMany(mappedBy="quiz",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Condidat> condidats=new LinkedHashSet<>();
	
	@OneToMany(mappedBy="quiz",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Objectif> objeSet=new LinkedHashSet<>();
	
	
	
	
	public String getPrice() {
		return price;
	}





	public void setPrice(String price) {
		this.price = price;
	}





	public String getGoal1() {
		return goal1;
	}





	public void setGoal1(String goal1) {
		this.goal1 = goal1;
	}





	public String getGoal2() {
		return goal2;
	}





	public void setGoal2(String goal2) {
		this.goal2 = goal2;
	}





	public String getGoal3() {
		return goal3;
	}





	public void setGoal3(String goal3) {
		this.goal3 = goal3;
	}





	public String getGoal4() {
		return goal4;
	}





	public void setGoal4(String goal4) {
		this.goal4 = goal4;
	}





	public String getGoal5() {
		return goal5;
	}





	public void setGoal5(String goal5) {
		this.goal5 = goal5;
	}





	public String getNombrechapitre() {
		return nombrechapitre;
	}





	public void setNombrechapitre(String nombrechapitre) {
		this.nombrechapitre = nombrechapitre;
	}





	public String getNombreexercice() {
		return nombreexercice;
	}





	public void setNombreexercice(String nombreexercice) {
		this.nombreexercice = nombreexercice;
	}





	public String getNombreproject() {
		return nombreproject;
	}





	public void setNombreproject(String nombreproject) {
		this.nombreproject = nombreproject;
	}





	public String getMeettype() {
		return meettype;
	}





	public void setMeettype(String meettype) {
		this.meettype = meettype;
	}





	public String getNombreworkshps() {
		return nombreworkshps;
	}





	public void setNombreworkshps(String nombreworkshps) {
		this.nombreworkshps = nombreworkshps;
	}





	public String getNombrehore() {
		return nombrehore;
	}





	public void setNombrehore(String nombrehore) {
		this.nombrehore = nombrehore;
	}





	public Quiz() {
		
	}
	
	



	public String getPeriod() {
		return period;
	}





	public void setPeriod(String period) {
		this.period = period;
	}

	public Long getqId() {
		return qid;
	}
	public void setqId(Long qid) {
		this.qid = qid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
