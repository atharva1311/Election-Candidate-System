package com.tka.controller;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.tka.dao.ElectionDao;
import com.tka.entity.Candidate;
import com.tka.service.ElectionService;

public class ElectionController {
	
	static ElectionService service = null;
	
	public  List<Candidate> getAllCandidatesController(Scanner sc)
	{
		return ElectionService.getAllCandidatesService();
	}
	public Set<String> getAllPartiesController()
	{
		service = new ElectionService();
		return service.getAllPartiesService();
	}
	public  List<Candidate>getPartyWiseCandidateController(Scanner sc)
	{
		service = new ElectionService();
		return service.getPartyWiseCandidateService(sc);
	}
	public  List<Candidate>getAssemblyWiseCandidateController(Scanner sc)
	{
		service = new ElectionService();
		return service.getAssemblyWiseCandidateService(sc);
	}

	public  List<Candidate>getStatePartyWiseCandidatesController(Scanner sc)
	{
		service = new ElectionService();
		return service.getStatePartyWiseCandidatesService(sc);
	}
	public  List<Candidate>getGenderWiseCandidateController(Scanner sc)
	{
		service = new ElectionService();
		return service.getGenderWiseCandidateService(sc);
	}
	public  List<Candidate>getAgeWiseCandidateController(Scanner sc)
	{
		service = new ElectionService();
		return service.getAgeWiseCandidateService(sc);
	}
	public void addCandidateController(Scanner sc)
	{
		service = new ElectionService();
		service.addCandidateService(sc);
	}
	public void removeCandidateController(Scanner sc)
	{
		service = new ElectionService();
		service.removeCandidateService(sc);
	}
}
