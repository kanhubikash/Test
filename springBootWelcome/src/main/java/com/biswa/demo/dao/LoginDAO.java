/**
 * 
 */
package com.biswa.demo.dao;

import com.biswa.demo.entity.LoginEntity;

/**
 * @author BISWA
 *
 */
public interface LoginDAO {

	public int authenticate(LoginEntity entity);
}
