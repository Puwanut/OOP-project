/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktable;

/**
 *
 * @author Kanasin
 */
public class Book {
    private boolean status;
    private String name;
    private byte[] Image;
    
    public Book(){
        
    }
    public Book(boolean status, String name, byte[] Image){
        this.status = status;
        this.name = name;
        this.Image = Image;
    }

    public boolean isStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }

}
