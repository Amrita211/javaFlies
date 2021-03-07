package zExtraQuestions;
// implementation of HashMap using Array
import java.util.Scanner;
import java.util.jar.Manifest;

public class  arrayHashMap {
    Entity[] entities = new Entity[100];

    // putting a value in entities
    public void putting(String key, String value){
        int hashcode = Math.abs(key.hashCode()%entities.length);
        entities[hashcode]= new Entity(key,value);
    }

    // getting a value for a particular key in entities
    public String getting(String key){
        int hashcode = Math.abs(key.hashCode()%entities.length);
        if(entities[hashcode].key.equals(key)){
            return entities[hashcode].value;
        }
        return null;
    }

    // removing an Entity for a particular key
    public String removing(String key){
        Entity target=null;
        int hashcode = Math.abs(key.hashCode()%entities.length);
        if(entities[hashcode].key.equals(key)){
         target= entities[hashcode];
         entities[hashcode]=null;
        }
        String temp = target.value;
        return temp;
    }

//    displaying
//    public void display(){    // error aa raha hai Bisi :(
//        for (Entity ent:entities){
//            int hashcode = Math.abs(ent.key.hashCode()%entities.length);
//            String key1= entities[hashcode].key;
//            String value1 = entities[hashcode].value;
//            System.out.println(key1+" = "+value1+" ");
//        }
//    }
    public class Entity{
        String key;
        String value;
        public Entity(String key, String value){
            this.key= key;
            this.value=value;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        arrayHashMap obj = new arrayHashMap();
        obj.putting("fruit","mango");
        obj.putting("animal","cow");
        obj.putting("bird","owl");

//        obj.display();
        System.out.println(obj.getting("animal"));
        System.out.println("removed value is: "+obj.removing("animal"));
//        System.out.println(obj.getting("animal"));    // give null pointer exception as animal is removed from entities
//        obj.display();
    }
}
