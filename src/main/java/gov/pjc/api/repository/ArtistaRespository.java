package gov.pjc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gov.pjc.api.entity.Artista;

@RepositoryRestResource(collectionResourceRel = "artista", path = "artista")
public interface ArtistaRespository extends JpaRepository<Artista, Integer> {

}
