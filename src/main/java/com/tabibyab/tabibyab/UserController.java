package com.tabibyab.tabibyab;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	User base;
	@RequestMapping("/edituser")
	public String editUser(@ModelAttribute("User") User user, ModelMap modelMap) throws IOException {
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		if (base.phonenumber != null && user.firstName != null) {
			try (SqlSession session = sqlSessionFactory.openSession()) {
				UserMapper mapper = session.getMapper(UserMapper.class);
				mapper.editUser(user.firstName, user.lastName, user.gID, user.iID,user.password,user.birthDay,base.phonenumber);
				session.commit();
				session.close();
			}
		}
		modelMap.addAttribute("phonenumber", base.phonenumber);
		return "edituser";
	}

	@RequestMapping("/login")
	public String login(@ModelAttribute("User") User user, ModelMap modelMap) throws IOException {
		User user1 = null;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		if (user.phonenumber != null) {
			try (SqlSession session = sqlSessionFactory.openSession()) {
				UserMapper mapper = session.getMapper(UserMapper.class);
				user1 = mapper.login(user.phonenumber, user.password);
				session.commit();
				session.close();
			}
		}
		if (user1 != null) {
			modelMap.addAttribute("msg", user1.firstName);
			modelMap.addAttribute("visible", "visible");
			base = user1;
		} else {
			modelMap.addAttribute("msg", "user not found!");
			modelMap.addAttribute("visible", "hidden");
		}
		return "login";
	}

	@RequestMapping("/signup")
	public String signup(@ModelAttribute("User") User user, ModelMap modelMap) throws IOException {
		int i = 0;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		if (user.phonenumber != null) {
			try (SqlSession session = sqlSessionFactory.openSession()) {
				UserMapper mapper = session.getMapper(UserMapper.class);
				i = mapper.signup(user.phonenumber, user.password);
				session.commit();
				session.close();
			}
		}
		modelMap.addAttribute("phonenumber", user.phonenumber);
		return "signup";
	}
	
	@RequestMapping("/addfamily")
	public String addFamily(@ModelAttribute("User") User user, ModelMap modelMap) throws IOException {
		int i = 0;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		if (user.phonenumber != null) {
			try (SqlSession session = sqlSessionFactory.openSession()) {
				UserMapper mapper = session.getMapper(UserMapper.class);
				mapper.signup(user.phonenumber, user.password);
				i = mapper.addFamily(base.phonenumber, user.phonenumber);
				session.commit();
				session.close();
			}
		}
		modelMap.addAttribute("phonenumber", user.phonenumber);
		return "addfamily";
	}

	@RequestMapping("/allusers")
	public String getAllUsers(ModelMap mm) throws IOException {
		User user;
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		try (SqlSession session = sqlSessionFactory.openSession()) {
			UserMapper mapper = session.getMapper(UserMapper.class);
			user = mapper.selectUser("09308193353");
			session.commit();
			session.close();
		}

		mm.addAttribute("uu", user.password);

		return "allusers";
	}

}
