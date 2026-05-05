package com.ProjetoLoginLuigi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoLoginLuigi.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
	Login findByUsername(String username);
}
