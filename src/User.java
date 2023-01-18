public class User {private String name ;
    private String UserName ;
    private String password ;
    private String phoneNumber ;
    private boolean youAreBroker ;

    private int limitThePosts ;





    public int getLimitThePosts (){
        return limitThePosts ;
    }
    public void setLimitThePosts(int limitThePosts){
        this.limitThePosts = limitThePosts ;
    }

    public String getUserName(){
        return UserName;
    }
    public void setUserName(String s){
        this.UserName = UserName;
    }
    public String getPassword (){
        return password ;
    }
    public void setPassword(String newUserPassword){
        this.password = password ;
    }
    public String getPhoneNumber(){
        return phoneNumber ;
    }
    public void setPhoneNumber(String s){
        this.phoneNumber = phoneNumber ;
    }
    public boolean getYouAreBroker(){
        return youAreBroker ;
    }
    public void setYouAreBroker(boolean youAreBroker){
        this.youAreBroker = youAreBroker ;
    }


    public String toString() {

        String userState;

        if (youAreBroker == false){
            userState = " ( Not a real estate broker ! ). " ;
        }else {
            userState = " ( Real estate broker ). ";

        }
        return " Contact info : " +name + " " + phoneNumber + userState ;


    }
}