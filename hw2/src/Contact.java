record Contact(String name, String email){
    Contact(String name, String email){
        if(name.isEmpty() || name == null){
            name = "BLANK NAME";
            System.out.println("EMPTY NAME");
        }
        if(!email.substring(email.length()-10).equals("@gmail.com")){
            email = "WRONG EMAIL FORMAT";
            System.out.println("WRONG EMAIL FORMAT");
        }
        this.email = email;
        this.name = name;
    }
    Contact(String name) {
        this(name, "PlaceHolder@gmail.com");
    }
    public String toString() {
        return String.format("Name %s, Email: %s", name, email);
    }
}