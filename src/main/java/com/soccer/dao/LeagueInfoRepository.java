package com.soccer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.soccer.model.TeamInfo;

@Repository
public interface LeagueInfoRepository extends CrudRepository<TeamInfo, Integer> {

}


