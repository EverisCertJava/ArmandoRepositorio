package com.mx.everis.tallerjava.testing;

import com.mx.everis.tallerjava.clasepadre.*;
import com.mx.everis.tallerjava.claseshijas.*;
import com.mx.everis.tallerjava.general.*;

public class TestPolimorfismo {
	public static void main(String args[]){
		
		Liquido liquidoGeneral = new Liquido();
		Liquido liquidoCafe=new Cafe();//Cafe
		Liquido liquidoLeche = new Leche();//Leche
		
		Taza miTaza = new Taza();
		miTaza.agregarLiquido(liquidoGeneral);
		miTaza.agregarLiquido(liquidoCafe);
		miTaza.agregarLiquido(liquidoLeche);
	}
}
