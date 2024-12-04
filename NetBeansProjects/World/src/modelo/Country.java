/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pedro.rinpiz
 */
public class Country {
    
    private String code;
    private String name;
    private String continent;
    private String region;
    private double surfaceArea;
    private int indepYear;
    private int population;
    private double lifeExpectancy;
    private double gnp;
    private double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private int capital;
    private String code2;

    public Country(String code, String name, String continent, String region, double surfaceArea, int indepYear, int population, double lifeExpectancy, double gnp, double gnpOld, String localName, String governmentForm, String headOfState, int capital, String code2) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
    }

    public Country() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the continent
     */
    public String getContinent() {
        return continent;
    }

    /**
     * @param continent the continent to set
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the surfaceArea
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * @param surfaceArea the surfaceArea to set
     */
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    /**
     * @return the indepYear
     */
    public int getIndepYear() {
        return indepYear;
    }

    /**
     * @param indepYear the indepYear to set
     */
    public void setIndepYear(int indepYear) {
        this.indepYear = indepYear;
    }

    /**
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * @return the lifeExpectancy
     */
    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    /**
     * @param lifeExpectancy the lifeExpectancy to set
     */
    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    /**
     * @return the gnp
     */
    public double getGnp() {
        return gnp;
    }

    /**
     * @param gnp the gnp to set
     */
    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    /**
     * @return the gnpOld
     */
    public double getGnpOld() {
        return gnpOld;
    }

    /**
     * @param gnpOld the gnpOld to set
     */
    public void setGnpOld(double gnpOld) {
        this.gnpOld = gnpOld;
    }

    /**
     * @return the localName
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * @param localName the localName to set
     */
    public void setLocalName(String localName) {
        this.localName = localName;
    }

    /**
     * @return the governmentForm
     */
    public String getGovernmentForm() {
        return governmentForm;
    }

    /**
     * @param governmentForm the governmentForm to set
     */
    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    /**
     * @return the headOfState
     */
    public String getHeadOfState() {
        return headOfState;
    }

    /**
     * @param headOfState the headOfState to set
     */
    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    /**
     * @return the capital
     */
    public int getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(int capital) {
        this.capital = capital;
    }

    /**
     * @return the code2
     */
    public String getCode2() {
        return code2;
    }

    /**
     * @param code2 the code2 to set
     */
    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        return "Country:\n"
                + "code: " + code + "\n"
                + " name=" + name + "\n "
                + "continent=" + continent + "\n"
                + " region=" + region + "\n"
                + " surfaceArea=" + surfaceArea + "\n"
                + " indepYear=" + indepYear + ", population=" + population + ", lifeExpectancy=" + lifeExpectancy + ", gnp=" + gnp + ", gnpOld=" + gnpOld + ", localName=" + localName + ", governmentForm=" + governmentForm + ", headOfState=" + headOfState + ", capital=" + capital + ", code2=" + code2 + '}';
    }
     
}
