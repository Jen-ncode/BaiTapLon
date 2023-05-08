/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt.btl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien {
    private List<NhanVien> ds = new ArrayList<>();
    private List<ThanNhan> dstn = new ArrayList<>();
    ;

	public void themNV(NhanVien... s) {
            this.ds.addAll(Arrays.asList(s));
	}

	public void xuatDsNV() {
            System.out.println("======= Danh sach hien tai la =========");
            this.ds.forEach(s -> s.xuatNV());
	}
        public List<NhanVien> TimKiemTheoTen(String ten) {
            return this.ds.stream().filter(s -> s.getHoTen().contains(ten)).collect(Collectors.toList());
	}

	public List<NhanVien> TimKiemTheoNgaySinh(String ngaysinh) {
            return this.ds.stream().filter(s -> s.getNgaySinh().contains(ngaysinh)).collect(Collectors.toList());
	}
        
//        public List<NhanVien> TimKiemTheoTuoi(double tuTuoi, double denTuoi) {
//        return this.ds.stream().filter(s -> s.getGia() >= tuGia && s.getGia() <= denGia).collect(Collectors.toList());
//    }
        public void xuatDsThanNhan(String ma) {
            this.ds.stream().filter(s ->s.getMaNV().contains(ma)).collect(Collectors.toList());
            this.dstn.forEach(s -> s.xuatTN());
	}
        
	public void xoaNV(NhanVien s) {
            this.ds.remove(s);
	}

    /**
     * @return the ds
     */
    public List<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }

    /**
     * @return the dstn
     */
    public List<ThanNhan> getDstn() {
        return dstn;
    }

    /**
     * @param dstn the dstn to set
     */
    public void setDstn(List<ThanNhan> dstn) {
        this.dstn = dstn;
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
