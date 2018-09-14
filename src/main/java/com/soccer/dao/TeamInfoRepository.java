package com.soccer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.soccer.model.TeamInfo;

//@RepositoryDefinition(domainClass = TeamInfo.class, idClass = Integer.class)  
@Repository
public interface TeamInfoRepository extends CrudRepository<TeamInfo, Integer> 
{

	// 使用query 注解进行update 或者 delete 语句时，需要添加 modifying 注解修饰  
    @Query(value="delete from team_info",nativeQuery=true)  
    @Modifying  
    public void deleteAllBySql(); 
    
    List<TeamInfo> findByTeamNameEn(String teamNameEn);
    
}
