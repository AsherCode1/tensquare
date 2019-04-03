package com.tensquare.article.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.article.pojo.Article;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface ArticleDao extends JpaRepository<Article,String>,JpaSpecificationExecutor<Article>{

    /**
     * 增删改必须使用@Modifying，若多个参数则?1 ?2
     * @param id
     */
    @Modifying
    @Query(value = "UPDATE tb_article SET state = 1 WHERE id = ?", nativeQuery = true)
    public void examine(String id);

    /**
     * 文章点赞
     * @param id
     */
    @Modifying
    @Query(value = "UPDATE tb_article SET thumbup = thumbup+1 WHERE id = ?", nativeQuery = true)
    public void updateThumbup(String id);

}
