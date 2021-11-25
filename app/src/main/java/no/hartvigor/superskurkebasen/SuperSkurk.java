package no.hartvigor.superskurkebasen;

//Klasse for skurkeinformasjon

public class SuperSkurk {
    private String skurkNavn;
    private String skurkImg;
    private String skurkDato;
    private String skurkBesk;
    private Boolean skurkEtterlyst;

    public SuperSkurk(String skurkNavn, String skurkImg, String villainDate, String villainDsc, Boolean villainWanted) {
        this.skurkNavn = skurkNavn;
        this.skurkImg = skurkImg;
        this.skurkDato = villainDate;
        this.skurkBesk = villainDsc;
        this.skurkEtterlyst = villainWanted;
    }

    public SuperSkurk() {

    }

    public String getSkurkNavn()
    {
        return skurkNavn;
    }

    public void setSkurkNavn(String skurkNavn)
    {
        this.skurkNavn = skurkNavn;
    }

    public String getSkurkImg()
    {
        return skurkImg;
    }

    public void setSkurkImg(String skurkImg)
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

    public String getSkurkBesk()
    {
        return skurkBesk;
    }

    public void setSkurkBesk(String skurkBesk)
    {
        this.skurkBesk = skurkBesk;
    }

    public Boolean getSkurkEtterlyst()
    {
        return skurkEtterlyst;
    }

    public void setSkurkEtterlyst(Boolean skurkEtterlyst)
    {
        this.skurkEtterlyst = skurkEtterlyst;
    }
}
