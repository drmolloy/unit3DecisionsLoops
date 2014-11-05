public class NestedWhileLoops
{
    public static void main(String[] args)
    {
        int count= 1;
        int count2 = 1;
        while (count <=2)
        {
            while (count2 <= 4)
            {
                System.out.println(count+ " " + count2);
                count2++;
            }
            count2=1;
            count++;
        }
    }
}
