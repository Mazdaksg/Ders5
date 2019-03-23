package com.ders6;

import java.util.Scanner;

import jdk.internal.dynalink.beans.StaticClass;

public class Kutle›ndeksi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("kilo giriniz");
		double kilo = input.nextDouble();
		System.out.print("boy giriniz");
		double boy = input.nextDouble();

		double kutle = kutleIndeksiHesapla(boy, kilo);

		System.out.println(kutle);

	}
	static double kutleIndeksiHesapla (double boy, double kilo) {
			
			return kilo/(boy*boy);
	}

}
