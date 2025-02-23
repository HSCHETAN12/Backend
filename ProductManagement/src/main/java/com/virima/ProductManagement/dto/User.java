package com.virima.ProductManagement.dto;

import com.virima.ProductManagement.Base.Parent;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
public class User extends Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 3,max = 10,message = "Enter minimum 3 charecters")
    private String name;
    @Size(min = 5,max = 15,message = "It should be between 5 and 15 charecters")
    private String username;
    @Email(message = "It should me proper Email format")
    @NotEmpty(message = "Email is requried")
    private String email;
    @DecimalMin(value = "6000000000",message = "It should be proper numbere format")
    @DecimalMax(value = "9999999999",message = "It should be proper numbere format")
    private Long mobile;
    @Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",message = "It should contain atleast 8 charecter, one uppercase, one lowercase, one number and one speacial charecter")
    private String password;
    @Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$",message = "It should contain atleast 8 charecter, one uppercase, one lowercase, one number and one speacial charecter")
    @Transient
    private String confirmpassword;
    @NotNull(message = "It is required Field")
    private String gender;
    private int otp;
    private boolean verified;

    public User() {
    }

    public User(String name, String username, String email, Long mobile, String password, String confirmpassword, String gender, int otp, boolean verified) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.gender = gender;
        this.otp = otp;
        this.verified = verified;
    }

    public User(int id, String name, String username, String email, Long mobile, String password, String confirmpassword, String gender, int otp, boolean verified) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.gender = gender;
        this.otp = otp;
        this.verified = verified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
