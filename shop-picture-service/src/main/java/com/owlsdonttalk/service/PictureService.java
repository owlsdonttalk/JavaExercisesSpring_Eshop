package com.owlsdonttalk.service;

import com.owlsdonttalk.persist.model.PictureData;
import com.owlsdonttalk.persist.model.Product;

import java.util.Optional;

public interface PictureService {

    Optional<String> getPictureContentTypeById(long id);

    Optional<byte[]> getPictureDataById(long id);

    PictureData createPictureData(byte[] picture);

    Optional<Product> getProductByPictureId(long id);

    void removePicture(long id);
}
