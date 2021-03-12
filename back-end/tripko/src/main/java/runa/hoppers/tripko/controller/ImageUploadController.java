package runa.hoppers.tripko.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import runa.hoppers.tripko.service.ImageUploadService;

@RestController
@AllArgsConstructor
public class ImageUploadController {

	private final ImageUploadService imageUploadService;

	@PostMapping("/images/upload")
	public ResponseEntity uploadImage(@RequestPart List<MultipartFile> images){
		List<String> imageUrls = imageUploadService.uploadImages(images);

		return ResponseEntity
			.status(HttpStatus.CREATED)
			.body(imageUrls);
	}
}
