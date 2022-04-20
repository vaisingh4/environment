package com.sirionlabs.environment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirionlabs.environment.entities.SirionEnvironment;
import com.sirionlabs.environment.repos.SirionenvironmentRepositry;

@Service
public class SirionenvironmentSirviceImpl implements SirionenvironementService {

	@Autowired
	private SirionenvironmentRepositry repositry;
	
	@Override
	public SirionEnvironment saveSirionEnvironement(SirionEnvironment sirionEnvironment) {
		return repositry.save(sirionEnvironment);
	}

	@Override
	public SirionEnvironment updateSirionEnvironment(SirionEnvironment sirionEnvironment) {
		return repositry.save(sirionEnvironment);
	}

	@Override
	public void deleteSirionEnvironment(SirionEnvironment sirionEnvironment) {
		repositry.delete(sirionEnvironment);

	}

	@Override
	public SirionEnvironment getSirionEnvironmentById(int id) {
		return repositry.findById(id).get();
	}

	@Override
	public List<SirionEnvironment> getAllSirionEnvironment() {
		return repositry.findAll();
	}

}
