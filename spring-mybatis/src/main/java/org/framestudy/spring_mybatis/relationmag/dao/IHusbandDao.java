package org.framestudy.spring_mybatis.relationmag.dao;

import org.apache.ibatis.annotations.Param;
import org.framestudy.spring_mybatis.relationmag.beans.Husband;

public interface IHusbandDao {
	/**
	 * 男女结婚
	 */
	public int marry(@Param("hus")Husband husband);
}
