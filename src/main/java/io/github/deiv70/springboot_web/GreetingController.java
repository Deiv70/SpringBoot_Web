package io.github.deiv70.springboot_web;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(
		@RequestParam(
			name="name", required=false, defaultValue="World"
		) String name, Model model
	) {
		model.addAttribute("name", name);
		model.addAttribute("client", Arrays.asList(
			new Client("David","Gómez",22),
			new Client("Andrea","Cancio",22),
			new Client("Daniel","Díaz",23)
		));
		return "greeting";
	}

}
