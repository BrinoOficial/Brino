package br.com.Mateus.Brpp;

import javax.swing.JFrame;

public class BrppCompilerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrppCompilerFrame frame = new BrppCompilerFrame("Compilador Brino"+BrppCompiler.version);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
//		if (!(BrppCompiler
//				.compile("C:/Users/Mateus Terra/OneDrive/Lua/Blink/Blink.Brpp")))
//			System.out.println("Seu c�digo cont�m erros");
	}

}
