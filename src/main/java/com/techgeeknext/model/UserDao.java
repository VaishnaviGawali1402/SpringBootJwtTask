package com.techgeeknext.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user",uniqueConstraints = @UniqueConstraint(columnNames = {"game_id", "mobile"}))
public class UserDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;

    @Column
    private String mobile;

    @Column
    private long game_id;

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

    public String getMobile() {
        return mobile;
    }

    public long getGame_id() {
        return game_id;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setGame_id(long game_id) {
        this.game_id = game_id;
    }
}

