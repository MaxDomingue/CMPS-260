package pa06b;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Pa06b {

    public static void main(String[] args) {
        
        ArrayList<Name> names = new ArrayList();
        String first, last;
        File f = new File("names.txt");
        
        try (Scanner input = new Scanner(f)) {
            
            while (input.hasNext()) {
                Name n = new Name();
                n.firstName = input.next();
                n.lastName = input.next();
                names.add(n);
            }
            
        }catch (Exception e) { }
        
        java.util.Collections.sort(names);
        
        for (Name n : names) 
            System.out.println(n);
        
    }
    
}
