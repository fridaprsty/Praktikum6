/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangundatar;

/**
 *
 * @author Farida Prasetyaning
 */
public class Segitiga extends bangundatar {
    private int alas;
    private int tinggi;
    
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;  
    }
    
    @Override
public void gambar() {
System.out.println("Menggambar Segitiga");
}
@Override
public float luas() {
return this.alas * this.tinggi / 2 ;
}

}
