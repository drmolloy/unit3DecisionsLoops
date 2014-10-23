import java.util.Scanner;
public class Spectrum
{
     public static void main(String[] args)
     {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the wavelength value: ");
        double wavelength = s.nextDouble();
        System.out.println("Type       Wavelength(m)       Frequency(Hz)");
        if (wavelength > 1.0)
        {
            System.out.println("Radio Waves     > 10^-1          <3x10^9");
        }
        else if (wavelength > .01)
        {
            System.out.println("Microwaves     10^-3 to 10^-1        <3x10^9 to 3x10^11");
        }
        else if (wavelength > Math.pow(10,-7)*7)
        {
            System.out.println("Infared    7x10^-7 to 10^-3        3x10^11 to 4x10^14");
        }
        else if (wavelength > Math.pow(10,-7)*4)
        {
            System.out.println("Visible Light    4x10^-7 to 7x10^-7        4x10^14 to 7.5x10^14");
        }
        else if (wavelength > Math.pow(10,-8))
        {
            System.out.println("Ultraviolet     10^-8 to 4x10^-7       7.5x10^14 to 3x10^16");
        }
        else if (wavelength > Math.pow(10,-11))
        {
            System.out.println("Ultraviolet     10^-11 to 10^-8      3x10^16 to 3x10^19");
        }
         else
        {
            System.out.println("Gamma Rays         <10^-11         >3x10^19");
        }
    }
}
       