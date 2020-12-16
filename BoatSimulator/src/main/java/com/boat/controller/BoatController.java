package com.boat.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boat.bean.BoatLog;
import com.boat.service.BoatService;

@RestController
public class BoatController {
	
	@Autowired
	BoatService boatservice;
	 /**
     * GetMapping for the Boat event data.
     * @return
     * @throws IOException
     */
    @GetMapping("/event")
    public String post() throws IOException {
        	
    	boatservice.BoatEventData();
        return "Published successfully";
            
    } 
    
    
    @GetMapping("/publishboat")
    public String publishBoat() throws IOException {
    	
    	System.out.println(boatservice.pushBoatDynamics());
    	return "Published Sucessfully";
    }
    
    
    /**
     * PostMapping for the vehicle data from Rest API.
     * @param vehicle
     * @return
     */
    @PostMapping("/boat/post")
    public String postController(@RequestBody BoatLog vehicle)
    {
        System.out.println("in post");
        boatservice.vehicleRegister(vehicle);
        
        return"sucessfully posted"; 
        
    }

	

}
