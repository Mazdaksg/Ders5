package com.ders6;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("brinci say�y� giriniz");
		float sayi1 = input.nextFloat();

		System.out.println("ikinci say�y� giriniz");
		float sayi2 = input.nextFloat();

		MatematikIslemler islem = new MatematikIslemler();
		System.out.println("Toplam = " + (int) (islem.topla(sayi1, sayi2)));
		System.out.println("��kar = " + (int) (islem.cikar(sayi1, sayi2)));
		System.out.println("B�lme = " + islem.bol(sayi1, sayi2));
		System.out.println("�arpma = " + islem.carp(sayi1, sayi2));
		System.out.println(islem.sayac);
	}

}
