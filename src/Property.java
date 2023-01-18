public class Property  {

     private City cityName ;

     private String [] street ;
     private int numberRoom ;
     private int price ;
     private String apartmentType ;
     private boolean forSell ;
     private int homeNumber ;
     private int floorNumber ;
     private String postedName ;

     public Property(City CityName , String [] street , int numberRoom , int price , String ApartmentType , boolean forSell , int homeNumber , int floorNumber , String postedName){
          this.cityName = CityName ;
          this.street = street ;
          this.numberRoom = numberRoom;
          this.price = price ;
          this.apartmentType = ApartmentType ;
          this.forSell = forSell ;
          this.homeNumber = homeNumber ;
          this.floorNumber = floorNumber ;
          this.postedName = postedName ;
     }




     public City getCityName (){
          return cityName ;
     }
     public void setCityName(City nameCityUser){
          this.cityName = cityName ;
     }
     public String [] getStreat (){
          return street ;
     }
     public void setStreat (String [] streat){
          this.street = streat ;
     }
     public int getNumberRoom (){
          return numberRoom ;
     }
     public void setNumberRoom (int numberRoom){
          this.numberRoom = numberRoom ;
     }
     public int getPrice (){
          return  price ;
     }
     public void setPrice (int price){
          this.price = price ;
     }
     public String getApartmentType (){
          return apartmentType;
     }
     public void setApartmentType (String apartmentType){
          this.apartmentType = apartmentType ;
     }
     public boolean getForSell (){
          return  forSell ;
     }
     public void setForSell(boolean forSell){
          this.forSell = forSell ;
     }
     public int getHomeNumber (){
          return homeNumber ;
     }
     public void setHomeNumber(int homeNumber){
          this.homeNumber = homeNumber ;
     }
     public int getFloorNumber (){
          return floorNumber ;
     }
     public void setFloorNumber (int floorNumber){
          this.floorNumber = floorNumber ;
     }
     public String getPostedName (){
          return postedName ;
     }
     public void setPostedName(String postedName){
          this.postedName = postedName ;
     }



     public String toString() {

          return  cityName + "-" + street + " " + homeNumber + "." + "\n"
                  + apartmentType + "-" + forSell + ": " + numberRoom + " rooms" + ", floor " + floorNumber + "." + "\n"
                  + "Price : " + price + " $." + "\n"
                  + postedName;

     }
}