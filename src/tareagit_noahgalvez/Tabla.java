/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareagit_noahgalvez;

/**
 *
 * @author alumnociclo
 */
public class Tabla {
    private int numTabla;

    public int getNumero() {
        return numTabla;
    }

    public void setNumero(int numero) {
        this.numTabla = numero;
    }
    
    public Tabla (int numeroTabla){
        this.numTabla = numeroTabla;
    }
    
    public String pintarTabla(){
        StringBuilder tabla= new StringBuilder();
        for (int i=0; i<11; i++){
            int resultado = this.numTabla*i;
            tabla.append(this.numTabla+" * "+i+" = "+resultado+"\n");
        }
        return tabla.toString();
    }
    
    public String multiplicar(int numero){
        StringBuilder tabla= new StringBuilder();
        int resultado = this.numTabla*numero;
        tabla.append(this.numTabla+" * "+numero+" = "+resultado+"\n");
        
        return tabla.toString();
    }
}
