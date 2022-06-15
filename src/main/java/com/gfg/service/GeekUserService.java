package com.gfg.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfg.model.GeekUserRecord;
import com.gfg.repository.GeekUserRepository;

@Service
public class GeekUserService {
	@Autowired
	private GeekUserRepository geekUserRepository;

	public List<GeekUserRecord> getAllGeekUsers() {
		List<GeekUserRecord> geekUserRecords = new ArrayList<>();
		geekUserRepository.findAll().forEach(geekUserRecords::add);
		return geekUserRecords;
	}

	public void addGeekUser(GeekUserRecord userRecord) {
		geekUserRepository.save(userRecord);
	}
}