/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.swing.ImageIcon;

/**
 *
 * @author Kanasin
 */
@Entity
@Table(name = "bookinfo", catalog = "mdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookinfo.findAll", query = "SELECT b FROM Bookinfo b")
    , @NamedQuery(name = "Bookinfo.findByIdbook", query = "SELECT b FROM Bookinfo b WHERE b.idbook = :idbook")
    , @NamedQuery(name = "Bookinfo.findByBname", query = "SELECT b FROM Bookinfo b WHERE b.bname = :bname")
    , @NamedQuery(name = "Bookinfo.findByStatus", query = "SELECT b FROM Bookinfo b WHERE b.status = :status")})
public class Bookinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbook")
    private Integer idbook;
    @Basic(optional = false)
    @Column(name = "bname")
    private String bname;
    @Basic(optional = false)
    @Lob
    @Column(name = "bookauthor")
    private String bookauthor;
    @Lob
    @Column(name = "imgbook")
    private byte[] imgbook;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;
    
    public ImageIcon getImage(){
        return new ImageIcon(new ImageIcon(imgbook).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
    }

    public Bookinfo() {
    }

    public Bookinfo(Integer idbook) {
        this.idbook = idbook;
    }

    public Bookinfo(Integer idbook, String bname, String bookauthor, boolean status) {
        this.idbook = idbook;
        this.bname = bname;
        this.bookauthor = bookauthor;
        this.status = status;
    }

    public Integer getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        Integer oldIdbook = this.idbook;
        this.idbook = idbook;
        changeSupport.firePropertyChange("idbook", oldIdbook, idbook);
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        String oldBname = this.bname;
        this.bname = bname;
        changeSupport.firePropertyChange("bname", oldBname, bname);
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        String oldBookauthor = this.bookauthor;
        this.bookauthor = bookauthor;
        changeSupport.firePropertyChange("bookauthor", oldBookauthor, bookauthor);
    }

    public byte[] getImgbook() {
        return imgbook;
    }

    public void setImgbook(byte[] imgbook) {
        byte[] oldImgbook = this.imgbook;
        this.imgbook = imgbook;
        changeSupport.firePropertyChange("imgbook", oldImgbook, imgbook);
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        boolean oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbook != null ? idbook.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookinfo)) {
            return false;
        }
        Bookinfo other = (Bookinfo) object;
        if ((this.idbook == null && other.idbook != null) || (this.idbook != null && !this.idbook.equals(other.idbook))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Bookinfo[ idbook=" + idbook + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
