package com.owlsdonttalk.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.owlsdonttalk.persist.model.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
