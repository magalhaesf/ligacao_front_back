package com.mkelman.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkelman.escola.modelo.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{//Repositorio é uma interface    
}
