/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.ModeBeans;
public class Comment {
    private int cid;
    private int pid;
    private int uid;
    private String content;
    private String uname;

    public Comment() {
    }

    public Comment(int cid, int pid, int uid, String content, String uname) {
        this.cid = cid;
        this.pid = pid;
        this.uid = uid;
        this.content = content;
        this.uname = uname;
    }
    public Comment( int pid, int uid, String content, String uname) {
        
        this.pid = pid;
        this.uid = uid;
        this.content = content;
        this.uname = uname;
    }
    
    
    public int getCid() {
        return cid;
    }

    
    public void setCid(int cid) {
        this.cid = cid;
    }

    
    public int getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(int pid) {
        this.pid = pid;
    }

    /**
     * @return the uid
     */
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    
    
}
