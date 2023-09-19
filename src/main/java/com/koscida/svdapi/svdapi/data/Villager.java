package com.koscida.svdapi.svdapi.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VILLAGERS")
public class Villager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VILLAGER_ID")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "is_giftable")
	private boolean isGiftable;

	@Column(name = "is_marriage_candidate")
	private boolean isMarriageCandidate;

	@Column(name = "is_bachelor")
	private boolean isBachelor;

	@Column(name = "is_bachelorette")
	private boolean isBachelorette;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIsGiftable() {
		return this.isGiftable;
	}

	public boolean getIsGiftable() {
		return this.isGiftable;
	}

	public void setIsGiftable(boolean isGiftable) {
		this.isGiftable = isGiftable;
	}

	public boolean isIsMarriageCandidate() {
		return this.isMarriageCandidate;
	}

	public boolean getIsMarriageCandidate() {
		return this.isMarriageCandidate;
	}

	public void setIsMarriageCandidate(boolean isMarriageCandidate) {
		this.isMarriageCandidate = isMarriageCandidate;
	}

	public boolean isIsBachelor() {
		return this.isBachelor;
	}

	public boolean getIsBachelor() {
		return this.isBachelor;
	}

	public void setIsBachelor(boolean isBachelor) {
		this.isBachelor = isBachelor;
	}

	public boolean isIsBachelorette() {
		return this.isBachelorette;
	}

	public boolean getIsBachelorette() {
		return this.isBachelorette;
	}

	public void setIsBachelorette(boolean isBachelorette) {
		this.isBachelorette = isBachelorette;
	}

	@Override
	public String toString() {
		return "Villager: {" +
				" name: " + getName() +
				" getIsGiftable: " + getIsGiftable() +
				" getIsMarriageCandidate: " + getIsMarriageCandidate() +
				" getIsBachelor: " + getIsBachelor() +
				" getIsBachelorette: " + getIsBachelorette() +
				"}";
	}

}
