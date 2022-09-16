package de.tekzup.db.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="objectif")
public class Objectif {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long oid;
	private String ob1;
	private String ob2;
	private String ob3;
	private String ob4;
	private String ob5;
	private String ob6;
	private String ob7;
	private String ob8;
	private String ob9;
	private String ob10;
	
	
	
	public Objectif(Long oid, String ob1, String ob2, String ob3, String ob4, String ob5, String ob6, String ob7,
			String ob8, String ob9, String ob10) {
		super();
		this.oid = oid;
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
		this.ob4 = ob4;
		this.ob5 = ob5;
		this.ob6 = ob6;
		this.ob7 = ob7;
		this.ob8 = ob8;
		this.ob9 = ob9;
		this.ob10 = ob10;
	}
	
	public Objectif() {}

	
	@ManyToOne(fetch = FetchType.EAGER)
	private Quiz quiz;
	
	
	public Long getOid() {
		return oid;
	}
	
	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	public Quiz getQuiz() {
		return quiz;
	}
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	
	public String getOb1() {
		return ob1;
	}
	public void setOb1(String ob1) {
		this.ob1 = ob1;
	}
	public String getOb2() {
		return ob2;
	}
	public void setOb2(String ob2) {
		this.ob2 = ob2;
	}
	public String getOb3() {
		return ob3;
	}
	public void setOb3(String ob3) {
		this.ob3 = ob3;
	}
	public String getOb4() {
		return ob4;
	}
	public void setOb4(String ob4) {
		this.ob4 = ob4;
	}
	public String getOb5() {
		return ob5;
	}
	public void setOb5(String ob5) {
		this.ob5 = ob5;
	}
	public String getOb6() {
		return ob6;
	}
	public void setOb6(String ob6) {
		this.ob6 = ob6;
	}
	public String getOb7() {
		return ob7;
	}
	public void setOb7(String ob7) {
		this.ob7 = ob7;
	}
	public String getOb8() {
		return ob8;
	}
	public void setOb8(String ob8) {
		this.ob8 = ob8;
	}
	public String getOb9() {
		return ob9;
	}
	public void setOb9(String ob9) {
		this.ob9 = ob9;
	}
	public String getOb10() {
		return ob10;
	}
	public void setOb10(String ob10) {
		this.ob10 = ob10;
	}

	
	
	
}
