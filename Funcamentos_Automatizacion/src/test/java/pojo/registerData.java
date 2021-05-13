package pojo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class registerData {
    private String firstName;
    private String lastName;
    private String emailRegister;
    private String telephone;
    private String password;
    private String confirmPassword;
    public String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    public java.util.Random rand;
    public Set<String> identifiers = new HashSet<String>();

    public String UserEmail() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString.toString();
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmailRegister() { return UserEmail() + this.emailRegister; }
    public String getTelephone(){ return this.telephone; }
    public String getPassword() {
        return this.password;
    }
    public String getConfirmPassword(){
        return this.confirmPassword;
    }

    public registerData(String _firstName, String _lastName, String _emailRegister, String _telephone, String _password, String _confirmPassword) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.emailRegister = _emailRegister;
        this.telephone = _telephone;
        this.password = _password;
        this.confirmPassword = _confirmPassword;
    }
}