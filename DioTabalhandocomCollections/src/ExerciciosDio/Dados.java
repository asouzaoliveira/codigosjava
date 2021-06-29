package ExerciciosDio;

public class Dados {

	public String meses;
	public double temperatura;
	
	
	public Dados() {
		
	}
	
	public Dados(String meses, double temperatura) {
		
		this.meses = meses;
		this.temperatura = temperatura;
	}
	@Override
	public String toString() {
		return meses + " : " +  temperatura;
	}
	public String getMeses() {
		return meses;
	}
	public void setMeses(String meses) {
		this.meses = meses;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
