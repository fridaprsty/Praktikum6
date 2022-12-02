/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangundatar;

public class Persegi extends bangundatar {
private float tinggi;
private float lebar;

public Persegi(float tinggi, float lebar) {
this.tinggi = tinggi;
this.lebar= lebar;
}
@Override
public void gambar() {
System.out.println("Gambar Persegi");
}
@Override
public float luas() {
return this.tinggi * this.lebar;
}
}