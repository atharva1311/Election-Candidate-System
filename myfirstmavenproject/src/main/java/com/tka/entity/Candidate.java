package com.tka.entity;

public class Candidate {

	private int c_id;
	private String name;
	private String party;
	private String state;
	private String assembly;
	private int assembly_no;
	private String status;
	private String gender;
	private int age;

	public Candidate() {
		super();
	}

	public Candidate(int c_id, String name, String party, String state, String assembly, int assembly_no, String status,
			String gender, int age) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.party = party;
		this.state = state;
		this.assembly = assembly;
		this.assembly_no = assembly_no;
		this.status = status;
		this.gender = gender;
		this.age = age;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public int getAssembly_no() {
		return assembly_no;
	}

	public void setAssembly_no(int assembly_no) {
		this.assembly_no = assembly_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", party=" + party + ", state=" + state + ", assembly=" + assembly + "]";
	}

}
