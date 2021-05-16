package com.rivwox.eurowin.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import com.rivwox.eurowin.model.WinnersModel;

public class ByYearRepositoryImpl implements ByYearRepository{
	
	@PersistenceContext
	private EntityManager em;		//notenotenote
	
	@Override
	public <S extends WinnersModel> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends WinnersModel> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<WinnersModel> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<WinnersModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<WinnersModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(WinnersModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends WinnersModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object[]> ListWinnerByYear(Long yr) {
		Query qy=em.createNativeQuery("select * from eurovisionwins where year= ?");
		qy.setParameter(1, yr);
		List<Object[]> list = qy.getResultList();
		return list;
	}

}
