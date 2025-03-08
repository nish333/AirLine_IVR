package flow;

import java.util.Date;

public class CallHistory {
    private String vcUcId;
    private String vcClId;
    private String vcDnis;
    private String vcLanguage;
    private Date dtStartDate;
    private Date dtEndDate;
    private int nuDuration;
    private String vcExitLocation;
    private String vcDisconnectReason;
    private String vcTransferVdn;
    private String vcUui;

    public String getVcUcId() {
        return vcUcId;
    }

    public void setVcUcId(String vcUcId) {
        this.vcUcId = vcUcId;
    }

    public String getVcClId() {
        return vcClId;
    }

    public void setVcClId(String vcClId) {
        this.vcClId = vcClId;
    }

    public String getVcDnis() {
        return vcDnis;
    }

    public void setVcDnis(String vcDnis) {
        this.vcDnis = vcDnis;
    }

    public String getVcLanguage() {
        return vcLanguage;
    }

    public void setVcLanguage(String vcLanguage) {
        this.vcLanguage = vcLanguage;
    }

    public Date getDtStartDate() {
        return dtStartDate;
    }

    public void setDtStartDate(Date dtStartDate) {
        this.dtStartDate = dtStartDate;
    }

    public Date getDtEndDate() {
        return dtEndDate;
    }

    public void setDtEndDate(Date dtEndDate) {
        this.dtEndDate = dtEndDate;
    }

    public int getNuDuration() {
        return nuDuration;
    }

    public void setNuDuration(int nuDuration) {
        this.nuDuration = nuDuration;
    }

    public String getVcExitLocation() {
        return vcExitLocation;
    }

    public void setVcExitLocation(String vcExitLocation) {
        this.vcExitLocation = vcExitLocation;
    }

    public String getVcDisconnectReason() {
        return vcDisconnectReason;
    }

    public void setVcDisconnectReason(String vcDisconnectReason) {
        this.vcDisconnectReason = vcDisconnectReason;
    }

    public String getVcTransferVdn() {
        return vcTransferVdn;
    }

    public void setVcTransferVdn(String vcTransferVdn) {
        this.vcTransferVdn = vcTransferVdn;
    }

    public String getVcUui() {
        return vcUui;
    }

    public void setVcUui(String vcUui) {
        this.vcUui = vcUui;
    }
}
