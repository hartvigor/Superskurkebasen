package no.hartvigor.superskurkebasen.classes;

//Klasse for skurkeinformasjon

import java.io.Serializable;

import androidx.annotation.DrawableRes;
import no.hartvigor.superskurkebasen.R;

// Serializabale
public class SuperSkurk implements Serializable {
    private String skurkNavn;
    private @DrawableRes Integer skurkImg;
    private String skurkDato;
    private Integer skurkBesk;
    private String skurkEtterlyst;

    public SuperSkurk(String skurkNavn, @DrawableRes Integer skurkImg, String villainDate, Integer villainDsc, String villainWanted) {
        this.skurkNavn = skurkNavn;
        this.skurkImg = skurkImg;
        this.skurkDato = villainDate;
        this.skurkBesk = villainDsc;
        this.skurkEtterlyst = villainWanted;
    }

    public SuperSkurk() {

    }


    // Return for databinding til XML for Boolean
    private String etterlystString;
    public String isWanted() {
        return skurkEtterlyst.toString();
    }

    public String getSkurkNavn()
    {
        return skurkNavn;
    }

    public void setSkurkNavn(String skurkNavn)
    {
        this.skurkNavn = skurkNavn;
    }

    public @DrawableRes Integer getSkurkImg()
    {
        return skurkImg;
    }

    public void setSkurkImg(int skurkImg)
    {
        this.skurkImg = skurkImg;
    }

    public String getSkurkDato()
    {
        return skurkDato;
    }

    public void setSkurkDato(String skurkDato)
    {
        this.skurkDato = skurkDato;
    }

    public Integer getSkurkBesk()
    {
        return skurkBesk;
    }

    public void setSkurkBesk(Integer skurkBesk)
    {
        this.skurkBesk = skurkBesk;
    }

    public String getSkurkEtterlyst()
    {
        return skurkEtterlyst;
    }

    public void setSkurkEtterlyst(String skurkEtterlyst)
    {
        this.skurkEtterlyst = skurkEtterlyst;
    }
}
