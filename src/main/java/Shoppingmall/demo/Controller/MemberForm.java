package Shoppingmall.demo.Controller;

public class MemberForm {
    private String Id;
    private String Password;
    private String E_mail;
    private Long Phone1;
    private Long Phone2;
    private Long Phone3;

    public Long getPhone1() {
        return Phone1;
    }

    public void setPhone1(Long phone1) {
        Phone1 = phone1;
    }

    public Long getPhone2() {
        return Phone2;
    }

    public void setPhone2(Long phone2) {
        Phone2 = phone2;
    }

    public Long getPhone3() {
        return Phone3;
    }

    public void setPhone3(Long phone3) {
        Phone3 = phone3;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }
}
