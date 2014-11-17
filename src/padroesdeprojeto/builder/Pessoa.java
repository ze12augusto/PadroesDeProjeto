/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesdeprojeto.builder;

/**
 *
 * @author ze12augusto
 */
public class Pessoa {

    private String corCamisa;
    private double peso;

    public static Pessoa criaPessoa(){
        return new Pessoa();
    }
    
    public String getCorCamisa() {
        return corCamisa;
    }

    public Pessoa usandoCamisaBranca() {
        this.corCamisa = "Branca";
        return this;
    }

    public double getPeso() {
        return peso;
    }

    public Pessoa pesando60Kilos() {
        this.peso = 60;
        return this;
    }
    
    
}
