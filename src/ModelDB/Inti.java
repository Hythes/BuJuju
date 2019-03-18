/*
 * Copyright 2019 Hanif Setyananda.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ModelDB;
import ConnectionDB.ConnectionDB;


/**
 *
 * @author Hanif Setyananda
 */
public class Inti {
    private String nama;
    private int jumlah;
    private int id;

    public Inti(int id, String nama, int jumlah) {
        this.nama = nama;
        this.id = id;
        this.jumlah = jumlah;
    }

    public int getID() {
        return this.id;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}
