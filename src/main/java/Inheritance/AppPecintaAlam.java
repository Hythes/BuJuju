/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 * @author hythes
 */

public class AppPecintaAlam {
    public static void main (String[] args){
        Mahasiswa mm = new Mahasiswa("SON", "09650152");
        PecintaAlam pc = new PecintaAlam("Arif" ,"09650xxx");
        mm.cetakNama();
        mm.cetakNim();
        pc.aktifitas();
        pc.istirahat();
    }
}
