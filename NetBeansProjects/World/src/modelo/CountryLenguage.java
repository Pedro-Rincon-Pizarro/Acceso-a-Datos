/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pedro.rinpiz
 */
public class CountryLenguage {

    private String countryCode;
    private String language;
    private boolean isOfficial;
    private double percentage;

    public CountryLenguage(String countryCode, String language, boolean isOfficial, double percentage) {
        this.countryCode = countryCode;
        this.language = language;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }


      public String getCountryCode() {
          return countryCode;}


      public void setCountryCode(String countryCode) {
          this.countryCode = countryCode;}


      public String getLanguage() {
          return language;}


      public void setLanguage(String language) {
          this.language = language;}


      public boolean getIsOfficial() {
          return isOfficial;}


      public void setIsOfficial(boolean isOfficial) {
          this.isOfficial = isOfficial;}


      public double getPercentage() {
          return percentage;}


      public void setPercentage(double percentage) {
          this.percentage = percentage;}


    @Override
    public String toString() {
        return "CountryLanguage:\n" + "countryCode: " + countryCode + "\n language: " + language + "\n isOfficial: " + isOfficial + "\n percentage: " + percentage + ".\n";
    }

}
