package org.persistence;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;

	public Comment() {
	}

	@Id
	@GeneratedValue(generator = "CommentGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "comment_id_seq", name = "CommentGenerator")
	private long id;
	private String content;
	private Timestamp time;
	private String author;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String param) {
		this.content = param;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String param) {
		this.author = param;
	}

}