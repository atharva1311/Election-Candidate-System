package com.tka.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.tka.dao.ElectionDao;
import com.tka.entity.Candidate;

public class ElectionService {
	static ElectionDao dao = null;
	
	public static List<Candidate>getAllCandidatesService()
	{
		dao = new ElectionDao();
		List<Candidate> allPlayerList = new ArrayList<Candidate>();
		allPlayerList=dao.getAllCandidates();
		return allPlayerList;
	}
	
	public Set<String> getAllPartiesService()
	{
		Set<String> allParties = new TreeSet<String>();
		for(Candidate c:ElectionService.getAllCandidatesService() )
		{
			allParties.add(c.getParty());
		}
		return allParties;
	}
	public  List<Candidate>getPartyWiseCandidateService(Scanner sc)
	{
		System.out.println("Enter party name: ");
		String name=sc.nextLine();
		List<Candidate> partyWisePlayerList = new ArrayList<Candidate>();
		for(Candidate c: ElectionService.getAllCandidatesService())
		{
			if(name.equalsIgnoreCase(c.getParty()))
			{
				partyWisePlayerList.add(c);
			}
		}
		return partyWisePlayerList;
	}

	public List<Candidate> getAssemblyWiseCandidateService(Scanner sc)
	{
		System.out.println("Enter assembly name: ");
		String assembly = sc.nextLine();
		List<Candidate> assemblyWisePlayerList = new ArrayList<Candidate>();
		for(Candidate c : ElectionService.getAllCandidatesService())
		{
			if(c.getAssembly().equalsIgnoreCase(assembly))
			{
				assemblyWisePlayerList.add(c);
			}
		}
		
		return assemblyWisePlayerList;
	}
	
	public List<Candidate> getStatePartyWiseCandidatesService(Scanner sc)
	{
		List<Candidate> statePartyWisePlayerList = new ArrayList<Candidate>();
		System.out.println("Enter state name: ");
		String state=sc.nextLine();
		System.out.println("Enter party name: ");
		String party=sc.nextLine();
		
		for(Candidate c : ElectionService.getAllCandidatesService())
		{
			if(c.getAssembly().equalsIgnoreCase(state) && c.getAssembly().equalsIgnoreCase(party))
			{
				statePartyWisePlayerList.add(c);
			}
		}
				
		return statePartyWisePlayerList;
	}
	
	public List<Candidate> getGenderWiseCandidateService(Scanner sc)
	{
		System.out.println("Enter gender: ");
		String gender = sc.nextLine();
		List<Candidate> genderWisePlayerList = new ArrayList<Candidate>();
		for(Candidate c : ElectionService.getAllCandidatesService())
		{
			if(c.getGender().equalsIgnoreCase(gender))
			{
				genderWisePlayerList.add(c);
			}
		}
		
		return genderWisePlayerList;
	}
	
	public List<Candidate> getAgeWiseCandidateService(Scanner sc)
	{
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		List<Candidate> ageWisePlayerList = new ArrayList<Candidate>();
		for(Candidate c : ElectionService.getAllCandidatesService())
		{
			if(c.getAge() == age)
			{
				ageWisePlayerList.add(c);
			}
		}
		
		return ageWisePlayerList;
	}
	public void addCandidateService(Scanner sc)
	{
		dao = new ElectionDao();
		dao.addCandidate(sc);
	}
	public void removeCandidateService(Scanner sc)
	{
		dao = new ElectionDao();
		dao.removeCandidate(sc);
	}
}
