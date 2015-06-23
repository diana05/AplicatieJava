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
@Table(name = "PERSOANA", catalog = "", schema = "GEORGIANA")
@NamedQueries({
    @NamedQuery(name = "Persoana.findAll", query = "SELECT p FROM Persoana p"),
    @NamedQuery(name = "Persoana.findById", query = "SELECT p FROM Persoana p WHERE p.id = :id"),
    @NamedQuery(name = "Persoana.findByNumeper", query = "SELECT p FROM Persoana p WHERE p.numeper = :numeper"),
    @NamedQuery(name = "Persoana.findByPrenumeper", query = "SELECT p FROM Persoana p WHERE p.prenumeper = :prenumeper"),
    @NamedQuery(name = "Persoana.findByZiuanastere", query = "SELECT p FROM Persoana p WHERE p.ziuanastere = :ziuanastere"),
    @NamedQuery(name = "Persoana.findByLunanastere", query = "SELECT p FROM Persoana p WHERE p.lunanastere = :lunanastere"),
    @NamedQuery(name = "Persoana.findByAnulnastere", query = "SELECT p FROM Persoana p WHERE p.anulnastere = :anulnastere"),
    @NamedQuery(name = "Persoana.findByStrada", query = "SELECT p FROM Persoana p WHERE p.strada = :strada"),
    @NamedQuery(name = "Persoana.findByNumar", query = "SELECT p FROM Persoana p WHERE p.numar = :numar"),
    @NamedQuery(name = "Persoana.findByBloc", query = "SELECT p FROM Persoana p WHERE p.bloc = :bloc"),
    @NamedQuery(name = "Persoana.findByScara", query = "SELECT p FROM Persoana p WHERE p.scara = :scara"),
    @NamedQuery(name = "Persoana.findByEtaj", query = "SELECT p FROM Persoana p WHERE p.etaj = :etaj"),
    @NamedQuery(name = "Persoana.findByApartament", query = "SELECT p FROM Persoana p WHERE p.apartament = :apartament"),
    @NamedQuery(name = "Persoana.findByLocalitate", query = "SELECT p FROM Persoana p WHERE p.localitate = :localitate"),
    @NamedQuery(name = "Persoana.findByJudet", query = "SELECT p FROM Persoana p WHERE p.judet = :judet"),
    @NamedQuery(name = "Persoana.findByTelefon", query = "SELECT p FROM Persoana p WHERE p.telefon = :telefon"),
    @NamedQuery(name = "Persoana.findByMail", query = "SELECT p FROM Persoana p WHERE p.mail = :mail")})
public class Persoana implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NUMEPER")
    private String numeper;
    @Basic(optional = false)
    @Column(name = "PRENUMEPER")
    private String prenumeper;
    @Basic(optional = false)
    @Column(name = "ZIUANASTERE")
    private short ziuanastere;
    @Basic(optional = false)
    @Column(name = "LUNANASTERE")
    private String lunanastere;
    @Basic(optional = false)
    @Column(name = "ANULNASTERE")
    private short anulnastere;
    @Basic(optional = false)
    @Column(name = "STRADA")
    private String strada;
    @Basic(optional = false)
    @Column(name = "NUMAR")
    private int numar;
    @Basic(optional = false)
    @Column(name = "BLOC")
    private String bloc;
    @Basic(optional = false)
    @Column(name = "SCARA")
    private String scara;
    @Basic(optional = false)
    @Column(name = "ETAJ")
    private short etaj;
    @Basic(optional = false)
    @Column(name = "APARTAMENT")
    private short apartament;
    @Basic(optional = false)
    @Column(name = "LOCALITATE")
    private String localitate;
    @Basic(optional = false)
    @Column(name = "JUDET")
    private String judet;
    @Basic(optional = false)
    @Column(name = "TELEFON")
    private long telefon;
    @Basic(optional = false)
    @Column(name = "MAIL")
    private String mail;

    public Persoana() {
    }

    public Persoana(Integer id) {
        this.id = id;
    }

    public Persoana(Integer id, String numeper, String prenumeper, short ziuanastere, String lunanastere, short anulnastere, String strada, int numar, String bloc, String scara, short etaj, short apartament, String localitate, String judet, long telefon, String mail) {
        this.id = id;
        this.numeper = numeper;
        this.prenumeper = prenumeper;
        this.ziuanastere = ziuanastere;
        this.lunanastere = lunanastere;
        this.anulnastere = anulnastere;
        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
        this.scara = scara;
        this.etaj = etaj;
        this.apartament = apartament;
        this.localitate = localitate;
        this.judet = judet;
        this.telefon = telefon;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNumeper() {
        return numeper;
    }

    public void setNumeper(String numeper) {
        String oldNumeper = this.numeper;
        this.numeper = numeper;
        changeSupport.firePropertyChange("numeper", oldNumeper, numeper);
    }

    public String getPrenumeper() {
        return prenumeper;
    }

    public void setPrenumeper(String prenumeper) {
        String oldPrenumeper = this.prenumeper;
        this.prenumeper = prenumeper;
        changeSupport.firePropertyChange("prenumeper", oldPrenumeper, prenumeper);
    }

    public short getZiuanastere() {
        return ziuanastere;
    }

    public void setZiuanastere(short ziuanastere) {
        short oldZiuanastere = this.ziuanastere;
        this.ziuanastere = ziuanastere;
        changeSupport.firePropertyChange("ziuanastere", oldZiuanastere, ziuanastere);
    }

    public String getLunanastere() {
        return lunanastere;
    }

    public void setLunanastere(String lunanastere) {
        String oldLunanastere = this.lunanastere;
        this.lunanastere = lunanastere;
        changeSupport.firePropertyChange("lunanastere", oldLunanastere, lunanastere);
    }

    public short getAnulnastere() {
        return anulnastere;
    }

    public void setAnulnastere(short anulnastere) {
        short oldAnulnastere = this.anulnastere;
        this.anulnastere = anulnastere;
        changeSupport.firePropertyChange("anulnastere", oldAnulnastere, anulnastere);
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

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        String oldBloc = this.bloc;
        this.bloc = bloc;
        changeSupport.firePropertyChange("bloc", oldBloc, bloc);
    }

    public String getScara() {
        return scara;
    }

    public void setScara(String scara) {
        String oldScara = this.scara;
        this.scara = scara;
        changeSupport.firePropertyChange("scara", oldScara, scara);
    }

    public short getEtaj() {
        return etaj;
    }

    public void setEtaj(short etaj) {
        short oldEtaj = this.etaj;
        this.etaj = etaj;
        changeSupport.firePropertyChange("etaj", oldEtaj, etaj);
    }

    public short getApartament() {
        return apartament;
    }

    public void setApartament(short apartament) {
        short oldApartament = this.apartament;
        this.apartament = apartament;
        changeSupport.firePropertyChange("apartament", oldApartament, apartament);
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

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        long oldTelefon = this.telefon;
        this.telefon = telefon;
        changeSupport.firePropertyChange("telefon", oldTelefon, telefon);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        String oldMail = this.mail;
        this.mail = mail;
        changeSupport.firePropertyChange("mail", oldMail, mail);
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
        if (!(object instanceof Persoana)) {
            return false;
        }
        Persoana other = (Persoana) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interfete.Persoana[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
