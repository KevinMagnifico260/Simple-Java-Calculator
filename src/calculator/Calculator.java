
/*
 * 
 * 		Author : Kevin C. Magnifico
 * 		Programming language type : Java
 * 
 */

package calculator;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

class CalcOperation {
	
	private double result;
	
	public void Operation(String op, double fnum, double snum) {
		switch (op) {
			case "+":
				this.result = (fnum + snum);
				break;
			case "-":
				this.result = (fnum - snum);
				break;
			case "*":
				this.result = (fnum * snum);
				break;
			case "/":
				this.result = (fnum / snum);
				break;
			default:
				System.out.println("Error to Operate because wrong value....");
				break;
		}
	}
	
	public double getResult() {
		return this.result;
	}
}

public class Calculator extends JFrame {
	
	private double fnum = 0, snum = 0;
	private String op = "";
	private JTextField lblNumber;
	private JPanel calcFrame;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btndec;
	private JButton btnmod;
	private JButton btnadd;
	private JButton btnsub;
	private JButton btnmul;
	private JButton btndiv;
	private JButton btnclear;
	private JButton btndelete;
	private JButton btnequal;
	
	public Calculator() {
		super("KevinJavaCalculator");
		this.setSize(new Dimension(335, 370));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calcFrame = new JPanel();
		calcFrame.setLayout(null);
		calcFrame.setBackground(new Color(255, 102, 102));
		this.add(calcFrame);
		initComponent();
		calculatorEvent();
	}
	
	private void initComponent() {
		lblNumber = new JTextField("0");
		lblNumber.setFocusable(true);
		lblNumber.setSize(new Dimension(300, 40));
		lblNumber.setLocation(new Point(15, 25));
		lblNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumber.setBorder(LineBorder.createBlackLineBorder());
		lblNumber.setEditable(false);
		lblNumber.setOpaque(true);
		lblNumber.setBackground(new Color(255, 204, 204));
		lblNumber.setFont(new Font(lblNumber.getName(), Font.PLAIN, 26));
		
		btn1 = new JButton("1");
		btn1.setCursor(new Cursor(HAND_CURSOR));
		btn1.setSize(new Dimension(60, 60));
		btn1.setLocation(new Point(15, 70));
		btn1.setFont(new Font(btn1.getName(), Font.BOLD, 20));
		
		btn2 = new JButton("2");
		btn2.setCursor(new Cursor(HAND_CURSOR));
		btn2.setSize(new Dimension(60, 60));
		btn2.setLocation(new Point(75, 70));
		btn2.setFont(new Font(btn2.getName(), Font.BOLD, 20));
		
		btn3 = new JButton("3");
		btn3.setCursor(new Cursor(HAND_CURSOR));
		btn3.setSize(new Dimension(60, 60));
		btn3.setLocation(new Point(135, 70));
		btn3.setFont(new Font(btn3.getName(), Font.BOLD, 20));
		
		btn4 = new JButton("4");
		btn4.setCursor(new Cursor(HAND_CURSOR));
		btn4.setSize(new Dimension(60, 60));
		btn4.setLocation(new Point(15, 135));
		btn4.setFont(new Font(btn4.getName(), Font.BOLD, 20));
		
		btn5 = new JButton("5");
		btn5.setCursor(new Cursor(HAND_CURSOR));
		btn5.setSize(new Dimension(60, 60));
		btn5.setLocation(new Point(75, 135));
		btn5.setFont(new Font(btn5.getName(), Font.BOLD, 20));
		
		btn6 = new JButton("6");
		btn6.setCursor(new Cursor(HAND_CURSOR));
		btn6.setSize(new Dimension(60, 60));
		btn6.setLocation(new Point(135, 135));
		btn6.setFont(new Font(btn6.getName(), Font.BOLD, 20));
		
		btn7 = new JButton("7");
		btn7.setCursor(new Cursor(HAND_CURSOR));
		btn7.setSize(new Dimension(60, 60));
		btn7.setLocation(new Point(15, 200));
		btn7.setFont(new Font(btn7.getName(), Font.BOLD, 20));
		
		btn8 = new JButton("8");
		btn8.setCursor(new Cursor(HAND_CURSOR));
		btn8.setSize(new Dimension(60, 60));
		btn8.setLocation(new Point(75, 200));
		btn8.setFont(new Font(btn8.getName(), Font.BOLD, 20));
		
		btn9 = new JButton("9");
		btn9.setCursor(new Cursor(HAND_CURSOR));
		btn9.setSize(new Dimension(60, 60));
		btn9.setLocation(new Point(135, 200));
		btn9.setFont(new Font(btn9.getName(), Font.BOLD, 20));
		
		btn0 = new JButton("0");
		btn0.setCursor(new Cursor(HAND_CURSOR));
		btn0.setSize(new Dimension(60, 60));
		btn0.setLocation(new Point(15, 265));
		btn0.setFont(new Font(btn0.getName(), Font.BOLD, 20));
		
		btndec = new JButton(".");
		btndec.setCursor(new Cursor(HAND_CURSOR));
		btndec.setSize(new Dimension(60, 60));
		btndec.setLocation(new Point(75, 265));
		btndec.setFont(new Font(btndec.getName(), Font.BOLD, 25));
		
		btnmod = new JButton("%");
		btnmod.setCursor(new Cursor(HAND_CURSOR));
		btnmod.setSize(new Dimension(60, 60));
		btnmod.setLocation(new Point(135, 265));
		btnmod.setFont(new Font(btnmod.getName(), Font.BOLD, 20));
		
		btnadd = new JButton("+");
		btnadd.setCursor(new Cursor(HAND_CURSOR));
		btnadd.setSize(new Dimension(60, 60));
		btnadd.setLocation(new Point(195, 70));
		btnadd.setFont(new Font(btnadd.getName(), Font.BOLD, 20));
		
		btnsub = new JButton("-");
		btnsub.setCursor(new Cursor(HAND_CURSOR));
		btnsub.setSize(new Dimension(60, 60));
		btnsub.setLocation(new Point(195, 135));
		btnsub.setFont(new Font(btnsub.getName(), Font.BOLD, 20));
		
		btnmul = new JButton("*");
		btnmul.setCursor(new Cursor(HAND_CURSOR));
		btnmul.setSize(new Dimension(60, 60));
		btnmul.setLocation(new Point(195, 200));
		btnmul.setFont(new Font(btnmul.getName(), Font.BOLD, 20));
		
		btndiv = new JButton("/");
		btndiv.setCursor(new Cursor(HAND_CURSOR));
		btndiv.setSize(new Dimension(60, 60));
		btndiv.setLocation(new Point(195, 265));
		btndiv.setFont(new Font(btndiv.getName(), Font.BOLD, 20));
		
		btnclear = new JButton("C");
		btnclear.setCursor(new Cursor(HAND_CURSOR));
		btnclear.setSize(new Dimension(60, 60));
		btnclear.setLocation(new Point(255, 70));
		btnclear.setFont(new Font(btnclear.getName(), Font.BOLD, 20));
		
		btndelete = new JButton("Del");
		btndelete.setCursor(new Cursor(HAND_CURSOR));
		btndelete.setSize(new Dimension(60, 60));
		btndelete.setLocation(new Point(255, 135));
		btndelete.setFont(new Font(btndelete.getName(), Font.BOLD, 20));
		
		btnequal = new JButton("=");
		btnequal.setCursor(new Cursor(HAND_CURSOR));
		btnequal.setSize(new Dimension(60, 125));
		btnequal.setLocation(new Point(255, 200));
		btnequal.setFont(new Font(btnequal.getName(), Font.BOLD, 30));
		
		calcFrame.add(btn1);
		calcFrame.add(btn2);
		calcFrame.add(btn3);
		calcFrame.add(btn4);
		calcFrame.add(btn5);
		calcFrame.add(btn6);
		calcFrame.add(btn7);
		calcFrame.add(btn8);
		calcFrame.add(btn9);
		calcFrame.add(btn0);
		calcFrame.add(btndec);
		calcFrame.add(btnmod);
		calcFrame.add(btnadd);
		calcFrame.add(btnsub);
		calcFrame.add(btnmul);
		calcFrame.add(btndiv);
		calcFrame.add(btnclear);
		calcFrame.add(btndelete);
		calcFrame.add(btnequal);
		calcFrame.add(lblNumber);
	}

	private void displayNum(String num) {
		if (lblNumber.getText().equals("0")) {
			lblNumber.setText(num);
		}
		else {
			lblNumber.setText(lblNumber.getText() + num);
		}
	}
	
	private void clearText() {
		lblNumber.setText("0");
		this.fnum = 0;
		this.snum = 0;
		this.op = "";
	}
	
	private void deleteText() {
		String Temp = lblNumber.getText();
		Temp = Temp.substring(0, lblNumber.getText().length() - 1);
		lblNumber.setText(Temp);
		if (lblNumber.getText().equals("")) {
			lblNumber.setText("0");
		}
	}
	
	private void addDecimal() {
		if (!lblNumber.getText().contains(".")) {
			lblNumber.setText(lblNumber.getText() + ".");
		}
	}
	
	private void calculatorEvent() {
		
		CalcOperation co = new CalcOperation();
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				displayNum("1");
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("2");
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("3");
			}
		});
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("4");
			}
		});
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("5");
			}
		});
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("6");
			}
		});
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("7");
			}
		});
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("8");
			}
		});
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("9");
			}
		});
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayNum("0");
			}
		});
		btnclear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearText();
			}
		});
		btndelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteText();
			}
		});
		btndec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addDecimal();
			}
		});
		btnadd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(lblNumber.getText());
				lblNumber.setText("0");
				op = "+";
			}
		});
		btnsub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(lblNumber.getText());
				lblNumber.setText("0");
				op = "-";
			}
		});
		btnmul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(lblNumber.getText());
				lblNumber.setText("0");
				op = "*";
			}
		});
		btndiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fnum = Double.parseDouble(lblNumber.getText());
				lblNumber.setText("0");
				op = "/";
			}
		});
		btnequal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				snum = Double.parseDouble(lblNumber.getText());
				switch (op) {
					case "+":
						co.Operation(op, fnum, snum);
						lblNumber.setText(toString().valueOf(co.getResult()));
						break;
					case "-":
						co.Operation(op, fnum, snum);
						lblNumber.setText(toString().valueOf(co.getResult()));
						break;
					case "*":
						co.Operation(op, fnum, snum);
						lblNumber.setText(toString().valueOf(co.getResult()));
						break;
					case "/":
						co.Operation(op, fnum, snum);
						lblNumber.setText(toString().valueOf(co.getResult()));
						break;
					default:
						System.out.println("Error to Operate because no Operator selected....");
						break;
				}
			}
		});
	}
	
	private static void platformStyle() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Error to load Platform Nimbus...", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private static void Aboutme() {
		JOptionPane.showMessageDialog(null, "Title : KevinJavaCalculator\nCreated by : Kevin C. Magnifico\nWritten in : Java", "About", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		try {
			platformStyle();
			Aboutme();
			new Calculator().setVisible(true);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error to load Calculator...", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
	}
}




















