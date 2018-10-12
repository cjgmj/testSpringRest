package com.cjgmj.testSpringRest.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "team", uniqueConstraints = @UniqueConstraint(columnNames = { "name", "league" }))
public class Team {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "stadium", nullable = false)
	private String stadium;

	@Column(name = "president")
	private String president;

	@Column(name = "dateFoundation")
	private LocalDateTime dateFoundation;

	@Column(name = "location", nullable = false)
	private String location;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	@JsonBackReference
	private Set<Player> players;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "league", nullable = false)
	@JsonManagedReference
	private League league;
	
}
