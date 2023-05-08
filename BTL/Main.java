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
public class Main {
    
    public static QuanLyDuAn q1 = new QuanLyDuAn();
    public static QuanLyNhanVien q2 = new QuanLyNhanVien();
    
    public static void main(String[] args) {
        menu();

        
    }
    
    
    
    public static void menu() {
        int choose;
        do {
        System.out.println("========MENU========");
        System.out.println("1.Quan Ly Du An");
        System.out.println("2.Quan Ly Nhan Vien");
        System.out.println("3.Thoat");
        System.out.print("Moi ban chon: ");
        Scanner sc = new Scanner(System.in);
        choose = sc.nextInt();
        switch(choose) {
            case 1: {
                QuanLyDuAn();
                break;
            }
            case 2: {
                QuanLyNhanVien();
                break;
            }
            case 3: {
                xoaDA();
                break;
            }
            default: {
                System.exit(0);
                }
            }  
        }while(choose < 3);
    }
    
    public static void themDA(int n) {
        DuAn[] DA = new DuAn[n];
        for(int i = 0; i < n; i++) {
            System.out.println("===NHAP THONG TIN DU AN "+ (i+1) +"====");
             DA[i] = new DuAn();
             DA[i].nhapDA();
             q1.themDA(DA[i]);
        }
        System.out.println("=> Them du an thanh cong !!!");
        q1.xuatDsDA();
    }
    
    public static void xoaDA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====XOA DU AN=====");
        System.out.print("Nhap so thu tu cua du an: ");
        int n = sc.nextInt();
        DuAn[] DA = new DuAn[1];
        q1.xoaDA(DA[n]);
        q1.xuatDsDA();

    }
    
    
    public static void themNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nhan vien: ");
        int n = sc.nextInt();
        
        NhanVien[] NV = new NhanVien[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien " + (i+1));
            System.out.println("====BANG NHAN VIEN====");
            System.out.println("1.Nhan vien thuong");
            System.out.println("2.Lap Trinh Vien");
            System.out.println("3.Kiem Trinh Vien");
            System.out.println("4.Thiet Ke Vien");
            System.out.print("Chon loai nhan vien: ");
            int choose = sc.nextInt();
            switch(choose) {
                case 1: {
                    NV[i] = new NhanVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    break;
                }
                case 2: {
                    NV[i] = new LapTrinhVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    break;
                }
                case 3: {
                    NV[i] = new KiemThuVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    break;
                }
                case 4: {
                    NV[i] = new ThietKeVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    break;
                }
                
            }   
        }
        System.out.println("=> Them nhan vien thanh cong !!!!");
    }
    
    public static void QuanLyDuAn() {
        int choose;
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Quan Ly Du An========");
        System.out.println("1.Them du an");
        System.out.println("2.Xoa du an");
        System.out.println("3.Tim kiem theo ten");
        System.out.println("4.Tim kiem theo thoi gian bat dau");
        System.out.println("5.Sap xep theo kinh phi");
        System.out.println("6.Thoat");
        System.out.print("Moi ban chon: ");
        choose = sc.nextInt();
        switch(choose) {
            case 1:{
                System.out.print("Nhap so du an: ");
                int n = sc.nextInt();
                themDA(n);
                break;
            }
            case 2: {
                xoaDA();
                break;
            }
            case 3: {
                System.out.print("Nhap ten du an: ");
                sc.nextLine();
                String a = sc.nextLine();
                System.out.println("=====Ket Qua Tim Kiem=====");
                q1.TimKiemDA1(a).forEach(s -> s.xuatDA());
                break;
            }
            case 4: {
                System.out.print("Nhap thoi diem bat dau: ");
                sc.nextLine();
                String a = sc.nextLine();
                System.out.println("=====Ket Qua Tim Kiem=====");
                q1.TimKiemDA2(a).forEach(s -> s.xuatDA());
                break;
            }
            case 5: {
                q1.sapXepDuAn();
                q1.xuatDsDA();
                break;
            }
            case 6: {
                System.out.println("Chuong Trinh Ket Thuc");
            }
            default: {
                
            }
        }
    }while(choose < 6);
}
    
    
    public static void QuanLyNhanVien() {
        int choose;
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Quan Ly Nhan Vien========");
        System.out.println("1.Them nhan vien");
        System.out.println("2.Tim kiem theo ten");
        System.out.println("3.Tim kiem theo ngay sinh");
        System.out.println("4.Tim kiem theo phong ban");
        System.out.println("5.Tim kiem theo do tuoi");
        System.out.println("6.Xuat danh sach than nhan theo ma NV");
        System.out.println("7.Thoat");
        System.out.print("Moi ban chon: ");
        choose = sc.nextInt();
        switch(choose) {
            case 1:{
                themNV();
                q2.xuatDsNV();
                break;
            }
            case 2: {
                System.out.println("Nhap ten nhan vien: ");
                sc.nextLine();
                String a = sc.nextLine();
                System.out.println("=====Ket Qua Tim Kiem=====");
                q2.TimKiemTheoTen(a).forEach(s -> s.xuatNV());
            }
            case 3: {
                System.out.println("Nhap ngay sinh: ");
                sc.nextLine();
                String a = sc.nextLine();
//                System.out.println("=====Ket Qua Tim Kiem=====");
                q2.TimKiemTheoNgaySinh(a).forEach(s -> s.xuatNV());
            }
//            case 4: {
//                System.out.println("Nhap thoi diem bat dau: ");
//                String a = sc.nextLine();
//                
//                q2.TimKiemTheoTuoi(a).forEach(s -> s.xuatDA());
//            }
//            case 5: {
//                q1.sapXepDuAn();
//                q1.xuatDsDA();
//            }
            case 6: {
                System.out.println("Chuong Trinh Ket Thuc");
            }
            default: {
                
            }
        }
    }while(choose < 7);
    }

    /**
     * @return the q1
     */
    public QuanLyDuAn getQ1() {
        return q1;
    }

    /**
     * @param q1 the q1 to set
     */
    public void setQ1(QuanLyDuAn q1) {
        this.q1 = q1;
    }

    /**
     * @return the DA
     */
    public DuAn[] getDA() {
        return DA;
    }

    /**
     * @param DA the DA to set
     */
    public void setDA(DuAn[] DA) {
        this.DA = DA;
    }

   
    
}
