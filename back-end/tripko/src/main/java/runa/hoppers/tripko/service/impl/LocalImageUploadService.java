package runa.hoppers.tripko.service.impl;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import runa.hoppers.tripko.service.ImageUploadService;

@Service
public class LocalImageUploadService implements ImageUploadService{

	@Override
	public List<String> uploadImages(List<MultipartFile> images) {
		if(images.isEmpty()){
			return Collections.emptyList();
		}

		return images.stream()
			.map(this::uploadImage)
			.collect(Collectors.toList());
	}

	@Override
	public String uploadImage(MultipartFile image){
		try {
			String path = new ClassPathResource("/static/").getFile().getAbsolutePath();
			String uuid = UUID.randomUUID().toString();
			String fileName = image.getOriginalFilename();

			File file = Paths.get(path, uuid, fileName).toFile();
			file.getParentFile().mkdirs();

			image.transferTo(file);

			return ServletUriComponentsBuilder.fromCurrentContextPath()
				.pathSegment("static")
				.pathSegment(uuid)
				.pathSegment(fileName)
				.build()
				.toUriString();
		}catch (IOException e){
			throw new RuntimeException("파일 경로 확인중 에러 발생");
		}
	}
}
