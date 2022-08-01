package com.prowings;

public class Address {
int pin;
String city;
public Address() {
	super();
}
public Address(int pin, String city) {
	super();
	this.pin = pin;
	this.city = city;
}
@Override
public String toString() {
	return "Address [pin=" + pin + ", city=" + city + "]";
}

}
