package com.ders6;

import java.util.Scanner;

public class MatematikIslemler {

	int sayac = 0;

	float topla(float sayi1, float sayi2) {
		sayac++;
		return sayi1 + sayi2;
	}

	float cikar(float sayi1, float sayi2) {
		sayac++;
		return sayi1 - sayi2;
	}

	float bol(float sayi1, float sayi2) {
		sayac++;
		return sayi1 / sayi2;
	}

	float carp(float sayi1, float sayi2) {
		sayac++;
		return sayi1 * sayi2;
	}

}
