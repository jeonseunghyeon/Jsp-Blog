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
	//ȸ������,ȸ������,�α���,�α׾ƿ�,���̵��ߺ�üũ
	
	public UserService() {
		userDao = new UserDao();
		
	}

	public int ȸ������(JoinReqDto dto) {
		
		int result =  userDao.save(dto);
		return result;
		
		
	}
	
	public User �α���(LoginReqDto dto) {
		
		return null;
		
	}
	
	public int ȸ������(UpdateReqDto dto) {
		
		
		return-1;
		
	}
	
	public int ���̵��ߺ�üũ(String username) {
		
		return-1;
		
	}
	
	
}
