package edu.neu.thedaycare.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Integer strength;
	private String groupName;
	private Integer groupSize;
	private Integer maxGroups;

	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	private Collection<Student> students;
	
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	private Collection<Teacher> teachers;
	
	public Classroom() {}
	
	public Classroom(Long id, Integer strength, String groupName, Integer groupSize, Integer maxGroups,
			Collection<Student> students, Collection<Teacher> teachers) {
		this.setId(id);
		this.setStrength(strength);
		this.setGroupName(groupName);
		this.setGroupSize(groupSize);
		this.setMaxGroups(maxGroups);
		this.setStudents(students);
		this.setTeachers(teachers);
	}

	@Override
	public String toString() {
		return "Classroom [getId()=" + getId() + ", getStrength()=" + getStrength() + ", getGroupName()="
				+ getGroupName() + ", getGroupSize()=" + getGroupSize() + ", getMaxGroups()=" + getMaxGroups()
				+ ", getStudents()=" + getStudents() + ", getTeachers()=" + getTeachers() + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getGroupSize() {
		return groupSize;
	}

	public void setGroupSize(Integer groupSize) {
		this.groupSize = groupSize;
	}

	public Integer getMaxGroups() {
		return maxGroups;
	}

	public void setMaxGroups(Integer maxGroups) {
		this.maxGroups = maxGroups;
	}

	public Collection<Student> getStudents() {
		return students;
	}

	public void setStudents(Collection<Student> students) {
		this.students = students;
	}

	public Collection<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Collection<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	
}
