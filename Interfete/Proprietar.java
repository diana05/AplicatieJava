/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfete;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dya_Bia
 */
@Entity
@Table(name = "PROPRIETAR", catalog = "", schema = "GEORGIANA")
@NamedQueries({
    @NamedQuery(name = "Proprietar.findAll", query = "SELECT p FROM Proprietar p"),
    @NamedQuery(name = "Proprietar.findById", query = "SELECT p FROM Proprietar p WHERE p.id = :id"),
    @NamedQuery(name = "Proprietar.findByNumeprop", query = "SELECT p FROM Proprietar p WHERE p.numeprop = :numeprop"),
    @NamedQuery(name = "Proprietar.findByPrenumeprop", query = "SELECT p FROM Proprietar p WHERE p.prenumeprop = :prenumeprop"),
    @NamedQuery(name = "Proprietar.findByZiuan", query = "SELECT p FROM Proprietar p WHERE p.ziuan = :ziuan"),
    @NamedQuery(name = "Proprietar.findByLunan", query = "SELECT p FROM Proprietar p WHERE p.lunan = :lunan"),
    @NamedQuery(name = "Proprietar.findByAnuln", query = "SELECT p FROM Proprietar p WHERE p.anuln = :anuln"),
    @NamedQuery(name = "Proprietar.findByStrada", query = "SELECT p FROM Proprietar p WHERE p.strada = :strada"),
    @NamedQuery(name = "Proprietar.findByNumar", query = "SELECT p FROM Proprietar p WHERE p.numar = :numar"),
    @NamedQuery(name = "Proprietar.findByEtaj", query = "SELECT p FROM Proprietar p WHERE p.etaj = :etaj"),
    @NamedQuery(name = "Proprietar.findByBloc", query = "SELECT p FROM Proprietar p WHERE p.bloc = :bloc"),
    @NamedQuery(name = "Proprietar.findByScara", query = "SELECT p FROM Proprietar p WHERE p.scara = :scara"),
    @NamedQuery(name = "Proprietar.findByNumarapartament", query = "SELECT p FROM Proprietar p WHERE p.numarapartament = :numarapartament"),
    @NamedQuery(name = "Proprietar.findByLocalitate", query = "SELECT p FROM Proprietar p WHERE p.localitate = :localitate"),
    @NamedQuery(name = "Proprietar.findByJudet", query = "SELECT p FROM Proprietar p WHERE p.judet = :judet"),
    @NamedQuery(name = "Proprietar.findByTara", query = "SELECT p FROM Proprietar p WHERE p.tara = :tara"),
    @NamedQuery(name = "Proprietar.findByAdresamail", query = "SELECT p FROM Proprietar p WHERE p.adresamail = :adresamail"),
    @NamedQuery(name = "Proprietar.findByTelefon", query = "SELECT p FROM Proprietar p WHERE p.telefon = :telefon")})
public class Proprietar implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NUMEPROP")
    private String numeprop;
    @Basic(optional = false)
    @Column(name = "PRENUMEPROP")
    private String prenumeprop;
    @Basic(optional = false)
    @Column(name = "ZIUAN")
    private short ziuan;
    @Basic(optional = false)
    @Column(name = "LUNAN")
    private String lunan;
    @Basic(optional = false)
    @Column(name = "ANULN")
    private short anuln;
    @Basic(optional = false)
    @Column(name = "STRADA")
    private String strada;
    @Basic(optional = false)
    @Column(name = "NUMAR")
    private int numar;
    @Basic(optional = false)
    @Column(name = "ETAJ")
    private short etaj;
    @Basic(optional = false)
    @Column(name = "BLOC")
    private String bloc;
    @Basic(optional = false)
    @Column(name = "SCARA")
    private Character scara;
    @Basic(optional = false)
    @Column(name = "NUMARAPARTAMENT")
    private short numarapartament;
    @Basic(optional = false)
    @Column(name = "LOCALITATE")
    private String localitate;
    @Basic(optional = false)
    @Column(name = "JUDET")
    private String judet;
    @Basic(optional = false)
    @Column(name = "TARA")
    private String tara;
    @Basic(optional = false)
    @Column(name = "ADRESAMAIL")
    private String adresamail;
    @Basic(optional = false)
    @Column(name = "TELEFON")
    private long telefon;

    public Proprietar() {
    }

    public Proprietar(Integer id) {
        this.id = id;
    }

    public Proprietar(Integer id, String numeprop, String prenumeprop, short ziuan, String lunan, short anuln, String strada, int numar, short etaj, String bloc, Character scara, short numarapartament, String localitate, String judet, String tara, String adresamail, long telefon) {
        this.id = id;
        this.numeprop = numeprop;
        this.prenumeprop = prenumeprop;
        this.ziuan = ziuan;
        this.lunan = lunan;
        this.anuln = anuln;
        this.strada = strada;
        this.numar = numar;
        this.etaj = etaj;
        this.bloc = bloc;
        this.scara = scara;
        this.numarapartament = numarapartament;
        this.localitate = localitate;
        this.judet = judet;
        this.tara = tara;
        this.adresamail = adresamail;
        this.telefon = telefon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNumeprop() {
        return numeprop;
    }

    public void setNumeprop(String numeprop) {
        String oldNumeprop = this.numeprop;
        this.numeprop = numeprop;
        changeSupport.firePropertyChange("numeprop", oldNumeprop, numeprop);
    }

    public String getPrenumeprop() {
        return prenumeprop;
    }

    public void setPrenumeprop(String prenumeprop) {
        String oldPrenumeprop = this.prenumeprop;
        this.prenumeprop = prenumeprop;
        changeSupport.firePropertyChange("prenumeprop", oldPrenumeprop, prenumeprop);
    }

    public short getZiuan() {
        return ziuan;
    }

    public void setZiuan(short ziuan) {
        short oldZiuan = this.ziuan;
        this.ziuan = ziuan;
        changeSupport.firePropertyChange("ziuan", oldZiuan, ziuan);
    }

    public String getLunan() {
        return lunan;
    }

    public void setLunan(String lunan) {
        String oldLunan = this.lunan;
        this.lunan = lunan;
        changeSupport.firePropertyChange("lunan", oldLunan, lunan);
    }

    public short getAnuln() {
        return anuln;
    }

    public void setAnuln(short anuln) {
        short oldAnuln = this.anuln;
        this.anuln = anuln;
        changeSupport.firePropertyChange("anuln", oldAnuln, anuln);
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        String oldStrada = this.strada;
        this.strada = strada;
        changeSupport.firePropertyChange("strada", oldStrada, strada);
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        int oldNumar = this.numar;
        this.numar = numar;
        changeSupport.firePropertyChange("numar", oldNumar, numar);
    }

    public short getEtaj() {
        return etaj;
    }

    public void setEtaj(short etaj) {
        short oldEtaj = this.etaj;
        this.etaj = etaj;
        changeSupport.firePropertyChange("etaj", oldEtaj, etaj);
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        String oldBloc = this.bloc;
        this.bloc = bloc;
        changeSupport.firePropertyChange("bloc", oldBloc, bloc);
    }

    public Character getScara() {
        return scara;
    }

    public void setScara(Character scara) {
        Character oldScara = this.scara;
        this.scara = scara;
        changeSupport.firePropertyChange("scara", oldScara, scara);
    }

    public short getNumarapartament() {
        return numarapartament;
    }

    public void setNumarapartament(short numarapartament) {
        short oldNumarapartament = this.numarapartament;
        this.numarapartament = numarapartament;
        changeSupport.firePropertyChange("numarapartament", oldNumarapartament, numarapartament);
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        String oldLocalitate = this.localitate;
        this.localitate = localitate;
        changeSupport.firePropertyChange("localitate", oldLocalitate, localitate);
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        String oldJudet = this.judet;
        this.judet = judet;
        changeSupport.firePropertyChange("judet", oldJudet, judet);
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        String oldTara = this.tara;
        this.tara = tara;
        changeSupport.firePropertyChange("tara", oldTara, tara);
    }

    public String getAdresamail() {
        return adresamail;
    }

    public void setAdresamail(String adresamail) {
        String oldAdresamail = this.adresamail;
        this.adresamail = adresamail;
        changeSupport.firePropertyChange("adresamail", oldAdresamail, adresamail);
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        long oldTelefon = this.telefon;
        this.telefon = telefon;
        changeSupport.firePropertyChange("telefon", oldTelefon, telefon);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proprietar)) {
            return false;
        }
        Proprietar other = (Proprietar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interfete.Proprietar[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
