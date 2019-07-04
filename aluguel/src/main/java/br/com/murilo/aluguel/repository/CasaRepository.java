package br.com.murilo.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.murilo.aluguel.data.model.Casa;

@Repository
public interface CasaRepository extends JpaRepository<Casa, Long> {

}