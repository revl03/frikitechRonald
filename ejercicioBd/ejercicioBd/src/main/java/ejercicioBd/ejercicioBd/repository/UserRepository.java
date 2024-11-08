package ejercicioBd.ejercicioBd.repository;

import ejercicioBd.ejercicioBd.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
