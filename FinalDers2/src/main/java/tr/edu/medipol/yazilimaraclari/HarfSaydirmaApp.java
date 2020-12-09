package tr.edu.medipol.yazilimaraclari;

public class HarfSaydirmaApp {

    public static void main(String[] args) {


            String cumle = "Medipol Universitesi";
            int harfSayisi = harfleriSaydir(cumle);
            System.out.printf("%s cumledeki harf sayisi: %d %n", cumle, harfSayisi);
            
            int cumleUzunlugu = cumleUzunlugu(cumle);
            System.out.printf("%s cumlenin uzunlugu: %d %n", cumle, cumleUzunlugu);
        }



        static int harfleriSaydir(String cumle) {

            int harfSayisi = 0;
            for (int i = 0; i < cumle.length(); i++) {
                char karakter = cumle.charAt(i);
                if ( Character.isAlphabetic(karakter) ) {
                    harfSayisi++;
                }
            }

            return harfSayisi;

    }
        static int cumleUzunlugu(String cumle) {
        	if (cumle == null) {
        		return 0;
        	}
        	return cumle.length();
        }

}