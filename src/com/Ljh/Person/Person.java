package com.Ljh.Person;

import com.Ljh.transport.AirTransport;
import com.Ljh.transport.LandTransport;
import com.Ljh.transport.MaritimeMeansOfTransport;


/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/17 18:56
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public void drivingMethod(AirTransport airTransport){
        System.out.println(this.id+"  driving   "+airTransport.getId());
    }

    public void drivingMethod(LandTransport landTransport){
        System.out.println(this.id+"  driving   "+landTransport.getId());
    }

    public void drivingMethod(MaritimeMeansOfTransport maritimeMeansOfTransport){
        System.out.println(this.id+"  driving   "+maritimeMeansOfTransport.getId());
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }
}
