import java.util.*;
import java.io.*;

class vol
{
	public static void main (String[] args)
	{
	Scanner r = new Scanner(System.in);
        char b = r.next().charAt(0);
    	if((b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u'))
	{
		System.out.println("vowel");
	}
	else
	{
		System.out.println("consonant");
	}
	}
}
