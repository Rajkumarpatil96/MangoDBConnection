package Connection;

import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.DBCollectionRemoveOptions;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.MongoClient;
public class GoogleCode {

	public static void main(String[] args) {
		
	
		      //Creating a MongoDB client
		      MongoClient mongo = new MongoClient( "localhost" , 27017 );
		      //Connecting to the database
		      MongoDatabase database = mongo.getDatabase("myDatabase");
		      //Creating a collection
		     // database.createCollection("students");
		      //Preparing a document
		      Document document1 = new Document();
		      document1.append("name", "Raj");
		      document1.append("age", 27);
		      document1.append("city", "Mumbai");
		      //Inserting the document into the collection
		      database.getCollection("students").insertOne(document1);
		      System.out.println("Document inserted successfully");
		      
		     MongoCursor<Document> fetch = database.getCollection("students").find().iterator();
		    while(fetch.hasNext())
		    {
		    	System.out.println(fetch.next());
		    }
		    
		   }
		
	}


