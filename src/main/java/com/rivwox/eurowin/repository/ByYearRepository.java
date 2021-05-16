package com.rivwox.eurowin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rivwox.eurowin.model.WinnersModel;

@Repository
public interface ByYearRepository extends CrudRepository<WinnersModel, Long> {
	public List<Object[]> ListWinnerByYear(Long yr);		//notenotenote
}
