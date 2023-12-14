import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Phone {
    private Map<String ,String > contacts;

    public Phone(Map<String, String> contacts) {
        this.contacts = contacts;
    }
    public String addContact(String name,String number){
        if(!contacts.containsKey(name)){
            contacts.put(name,number);
            return "Contact with name "+ name + " saved";
        }else{
            return "Contact with name "+ name + " exist";
        }
    }
    public Map<String,String> getContacts(String key){
        Map<String,String> contact = new HashMap<>();
        for (String name : contacts.keySet()){
            if(name.equals(key)){
                contact.put(name,contacts.get(name));
                return contact;
            }
        }
        return contact;
    }
    public void removeContact(String name){
        String value = contacts.remove(name);
        System.out.println(value);
    }
    public Map<String,String> getContact(){
        return contacts;
    }
}
