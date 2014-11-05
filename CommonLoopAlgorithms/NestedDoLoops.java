public class NestedDoLoops
{
    public static void main(String[] args)
    {
        int count= 1;
        int count2 = 1;
        do
        {
            do
            {
                System.out.println(count+ " " + count2);
                count2++;
            }while (count2 <= 4);
            count2=1;
            count++;
        }while (count <=2);
    }
}
