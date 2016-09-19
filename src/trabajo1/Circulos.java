package trabajo1;

public class Circulos {
	double radio;
	private double perimetro;
	private double PI = (double) 3.1416;
	
	public Circulos(double Radio){
		this.radio=Radio;
	}

	public void ingresoDeRadio(double Radio){
		if(Radio>0){
			this.radio=Radio;
		}
		else{
		this.radio=0;
		}
	}
	
	public void calculoDePerimetro(double Radio){
		if(Radio>0){
			this.perimetro=2*PI*Radio;
		 	}
			else{
		 		this.perimetro=0;
		 	}
	}
	public double mostrarPerimetro(){
		return this.perimetro;
	}
	public void resetearRadio(){
		this.radio=0;
	}
	public double chequearRadio() {
		return this.radio;
		
	}

}
