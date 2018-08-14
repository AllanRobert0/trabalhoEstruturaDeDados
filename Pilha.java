/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaspilhas;

/**
 *
 * @author Owner
 */
public class Pilha {
    
    public int topo;
    public int base;
    public char elem[];
    public int m;

    public Pilha(int topo, int base, char[] elem, int m) {
        this.topo = topo;
        this.base = base;
        this.elem = elem;
        this.m = m;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
   
    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public char[] getElem() {
        return elem;
    }

    public void setElem(char[] elem) {
        this.elem = elem;
    }
    
    // Metodos de controle da pilha
    
    public boolean pilhaVazia(Pilha pilha){
        
        return pilha.getTopo() < pilha.getBase();
    }
        
    public boolean pilhaCheia(Pilha pilha){
        
        return pilha.getTopo() == (10-1);
    }
    
    public void empilhar(Pilha pilha, char x){
        
        if (!pilhaCheia(pilha)) {
            
            pilha.setTopo((pilha.getTopo() + 1));
            pilha.elem[pilha.getTopo()] = x;
        }
    }
    
    public void desempilhar (Pilha pilha, int x){
        
        if (!pilhaVazia(pilha)) {
            
            x = pilha.elem[pilha.getTopo()];
            pilha.setTopo((pilha.getTopo() - 1));
        }
    }
    
    public int buscaTopo(Pilha pilha){
        
        return this.getTopo();
    }
}
