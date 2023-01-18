public class City {
    private String cityName ;
    private String geographicalArea ;
    private String[] theStreet ;

    public City (String cityName , String geographicalArea , String[] theStreat){
        this.cityName = cityName ;
        this.geographicalArea = geographicalArea ;
        this.theStreet = theStreat ;
    }
    public void City1(){

    }


    public String[] getTheStreat(){
        return theStreet ;
    }

    public void setTheStreat(String streats){
        this.theStreet = theStreet ;
    }
    public String getCityName (){
        return cityName;
    }
    public void setCityName (String cityName) {
        this.cityName = this.cityName;
    }
    public String getGeographicalArea(){
        return geographicalArea ;
    }
    public void setGeographicalArea(String geographicalArea){
        this.geographicalArea = this.geographicalArea;
    }



    public String toString() {
        return cityName ;
    }
}