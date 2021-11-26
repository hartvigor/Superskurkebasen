package no.hartvigor.superskurkebasen;

//Klasse for skurkeinformasjon

public class SuperSkurk {
    private String skurkNavn;
    private Integer skurkImg;
    private String skurkDato;
    private Integer skurkBesk;
    private Boolean skurkEtterlyst;

    public SuperSkurk(String skurkNavn, Integer skurkImg, String villainDate, Integer villainDsc, Boolean villainWanted) {
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

    public Integer getSkurkImg()
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

    public Boolean getSkurkEtterlyst()
    {
        return skurkEtterlyst;
    }

    public void setSkurkEtterlyst(Boolean skurkEtterlyst)
    {
        this.skurkEtterlyst = skurkEtterlyst;
    }
}
