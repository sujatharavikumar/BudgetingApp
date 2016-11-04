package ravikumar.sujatha.domain;

import javax.persistence.*;

/**
 * Created by sujatharavikumar on 11/3/16.
 */

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(unique=true)
    String username;
    String password;

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
