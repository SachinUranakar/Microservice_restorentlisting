package com.sach.restolisting.controller;

import java.util.List;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sach.restolisting.HandleException.RestorentNotPresent;
import com.sach.restolisting.dto.RestorentDTO;
import com.sach.restolisting.dto.Restouser;
import com.sach.restolisting.entity.Restorent;
import com.sach.restolisting.service.Restorentservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/restorent")
public class RestorentController {
	
	@Autowired 
	Restorentservice restoservice;

	@GetMapping("/fetchallrestorent")
	public ResponseEntity<List<RestorentDTO>> fetchAllRestorent(){
		List<RestorentDTO> allresto = restoservice.fetchAllRestorent();
		return new ResponseEntity<List<RestorentDTO>>(allresto, HttpStatus.OK);
	}	
	@PostMapping("/addrestorent")
	public ResponseEntity<Restorent> addRestorent(@RequestBody @Valid RestorentDTO dto){
		 Restorent resto = restoservice.addrestorent(dto);
		return new ResponseEntity<Restorent>(resto,HttpStatus.CREATED);
		
	}
	@GetMapping("/getrestorent/{restoid}")
	public ResponseEntity<Restorent> getRestorentByid(@PathVariable int restoid) throws RestorentNotPresent{
		return ResponseEntity.ok(restoservice.getrestorentbyId(restoid));
	}
//	@GetMapping("/getresto/{restoid}/{userid}")
//	public ResponseEntity<Restouser> getRestorentanduser(@PathVariable int restoid,@PathVariable int userid) {
//		
//	}
}
