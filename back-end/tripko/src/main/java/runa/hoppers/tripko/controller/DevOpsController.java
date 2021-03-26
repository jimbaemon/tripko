package runa.hoppers.tripko.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsController {

	@Value("${info.version}")
	private String version;

	@Autowired
	private Environment env;

	@GetMapping("/version")
	public ResponseEntity main(){

		return ResponseEntity.ok(version);

	}

	@GetMapping("/profile")
	public ResponseEntity profile(){

		return ResponseEntity.ok(
			Arrays.stream(env.getActiveProfiles())
				.findFirst()
				.orElse("")
		);

	}

	@GetMapping("/health")
	public ResponseEntity health(){

		return ResponseEntity.ok("UP");

	}


}
