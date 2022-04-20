package com.sirionlabs.environment.service;

import java.util.List;

import com.sirionlabs.environment.entities.SirionEnvironment;

public interface SirionenvironementService {

	SirionEnvironment saveSirionEnvironement(SirionEnvironment sirionEnvironement);

	SirionEnvironment updateSirionEnvironment(SirionEnvironment sirionEnvironment);

	void deleteSirionEnvironment(SirionEnvironment sirionEnvironment);

	SirionEnvironment getSirionEnvironmentById(int id);

	List<SirionEnvironment> getAllSirionEnvironment();
}
