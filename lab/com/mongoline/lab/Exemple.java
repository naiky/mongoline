package com.mongoline.lab;

import java.util.List;

import com.mongoline.lab.model.MongoCache;

public class Exemple {

	public static void main(String[] args) {
		
		MongoCache c1 = new MongoCache("coucou");
		c1.save();
		
		print(MongoCache.getAllMongoCache());
		
		
		
//		AddCall
		
		MongoCache.getByKey("coucou".hashCode()).call();
		MongoCache.getByKey("coucou".hashCode()).call();
		MongoCache.getByKey("coucou".hashCode()).call();
		
		MongoCache.getByKey("coucou".hashCode()).call();
		MongoCache.getByKey("coucou".hashCode()).call();
		MongoCache.getByKey("coucou".hashCode()).call();
		
		MongoCache.getByKey("coucou".hashCode()).call();
		MongoCache.getByKey("coucou".hashCode()).call();
		
		
		MongoCache.deleteAll();
	}

	
	
	private static void print(List<MongoCache> allMongoCache) {
		for (MongoCache mongoCache : allMongoCache) {
			System.out.println(mongoCache.getId() +" "+ mongoCache.getKey()+" "+ mongoCache.getValue());
		}
	}
	
	
}
