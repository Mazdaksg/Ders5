package com.ders6;

import java.util.Scanner;

public class Otomobil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("dogum yýlý giriniz");
		int dogumYili = input.nextInt();
		int yas = yasHesapla(dogumYili);
		System.out.println(yas);

	}

	static int yasHesapla(int dogumYili) {
		return 2019 - dogumYili;
	}

}
