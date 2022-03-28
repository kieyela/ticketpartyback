package com.ticket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.demo.model.EntityField;
import com.ticket.demo.services.EntityFieldService;

@RestController
public class EntityController {
	@Autowired
	EntityFieldService entityFieldService;

	@RequestMapping(value = "/{entityName}/fields", produces = "application/json")
	public List<EntityField> updateTicket(@PathVariable("entityName") String entityName) {

		return entityFieldService.getEntityField(entityName);
	}
}
