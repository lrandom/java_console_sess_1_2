/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosession1;

/**
 *
 * @author Lrandom
 */
public class NhanVien {
    private int ma;
    private String hoten;
    private float luong;

    public int getMa() {
        return ma;
    }

    public String getHoten() {
        return hoten;
    }

    public float getLuong() {
        return luong;
    }

    
    public NhanVien(int ma, String hoten, float luong) {
        this.ma = ma;
        this.hoten = hoten;
        this.luong = luong;
    }
    
    
}
