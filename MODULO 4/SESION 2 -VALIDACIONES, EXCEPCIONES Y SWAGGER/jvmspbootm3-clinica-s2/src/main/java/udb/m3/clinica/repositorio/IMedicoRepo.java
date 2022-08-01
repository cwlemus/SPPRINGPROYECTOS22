package udb.m3.clinica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import udb.m3.clinica.modelo.Medico;

public interface IMedicoRepo extends JpaRepository<Medico,Integer> {

}
