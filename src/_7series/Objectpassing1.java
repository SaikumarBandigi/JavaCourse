package _7series;

class Printerr {
	public void print(Paperr p) {
		p.setText("Get Lost");
	}

}

class Paperr {
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private String text;
}

public class Objectpassing1 {
	public static void main(String[] args) {

		Paperr p = new Paperr();
		p.setText("Helo Komal");
		System.out.println(p.getText());

		Printerr intel = new Printerr();
		intel.print(p);

		System.out.println(p.getText());

	}
}
