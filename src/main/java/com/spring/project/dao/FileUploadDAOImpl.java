package com.spring.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.project.model.UploadFile;


@Repository
public class FileUploadDAOImpl implements FileUploadDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public FileUploadDAOImpl() {
	}

	public FileUploadDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Transactional
	public void save(UploadFile uploadFile) {
		sessionFactory.getCurrentSession().save(uploadFile);
	}

}
