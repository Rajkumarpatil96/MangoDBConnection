package Connection;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DeleteDocument {

	public static void main(String[] args) {
		// Creating a Mongo client 
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 ); 
		System.out.println("Created Mongo Connection successfull");
		
		MongoDatabase db = mongoClient.getDatabase("youtube");
		System.out.println("Get database is successful");
		
		//creating collection or get collection if exists.
		MongoCollection<Document>  collection= db.getCollection("channels");
		System.out.println("collection created ");
		
		//Inserting sample records by creating documents.
//		Document doc =new Document("name","SimplifyingTech");
//		doc.append("id",101);  
//		doc.append("Subscribers",100);  
//		doc.append("Genre", "Programming");
//		collection.insertOne(doc);
//		System.out.println("Insert is completed");
		 
		Document doc2 =new Document("name","CarryMinati");
//		doc2.append("id",102);  
//		doc2.append("Subscribers",24000000);  
//		doc2.append("Genre", "Comedy");
//		collection.insertOne(doc2);
//		System.out.println("Insert is completed");
//		
		collection.deleteOne(doc2);
		System.out.println("Deleted Successfully..");
	}

}
