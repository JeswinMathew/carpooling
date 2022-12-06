package com.Capstone.Carpooling;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
		Authentication authentication = (Authentication) SecurityContextHolder.getContext().getAuthentication();
		CustomUserDetails LoggedInUser = (CustomUserDetails) authentication.getPrincipal();
		String email = LoggedInUser.getEmail();
		User listUsers = userRepo.findByEmail(email);
		model.addAttribute("listUsers", listUsers);
		RideGiver listRideGivers = ridegiverRepo.findByEmail(email);
		model.addAttribute("listRideGivers", listRideGivers);
		RideTaker listRideTakers = ridetakerRepo.findByEmail(email);
		model.addAttribute("listRideTakers", listRideTakers);
		RideTaker listMyRideTakers = ridetakerRepo.findByRideGiverEmail(email);
		model.addAttribute("listMyRideTakers", listMyRideTakers);
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
	@PostMapping("/ride_taker_processed")
	public String giverSubmit(@ModelAttribute RideTaker ride_taker, Model model) {
		model.addAttribute("ride_taker", ride_taker);
		ridetakerRepo.save(ride_taker);
		return "ride_taker_result";
	}


@GetMapping("/ride_search")
	public String listRideGivers(Model model) {
		List<RideGiver> listRideGivers = ridegiverRepo.findAll();
		model.addAttribute("listRideGivers", listRideGivers);
	    model.addAttribute("ride_taker", new RideTaker());
		return "ride_search_form";
	}


@GetMapping("/ride_book/{email}")
	public String takerForm(@PathVariable("email") String email , Model model) {
		model.addAttribute("ride_taker", new RideTaker());
	    model.addAttribute("message", email);
		return "ride_book_form";
	}


	@PostMapping("/ride_book_processed")
	public String takerSubmit(@ModelAttribute RideTaker ride_taker, Model model) {
		model.addAttribute("ride_taker", ride_taker);
		ridetakerRepo.save(ride_taker);
		return "ride_book_result";
	}

	@GetMapping("/admin")
	public String listForAdmin(Model model) {
		List<RideGiver> listRideGivers = ridegiverRepo.findAll();
		model.addAttribute("listRideGivers", listRideGivers);
		List<RideTaker> listRideTakers = ridetakerRepo.findAll();
		model.addAttribute("listRideTakers", listRideTakers);
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		return "admin";
	}


	@RequestMapping(value = "/deleteUser/{id}", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteUser(@PathVariable("id") long id) {
		userRepo.deleteById(id);
		return "register_success";
	}
	@RequestMapping(value = "/deleteRideGiver/{id}", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteRideGiver(@PathVariable("id") long id) {
		ridegiverRepo.deleteById(id);
		return "register_success";
	}
	@RequestMapping(value = "/deleteRideTaker/{id}", method = {RequestMethod.GET, RequestMethod.POST})
	public String deleteRideTaker(@PathVariable("id") long id) {
		ridetakerRepo.deleteById(id);
		return "register_success";
	}

}
