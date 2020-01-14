/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasObjekJava;

/**
 *
 * @author hythes
 */

public class Mahasiswa {
    public String nama, npm;
      public String SetnamaMhs(String asmo){
        System.out.print("nama"+asmo);
        return nama;
    }
     public String SetNpm(String nomor){
        System.out.println("Dengan NPM"+nomor);
        return nomor;
    }
    public Mahasiswa(String nm, String nim){
    this.nama=nm;
    this.npm=nim;
    }
    public void showidentitas(){
    System.out.println("nama saya "+nama);
    System.out.println("NIM Saya "+npm);
    }
    public void makan(){
    System.out.println("Monggo makan nasi");
    }
    public void belajar(){
    System.out.println("Selalu semangat belajar yuukKK");
    }
    public void minum(){
    System.out.println("Perbanyak minum air putih yaaccchhh.,.");
    }
    public void olahraga(){
    System.out.println("Jangan lupa olahraga secara teratur");
    }
    
   
}