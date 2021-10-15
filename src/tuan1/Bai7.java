package tuan1;

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
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class Bai7 extends JFrame {

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
	private JRadioButton button1,button2,button3,button4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai7 frame = new Bai7();
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
	public Bai7() {
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
		output.setBounds(32, 227, 62, 21);
		contentPane.add(output);
		
		answer = new JButton("Answer");
		answer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sb=Dem(100);
				textOutput.setText(sb);
			}
		});
		answer.setBounds(219, 266, 89, 23);
		contentPane.add(answer);
		
		JTextArea textProblem = new JTextArea();
		textProblem.setEditable(false);
		textProblem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textProblem.setText("Trong c\u00E1c s\u1ED1 t\u1EF1 nhi\u00EAn <=100 h\u00E3y \u0111\u1EBFm xem c\u00F3 bao nhi\u00EAu s\u1ED1");
		textProblem.setBounds(131, 168, 397, 21);
		contentPane.add(textProblem);
		
		textOutput = new JTextField();
		textOutput.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textOutput.setHorizontalAlignment(SwingConstants.CENTER);
		textOutput.setColumns(10);
		textOutput.setBounds(131, 223, 397, 31);
		contentPane.add(textOutput);
		
		txtBi = new JTextField();
		txtBi.setEditable(false);
		txtBi.setForeground(Color.MAGENTA);
		txtBi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtBi.setText("B\u00E0i 7");
		txtBi.setBounds(271, 126, 37, 31);
		contentPane.add(txtBi);
		txtBi.setColumns(10);
		
		button1 = new JRadioButton("Chia h\u1EBFt 5");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		button1.setBounds(125, 196, 93, 23);
		contentPane.add(button1);
		
		button2 = new JRadioButton("Chia 5 d\u01B0 1");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button2.setBounds(222, 196, 93, 23);
		contentPane.add(button2);
		
		button3 = new JRadioButton("Chia 5 d\u01B0 2");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button3.setBounds(312, 196, 96, 23);
		contentPane.add(button3);
		
		button4 = new JRadioButton("Chia 5 d\u01B0 3");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button4.setBounds(415, 196, 107, 23);
		contentPane.add(button4);
		
		JButton button = new JButton("New button");
		button.setBounds(65, 141, 89, 23);
		contentPane.add(button);
	}
	
	private String Dem(int n){
		int dem=0;
		StringBuilder stringOutput=new StringBuilder();
		if(button1.isSelected()==true) {
			for(int i=0;i<=n;i++) {
				if(i%5==0) dem++;
			}
		}
		if(button2.isSelected()==true) {
			for(int i=0;i<=n;i++) {
				if(i%5==1) dem++;
			}
		}
		if(button3.isSelected()==true) {
			for(int i=0;i<=n;i++) {
				if(i%5==2) dem++;
			}
		}
		if(button4.isSelected()==true) {
			for(int i=0;i<=n;i++) {
				if(i%5==3) dem++;
			}
		}
		return String.valueOf(dem);
	}
}
