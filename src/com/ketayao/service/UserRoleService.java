/**
 * <pre>
 * Copyright:		Copyright(C) 2011-2012, ketayao.com
 * Filename:		com.ketayao.services.ArticleService.java
 * Class:			ArticleService
 * Date:			2011-11-23
 * Author:			<a href="mailto:ketayao@gmail.com">ketayao</a>
 * Version          1.0.0
 * Description:		
 *
 * </pre>
 **/
 
package com.ketayao.service;

import java.util.List;

import com.ketayao.pojo.UserRole;

/** 
 * 	
 * @author 	<a href="mailto:ketayao@gmail.com">ketayao</a>
 * Version  1.0.0
 * @created 2011-11-23 下午11:13:23 
 */

public interface UserRoleService {
	
	/**
	 * 
	 * 创建userRole
	 * @param userRole
	 */
	public void create(UserRole userRole);
	
	/**
	 * 
	 * 描述
	 * @return
	 */
	public List<UserRole> findAll();
}
