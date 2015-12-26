package br.com.Mateus.Brpp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class BrppCompilerFrame extends JFrame {
	private JButton COMP;
	private JButton CANCEL;
	public JFileChooser FC;
	private GridBagLayout layout;
	private GridBagConstraints constraints;

	public BrppCompilerFrame(String title) {
		super(title);
		layout = new GridBagLayout();
		setLayout(layout);
		constraints = new GridBagConstraints();
		COMP = new JButton("Compilar");
		addComponent(COMP, 3, 0, 1, 1);
		ButtonHandler handler = new ButtonHandler();
		COMP.addActionListener(handler);
		CANCEL = new JButton("Abort");
		addComponent(CANCEL, 3, 1, 1, 1);
		CanButtonHandler CanHandler = new CanButtonHandler();
		CANCEL.addActionListener(CanHandler);

		// addComponent(FC,0,0,1,2);

	}

	private void addComponent(Component component, int row, int column,
			int width, int height) {
		constraints.gridx = column;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;
		layout.setConstraints(component, constraints);
		add(component);
	}

	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JFileChooser FC = new JFileChooser();
			int res = FC.showOpenDialog(null);
			File diretorio = null;
			if (res == JFileChooser.APPROVE_OPTION) {
				diretorio = FC.getSelectedFile();
				if (BrppCompiler.compile(diretorio.getAbsolutePath()))
					JOptionPane.showMessageDialog(null, diretorio.getName()
							+ " compilado");
			} else
				JOptionPane.showMessageDialog(null,
						"Voce nao selecionou nenhum diretorio.");

		}

	}

	private class CanButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.exit(0);

		}

	}
}
