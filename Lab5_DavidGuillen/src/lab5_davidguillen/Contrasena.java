package lab5_davidguillen;

import javax.swing.JOptionPane;

public class Contrasena {
    private int contraseña;

    public Contrasena() {
    }

    public Contrasena(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
        
    }
    public int conv(int c){
        int numero, exp, digito;
        double binario=0;
        exp=0;
        binario=0;
        while (c != 0) {
            digito = c % 2;
            binario = binario + digito * Math.pow(10, exp);
            exp++;
            c = c / 2;

        }
        int v = (int)binario;
        return v;
    }
}
