package interfaces;

import model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositories extends JpaRepository<Employee, Long> {

}
