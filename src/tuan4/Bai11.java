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

public class Bai11 extends JFrame {

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
	private ArrayList<String> arr=new ArrayList<String>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai11 frame = new Bai11();
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
	public Bai11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 428);
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
		output.setBounds(42, 318, 62, 21);
		contentPane.add(output);
		
		answer = new JButton("Answer");
		answer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int count=Count();
				textOutput.setText(String.valueOf(count));
				
			}
		});
		answer.setBounds(217, 357, 89, 23);
		contentPane.add(answer);
		
		JTextArea textProblem = new JTextArea();
		textProblem.setEditable(false);
		textProblem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textProblem.setText("Cho danh s\u00E1ch h\u1ECD t\u00EAn \u0111\u1EA7y \u0111\u1EE7 h\u1ECDc sinh. H\u00E3y \u0111\u1EBFm xem c\u00F3 bao nhi\u00EAu \n b\u1EA1n t\u00EAn \u201CAn\u201D.");
		textProblem.setBounds(131, 168, 397, 45);
		contentPane.add(textProblem);
		
		textOutput = new JTextField();
		textOutput.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textOutput.setHorizontalAlignment(SwingConstants.CENTER);
		textOutput.setColumns(10);
		textOutput.setBounds(131, 318, 397, 31);
		contentPane.add(textOutput);
		
		txtBi = new JTextField();
		txtBi.setEditable(false);
		txtBi.setForeground(Color.MAGENTA);
		txtBi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtBi.setText("B\u00E0i 11");
		txtBi.setBounds(271, 126, 46, 31);
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
		
		JButton addStudent = new JButton("Add Student");
		addStudent.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		addStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arr.add(textInput.getText());
				textInput.setText("");
			}
		});
		addStudent.setBounds(155, 273, 112, 23);
		contentPane.add(addStudent);
		
		JButton resetStudents = new JButton("Reset Students");
		resetStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInput.setText("");
				textOutput.setText("");
				arr.clear();
				
			}
		});
		resetStudents.setBounds(285, 273, 136, 23);
		contentPane.add(resetStudents);
	}
	private int Count() {
		int count=0;
		for(int i=0;i<arr.size();i++) {
			String[] s=arr.get(i).split(" ");
			if(s[s.length-1].equals("An")) count++;
		}
		return count;
	}
}
