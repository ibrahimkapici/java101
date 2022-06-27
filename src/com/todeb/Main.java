package com.todeb;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı adınızı giriniz:");
		String id = kb.nextLine();
		System.out.println("Lütfen kullanıcı şifrenizi giriniz:");
		String pass = kb.nextLine();

		if (id.equals("patika") && pass.equals("java123")) {
			System.out.print("Giriş başarılı");
		} else {
			System.out.print("Kullancı adı ya da şifre hatalı. Şifre sıfırlamak ister misiniz? Select 1-Evet 2-Hayır");
			int select = kb.nextInt();
			switch (select) {
				case 1:
					Scanner kbd = new Scanner(System.in);
					System.out.println("Lütfen yeni bir şifre giriniz:");
					String newPass = kbd.nextLine();
					if (newPass.equals(pass)) {
						System.out.println("Yeni şifre ile eski şifre aynı olamaz. Lütfen başka bir şifre giriniz.");
					} else
						System.out.println("Şifre başarılı bir şekilde değiştirildi.");

					break;

				case 2:
					System.out.println("Lütfen şifrenizi kontrol edip tekrar login olunuz.");
			}
		}
	}
}