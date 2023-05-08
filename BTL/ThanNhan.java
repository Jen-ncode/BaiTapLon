/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt.btl;

/**
 *
 * @author Admin
 */
public class ThanNhan {
    private String hoTen;

	private String gioiTinh;

	private String moiQuanHe;

	private String ngaySinh;

    public ThanNhan(String hoTen, String gioiTinh, String moiQuanHe, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.moiQuanHe = moiQuanHe;
        this.ngaySinh = ngaySinh;
    }

    public void xuatTN() {
        System.out.printf("Ho ten: %s\nGioi tinh: %s\nMoi quan he: %s\nNgay sinh: %s\n",
                this.hoTen,this.gioiTinh,this.moiQuanHe,this.ngaySinh);
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
     * @return the moiQuanHe
     */
    public String getMoiQuanHe() {
        return moiQuanHe;
    }

    /**
     * @param moiQuanHe the moiQuanHe to set
     */
    public void setMoiQuanHe(String moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
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
}
