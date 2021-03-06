package com.fiap.challenge.stonks.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.fiap.challenge.stonks.model.City;
import com.fiap.challenge.stonks.model.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fiap.challenge.stonks.model.User;

public class UserDetailsData implements UserDetails {

	private static final long serialVersionUID = 1L;

	private final Optional<User> user;

	public UserDetailsData(Optional<User> user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return new ArrayList<>();
	}

	@Override
	public String getPassword() {
		return user.orElse(new User()).getPassword();
	}

	@Override
	public String getUsername() {
		return user.orElse(new User()).getLogin();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public Collection<Role> getRoles(){
		return user.get().getRoles();
	}

	public City getCity() {
		return user.get().getCity();
	}
}
