/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangundatar;

/**
 *
 * @author Farida Prasetyaning
 */
import java.lang.Math;

public class Lingkaran extends bangundatar {
    
private float radius;

public Lingkaran(float radius) {
this.radius = radius;
}
@Override
public void gambar() {
System.out.println("Menggambar Lingkaran");
}
@Override
public float luas() {
return (float) (Math.PI * radius * radius);
}
}