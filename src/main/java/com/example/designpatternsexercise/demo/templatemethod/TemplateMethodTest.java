package com.example.designpatternsexercise.demo.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        ShoeInstallTemplate adidasBoostShoeInstall = new AdidasBoostShoeInstall("adidas");
        adidasBoostShoeInstall.installShot();
        ShoeInstallTemplate nikeJordanShoeInstall = new NikeJordanShoeInstall("nike");
        nikeJordanShoeInstall.installShot();
    }
}
