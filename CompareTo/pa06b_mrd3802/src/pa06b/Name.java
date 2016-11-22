package pa06b;


public class Name implements Comparable<Name>
{
    public String firstName;
    public String lastName;
   
    public String toString() {
        return lastName + ", " + firstName;
    }
    
    
    /*
 1.    If the last name of the calling Name instance object is greater than the last name of the 
passed Name instance object, return a positive integer.
 2. If the last name of the calling Name instance object is less than the last name of the 
passed Name instance object, return a negative integer.

    */

    public int compareTo(Name other) 
    {   //compare last names
        int result =  this.lastName.compareTo(other.lastName) ;
        if(result == 0)
            result = this.firstName.compareTo(other.firstName);
        return result;
        
    }
}
