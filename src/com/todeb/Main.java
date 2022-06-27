package com.todeb;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Lütfen kaç kg armut aldığınızı giriniz:");
		double kgArm = kb.nextDouble();
		System.out.println("Lütfen kaç kg elma aldığınızı giriniz:");
		double kgElm = kb.nextDouble();
		System.out.println("Lütfen kaç kg domates aldığınızı giriniz:");
		double kgDom = kb.nextDouble();
		System.out.println("Lütfen kaç kg muz aldığınızı giriniz:");
		double kgMuz = kb.nextDouble();
		System.out.println("Lütfen kaç kg patlıcan aldığınızı giriniz:");
		double kgPat = kb.nextDouble();

		double priceArm = 2.14;
		double priceElm = 3.67;
		double priceDom = 1.11;
		double priceMuz = 0.95;
		double pricePat = 5.00;
		double totalPrice;
		totalPrice = (kgArm * priceArm) + (kgElm * priceElm) + (kgDom * priceDom) + (kgMuz * priceMuz) + (kgPat * pricePat);
		System.out.println("Toplam tutar:" + totalPrice + "TL");

    }

}
