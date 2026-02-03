package demo;

import mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class MybatisExample {
    public static void main(String[] args) throws IOException {
// 1. 加载 MyBatis 的核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 2. 构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3. 从 SqlSessionFactory 中获取 SqlSession
        // 使用 try-with-resources 确保 SqlSession 被关闭
        try (SqlSession session = sqlSessionFactory.openSession()) {
            // 4. 获取 Mapper 接口的代理对象
            EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

            // 5. 调用 Mapper 接口方法执行查询
//            Employee employee = mapper.selectEmployee(1);
            Employee employee = mapper.selectEmployeeById(1);

            // 6. 输出结果
            System.out.println("员工姓名：" + employee.getEmpName());
            System.out.println("员工薪资：" + employee.getEmpSalary());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
