package com.ticket.demo.services;

import java.util.List;

import com.ticket.demo.model.EntityField;

public interface EntityFieldService {

	List<EntityField> getEntityField(String entityName);

}
