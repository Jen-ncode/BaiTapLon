/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt.btl;

import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class KiemThuVien extends NhanVien{
    private double soLoi;
    Scanner sc = new Scanner(System.in);
    
    public KiemThuVien() {
        super();
    }
    
    public KiemThuVien(double soLoi) {
        super();
        this.soLoi = soLoi;
    }

    @Override
    public void nhapNV() {
        super.nhapNV(); 
        System.out.print("Nhap so loi: ");
        soLoi = sc.nextDouble();
    }
    

    @Override
    public void xuatNV() {
        super.xuatNV(); 
        System.out.printf("So loi: %.0f\n",this.soLoi);
        System.out.printf("Luong: %.0f\n",this.luong);
        
    }

    @Override
    public double tinhLuong() {
        this.luong = this.luongCB * this.heSo + this.soLoi*200000; 
        return this.luong;
    }

    
    
    /**
     * @return the soLoi
     */
    public double getSoLoi() {
        return soLoi;
    }

    /**
     * @param soLoi the soLoi to set
     */
    public void setSoLoi(double soLoi) {
        this.soLoi = soLoi;
    }
}
