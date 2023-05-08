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
public class NhanVien {
        private String maNV;

	private String ngaySinh;

	private String hoTen;

	private String Email;

	private String gioiTinh;

        protected double luongCB;
        
        protected double heSo;
        
        protected double luong;

        
    public NhanVien() {
        super();
    }    
        
    public NhanVien(String maNV, String ngaySinh, String hoTen, String Email, String gioiTinh, double luongCB, double heSo, double luong) {
        this.maNV = maNV;
        this.ngaySinh = ngaySinh;
        this.hoTen = hoTen;
        this.Email = Email;
        this.gioiTinh = gioiTinh;
        this.luongCB = luongCB;
        this.heSo = heSo;
        this.luong = luong;
    }

    
       

        public void nhapNV() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Ma nhan vien: ");
            maNV= sc.nextLine();
            System.out.print("Ngay sinh: ");
            ngaySinh = sc.nextLine();
            System.out.print("Ho ten: ");
            hoTen = sc.nextLine();
            System.out.print("Email: ");
            Email = sc.nextLine();
            System.out.print("Gioi tinh: ");
            gioiTinh = sc.nextLine();
            System.out.print("Luong CB: ");
            luongCB = sc.nextDouble();  
            sc.nextLine();
            System.out.print("He so: ");
            heSo = sc.nextDouble(); 
        }
        
        
	public void xuatNV() {
            System.out.printf("Ma nv: %s\nNgay sinh: %s\nHo ten: %s\nEmail: %s\nGioi tinh: %s\nLuong CB: %.0f\nHe so: %.0f\nLuong: %.0f\n",
                    this.maNV,this.ngaySinh,this.hoTen,this.Email,this.gioiTinh,this.luongCB,this.heSo,this.luong);
	}
        
        public double tinhLuong() {
            this.luong = this.luongCB* this.heSo;
            return this.luong;
        }

    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the ngaySinh
     */
    public String getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    
    /**
     * @return the luongCB
     */
    public double getLuongCB() {
        return luongCB;
    }

    /**
     * @param luongCB the luongCB to set
     */
    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    /**
     * @return the heSo
     */
    public double getHeSo() {
        return heSo;
    }

    /**
     * @param heSo the heSo to set
     */
    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    /**
     * @return the luong
     */
    public double getLuong() {
        return luong;
    }

    /**
     * @param luong the luong to set
     */
    public void setLuong(double luong) {
        this.luong = luong;
    }
}
