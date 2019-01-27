package lk.lib.ijse.repository;

import lk.lib.ijse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
