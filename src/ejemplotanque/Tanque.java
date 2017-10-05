/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotanque;

/**
 *
 * @author Estudiante
 */
public class Tanque {
    private int x;
    private int y;
    private int angulo;
    private String[] imagenes;

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAngulo() {
        return angulo;
    }

    public String[] getImagenes() {
        return imagenes;
    }

    public Tanque(int x, int y) {
        this.x = x;
        this.y = y;
        this.angulo = 1;
        this.imagenes = new String [18];
        for (int i = 0; i< 18;i++){
            this.imagenes[i] = (i+1) + ".png";
        }
    }
}
