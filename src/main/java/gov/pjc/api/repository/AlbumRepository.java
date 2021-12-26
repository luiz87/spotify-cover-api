package gov.pjc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gov.pjc.api.entity.Album;

@RepositoryRestResource(collectionResourceRel = "album", path = "album")
public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
