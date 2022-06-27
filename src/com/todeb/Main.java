package com.todeb;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int count = 6;
		System.out.println("Not ortalaması almak için lütfen derslerin gerekli not puanlarını giriniz:");

		System.out.println("Matematik dersinin notunu giriniz:");
		int mat = kb.nextInt();
		System.out.println("Fizik dersinin notunu giriniz:");
		int fizik = kb.nextInt();
		System.out.println("Kimya dersinin notunu giriniz:");
		int kimya = kb.nextInt();
		System.out.println("Tarih dersinin notunu giriniz:");
		int tarih = kb.nextInt();
		System.out.println("Müzik dersinin notunu giriniz:");
		int muzik = kb.nextInt();
		System.out.println("Türkçe dersinin notunu giriniz:");
		int turkce = kb.nextInt();

		if (mat <0 || mat > 100){
			mat = 0;
			count--;
		}
		if (fizik <0 || fizik > 100){
			fizik = 0;
			count--;
		}
		if (kimya <0 || kimya > 100){
			kimya = 0;
			count--;
		}
		if (muzik <0 || muzik > 100){
			muzik = 0;
			count--;
		}
		if (turkce <0 || turkce > 100){
			turkce = 0;
			count--;
		}
		int ortalama = (mat + fizik + kimya + tarih + muzik + turkce) / count;
		System.out.println("Ortalama = " + ortalama);
		System.out.println(ortalama > 55 ? "Sınıfı geçti": "Sınıfta kaldı");
	}
}