package com.example.servidorappbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.servidorappbackend.domain.Servidor;

@Repository
public interface ServidorRepository extends JpaRepository<Servidor, String>{

}
