package com.ticket.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.demo.model.EntityField;
import com.ticket.demo.repositories.EntityFieldRepository;

@Service
public class EntityFieldServiceImpl implements EntityFieldService {
	
	@Autowired
	EntityFieldRepository entityFieldRepository;

	@Override
	public List<EntityField> getEntityField(String entityName) {
		return entityFieldRepository.getEntityField(entityName);
	}

	
}
