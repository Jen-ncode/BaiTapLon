/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt.btl;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class QuanLyDuAn {
    private List<NhanVien> dsnv = new ArrayList<>();
    private List<DuAn> dsda = new ArrayList<>();

	public void themDA(DuAn s) {
            this.dsda.add(s);
	}

        public void xoaDA(DuAn s) {
            this.dsda.remove(s);
	}

	public void suaDA(int n, DuAn s) {
            this.dsda.set(n,s);
	}
        
	public void xuatDsDA() {
            System.out.println("======= Danh sach hien tai la =========");
            this.dsda.forEach(s -> s.xuatDA());
            
	}

	public List<DuAn> TimKiemDA1(String ten) {
            return this.dsda.stream().filter(s -> s.getTenDA().contains(ten)).collect(Collectors.toList());
	}

	public List<DuAn> TimKiemDA2(String batDau) {
            return this.dsda.stream().filter(s -> s.getThoiDiemBatDau().contains(batDau)).collect(Collectors.toList());
	}

        public void sapXepDuAn() {
            this.dsda.sort((d1,d2) -> {
            double g1 = d1.getTongKinhPhi();
            double g2 = d2.getTongKinhPhi();
            return +(g1 > g2 ? 1 : (g1 > g2 ? -1 : 0));
        });
        }

   

    /**
     * @return the dsnv
     */
    public List<NhanVien> getDsnv() {
        return dsnv;
    }

    /**
     * @param dsnv the dsnv to set
     */
    public void setDsnv(List<NhanVien> dsnv) {
        this.dsnv = dsnv;
    }

    /**
     * @return the dsda
     */
    public List<DuAn> getDsda() {
        return dsda;
    }

    /**
     * @param dsda the dsda to set
     */
    public void setDsda(List<DuAn> dsda) {
        this.dsda = dsda;
    }
}
