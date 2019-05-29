
package com.projet6.Impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Data;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "user")
public class User implements Serializable, UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String username;
    private String password;
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }
    @Override
    public boolean isEnabled() {
        return false;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

