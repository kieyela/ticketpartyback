package com.ticket.demo.repositories;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ticket.demo.model.EntityField;

@Component
public class EntityFieldRepository {

	public List<EntityField> getEntityField(String entityName) {
		List<EntityField> entityFields = new ArrayList<>();
		try {
			Class entityClass = Class.forName("com.ticket.demo.model." + entityName);
			
			Field[] entityFieldArray = entityClass.getDeclaredFields();

			for (int i = 0; i < entityFieldArray.length; i++) {
				entityFields.add(new EntityField(entityFieldArray[i].getName(), entityFieldArray[i].getType().getSimpleName()));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return entityFields;
	}
}
