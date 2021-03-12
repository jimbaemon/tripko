package runa.hoppers.tripko.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface ImageUploadService {

	List<String> uploadImages(List<MultipartFile> images);

	String uploadImage(MultipartFile image);
}
