package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Belonging {
	@EmbeddedId
	private BelongingPK id;
	private Integer Position;

	public Belonging() {
		// TODO Auto-generated constructor stub
	}	

	public Belonging(BelongingPK id, Integer position) {
		super();
		this.id = id;
		Position = position;
	}

	public Integer getPosition() {
		return Position;
	}

	public void setPosition(Integer position) {
		Position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
}
