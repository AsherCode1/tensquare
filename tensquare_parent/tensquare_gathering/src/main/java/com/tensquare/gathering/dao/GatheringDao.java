package com.tensquare.gathering.dao;

import com.tensquare.gathering.pojo.Gathering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface GatheringDao extends JpaRepository<Gathering,String>,JpaSpecificationExecutor<Gathering>{
	
}

