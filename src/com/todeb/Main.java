package com.todeb;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Lütfen ilk sayıyı giriniz:");
		int num1 = kb.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz:");
		int num2 = kb.nextInt();
		System.out.println("Lütfen yapmak istediğiniz işlemi giriniz: 1- toplam, 2-cıkarma, 3-çarpma, 4-bölme");
		int select = kb.nextInt();

		switch (select){
			case 1: System.out.println("İşlemin sonucu " + (num1 + num2));
					break;
			case 2:System.out.println("İşlemin sonucu " + (num1 - num2));
					break;
			case 3:System.out.println("İşlemin sonucu " + (num1 * num2));
					break;
			case 4:System.out.println("İşlemin sonucu " + (num1 / num2));
					break;
		}
	}

}
