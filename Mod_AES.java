import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class AES extends JFrame {

	private JPanel contentPane;
	private JTextField pt02;
	private JTextField pt00;
	private JTextField pt12;
	private JTextField pt13;
	private JTextField pt10;
	private JTextField pt21;
	private JTextField pt20;
	private JTextField pt22;
	private JTextField pt01;
	private JTextField pt11;
	private JTextField pt23;
	private JTextField pt30;
	private JTextField pt03;
	private JTextField pt31;
	private JTextField pt32;
	private JTextField pt33;
	private JTextField ky11;
	private JTextField ky00;
	private JTextField ky01;
	private JTextField ky12;
	private JTextField ky02;
	private JTextField ky21;
	private JTextField ky13;
	private JTextField ky22;
	private JTextField ky03;
	private JTextField ky20;
	private JTextField ky23;
	private JTextField ky30;
	private JTextField ky10;
	private JTextField ky31;
	private JTextField ky32;
	private JTextField ky33;
	private JTextField ct00;
	private JTextField ct02;
	private JTextField ct01;
	private JTextField ct10;
	private JTextField ct03;
	private JTextField ct12;
	private JTextField ct11;
	private JTextField ct21;
	private JTextField ct20;
	private JTextField ct13;
	private JTextField ct23;
	private JTextField ct30;
	private JTextField ct22;
	private JTextField ct31;
	private JTextField ct32;
	private JTextField ct33;
	private JTextField ptSeed;
	private JButton sK3;
	private JButton kyPopRnd;
	private JButton kyPopSdRnd;
	private JButton sK1;
	private JButton sK2;
	private JButton lK1;
	private JButton lK2;
	private JButton lK3;
	private JTextField kySeed;
	private JButton sC3;
	private JButton ctPopRnd;
	private JButton ctPopSdRnd;
	private JButton sC1;
	private JButton sC2;
	private JButton lC1;
	private JButton lC2;
	private JButton lC3;
	private JTextField ctSeed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AES frame = new AES();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void savePT(int arr[][]){
		arr[0][0] = Integer.parseInt(pt00.getText());
		arr[0][1] = Integer.parseInt(pt01.getText());
		arr[0][2] = Integer.parseInt(pt02.getText());
		arr[0][3] = Integer.parseInt(pt03.getText());
		arr[1][0] = Integer.parseInt(pt10.getText());
		arr[1][1] = Integer.parseInt(pt11.getText());
		arr[1][2] = Integer.parseInt(pt12.getText());
		arr[1][3] = Integer.parseInt(pt13.getText());
		arr[2][0] = Integer.parseInt(pt20.getText());
		arr[2][1] = Integer.parseInt(pt21.getText());
		arr[2][2] = Integer.parseInt(pt22.getText());
		arr[2][3] = Integer.parseInt(pt23.getText());
		arr[3][0] = Integer.parseInt(pt30.getText());
		arr[3][1] = Integer.parseInt(pt31.getText());
		arr[3][2] = Integer.parseInt(pt32.getText());
		arr[3][3] = Integer.parseInt(pt33.getText());
	}

	void saveKY(int arr[][]){
		arr[0][0] = Integer.parseInt(ky00.getText());
		arr[0][1] = Integer.parseInt(ky01.getText());
		arr[0][2] = Integer.parseInt(ky02.getText());
		arr[0][3] = Integer.parseInt(ky03.getText());
		arr[1][0] = Integer.parseInt(ky10.getText());
		arr[1][1] = Integer.parseInt(ky11.getText());
		arr[1][2] = Integer.parseInt(ky12.getText());
		arr[1][3] = Integer.parseInt(ky13.getText());
		arr[2][0] = Integer.parseInt(ky20.getText());
		arr[2][1] = Integer.parseInt(ky21.getText());
		arr[2][2] = Integer.parseInt(ky22.getText());
		arr[2][3] = Integer.parseInt(ky23.getText());
		arr[3][0] = Integer.parseInt(ky30.getText());
		arr[3][1] = Integer.parseInt(ky31.getText());
		arr[3][2] = Integer.parseInt(ky32.getText());
		arr[3][3] = Integer.parseInt(ky33.getText());
	}
	
	void saveCT(int arr[][]){
		arr[0][0] = Integer.parseInt(ct00.getText());
		arr[0][1] = Integer.parseInt(ct01.getText());
		arr[0][2] = Integer.parseInt(ct02.getText());
		arr[0][3] = Integer.parseInt(ct03.getText());
		arr[1][0] = Integer.parseInt(ct10.getText());
		arr[1][1] = Integer.parseInt(ct11.getText());
		arr[1][2] = Integer.parseInt(ct12.getText());
		arr[1][3] = Integer.parseInt(ct13.getText());
		arr[2][0] = Integer.parseInt(ct20.getText());
		arr[2][1] = Integer.parseInt(ct21.getText());
		arr[2][2] = Integer.parseInt(ct22.getText());
		arr[2][3] = Integer.parseInt(ct23.getText());
		arr[3][0] = Integer.parseInt(ct30.getText());
		arr[3][1] = Integer.parseInt(ct31.getText());
		arr[3][2] = Integer.parseInt(ct32.getText());
		arr[3][3] = Integer.parseInt(ct33.getText());
	}
	
	void loadPT(int arr[][]){
		pt00.setText("" + arr[0][0]);
		pt01.setText("" + arr[0][1]);
		pt02.setText("" + arr[0][2]);
		pt03.setText("" + arr[0][3]);
		pt10.setText("" + arr[1][0]);
		pt11.setText("" + arr[1][1]);
		pt12.setText("" + arr[1][2]);
		pt13.setText("" + arr[1][3]);
		pt20.setText("" + arr[2][0]);
		pt21.setText("" + arr[2][1]);
		pt22.setText("" + arr[2][2]);
		pt23.setText("" + arr[2][3]);
		pt30.setText("" + arr[3][0]);
		pt31.setText("" + arr[3][1]);
		pt32.setText("" + arr[3][2]);
		pt33.setText("" + arr[3][3]);
	}
	
	void loadKY(int arr[][]){
		ky00.setText("" + arr[0][0]);
		ky01.setText("" + arr[0][1]);
		ky02.setText("" + arr[0][2]);
		ky03.setText("" + arr[0][3]);
		ky10.setText("" + arr[1][0]);
		ky11.setText("" + arr[1][1]);
		ky12.setText("" + arr[1][2]);
		ky13.setText("" + arr[1][3]);
		ky20.setText("" + arr[2][0]);
		ky21.setText("" + arr[2][1]);
		ky22.setText("" + arr[2][2]);
		ky23.setText("" + arr[2][3]);
		ky30.setText("" + arr[3][0]);
		ky31.setText("" + arr[3][1]);
		ky32.setText("" + arr[3][2]);
		ky33.setText("" + arr[3][3]);
	}
	
	void loadCT(int arr[][]){
		ct00.setText("" + arr[0][0]);
		ct01.setText("" + arr[0][1]);
		ct02.setText("" + arr[0][2]);
		ct03.setText("" + arr[0][3]);
		ct10.setText("" + arr[1][0]);
		ct11.setText("" + arr[1][1]);
		ct12.setText("" + arr[1][2]);
		ct13.setText("" + arr[1][3]);
		ct20.setText("" + arr[2][0]);
		ct21.setText("" + arr[2][1]);
		ct22.setText("" + arr[2][2]);
		ct23.setText("" + arr[2][3]);
		ct30.setText("" + arr[3][0]);
		ct31.setText("" + arr[3][1]);
		ct32.setText("" + arr[3][2]);
		ct33.setText("" + arr[3][3]);
	}
	
	int s_box( int n ){
		int x, y;
		x = n / 16;
		y = n % 16;
		int sb[][] = {
						 {0x63 ,0x7c ,0x77 ,0x7b ,0xf2 ,0x6b ,0x6f ,0xc5 ,0x30 ,0x01 ,0x67 ,0x2b ,0xfe ,0xd7 ,0xab ,0x76},
						 {0xca ,0x82 ,0xc9 ,0x7d ,0xfa ,0x59 ,0x47 ,0xf0 ,0xad ,0xd4 ,0xa2 ,0xaf ,0x9c ,0xa4 ,0x72 ,0xc0},
						 {0xb7 ,0xfd ,0x93 ,0x26 ,0x36 ,0x3f ,0xf7 ,0xcc ,0x34 ,0xa5 ,0xe5 ,0xf1 ,0x71 ,0xd8 ,0x31 ,0x15},
						 {0x04 ,0xc7 ,0x23 ,0xc3 ,0x18 ,0x96 ,0x05 ,0x9a ,0x07 ,0x12 ,0x80 ,0xe2 ,0xeb ,0x27 ,0xb2 ,0x75},
						 {0x09 ,0x83 ,0x2c ,0x1a ,0x1b ,0x6e ,0x5a ,0xa0 ,0x52 ,0x3b ,0xd6 ,0xb3 ,0x29 ,0xe3 ,0x2f ,0x84},
						 {0x53 ,0xd1 ,0x00 ,0xed ,0x20 ,0xfc ,0xb1 ,0x5b ,0x6a ,0xcb ,0xbe ,0x39 ,0x4a ,0x4c ,0x58 ,0xcf},
						 {0xd0 ,0xef ,0xaa ,0xfb ,0x43 ,0x4d ,0x33 ,0x85 ,0x45 ,0xf9 ,0x02 ,0x7f ,0x50 ,0x3c ,0x9f ,0xa8},
						 {0x51 ,0xa3 ,0x40 ,0x8f ,0x92 ,0x9d ,0x38 ,0xf5 ,0xbc ,0xb6 ,0xda ,0x21 ,0x10 ,0xff ,0xf3 ,0xd2},
						 {0xcd ,0x0c ,0x13 ,0xec ,0x5f ,0x97 ,0x44 ,0x17 ,0xc4 ,0xa7 ,0x7e ,0x3d ,0x64 ,0x5d ,0x19 ,0x73},
						 {0x60 ,0x81 ,0x4f ,0xdc ,0x22 ,0x2a ,0x90 ,0x88 ,0x46 ,0xee ,0xb8 ,0x14 ,0xde ,0x5e ,0x0b ,0xdb},
						 {0xe0 ,0x32 ,0x3a ,0x0a ,0x49 ,0x06 ,0x24 ,0x5c ,0xc2 ,0xd3 ,0xac ,0x62 ,0x91 ,0x95 ,0xe4 ,0x79},
						 {0xe7 ,0xc8 ,0x37 ,0x6d ,0x8d ,0xd5 ,0x4e ,0xa9 ,0x6c ,0x56 ,0xf4 ,0xea ,0x65 ,0x7a ,0xae ,0x08},
						 {0xba ,0x78 ,0x25 ,0x2e ,0x1c ,0xa6 ,0xb4 ,0xc6 ,0xe8 ,0xdd ,0x74 ,0x1f ,0x4b ,0xbd ,0x8b ,0x8a},
						 {0x70 ,0x3e ,0xb5 ,0x66 ,0x48 ,0x03 ,0xf6 ,0x0e ,0x61 ,0x35 ,0x57 ,0xb9 ,0x86 ,0xc1 ,0x1d ,0x9e},
						 {0xe1 ,0xf8 ,0x98 ,0x11 ,0x69 ,0xd9 ,0x8e ,0x94 ,0x9b ,0x1e ,0x87 ,0xe9 ,0xce ,0x55 ,0x28 ,0xdf},
						 {0x8c ,0xa1 ,0x89 ,0x0d ,0xbf ,0xe6 ,0x42 ,0x68 ,0x41 ,0x99 ,0x2d ,0x0f ,0xb0 ,0x54 ,0xbb ,0x16}
		};
		return ( sb[x][y] );
	}

	void subByte( int ct[][] ){
		int s;
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				s = s_box( ct[j][i] );
				ct[j][i] = s;
			}
		}
	}

	void shiftRow( int ct[][] ){
		int tmp;
		tmp = ct[1][0];
		ct[1][0] = ct[1][1];
		ct[1][1] = ct[1][2];
		ct[1][2] = ct[1][3];
		ct[1][3] = tmp;
		tmp = ct[2][0];
		ct[2][0] = ct[2][2];
		ct[2][2] = tmp;
		tmp = ct[2][1];
		ct[2][1] = ct[2][3];
		ct[2][3] = tmp;
		tmp = ct[3][3];
		ct[3][3] = ct[3][2];
		ct[3][2] = ct[3][1];
		ct[3][1] = ct[3][0];
		ct[3][0] = tmp;
	}

	void mixColumn( int ct[][] ){
		
		int mul_2[] = {0x00,0x02,0x04,0x06,0x08,0x0a,0x0c,0x0e,0x10,0x12,0x14,0x16,0x18,0x1a,0x1c,0x1e,
						 0x20,0x22,0x24,0x26,0x28,0x2a,0x2c,0x2e,0x30,0x32,0x34,0x36,0x38,0x3a,0x3c,0x3e,
						 0x40,0x42,0x44,0x46,0x48,0x4a,0x4c,0x4e,0x50,0x52,0x54,0x56,0x58,0x5a,0x5c,0x5e,
						 0x60,0x62,0x64,0x66,0x68,0x6a,0x6c,0x6e,0x70,0x72,0x74,0x76,0x78,0x7a,0x7c,0x7e,
						 0x80,0x82,0x84,0x86,0x88,0x8a,0x8c,0x8e,0x90,0x92,0x94,0x96,0x98,0x9a,0x9c,0x9e,
						 0xa0,0xa2,0xa4,0xa6,0xa8,0xaa,0xac,0xae,0xb0,0xb2,0xb4,0xb6,0xb8,0xba,0xbc,0xbe,
						 0xc0,0xc2,0xc4,0xc6,0xc8,0xca,0xcc,0xce,0xd0,0xd2,0xd4,0xd6,0xd8,0xda,0xdc,0xde,
						 0xe0,0xe2,0xe4,0xe6,0xe8,0xea,0xec,0xee,0xf0,0xf2,0xf4,0xf6,0xf8,0xfa,0xfc,0xfe,
						 0x1b,0x19,0x1f,0x1d,0x13,0x11,0x17,0x15,0x0b,0x09,0x0f,0x0d,0x03,0x01,0x07,0x05,
						 0x3b,0x39,0x3f,0x3d,0x33,0x31,0x37,0x35,0x2b,0x29,0x2f,0x2d,0x23,0x21,0x27,0x25,
						 0x5b,0x59,0x5f,0x5d,0x53,0x51,0x57,0x55,0x4b,0x49,0x4f,0x4d,0x43,0x41,0x47,0x45,
						 0x7b,0x79,0x7f,0x7d,0x73,0x71,0x77,0x75,0x6b,0x69,0x6f,0x6d,0x63,0x61,0x67,0x65,
						 0x9b,0x99,0x9f,0x9d,0x93,0x91,0x97,0x95,0x8b,0x89,0x8f,0x8d,0x83,0x81,0x87,0x85,
						 0xbb,0xb9,0xbf,0xbd,0xb3,0xb1,0xb7,0xb5,0xab,0xa9,0xaf,0xad,0xa3,0xa1,0xa7,0xa5,
						 0xdb,0xd9,0xdf,0xdd,0xd3,0xd1,0xd7,0xd5,0xcb,0xc9,0xcf,0xcd,0xc3,0xc1,0xc7,0xc5,
						 0xfb,0xf9,0xff,0xfd,0xf3,0xf1,0xf7,0xf5,0xeb,0xe9,0xef,0xed,0xe3,0xe1,0xe7,0xe5
		};
		
		int mul_3[] = {0x00,0x03,0x06,0x05,0x0c,0x0f,0x0a,0x09,0x18,0x1b,0x1e,0x1d,0x14,0x17,0x12,0x11,
						 0x30,0x33,0x36,0x35,0x3c,0x3f,0x3a,0x39,0x28,0x2b,0x2e,0x2d,0x24,0x27,0x22,0x21,
						 0x60,0x63,0x66,0x65,0x6c,0x6f,0x6a,0x69,0x78,0x7b,0x7e,0x7d,0x74,0x77,0x72,0x71,
						 0x50,0x53,0x56,0x55,0x5c,0x5f,0x5a,0x59,0x48,0x4b,0x4e,0x4d,0x44,0x47,0x42,0x41,
						 0xc0,0xc3,0xc6,0xc5,0xcc,0xcf,0xca,0xc9,0xd8,0xdb,0xde,0xdd,0xd4,0xd7,0xd2,0xd1,
						 0xf0,0xf3,0xf6,0xf5,0xfc,0xff,0xfa,0xf9,0xe8,0xeb,0xee,0xed,0xe4,0xe7,0xe2,0xe1,
						 0xa0,0xa3,0xa6,0xa5,0xac,0xaf,0xaa,0xa9,0xb8,0xbb,0xbe,0xbd,0xb4,0xb7,0xb2,0xb1,
						 0x90,0x93,0x96,0x95,0x9c,0x9f,0x9a,0x99,0x88,0x8b,0x8e,0x8d,0x84,0x87,0x82,0x81,
						 0x9b,0x98,0x9d,0x9e,0x97,0x94,0x91,0x92,0x83,0x80,0x85,0x86,0x8f,0x8c,0x89,0x8a,
						 0xab,0xa8,0xad,0xae,0xa7,0xa4,0xa1,0xa2,0xb3,0xb0,0xb5,0xb6,0xbf,0xbc,0xb9,0xba,
						 0xfb,0xf8,0xfd,0xfe,0xf7,0xf4,0xf1,0xf2,0xe3,0xe0,0xe5,0xe6,0xef,0xec,0xe9,0xea,
						 0xcb,0xc8,0xcd,0xce,0xc7,0xc4,0xc1,0xc2,0xd3,0xd0,0xd5,0xd6,0xdf,0xdc,0xd9,0xda,
						 0x5b,0x58,0x5d,0x5e,0x57,0x54,0x51,0x52,0x43,0x40,0x45,0x46,0x4f,0x4c,0x49,0x4a,
						 0x6b,0x68,0x6d,0x6e,0x67,0x64,0x61,0x62,0x73,0x70,0x75,0x76,0x7f,0x7c,0x79,0x7a,
						 0x3b,0x38,0x3d,0x3e,0x37,0x34,0x31,0x32,0x23,0x20,0x25,0x26,0x2f,0x2c,0x29,0x2a,
						 0x0b,0x08,0x0d,0x0e,0x07,0x04,0x01,0x02,0x13,0x10,0x15,0x16,0x1f,0x1c,0x19,0x1a
		};
		
		int res[] = new int[4];
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				res[j] = mul_2[ct[j][i]] ^ mul_3[ct[(j+1)%4][i]] ^ ct[(j+2)%4][i] ^ ct[(j+3)%4][i];
			}
			for( int j=0; j<4; j++ )
				ct[j][i] = res[j];
		}
	}

	int polMul(int n1, int n2){
		int a[] = new int[8];
		int b[] = new int[8];
		int tmp[] = new int[15];
		for(int i=0; i<8; i++){
			a[i] = n1 % 2;
			n1 /= 2;
		}
		for(int i=0; i<8; i++){
			b[i] = n2 % 2;
			n2 /= 2;
		}
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if(a[i]==1 && b[j]==1){
					tmp[i+j] ^= 1;
				}
			}
		}
		for(int i=14; i>=8; i--){
			if(tmp[i]==1){
				tmp[i] ^= 1;
				tmp[i-4] ^= 1;
				tmp[i-5] ^= 1;
				tmp[i-7] ^= 1;
				tmp[i-8] ^= 1;
			}
		}
		int res=0, fac=1;
		for(int i=0; i<8; i++){
			res += (tmp[i]*fac);
			fac *= 2;
		}
		return res;
	}

	int polInv(int inp){
		inp %= 256;
		if(inp < 0)
			inp += 256;
		int inv[] = {0, 1, 141, 246, 203, 82, 123, 209, 232, 79, 41, 192, 176, 225, 229, 199,
						116, 180, 170, 75, 153, 43, 96, 95, 88, 63, 253, 204, 255, 64, 238, 178,
						58, 110, 90, 241, 85, 77, 168, 201, 193, 10, 152, 21, 48, 68, 162, 194,
						44, 69, 146, 108, 243, 57, 102, 66, 242, 53, 32, 111, 119, 187, 89, 25,
						29, 254, 55, 103, 45, 49, 245, 105, 167, 100, 171, 19, 84, 37, 233, 9,
						237, 92, 5, 202, 76, 36, 135, 191, 24, 62, 34, 240, 81, 236, 97, 23,
						22, 94, 175, 211, 73, 166, 54, 67, 244,	71, 145, 223, 51, 147, 33, 59,
						121, 183, 151, 133, 16, 181, 186, 60, 182, 112, 208, 6, 161, 250, 129, 130,
						131, 126, 127, 128, 150, 115, 190, 86, 155, 158, 149, 217, 247, 2, 185, 164,
						222, 106, 50, 109, 216, 138, 132, 114, 42, 20, 159, 136, 249, 220, 137, 154,
						251, 124, 46, 195, 143, 184, 101, 72, 38, 200, 18, 74, 206, 231, 210, 98,
						12, 224, 31, 239, 17, 117, 120, 113, 165, 142, 118, 61, 189, 188, 134, 87,
						11, 40, 47, 163, 218, 212, 228, 15, 169, 39, 83, 4, 27,	252, 172, 230,
						122, 7, 174, 99, 197, 219, 226, 234, 148, 139, 196, 213, 157, 248, 144, 107,
						177, 13, 214, 235, 198, 14, 207, 173, 8, 78, 215, 227, 93, 80, 30, 179,
						91, 35, 56, 52, 104, 70, 3, 140, 221, 156, 125, 160, 205, 26, 65, 28
		};
		return inv[inp];			
	}

	int polSqr(int a){
		return polMul(a, a);
	}

	void fiestelEncrypt128(int ct[][], int key[][]){
		int l[][] = new int[2][4];
		int r[][] = new int[2][4];
		int rs[][] = new int[2][4];
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				l[i][j]=ct[i][j];
				r[i][j]=ct[i+2][j];
			}
		}
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				ct[i][j]=r[i][j];
			}
		}
		rs[0][0]=polSqr(r[0][0]);
		rs[1][0]=polSqr(r[0][1]);
		rs[0][1]=polSqr(r[0][2]);
		rs[1][1]=polSqr(r[0][3]);
		rs[0][2]=polSqr(r[1][0]);
		rs[1][2]=polSqr(r[1][1]);
		rs[0][3]=polSqr(r[1][2]);
		rs[1][3]=polSqr(r[1][3]);
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				r[i][j]=r[i][j]^key[i][j];
				rs[i][j]=rs[i][j]^key[i+2][j];
			}
		}
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				r[i][j] = s_box(r[i][j]);
				rs[i][j] = s_box(rs[i][j]);
			}
		}
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				ct[i+2][j] = l[i][j] ^ polMul(r[i][j], polInv(rs[1-i][3-j]));
			}
		}
	}

	void scheduleKey( int rKey[][], int rnd ){
		int rCon[] = { 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8, 0xab, 0x4d, 0x9a };
		int c[] = new int[4];
		for( int i=0; i<4; i++ ){
			c[i] = rKey[(i+1)%4][3];
			c[i] = s_box( c[i] );
		}
		c[0] = c[0] ^ rCon[rnd] ;
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				c[j] = c[j] ^ rKey[j][i];
				rKey[j][i] = c[j];
			}
		}
	}

	void aesEncrypt( int pt[][], int key[][], int ct[][] ){
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				ct[j][i] = pt[j][i] ^ key[j][i];
			}
		}
		int rKey[][] = new int[4][4];
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				rKey[j][i] = key[j][i];
			}
		}
		for( int i=0; i<15; i++ ){
			scheduleKey(rKey, i);
			if(i>=5 && i<10){
				fiestelEncrypt128(ct, rKey);
				continue;
			}
			subByte(ct);
			shiftRow(ct);
			if( i!=14 )
				mixColumn(ct);
			for( int k=0; k<4; k++ ){
				for( int j=0; j<4; j++ ){
					ct[j][k] = ct[j][k] ^ rKey[j][k];
				}
			}	
		}
	}
	
	void invMixColumn( int pt[][] ){
		int mul_9[] = {0x00,0x09,0x12,0x1b,0x24,0x2d,0x36,0x3f,0x48,0x41,0x5a,0x53,0x6c,0x65,0x7e,0x77,
						 0x90,0x99,0x82,0x8b,0xb4,0xbd,0xa6,0xaf,0xd8,0xd1,0xca,0xc3,0xfc,0xf5,0xee,0xe7,
						 0x3b,0x32,0x29,0x20,0x1f,0x16,0x0d,0x04,0x73,0x7a,0x61,0x68,0x57,0x5e,0x45,0x4c,
						 0xab,0xa2,0xb9,0xb0,0x8f,0x86,0x9d,0x94,0xe3,0xea,0xf1,0xf8,0xc7,0xce,0xd5,0xdc,
						 0x76,0x7f,0x64,0x6d,0x52,0x5b,0x40,0x49,0x3e,0x37,0x2c,0x25,0x1a,0x13,0x08,0x01,
						 0xe6,0xef,0xf4,0xfd,0xc2,0xcb,0xd0,0xd9,0xae,0xa7,0xbc,0xb5,0x8a,0x83,0x98,0x91,
						 0x4d,0x44,0x5f,0x56,0x69,0x60,0x7b,0x72,0x05,0x0c,0x17,0x1e,0x21,0x28,0x33,0x3a,
						 0xdd,0xd4,0xcf,0xc6,0xf9,0xf0,0xeb,0xe2,0x95,0x9c,0x87,0x8e,0xb1,0xb8,0xa3,0xaa,
						 0xec,0xe5,0xfe,0xf7,0xc8,0xc1,0xda,0xd3,0xa4,0xad,0xb6,0xbf,0x80,0x89,0x92,0x9b,
						 0x7c,0x75,0x6e,0x67,0x58,0x51,0x4a,0x43,0x34,0x3d,0x26,0x2f,0x10,0x19,0x02,0x0b,
						 0xd7,0xde,0xc5,0xcc,0xf3,0xfa,0xe1,0xe8,0x9f,0x96,0x8d,0x84,0xbb,0xb2,0xa9,0xa0,
						 0x47,0x4e,0x55,0x5c,0x63,0x6a,0x71,0x78,0x0f,0x06,0x1d,0x14,0x2b,0x22,0x39,0x30,
						 0x9a,0x93,0x88,0x81,0xbe,0xb7,0xac,0xa5,0xd2,0xdb,0xc0,0xc9,0xf6,0xff,0xe4,0xed,
						 0x0a,0x03,0x18,0x11,0x2e,0x27,0x3c,0x35,0x42,0x4b,0x50,0x59,0x66,0x6f,0x74,0x7d,
						 0xa1,0xa8,0xb3,0xba,0x85,0x8c,0x97,0x9e,0xe9,0xe0,0xfb,0xf2,0xcd,0xc4,0xdf,0xd6,
						 0x31,0x38,0x23,0x2a,0x15,0x1c,0x07,0x0e,0x79,0x70,0x6b,0x62,0x5d,0x54,0x4f,0x46
		};
		
		int mul_11[] = {0x00,0x0b,0x16,0x1d,0x2c,0x27,0x3a,0x31,0x58,0x53,0x4e,0x45,0x74,0x7f,0x62,0x69,
						  0xb0,0xbb,0xa6,0xad,0x9c,0x97,0x8a,0x81,0xe8,0xe3,0xfe,0xf5,0xc4,0xcf,0xd2,0xd9,
						  0x7b,0x70,0x6d,0x66,0x57,0x5c,0x41,0x4a,0x23,0x28,0x35,0x3e,0x0f,0x04,0x19,0x12,
						  0xcb,0xc0,0xdd,0xd6,0xe7,0xec,0xf1,0xfa,0x93,0x98,0x85,0x8e,0xbf,0xb4,0xa9,0xa2,
						  0xf6,0xfd,0xe0,0xeb,0xda,0xd1,0xcc,0xc7,0xae,0xa5,0xb8,0xb3,0x82,0x89,0x94,0x9f,
						  0x46,0x4d,0x50,0x5b,0x6a,0x61,0x7c,0x77,0x1e,0x15,0x08,0x03,0x32,0x39,0x24,0x2f,
						  0x8d,0x86,0x9b,0x90,0xa1,0xaa,0xb7,0xbc,0xd5,0xde,0xc3,0xc8,0xf9,0xf2,0xef,0xe4,
						  0x3d,0x36,0x2b,0x20,0x11,0x1a,0x07,0x0c,0x65,0x6e,0x73,0x78,0x49,0x42,0x5f,0x54,
						  0xf7,0xfc,0xe1,0xea,0xdb,0xd0,0xcd,0xc6,0xaf,0xa4,0xb9,0xb2,0x83,0x88,0x95,0x9e,
						  0x47,0x4c,0x51,0x5a,0x6b,0x60,0x7d,0x76,0x1f,0x14,0x09,0x02,0x33,0x38,0x25,0x2e,
						  0x8c,0x87,0x9a,0x91,0xa0,0xab,0xb6,0xbd,0xd4,0xdf,0xc2,0xc9,0xf8,0xf3,0xee,0xe5,
						  0x3c,0x37,0x2a,0x21,0x10,0x1b,0x06,0x0d,0x64,0x6f,0x72,0x79,0x48,0x43,0x5e,0x55,
						  0x01,0x0a,0x17,0x1c,0x2d,0x26,0x3b,0x30,0x59,0x52,0x4f,0x44,0x75,0x7e,0x63,0x68,
						  0xb1,0xba,0xa7,0xac,0x9d,0x96,0x8b,0x80,0xe9,0xe2,0xff,0xf4,0xc5,0xce,0xd3,0xd8,
						  0x7a,0x71,0x6c,0x67,0x56,0x5d,0x40,0x4b,0x22,0x29,0x34,0x3f,0x0e,0x05,0x18,0x13,
						  0xca,0xc1,0xdc,0xd7,0xe6,0xed,0xf0,0xfb,0x92,0x99,0x84,0x8f,0xbe,0xb5,0xa8,0xa3
		};
		
		int mul_13[] = {0x00,0x0d,0x1a,0x17,0x34,0x39,0x2e,0x23,0x68,0x65,0x72,0x7f,0x5c,0x51,0x46,0x4b,
						  0xd0,0xdd,0xca,0xc7,0xe4,0xe9,0xfe,0xf3,0xb8,0xb5,0xa2,0xaf,0x8c,0x81,0x96,0x9b,
						  0xbb,0xb6,0xa1,0xac,0x8f,0x82,0x95,0x98,0xd3,0xde,0xc9,0xc4,0xe7,0xea,0xfd,0xf0,
						  0x6b,0x66,0x71,0x7c,0x5f,0x52,0x45,0x48,0x03,0x0e,0x19,0x14,0x37,0x3a,0x2d,0x20,
						  0x6d,0x60,0x77,0x7a,0x59,0x54,0x43,0x4e,0x05,0x08,0x1f,0x12,0x31,0x3c,0x2b,0x26,
						  0xbd,0xb0,0xa7,0xaa,0x89,0x84,0x93,0x9e,0xd5,0xd8,0xcf,0xc2,0xe1,0xec,0xfb,0xf6,
						  0xd6,0xdb,0xcc,0xc1,0xe2,0xef,0xf8,0xf5,0xbe,0xb3,0xa4,0xa9,0x8a,0x87,0x90,0x9d,
						  0x06,0x0b,0x1c,0x11,0x32,0x3f,0x28,0x25,0x6e,0x63,0x74,0x79,0x5a,0x57,0x40,0x4d,
						  0xda,0xd7,0xc0,0xcd,0xee,0xe3,0xf4,0xf9,0xb2,0xbf,0xa8,0xa5,0x86,0x8b,0x9c,0x91,
						  0x0a,0x07,0x10,0x1d,0x3e,0x33,0x24,0x29,0x62,0x6f,0x78,0x75,0x56,0x5b,0x4c,0x41,
						  0x61,0x6c,0x7b,0x76,0x55,0x58,0x4f,0x42,0x09,0x04,0x13,0x1e,0x3d,0x30,0x27,0x2a,
						  0xb1,0xbc,0xab,0xa6,0x85,0x88,0x9f,0x92,0xd9,0xd4,0xc3,0xce,0xed,0xe0,0xf7,0xfa,
						  0xb7,0xba,0xad,0xa0,0x83,0x8e,0x99,0x94,0xdf,0xd2,0xc5,0xc8,0xeb,0xe6,0xf1,0xfc,
						  0x67,0x6a,0x7d,0x70,0x53,0x5e,0x49,0x44,0x0f,0x02,0x15,0x18,0x3b,0x36,0x21,0x2c,
						  0x0c,0x01,0x16,0x1b,0x38,0x35,0x22,0x2f,0x64,0x69,0x7e,0x73,0x50,0x5d,0x4a,0x47,
						  0xdc,0xd1,0xc6,0xcb,0xe8,0xe5,0xf2,0xff,0xb4,0xb9,0xae,0xa3,0x80,0x8d,0x9a,0x97
		};
		
		int mul_14[] = {0x00,0x0e,0x1c,0x12,0x38,0x36,0x24,0x2a,0x70,0x7e,0x6c,0x62,0x48,0x46,0x54,0x5a,
						  0xe0,0xee,0xfc,0xf2,0xd8,0xd6,0xc4,0xca,0x90,0x9e,0x8c,0x82,0xa8,0xa6,0xb4,0xba,
						  0xdb,0xd5,0xc7,0xc9,0xe3,0xed,0xff,0xf1,0xab,0xa5,0xb7,0xb9,0x93,0x9d,0x8f,0x81,
						  0x3b,0x35,0x27,0x29,0x03,0x0d,0x1f,0x11,0x4b,0x45,0x57,0x59,0x73,0x7d,0x6f,0x61,
						  0xad,0xa3,0xb1,0xbf,0x95,0x9b,0x89,0x87,0xdd,0xd3,0xc1,0xcf,0xe5,0xeb,0xf9,0xf7,
						  0x4d,0x43,0x51,0x5f,0x75,0x7b,0x69,0x67,0x3d,0x33,0x21,0x2f,0x05,0x0b,0x19,0x17,
						  0x76,0x78,0x6a,0x64,0x4e,0x40,0x52,0x5c,0x06,0x08,0x1a,0x14,0x3e,0x30,0x22,0x2c,
						  0x96,0x98,0x8a,0x84,0xae,0xa0,0xb2,0xbc,0xe6,0xe8,0xfa,0xf4,0xde,0xd0,0xc2,0xcc,
						  0x41,0x4f,0x5d,0x53,0x79,0x77,0x65,0x6b,0x31,0x3f,0x2d,0x23,0x09,0x07,0x15,0x1b,
						  0xa1,0xaf,0xbd,0xb3,0x99,0x97,0x85,0x8b,0xd1,0xdf,0xcd,0xc3,0xe9,0xe7,0xf5,0xfb,
						  0x9a,0x94,0x86,0x88,0xa2,0xac,0xbe,0xb0,0xea,0xe4,0xf6,0xf8,0xd2,0xdc,0xce,0xc0,
						  0x7a,0x74,0x66,0x68,0x42,0x4c,0x5e,0x50,0x0a,0x04,0x16,0x18,0x32,0x3c,0x2e,0x20,
						  0xec,0xe2,0xf0,0xfe,0xd4,0xda,0xc8,0xc6,0x9c,0x92,0x80,0x8e,0xa4,0xaa,0xb8,0xb6,
						  0x0c,0x02,0x10,0x1e,0x34,0x3a,0x28,0x26,0x7c,0x72,0x60,0x6e,0x44,0x4a,0x58,0x56,
						  0x37,0x39,0x2b,0x25,0x0f,0x01,0x13,0x1d,0x47,0x49,0x5b,0x55,0x7f,0x71,0x63,0x6d,
						  0xd7,0xd9,0xcb,0xc5,0xef,0xe1,0xf3,0xfd,0xa7,0xa9,0xbb,0xb5,0x9f,0x91,0x83,0x8d
		};
		
		int res[] = new int[4];
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				res[j] = mul_14[pt[j][i]] ^ mul_11[pt[(j+1)%4][i]] ^ mul_13[pt[(j+2)%4][i]] ^ mul_9[pt[(j+3)%4][i]];
			}
			for( int j=0; j<4; j++ )
				pt[j][i] = res[j];
		}
	}

	void invShiftRow( int pt[][] ){
		int tmp;
		tmp = pt[1][3];
		pt[1][3] = pt[1][2];
		pt[1][2] = pt[1][1];
		pt[1][1] = pt[1][0];
		pt[1][0] = tmp;
		tmp = pt[2][0];
		pt[2][0] = pt[2][2];
		pt[2][2] = tmp;
		tmp = pt[2][1];
		pt[2][1] = pt[2][3];
		pt[2][3] = tmp;
		tmp = pt[3][0];
		pt[3][0] = pt[3][1];
		pt[3][1] = pt[3][2];
		pt[3][2] = pt[3][3];
		pt[3][3] = tmp;
	}

	int inv_s_box( int n ){
		int x, y;
		x = n / 16;
		y = n % 16;
		int inv_s[][] = {
							 {0x52 ,0x09 ,0x6a ,0xd5 ,0x30 ,0x36 ,0xa5 ,0x38 ,0xbf ,0x40 ,0xa3 ,0x9e ,0x81 ,0xf3 ,0xd7 ,0xfb},
							 {0x7c ,0xe3 ,0x39 ,0x82 ,0x9b ,0x2f ,0xff ,0x87 ,0x34 ,0x8e ,0x43 ,0x44 ,0xc4 ,0xde ,0xe9 ,0xcb},
							 {0x54 ,0x7b ,0x94 ,0x32 ,0xa6 ,0xc2 ,0x23 ,0x3d ,0xee ,0x4c ,0x95 ,0x0b ,0x42 ,0xfa ,0xc3 ,0x4e},
							 {0x08 ,0x2e ,0xa1 ,0x66 ,0x28 ,0xd9 ,0x24 ,0xb2 ,0x76 ,0x5b ,0xa2 ,0x49 ,0x6d ,0x8b ,0xd1 ,0x25},
							 {0x72 ,0xf8 ,0xf6 ,0x64 ,0x86 ,0x68 ,0x98 ,0x16 ,0xd4 ,0xa4 ,0x5c ,0xcc ,0x5d ,0x65 ,0xb6 ,0x92},
							 {0x6c ,0x70 ,0x48 ,0x50 ,0xfd ,0xed ,0xb9 ,0xda ,0x5e ,0x15 ,0x46 ,0x57 ,0xa7 ,0x8d ,0x9d ,0x84},
							 {0x90 ,0xd8 ,0xab ,0x00 ,0x8c ,0xbc ,0xd3 ,0x0a ,0xf7 ,0xe4 ,0x58 ,0x05 ,0xb8 ,0xb3 ,0x45 ,0x06},
							 {0xd0 ,0x2c ,0x1e ,0x8f ,0xca ,0x3f ,0x0f ,0x02 ,0xc1 ,0xaf ,0xbd ,0x03 ,0x01 ,0x13 ,0x8a ,0x6b},
							 {0x3a ,0x91 ,0x11 ,0x41 ,0x4f ,0x67 ,0xdc ,0xea ,0x97 ,0xf2 ,0xcf ,0xce ,0xf0 ,0xb4 ,0xe6 ,0x73},
							 {0x96 ,0xac ,0x74 ,0x22 ,0xe7 ,0xad ,0x35 ,0x85 ,0xe2 ,0xf9 ,0x37 ,0xe8 ,0x1c ,0x75 ,0xdf ,0x6e},
							 {0x47 ,0xf1 ,0x1a ,0x71 ,0x1d ,0x29 ,0xc5 ,0x89 ,0x6f ,0xb7 ,0x62 ,0x0e ,0xaa ,0x18 ,0xbe ,0x1b},
							 {0xfc ,0x56 ,0x3e ,0x4b ,0xc6 ,0xd2 ,0x79 ,0x20 ,0x9a ,0xdb ,0xc0 ,0xfe ,0x78 ,0xcd ,0x5a ,0xf4},
							 {0x1f ,0xdd ,0xa8 ,0x33 ,0x88 ,0x07 ,0xc7 ,0x31 ,0xb1 ,0x12 ,0x10 ,0x59 ,0x27 ,0x80 ,0xec ,0x5f},
							 {0x60 ,0x51 ,0x7f ,0xa9 ,0x19 ,0xb5 ,0x4a ,0x0d ,0x2d ,0xe5 ,0x7a ,0x9f ,0x93 ,0xc9 ,0x9c ,0xef},
							 {0xa0 ,0xe0 ,0x3b ,0x4d ,0xae ,0x2a ,0xf5 ,0xb0 ,0xc8 ,0xeb ,0xbb ,0x3c ,0x83 ,0x53 ,0x99 ,0x61},
							 {0x17 ,0x2b ,0x04 ,0x7e ,0xba ,0x77 ,0xd6 ,0x26 ,0xe1 ,0x69 ,0x14 ,0x63 ,0x55 ,0x21 ,0x0c ,0x7d}
		};
		
		return ( inv_s[x][y] );
	}

	void invSubBytes( int pt[][] ){
		int s;
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				s = inv_s_box( pt[j][i] );
				pt[j][i] = s;
			}
		}
	}

	void fiestelDecrypt128(int pt[][], int key[][]){
		int r[][] = new int[2][4];
		int l[][] = new int[2][4];
		int ls[][] = new int[2][4];
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				l[i][j]=pt[i][j];
				r[i][j]=pt[i+2][j];
			}
		}
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				pt[i+2][j]=l[i][j];
			}
		}
		ls[0][0]=polSqr(l[0][0]);
		ls[1][0]=polSqr(l[0][1]);
		ls[0][1]=polSqr(l[0][2]);
		ls[1][1]=polSqr(l[0][3]);
		ls[0][2]=polSqr(l[1][0]);
		ls[1][2]=polSqr(l[1][1]);
		ls[0][3]=polSqr(l[1][2]);
		ls[1][3]=polSqr(l[1][3]);
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				l[i][j]=l[i][j]^key[i][j];
				ls[i][j]=ls[i][j]^key[i+2][j];
			}
		}
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				l[i][j] = s_box(l[i][j]);
				ls[i][j] = s_box(ls[i][j]);
			}
		}
		for(int i=0; i<2; i++){
			for(int j=0; j<4; j++){
				pt[i][j] = r[i][j] ^ polMul(l[i][j], polInv(ls[1-i][3-j]));
			}
		}
	}

	void aesDecrypt( int ct[][], int key[][], int pt[][] ){
		int rKey[][][] = new int[15][4][4];
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				for( int k=0; k<15; k++ )
					rKey[k][j][i] = key[j][i];
			}
		}
		
		for( int i=0; i<15; i++ ){
			for( int j=0; j<=i; j++ ){
				scheduleKey(rKey[i], j);
			}
		}
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				pt[i][j] = ct[i][j];
			}
		}
		for( int i=14; i>=0; i-- ){
			if(i<10 && i>=5){
				fiestelDecrypt128(pt, rKey[i]);
				continue;
			}
			for( int k=0; k<4; k++ ){
				for( int j=0; j<4; j++ ){
					pt[j][k] = pt[j][k] ^ rKey[i][j][k];
				}
			}
			if( i!=14 )
				invMixColumn(pt);
			invShiftRow(pt);
			invSubBytes(pt);
		}
		for( int i=0; i<4; i++ ){
			for( int j=0; j<4; j++ ){
				pt[i][j] = pt[i][j] ^ key[i][j];
			}
		}
	}
	
	/**
	 * Create the frame.
	 */
	public AES() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int P1[][] = new int[4][4];
		int P2[][] = new int[4][4];
		int P3[][] = new int[4][4];
		int K1[][] = new int[4][4];
		int K2[][] = new int[4][4];
		int K3[][] = new int[4][4];
		int C1[][] = new int[4][4];
		int C2[][] = new int[4][4];
		int C3[][] = new int[4][4];
		
		JLabel lblHead = new JLabel("FIESTEL-MODIFIED ADVANCED ENCRYPTION STANDARD");
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHead.setBounds(10, 11, 864, 14);
		contentPane.add(lblHead);
		
		JPanel panel_pt = new JPanel();
		panel_pt.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "PLAINTEXT", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_pt.setBounds(10, 36, 250, 400);
		contentPane.add(panel_pt);
		panel_pt.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(37, 40, 175, 175);
		panel_pt.add(panel);
		panel.setLayout(new GridLayout(4, 4, 1, 1));
		
		pt00 = new JTextField();
		pt00.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt00);
		pt00.setColumns(10);
		
		pt01 = new JTextField();
		pt01.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt01);
		pt01.setColumns(10);
		
		pt02 = new JTextField();
		pt02.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt02);
		pt02.setColumns(10);
		
		pt03 = new JTextField();
		pt03.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt03);
		pt03.setColumns(10);
		
		pt10 = new JTextField();
		pt10.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt10);
		pt10.setColumns(10);
		
		pt11 = new JTextField();
		pt11.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt11);
		pt11.setColumns(10);
		
		pt12 = new JTextField();
		pt12.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt12);
		pt12.setColumns(10);
		
		pt13 = new JTextField();
		pt13.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt13);
		pt13.setColumns(10);
		
		pt20 = new JTextField();
		pt20.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt20);
		pt20.setColumns(10);
		
		pt21 = new JTextField();
		pt21.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt21);
		pt21.setColumns(10);
		
		pt22 = new JTextField();
		pt22.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt22);
		pt22.setColumns(10);
		
		pt23 = new JTextField();
		pt23.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt23);
		pt23.setColumns(10);
		
		pt30 = new JTextField();
		pt30.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt30);
		pt30.setColumns(10);
		
		pt31 = new JTextField();
		pt31.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt31);
		pt31.setColumns(10);
		
		pt32 = new JTextField();
		pt32.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt32);
		pt32.setColumns(10);
		
		pt33 = new JTextField();
		pt33.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pt33);
		pt33.setColumns(10);
		
		JButton ptPopRnd = new JButton("Populate Random");
		ptPopRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a[][]=new int[4][4];
				Random rnd = new Random(System.currentTimeMillis());
				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
						a[i][j] = rnd.nextInt() % 256;
						if(a[i][j]<0)
							a[i][j] += 256;
					}
				}
				loadPT(a);
			}
		});
		ptPopRnd.setBounds(10, 226, 230, 23);
		panel_pt.add(ptPopRnd);
		
		JButton ptPopSdRnd = new JButton("Populate Seeded Random");
		ptPopSdRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a[][]=new int[4][4];
				int sd = Integer.parseInt(ptSeed.getText());
				Random rnd = new Random(sd);
				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
						a[i][j] = rnd.nextInt() % 256;
						if(a[i][j]<0)
							a[i][j] += 256;
					}
				}
				loadPT(a);
			}
		});
		ptPopSdRnd.setBounds(10, 260, 180, 23);
		panel_pt.add(ptPopSdRnd);
		
		ptSeed = new JTextField();
		ptSeed.setBounds(200, 260, 40, 23);
		panel_pt.add(ptSeed);
		ptSeed.setColumns(10);
		
		JButton sP1 = new JButton("Save as P1");
		sP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				savePT(P1);
			}
		});
		sP1.setBounds(10, 294, 103, 23);
		panel_pt.add(sP1);
		
		JButton lP1 = new JButton("Load P1");
		lP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadPT(P1);
			}
		});
		lP1.setBounds(137, 294, 103, 23);
		panel_pt.add(lP1);
		
		JButton sP2 = new JButton("Save as P2");
		sP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savePT(P2);
			}
		});
		sP2.setBounds(10, 328, 103, 23);
		panel_pt.add(sP2);
		
		JButton lP2 = new JButton("Load P2");
		lP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadPT(P2);
			}
		});
		lP2.setBounds(137, 328, 103, 23);
		panel_pt.add(lP2);
		
		JButton sP3 = new JButton("Save as P3");
		sP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savePT(P3);
			}
		});
		sP3.setBounds(10, 362, 103, 23);
		panel_pt.add(sP3);
		
		JButton lP3 = new JButton("Load P3");
		lP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadPT(P3);
			}
		});
		lP3.setBounds(137, 362, 103, 23);
		panel_pt.add(lP3);
		
		JPanel panel_ky = new JPanel();
		panel_ky.setBounds(317, 36, 250, 400);
		contentPane.add(panel_ky);
		panel_ky.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "KEY", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_ky.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(37, 39, 175, 175);
		panel_ky.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 4, 1, 1));
		
		ky00 = new JTextField();
		ky00.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky00);
		ky00.setColumns(10);
		
		ky01 = new JTextField();
		ky01.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky01);
		ky01.setColumns(10);
		
		ky02 = new JTextField();
		ky02.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky02);
		ky02.setColumns(10);
		
		ky03 = new JTextField();
		ky03.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky03);
		ky03.setColumns(10);
		
		ky10 = new JTextField();
		ky10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky10);
		ky10.setColumns(10);
		
		ky11 = new JTextField();
		ky11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky11);
		ky11.setColumns(10);
		
		ky12 = new JTextField();
		ky12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky12);
		ky12.setColumns(10);
		
		ky13 = new JTextField();
		ky13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky13);
		ky13.setColumns(10);
		
		ky20 = new JTextField();
		ky20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky20);
		ky20.setColumns(10);
		
		ky21 = new JTextField();
		ky21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky21);
		ky21.setColumns(10);
		
		ky22 = new JTextField();
		ky22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky22);
		ky22.setColumns(10);
		
		ky23 = new JTextField();
		ky23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky23);
		ky23.setColumns(10);
		
		ky30 = new JTextField();
		ky30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky30);
		ky30.setColumns(10);
		
		ky31 = new JTextField();
		ky31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky31);
		ky31.setColumns(10);
		
		ky32 = new JTextField();
		ky32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky32);
		ky32.setColumns(10);
		
		ky33 = new JTextField();
		ky33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(ky33);
		ky33.setColumns(10);
		
		kyPopRnd = new JButton("Populate Random");
		kyPopRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a[][]=new int[4][4];
				Random rnd = new Random(System.currentTimeMillis());
				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
						a[i][j] = rnd.nextInt() % 256;
						if(a[i][j]<0)
							a[i][j] += 256;
					}
				}
				loadKY(a);
			}
		});
		kyPopRnd.setBounds(10, 225, 230, 23);
		panel_ky.add(kyPopRnd);
		
		kyPopSdRnd = new JButton("Populate Seeded Random");
		kyPopSdRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a[][]=new int[4][4];
				int sd = Integer.parseInt(kySeed.getText());
				Random rnd = new Random(sd);
				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
						a[i][j] = rnd.nextInt() % 256;
						if(a[i][j]<0)
							a[i][j] += 256;
					}
				}
				loadKY(a);
			}
		});
		kyPopSdRnd.setBounds(10, 259, 180, 23);
		panel_ky.add(kyPopSdRnd);
		
		sK1 = new JButton("Save as K1");
		sK1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveKY(K1);
			}
		});
		sK1.setBounds(10, 293, 103, 23);
		panel_ky.add(sK1);
		
		sK2 = new JButton("Save as K2");
		sK2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveKY(K2);
			}
		});
		sK2.setBounds(10, 327, 103, 23);
		panel_ky.add(sK2);
		
		sK3 = new JButton("Save as K3");
		sK3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveKY(K3);
			}
		});
		sK3.setBounds(10, 361, 103, 23);
		panel_ky.add(sK3);
		
		lK1 = new JButton("Load K1");
		lK1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadKY(K1);
			}
		});
		lK1.setBounds(137, 293, 103, 23);
		panel_ky.add(lK1);
		
		lK2 = new JButton("Load K2");
		lK2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadKY(K2);
			}
		});
		lK2.setBounds(137, 327, 103, 23);
		panel_ky.add(lK2);
		
		lK3 = new JButton("Load K3");
		lK3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadKY(K3);
			}
		});
		lK3.setBounds(137, 361, 103, 23);
		panel_ky.add(lK3);
		
		kySeed = new JTextField();
		kySeed.setColumns(10);
		kySeed.setBounds(200, 259, 40, 23);
		panel_ky.add(kySeed);
		
		JPanel panel_ct = new JPanel();
		panel_ct.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "CIPHERTEXT", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_ct.setBounds(624, 36, 250, 400);
		contentPane.add(panel_ct);
		panel_ct.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(37, 39, 175, 175);
		panel_ct.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 4, 1, 1));
		
		ct00 = new JTextField();
		ct00.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct00);
		ct00.setColumns(10);
		
		ct01 = new JTextField();
		ct01.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct01);
		ct01.setColumns(10);
		
		ct02 = new JTextField();
		ct02.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct02);
		ct02.setColumns(10);
		
		ct03 = new JTextField();
		ct03.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct03);
		ct03.setColumns(10);
		
		ct10 = new JTextField();
		ct10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct10);
		ct10.setColumns(10);
		
		ct11 = new JTextField();
		ct11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct11);
		ct11.setColumns(10);
		
		ct12 = new JTextField();
		ct12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct12);
		ct12.setColumns(10);
		
		ct13 = new JTextField();
		ct13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct13);
		ct13.setColumns(10);
		
		ct20 = new JTextField();
		ct20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct20);
		ct20.setColumns(10);
		
		ct21 = new JTextField();
		ct21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct21);
		ct21.setColumns(10);
		
		ct22 = new JTextField();
		ct22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct22);
		ct22.setColumns(10);
		
		ct23 = new JTextField();
		ct23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct23);
		ct23.setColumns(10);
		
		ct30 = new JTextField();
		ct30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct30);
		ct30.setColumns(10);
		
		ct31 = new JTextField();
		ct31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct31);
		ct31.setColumns(10);
		
		ct32 = new JTextField();
		ct32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct32);
		ct32.setColumns(10);
		
		ct33 = new JTextField();
		ct33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(ct33);
		ct33.setColumns(10);
		
		sC3 = new JButton("Save as C3");
		sC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveCT(C3);
			}
		});
		sC3.setBounds(10, 361, 103, 23);
		panel_ct.add(sC3);
		
		ctPopRnd = new JButton("Populate Random");
		ctPopRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a[][]=new int[4][4];
				Random rnd = new Random(System.currentTimeMillis());
				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
						a[i][j] = rnd.nextInt() % 256;
						if(a[i][j]<0)
							a[i][j] += 256;
					}
				}
				loadCT(a);
			}
		});
		ctPopRnd.setBounds(10, 225, 230, 23);
		panel_ct.add(ctPopRnd);
		
		ctPopSdRnd = new JButton("Populate Seeded Random");
		ctPopSdRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a[][]=new int[4][4];
				int sd = Integer.parseInt(ctSeed.getText());
				Random rnd = new Random(sd);
				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
						a[i][j] = rnd.nextInt() % 256;
						if(a[i][j]<0)
							a[i][j] += 256;
					}
				}
				loadCT(a);
			}
		});
		ctPopSdRnd.setBounds(10, 259, 180, 23);
		panel_ct.add(ctPopSdRnd);
		
		sC1 = new JButton("Save as C1");
		sC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveCT(C1);
			}
		});
		sC1.setBounds(10, 293, 103, 23);
		panel_ct.add(sC1);
		
		sC2 = new JButton("Save as C2");
		sC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveCT(C2);
			}
		});
		sC2.setBounds(10, 327, 103, 23);
		panel_ct.add(sC2);
		
		lC1 = new JButton("Load C1");
		lC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadCT(C1);
			}
		});
		lC1.setBounds(137, 293, 103, 23);
		panel_ct.add(lC1);
		
		lC2 = new JButton("Load C2");
		lC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadCT(C2);
			}
		});
		lC2.setBounds(137, 327, 103, 23);
		panel_ct.add(lC2);
		
		lC3 = new JButton("Load C3");
		lC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadCT(C3);
			}
		});
		lC3.setBounds(137, 361, 103, 23);
		panel_ct.add(lC3);
		
		ctSeed = new JTextField();
		ctSeed.setColumns(10);
		ctSeed.setBounds(200, 259, 40, 23);
		panel_ct.add(ctSeed);
		
		JPanel panel_cmp = new JPanel();
		panel_cmp.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "ANALYSIS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_cmp.setBounds(10, 447, 864, 103);
		contentPane.add(panel_cmp);
		
		JButton btnDecrypt = new JButton("DECRYPT");
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ct[][] = new int[4][4];
				saveCT(ct);
				int ky[][] = new int[4][4];
				saveKY(ky);
				int pt[][] = new int[4][4];
				aesDecrypt(ct, ky, pt);
				loadPT(pt);
			}
		});
		btnDecrypt.setBounds(270, 77, 37, 174);
		contentPane.add(btnDecrypt);
		
		JButton btnEncrypt = new JButton("ENCRYPT");
		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pt[][] = new int[4][4];
				savePT(pt);
				int ky[][] = new int[4][4];
				saveKY(ky);
				int ct[][] = new int[4][4];
				aesEncrypt(pt, ky, ct);
				loadCT(ct);
			}
		});
		btnEncrypt.setBounds(577, 77, 37, 174);
		contentPane.add(btnEncrypt);
	}
}
