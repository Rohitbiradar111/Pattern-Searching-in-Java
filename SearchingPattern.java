//This program gives the index of a pattern present in a String in Java

public class SearchingPattern {
    public static void main(String args[])
    {
        String str = "abcdefgabc";
        String pat = "abc";

        int pos = str.indexOf(pat);
        while(pos>=0)
        {
            System.out.print(pos+" ");
            pos = str.indexOf(pat,pos+1);
        }
    }
}