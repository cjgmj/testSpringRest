package com.cjgmj.testSpringRest.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "player", uniqueConstraints = @UniqueConstraint(columnNames = { "id", "team" }))
public class Player{

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "surname", nullable = false)
	private String surname;

	@Column(name = "nationality", nullable = false)
	private String nationality;

	@Column(name = "position", nullable = false)
	private String position;
	
	@Column(name = "birthdate", nullable = false)
	private LocalDateTime birthdate;

	@Column(name = "height")
	private String height;

	@Column(name = "rate")
	private Integer rate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "team", nullable = false)
	@JsonManagedReference
	private Team team;

}
