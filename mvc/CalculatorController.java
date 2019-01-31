package mvc;

public class CalculatorController {
	private CalculatorView view;
	private CalculatorModel model;
	
	public CalculatorController(CalculatorView view, CalculatorModel model) {
		this.view = view;
		this.model = model;
	}
	
	public void setNumber1(int num1) {
		model.setNum1(num1);
	}
	public void setNumber2(int num2) {
		model.setNum2(num2);
	}
	public void setSummation(int sum) {
		model.setSum(sum);
	}
	
	public int getNumber1() {
	  return model.getNum1();
	}
	
	public int getNumber2() {
		  return model.getNum2();
		}
	
	public int getSummation() {
		  return model.getSum();
		}
	
	
	public void displayinview() {
		
		view.viewResults(model.getNum1(), model.getNum2(), model.getSum());
	}
	
}
