package Connection;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DataBaseConnection {

	public static void main(String[] args) {
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	      //Connecting to the database
	      MongoDatabase database = mongo.getDatabase("Dell");
	      //Creating a collection
	     // database.createCollection("dellcollection");
	      MongoCollection<Document> coll = database.getCollection("dellcollection");
	      System.out.println("Collection created successfully");
			
			Document doc=new Document("name","simple");
			doc.append("name :", "Jahangir");
			doc.append("id ", "002");
			doc.append("city", "hydrabad");
	      
			System.out.println("data Inserted Successfully...");
			
	Iterator	it=coll.find().iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	}

}
