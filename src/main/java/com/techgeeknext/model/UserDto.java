package com.techgeeknext.model;

import lombok.Getter;
import lombok.Setter;

public class UserDto {
    private String username;
    private String password;

    private String mobile;

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
