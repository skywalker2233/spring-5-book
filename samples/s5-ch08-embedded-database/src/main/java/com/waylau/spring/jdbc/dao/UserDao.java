/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.jdbc.dao;

import java.util.List;

import com.waylau.spring.jdbc.vo.User;

/**
 * User DAO.
 * 
 * @since 1.0.0 2018年3月6日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface UserDao {

	/**
	 * 查询用户
	 * 
	 * @return
	 */
	List<User> listUser();

}
