package Pertemuan2;

public class main {
    public static void main (String[] args) {
        Hewan a = new Hewan();
        Manusia b = new Manusia();
        pesawatTelepon c = new pesawatTelepon();
        
        System.out.println(b.nama("Ricky") + a.bermain("Ular") + "Saya tidak bisa " + c.terima_panggilan("telepon"));
    }
}