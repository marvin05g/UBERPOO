class driver Extends Account {
    public driver (String name, String document, String email, String password){
        super (name, document, email, password);

    }
    void printDataDriver(){
        System.out.println("document Driver:" + document + "name Driver:" + name + "email:" + emial + 
        "password: " + password ); 
    }
}