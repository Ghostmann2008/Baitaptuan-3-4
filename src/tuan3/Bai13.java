package tuan3;

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

public class Bai13 extends JFrame {

	private JPanel contentPane;
	private JTextField textMSSV;
	private JTextField textMyName;
	private JTextField textMyClass;
	private JLabel teacherName;
	private JTextField textTeacherName;
	private JLabel output;
	private JButton answer;
	private JTextField str2Bi;
	private JLabel input;
	private JTextField textInput;
	private int vX = 1, vY = 0;
	private char v = 'E';	   //huong tinh tien
	private int X = 0, Y = 0;   //toa do
	private JTextArea textOutput;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai13 frame = new Bai13();
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
	public Bai13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 578);
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
				vX = 1; vY = 0;
				v = 'E';	  
				X = 0; Y = 0;
				int n = Integer.valueOf(textInput.getText());
				String output = Solve(n);
				textOutput.setText(output);

			}
		});
		answer.setBounds(232, 518, 89, 23);
		contentPane.add(answer);

		JTextArea textProblem = new JTextArea();
		textProblem.setEditable(false);
		textProblem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textProblem.setText(
				"Nh\u1EADp v\u00E0o k\u00EDch th\u01B0\u1EDBc \u00F4 vu\u00F4ng n*n, ki\u1EC3m tra 3<=n<= 8. Hi\u1EC3n th\u1ECB ra \n m\u00E0n h\u00ECnh k\u1EBFt qu\u1EA3 nh\u01B0 m\u00E0n h\u00ECnh");
		textProblem.setBounds(131, 168, 397, 38);
		contentPane.add(textProblem);

		str2Bi = new JTextField();
		str2Bi.setEditable(false);
		str2Bi.setForeground(Color.MAGENTA);
		str2Bi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		str2Bi.setText("B\u00E0i 13");
		str2Bi.setBounds(262, 126, 46, 31);
		contentPane.add(str2Bi);
		str2Bi.setColumns(10);

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
		
		textOutput = new JTextArea();
		textOutput.setBounds(131, 286, 397, 221);
		contentPane.add(textOutput);
	}

	public String Solve(int n) {
		int[][] arr = new int[n][n];
		for (int i = 1; i <= n * n; i++) {
			arr[X][Y] = i;
			if ((X + vX > n - 1) || (Y + vY > n - 1) || (X + vX < 0) || (Y + vY < 0)) {
				TurnRight();
				NextTile();
			} else if (arr[X + vX][Y + vY] != 0) {
				TurnRight();
				NextTile();
			} else
				NextTile();
		}
		String s="";
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				s+= arr[i][j]+"  ";
			}
			s+="\n";
		}
		return s;
	}

	

	private void NextTile() {
		X += vX;
		Y += vY;
	}

	private void TurnRight() {
		if (v == 'E') {
			vX = 0;
			vY = 1;
			v = 'S';
			return;
		}
		if (v == 'S') {
			vX = -1;
			vY = 0;
			v = 'W';
			return;
		}
		if (v == 'W') {
			vX = 0;
			vY = -1;
			v = 'N';
			return;
		}
		if (v == 'N') {
			vX = 1;
			vY = 0;
			v = 'E';
			return;
		}
	}
}
