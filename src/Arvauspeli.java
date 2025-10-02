import java.util.Random;
import java.util.Scanner;

public class Arvauspeli {
    public static void main(String[] args) {
        
        //Substring oli vähän outo käyttää mutta oli ihan hauska testailla

        Scanner in = new Scanner(System.in);

        int counter = 0;
        String nimi;
        String[] arvoitus = {"roope", "jekku", "vipu"};
        
        Random random = new Random();
        int index = random.nextInt(arvoitus.length);

        String randomNimi = arvoitus[index];
        int start = 1;
        int end = randomNimi.length();
        boolean maxhint = false;
        
        
        System.out.println("Arvaa nimeni: (Kirjoita loppu jos haluat lopettaa pelin)");
        do
        {
            String hint = randomNimi.substring(0, start) + randomNimi.substring(end);
            nimi = in.nextLine().toLowerCase();
            if (!nimi.equals("loppu"))
            {
                counter++;
                
            }
            
            if (!nimi.equals(randomNimi))
            {
                System.out.println("Väärin. Arvaa uudestaan: ");
                System.out.println("Vihje: "+ hint);
                start++;
            }

            if(start == end)
            {
                maxhint = true;
            }
        
            //jos käyttäjä arvaa nimen, kirjoittaa loppu tai arvaa liian monta kertaa. Peli loppuu!
        } while (!nimi.equals(randomNimi) && !nimi.equals("loppu") && maxhint == false); 
                if(nimi.equals(randomNimi))
                {
                    System.out.println("Onneksi olkoon arvasit nimeni!");
                }
                if (maxhint == true)
                {
                    System.out.println("Harmillisesti et arvannut ennenkuin kaikki vihjeet annettiin.");
                }
                System.out.println("Nimeni oli "+ randomNimi + "!");
                System.out.println("Arvasit "+ counter +" kertaa.");
            

    }
    
}