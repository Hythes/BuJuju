/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author hythes
 */
public class Mahasiswa {
    public String nama, npm;
    public Mahasiswa(String n, String m){
        this.nama = n;
        this.npm = m;
    }
    public void cetakNama(){
        System.out.println("Nama "+nama);
    }
    public void cetakNim(){
        System.out.println("Nim "+npm);
    }
}
