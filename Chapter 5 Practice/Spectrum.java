import java.util.Scanner;
public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wavelength: ");
        double wavelength = scanner.nextDouble();
        if (wavelength < 1e-11)
        {
            System.out.println("Gamma rays, wavelength < 10^-11, frequency > 3e19");
        }
        else if (wavelength < 1e-8)
        {
            System.out.println("X-rays, wavelength 1e-11 to 1e-8, frequency 3e16 to 3e19");
        }
        else if (wavelength < 4e-7)
        {
            System.out.println("Ultraviolet, wavelength 1e-8 to 4e-7, frequency 7.5e14 to 3e16");
        }
        else if (wavelength < 7e-7)
        {
            System.out.println("Visible light, wavelength 4e-7 to 7e-7, frequency 4e14 to 7.5e14");
        }
        else if (wavelength < 1e-3)
        {
            System.out.println("Infrared, wavelength 7e-7 to 1e-3, frequency 3e11 to 4e14");
        }
        else if (wavelength < 1e-1)
        {
            System.out.println("Microwaves, wavelength 1e-3 to 1e-1, frequency 3e9 to 3e11");
        }
        else
        {
            System.out.println("Radio Waves, wavelength > 1e-1, frequency < 3e9");
        }
    }
}