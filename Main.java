/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangundatar;

/**
 *
 * @author Farida Prasetyaning
 */
public class Main {
    public static void main(String[] args) {
// membuat objek Shape dari class Persegi
bangundatar persegi = new Persegi(100, 200);
// membuat objek Shape dari class Circle
bangundatar lingkaran = new Lingkaran(50);
// membuat objek Shape dari class Circle
bangundatar segitiga = new Segitiga(10, 5);

/* memanggil method draw */
persegi.gambar();
lingkaran.gambar();
segitiga.gambar();

System.out.println("Luas Lingkaran: " + lingkaran.luas());
System.out.println("Luas Persegi: " + persegi.luas());
System.out.println("Luas Segitiga: " + segitiga.luas());
}
}


