package com.onlineshopping.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.user.entity.Profile;
import com.onlineshopping.user.service.ProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService service;
	
	@GetMapping("/getprofiles")
	public List<Profile> getProfiles()
	{
		System.out.println(service.getProfiles());
		return service.getProfiles();
	}
	
	@PostMapping("/saveprofile")
	public ResponseEntity<?> save(@RequestBody Profile profile)
	{
		service.save(profile);
	   return ResponseEntity.ok(profile+" saved");
	}
	
	@GetMapping("/get/{prname}")
	public List<Profile> findByName(@PathVariable(required = true) String prname){
		 return service.findByName(prname);
	}
	
	@PostMapping("/update")
	public void updateProfile(@RequestBody Profile profile) {
		service.updateProfile(profile);
	}
}
