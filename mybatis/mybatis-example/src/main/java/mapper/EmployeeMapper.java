package mapper;

import demo.Employee;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapper {
    Employee selectEmployee(Integer id);

    @Select("select emp_id as empId, emp_name as empName, emp_salary as empSalary from t_emp where emp_id = #{id}")
    Employee selectEmployeeById(Integer id);
}
