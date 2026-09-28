package re.edu.hw.ss15.ex02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import re.edu.hw.ss15.ex02.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailIgnoreCase(String email);

    boolean existsByEmailIgnoreCase(String email);
}
