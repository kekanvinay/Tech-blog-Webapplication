package com.blog.ModeBeans;
import java.util.Date;

public class UserREG {

    private int id;
    private String Name;
    private String Email;
    private String password;
    private String gender;
    private String about;
    private Date RDATE;
    private String profile;
    private  int Role;
    public UserREG()
    {
        
    }

    public UserREG(int id, String Name, String Email, String password, String gender, String about, Date RDATE,int Role) {
        this.id = id;
        this.Name = Name;
        this.Email = Email;
        this.password = password;
        this.gender = gender;
        this.about = about;
        this.RDATE = RDATE;
        this.Role=Role;
    }

    public UserREG(String Name, String Email, String password, String gender, String about,int Role) {
        this.Name = Name;
        this.Email = Email;
        this.password = password;
        this.gender = gender;
        this.about = about;
        this.Role=Role;
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Date getRDATE() {
        return RDATE;
    }

    public void setRDATE(Date RDATE) {
        this.RDATE = RDATE;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * @return the Role
     */
    public int getRole() {
        return Role;
    }

    /**
     * @param Role the Role to set
     */
    public void setRole(int Role) {
        this.Role = Role;
    }
    
}
