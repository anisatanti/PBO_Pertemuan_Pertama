/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_pertemuanpertama;

/**
 *
 * @author LENOVO
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan Kucing = new Hewan();
        System.out.println("Nama saya Kucing");
        Kucing.bernafas();
        Kucing.tumbuh();
        Kucing.setjumlahKaki(4);
        Kucing.setalatGerak("Kaki");
        System.out.println("Jumlah kaki saya ada " +Kucing.getjumlahKaki());
        System.out.println("saya bergerak menggunakan " +Kucing.getalatGerak());
        
        Tumbuhan Mangga = new Tumbuhan();
        System.out.println("");
        System.out.println("Nama saya Mangga");
        Mangga.bernafas();
        Mangga.tumbuh();
        Mangga.setWarnaDaun("Hijau");
        Mangga.setArahDaun("Timur");
        Mangga.setjumlahKepingBiji(2);
        System.out.println("Arah daun pagi hari " +Mangga.getArahDaun());
        System.out.println("Warna daun saya " +Mangga.getWarnaDaun());
        System.out.println("Saya adalah tumbuhan dengan biji berkeping" +Mangga.getjumlahKepingBiji());
        
        Aves pipit = new Aves();
        System.out.println("");
        System.out.println("Nama saya pipit");
        pipit.bernafas();
        pipit.tumbuh();
        pipit.setalatGerak("Sayap dan kaki");
        pipit.setjumlahKaki(2);
        System.out.println("saya bergerak menggunakan " +pipit.getalatGerak());
        System.out.println("jumlah kaki saya ada " +pipit.getjumlahKaki());
        pipit.setbentukSayap("Elips");
        pipit.setjenisMakanan("biji-bijian");
        System.out.println("Saya memiliki sayap yang berbentuk " +pipit.getbentukSayap());
        System.out.println("saya pemakan " +pipit.getjenisMakanan());
        
        Pisces ikan_Badut = new Pisces();
        System.out.println("");
        System.out.println("Nama saya ikan Badut");
        ikan_Badut.bernafas();
        ikan_Badut.tumbuh();
        ikan_Badut.setjumlahKaki(0);
        ikan_Badut.setalatGerak("Sirip");
        ikan_Badut.setjumlahSirip(5);
        System.out.println("jumlah kaki saya ada " +ikan_Badut.getjumlahKaki());
        System.out.println("Saya bergerak menggunakan "+ikan_Badut.getalatGerak());
        System.out.println("Saya memiliki sirip sejumlah " +ikan_Badut.getjumlahSirip());
        
        Amphibi Katak = new Amphibi();
        System.out.println("");
        System.out.println("Nama saya Katak");
        Katak.bernafas();
        Katak.tumbuh();
        Katak.setjumlahKaki(4);
        Katak.setalatGerak("Kaki");
        Katak.setcaraBergerak("Melompat");
        Katak.setjenisKulit("berlendir");
        System.out.println("jumlah kaki saya ada " +Katak.getjumlahKaki());
        System.out.println("Saya bergerak menggunakan "+Katak.getalatGerak());
        System.out.println("Saya bergerak dengan cara " +Katak.getcaraBergerak());
        System.out.println("jenis kulit saya " +Katak.getjenisKulit());
        
        Reptil Kura_kura = new Reptil();
        System.out.println("");
        System.out.println("Nama saya Kura-kura");
        Kura_kura.bernafas();
        Kura_kura.tumbuh();
        Kura_kura.setjumlahKaki(4);
        Kura_kura.setalatGerak("Kaki");
        Kura_kura.setbentukGigi("pipih");
        System.out.println("jumlah kaki saya ada " +Kura_kura.getjumlahKaki());
        System.out.println("Saya bergerak menggunakan "+Kura_kura.getalatGerak());
        System.out.println("bentuk gigi saya " +Kura_kura.getbentukGigi());
        
        Mamalia Pesut = new Mamalia();
        System.out.println("");
        System.out.println("Nama saya Pesut");
        Pesut.bernafas();
        Pesut.tumbuh();
        Pesut.setjumlahKaki(0);
        Pesut.setalatGerak("Sirip");
        Pesut.setHabitat("perairan tawar");
        System.out.println("jumlah kaki saya ada " +Pesut.getjumlahKaki());
        System.out.println("Saya bergerak menggunakan "+Pesut.getalatGerak());
        System.out.println("habitat saya ada di " +Pesut.getHabitat());
        
        Monokotil Tebu = new Monokotil();
        System.out.println("");
        System.out.println("Nama saya Tebu");
        Tebu.bernafas();
        Tebu.tumbuh();
        Tebu.setWarnaDaun("Hijau");
        Tebu.setArahDaun("Barat");
        Tebu.setjumlahKepingBiji(1);
        Tebu.setbentukDaun("Panjang dan ramping");
        Tebu.setbentukBatang("Silindris dan beruas-ruas");
        System.out.println("Arah daun saya saat sore hari adalah " +Tebu.getArahDaun());
        System.out.println("Daun saya berwarna " +Tebu.getWarnaDaun());
        System.out.println("Saya adalah tumbuhan dengan biji berkeping " +Tebu.getjumlahKepingBiji());
        System.out.println("Saya memiliki tulang daun dengan jenis " +Tebu.getbentukDaun());
        System.out.println("Saya memiliki bentuk batang "+Tebu.getbentukBatang());
        
        Dikotil Alpukat = new Dikotil();
        System.out.println("");
        System.out.println("Nama saya Alpukat");
        Alpukat.bernafas();
        Alpukat.tumbuh();
        Alpukat.setWarnaDaun("Hijau");
        Alpukat.setArahDaun("Timur");
        Alpukat.setjumlahKepingBiji(2);
        Alpukat.setjenisBuah("Berdaging");
        Alpukat.setjumlahKelipatanBunga(3);
        System.out.println("Arah daun saya saat pagi hari adalah " +Alpukat.getArahDaun());
        System.out.println("Daun saya berwarna " +Alpukat.getWarnaDaun());
        System.out.println("saya adalah tumbuhan dengan biji berkeping " +Alpukat.getjumlahKepingBiji());
        System.out.println("jenis buah saya " +Alpukat.getjenisBuah());
        System.out.println("Saya memiliki kelipatan bunga yang berjumlah "+Alpukat.getjumlahKelipatanBunga());
        
        

    }
    
}
