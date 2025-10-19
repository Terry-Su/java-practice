package dataJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataJpaSyntax {
    public static void main(String[] args) {
        SpringApplication.run(DataJpaSyntax.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {
            // 新增
            User u1 = new User("Alice");
            User u2 = new User("Bob");
            userRepository.save(u1);
            userRepository.save(u2);

            // 查询所有
            System.out.println("All users:");
            for (User u : userRepository.findAll()) {
                System.out.println(" → id=" + u.getId() + ", name=" + u.getName());
            }

            // 按 name 查询
            User u = userRepository.findByName("Alice");
            System.out.println("User found by name \"Alice\": id = " + (u != null ? u.getId() : null));

            // 更新
            if (u != null) {
                u.setName("AliceUpdated");
                userRepository.save(u);
            }

//            // 删除
//            userRepository.deleteById(u2.getId());
//
//            System.out.println("After delete, all users:");
//            for (User x : userRepository.findAll()) {
//                System.out.println(" → id=" + x.getId() + ", name=" + x.getName());
//            }
        };
    }
}
