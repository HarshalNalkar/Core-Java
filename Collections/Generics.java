import java.util.ArrayList;

class Generics 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(83);
        al.add(81);
        al.add(21);
        al.add(45);
        al.add(74);
        
        for(Object i : al)
        {
            System.out.println(i);
        }
    }
}
