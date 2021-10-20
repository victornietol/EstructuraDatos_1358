/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.unam.edd1358;

/**
 *
 * @author Victor
 */
public class LinkedListADT {
    private class Nodo<T>{
        T data;
        Nodo next;
        
        public Nodo(T valor){
            this.data = valor;
        }
        
        public Nodo(T valor, Nodo siguiente){
            this.data = valor;
            this.next = siguiente;
        }
        
    }
    
    private Nodo head;
    
    public LinkedListADT() {
        this.head = null;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public Nodo getTail(){
        Nodo currNode = this.head;
        if(!this.isEmpty()){
            while (currNode.next != null){
                currNode = currNode.next;
            }
        }
        return currNode;
    }
    
    public void append(Object valor){
        if(this.isEmpty()){
            this.head = new Nodo(valor);
        }else{
            this.getTail().next = new Nodo(valor);
        }
    }
    
    public void prepend(Object valor){
        if(this.isEmpty()){
            this.head = new Nodo(valor);
        }else{
            this.head = new Nodo(valor, this.head);
        }
    }
    
    public void transversal(){
        Nodo currNode = this.head;
        while (currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("");
    }
    
    public void remove(Object valor){
        Nodo currNode = this.head;
        boolean aux = false;
        this.head = null;
        while (currNode != null) {            
            if(currNode.data == valor){
                aux = true;
                currNode = currNode.next;
                break;
            }
            this.append(currNode.data);
            currNode = currNode.next;
        }
        while (currNode!= null) {            
            this.append(currNode.data);
            currNode = currNode.next;
        }
        if(aux == false){
            System.out.println("Elemento no encontrado");
        }
    }
    
    public Nodo pop(){
        Nodo currNode = this.head;
        this.head = null;
        while (currNode != null) {            
            if(currNode.next == null){
                return currNode;
            }else{
                this.append(currNode.data);
                currNode = currNode.next;
            }
        }
        return currNode;
    }
    
    public Nodo popFirst(){
        Nodo tmp = this.head;
        Nodo currNode = this.head.next;
        this.head = null;
        while (currNode != null) {            
            this.append(currNode.data);
            currNode = currNode.next;
        }
        return tmp;
    }
    
}
