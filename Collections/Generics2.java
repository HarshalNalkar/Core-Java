import java .util.ArrayList;
import java.util.Collections;

class Generics2 
{
    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("harshal");
        al.add("makarand");
        al.add("babit");
        al.add("pratik");
        al.add("abhishek");
        al.add("akhilesh");
        al.add("sumit");
        al.add("arbaz");

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
