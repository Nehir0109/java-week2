import java.util.Arrays;
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

/*public class Main{
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
}*/

//Soru 5: Bir kelimenin içindeki tekrar eden harfleri kaldıran bir Java programı yazın.
// (Örneğin, "programming" kelimesi için "progamin" sonucu alınmalıdır.)

/*public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = get.nextLine();

        StringBuilder yeniKelime = new StringBuilder();

        for(int i=0; i< kelime.length(); i++){
            char charr = kelime.charAt(i);
            if(yeniKelime.indexOf(String.valueOf(charr)) == -1){
                yeniKelime.append(charr);
            }
        }
        System.out.println("Yeni Kelime -> "+ yeniKelime);

    }
}*/

//Soru 7: Bir cümledeki tüm kelimelerin ilk harfini büyük harfe dönüştüren bir Java programı yazın.

/*public class Main{
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String cumle= get.nextLine();

        char[] karakterler = cumle.toCharArray();

        boolean kelimeBaslangici = true;
        for(int i=0; i<karakterler.length; i++){
            if (Character.isLetter(karakterler[i])) {
                if (kelimeBaslangici) {
                    karakterler[i] = Character.toUpperCase(karakterler[i]);
                    kelimeBaslangici = false;
                }
            } else {
                kelimeBaslangici = true;
            }
        }

        String sonuc = new String(karakterler);
        System.out.println("Sonuç: " +sonuc);

    }
}*/

// Soru 8: Bir cümledeki en uzun kelimeyi bulan bir Java programı yazın.
/*public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String cumle = get.nextLine();

        String[] kelimeler = cumle.split(" "); //

        String enUzunKelime = "";
        for (String kelime : kelimeler) {
            if (kelime.length() > enUzunKelime.length()) {
                enUzunKelime = kelime;
            }
        }

        System.out.println("En uzun kelime: " + enUzunKelime);
    }
}*/

//Soru 9: Bir cümlede geçen her kelimenin uzunluğunu hesaplayarak, bu uzunlukları ekrana yazdıran bir Java programı yazın.

/*public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String cumle = get.nextLine();

        String[] kelimeler =cumle.split(" ");
        System.out.println("Her kelimenin uzunluğu:");
        for (String kelime : kelimeler) {
            System.out.println(kelime.length());
        }
    }
}*/

//Soru 10:Bir kelimenin içindeki sesli harfleri ve sessiz harfleri sayan bir Java programı yazın.
// (Örneğin, "Merhaba" kelimesi için 3 sesli, 4 sessiz harf sonucu alınmalıdır.)
/*public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime= get.nextLine();

        int sesli =0;
        int sessiz =0;

        for(int i=0; i<kelime.length(); i++){
            char harf = kelime.charAt(i);
            if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü'){
                sesli ++;
            }else if(harf >= 'a' && harf <= 'z'){
                sessiz ++;
            }
        }

        System.out.print("Sesli harf sayısı: "+ sesli+"\n");
        System.out.print("Sessiz harf sayısı: "+ sessiz);
    }
}*/

//Soru 4: Bir cümledeki kelimeleri tersten sıralayarak ekrana yazdıran bir Java programı yazın.

/*public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String sentence = get.nextLine();

        System.out.println(reverseWords(sentence));
    }
    public static String reverseWords(String sentence){

        String[] words = sentence.split(" ");
        String reverse = "";
        for(int i=words.length -1; i>=0; i--){
            reverse+= words[i];
            if(i != 0){
                reverse+= " ";
            }
        }

        return reverse;
    }
}*/

//Soru 6: Kullanıcıdan alınan iki kelimenin anagram olup olmadığını kontrol eden bir Java programı yazın.
// (Anagramlar, aynı harfleri içeren fakat sıralamaları farklı olan kelimelerdir.)

public class Main{
    public static void main(String[] args){
        Scanner get= new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String word1 = get.nextLine();
        System.out.print("Bir kelime daha giriniz: ");
        String word2 = get.nextLine();

        if(anagram(word1,word2)){
            System.out.println(word1+ " ile " +word2+ " anagramdır.");
        }else {
            System.out.println(word1+ " ile " +word2+ " anagram değildir.");
        }
    }

    public static boolean anagram(String word1, String word2){

        if(word1.length() != word2.length() ){
            return false;
        }

        char[] word1Array = word1.toLowerCase().toCharArray();
        char[] word2Array = word2.toLowerCase().toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        for(int i=0; i<word1Array.length; i++){
            if(word1Array[i] != word2Array[i]){
                return false;
            }
        }

        return true;
    }
}