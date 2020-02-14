package br.com.java.kanban.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import org.springframework.lang.Nullable;

@MappedSuperclass
public class BaseEntity {
	
	private boolean deleted;
	
	@Nullable
	private Date deleted_date;
	
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public Date getDeleted_date() {
		return deleted_date;
	}
	public void setDeleted_date(Date deleted_date) {
		this.deleted_date = deleted_date;
	}
}
