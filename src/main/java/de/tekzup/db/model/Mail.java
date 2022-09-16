package de.tekzup.db.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mail")
public class Mail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mid;
	private String receiver;
	private String object;
	private String content;
	public Long getMid() {
		return mid;
	}
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Condidat condidat;
	
	
	public void setMid(Long mid) {
		this.mid = mid;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Mail(Long mid, String receiver, String object, String content) {
		super();
		this.mid = mid;
		this.receiver = receiver;
		this.object = object;
		this.content = content;
	}
	
	
}
