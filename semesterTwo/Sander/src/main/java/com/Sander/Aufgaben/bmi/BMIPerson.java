package bmi;

public class BMIPerson {
	private String vName, nName;
	private double weight, height, result, erg1;

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getnName() {
		return nName;
	}

	public void setnName(String nName) {
		this.nName = nName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public int berechnen(int i) {
		result = (Math.round(weight / (height * height)));
		if (result < 19) {
			erg1 = 0;
		} else if ((result >= 19) && (result <= 25)) {
			erg1 = 1;
		} else if ((result > 25) && (result <= 29)) {
			erg1 = 2;
		} else if ((result > 29) && (result < 40)) {
			erg1 = 3;
		} else if (result > 40) {
			erg1 = 4;
		}
		if (i == 0) {
			return (int) result;
		} else if (i == 1) {
			return (int) erg1;
		} else {
			return 5;
		}
	}
}
