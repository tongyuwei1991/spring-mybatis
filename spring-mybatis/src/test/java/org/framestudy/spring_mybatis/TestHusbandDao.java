package org.framestudy.spring_mybatis;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Wife;
import org.framestudy.spring_mybatis.relationmag.dao.IHusbandDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestHusbandDao {

	@Resource
	private IHusbandDao husbandDaoImpl;
	
	
	@Test
	public void testMarry(){
		Wife wife = new Wife(1,"Talor",null);
	}

}
