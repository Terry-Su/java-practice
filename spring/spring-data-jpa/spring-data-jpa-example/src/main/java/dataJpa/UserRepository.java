package dataJpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

    @Query("select count(*) from User")
    Integer queryCustomCount();

    // 使用原生SQL (nativeQuery = true)
    @Query(value = "SELECT * FROM user u WHERE u.name LIKE %:keyword%", nativeQuery = true)
    List<User> findByNameKeyword(@Param("keyword") String keyword);
}