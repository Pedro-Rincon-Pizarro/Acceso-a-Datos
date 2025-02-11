/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pedro.rinpiz
 */
public class City {

    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    public City(int id, String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    
     

    
      public int getId() {
          return id;}


    
      public void setId(int id) {
          this.id = id;}


    
      public String getName() {
          return name;}


    
      public void setName(String name) {
          this.name = name;}


    
      public String getCountryCode() {
          return countryCode;}


    
      public void setCountryCode(String countryCode) {
          this.countryCode = countryCode;}


    
      public String getDistrict() {
          return district;}


    
      public void setDistrict(String district) {
          this.district = district;}


    
      public int getPopulation() {
          return population;}


    
      public void setPopulation(int population) {
          this.population = population;}


    @Override
    public String toString() {
        return "City:\n"
                 + "id: " + id + "\n"
                + " name: " + name + "\n"
                + " countryCode: " + countryCode + "\n"
                + " district: " + district + "\n"
                + " population: " + population + ".\n";
    }

}
