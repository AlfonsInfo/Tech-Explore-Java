package com.example.demo.oop.basic;

import java.util.Map;
import java.util.Objects;


/**
 * Class is a blueprint of an object
 */


public class BluePrintObject {

    /**
     * attribute
     * <access modifier> <data type> <variable name>
     */

    private String id;
    private String namaObject;
    private Map<String, String> attributObject;

    /**
     *  constructor
     *  define how to construct an object
     */
    public BluePrintObject() {
    }

    public BluePrintObject(String id, String namaObject, Map<String, String> attributObject) {
        this.id = id;
        this.namaObject = namaObject;
        this.attributObject = attributObject;
    }

    //getter dan setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaObject() {
        return namaObject;
    }

    public void setNamaObject(String namaObject) {
        this.namaObject = namaObject;
    }

    public Map<String, String> getAttributObject() {
        return attributObject;
    }

    public void setAttributObject(Map<String, String> attributObject) {
        this.attributObject = attributObject;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BluePrintObject that = (BluePrintObject) o;
        return Objects.equals(id, that.id) && Objects.equals(namaObject, that.namaObject) && Objects.equals(attributObject, that.attributObject);
    }

    @Override
    public String toString() {
        return "BluePrintObject{" +
                "id='" + id + '\'' +
                ", namaObject='" + namaObject + '\'' +
                ", attributObject=" + attributObject +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namaObject, attributObject);
    }

}
