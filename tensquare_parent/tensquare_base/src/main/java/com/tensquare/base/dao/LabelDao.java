package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 标签数据访问接口，JpaRepository提供了基本的增删改查，JpaSpecificationExecutor提供了复杂的条件查询
 */
public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {
}
