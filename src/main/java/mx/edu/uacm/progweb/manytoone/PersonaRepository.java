package mx.edu.uacm.progweb.manytoone;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.progweb.manytoone.domain.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

}
