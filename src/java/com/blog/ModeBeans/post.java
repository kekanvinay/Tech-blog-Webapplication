/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.ModeBeans;

import java.sql.Timestamp;
import java.util.logging.Logger;
import javax.servlet.http.Part;

public class post {
private int pid;
private String Ptitle;
private String pcontent;
private String pcode;
private String ppic;
private Timestamp pdate;
private int catID;
private  int userid;

   

    
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public post() {
    }

    public post(int pid, String Ptitle, String pcontent, String pcode, String ppic, Timestamp pdate, int catID,int userid) {
        this.pid = pid;
        this.Ptitle = Ptitle;
        this.pcontent = pcontent;
        this.pcode = pcode;
        this.ppic = ppic;
        this.pdate = pdate;
        this.catID = catID;
        this.userid=userid;
    }

    public post(String Ptitle, String pcontent, String pcode, String ppic, int catID,int userid) {
        this.Ptitle = Ptitle;
        this.pcontent = pcontent;
        this.pcode = pcode;
        this.ppic = ppic;
       //this.pdate = pdate;
        this.catID = catID;
        this.userid=userid;
    }
 public post( int pid,String Ptitle, String pcontent, String pcode, String ppic, int catID) {
        this.Ptitle = Ptitle;
        this.pcontent = pcontent;
        this.pcode = pcode;
        this.ppic = ppic;
       //this.pdate = pdate;
        this.catID = catID;
        this.pid=pid;
    }
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPtitle() {
        return Ptitle;
    }

    public void setPtitle(String Ptitle) {
        this.Ptitle = Ptitle;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPpic() {
        return ppic;
    }

    public void setPpic(String ppic) {
        this.ppic = ppic;
    }

    public Timestamp getPdate() {
        return pdate;
    }

    public void setPdate(Timestamp pdate) {
        this.pdate = pdate;
    }

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }
   
}
