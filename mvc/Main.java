package mvc;

public class Main {

	public static void main(String args[]) {
		
		CalculatorView view = new CalculatorView();
		CalculatorModel model =new CalculatorModel();
		CalculatorController controller = new CalculatorController(view, model);
		
		controller.setNumber1(5012);
		controller.setNumber2(1000);
		model.AddNumbers(controller.getNumber1(), controller.getNumber2());
		
		controller.displayinview();
	}
}
