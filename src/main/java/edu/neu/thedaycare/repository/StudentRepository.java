package edu.neu.thedaycare.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.neu.thedaycare.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>  {
	
//	@Query("SELECT * from student FULL JOIN classroom ON classroom_id=classroom.id")
//	@Query("SELECT s, c from student s FULL JOIN classroom c ON s.classroom_id=c.id")
//	public String[][] findAllWithClassroom();

}
