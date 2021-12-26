package gov.pjc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import gov.pjc.api.entity.Album;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "album", path = "album")
public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
