package gov.pjc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import gov.pjc.api.entity.Artista;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "artista", path = "artista")
public interface ArtistaRespository extends JpaRepository<Artista, Integer> {

}
