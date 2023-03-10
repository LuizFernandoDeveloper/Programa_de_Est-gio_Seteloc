package model;

public class Bet {
    
    private Integer number;
    private String  color;
    private String  time;
    private String  Data;
    private Float   apostaNoVermelho;
    private Float   apostaNoBranco;
    private Float   apostaNoPreto;
    private String  seed;
    
    public Bet(Integer number, String color, String time, String data, Float apostaNoVermelho, Float apostaNoBranco,
            Float apostaNoPreto, String seed) {
        this.number = number;
        this.color = color;
        this.time = time;
        Data = data;
        this.apostaNoVermelho = apostaNoVermelho;
        this.apostaNoBranco = apostaNoBranco;
        this.apostaNoPreto = apostaNoPreto;
        this.seed = seed;
    }
    
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getData() {
        return Data;
    }
    public void setData(String data) {
        Data = data;
    }
    public Float getApostaNoVermelho() {
        return apostaNoVermelho;
    }
    public void setApostaNoVermelho(Float apostaNoVermelho) {
        this.apostaNoVermelho = apostaNoVermelho;
    }
    public Float getApostaNoBranco() {
        return apostaNoBranco;
    }
    public void setApostaNoBranco(Float apostaNoBranco) {
        this.apostaNoBranco = apostaNoBranco;
    }
    public Float getApostaNoPreto() {
        return apostaNoPreto;
    }
    public void setApostaNoPreto(Float apostaNoPreto) {
        this.apostaNoPreto = apostaNoPreto;
    }
    public String getSeed() {
        return seed;
    }
    public void setSeed(String seed) {
        this.seed = seed;
    }

}
