import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Questions {
    // Create a HashMap to store the questions and answers
    private static final Map<Integer, String[]> immutableQuestionAnswer;
    static {
        Map<Integer, String[]> questionAnswer = new HashMap<>();

        questionAnswer.put(1, new String[] {"Tahun berapa Titanic tenggelam di Samudra Atlantik pada 15 April, dalam pelayaran perdananya dari Southampton?", "1912"});
        questionAnswer.put(2, new String[] {"Apa nama perusahaan teknologi terbesar di Korea Selatan?", "Samsung"});
        questionAnswer.put(3, new String[] {"Logam apa yang ditemukan oleh Hans Christian Oersted pada tahun 1825?", "Aluminium"});
        questionAnswer.put(4, new String[] {"Apa ibu kota Portugal?", "Lisbon"});
        questionAnswer.put(5, new String[] {"Apa simbol kimia untuk perak?", "Ag"});
        questionAnswer.put(6, new String[] {"Berapa umur rata-rata dari capung? (dalam jam)", "24"});
        questionAnswer.put(7, new String[] {"Siapa yang menemukan kaleng untuk melestarikan makanan pada tahun 1810?", "Peter Durand"});
        questionAnswer.put(8, new String[] {"Di tahun berapakah The Godfather pertama kali dirilis?", "1972"});
        questionAnswer.put(9, new String[] {"Aktor mana yang memenangkan Oscar aktor terbaik untuk film Philadelphia (1993) dan Forrest Gump (1994)?", "Tom Hanks"});
        questionAnswer.put(10, new String[] {"Aktris mana yang memerankan Mary Poppins dalam film 1964 Mary Poppins?", "Julie Andrews"});
        questionAnswer.put(11, new String[] {"Aktris Amerika yang berperan sebagai bos dunia bawah Tokyo O-Ren Ishii di KillBill Vol I & II", "Lucy Liu"});
        questionAnswer.put(12, new String[] {"Di film mana Hugh Hughman berperan sebagai penyihir saingan dari karakter yang diperankan oleh Christian Bale?", "The Prestige"});
        questionAnswer.put(13, new String[] {"Sutradara film Frank Capra yang terkenal dengan It's a Wonderful Life lahir di negara mediterania mana?", "Italia"});
        questionAnswer.put(14, new String[] {"Apa nama film 2015 tentang seorang perbatasan pada ekspedisi perdagangan bulu pada tahun 1820-an dan perjuangannya untuk bertahan hidup setelah dianiaya oleh beruang?", "The Revenant"});
        questionAnswer.put(15, new String[] {"Film mana yang dibintangi oleh Chris Hemsworth dan Daniel Brühl, memetakan persaingan formula 1 James Hunt dan Niki Lauda?", "Rush"});
        immutableQuestionAnswer = Collections.unmodifiableMap(questionAnswer);
    }
    
    // Returns question for the given question number.
    public static String getQuestion(int number) {
        return immutableQuestionAnswer.get(number)[0];
    }

    // Returns the answer for the given question number.
    public static String getAnswer(int number) {
        return immutableQuestionAnswer.get(number)[1];
    }

    // Returns number of question and answers
    public static int getQuestionAnswerCount() {
        return immutableQuestionAnswer.size();
    }
    
}
