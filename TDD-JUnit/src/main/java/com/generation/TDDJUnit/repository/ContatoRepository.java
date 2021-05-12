package com.generation.TDDJUnit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.TDDJUnit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
