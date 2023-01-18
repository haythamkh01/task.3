import java.util.Scanner;

public class RealEstate {


    private User [] users;
    private Property [] property;

    private City [] city;


    public User [] getUsers() {
        return users;
    }

    public void setUsers(User[] userList) {
        this.users = users;
    }

    public Property[] getProperty() {
        return property;
    }

    public void setProperty() {
        this.property = property;
    }

    public City[] getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }



    public void createUser() {

        User newUser = new User();
        newUser.setUserName(newUserName());
        newUser.setPhoneNumber(userPhoneNumber());
        newUser.setPassword((createNewUserPassword()));
        newUser.setYouAreBroker(isMediator());
        if (isMediator()) {
            newUser.setLimitThePosts(5);
        }else {
            newUser.setLimitThePosts(2);
        }
        addUser(newUser);
    }

    private String newUserName() {
        String userName = null;
        boolean inAv = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Enter your username ");
            userName = scanner.nextLine();
        } while (!isUserNameExist(userName));
        return userName;


    }

    private String createNewUserPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = null;
        do {
            System.out.println(" Enter a strong password - at least 5 letters and one number and one of these symbol ( $ or % or _ ) ");
            password = scanner.nextLine();
        } while (!isStrongPassword(password));
        return password;
    }

    private String userPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = null;
        do {
            System.out.println(" Enter your Israel phone number ");
            phoneNumber = scanner.nextLine();

        } while (isCorrectPhoneNumber(phoneNumber));

        return phoneNumber;
    }

    private boolean isMediator() {
        Scanner scanner = new Scanner(System.in);
        int userChoose ;
        boolean youAreMidetor = false ;
        System.out.println("if you are midetor press 1 , if you dont miditor press 2");
        userChoose = scanner.nextInt();
        if (userChoose == 1) {
            youAreMidetor = true ;
        }
        return youAreMidetor ;
    }

    private boolean isUserNameExist(String userName) {
        boolean isNameAvailable = true;

        if (this.users != null) {
            for (int i = 0; i < this.users.length; i++) {
                String currentUserName = users[i].getUserName();
                if (userName.equals(currentUserName)) {
                    isNameAvailable = false;
                    break;
                }
            }
        }
        return isNameAvailable;
    }

    private boolean isStrongPassword(String password) {
        boolean strongPassword = false;

        boolean isContainsNum = password.contains("0") || password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") || password.contains("9");
        boolean isContainsSymbol = password.contains("$") || password.contains("%") || password.contains("_");
        if (isContainsNum && isContainsSymbol) {

            strongPassword = true;
        }


        return strongPassword;


    }

    private boolean isCorrectPhoneNumber(String phoneNumber) {
        boolean correctPhoneNumber = true ;
        String chickNumber = phoneNumber.substring(0, 2);
        String cheack = "qwertyuiopasdfghjklzxcvbnm" ;
        if (chickNumber.equals("05")) {
            correctPhoneNumber = true ;
        }  else {
            correctPhoneNumber = false ;
        }
        if (phoneNumber.length() != 10) {
            correctPhoneNumber = false ;

        }
        for (int i = 0; i < phoneNumber.length(); i++) {

            for (int j = 0; j < cheack.length(); j++) {
                if (phoneNumber.charAt(i) == cheack.charAt(j)) {
                    correctPhoneNumber = false;
                }


            }

        }

        return correctPhoneNumber;
    }

    private void addUser(User newUser) {


        if (this.users == null) {
            User[] usersList = new User[1];
            usersList[0] = newUser;
            this.users = usersList;

        } else {
            User[] newUsers = new User[this.users.length + 1];
            for (int i = 0; i < this.users.length; i++) {
                newUsers[i] = users[i];
            }
            newUsers[newUsers.length - 1] = newUser;
            this.users = newUsers;
        }
    }



    public User Login() {
        Scanner scanner = new Scanner(System.in);
        boolean isNull = true;
        int thisuser = 0;
        do {


            System.out.println("Enter Your User Name");
            String logInUserName = scanner.next();
            System.out.println("Enter Your Password");
            String logInpassword = scanner.next();
            for (int i = 0; i < this.users.length; i++) {
                if (logInUserName.equals(users[i].getUserName())  && logInpassword.equals(users[i].getPassword()) ) {
                    thisuser = i;
                } else {
                    System.out.println("this UserName And Password Incorrect ");
                    isNull = false;

                }


            }
        } while (isNull);
        int userChoose = 0;
        System.out.println("1 - publish a new property\n" +
                "2 - remove advertising on a property\n" +
                "3 - display all assets in the system\n" +
                "4 - Show all properties published by the user\n" +
                "5 - Search for a property by parameters\n" +
                "6 - Log out and return to the main menu\n");
        userChoose = scanner.nextInt();
        if (userChoose == 1) {
            postNewProperty(users[thisuser]);
        }
        else if (userChoose == 2){
            removeProperty(users[thisuser]);
        }
        else if (userChoose == 3){
            printAllProperties();
        }
        else if (userChoose == 4){
            printProperties(thisuser);

        }else if (userChoose == 5){

            search();
        }else if (userChoose == 6){
            createUser();

        }

        return users[thisuser];
    }





    public boolean postNewProperty(User user) {
        boolean YouAreBroker = false;
        if (user.getYouAreBroker()) {
            YouAreBroker = true;
        }





        if (YouAreBroker) {
            if (user.getLimitThePosts() >= 5) {
                System.out.println("you posted maximum , my friend");
                return false;
            }
        } else {
            if (user.getLimitThePosts() >= 2) {
                System.out.println("you posted maximum , my friend");
                return false;
            }
        }

        theCitis();
        Scanner scanner = new Scanner(System.in) ;
        String nameCityUser = null, geographicalArea = null;

        if (city != null) {
            theCitis();
        }
        for (int j = 0; j < city.length; j++) {
            System.out.println(city[j].getCityName());
        }

        System.out.println("Enter the city name that suits you from the list");
        nameCityUser = scanner.next();


        String TheStreatUser , apartmentType = null;
        int theChooseUser ;
        boolean isNotCorectNameCity = true ,itIsNotCorectStreat = true ;

        for (int i = 0; i < city.length; i++) {
            if (nameCityUser.equals(city[i].getCityName())) {
                isNotCorectNameCity = false ;
                for (int j = 0; j < city[i].getTheStreat().length; j++) {
                    System.out.println(city[i].getTheStreat()[j]);
                }
                System.out.println("choose streat");
                TheStreatUser = scanner.next();
                break;

                for (int m = 0; m < city[i].getTheStreat().length; m++) {
                    if (TheStreatUser.equals(city[i].getTheStreat()[m])){
                        itIsNotCorectStreat = false ;
                        System.out.println(" what you want to do ?? prees (1 – for a regular apartment in an apartment building 2 – for a penthouse apartment in an apartment building, 3 – for a private house).");
                        theChooseUser = scanner.nextInt() ;
                        if (theChooseUser > 3 || theChooseUser < 1){
                            System.out.println("This number is out of use");
                            return false ;
                        }else {
                            if (theChooseUser == 1){
                                apartmentType = "regular apartment in an apartment building" ;
                            }if (theChooseUser == 2){
                                apartmentType = "for a penthouse apartment in an apartment building" ;
                            }else {
                                apartmentType = " a private house" ;
                            }

                        }

                        creatProprety(City[i].nameCityUser, new String[]{TheStreatUser}, apartmentType );
                        System.out.println("its published");
                        user.setLimitThePosts(-1);
                    }
                }

            }
            if (itIsNotCorectStreat) {
                System.out.println("this street does not exist");
                return false ;
            }
        }







        if(isNotCorectNameCity) {
            System.out.println("this city is not exist");
            return false;
        }
        System.out.println("it is published");

        return  true ;
    }
    public void creatProprety(City cityName , String [] streetName , String apartmentType ){      //هني بنعبي الproperty حسب ما وده اليوزر
        Scanner scanner = new Scanner(System.in) ;
        streetName = null;
        int TheRooms , housingNumber , forTheSaleOrTheManagement , howMuch , TheFloor ;
        boolean forTheSell = false ;
        String WhatIsYourName = null ;

        System.out.println("in which floor the residence") ;
        TheFloor = scanner.nextInt() ;
        System.out.println("How many rooms are there in the residence?") ;
        TheRooms = scanner.nextInt() ;
        System.out.println("What is the housing number") ;
        housingNumber = scanner.nextInt() ;
        System.out.println("Is the housing for sale or for management?  If it is for sale, press 1, if it is for rent, press 2 ");
        forTheSaleOrTheManagement = scanner.nextInt();
        if (forTheSaleOrTheManagement == 1){
            forTheSell = true ;
        }
        System.out.println("What is the price of housing");
        howMuch = scanner.nextInt();
        System.out.println("And in the end, what is your name that you want to register with this post");
        WhatIsYourName = scanner.next() ;


        Property property1 = new Property( cityName , streatName , TheRooms , howMuch ,apartmentType , forTheSell ,housingNumber , TheFloor , WhatIsYourName ) ;
        addProperty(property1) ;
    }

    private void theCitis() {         //هذي المتودا بتشتغل لما ما يكون في اساع مدن بيفوت هني وبيفوت مدينه مع شوارع
        String Streats = ("eman"+ "alnoor" + "omarAlmhtar" + "algzar") ;
        City c1 = new City("rahat" , "drom" , new String[]{Streats});
        newCity(c1);
        String Streat1 = ("dort" + "sopry" + "deth" + "dobay") ;
        City c2 = new City("hrtslea" , "drom" ,new String[] {Streat1}) ;
        newCity(c2);
        String Streat2 = ("strong" + "demony" + "ashak" + "book") ;
        City c3 = new City("afola" , "north" , new String[]{Streats});
        newCity(c3);
        String Streat3 = ("love" + "dembal" + "maxixano" + "zakarya") ;
        City c4 = new City("haefa" , "north" , new String[]{Streat3});
        newCity(c4);
    }

    //متودا بتفوت المدينه
    public void newCity(City newCity) {
        if (this.city == null) {
            City[] NewCity = new City[1];
            NewCity[0] = newCity;
            this.city = NewCity;

        } else {
            City[] NewCity = new City[this.city.length + 1];
            for (int i = 0; i < this.city.length; i++) {
                NewCity[i] = city[i];
            }
            NewCity[NewCity.length - 1] = newCity;
            this.city = NewCity;
        }
    }   //هني بنفوت المدينه بتسير جاهزه وهذول النتدوتوت بنستعملهن عند اضافة مدينه





    public void removeProperty(User user){
        Property [] properties = new Property[property.length - 1] ;
        Scanner scanner = new Scanner(System.in);
        int numberToDeleta = 0;
        boolean YouAreMiditor = false , YouCanComplete = true ;
        if (user.getYouAreBroker()) {
            YouAreMiditor = true;
        }
        if (YouAreMiditor){
            if (user.getLimitThePosts() == 5){
                System.out.println("YOU dount have any post for which the reason cannot be deleted");
                YouCanComplete = false ;
            }
        }else {
            if (user.getLimitThePosts() == 2){
                System.out.println("YOU dount have any post for which the reason cannot be deleted");
                YouCanComplete = false ;
            }
        }

        if (YouCanComplete){
            for (int i = 0; i < property.length; i++) {
                System.out.println("choose the post number you want to delete"+ i);
                numberToDeleta = scanner.nextInt() ;
            }
            for (int i = 0; i < properties.length; i++) {
                if (property[i] != property[numberToDeleta]) {
                    properties[i] = property[i] ;
                    this.property = properties ;

                }
            }
        }



    }


    void printProperties (int user){
        toString();

    }



    public void addProperty(Property property){
        if (this.property == null) {
            Property[] propretyList = new Property[1];
            propretyList[0] = property;
            this.property = propretyList;

        } else {
            Property[] newproperty = new Property[this.property.length + 1];
            for (int i = 0; i < this.property.length; i++) {
                newproperty[i] = this.property[i];
            }
            newproperty[newproperty.length - 1] = property;
            this.property = newproperty;
        }


    }


    // this func when the user press 3 # print all the properties
    public void printAllProperties (){

        for (int i = 0; i < property.length; i++) {

            System.out.println(property[i]);

        }
    }
    public Property [] search (){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" is it for rent or for sale ");
        String propertyStatus = scanner.nextLine();
        System.out.println(" what's the property type ");
        String propertyType = scanner.nextLine();
        System.out.println(" what's the number of rooms ");
        String roomNumber = scanner.nextLine();
        System.out.println(" what's the price range ");
        String propertyPrice = scanner.nextLine();

        int roomsNumber = Integer.parseInt(roomNumber);
        int price = Integer.parseInt(propertyPrice);

        for (int i = 0; i < property.length; i++) {

            if (propertyStatus.equals( property [i].getForSell())){
                if (propertyType.equals(property [i].getApartmentType())){
                    if (roomsNumber == property [i].getNumberRoom()){
                        if (price == property[i].getPrice()){

                            String [] propertyArray = {propertyStatus,propertyType,roomNumber,propertyPrice};

                            Property [] propertyInfo = new Property[this.property.length + 1];

                            for (int j = 0; j < this.property.length; j++) {




                            }

                        }
                    }
                }
            }
        }



        return;

    }





}

