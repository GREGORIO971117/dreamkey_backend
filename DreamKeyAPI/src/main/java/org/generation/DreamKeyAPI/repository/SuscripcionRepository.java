package org.generation.DreamKeyAPI.repository;

import org.generation.DreamKeyAPI.model.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuscripcionRepository extends JpaRepository <Suscripcion, Integer> {

}
