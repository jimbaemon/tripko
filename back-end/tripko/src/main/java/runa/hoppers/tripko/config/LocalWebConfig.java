package runa.hoppers.tripko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import runa.hoppers.tripko.service.ImageUploadService;
import runa.hoppers.tripko.service.impl.LocalImageUploadService;

@Configuration
@Profile("local")
public class LocalWebConfig {

	@Bean
	public ImageUploadService imageUploadService(){
		return new LocalImageUploadService();
	}
}
