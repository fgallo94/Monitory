package com.utn.java.tp3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class Logs {
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Getter
	@Setter
	private String operativeSystem;
	@Getter
	@Setter
	private String webBrowser;

	public Logs(String operativeSystem, String webBrowser) {
		this.operativeSystem = operativeSystem;
		this.webBrowser = webBrowser;
	}

}