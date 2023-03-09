package willydekeyser.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authorizationConsent")
@IdClass(AuthorizationConsent.AuthorizationConsentId.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorizationConsent {

	@Id
	private String registeredClientId;
	@Id
	private String principalName;
	@Column(length = 1000)
	private String authorities;
	
	public static class AuthorizationConsentId implements Serializable {
		private static final long serialVersionUID = 1L;
		private String registeredClientId;
		private String principalName;

		public String getRegisteredClientId() {
			return registeredClientId;
		}

		public void setRegisteredClientId(String registeredClientId) {
			this.registeredClientId = registeredClientId;
		}

		public String getPrincipalName() {
			return principalName;
		}

		public void setPrincipalName(String principalName) {
			this.principalName = principalName;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			AuthorizationConsentId that = (AuthorizationConsentId) o;
			return registeredClientId.equals(that.registeredClientId) && principalName.equals(that.principalName);
		}

		@Override
		public int hashCode() {
			return Objects.hash(registeredClientId, principalName);
		}
	}
}
