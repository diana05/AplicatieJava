/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasele;

/**
 *
 * @author Dya_Bia
 */
public class Eveniment {
     private int id;
    private String TipEveniment;
    private String LocEveniment;
    private String ZiuaEveniment;
    private String LunaEveniment;
    private String  AnulEveniment;
    private String OraEveniment;

   

 

    /**
     * @return the TipEveniment
     */
    public String getTipEveniment() {
        return TipEveniment;
    }

    /**
     * @param TipEveniment the TipEveniment to set
     */
    public void setTipEveniment(String TipEveniment) {
        this.TipEveniment = TipEveniment;
    }

    /**
     * @return the LocEveniment
     */
    public String getLocEveniment() {
        return LocEveniment;
    }

    /**
     * @param LocEveniment the LocEveniment to set
     */
    public void setLocEveniment(String LocEveniment) {
        this.LocEveniment = LocEveniment;
    }

    /**
     * @return the ZiuaEveniment
     */
    public String getZiuaEveniment() {
        return ZiuaEveniment;
    }

    /**
     * @param ZiuaEveniment the ZiuaEveniment to set
     */
    public void setZiuaEveniment(String ZiuaEveniment) {
        this.ZiuaEveniment = ZiuaEveniment;
    }

    /**
     * @return the LunaEveniment
     */
    public String getLunaEveniment() {
        return LunaEveniment;
    }

    /**
     * @param LunaEveniment the LunaEveniment to set
     */
    public void setLunaEveniment(String LunaEveniment) {
        this.LunaEveniment = LunaEveniment;
    }

    /**
     * @return the AnulEveniment
     */
    public String getAnulEveniment() {
        return AnulEveniment;
    }

    /**
     * @param AnulEveniment the AnulEveniment to set
     */
    public void setAnulEveniment(String AnulEveniment) {
        this.AnulEveniment = AnulEveniment;
    }

    /**
     * @return the OraEveniment
     */
    public String getOraEveniment() {
        return OraEveniment;
    }

    /**
     * @param OraEveniment the OraEveniment to set
     */
    public void setOraEveniment(String OraEveniment) {
        this.OraEveniment = OraEveniment;
    }

    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Eveniment{" + "id=" + id + ", TipEveniment=" + TipEveniment + ", LocEveniment=" + LocEveniment + ", ZiuaEveniment=" + ZiuaEveniment + ", LunaEveniment=" + LunaEveniment + ", AnulEveniment=" + AnulEveniment + ", OraEveniment=" + OraEveniment + '}';
    }

    public Eveniment(int id, String TipEveniment, String LocEveniment, String ZiuaEveniment, String LunaEveniment, String AnulEveniment, String OraEveniment) {
        this.id = id;
        this.TipEveniment = TipEveniment;
        this.LocEveniment = LocEveniment;
        this.ZiuaEveniment = ZiuaEveniment;
        this.LunaEveniment = LunaEveniment;
        this.AnulEveniment = AnulEveniment;
        this.OraEveniment = OraEveniment;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
   
    
   
  
}
