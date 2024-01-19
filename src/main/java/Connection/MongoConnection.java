package Connection;



import java.util.Iterator;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class MongoConnection {
	public static void main(String[] args) {
		
	
MongoClient mongo=new MongoClient("localhost",27017);
MongoDatabase db=mongo.getDatabase("Nexwave");
System.out.println(" database Connection created.... ");

MongoCollection<Document> call=db.getCollection("Oneable");

System.out.println("Collection Created...");

Document doc=new Document("name","mhaku");
//BasicDBObject dbObj=new BasicDBObject();
//dbObj.put("id", "001");
//dbObj.append("name", "Mhaku");
//dbObj.append("id", "101");
//dbObj.append("city", "Kolhapur");
//dbObj.append("sallary", "30000");

System.out.println("inserted Successfully.");
doc.append("id", "101");
doc.append("city", "kolhapur");
call.insertOne(doc);
System.out.println("record Inserted...");



	}
}
