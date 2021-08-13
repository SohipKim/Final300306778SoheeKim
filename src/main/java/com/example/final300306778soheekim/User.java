package com.example.final300306778soheekim;

public class User {

    private String custno;
    private String custname;
    private String cdep;
    private String nyears;
    private String savtype;

    public User(String custno, String custname, String cdep, String nyears, String savtype) {
        this.custno = custno;
        this.custname = custname;
        this.cdep = cdep;
        this.nyears = nyears;
        this.savtype = savtype;
    }


    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCdep() {
        return cdep;
    }

    public void setCdep(String cdep) {
        this.cdep = cdep;
    }

    public String getNyears() {
        return nyears;
    }

    public void setNyears(String nyears) {
        this.nyears = nyears;
    }

    public String getsavtype() {
        return savtype;
    }

    public void setsavtype(String savtype) {
        this.savtype = savtype;
    }




}
