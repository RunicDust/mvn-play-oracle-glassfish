package model;

public class User {
	int user_id;
	private String first_name;
	private String last_name;
	private String job;
	private String department;
	private String email;
	private String phone_number;

	// for insertion in DB
	private String hire_date;
	private String job_id;
	private double salary;
	private double commission_pct;
	private int manager_id;
	private int department_id;
	
	public String getFullName(){
		return new StringBuilder().append(this.first_name).append(" ").append(last_name).toString();	
	}
	
	public void setFirstName(String first_name){
		this.first_name = first_name;
	}
	public void setLastName(String last_name){
		this.last_name = last_name;
	}
}
