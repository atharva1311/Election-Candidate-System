package com.tka.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tka.entity.Candidate;
import com.tka.utility.ElectionUtility;

public class ElectionDao {

	List<Candidate> allCandidates = new ArrayList<Candidate>();
	String sqlQuery = "SELECT * from advjava193.candidate";

	public List<Candidate> getAllCandidates() {

		try {
			Statement statement = ElectionUtility.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(sqlQuery);

			while (rs.next()) {
				int cid = rs.getInt("cid");
				String name = rs.getString("name");
				String party = rs.getString("party");
				String state = rs.getString("state");
				String assembly = rs.getString("assembly");
				int assem_no = rs.getInt("assembly_no");
				String status = rs.getString("status");
				String gen = rs.getString("gender");
				int age = rs.getInt("age");

				Candidate obj = new Candidate(cid, name, party, state, assembly, assem_no, status, gen, age);
				allCandidates.add(obj);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allCandidates;
	}

	public void addCandidate(Scanner sc) {
		System.out.println("Enter candidate name:  ");
		String name = sc.nextLine();
		System.out.println("Enter candidate party name: ");
		String party = sc.nextLine();
		System.out.println("Enter candidate state name: ");
		String state = sc.nextLine();
		System.out.println("Enter candidate assembly name: ");
		String assembly_name = sc.nextLine();
		System.out.println("Enter candidate assembly number: ");
		int assembly_no = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter candidate status: ");
		String status = sc.nextLine();
		System.out.println("Enter candidate gender: ");
		String gender = sc.nextLine();
		System.out.println("Enter candidate age : ");
		int age = sc.nextInt();
		sc.nextLine();

		String sqlQuery2 = "INSERT INTO candidate(name,party,state,assembly,assembly_no,status,gender,age) VALUES (?,?,?,?,?,?,?,?) ";

		try {
			PreparedStatement preparedStatement = ElectionUtility.getConnection().prepareStatement(sqlQuery2);

			preparedStatement.setString(1, name);
			preparedStatement.setString(2, party);
			preparedStatement.setString(3, state);
			preparedStatement.setString(4, assembly_name);
			preparedStatement.setInt(5, assembly_no);
			preparedStatement.setString(6, status);
			preparedStatement.setString(7, gender);
			preparedStatement.setInt(8, age);

			int rowInserted = preparedStatement.executeUpdate();

			if (rowInserted > 0) {
				System.out.println("Candidate added successfully...!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removeCandidate(Scanner sc)
	{
		System.out.println("Enter candidate name: ");
		String name=sc.nextLine();
		
		String sqlQuery3 = "DELETE FROM candidate WHERE name=? ";
		
		try {
			PreparedStatement preparedstatement = ElectionUtility.getConnection().prepareStatement(sqlQuery3);
			
			preparedstatement.setString(1,name);
			
			int rowDeleted = preparedstatement.executeUpdate();
			
			if(rowDeleted>0)
			{
				System.out.println("Candidate removed successfully...!");
			}
			else
			{
				System.out.println("Candidate not found in a database...!");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
