package com.bilisimegitim.loginjsf.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "girisBean")
@RequestScoped
public class GirisBean {

    private String kullanici;
    private String sifre;

    public GirisBean() {

    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String giriseYetkilimi() {
        if (kullanici.equals("bora") && sifre.equals("1234")) {
            return "menu.xhtml";
        } else {
            return null;
        }

    }

}
