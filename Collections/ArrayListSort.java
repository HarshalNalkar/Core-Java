import java.util.ArrayList;
import java.util.Collections;

class ArrayListSort
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add(9870);
        al.add(27);
        al.add(89);
        al.add(2);
        al.add(4);

         System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);
    }
}