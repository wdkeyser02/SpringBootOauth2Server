package willydekeyser.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import willydekeyser.entity.Client;

public interface ClientRepository extends JpaRepository<Client, String> {

	Optional<Client> findByClientId(String clientId);
}
