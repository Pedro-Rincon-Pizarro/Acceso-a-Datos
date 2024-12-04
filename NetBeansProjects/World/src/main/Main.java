/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.CityDao;
import dao.CountryDao;
import java.util.List;
import modelo.City;
import modelo.Country;

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
            
            System.out.println("Lista de todos los paises");
            
            for(Country pais : paises)
            {
                System.out.println("Codigo: " + pais.getCode() + "Paises: " + pais.getName() + " | " + ". Continente: " + pais.getContinent());
                
            }
            
            
            
            CityDao cityDao =  new CityDao();
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
        } catch (Exception e) {
        }
    }
}
