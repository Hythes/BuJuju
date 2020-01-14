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
public class PecintaAlam extends Mahasiswa{
    public PecintaAlam(String a, String b) {
        super(a,b);
    }
    public void aktifitas(){
        System.out.println(nama +" dengan NIM "+npm+ "nSedang mendaki gunung");
    }
    public void istirahat(){
        System.out.println(nama +" dengan NIM "+npm+ "nSedang tidur di kamar");
    }
}
