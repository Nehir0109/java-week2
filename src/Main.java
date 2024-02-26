import java.util.Scanner;

//Soru 1: Verilen bir cümlede kaç adet boşluk karakteri bulunduğunu bulan bir Java programı yazın.
/*public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Bir cümle yazınız: ");
        String cumle = get.nextLine();

        int bosluk= 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                bosluk++;
            }
        }

        System.out.println(bosluk);

    }
}*/

//Soru 2:Bir kullanıcıdan alınan bir kelimenin palindrom olup olmadığını kontrol eden bir Java programı yazın.
// (Örneğin, "kayak" kelimesi bir palindromdur.)

public class Main {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String kelime = get.nextLine();

        boolean palindrom = true;
        int uzunluk = kelime.length();

        for(int i=0; i<uzunluk/2; i++){
            if(kelime.charAt(i) != kelime.charAt(uzunluk - i-1)){
                palindrom = false;
                break;
            }
        }

        if(palindrom){
            System.out.println(kelime + " bir palindromdur.");
        }else {
            System.out.println(kelime + " bir palindrom değildir.");
        }
    }
}