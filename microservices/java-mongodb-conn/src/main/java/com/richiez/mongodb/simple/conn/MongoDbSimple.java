/**
 * 
 */
package com.richiez.mongodb.simple.conn;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * 
 * https://docs.mongodb.com/getting-started/java/query/
 *
 */
public class MongoDbSimple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase mongodb = mongoClient.getDatabase("richiezdb");
		MongoCollection<Document> collection = mongodb.getCollection("customers");

		getCollectionRecordByName(collection, "Richie");
		//getCollectionRecords(collection);
		mongoClient.close();

	}

	/**
	 * 
	 * @param collection
	 * @param record
	 */
	public static void getCollectionRecordByName(MongoCollection<Document> collection, String record) {		
		FindIterable<Document> iterable = collection.find(new Document("first_name", record));
		/**
		 * This code below will also work to retrieve the "Richie" record from mongodb
		 * <pre>
		 * import static com.mongodb.client.model.Filters.eq;
		 * FindIterable<Document> iterate = collection.find(eq("first_name", record));
		 * </pre>
		 */
		
		iterable.forEach(new Block<Document>() {
			@Override
			public void apply(final Document document) {
				System.out.println(document);
			}
		});
	}

	/**
	 * 
	 * @param collection
	 */
	public static void getCollectionRecords(MongoCollection<Document> collection) {
		FindIterable<Document> iterable = collection.find();
		iterable.forEach(new Block<Document>() {
			@Override
			public void apply(final Document document) {
				System.out.println(document);
			}
		});
	}

}
