package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HesController {
	
	@GetMapping("/")
	public String Hellomsg() {
		return "Hello Digital Inovation One";
	}
}
