package udem.edu.co.login.repository;
import udem.edu.co.login.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<User,String > {
}
