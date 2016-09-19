package trabajo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class circuloTest {

	@Test
	public void radioCorrecto1() {
		Circulos radio = new Circulos(2);
		radio.ingresoDeRadio(2);//creamos el primer radio
		assertEquals(2,radio.chequearRadio(),0.01);//verifico que este correcto el radio
	}
	public void radioCorrecto2() {
		Circulos radio = new Circulos(3.7);
		radio.ingresoDeRadio(3.7);//creamos el segundo radio
		assertEquals(3.7,radio.chequearRadio(),0.01);//verifico que este correcto el radio
	}
	public void radioCorrecto3() {
		Circulos radio = new Circulos(5);
		radio.ingresoDeRadio(5);//creamos el tercero radio
		assertEquals(5,radio.chequearRadio(),0.01);//verifico que este correcto el radio
	}
	public void radioCorrecto4() {
		Circulos radio = new Circulos(10.9);
		radio.ingresoDeRadio(10.9);//creamos el cuarto radio
		assertEquals(10.9,radio.chequearRadio(),0.01);//verifico que este correcto el radio
	}
	public void comprobarPerimetro1(){
		Circulos radio = new Circulos(9.8);
		radio.ingresoDeRadio(9.8);//creamos el radio para el primer calculo de perimetro
		assertEquals(9.8,radio.chequearRadio(),0.01);//verifico el radio
		radio.calculoDePerimetro(9.8);//calculo el perimetro
		assertEquals(61.58,radio.mostrarPerimetro(),0.01);//verifico el resultado
	}
	public void comprobarPerimetro2(){
		Circulos radio = new Circulos(16.6);
		radio.ingresoDeRadio(16.6);//creamos el radio para el segundo perimetro
		assertEquals(16.6,radio.chequearRadio(),0.01);//verifico el radio
		radio.calculoDePerimetro(16.6);//alculo el segundo perimetro
		assertEquals(104.30,radio.mostrarPerimetro(),0.01);//verifico el resultado
	}

}
