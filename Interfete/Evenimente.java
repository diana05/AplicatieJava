/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfete;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Dya_Bia
 */
@Entity
@Table(name = "EVENIMENTE", catalog = "", schema = "GEORGIANA")
@NamedQueries({
    @NamedQuery(name = "Evenimente.findAll", query = "SELECT e FROM Evenimente e"),
    @NamedQuery(name = "Evenimente.findById", query = "SELECT e FROM Evenimente e WHERE e.id = :id"),
    @NamedQuery(name = "Evenimente.findByTipeveniment", query = "SELECT e FROM Evenimente e WHERE e.tipeveniment = :tipeveniment"),
    @NamedQuery(name = "Evenimente.findByLoceveniment", query = "SELECT e FROM Evenimente e WHERE e.loceveniment = :loceveniment"),
    @NamedQuery(name = "Evenimente.findByZiuaeveniment", query = "SELECT e FROM Evenimente e WHERE e.ziuaeveniment = :ziuaeveniment"),
    @NamedQuery(name = "Evenimente.findByLunaeveniment", query = "SELECT e FROM Evenimente e WHERE e.lunaeveniment = :lunaeveniment"),
    @NamedQuery(name = "Evenimente.findByAnuleveniment", query = "SELECT e FROM Evenimente e WHERE e.anuleveniment = :anuleveniment"),
    @NamedQuery(name = "Evenimente.findByOraeveniment", query = "SELECT e FROM Evenimente e WHERE e.oraeveniment = :oraeveniment")})
public class Evenimente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "TIPEVENIMENT")
    private String tipeveniment;
    @Basic(optional = false)
    @Column(name = "LOCEVENIMENT")
    private String loceveniment;
    @Basic(optional = false)
    @Column(name = "ZIUAEVENIMENT")
    private short ziuaeveniment;
    @Basic(optional = false)
    @Column(name = "LUNAEVENIMENT")
    private String lunaeveniment;
    @Basic(optional = false)
    @Column(name = "ANULEVENIMENT")
    private String anuleveniment;
    @Basic(optional = false)
    @Column(name = "ORAEVENIMENT")
    @Temporal(TemporalType.TIME)
    private Date oraeveniment;

    public Evenimente() {
    }

    public Evenimente(Integer id) {
        this.id = id;
    }

    public Evenimente(Integer id, String tipeveniment, String loceveniment, short ziuaeveniment, String lunaeveniment, String anuleveniment, Date oraeveniment) {
        this.id = id;
        this.tipeveniment = tipeveniment;
        this.loceveniment = loceveniment;
        this.ziuaeveniment = ziuaeveniment;
        this.lunaeveniment = lunaeveniment;
        this.anuleveniment = anuleveniment;
        this.oraeveniment = oraeveniment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTipeveniment() {
        return tipeveniment;
    }

    public void setTipeveniment(String tipeveniment) {
        String oldTipeveniment = this.tipeveniment;
        this.tipeveniment = tipeveniment;
        changeSupport.firePropertyChange("tipeveniment", oldTipeveniment, tipeveniment);
    }

    public String getLoceveniment() {
        return loceveniment;
    }

    public void setLoceveniment(String loceveniment) {
        String oldLoceveniment = this.loceveniment;
        this.loceveniment = loceveniment;
        changeSupport.firePropertyChange("loceveniment", oldLoceveniment, loceveniment);
    }

    public short getZiuaeveniment() {
        return ziuaeveniment;
    }

    public void setZiuaeveniment(short ziuaeveniment) {
        short oldZiuaeveniment = this.ziuaeveniment;
        this.ziuaeveniment = ziuaeveniment;
        changeSupport.firePropertyChange("ziuaeveniment", oldZiuaeveniment, ziuaeveniment);
    }

    public String getLunaeveniment() {
        return lunaeveniment;
    }

    public void setLunaeveniment(String lunaeveniment) {
        String oldLunaeveniment = this.lunaeveniment;
        this.lunaeveniment = lunaeveniment;
        changeSupport.firePropertyChange("lunaeveniment", oldLunaeveniment, lunaeveniment);
    }

    public String getAnuleveniment() {
        return anuleveniment;
    }

    public void setAnuleveniment(String anuleveniment) {
        String oldAnuleveniment = this.anuleveniment;
        this.anuleveniment = anuleveniment;
        changeSupport.firePropertyChange("anuleveniment", oldAnuleveniment, anuleveniment);
    }

    public Date getOraeveniment() {
        return oraeveniment;
    }

    public void setOraeveniment(Date oraeveniment) {
        Date oldOraeveniment = this.oraeveniment;
        this.oraeveniment = oraeveniment;
        changeSupport.firePropertyChange("oraeveniment", oldOraeveniment, oraeveniment);
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
        if (!(object instanceof Evenimente)) {
            return false;
        }
        Evenimente other = (Evenimente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interfete.Evenimente[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
