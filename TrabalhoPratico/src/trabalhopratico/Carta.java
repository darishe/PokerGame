/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico;

/**
 *
 * @author 8ctia
 */
public class Carta {
    
    private Naipe naipe;
    private Valor valor;
    
    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }
    
    public String toString(){
        return this.naipe.toString() + "-" + this.valor.toString();
    }
    
    public Valor getValor(){
        return this.valor;
    }
    
    public Naipe getNaipe(){
        return this.naipe;
    }
}
