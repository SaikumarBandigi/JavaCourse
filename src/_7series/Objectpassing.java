package _7series;

class Printer {
	public void print(Paper p) {
		p.setText("Get Lost");
	}

}

class Paper {
	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}

public class Objectpassing {
	public static void main(String[] args) {

		Paper p = new Paper();
		p.setText("Hello World");

		System.out.println(p.getText());

		Printer hp = new Printer();
		hp.print(p);

		System.out.println(p.getText());

	}
}
