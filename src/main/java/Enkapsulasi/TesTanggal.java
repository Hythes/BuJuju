/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author hythes
 */
public class TesTanggal {
    public static void main (String []args){
    //memanggil konstruktor pada soal nomer 1
    Tanggal kalender = new Tanggal(24, 9, 1990);
    //memanggil konstruktor pada soal nomer 3
    TanggalNomer3 tgl = new TanggalNomer3(24);
    TanggalNomer3 tglbln = new TanggalNomer3(24,9);
    TanggalNomer3 tglblnthn = new TanggalNomer3(24,9,1990);
    }
}
