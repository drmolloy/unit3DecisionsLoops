import java.util.Scanner;

String word = in.next();
for (int n = 0; n< word.lenght(); n++)
{
    int i =(int) (Math.random() * word.length() - 1);
    int j =(int) (Math.random() * (word.length() - i - 1)) + i + 1;
    
    String first = word.substring(0, i);
    String middle = word.substring(i+1,j);
    String last = word.substring(j+1);
    
    word = first+word.charAt(j) + middle + word.charAt(i) + last;
}
System.out.println("Your permuted word is : " + word);
