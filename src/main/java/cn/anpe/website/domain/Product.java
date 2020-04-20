package cn.anpe.website.domain;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "product")
public class Product {
    @Id
    private String pid;

    private String sid;

    private String series;

    private String productName;

    private String thumbImg;

    private String power;

    private String input;

    private String output;

    private String loadAllow;

    private String temDrift;

    private String response;

    private String consumption;

    private String workTem;

    private String storageTem;

    private String appPlace;

    private String outputState;

    private String elec;

    private String dielectric;

    private String insulation;

    private String connectionStyle;

    private String specification;

    private String installation;

    private String certification;

    private String explosion;

    private String uo;

    private String io;

    private String po;

    private String co;

    private String lo;

    private String description;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series == null ? null : series.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg == null ? null : thumbImg.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input == null ? null : input.trim();
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }

    public String getLoadAllow() {
        return loadAllow;
    }

    public void setLoadAllow(String loadAllow) {
        this.loadAllow = loadAllow == null ? null : loadAllow.trim();
    }

    public String getTemDrift() {
        return temDrift;
    }

    public void setTemDrift(String temDrift) {
        this.temDrift = temDrift == null ? null : temDrift.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption == null ? null : consumption.trim();
    }

    public String getWorkTem() {
        return workTem;
    }

    public void setWorkTem(String workTem) {
        this.workTem = workTem == null ? null : workTem.trim();
    }

    public String getStorageTem() {
        return storageTem;
    }

    public void setStorageTem(String storageTem) {
        this.storageTem = storageTem == null ? null : storageTem.trim();
    }

    public String getAppPlace() {
        return appPlace;
    }

    public void setAppPlace(String appPlace) {
        this.appPlace = appPlace == null ? null : appPlace.trim();
    }

    public String getOutputState() {
        return outputState;
    }

    public void setOutputState(String outputState) {
        this.outputState = outputState == null ? null : outputState.trim();
    }

    public String getElec() {
        return elec;
    }

    public void setElec(String elec) {
        this.elec = elec == null ? null : elec.trim();
    }

    public String getDielectric() {
        return dielectric;
    }

    public void setDielectric(String dielectric) {
        this.dielectric = dielectric == null ? null : dielectric.trim();
    }

    public String getInsulation() {
        return insulation;
    }

    public void setInsulation(String insulation) {
        this.insulation = insulation == null ? null : insulation.trim();
    }

    public String getConnectionStyle() {
        return connectionStyle;
    }

    public void setConnectionStyle(String connectionStyle) {
        this.connectionStyle = connectionStyle == null ? null : connectionStyle.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getInstallation() {
        return installation;
    }

    public void setInstallation(String installation) {
        this.installation = installation == null ? null : installation.trim();
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification == null ? null : certification.trim();
    }

    public String getExplosion() {
        return explosion;
    }

    public void setExplosion(String explosion) {
        this.explosion = explosion == null ? null : explosion.trim();
    }

    public String getUo() {
        return uo;
    }

    public void setUo(String uo) {
        this.uo = uo == null ? null : uo.trim();
    }

    public String getIo() {
        return io;
    }

    public void setIo(String io) {
        this.io = io == null ? null : io.trim();
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po == null ? null : po.trim();
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co == null ? null : co.trim();
    }

    public String getLo() {
        return lo;
    }

    public void setLo(String lo) {
        this.lo = lo == null ? null : lo.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", sid='" + sid + '\'' +
                ", series='" + series + '\'' +
                ", productName='" + productName + '\'' +
                ", thumbImg='" + thumbImg + '\'' +
                ", power='" + power + '\'' +
                ", input='" + input + '\'' +
                ", output='" + output + '\'' +
                ", loadAllow='" + loadAllow + '\'' +
                ", temDrift='" + temDrift + '\'' +
                ", response='" + response + '\'' +
                ", consumption='" + consumption + '\'' +
                ", workTem='" + workTem + '\'' +
                ", storageTem='" + storageTem + '\'' +
                ", appPlace='" + appPlace + '\'' +
                ", outputState='" + outputState + '\'' +
                ", elec='" + elec + '\'' +
                ", dielectric='" + dielectric + '\'' +
                ", insulation='" + insulation + '\'' +
                ", connectionStyle='" + connectionStyle + '\'' +
                ", specification='" + specification + '\'' +
                ", installation='" + installation + '\'' +
                ", certification='" + certification + '\'' +
                ", explosion='" + explosion + '\'' +
                ", uo='" + uo + '\'' +
                ", io='" + io + '\'' +
                ", po='" + po + '\'' +
                ", co='" + co + '\'' +
                ", lo='" + lo + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}