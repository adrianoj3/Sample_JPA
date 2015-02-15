package org.persistence;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Task")
public class Task implements Serializable {

	private static final long serialVersionUID = 1L;

	public Task() {
	}
	
	enum TaskType {
		TO_DO, IN_PROGRESS, READY_TO_TEST, TEST, FINISHED
	}
	

	@Id
	@GeneratedValue(generator = "TaskGenerator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName = "task_id_seq", name = "TaskGenerator")
	private long id;
	@OneToMany
	private Collection<Comment> comment;
	private Timestamp timeEnd;
	private Timestamp timeStart;
	private TaskType state;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Comment> getComment() {
		return comment;
	}

	public void setComment(Collection<Comment> param) {
		this.comment = param;
	}

	public Timestamp getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Timestamp param) {
		this.timeEnd = param;
	}

	public Timestamp getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Timestamp param) {
		this.timeStart = param;
	}

	public TaskType getState() {
	    return state;
	}

	public void setState(TaskType param) {
	    this.state = param;
	}

}