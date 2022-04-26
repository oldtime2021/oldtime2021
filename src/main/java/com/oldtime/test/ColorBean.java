package com.oldtime.test;

public class ColorBean {
    private String CMYK;
    private String RGB;
    private String hex;
    private String name;
    private String pinyin;

    @Override
    public String toString() {
        return "ColorBean{" +
                "CMYK='" + CMYK + '\'' +
                ", RGB='" + RGB + '\'' +
                ", hex='" + hex + '\'' +
                ", name='" + name + '\'' +
                ", pinyin='" + pinyin + '\'' +
                '}';
    }

    public String getCMYK() {
        return CMYK;
    }

    public void setCMYK(String CMYK) {
        this.CMYK = CMYK;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
