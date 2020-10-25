package com.tabibyab.tabibyab;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoctorController {

	List<Specialty> specialties;
	List<State> states;
	List<State> hstates;
	
	@RequestMapping("/doctors")
	public String doctors(ModelMap mm) throws IOException {
		List<Doctor> doctors;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			DoctorMapper mapper = session.getMapper(DoctorMapper.class);
			doctors = mapper.selectDoctors();
			
			if (states == null)
				states = mapper.selectState();
			
			if (hstates == null)
				hstates = mapper.selectHState();
			
			if (specialties == null)
				specialties = mapper.selectSpecialty();
			session.commit();
			session.close();
		}
		if (hstates != null)
			mm.addAttribute("hstates", hstates);
		
		if (states != null)
			mm.addAttribute("states", states);
		
		if (specialties != null) {
			mm.addAttribute("specialties", specialties);
		}

		mm.addAttribute("doctors", doctors);

		return "doctors";
	}
	
	@RequestMapping("/pay")
	public String pay(String code,ModelMap mm) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			DoctorMapper mapper = session.getMapper(DoctorMapper.class);
			mapper.insertPayment(code);
			session.commit();
			session.close();
		}
		this.doctors(mm);
		return "doctors";
	}

	
	@RequestMapping("/reserve")
	public String reserve(String payID,String doctorID,String userID,ModelMap mm) throws IOException {
		Integer i = 0;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			DoctorMapper mapper = session.getMapper(DoctorMapper.class);
			i = mapper.insertAppointment(payID,userID,doctorID);
			mapper.updateDOH(i);
			session.commit();
			session.close();
		}
		this.doctors(mm);
		return "doctors";
	}
	
	@RequestMapping("/reserveh")
	public String reserveh(String payID,String doctorID,String userID,ModelMap mm) throws IOException {
		Integer i = 0;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			DoctorMapper mapper = session.getMapper(DoctorMapper.class);
			i = mapper.insertAppointment(payID,userID,doctorID);
			mapper.updateDHH(i);
			session.commit();
			session.close();
		}
		this.doctors(mm);
		return "doctors";
	}
	
	@RequestMapping("/hcc")
	public String hcc(ModelMap mm) throws IOException {
		List<HealthCareCenter> hccs;
		List<HDoctor> doctors = new ArrayList<HDoctor>();
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			DoctorMapper mapper = session.getMapper(DoctorMapper.class);
			hccs = mapper.selectHCC();
			if (hccs != null) {
			for(HealthCareCenter hcc: hccs) {
				doctors.addAll(mapper.selectDoctorsHCC(hcc.hccID));
			}
			}
			session.commit();
			session.close();
		}
		
		mm.addAttribute("doctors",doctors);
		mm.addAttribute("hccs",hccs);
		
		return "hcc";
	}
	
	@RequestMapping("/searchname")
	public String searchname(String searched,ModelMap mm) throws IOException {
		List<Doctor> doctors = null;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			DoctorMapper mapper = session.getMapper(DoctorMapper.class);
			if (searched != null)
			doctors = mapper.searchName(searched);
			session.commit();
			session.close();
		}
		mm.addAttribute("doctors",doctors);
		return "searchname";
	}
	
	@RequestMapping("/searchspecialty")
	public String searchspecialty(String searched,ModelMap mm) throws IOException {
		List<Doctor> doctors = null;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			DoctorMapper mapper = session.getMapper(DoctorMapper.class);
			if (searched != null)
			doctors = mapper.searchSpecialty(searched);
			session.commit();
			session.close();
		}
		
		mm.addAttribute("doctors",doctors);
		return "searchspecialty";
	}
	
	@RequestMapping("/insertdoc")
	public String insertDoc(ModelMap mm) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			DoctorMapper mapper = session.getMapper(DoctorMapper.class);
			mapper.insertDoctor();
			session.commit();
			session.close();
		}
		
	
		return "insertdoc";
	}
	
	
}
