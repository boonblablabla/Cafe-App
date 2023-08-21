package ku.cs.cafeapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String name;
    private String role;
}
