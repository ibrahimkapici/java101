package com.todeb;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Lütfen kaç km yol gittiğinizi giriniz:");
		double km = kb.nextDouble();
		double price = 20.0;
		double openPrice = 10.0;
		double pricePerKm = 2.20;
		double totalPrice;
		totalPrice = openPrice + (km * pricePerKm);
		if(totalPrice <= 20) {
			System.out.println("Toplam fiyat" + 20 + "TL.");
		}
		else {
			System.out.println("Toplam fiyat" + totalPrice + "TL.");
		}
    }

}
