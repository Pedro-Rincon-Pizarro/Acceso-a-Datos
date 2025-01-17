/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.CityDao;
import dao.CountryDao;
import dao.CountryLenguageDAO;
import java.util.List;
import modelo.City;
import modelo.Country;
import modelo.CountryLenguage;

/**
 *
 * @author pedro.rinpiz
 */
public class Main 
{
    public static void main(String[] args) {
        try {
            CountryDao countryDao =  new CountryDao();
            List<Country> paises = countryDao.listarTodosLosPaises();
            
            //countryDao.updateCountry(new Country("ZWE", "Zimbabwe", "Africa", "Eastern Africa", 30000, 1996, 777777, 42.0, 5555.5, 6666.6, "Zumbabwe", "Republic", "Roberto Vaquero", 4040, "Zw"));
            //countryDao.insertCountry(new Country("ABB", "Aurelia", "Asia", "Central Asia", 35000, 2020, 123456, 75.0, 1234.5, 5678.9, "Aurelian", "Empire", "Arius Flavius", 5050, "AA"));
            countryDao.deleteCountry("ZWE");
            paises = null;
            paises = countryDao.listarTodosLosPaises();
            
            System.out.println("Lista de todos los paises");
            
            for(Country pais : paises)
            {
                System.out.println(pais.toString());
            }
           
            
            
            CityDao cityDao =  new CityDao();
            cityDao.updateCity(new City(4079, "Rafah", "PSE", "Rafah", 1000));
            cityDao.deleteCity(4092);
            //cityDao.insertCity(new City(-1,"Burgos", "ESP", "Castilla y Leon", 200000));
            List<City> ciudades = cityDao.getAllCities();
            
            System.out.println("Lista de todos los paises");
            
            for(City ciudad : ciudades)
            {
                System.out.println("ID: " + ciudad.getId() + " | " +
                        "Name: " + ciudad.getName() + " | " +
                        "CountryCode: " + ciudad.getCountryCode() + " | " +
                        "District: " + ciudad.getDistrict() + " | " +
                        "Population: " + ciudad.getPopulation());
                
            }
            System.out.println(countryDao.obtenerCountryPorCodigo("VNM"));
            
            CountryLenguageDAO countryLenguage =  new CountryLenguageDAO();
            
            //countryLenguage.insertLenguage(new CountryLenguage("VNM", "Catalan", true, 4.56));
            
            //countryLenguage.updateCountry(new CountryLenguage("PSE", "Hebrew", true, 2.00));
            System.out.println(countryLenguage.getAllLenguages());
            //countryLenguage.deleteCountry("PSE", "Hebrew");

        } catch (Exception e) {
        }
    }
}
