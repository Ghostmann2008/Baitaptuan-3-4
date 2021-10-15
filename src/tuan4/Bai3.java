package tuan4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Bai3 extends JFrame {

	private JPanel contentPane;
	private JTextField textMSSV;
	private JTextField textMyName;
	private JTextField textMyClass;
	private JLabel teacherName;
	private JTextField textTeacherName;
	private JLabel output;
	private JButton answer;
	private JTextField textOutput;
	private JTextField txtBi;
	private JLabel input;
	private JTextField textInput;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai3 frame = new Bai3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bai3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("B\u00E0i t\u1EADp c\u00E1 nh\u00E2n");
		title.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		title.setForeground(Color.RED);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(131, 11, 290, 31);
		contentPane.add(title);
		
		JLabel MSSV = new JLabel("MSSV");
		MSSV.setHorizontalAlignment(SwingConstants.CENTER);
		MSSV.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		MSSV.setBounds(32, 53, 62, 21);
		contentPane.add(MSSV);
		
		JLabel myName = new JLabel("H\u1ECD v\u00E0 t\u00EAn");
		myName.setHorizontalAlignment(SwingConstants.CENTER);
		myName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		myName.setBounds(312, 53, 62, 21);
		contentPane.add(myName);
		
		JLabel myClass = new JLabel("L\u1EDBp");
		myClass.setHorizontalAlignment(SwingConstants.CENTER);
		myClass.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		myClass.setBounds(32, 85, 62, 21);
		contentPane.add(myClass);
		
		
		textMSSV = new JTextField();
		textMSSV.setEditable(false);
		textMSSV.setText("20190070");
		textMSSV.setHorizontalAlignment(SwingConstants.CENTER);
		textMSSV.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textMSSV.setBounds(125, 53, 112, 20);
		contentPane.add(textMSSV);
		textMSSV.setColumns(10);
		
		textMyName = new JTextField();
		textMyName.setEditable(false);
		textMyName.setText("\u0110\u00E0o Minh Ti\u1EBFn");
		textMyName.setHorizontalAlignment(SwingConstants.CENTER);
		textMyName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textMyName.setColumns(10);
		textMyName.setBounds(410, 53, 112, 20);
		contentPane.add(textMyName);
		
		textMyClass = new JTextField();
		textMyClass.setEditable(false);
		textMyClass.setText("Project I-709155");
		textMyClass.setHorizontalAlignment(SwingConstants.CENTER);
		textMyClass.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textMyClass.setColumns(10);
		textMyClass.setBounds(125, 85, 112, 20);
		contentPane.add(textMyClass);
		
		teacherName = new JLabel("GVHD");
		teacherName.setHorizontalAlignment(SwingConstants.CENTER);
		teacherName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		teacherName.setBounds(312, 85, 62, 21);
		contentPane.add(teacherName);
		
		textTeacherName = new JTextField();
		textTeacherName.setEditable(false);
		textTeacherName.setText("L\u00EA Th\u1ECB Hoa");
		textTeacherName.setHorizontalAlignment(SwingConstants.CENTER);
		textTeacherName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textTeacherName.setColumns(10);
		textTeacherName.setBounds(410, 85, 112, 20);
		contentPane.add(textTeacherName);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(65, 117, 435, 2);
		contentPane.add(separator);
		
		JLabel problem = new JLabel("\u0110\u1EC1 b\u00E0i");
		problem.setHorizontalAlignment(SwingConstants.CENTER);
		problem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		problem.setBounds(32, 168, 62, 21);
		contentPane.add(problem);
		
		output = new JLabel("Output");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		output.setBounds(32, 271, 62, 21);
		contentPane.add(output);
		
		answer = new JButton("Answer");
		answer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> arr=new ArrayList<String>();
				StringBuilder sb=new StringBuilder();
				StringTokenizer stringTokenizer = new StringTokenizer(textInput.getText());
				 while (stringTokenizer.hasMoreTokens()) {
					arr.add(stringTokenizer.nextToken()+" ");
				 }
				
				 textOutput.setText(arr.get(arr.size()-1));
				
			}
		});
		answer.setBounds(219, 313, 89, 23);
		contentPane.add(answer);
		
		JTextArea textProblem = new JTextArea();
		textProblem.setEditable(false);
		textProblem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textProblem.setText("Cho tr\u01B0\u1EDBc 1 x\u00E2u k\u00FD t\u1EF1 l\u00E0 h\u1ECD t\u00EAn ng\u01B0\u1EDDi \u0111\u1EA7y \u0111\u1EE7, h\u00E3y t\u00E1ch ra ph\u1EA7n t\u00EAn \n c\u1EE7a ng\u01B0\u1EDDi n\u00E0y");
		textProblem.setBounds(131, 168, 397, 45);
		contentPane.add(textProblem);
		
		textOutput = new JTextField();
		textOutput.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textOutput.setHorizontalAlignment(SwingConstants.CENTER);
		textOutput.setColumns(10);
		textOutput.setBounds(131, 271, 397, 31);
		contentPane.add(textOutput);
		
		txtBi = new JTextField();
		txtBi.setEditable(false);
		txtBi.setForeground(Color.MAGENTA);
		txtBi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtBi.setText("B\u00E0i 3");
		txtBi.setBounds(271, 126, 37, 31);
		contentPane.add(txtBi);
		txtBi.setColumns(10);
		
		input = new JLabel("Input");
		input.setHorizontalAlignment(SwingConstants.CENTER);
		input.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		input.setBounds(32, 230, 62, 21);
		contentPane.add(input);
		
		textInput = new JTextField();
		textInput.setHorizontalAlignment(SwingConstants.CENTER);
		textInput.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textInput.setColumns(10);
		textInput.setBounds(131, 229, 397, 31);
		contentPane.add(textInput);
	}
	
	

}
