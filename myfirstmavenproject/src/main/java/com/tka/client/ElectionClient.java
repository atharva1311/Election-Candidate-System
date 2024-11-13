package com.tka.client;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.tka.controller.ElectionController;
import com.tka.entity.Candidate;

public class ElectionClient {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			ElectionController c1 = new ElectionController();
			int choice;
			do {
				System.out.println("  ** Welcome to Our Website **   ");
				System.out.println();
				System.out.println("***** Election Candidate Management *****");
				System.out.println();
				System.out.println("1. View All Candidates");
				System.out.println("2. View All Parties");
				System.out.println("3. Add Candidate");
				System.out.println("4. Remove Candidate");
				System.out.println("5. View Party wise Candidate ");
				System.out.println("6. View Assembly wise Candidate");
				System.out.println("7. View Gender wise Candidate ");
				System.out.println("8. View Age wise Candidate");
				System.out.println("9. Exit");
				System.out.println("Enter your choice: ");
				
				choice=sc.nextInt();
				sc.nextLine();
				switch(choice)
				{
				case 1:
					List<Candidate>l1 = c1.getAllCandidatesController(sc) ;
					System.out.println("----------------------------------");
					System.out.printf("| %-30s |\n", "Name of Candidate");
					System.out.println("----------------------------------");
					for(Candidate c:l1)
					{
						System.out.printf("| %-30s |\n", c.getName());
					}
					System.out.println("----------------------------------");
					System.out.println();
					break;
				case 2:
					Set<String> s1 = c1.getAllPartiesController();
					System.out.println("--------------------------------");
					System.out.printf("| %-28s |\n", "Name of Parties");
					System.out.println("--------------------------------");
					for(String s:s1)
					{
						System.out.printf("| %-28s |\n", s);
					}
					System.out.println("--------------------------------");
					System.out.println();
					break;
				case 3:
					c1.addCandidateController(sc);
					break;
				case 4:
					c1.removeCandidateController(sc);;
					break;
				case 5:
					List<Candidate>l2 = c1.getPartyWiseCandidateController(sc);
					System.out.println("----------------------------------");
					System.out.printf("| %-30s |\n", "Name of Candidate");
					System.out.println("----------------------------------");
					for(Candidate c:l2)
					{
						System.out.printf("| %-30s |\n", c.getName());
					}
					System.out.println("----------------------------------");
					System.out.println();
					break;
				case 6:
					List<Candidate>l3 = c1.getAssemblyWiseCandidateController(sc);
					System.out.println("----------------------------------");
					System.out.printf("| %-30s |\n", "Name of Candidate");
					System.out.println("----------------------------------");
					for(Candidate c:l3)
					{
						System.out.printf("| %-30s |\n", c.getName());
					}
					System.out.println("----------------------------------");
					System.out.println();
					break;
				case 7:
					List<Candidate>l4 = c1.getGenderWiseCandidateController(sc);
					System.out.println("----------------------------------");
					System.out.printf("| %-30s |\n", "Name of Candidate");
					System.out.println("----------------------------------");
					for(Candidate c:l4)
					{
						System.out.printf("| %-30s |\n", c.getName());
					}
					System.out.println("----------------------------------");
					System.out.println();
					break;
				case 8:
					List<Candidate>l5 = c1.getAgeWiseCandidateController(sc);
					System.out.println("----------------------------------");
					System.out.printf("| %-30s |\n", "Name of Candidate");
					System.out.println("----------------------------------");
					for(Candidate c:l5)
					{
						System.out.printf("| %-30s |\n", c.getName());
					}
					System.out.println("----------------------------------");
					System.out.println();
					break;
				case 9:
					System.out.println("Thank You for visiting our site..!");
					System.out.println();
					return;
				
				default:
					System.out.println("Invalid choice. Try again..!");
				}
				
					
				
			}
			while(true);
			
		}
	}

