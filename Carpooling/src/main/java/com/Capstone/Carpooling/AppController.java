package com.Capstone.Carpooling;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RideGiverRepository ridegiverRepo;
	@Autowired
	private RideTakerRepository ridetakerRepo;


	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "register_success";
	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}

	@GetMapping("/ride_giver")
	public String giverForm(Model model) {
		model.addAttribute("ride_giver", new RideGiver());
		return "ride_giver_form";
	}

	@PostMapping("/ride_giver_processed")
	public String giverSubmit(@ModelAttribute RideGiver ride_giver, Model model) {
		model.addAttribute("ride_giver", ride_giver);
		ridegiverRepo.save(ride_giver);
		return "ride_giver_result";
	}

	@GetMapping("/ride_taker")
	public String takerForm(Model model) {
		model.addAttribute("ride_taker", new RideTaker());
		return "ride_taker_form";
	}

	@PostMapping("/ride_taker_processed")
	public String takerSubmit(@ModelAttribute RideTaker ride_taker, Model model) {
		model.addAttribute("ride_taker", ride_taker);
		ridetakerRepo.save(ride_taker);
		return "ride_giver_result";
	}




}
