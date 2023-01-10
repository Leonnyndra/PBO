//keturunan KTP
package com.mycompany.pewarisan;

/**
 *
 * @author ACER
 */
public class Mahasiswa extends KTP {
    public String nim;
    public String prodi;
    public String fak;
    private double ipk;
    private long tagihan;

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public long getTagihan() {
        return tagihan;
    }

    public void setTagihan(long tagihan) {
        this.tagihan = tagihan;
    }
    
    
}
