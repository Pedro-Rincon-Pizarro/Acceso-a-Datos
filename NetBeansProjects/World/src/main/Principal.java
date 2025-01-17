/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.CityDao;
import dao.CountryDao;
import dao.CountryLenguageDAO;
import java.util.Scanner;
import modelo.City;
import modelo.Country;
import modelo.CountryLenguage;

/**
 *
 * @author pedro.rinpiz
 */
public class Principal {

    static Scanner sc = new Scanner(System.in);

    static CountryDao countryDao = new CountryDao();
    static CityDao cityDao = new CityDao();
    static CountryLenguageDAO lenguageDao = new CountryLenguageDAO();
    static int eleccion = 0;

    public static void main(String[] args) {

        do {
            menuApp();  
        } while (eleccion != 0);
    }

    public static void menuApp() {
        System.out.println("=== Menú de la apicación ===");
        System.out.println("1.- Gestionar ciudades");
        System.out.println("2.- Gestionar paises");
        System.out.println("3.- Gestionar idiomas");
        System.out.println("0.- Salir");
        System.out.println("Selecciona una opción");
        System.out.println("");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 0:
                System.out.println("Saliendo del programa");
                break;

            case 1:
                menuCiudades();
                break;

            case 2:
                menuPaises();
                break;

            case 3:
                menuIdiomas();
                break;
                
            default:
                System.out.println("Introduce una opcion valida");
        }

    }

    public static void menuCiudades() {
        int eleccion = 0;
        System.out.println("=== Menú de Ciudades ===");
        System.out.println("1.- Listar ciudades");
        System.out.println("2.- Agregar ciudad");
        System.out.println("3.- Modificar ciudad");
        System.out.println("4.- Eliminar ciudad");
        System.out.println("0.- Volver al menu principal");
        System.out.println("Selecciona una opción");
        System.out.println("");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 0:
                System.out.println("Volviendo al menú principal");
                break;

            case 1:
                listarCiudades();
                break;

            case 2:
                agergarCiudad();
                break;

            case 3:
                modificarCiudad();
                break;
                
            case 4:
                eliminarCiudad();
                break;
            default:
                System.out.println("Introduce una opcion valida");
        }
    }

    public static void menuPaises() {
        int eleccion = 0;
        System.out.println("=== Menú de Paises ===");
        System.out.println("1.- Listar Paises");
        System.out.println("2.- Agregar Pais");
        System.out.println("3.- Modificar Pais");
        System.out.println("4.- Eliminar Pais");
        System.out.println("0.- Volver al menu principal");
        System.out.println("Selecciona una opción");
        System.out.println("");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 0:
                System.out.println("Volviendo al menú principal");
                break;

            case 1:
                listarPaises();
                break;

            case 2:
                agregarPais();
                break;

            case 3:
                modificarPais();
                break;
                
            case 4:
                eliminarPais();
                break;
            default:
                System.out.println("Introduce una opcion valida");
        }
    }

    public static void menuIdiomas() {
        int eleccion = 0;
        System.out.println("=== Menú de Idiomas ===");
        System.out.println("1.- Listar Idiomas");
        System.out.println("2.- Agregar Idioma");
        System.out.println("3.- Modificar Idioma");
        System.out.println("4.- Eliminar Idioma");
        System.out.println("0.- Volver al menu principal");
        System.out.println("Selecciona una opción");
        System.out.println("");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 0:
                System.out.println("Volviendo al menú principal");
                break;

            case 1:
                listarIdiomas();
                break;

            case 2:
                agergarIdioma();
                break;

            case 3:
                modificarIdioma();
                break;
                
            case 4:
                eliminarIdioma();
                break;
            default:
                System.out.println("Introduce una opcion valida");
        }
    }

    private static void listarCiudades() {
        try {
            System.out.println(cityDao.getAllCities());
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }

    private static void agergarCiudad() {
        System.out.println("Introduce el nombre de la Ciudad");
        String nombre = sc.next();
        System.out.println("Introduce el el codigo del Pais al que pertenece");
        String countryCode = sc.next();
        System.out.println("Introduce el codigo postal");
        String district = sc.next();
        System.out.println("Introduce la poblacion de la Ciudad");
        int population = sc.nextInt();

        City city = new City(-1, nombre, countryCode, district, population);
        cityDao.insertCity(city);
    }

    private static void modificarCiudad() {
        System.out.println("Introduce el id de la ciudad");
        int id = sc.nextInt();
        System.out.println("Introduce el nombre de la Ciudad");
        String nombre = sc.next();
        System.out.println("Introduce el el codigo del Pais al que pertenece");
        String countryCode = sc.next();
        System.out.println("Introduce el codigo postal");
        String district = sc.next();
        System.out.println("Introduce la poblacion de la Ciudad");
        int population = sc.nextInt();

        City city = new City(id, nombre, countryCode, district, population);
        cityDao.updateCity(city);
    }
    
    private static void eliminarCiudad()
    {
        System.out.println("Introduce el ID de la ciudad a eliminar");
        int id = sc.nextInt();
        cityDao.deleteCity(id);
    }

    private static void listarPaises() {
        try {
            System.out.println(countryDao.listarTodosLosPaises());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }

    private static void agregarPais() {
        System.out.println("Introduce el código del país:");
        String code = sc.next();
        System.out.println("Introduce el nombre del país:");
        String name = sc.next();
        System.out.println("Introduce el continente:");
        String continent = sc.next();
        System.out.println("Introduce la región:");
        String region = sc.next();
        System.out.println("Introduce el área superficial:");
        double surfaceArea = sc.nextDouble();
        System.out.println("Introduce el año de independencia:");
        int indepYear = sc.nextInt();
        System.out.println("Introduce la población:");
        int population = sc.nextInt();
        System.out.println("Introduce la esperanza de vida:");
        double lifeExpectancy = sc.nextDouble();
        System.out.println("Introduce el GNP:");
        double gnp = sc.nextDouble();
        System.out.println("Introduce el GNP antiguo:");
        double gnpOld = sc.nextDouble();
        System.out.println("Introduce el nombre local:");
        String localName = sc.next();
        System.out.println("Introduce la forma de gobierno:");
        String governmentForm = sc.next();
        System.out.println("Introduce el jefe de estado:");
        String headOfState = sc.next();
        System.out.println("Introduce el identificador de la capital:");
        int capital = sc.nextInt();
        System.out.println("Introduce el código secundario del país:");
        String code2 = sc.next();

        Country country = new Country(code, name, continent, region, surfaceArea, indepYear, population, lifeExpectancy, gnp, gnpOld, localName, governmentForm, headOfState, capital, code2);
        countryDao.insertCountry(country);

    }

    private static void modificarPais() {
        System.out.println("Introduce el código del país:");
        String code = sc.next();
        System.out.println("Introduce el nombre del país:");
        String name = sc.next();
        System.out.println("Introduce el continente:");
        String continent = sc.next();
        System.out.println("Introduce la región:");
        String region = sc.next();
        System.out.println("Introduce el área superficial:");
        double surfaceArea = sc.nextDouble();
        System.out.println("Introduce el año de independencia:");
        int indepYear = sc.nextInt();
        System.out.println("Introduce la población:");
        int population = sc.nextInt();
        System.out.println("Introduce la esperanza de vida:");
        double lifeExpectancy = sc.nextDouble();
        System.out.println("Introduce el GNP:");
        double gnp = sc.nextDouble();
        System.out.println("Introduce el GNP antiguo:");
        double gnpOld = sc.nextDouble();
        System.out.println("Introduce el nombre local:");
        String localName = sc.next();
        System.out.println("Introduce la forma de gobierno:");
        String governmentForm = sc.next();
        System.out.println("Introduce el jefe de estado:");
        String headOfState = sc.next();
        System.out.println("Introduce el identificador de la capital:");
        int capital = sc.nextInt();
        System.out.println("Introduce el código secundario del país:");
        String code2 = sc.next();

        Country country = new Country(code, name, continent, region, surfaceArea, indepYear, population, lifeExpectancy, gnp, gnpOld, localName, governmentForm, headOfState, capital, code2);
        countryDao.updateCountry(country);

    }
    
    private static void eliminarPais()
    {
        System.out.println("Introduce el codigo del pais a borrar(Ej: ESP)");
        String code = sc.next();
        countryDao.deleteCountry(code);
    }

    private static void listarIdiomas() {
        try {
            System.out.println(lenguageDao.getAllLenguages());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }

    private static void agergarIdioma() {
        System.out.println("Introduce el código del país:");
        String countryCode = sc.next();
        System.out.println("Introduce el idioma:");
        String language = sc.next();
        System.out.println("¿Es idioma oficial? (true/false):");
        boolean isOfficial = sc.nextBoolean();
        System.out.println("Introduce el porcentaje de hablantes:");
        double percentage = sc.nextDouble();

        CountryLenguage countryLanguage = new CountryLenguage(countryCode, language, isOfficial, percentage);
        lenguageDao.insertLenguage(countryLanguage);

    }

    private static void modificarIdioma() {
        System.out.println("Introduce el código del país:");
        String countryCode = sc.next();
        System.out.println("Introduce el idioma:");
        String language = sc.next();
        System.out.println("¿Es idioma oficial? (true/false):");
        boolean isOfficial = sc.nextBoolean();
        System.out.println("Introduce el porcentaje de hablantes:");
        double percentage = sc.nextDouble();

        CountryLenguage countryLanguage = new CountryLenguage(countryCode, language, isOfficial, percentage);
        lenguageDao.updateCountry(countryLanguage);
    }
    
    private static void eliminarIdioma()
    {
        System.out.println("Introduce el codigo del pais al que pertenece:");
        String countryCode = sc.next();
        System.out.println("Introduce el nombre del lenguaje a eliminar:");
        String lenguaje = sc.next();
        lenguageDao.deleteCountry(countryCode, lenguaje);
    }
}
