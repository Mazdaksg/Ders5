package com.ders6;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("brinci sayýyý giriniz");
		float sayi1 = input.nextFloat();

		System.out.println("ikinci sayýyý giriniz");
		float sayi2 = input.nextFloat();

		MatematikIslemler islem = new MatematikIslemler();
		System.out.println("Toplam = " + (int) (islem.topla(sayi1, sayi2)));
		System.out.println("Çýkar = " + (int) (islem.cikar(sayi1, sayi2)));
		System.out.println("Bölme = " + islem.bol(sayi1, sayi2));
		System.out.println("Çarpma = " + islem.carp(sayi1, sayi2));
		System.out.println(islem.sayac);
	}

}
