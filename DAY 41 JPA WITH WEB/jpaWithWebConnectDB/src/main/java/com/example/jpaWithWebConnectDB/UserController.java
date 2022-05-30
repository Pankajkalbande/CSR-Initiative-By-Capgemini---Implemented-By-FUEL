package com.example.jpaWithWebConnectDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	UsersRepository usersrepo;
	@PostMapping("/createuser")
	public String save(@ModelAttribute Users users) {
		usersrepo.save(users);
		return "index";
	}
	
	@GetMapping("/showall")
	public String show(Model model) {
		List<Users> ob = usersrepo.findAll();
		model.addAttribute("users", ob);
		return "result";
	}
}
