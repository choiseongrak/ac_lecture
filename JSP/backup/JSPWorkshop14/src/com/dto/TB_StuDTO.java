package com.dto;

public class TB_StuDTO {
	private String student_no;
	private String department_no;
	private String student_name;
	private String student_ssn;
	private String student_address;
	private String edate;
	private String absence_yn;
	private String coach_professon_no;
	
	public TB_StuDTO() {
		// TODO Auto-generated constructor stub
	}

	public TB_StuDTO(String student_no, String department_no, String student_name, String student_ssn,
			String student_address, String edate, String absence_yn, String coach_professon_no) {
		super();
		this.student_no = student_no;
		this.department_no = department_no;
		this.student_name = student_name;
		this.student_ssn = student_ssn;
		this.student_address = student_address;
		this.edate = edate;
		this.absence_yn = absence_yn;
		this.coach_professon_no = coach_professon_no;
	}

	public String getStudent_no() {
		return student_no;
	}

	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}

	public String getDepartment_no() {
		return department_no;
	}

	public void setDepartment_no(String department_no) {
		this.department_no = department_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_ssn() {
		return student_ssn;
	}

	public void setStudent_ssn(String student_ssn) {
		this.student_ssn = student_ssn;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public String getAbsence_yn() {
		return absence_yn;
	}

	public void setAbsence_yn(String absence_yn) {
		this.absence_yn = absence_yn;
	}

	public String getCoach_professon_no() {
		return coach_professon_no;
	}

	public void setCoach_professon_no(String coach_professon_no) {
		this.coach_professon_no = coach_professon_no;
	}

	

}