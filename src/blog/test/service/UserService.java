package blog.test.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import blog.config.DB;
import blog.domain.user.User;
import blog.domain.user.UserDao;
import blog.domain.user.dto.JoinReqDto;
import blog.domain.user.dto.LoginReqDto;
import blog.domain.user.dto.UpdateReqDto;

public class UserService {
	
	private UserDao userDao;
	//회원가입,회원수정,로그인,로그아웃,아이디중복체크
	
	public UserService() {
		userDao = new UserDao();
		
	}

	public int 회원가입(JoinReqDto dto) {
		
		int result =  userDao.save(dto);
		return result;
		
		
	}
	
	public User 로그인(LoginReqDto dto) {
		
		return null;
		
	}
	
	public int 회원수정(UpdateReqDto dto) {
		
		
		return-1;
		
	}
	
	public int 아이디중복체크(String username) {
		
		return-1;
		
	}
	
	
}
