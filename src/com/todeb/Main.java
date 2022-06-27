package com.todeb;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Lütfen ilk kenar uzunluğunu giriniz:");
		double len1 = kb.nextDouble();
		System.out.println("Lütfen ikinci kenar uzunluğunu giriniz:");
		double len2 = kb.nextDouble();
		double hippow2;
		hippow2 = pow(len1, 2) + pow(len2, 2);
		double hip = sqrt(hippow2);
		System.out.println(hip + " Üçgenin hipotenus uzunluğudur.");



/*	Scanner kb = new Scanner(System.in);
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

 	int ortalama = (mat + fizik + kimya + tarih + muzik + turkce) / 6;

    System.out.println(ortalama > 60 ? "Sınıfı geçti": "Sınıfta kaldı");*/
    }

}
