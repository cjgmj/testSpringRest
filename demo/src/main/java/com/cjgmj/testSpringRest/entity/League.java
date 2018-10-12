package com.cjgmj.testSpringRest.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "league", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class League{

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "amountTeams", nullable = false)
	private int amountTeams;

	@Column(name = "director")
	private String director;

	@Column(name = "actualChampion")
	private String actualChampion;

	@Column(name = "teamMoreTitles")
	private String teamMoreTitles;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "league")
	@JsonBackReference
	private Set<Team> teams;

}
