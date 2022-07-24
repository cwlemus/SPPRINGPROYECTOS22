package udb.m3.clinica.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import udb.m3.clinica.modelo.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente,Integer> {

}
