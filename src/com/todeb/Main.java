package com.todeb;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz:");
		double length = kb.nextDouble();
		System.out.println("Lütfen kilonuzu (kg) giriniz");
		double kg = kb.nextDouble();
		double endex = kg / pow(length, 2);
		System.out.println("Vücüt kitle endexiniz: " + endex + "'tir.");
    }

}
