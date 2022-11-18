import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    ArrayList<String> names = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    // add method to take the values upto n values
    public void add(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name:");
            String s = sc.nextLine();
            System.out.println();
            names.add(s);
            names.replaceAll(String::toUpperCase);
        }
        System.out.println(names);
    }

    // removing element from a particular location
    public void remove(int pos) {
        // removing element from n-1 location
        names.remove(pos);
        System.out.println(names);
    }

    // public void get(int pos) {
    //     System.out.println(names.get(pos));
    // }
    public void printNames(){
        String str;
        int i,j;
        for ( i = 0; i < names.size(); i++)
        {
            str = names.get(i);

            for(j=0;j<str.length();j++){
                if(str.charAt(j)=='A' || str.charAt(j)=='E' || str.charAt(j)=='I' || str.charAt(j)=='U' || str.charAt(j)=='O')
                {
                    System.out.println("The name "+str+" contains vowels "+"and the vowels are "+str.charAt(j));
                }

            }
            int count;

            //Converts given string into character array
            char string[] = str.toCharArray();

            System.out.println("Duplicate characters in a given string: ");
            //Counts each character present in the string
            for(i = 0; i <string.length; i++) {
                count = 1;
                for(j = i+1; j <string.length; j++) {
                    if(string[i] == string[j] && string[i] != ' ') {
                        count++;
                        //Set string[j] to 0 to avoid printing visited character
                        string[j] = '0';
                    }
                }
                //A character is considered as duplicate if count is greater than 1
                if(count > 1 && string[i] != '0')
                    System.out.println(string[i]);
            }



        }

    }



// System.out.println(name);




    public static void main(String args[]) {
        Q4 q = new Q4();
        q.add(1);
        // q.remove(2);
        // q.get(2);
        q.printNames();
    }
}