package fpt.testemail;

/**
 *
 * @author ASUS
 */
public class TestEmail {
    
    public void menu() {
        
    }

    public static void main(String[] args) {
        // dinh dang email
        String kiemTraEmail = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        
        if("thuan@gmail.com".matches(kiemTraEmail)) {
            System.out.println("Email dung!");
        } else {
            System.out.println("Email sai!");
        }
    }
}
