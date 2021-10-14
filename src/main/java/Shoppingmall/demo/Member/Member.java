package Shoppingmall.demo.Member;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity

public class Member {
    @Id
    private String id;
    private String password;
    private String E_mail;
    private Long Phone1;
    private Long Phone2;
    private Long phone3;

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
        return phone3;
    }

    public void setPhone3(Long pheon3) {
        this.phone3 = pheon3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String e_mail) {
        E_mail = e_mail;
    }
}
