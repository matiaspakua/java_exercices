package hHeadFirstJava3rd;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

class Party {

	public static void main(String[] args) {
		buildInvite();
	}

	public static void buildInvite() {
		Frame f = new Frame();
		Label l = new Label("Party at tims");
		Button b = new Button("You bet!");
		Button c = new Button("Shoot me");
		Panel p = new Panel();
		p.add(l);
	}
}