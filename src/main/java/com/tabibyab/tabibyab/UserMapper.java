package com.tabibyab.tabibyab;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	User selectUser(String phonenumber);
	int signup(String phonenumber, String password);
	User login(String phonenumber, String password);
	int addFamily(String uID, String fID);
	int editUser(String firstname,String lastname,Integer gid,Integer iid,String password,String birthday,String phonenumber);
}
