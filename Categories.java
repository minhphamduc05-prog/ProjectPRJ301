/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MinhPD
 */
public class Categories {
    /* [catid] INT IDENTITY(1,1) PRIMARY KEY,
       [catname] NVARCHAR(50) NOT NULL,
       [catstatus] BIT DEFAULT 1*/
    
    private int catID;
    private String catname;
    private boolean catstatus;

    public Categories() {
    }

    public Categories(int catid, String catname, boolean catstatus) {
        this.catID = catid;
        this.catname = catname;
        this.catstatus = catstatus;
    }

    public int getCatid() {
        return catID;
    }

    public void setCatid(int catid) {
        this.catID = catid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public boolean isCatstatus() {
        return catstatus;
    }

    public void setCatstatus(boolean catstatus) {
        this.catstatus = catstatus;
    }
    
    
}
