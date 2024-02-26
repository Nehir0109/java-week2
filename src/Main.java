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

/*public class Main {
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
}*/

//Soru 3: Kullanıcıdan alınan bir cümlede belirli bir kelimenin kaç kez geçtiğini sayan bir Java programı yazın.

public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String cumle = get.nextLine();

        System.out.print("Sayılacak kelimeyi girin: ");
        String arananKelime = get.nextLine();

        int sayac=0;
        String[] kelimeler = cumle.split("\\s+"); // Boşluklara göre cümleyi parçala
        for (String kelime : kelimeler) {
            // Küçük/kapalı harfe duyarlı olarak kontrol etmek için equalsIgnoreCase kullanılabilir
            if (kelime.toLowerCase().equals(arananKelime.toLowerCase())) {
                sayac++;
            }
        }
        System.out.println("'" + arananKelime + "' kelimesi cümle içinde " + sayac + " kez geçiyor.");

    }
}