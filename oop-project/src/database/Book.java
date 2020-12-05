/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author IsilenceT
 */
public class Book {
    private int idbook;
    private String bname;
    private String bookauthor;
    private byte[] imgbook;
    private boolean status;

    public Book(int idbook, String bname, String bookauthor, boolean status) {
        this.idbook = idbook;
        this.bname = bname;
        this.bookauthor = bookauthor;
        this.status = status;
    }

    public Book(byte[] imgbook, String bname, String bookauthor, boolean status) {
        this.imgbook = imgbook;
        this.bname = bname;
        this.bookauthor = bookauthor;
        this.status = status;
    }
    
    

    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public byte[] getImgbook() {
        return imgbook;
    }

    public void setImgbook(byte[] imgbook) {
        this.imgbook = imgbook;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
   
}
