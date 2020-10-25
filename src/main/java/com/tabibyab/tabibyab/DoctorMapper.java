package com.tabibyab.tabibyab;

import java.util.List;

public interface DoctorMapper {

	List<Doctor> selectDoctors();

	List<Specialty> selectSpecialty();

	List<State> selectState();

	List<State> selectHState();

	int insertPayment(String code);

	int insertAppointment(String payID, String userID, String doctorID);
	
	int updateDOH (Integer appontmentID);
	
	int updateDHH (Integer appontmentID);
	
	List<HealthCareCenter> selectHCC();
	
	List<HDoctor> selectDoctorsHCC(Integer hccID);
	
	List<Doctor> searchName(String searched);
	
	List<Doctor> searchSpecialty(String searched);
	
	int insertDoctor();

}
