package com.sach.restolisting.service;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sach.restolisting.HandleException.RestorentNotPresent;
import com.sach.restolisting.dto.RestorentDTO;
import com.sach.restolisting.dto.Restouser;
import com.sach.restolisting.dto.Userinfodto;
import com.sach.restolisting.entity.Restorent;
import com.sach.restolisting.repository.RestorentRepo;

@Service
public class Restorentservice {

	@Autowired
	RestorentRepo repo;
	@Autowired
	RestTemplate resttemp;
	
	public List<RestorentDTO> fetchAllRestorent() {
		List<Restorent>restolist = repo.findAll();
		List<RestorentDTO> restodto = restolist.stream().map(restorent ->{
			RestorentDTO dto = new RestorentDTO();
			dto.setAddress(restorent.getAddress());
			dto.setCity(restorent.getCity());
			//o.setId(restorent.getId());
			dto.setName(restorent.getName());
			dto.setId(restorent.getId());
			dto.setRestorentDescription(restorent.getRestorentDescription());
			return dto;
		} ).collect(Collectors.toList());
		return restodto;
	}

	public Restorent addrestorent(RestorentDTO dto) {
               Restorent restorent = new Restorent();
               restorent.setAddress(dto.getAddress());
               restorent.setCity(dto.getCity());
               restorent.setName(dto.getName());
               restorent.setRestorentDescription(dto.getRestorentDescription());
               repo.save(restorent);
               return restorent;
	}
	public Restorent getrestorentbyId(int id) throws NoSuchElementException {
		try {
		Restorent restorent = repo.findById(id).get();
		return restorent;
		}catch (Exception e) {
			
		 throw new NoSuchElementException("Restodent details not found :"+id);	
		}
	}
//	public Restouser getRestouser(int restoid,int userid) {
//		
//	}
//	public  Userinfodto getuserinfo() {
//		
//	}
}
