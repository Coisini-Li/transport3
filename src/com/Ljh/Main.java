package com.Ljh;

import com.Ljh.Person.Person;
import com.Ljh.transport.Airship;
import com.Ljh.transport.Automobile;
import com.Ljh.transport.Ship;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person tom = new Person("tom.201902208");

        Airship tomairship = new Airship("airship1");

        Automobile tomautomobile = new Automobile("automobile1");

        Ship ship = new Ship("ship1");

        tom.drivingMethod(tomairship);
        tom.drivingMethod(tomautomobile);
        tom.drivingMethod(ship);
    }
}
