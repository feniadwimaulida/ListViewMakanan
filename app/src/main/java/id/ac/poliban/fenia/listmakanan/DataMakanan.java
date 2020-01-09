package id.ac.poliban.fenia.listmakanan;

import java.util.ArrayList;
import java.util.List;

public class DataMakanan {
    static List<Makanan> getAllMakanan() {
        List<Makanan> data = new ArrayList<>();
        {
            data.add(new Makanan("https://id.wikipedia.org/wiki/Berkas:Nasi_goreng_Solaria_Kuta.JPG", "Nasi Goreng", "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti bawang putih, bawang merah, merica dan kecap manis. Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging. Makanan tersebut seringkali disantap sendiri atau disertai dengan hidangan lainnya. Nasi goreng adalah komponen populer dari masakan Asia Timur, Tenggara dan Selatan pada wilayah tertentu. Sebagai hidangan buatan rumah, nasi goreng biasanya dibuat dengan bahan-bahan yang tersisa dari hidangan lainnya, yang berujung pada ragam yang tak terbatas."));
            data.add(new Makanan("https://id.wikipedia.org/wiki/Berkas:Mi_ayam_pangsit_kuah.JPG", "Bakmi", "Bakmi adalah salah satu jenis sajian mi yang dipopulerkan oleh pedagang-pedagang Tiongkok ke Indonesia. Bakmi juga sering disebut yamien atau yahun. Bakmi juga merupakan makanan yang terkenal terutama di daerah-daerah \"pecinan\" di Indonesia. Biasanya bakmi telah diadaptasi dengan menggunakan bumbu-bumbu Indonesia. Tebalnya bakmi adalah antara Mian Cina dan Udon Jepang, selain itu ada berbagai variasi bakmi di Indonesia. "));
            data.add(new Makanan("https://id.wikipedia.org/wiki/Berkas:Siumaai.jpg", "Siomay", "Siomai adalah salah satu jenis dim sum. Dalam bahasa Mandarin, makanan ini disebut shaomai, sementara dalam bahasa Kanton disebut siu maai. Dalam dialek Beijing, makanan ini juga ditulis sebagai 燒麥, dan juga dibaca shaomai. Kulit siomai serupa dengan kulit pangsit. Makanan ini konon berasal dari Mongolia Dalam. "));
            data.add(new Makanan("https://id.wikipedia.org/wiki/Berkas:Batagor_Savoy_Homann_Bandung.jpg", "Batagor", "Batagor (akronim dari bakso tahu goreng) (Aksara Sunda Baku: ᮘᮒᮍᮧᮁ) merupakan jajanan khas Bandung[1] yang mengadaptasi gaya Tionghoa-Indonesia dan kini sudah dikenal hampir di seluruh wilayah Indonesia. "));
            data.add(new Makanan("https://id.wikipedia.org/wiki/Berkas:Sate_Ponorogo.jpg", "Sate", "Sate (ejaan KBBI: satai) adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu kemudian dipanggang menggunakan bara arang kayu. Sate disajikan dengan berbagai macam bumbu yang bergantung pada variasi resep sate. Daging yang dijadikan sate antara lain daging ayam, kambing, domba, sapi, babi, kelinci, kuda, dan lain-lain. "));
        }
        return data;
    }
}




