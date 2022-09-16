package de.tekzup.db.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.websocket.OnError;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "files")
public class FileDB {
	 @Id
	  @GeneratedValue(generator = "uuid")
	  @GenericGenerator(name = "uuid", strategy = "uuid2")
	  private String id;
	  private String name;
	  private String type;
	  @Lob
	  private byte[] data;
	  public FileDB() {
	  }
	  
		@OneToMany(mappedBy="fileDB",cascade = CascadeType.ALL)
		@JsonIgnore
		private Set<Quiz> quizzes=new LinkedHashSet<>();
		
	  
	  
	  public FileDB(String name, String type, byte[] data) {
	    this.name = name;
	    this.type = type;
	    this.data = data;
	  }
	  public String getId() {
	    return id;
	  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public String getType() {
	    return type;
	  }
	  public void setType(String type) {
		    this.type = type;
		  }
		  public byte[] getData() {
		    return data;
		  }
		  public void setData(byte[] data) {
		    this.data = data;
		  }
		}

