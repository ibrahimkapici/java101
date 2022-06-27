package com.todeb;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Lütfen dairenin yarıçapını giriniz:");
		double r = kb.nextDouble();
		System.out.println("Lütfen dairenin açışını giriniz");
		double deg = kb.nextDouble();
		double area = 3.14 * pow(r, 2);
		double cevre = 2 * 3.14 * r;
		deg *= area/360;
		System.out.println(deg);
    }

}
