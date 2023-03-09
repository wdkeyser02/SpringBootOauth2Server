package willydekeyser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import willydekeyser.entity.SecurityUser;

public interface UserRepository extends JpaRepository<SecurityUser, Integer>{

	SecurityUser findByUsername(String username);
}
