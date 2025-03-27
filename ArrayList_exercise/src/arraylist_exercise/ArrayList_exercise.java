package arraylist_exercise;
import java.util.ArrayList;

public class ArrayList_exercise {
    public static void main(String[] args) {
        ArrayList<String> Burnomars = new ArrayList();
        Burnomars.add("Leav the door open");
        Burnomars.add("That's what i like");
        Burnomars.add("Uptown funkin up");
        Burnomars.add("Lokey that for what i like");
        
        int i;
        for(i=0; i<Burnomars.size(); i++){
            System.out.println(Burnomars.get(i));
        }
    }
    
}
