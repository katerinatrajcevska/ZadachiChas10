package Zadacha5;
import java.io.IOException;
public class GlavnaPrograma {
    public static void main(String[] args) {
        int x;
        String s="";
        try {
            System.out.println("Vnesete tekst:");
            while((x = System.in.read()) != 13)
                s+=(char)x;
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
