package edu.neu.thedaycare.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table
public class Student extends Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private LocalDate dob;
	private LocalDate programStartDate;

	@Transient
	private Integer age;
	
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	private Collection<Guardian> guardians;
	
	public Student() {
		super();
	}

	public Student(
			Long id,
			String firstName,
			String lastName,
			Gender gender,
			LocalDate dob,
			LocalDate programStartDate) {
		super(firstName, lastName, gender);

		this.setId(id);
		this.setDob(dob);;
		this.setProgramStartDate(programStartDate);
	}
	
	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getDob()=" + getDob() + ", getProgramStartDate()="
				+ getProgramStartDate() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getGender()=" + getGender() + "]";
	}
	
	public Integer getAge() {
		return Period.between(this.dob, LocalDate.now()).getYears();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getProgramStartDate() {
		return programStartDate;
	}
	public void setProgramStartDate(LocalDate programStartDate) {
		this.programStartDate = programStartDate;
	}
	
}
