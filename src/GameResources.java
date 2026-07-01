package Project.src;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

// $VF: renamed from: f
public final class GameResources extends Canvas implements Runnable {
   // $VF: renamed from: a int
   static int a_int = -6;
   // $VF: renamed from: b int
   static int b_int = -7;
   // $VF: renamed from: a boolean
   boolean a_bool = true;
   // $VF: renamed from: a MainMIDlet
   MainMIDlet midlet;
   // $VF: renamed from: a b
   GameEngine engine;
   // $VF: renamed from: a c
   GameRenderer renderer;
   // $VF: renamed from: b boolean
   boolean b_bool;
   // $VF: renamed from: c int
   int c_int;
   // $VF: renamed from: d int
   int d_int;
   // $VF: renamed from: e int
   int e_int;
   // $VF: renamed from: f int
   int f_int;
   // $VF: renamed from: g int
   int g_int;
   // $VF: renamed from: h int
   int h_int;
   // $VF: renamed from: i int
   int i_int;
   // $VF: renamed from: j int
   int j_int = 120;
   // $VF: renamed from: k int
   int k_int = 1;
   // $VF: renamed from: c boolean
   boolean c_bool;
   // $VF: renamed from: a byte
   static byte a_byte = 0;
   // $VF: renamed from: a java.lang.String
   String midletVersion;
   // $VF: renamed from: d boolean
   boolean d_bool;
   // $VF: renamed from: b byte
   byte b_byte;
   // $VF: renamed from: c byte
   byte c_byte;
   // $VF: renamed from: d byte
   byte d_byte;
   // $VF: renamed from: l int
   int l_int = 1;
   // $VF: renamed from: a java.lang.String[]
   final String[] supportedLanguages = new String[]{"en", "fr", "it", "de", "es"};
   // $VF: renamed from: a byte[]
   byte[] a_byteArr;
   // $VF: renamed from: a short[]
   short[] a_shortArr;
   // $VF: renamed from: b short[]
   short[] b_shortArr;
   // $VF: renamed from: c short[]
   short[] c_shortArr;
   // $VF: renamed from: e byte
   byte e_byte;
   // $VF: renamed from: f byte
   static byte f_byte;
   // $VF: renamed from: g byte
   static byte g_byte;
   // $VF: renamed from: b byte[]
   byte[] b_byteArr;
   // $VF: renamed from: a a
   SoundPlayer soundPlayer;
   // $VF: renamed from: h byte
   byte h_byte;
   // $VF: renamed from: m int
   int m_int;
   // $VF: renamed from: e boolean
   boolean e_bool;
   // $VF: renamed from: f boolean
   boolean f_bool;
   // $VF: renamed from: g boolean
   boolean g_bool;
   // $VF: renamed from: h boolean
   boolean h_bool;
   // $VF: renamed from: i boolean
   boolean i_bool;
   // $VF: renamed from: j boolean
   boolean j_bool;
   // $VF: renamed from: k boolean
   boolean k_bool;
   // $VF: renamed from: i byte
   byte i_byte;
   // $VF: renamed from: l boolean
   static boolean l_bool;
   // $VF: renamed from: m boolean
   static boolean m_bool;
   // $VF: renamed from: j byte
   byte j_byte;
   // $VF: renamed from: n int
   int n_int;
   // $VF: renamed from: o int
   int o_int;
   // $VF: renamed from: p int
   int p_int;
   // $VF: renamed from: n boolean
   boolean n_bool;
   // $VF: renamed from: o boolean
   boolean o_bool;
   // $VF: renamed from: p boolean
   boolean p_bool;
   // $VF: renamed from: k byte
   byte k_byte;
   // $VF: renamed from: l byte
   byte l_byte;
   // $VF: renamed from: q boolean
   boolean q_bool;
   // $VF: renamed from: q int
   int q_int;
   // $VF: renamed from: r int
   int r_int;
   // $VF: renamed from: s int
   int s_int;
   // $VF: renamed from: t int
   int t_int;
   // $VF: renamed from: u int
   int u_int;
   // $VF: renamed from: r boolean
   boolean r_bool;
   // $VF: renamed from: v int
   int v_int = -1;
   // $VF: renamed from: w int
   int w_int = -1;
   // $VF: renamed from: x int
   int x_int;
   // $VF: renamed from: y int
   int y_int;
   // $VF: renamed from: z int
   int z_int;
   // $VF: renamed from: m byte
   byte m_byte;
   // $VF: renamed from: n byte
   byte n_byte;
   // $VF: renamed from: o byte
   byte o_byte;
   // $VF: renamed from: s boolean
   boolean s_bool;
   // $VF: renamed from: p byte
   byte p_byte;
   // $VF: renamed from: q byte
   byte q_byte;
   // $VF: renamed from: r byte
   byte r_byte;
   // $VF: renamed from: s byte
   byte s_byte = -1;
   // $VF: renamed from: t byte
   byte t_byte = -1;
   // $VF: renamed from: u byte
   byte u_byte;
   // $VF: renamed from: v byte
   byte v_byte = 2;
   // $VF: renamed from: a short
   short a_short;
   // $VF: renamed from: b short
   short b_short;
   // $VF: renamed from: A int
   int A_int;
   // $VF: renamed from: a int[][]
   int[][] a_intArr2;
   // $VF: renamed from: w byte
   byte w_byte;
   // $VF: renamed from: x byte
   byte x_byte;
   // $VF: renamed from: y byte
   byte y_byte;
   // $VF: renamed from: z byte
   byte z_byte;
   // $VF: renamed from: A byte
   byte A_byte;
   // $VF: renamed from: B byte
   byte B_byte;
   // $VF: renamed from: C byte
   byte C_byte;
   // $VF: renamed from: D byte
   byte D_byte;
   // $VF: renamed from: B int
   int B_int;
   // $VF: renamed from: C int
   int C_int;
   // $VF: renamed from: D int
   int D_int;
   // $VF: renamed from: E int
   int E_int;
   // $VF: renamed from: t boolean
   boolean t_bool = false;
   // $VF: renamed from: u boolean
   boolean u_bool = false;
   // $VF: renamed from: E byte
   byte E_byte;
   // $VF: renamed from: F int
   int F_int;
   // $VF: renamed from: G int
   int G_int;
   // $VF: renamed from: H int
   int H_int;
   // $VF: renamed from: F byte
   byte F_byte;
   // $VF: renamed from: G byte
   byte G_byte;
   // $VF: renamed from: a byte[][]
   byte[][] a_byteArr2;
   // $VF: renamed from: v boolean
   boolean v_bool = false;
   // $VF: renamed from: w boolean
   boolean w_bool = false;
   // $VF: renamed from: I int
   int I_int;
   // $VF: renamed from: H byte
   byte H_byte;
   // $VF: renamed from: J int
   int J_int;
   // $VF: renamed from: K int
   int K_int;
   // $VF: renamed from: L int
   int L_int;
   // $VF: renamed from: M int
   int M_int;
   // $VF: renamed from: I byte
   byte I_byte;
   // $VF: renamed from: J byte
   byte J_byte;
   // $VF: renamed from: K byte
   byte K_byte;
   // $VF: renamed from: L byte
   byte L_byte;
   // $VF: renamed from: N int
   int N_int;
   // $VF: renamed from: O int
   int O_int;
   // $VF: renamed from: P int
   int P_int;
   // $VF: renamed from: Q int
   int Q_int;
   // $VF: renamed from: R int
   int R_int;
   // $VF: renamed from: S int
   int S_int;
   // $VF: renamed from: T int
   int T_int;
   // $VF: renamed from: a int[]
   int[] a_intArr;
   // $VF: renamed from: b int[]
   int[] b_intArr;
   // $VF: renamed from: c int[]
   int[] c_intArr;
   // $VF: renamed from: d int[]
   int[] d_intArr;
   // $VF: renamed from: c byte[]
   byte[] c_byteArr;
   // $VF: renamed from: d byte[]
   byte[] d_byteArr;
   // $VF: renamed from: a javax.microedition.lcdui.Image[]
   static final Image[] frameBuffers = new Image[4];
   // $VF: renamed from: a javax.microedition.lcdui.Graphics[]
   static final Graphics[] frameGraphics = new Graphics[4];
   private Image screenScaleBuffer;
   private Graphics screenScaleGraphics;
   // $VF: renamed from: M byte
   static byte M_byte = 0;
   // $VF: renamed from: N byte
   byte N_byte = 1;
   // $VF: renamed from: c short
   short c_short = 96;
   // $VF: renamed from: d short
   short d_short = 96;
   // $VF: renamed from: e short
   short e_short = 96;
   // $VF: renamed from: f short
   short f_short = 96;
   // $VF: renamed from: O byte
   byte O_byte;
   // $VF: renamed from: P byte
   byte P_byte;
   // $VF: renamed from: b byte[][]
   byte[][] b_byteArr2;
   // $VF: renamed from: c byte[][]
   byte[][] c_byteArr2;
   // $VF: renamed from: a int[][][]
   int[][][] a_intArr3;
   // $VF: renamed from: a boolean[][]
   boolean[][] a_boolArr2;
   // $VF: renamed from: a short[][]
   short[][] a_shortArr2;
   // $VF: renamed from: e byte[]
   byte[] e_byteArr;
   public GameHelper helper;
   // $VF: renamed from: d byte[][]
   byte[][] d_byteArr2;
   // $VF: renamed from: x boolean
   boolean x_bool;
   // $VF: renamed from: e int[]
   int[] e_intArr;
   // $VF: renamed from: f byte[]
   byte[] f_byteArr;
   // $VF: renamed from: g byte[]
   byte[] g_byteArr = new byte[11];
   // $VF: renamed from: h byte[]
   byte[] h_byteArr = new byte[11];
   // $VF: renamed from: i byte[]
   byte[] i_byteArr = new byte[11];
   // $VF: renamed from: e byte[][]
   byte[][] e_byteArr2;
   // $VF: renamed from: a byte[][][]
   byte[][][] a_byteArr3;
   // $VF: renamed from: f byte[][]
   byte[][] f_byteArr2;
   // $VF: renamed from: b byte[][][]
   byte[][][] b_byteArr3;
   // $VF: renamed from: c byte[][][]
   byte[][][] c_byteArr3;
   // $VF: renamed from: U int
   int U_int = 5;
   // $VF: renamed from: V int
   int V_int;
   // $VF: renamed from: g byte[][]
   byte[][] g_byteArr2;
   // $VF: renamed from: h byte[][]
   byte[][] h_byteArr2;
   // $VF: renamed from: i byte[][]
   byte[][] i_byteArr2;
   // $VF: renamed from: a javax.microedition.lcdui.Image[][]
   Image[][] spriteImages;
   // $VF: renamed from: b short[][]
   short[][] b_shortArr2;
   // $VF: renamed from: j byte[][]
   byte[][] j_byteArr2;
   // $VF: renamed from: W int
   int W_int;
   // $VF: renamed from: X int
   int X_int;
   // $VF: renamed from: b int[][]
   int[][] b_intArr2;
   // $VF: renamed from: Y int
   int Y_int;
   // $VF: renamed from: Q byte
   byte Q_byte;
   // $VF: renamed from: R byte
   byte R_byte;
   // $VF: renamed from: S byte
   byte S_byte;
   // $VF: renamed from: Z int
   int Z_int;
   // $VF: renamed from: aa int
   int aa_int;
   // $VF: renamed from: ab int
   int ab_int;
   // $VF: renamed from: T byte
   byte T_byte;
   // $VF: renamed from: U byte
   byte U_byte;
   // $VF: renamed from: V byte
   byte V_byte = 4;
   // $VF: renamed from: y boolean
   boolean y_bool;
   // $VF: renamed from: W byte
   byte W_byte;
   // $VF: renamed from: ac int
   int ac_int = 1000;
   // $VF: renamed from: z boolean
   boolean z_bool;
   // $VF: renamed from: A boolean
   boolean A_bool;
   // $VF: renamed from: B boolean
   boolean B_bool;
   // $VF: renamed from: C boolean
   boolean C_bool;
   // $VF: renamed from: ad int
   int ad_int;
   // $VF: renamed from: ae int
   int ae_int;
   // $VF: renamed from: af int
   int af_int;
   // $VF: renamed from: ag int
   int ag_int;
   // $VF: renamed from: ah int
   int ah_int;
   // $VF: renamed from: ai int
   int ai_int;
   // $VF: renamed from: aj int
   int aj_int;
   // $VF: renamed from: ak int
   int ak_int;
   // $VF: renamed from: D boolean
   boolean D_bool;
   // $VF: renamed from: X byte
   byte X_byte;
   // $VF: renamed from: al int
   int al_int = -1;
   // $VF: renamed from: am int
   int am_int;
   // $VF: renamed from: an int
   int an_int;
   // $VF: renamed from: ao int
   int ao_int;
   // $VF: renamed from: ap int
   int ap_int;
   // $VF: renamed from: aq int
   int aq_int;
   // $VF: renamed from: ar int
   int ar_int;
   // $VF: renamed from: Y byte
   byte Y_byte;
   // $VF: renamed from: as int
   int as_int;
   // $VF: renamed from: at int
   int at_int;
   // $VF: renamed from: au int
   int au_int;
   // $VF: renamed from: av int
   int av_int;
   // $VF: renamed from: aw int
   int aw_int;
   // $VF: renamed from: ax int
   int ax_int;
   // $VF: renamed from: ay int
   int ay_int;
   // $VF: renamed from: az int
   int az;
   // $VF: renamed from: Z byte
   byte Z_byte;
   // $VF: renamed from: aa byte
   byte aa_byte;
   // $VF: renamed from: ab byte
   byte ab_byte;
   // $VF: renamed from: ac byte
   byte ac_byte;
   // $VF: renamed from: aA int
   int aA;
   // $VF: renamed from: E boolean
   boolean E_bool;
   // $VF: renamed from: ad byte
   byte ad_byte;
   // $VF: renamed from: a boolean[]
   boolean[] a_boolArr = new boolean[20];
   // $VF: renamed from: b boolean[]
   boolean[] b_boolArr = new boolean[20];
   // $VF: renamed from: c boolean[]
   boolean[] c_boolArr = new boolean[9];
   // $VF: renamed from: d boolean[]
   boolean[] d_boolArr = new boolean[9];
   // $VF: renamed from: F boolean
   boolean F_bool;
   // $VF: renamed from: j byte[]
   byte[] j_byteArr = new byte[8];
   // $VF: renamed from: k byte[]
   byte[] k_byteArr;
   // $VF: renamed from: d short[]
   short[] d_shortArr;
   // $VF: renamed from: aB int
   int aB;
   // $VF: renamed from: aC int
   int aC;
   // $VF: renamed from: aD int
   int aD;
   // $VF: renamed from: aE int
   int aE;
   // $VF: renamed from: aF int
   int aF;
   // $VF: renamed from: aG int
   int aG;
   // $VF: renamed from: aH int
   int aH;
   // $VF: renamed from: aI int
   int aI;
   // $VF: renamed from: ae byte
   byte ae_byte;
   // $VF: renamed from: G boolean
   boolean G_bool;
   // $VF: renamed from: af byte
   static byte af_byte;
   // $VF: renamed from: f int[]
   int[] f_intArr = new int[]{0, 5251341, 16704820, 16033043, 12010496};
   // $VF: renamed from: l byte[]
   byte[] l_byteArr = new byte[]{0, 1, 1, 1, 1};
   // $VF: renamed from: m byte[]
   byte[] m_byteArr = new byte[]{0, 1, 1, 2, 3};
   // $VF: renamed from: n byte[]
   byte[] n_byteArr = new byte[]{100, 98, 0, 0, 0};
   // $VF: renamed from: o byte[]
   byte[] o_byteArr = new byte[]{5, 3, 1, 1, 1};
   // $VF: renamed from: ag byte
   static byte ag_byte = 40;
   // $VF: renamed from: ah byte
   static byte ah_byte = 47;
   // $VF: renamed from: aJ int
   int aJ;
   // $VF: renamed from: aK int
   int aK;
   // $VF: renamed from: aL int
   int aL;
   // $VF: renamed from: aM int
   int aM;
   // $VF: renamed from: H boolean
   boolean H_bool;
   // $VF: renamed from: I boolean
   boolean I_bool;
   // $VF: renamed from: aN int
   int aN;
   // $VF: renamed from: aO int
   int aO;
   // $VF: renamed from: aP int
   int aP;
   // $VF: renamed from: ai byte
   byte ai_byte;
   // $VF: renamed from: aQ int
   int aQ;
   // $VF: renamed from: aj byte
   byte aj_byte;
   // $VF: renamed from: ak byte
   byte ak_byte;
   // $VF: renamed from: al byte
   byte al_byte;
   // $VF: renamed from: am byte
   byte am_byte;
   // $VF: renamed from: an byte
   byte an_byte;
   // $VF: renamed from: aR int
   int aR;
   // $VF: renamed from: p byte[]
   byte[] p_byteArr = new byte[40];
   // $VF: renamed from: aS int
   int aS;
   // $VF: renamed from: ao byte
   byte ao_byte;
   // $VF: renamed from: J boolean
   boolean J_bool;
   // $VF: renamed from: K boolean
   boolean K_bool;
   // $VF: renamed from: ap byte
   byte ap_byte;
   // $VF: renamed from: L boolean
   boolean L_bool;
   // $VF: renamed from: M boolean
   boolean M_bool;
   // $VF: renamed from: N boolean
   boolean N_bool;
   // $VF: renamed from: O boolean
   boolean O_bool;
   // $VF: renamed from: aq byte
   byte aq_byte = 2;
   // $VF: renamed from: q byte[]
   byte[] q_byteArr = new byte[2];
   // $VF: renamed from: P boolean
   boolean P_bool;
   // $VF: renamed from: Q boolean
   boolean Q_bool;
   // $VF: renamed from: R boolean
   boolean R_bool;
   // $VF: renamed from: ar byte
   byte ar_byte;
   // $VF: renamed from: as byte
   byte as_byte = 3;
   // $VF: renamed from: aT int
   static int aT;
   // $VF: renamed from: aU int
   static int aU;
   // $VF: renamed from: aV int
   int aV;
   // $VF: renamed from: aW int
   int aW;
   // $VF: renamed from: aX int
   int aX;
   // $VF: renamed from: aY int
   int aY;
   // $VF: renamed from: at byte
   byte at_byte;
   // $VF: renamed from: au byte
   byte au_byte;
   // $VF: renamed from: av byte
   byte av_byte;
   // $VF: renamed from: S boolean
   boolean S_bool;
   // $VF: renamed from: r byte[]
   byte[] r_byteArr;
   // $VF: renamed from: s byte[]
   byte[] s_byteArr;
   // $VF: renamed from: T boolean
   boolean T_bool;
   // $VF: renamed from: U boolean
   boolean U_bool;
   // $VF: renamed from: V boolean
   boolean V_bool;
   // $VF: renamed from: aw byte
   byte aw_byte = 2;
   // $VF: renamed from: t byte[]
   byte[] t_byteArr;
   // $VF: renamed from: aZ int
   int aZ;
   // $VF: renamed from: ba int
   int ba;
   // $VF: renamed from: ax byte
   byte ax_byte;
   // $VF: renamed from: u byte[]
   byte[] u_byteArr = new byte[10];
   // $VF: renamed from: k byte[][]
   byte[][] k_byteArr2 = new byte[3][10];
   // $VF: renamed from: g int[]
   int[] g_intArr = new int[10];
   // $VF: renamed from: ay byte
   byte ay_byte;
   // $VF: renamed from: h int[]
   int[] h_intArr;
   // $VF: renamed from: v byte[]
   byte[] v_byteArr;
   // $VF: renamed from: bb int
   int bb;
   // $VF: renamed from: bc int
   int bc;
   // $VF: renamed from: bd int
   int bd;
   // $VF: renamed from: be int
   int be;
   // $VF: renamed from: b java.lang.String
   String b_obj_String = "t";
   // $VF: renamed from: W boolean
   boolean W_bool;
   // $VF: renamed from: X boolean
   boolean X_bool;
   // $VF: renamed from: a java.util.Random
   Random a_obj_Random = new Random(1L);
   // $VF: renamed from: Y boolean
   boolean Y_bool = false;
   // $VF: renamed from: Z boolean
   boolean Z_bool = false;
   // $VF: renamed from: aa boolean
   boolean aa_bool = false;
   // $VF: renamed from: ab boolean
   boolean ab_bool;
   // $VF: renamed from: ac boolean
   boolean ac_bool;
   // $VF: renamed from: ad boolean
   boolean ad_bool;
   // $VF: renamed from: e short[]
   static short[] e_shortArr;
   // $VF: renamed from: f short[]
   static short[] f_shortArr;
   // $VF: renamed from: w byte[]
   static byte[] w_byteArr;
   // $VF: renamed from: i int[]
   int[] i_intArr;
   // $VF: renamed from: j int[]
   int[] j_intArr;
   // $VF: renamed from: ae boolean
   boolean ae_bool;
   // $VF: renamed from: af boolean
   boolean af_bool;
   // $VF: renamed from: ag boolean
   boolean ag_bool;

   public GameResources(MainMIDlet midletRef1) {
      this.setFullScreenMode(true);
      this.midlet = midletRef1;
   }

   // $VF: renamed from: a () void
   public final void a_void() {
      new Thread(this).start();
   }

   // $VF: renamed from: b () void
   public final void b_void() {
      this.b_bool = false;
      this.z_bool = false;
      this.aR();
      this.midlet.notifyDestroyed();
   }

   // $VF: renamed from: f () void
   private void f_void() {
      this.engine = new GameEngine();
      System.gc();
      Thread.yield();
      new GameData(this);
      this.helper = new GameHelper(this);
      af_byte = 98;
      this.a_void10(0);
      this.midlet.display.setCurrent(this);
      this.y_bool = true;
   }

   // $VF: renamed from: g () void
   private void g_void() {
      System.gc();
      Thread.yield();
      this.g_byteArr2 = new byte[this.P_byte + 3][this.O_byte];
      this.h_byteArr2 = new byte[13][101];
      this.i_byteArr2 = new byte[13][101];
      this.a_intArr3 = new int[2][3][96];
      this.a_boolArr2 = new boolean[this.P_byte + 3][this.O_byte];
      System.gc();
      Thread.yield();
      this.a_byteArr2 = new byte[5][50];
      this.a_shortArr2 = new short[2][26];
      this.d_byteArr2 = new byte[7][10];
      this.e_intArr = new int[]{14680064, 14999808, 55808, 55808};
      this.f_byteArr = new byte[12];
      this.e_byteArr2 = new byte[3][30];
      this.a_byteArr3 = new byte[2][10][12];
      this.f_byteArr2 = new byte[4][30];
      this.b_byteArr3 = new byte[2][5][30];
      this.c_byteArr3 = new byte[2][5][5];
      System.gc();
      Thread.yield();
      this.b_intArr2 = new int[][]{
         {7250486, 11637795, 2652080, 2454300, 3881776, 4605510, 16766976, 14352640, 10966528, 16750080, 7406848, -1},
         {5276696, 8810262, 678290, 480512, 1907986, 2631720, 16766976, -1, -1, 16750080, 5439488, -1}
      };
      this.k_byteArr = new byte[107];
      this.d_shortArr = new short[107];
      this.r_byteArr = new byte[50];
      this.s_byteArr = new byte[100];
      System.gc();
      Thread.yield();
      this.engine.a_byteArr3 = new byte[2][101][65];
      this.engine.b_byteArr3 = new byte[2][22][5];
      this.engine.c_byteArr3 = new byte[5][6][6];
      this.engine.a_byteArr2 = new byte[5][50];
      this.engine.c_byteArr = new byte[2];
      this.engine.d_byteArr = new byte[6];
      this.engine.e_byteArr = new byte[3];
      this.engine.f_byteArr = new byte[3];
      this.engine.d_byteArr3 = new byte[3][2][96];
      this.engine.g_byteArr = new byte[3];
      this.engine.e_byteArr3 = new byte[2][3][10];
      this.engine.h_byteArr = new byte[10];
      this.engine.c_byteArr2 = new byte[6][10];
      this.engine.a_boolArr = new boolean[3];
      this.engine.d_byteArr2 = new byte[2][50];
      this.engine.d_shortArr = new short[6];
      this.engine.i_byteArr = new byte[8];
      this.engine.e_byteArr2 = new byte[4][8];
      this.engine.f_byteArr2 = new byte[2][10];
      this.engine.g_byteArr2 = new byte[3][20];
      this.engine.j_byteArr = new byte[50];
      this.engine.k_byteArr = new byte[4];
      this.i_intArr = new int[6];
      this.j_intArr = new int[]{98, 118, 121, 110, 114};
      this.t_byteArr = new byte[3];
   }

   // $VF: renamed from: run () void
   public final void run() {
      try {
         this.f_void();
         this.g_void();
         this.engine.a_void(this);
         if (!this.d_bool2(0)) {
            this.d_bool2(1);
            this.d_bool2(2);
         }

         this.Q_byte = 14;
         this.v_byte = 0;
         this.H_bool = true;
         this.R_byte = this.U_byte;
         this.v_int = 59;
         this.c_int = -1;
         this.k_byteArr[55] = -1;
         this.a_intArr2[0][3] = -1000;
         this.aa_bool = true;
         this.b_bool = true;
         this.i_void();

         while (true) {
            if (!this.b_bool) {
               return;
            }

            long timeValue1 = a_long();
            this.aS();
            this.h_void();
            if (!this.b_bool) {
               break;
            }

            this.m_void();
            this.l_void();

            while (this.z_bool && !this.Z_bool) {
               Thread.yield();
            }

            long timeValue2 = a_long() - timeValue1;
            if ((timeValue2 = this.i_int - timeValue2) < 0L || timeValue2 > this.i_int) {
               timeValue2 = 0L;
            }

            MainMIDlet.a((int)timeValue2);
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: h () void
   private void h_void() {
      this.i_int = this.c_bool ? 50 : this.j_int;
      this.k_int = this.j_int / this.i_int;
      this.e_int++;
      if (this.e_int >= 6) {
         this.E_bool = false;
         this.q_bool = false;
      }

      if (this.e_int >= 8) {
         this.e_int = 0;
      }

      Thread.yield();
      if (this.v_byte == 0) {
         this.ak();
         this.o_bool = false;
      } else if (this.v_byte == 1) {
         if (this.i_byte == 0) {
            this.i_byte = -1;
            if (this.w_byte != 3 && !this.a_boolArr[6] && !this.a_boolArr[8] && !this.a_boolArr[7]) {
               if (this.a_boolArr[0]) {
                  this.m_byte = 0;
               } else if (this.a_boolArr[4]) {
                  this.m_byte = 1;
                  if (this.a_byteArr[this.a_shortArr[296] + this.engine.g_byte] == 3) {
                     this.engine.J_byte = (byte)(120 - this.a_byteArr[this.a_shortArr[298] + this.engine.g_byte]);
                  }
               }

               this.v_byte = 0;
               this.l_void2(this.a_byteArr[this.a_shortArr[305] + this.a_byteArr[this.a_shortArr[306] + this.m_byte] + 0]);
               this.Q_byte = 25;
               this.R_byte = 28;
               this.Z_int = 0;
               this.H_bool = true;
               this.z_byte = this.y_byte;
               this.B_byte = this.A_byte;
               this.J_byte = this.I_byte;
               this.L_byte = this.K_byte;
            }
         } else if (this.w_byte != 2 && this.w_byte != 4) {
            this.V();
            this.o_bool = false;
            this.k_void();
         } else {
            this.ae();
            this.o_bool = false;
         }

         if (this.v_byte == 1) {
            this.d_int++;
            if (this.d_int > 5) {
               this.d_int = 0;
               this.a_void19((byte)100, (byte)0, (byte)0, (byte)0);
            }

            if (this.E_byte <= 4) {
               this.E_byte++;
            } else if (this.E_byte >= 0) {
               this.n_int = 0;
            }

            this.j_byte++;
            this.j_void();
            if (this.P_bool && this.w_byte != 4 && this.w_byte != 3) {
               this.Z();
            }

            this.P_bool = false;
         }
      }

      this.g_int++;
      this.f_int++;
      if (this.f_int >= 120) {
         this.f_int = 0;
      }

      if (this.o_int < 3) {
         this.o_int++;
         this.n_bool = true;
      } else if (this.o_int == 3) {
         this.o_int++;
         this.i_void();
         this.n_bool = false;
      }

      if (this.k_bool) {
         this.k_bool = false;
         this.s_int = 0;
         this.l_void2(-1);
         this.P_bool = false;
         this.a_void17(true, true, false, false);
         this.F_bool = false;
         this.w_byte = 0;
         this.k_byte = 0;
         this.q_int = 0;
         this.B_int = this.C_int = this.D_int = this.E_int = 0;
         this.F_byte = -1;
         this.aI();
         this.u_bool = false;
         this.t_bool = false;
         this.i_void();
      }

      if (this.p_bool) {
         this.p_bool = false;
         this.i_void();
      }

      this.p_int++;
   }

   // $VF: renamed from: i () void
   private void i_void() {
      m_bool = false;
      l_bool = false;
      this.e_bool = this.f_bool = this.g_bool = this.h_bool = false;
      this.i_bool = this.v_bool = false;
      this.E_byte = 4;
      this.w_bool = false;
      this.i_byte = -1;
      this.t_bool = false;
      this.n_int = 0;
   }

   // $VF: renamed from: j () void
   private void j_void() {
      try {
         this.engine.g_void2();
         this.engine.e_void2();
         this.engine.h_void2();
         this.engine.i_void2();
      } catch (Exception ignoredException1) {
      }

      this.c_int++;
      this.h_int++;
      if (this.h_int >= 100) {
         int intValue1;
         if ((intValue1 = this.h_int - 100) >= this.d_short - 1) {
            this.h_int = 0;
         }

         for (int loopIndex1 = 0; loopIndex1 < this.c_short; loopIndex1++) {
            if (this.c_byteArr2[intValue1][loopIndex1] <= -114 && this.c_byteArr2[intValue1][loopIndex1] > -117) {
               this.c_byteArr2[intValue1][loopIndex1] = 0;
               this.c_void7(loopIndex1, intValue1, 1, 1);
            }
         }
      }

      if (this.u_byte > 0 && this.v_byte == 1) {
         this.u_byte++;
         if (this.u_byte == 41 || this.u_byte == 90) {
            this.v_byte = 0;
            this.Q_byte = 24;
            this.H_bool = true;
            this.v_int = 56 + 41 / this.u_byte;
            this.o_byte = (byte)(11 - 41 / this.u_byte);
            this.o_int = 0;
         }
      }
   }

   // $VF: renamed from: k () void
   private void k_void() {
      int intValue1 = this.I_byte + this.y_byte;
      int intValue2 = this.K_byte + this.A_byte;

      try {
         byte byteValue1 = this.c_byteArr2[intValue2][intValue1];
         if (this.u_bool || byteValue1 <= -1 && byteValue1 >= -30) {
            this.W_byte = 0;
            return;
         }

         boolean flag1 = false;
         if ((byteValue1 < 51 || this.w_byte != 1) && (byteValue1 < 1 || byteValue1 > 50)) {
            for (int loopIndex1 = -1; loopIndex1 <= 1; loopIndex1++) {
               for (int loopIndex2 = -1; loopIndex2 <= 1; loopIndex2++) {
                  if (intValue1 + loopIndex2 >= 0
                     && intValue2 + loopIndex1 >= 0
                     && intValue1 + loopIndex2 < this.c_short
                     && intValue2 + loopIndex1 < this.d_short
                     && ((byteValue1 = this.c_byteArr2[intValue2 + loopIndex1][intValue1 + loopIndex2]) >= 51 && this.w_byte == 1 || byteValue1 >= 1 && byteValue1 <= 50)) {
                     int intValue3 = this.e_byteArr[202 + byteValue1];
                     int intValue4 = this.e_byteArr[303 + byteValue1];
                     intValue4 = loopIndex1 < 0 ? 16 - intValue4 : (loopIndex1 == 0 ? 0 : 16 + intValue4);
                     int intValue5;
                     intValue3 = (intValue5 = loopIndex2 < 0 ? 22 - intValue3 : (loopIndex2 == 0 ? 0 : 22 + intValue3)) * intValue5;
                     int intValue6;
                     int intValue7 = ((intValue6 = intValue4 * intValue4) + intValue3) / 2;
                     if (this.W_byte == byteValue1 && (intValue7 < 13 || byteValue1 <= 50)) {
                        this.ac_int = intValue7;
                        flag1 = true;
                     }

                     if (intValue7 < this.ac_int && (intValue7 < 13 || byteValue1 <= 50)) {
                        this.ac_int = intValue7;
                        this.W_byte = byteValue1;
                        flag1 = true;
                     }
                  }
               }
            }

            if (!flag1) {
               this.W_byte = 0;
               this.ac_int = 1000;
            }
         } else {
            this.W_byte = byteValue1;
         }

         if (this.W_byte < 50 && this.w_byte == 1) {
            this.W_byte = 0;
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: l () void
   private void l_void() {
      this.z_bool = true;
      this.repaint();
      Thread.yield();
   }

   protected final void paint(Graphics graphics1) {
      int screenWidth = this.getWidth();
      int screenHeight = this.getHeight();
      boolean needsScaling = screenWidth > 0 && screenHeight > 0 && (screenWidth != 320 || screenHeight != 240);
      Graphics renderGraphics = graphics1;
      if (needsScaling) {
         if (this.screenScaleBuffer == null) {
            this.screenScaleBuffer = Image.createImage(320, 240);
            this.screenScaleGraphics = this.screenScaleBuffer.getGraphics();
         }

         renderGraphics = this.screenScaleGraphics;
         renderGraphics.setColor(16777215);
         renderGraphics.fillRect(0, 0, 320, 240);
      }

      if (this.v_byte == 1) {
         a_bool6(renderGraphics, frameBuffers[this.c_byteArr[1]], 0, 0, 320, this.A_int, this.a_short - 0, this.b_short - 0 + this.ba - this.ax_byte, 0);

         for (byte byteIndex1 = 0; byteIndex1 < 20; byteIndex1++) {
            if (this.a_boolArr[byteIndex1]) {
               a_bool6(
                  renderGraphics,
                  frameBuffers[this.c_byteArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]]],
                  0,
                  this.c_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]],
                  this.a_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]] + 0,
                  this.b_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]],
                  this.a_short - 0,
                  this.b_short + this.d_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]] + 0,
                  0
               );
            }
         }
      } else {
         a_bool6(renderGraphics, frameBuffers[M_byte], 0, 0, 320, 240, this.a_short - 0, this.b_short - 0 + 0, 0);
         if (this.s_bool && !this.J_bool && this.aN < 0) {
            renderGraphics.setColor(0);
            b_void8(renderGraphics, this.a_short - 0, this.b_short - 0 + 0, 320, 16 + -this.aN);
            b_void8(renderGraphics, this.a_short - 0, this.b_short - 0 + 16 + 240 - -this.aN + 0, 320, -this.aN);
         }
      }

      if (needsScaling) {
         GameCanvas.drawScaledImage(graphics1, this.screenScaleBuffer, 0, 0, screenWidth, screenHeight);
      }

      this.z_bool = false;
   }

   // $VF: renamed from: m () void
   private void m_void() {
      if (this.v_byte != 1) {
         if (this.v_byte == 0) {
            this.F();
         }
      } else {
         this.N_byte = this.c_byteArr[1];
         this.n();
         this.w();
         this.u();
         this.c_void(this.y_byte * 22, this.A_byte * 16);
         this.S_bool = false;

         for (byte byteIndex1 = 0; byteIndex1 < 20; byteIndex1++) {
            if (this.a_boolArr[byteIndex1]) {
               this.a_void8(byteIndex1, 0, this.c_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]] - 0);
               this.N_byte = this.c_byteArr[1];
               if (byteIndex1 == 8 || byteIndex1 == 7) {
                  int intValue1 = this.b_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]]
                     - 55
                     + this.d_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]]
                     + 11;
                  this.a_void7(560, this.a_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]] - 68, intValue1);
               }

               if (this.a_byteArr[this.a_shortArr[195] + 20 + byteIndex1] == 1) {
                  this.a_void7(526, 0, this.ax_byte);
               } else if (this.a_byteArr[this.a_shortArr[195] + 20 + byteIndex1] == 2) {
                  this.a_void7(532, 0, 240 - this.ba - this.aZ + this.ax_byte);
               }
            }
         }
      }
   }

   // $VF: renamed from: n () void
   private void n() {
      try {
         if (this.ae_int != 0 && this.ad_int != 0) {
            this.A_bool = true;
         }

         this.ah_int = 0;
         this.ai_int = 0;
         if (this.A_bool) {
            this.A_bool = false;
            this.C_bool = false;
            this.aj_int = this.O_byte - 1;
            this.ak_int = this.P_byte - 1;
            this.ad_int = this.ae_int = 0;
            this.o();
         } else {
            this.ag_int = 0;
            this.ak_int = -1;
            if (this.ad_int != 0) {
               this.ah_int = -this.ad_int * 22;
            } else if (this.ae_int != 0) {
               this.ai_int = -this.ae_int * 16;
            }

            a_bool6(frameGraphics[this.c_byteArr[1]], frameBuffers[this.c_byteArr[0]], 0, 0, 350, this.A_int, this.ah_int, this.ai_int, 0);
            if (this.ad_int != 0) {
               this.ah_int = ((this.ad_int - 2) / 2 + 1) * (this.O_byte - 1);
               this.aj_int = this.ah_int;
               this.ai_int = 0;
               this.ak_int = this.P_byte - 1;
               this.ad_int = 0;
               this.o();
            }

            if (this.ae_int != 0) {
               this.ai_int = ((this.ae_int - 2) / 2 + 1) * (this.P_byte - 1);
               this.ak_int = this.ai_int;
               this.ah_int = 0;
               this.aj_int = this.O_byte - 1;
               this.ae_int = 0;
               this.o();
            }

            if (this.C_bool) {
               this.C_bool = false;
               this.ah_int = 0;
               this.aj_int = this.O_byte - 1;
               this.ai_int = this.P_byte - 1 - 3;
               this.ak_int = this.P_byte - 1;
               this.o();
            }

            if (this.B_bool) {
               this.B_bool = false;
               this.ah_int = 0;
               this.aj_int = this.O_byte - 1;
               this.ai_int = 0;
               this.ak_int = this.P_byte - 1;
               this.D_bool = true;
               this.o();
               this.D_bool = false;
            }
         }

         if (this.ak_int != -1 && !this.s_bool) {
            a_bool6(frameGraphics[this.c_byteArr[0]], frameBuffers[this.c_byteArr[1]], 0, 0, 350, this.A_int, 0, 0, 0);
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: o () void
   private void o() {
      for (this.ag_int = this.ai_int; this.ag_int <= this.ak_int; this.ag_int++) {
         for (this.af_int = this.ah_int; this.af_int <= this.aj_int; this.af_int++) {
            if (this.D_bool) {
               if (!this.a_boolArr2[this.ag_int][this.af_int]) {
                  continue;
               }

               this.a_boolArr2[this.ag_int][this.af_int] = false;
            }

            if (!this.s_bool || this.b_bool4(this.af_int + this.I_byte, this.ag_int + this.K_byte)) {
               int intValue1;
               if ((intValue1 = this.b_byteArr2[this.ag_int + this.K_byte][this.af_int + this.I_byte] & 255) < 175) {
                  this.a_void7(intValue1, this.af_int * 22, this.ag_int * 16);
               } else {
                  this.a_void2(intValue1, (byte)0);
               }

               byte byteValue1;
               if ((byteValue1 = this.c_byteArr2[this.ag_int + this.K_byte][this.af_int + this.I_byte]) < 0 && byteValue1 >= -123) {
                  this.a_void2(byteValue1, (byte)0);
               }
            }
         }
      }
   }

   // $VF: renamed from: a (int, byte) void
   private void a_void2(int intValue1, byte byteValue1) {
      int intValue2 = -intValue1;
      int intValue3 = 0;
      byte byteValue2 = 0;
      byte byteValue3 = 0;
      int intValue4 = 0;
      int intValue5 = 0;
      int intValue6 = this.af_int * 22;
      int intValue7 = this.ag_int * 16;
      if (b_byte2(intValue1) != 2) {
         intValue3 = this.e_byteArr[8749 + intValue2];
         byteValue2 = this.a_byteArr[this.a_shortArr[138] + 104 + intValue3];
         byteValue3 = this.e_byteArr[9115 + intValue2];
         intValue4 = this.af_int + this.I_byte - this.e_byteArr[8383 + intValue2];
         intValue5 = this.ag_int + this.K_byte - this.e_byteArr[8444 + intValue2];
         intValue6 -= intValue4 * 22;
         intValue7 -= intValue5 * 16;
         this.N_int = this.b_shortArr2[0][intValue3 + 1];
         this.O_int = this.j_byteArr2[0][intValue3 + 1];
         if (byteValue1 == 0) {
            int intValue8 = 0;
            int intValue9 = byteValue2 * intValue5 + intValue4;

            while (true) {
               if ((this.j_byteArr2[3][this.N_int] & 255) >> 6 == 0) {
                  if (intValue8 == intValue9) {
                     break;
                  }

                  intValue8++;
               }

               if ((this.j_byteArr2[3][this.N_int] & 7) != 0) {
                  break;
               }

               this.N_int++;
               this.O_int--;
            }
         } else {
            for (byte byteIndex1 = this.e_byteArr[8993 + intValue2]; byteIndex1 > 0; byteIndex1 = this.e_byteArr[4545 + byteIndex1]) {
               this.g_byteArr[this.e_byteArr[4646 + byteIndex1]] = (byte)byteIndex1;
            }
         }
      } else if (c_bool3(intValue1)) {
         intValue2 -= 61;
         intValue3 = this.e_byteArr[9833 + intValue2];
         byteValue3 = this.e_byteArr[9933 + intValue2];
         this.N_int = this.b_shortArr2[0][intValue3 + 27 - 1];
         this.O_int = this.j_byteArr2[0][intValue3 + 27 - 1];
      } else if (c_byte2(intValue1) != 2) {
         if (c_byte2(intValue1) != 3) {
            this.g_byteArr[0] = this.c_byteArr2[this.K_byte + this.ag_int][this.I_byte + this.af_int];
            if (c_byte2(this.g_byteArr[0]) != 2) {
               if (c_byte2(this.g_byteArr[0]) == 1) {
                  byteValue1 = -1;
               }

               intValue3 = 20 - (this.g_byteArr[0] + 111);
               byteValue3 = 1;
            } else if (c_byte2(this.e_byteArr[4545 + this.g_byteArr[0]]) != 2) {
               intValue3 = 20 - (this.e_byteArr[4545 + this.g_byteArr[0]] + 111);
               byteValue3 = 2;
            }

            while (intValue3 > 22) {
               intValue3 -= 3;
            }
         } else {
            intValue3 = 23;
            byteValue3 = 0;
         }

         this.N_int = this.b_shortArr2[0][intValue3 + 1];
         this.O_int = this.j_byteArr2[0][intValue3 + 1];
         intValue2 = 0;
      } else if (intValue1 >= 1000) {
         intValue6 = this.S_int;
         intValue7 = this.T_int;
         intValue3 = intValue1 - 1000;
         this.N_int = this.b_shortArr2[0][intValue3];
         this.O_int = this.j_byteArr2[0][intValue3];
         if (this.v_byte == 0) {
            this.g_byteArr[0] = 1;
            this.g_byteArr[1] = 2;
            this.g_byteArr[2] = 3;
            this.e_byteArr[2930] = 39;
            this.e_byteArr[2931] = 42;
            this.e_byteArr[2932] = 42;
            this.e_byteArr[607] = 1;
            this.e_byteArr[608] = 0;
            this.e_byteArr[609] = 6;
            this.e_byteArr[1415] = 25;
            this.e_byteArr[1416] = 45;
            this.e_byteArr[1417] = 70;
            this.e_byteArr[3031] = (byte)(this.f_int % 8);
            this.e_byteArr[3032] = (byte)(this.f_int % 8);
            this.e_byteArr[3033] = (byte)(this.f_int % 10);
            this.e_byteArr[5152] = 8;
            this.e_byteArr[6566] = 9;
            this.e_byteArr[5153] = 5;
            this.e_byteArr[6567] = 2;
            this.e_byteArr[5154] = 10;
            this.e_byteArr[6568] = 0;
            this.e_byteArr[1314] = this.e_byteArr[1315] = this.e_byteArr[1316] = 0;
            this.e_byteArr[6465] = this.e_byteArr[6466] = this.e_byteArr[6467] = 0;
         }

         byteValue3 = 0;
         intValue2 = 0;
      } else if (intValue1 >= 175) {
         intValue3 = intValue1 - 180 + 34;
         this.N_int = this.b_shortArr2[0][intValue3];
         this.O_int = this.j_byteArr2[0][intValue3];
         intValue7 += this.aO;
         byteValue3 = 0;
         intValue2 = 0;
      }

      if (byteValue1 == 0) {
         do {
            this.P_int = (this.j_byteArr2[3][this.N_int] & 255) >> 6;
            if (this.P_int <= byteValue3) {
               this.a_void7(
                  this.b_shortArr2[1][this.N_int] & 4095,
                  (this.af_int - intValue4) * 22 + this.j_byteArr2[1][this.N_int],
                  (this.ag_int - intValue5) * 16 + this.j_byteArr2[2][this.N_int]
               );
            }

            this.N_int++;
         } while ((this.j_byteArr2[3][this.N_int] & 7) == 0 && (this.j_byteArr2[3][this.N_int] & 255) >> 6 != 0);
      } else {
         this.a_void3(intValue2, byteValue3, (byte)intValue3, intValue6, intValue7, byteValue1);
      }

      for (byte byteIndex2 = 0; byteIndex2 < 8; byteIndex2++) {
         this.g_byteArr[byteIndex2] = this.h_byteArr[byteIndex2] = this.i_byteArr[byteIndex2] = 0;
      }
   }

   // $VF: renamed from: a (int, byte, byte, int, int, byte) void
   private void a_void3(int intValue1, byte byteValue1, byte byteValue2, int intValue2, int intValue3, byte byteValue3) {
      int intValue4 = 0;
      int intValue5 = this.f_int;
      byte byteValue4 = 0;
      this.U_int = 0;

      try {
         for (int loopIndex1 = 0; loopIndex1 < this.O_int; loopIndex1++) {
            int intValue6 = this.j_byteArr2[3][this.N_int] & 7;
            byteValue4 = (byte)((this.j_byteArr2[3][this.N_int] & 63) >> 3);
            this.P_int = (this.j_byteArr2[3][this.N_int] & 255) >> 6;
            this.X_byte = this.g_byteArr[byteValue4];
            boolean flag1 = false;
            int intValue7 = (this.b_shortArr2[1][this.N_int] & '쀀') >> 14 << 7;
            if (intValue6 == 0 && byteValue3 == 2 && this.P_int == byteValue1) {
               this.a_void7(
                  this.b_shortArr2[1][this.N_int] & 4095, intValue2 + this.j_byteArr2[1][this.N_int] + intValue7, intValue3 + this.j_byteArr2[2][this.N_int]
               );
            } else if (intValue6 == 1 && this.P_int <= byteValue1) {
               if (byteValue2 == 6 && this.U_int < 5) {
                  this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[142]]] = (byte)(
                     this.a_shortArr2[0][5] + this.a_shortArr2[0][8] + this.a_shortArr2[0][5] + this.a_shortArr2[0][9] + this.a_shortArr2[0][10]
                  );
                  if (this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[142] + this.U_int]] > 0 || intValue1 >= 31) {
                     this.V_int = this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[142] + this.U_int]] / 7 / (this.U_int == 0 ? 1 : 10);
                     if (this.V_int >= 5 || intValue1 >= 31) {
                        this.V_int = 4;
                     }

                     this.a_void7(
                        (this.b_shortArr2[1][this.N_int] & 4095) + this.V_int,
                        intValue2 + this.j_byteArr2[1][this.N_int] + intValue7,
                        intValue3 + this.j_byteArr2[2][this.N_int]
                     );
                  }

                  this.U_int++;
               } else if (byteValue2 == 4 && this.U_int < 1) {
                  if (intValue1 >= 31) {
                     this.a_void7(
                        (this.b_shortArr2[1][this.N_int] & 4095) + 2,
                        intValue2 + this.j_byteArr2[1][this.N_int] + intValue7,
                        intValue3 + this.j_byteArr2[2][this.N_int]
                     );
                  } else if (this.a_shortArr2[0][0] >= 5) {
                     this.V_int = this.a_shortArr2[0][0] > 35 ? 2 : (this.a_shortArr2[0][0] - 5) / 15;
                     this.a_void7(
                        (this.b_shortArr2[1][this.N_int] & 4095) + this.V_int,
                        intValue2 + this.j_byteArr2[1][this.N_int] + intValue7,
                        intValue3 + this.j_byteArr2[2][this.N_int]
                     );
                  }

                  this.U_int++;
               } else {
                  this.a_void7(
                     this.b_shortArr2[1][this.N_int] & 4095, intValue2 + this.j_byteArr2[1][this.N_int] + intValue7, intValue3 + this.j_byteArr2[2][this.N_int]
                  );
               }
            } else if ((intValue6 == 2 || intValue6 == 4 || intValue6 == 6) && byteValue3 != 2) {
               if (this.P_int == 0 || this.P_int <= byteValue1) {
                  int intValue8 = this.N_int;
                  intValue4 = this.b_shortArr2[1][this.N_int] & 4095;
                  if (intValue6 == 6) {
                     intValue5 += this.K_byte + this.ag_int + this.N_int * 2;

                     while (intValue5 >= 120) {
                        intValue5 -= 120;
                     }

                     if (byteValue4 == 1 || byteValue4 == 2 && (this.e_byteArr[8627 + intValue1] == 1 || this.e_byteArr[8627 + intValue1] == 2)) {
                        if (intValue1 >= 31) {
                           intValue4++;
                        }

                        flag1 = true;
                     } else if (byteValue4 != 2) {
                        flag1 = true;
                     }
                  } else if (this.q_byte == 3 && intValue1 == 31 && byteValue4 == 0) {
                     if (intValue4 == 118 && intValue6 == 4) {
                        flag1 = true;
                        intValue5 = 0;
                     }
                  } else if (intValue6 == 2 && (this.e_byteArr[1313 + this.X_byte] <= 0 || this.e_byteArr[1313 + this.X_byte] >= 50)) {
                     flag1 = true;
                     if (this.e_byteArr[1313 + this.X_byte] == 51) {
                        this.i_byteArr[byteValue4] = 1;
                     }
                  } else if (intValue6 == 4
                     && this.i_byteArr[byteValue4] == 0
                     && this.e_byteArr[1313 + this.X_byte] >= 1
                     && this.e_byteArr[1313 + this.X_byte] != 50) {
                     intValue4 = this.b_shortArr2[1][this.N_int + this.e_byteArr[1313 + this.X_byte] - 1] & 4095;
                     intValue5 = this.e_byteArr[3030 + this.X_byte];
                     flag1 = true;
                     this.i_byteArr[byteValue4] = 1;
                     if (this.e_byteArr[8749 + intValue1] == 2 && this.e_byteArr[1313 + this.X_byte] == 2) {
                        this.d_void(90, intValue2 + this.j_byteArr2[1][intValue8] + intValue7, intValue3 + this.j_byteArr2[2][intValue8], this.f_int);
                     }
                  }

                  if (flag1) {
                     this.d_void(intValue4, intValue2 + this.j_byteArr2[1][intValue8] + intValue7, intValue3 + this.j_byteArr2[2][intValue8], intValue5);
                  }
               }
            } else if ((intValue6 == 3 || intValue6 == 5 || intValue6 == 7) && this.h_byteArr[byteValue4] == 0 && this.X_byte > 0 && byteValue3 != 2) {
               byte byteValue5 = 0;
               if (intValue1 < 31 || (this.e_byteArr[9176 + intValue1] & 3) >= 2) {
                  if (intValue6 == 7 && this.e_byteArr[1313 + this.X_byte] == 50) {
                     flag1 = true;
                  } else if (intValue6 == 3 && this.e_byteArr[1313 + this.X_byte] >= 1 && this.e_byteArr[1313 + this.X_byte] != 50) {
                     switch (byteValue5 = this.a_byteArr[this.a_shortArr[139] + this.a_byteArr[this.a_shortArr[140] + byteValue2] + byteValue4]) {
                        case -1:
                           byteValue5 = this.e_byteArr[606 + this.X_byte];
                        default:
                           flag1 = true;
                     }
                  } else if (intValue6 == 5 && this.e_byteArr[1313 + this.X_byte] <= 0) {
                     flag1 = true;
                     if ((this.e_byteArr[3535 + this.X_byte] != 0 || this.e_byteArr[6565 + this.X_byte] == 1) && byteValue2 != 10 && byteValue2 != 11) {
                        this.x_bool = true;
                     }

                     if (this.v_byte == 0) {
                        byteValue5 = this.e_byteArr[606 + this.X_byte];
                     }
                  }
               }

               if (flag1) {
                  this.a_void4(this.X_byte, intValue2 + this.j_byteArr2[1][this.N_int] + intValue7, intValue3 + this.j_byteArr2[2][this.N_int], byteValue5, (byte)29);
                  this.h_byteArr[byteValue4] = 1;
               }
            }

            this.N_int++;
         }
      } catch (Exception ignoredException1) {
      }

      this.X_byte = 0;
   }

   // $VF: renamed from: a (int, int, int, int, byte) void
   private void a_void4(int intValue1, int intValue2, int intValue3, int intValue4, byte byteValue1) {
      try {
         this.ao_int = intValue1;
         this.ap_int = intValue2;
         this.aq_int = intValue3;
         this.ar_int = intValue4;
         this.Y_byte = byteValue1;
         this.at_int = this.e_byteArr[this.b_shortArr[this.Y_byte] + this.ao_int] & 255;
         int intValue5 = 0;
         if (this.ar_int >= 0) {
            this.ar_int = this.a_byteArr[this.a_shortArr[99] + ((this.b_shortArr2[3][this.at_int] >> 14 & 3) << 3) + this.ar_int];
            intValue5 = (this.b_shortArr2[2][this.at_int] & 4095)
               + this.ar_int * this.j_byteArr2[4][this.at_int]
               + this.e_byteArr[this.b_shortArr[this.Y_byte + 1] + this.ao_int];
            this.as_int = this.b_shortArr2[4][intValue5];
            this.ap_int = this.ap_int + this.j_byteArr2[7][intValue5];
            this.aq_int = this.aq_int + this.j_byteArr2[8][intValue5] + this.aO;
            if (this.x_bool) {
               if (this.at_int != 124) {
                  this.as_int += 48;
                  this.at_int = 1;
               }

               this.x_bool = false;
            }

            if (this.at_int == 141 || this.at_int == 142 || this.at_int == 143 || this.at_int == 144) {
               this.ap_int = this.ap_int + 22 * this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + this.ao_int]];
            }
         } else {
            this.at_int = -this.ar_int;
            if (this.e_byteArr[1414 + this.ao_int] < 12) {
               this.at_int = 14;
               this.aq_int -= 6;
            }

            this.as_int = this.b_shortArr2[4][(this.b_shortArr2[2][this.at_int] & 4095) + 2];
         }

         this.au_int = (this.b_shortArr2[2][this.at_int] & '\uf000') >> 14;
         this.p();
         if (this.v_byte != 0) {
            this.q();
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: p () void
   private void p() {
      this.ay_int = this.b_shortArr2[8][this.as_int];
      this.am_int = -1;
      this.an_int = -1;

      for (this.az = 0; this.az < this.j_byteArr2[15][this.as_int]; this.az++) {
         this.ax_int = this.ay_int + this.az;
         if (this.b_shortArr2[7][this.ax_int] != 0) {
            this.av_int = 0;
            this.aw_int = this.j_byteArr2[14][this.ax_int] & 15;
            if (this.Y_byte == 29) {
               if (!this.a_bool2()) {
                  continue;
               }

               if (this.e_byteArr[1414 + this.ao_int] >= 12) {
                  if (this.ao_int >= 51) {
                     this.al_int = 4;
                  }

                  if (!this.b_bool2()) {
                     continue;
                  }
               } else {
                  if (this.aw_int == 7 && this.e_byteArr[1515 + this.ao_int] == 0) {
                     continue;
                  }

                  if (this.aw_int == 0) {
                     this.an_int = this.ax_int;
                     if (this.ao_int >= 51) {
                        this.av_int++;
                     }
                  } else if (this.aw_int == 9) {
                     this.am_int = this.ax_int;
                     this.av_int = this.e_byteArr[5151 + this.ao_int] & 1;
                  } else if (this.aw_int == 5) {
                     continue;
                  }
               }

               if (this.b_shortArr2[7][this.ax_int] == 1) {
                  continue;
               }
            } else if (this.aw_int == 0) {
               this.am_int = this.an_int = this.ax_int;
            }

            if ((this.j_byteArr2[14][this.ax_int] & 255) >> 7 == 0) {
               this.b_void2(
                  this.b_shortArr2[7][this.ax_int] + this.av_int,
                  this.ap_int + this.j_byteArr2[12][this.ax_int],
                  this.aq_int + this.j_byteArr2[13][this.ax_int]
               );
            } else {
               this.a_void7(
                  this.b_shortArr2[7][this.ax_int] + this.av_int,
                  this.ap_int + this.j_byteArr2[12][this.ax_int],
                  this.aq_int + this.j_byteArr2[13][this.ax_int]
               );
            }

            this.al_int = -1;
         }
      }
   }

   // $VF: renamed from: a () boolean
   private boolean a_bool2() {
      if (this.aw_int == 10 && !this.s_bool && this.v_byte == 1 && this.ar_int > -1) {
         if ((this.e_byteArr[909 + this.ao_int] == 0 || this.e_byteArr[909 + this.ao_int] != this.F_byte)
            && (this.F_byte != -1 || this.k_byte != this.ao_int)) {
            if (this.W_byte == this.ao_int) {
               this.av_int = 1;
               if (this.W_byte >= 51) {
                  this.av_int = 3;
               }
            }
         } else {
            this.a_void7(603, this.ap_int + this.j_byteArr2[12][this.ax_int], this.aq_int + this.j_byteArr2[13][this.ax_int]);
         }

         this.aA = 0;

         for (int loopIndex1 = this.C_int + 1; loopIndex1 <= this.C_int + this.E_int; loopIndex1++) {
            for (int loopIndex2 = this.B_int + 1; loopIndex2 <= this.B_int + this.D_int; loopIndex2++) {
               byte byteValue1;
               if ((byteValue1 = this.c_byteArr2[loopIndex1][loopIndex2]) >= 1 && byteValue1 <= 50 && this.e_byteArr[1919 + byteValue1] > 0) {
                  this.aA++;
                  if (byteValue1 == this.ao_int) {
                     this.av_int = 1;
                  }
               }
            }
         }
      }

      return true;
   }

   // $VF: renamed from: b () boolean
   private boolean b_bool2() {
      if (this.aw_int == 0) {
         this.an_int = this.ax_int;
         this.av_int = 0;
         this.av_int = this.e_byteArr[5151 + this.ao_int] >> 2 & 3;
         if (this.av_int > 1) {
            this.av_int -= 2;
            this.al_int = 0;
         }

         this.av_int *= 72;
         if (this.ao_int >= 51) {
            this.av_int += 36;
         }

         this.av_int = this.av_int + this.e_byteArr[1515 + this.ao_int] * 18;
      } else if (this.aw_int == 9) {
         this.am_int = this.ax_int;
         this.av_int = 0;
         this.av_int = this.e_byteArr[5151 + this.ao_int] & 3;
         if (this.ao_int >= 51) {
            this.al_int = 3;
         } else if (this.av_int > 0) {
            this.al_int = this.av_int;
         }

         this.av_int = this.e_byteArr[1515 + this.ao_int] == 1
            ? 1
            : (this.e_byteArr[1414 + this.ao_int] < 30 ? 3 : (this.e_byteArr[1414 + this.ao_int] < 50 ? 2 : 0));
         this.av_int *= 12;
      } else if (this.aw_int == 7) {
         if (this.ao_int == this.a_shortArr2[0][17]) {
            this.av_int += 2;
         } else {
            if (this.a_byteArr[this.a_shortArr[42] + this.a_byteArr[this.a_shortArr[41] + this.e_byteArr[6464 + this.ao_int]]] == 0) {
               return false;
            }

            this.av_int = this.av_int
               + (this.a_byteArr[this.a_shortArr[42] + this.a_byteArr[this.a_shortArr[41] + this.e_byteArr[6464 + this.ao_int]]] - 1);
         }
      } else if (this.au_int == 0 && this.aw_int >= 5 && this.aw_int <= 8) {
         if (this.ar_int < 0 && this.e_byteArr[6565 + this.ao_int] == 1) {
            return false;
         }

         if ((this.aw_int != 5 || this.e_byteArr[6565 + this.ao_int] != 4) && (this.aw_int != 6 || this.e_byteArr[6565 + this.ao_int] != 5)) {
            if (this.a_byteArr[this.a_shortArr[145] + this.e_byteArr[6565 + this.ao_int]] != this.aw_int) {
               return false;
            }
         } else {
            this.av_int = 1;
         }
      } else if (this.au_int == 2) {
         if (this.e_byteArr[3535 + this.ao_int] != 0) {
            if (this.aw_int != 4
               || this.e_byteArr[3636 + this.ao_int] <= 0
                  && this.at_int != 113
                  && this.at_int != 114
                  && this.at_int != 115
                  && this.at_int != 116) {
               if (this.aw_int == 5) {
                  if (this.e_byteArr[6565 + this.ao_int] == 9) {
                     return false;
                  }

                  this.av_int = this.av_int + this.e_byteArr[6565 + this.ao_int];
               } else if (this.aw_int == 8) {
                  return false;
               }
            } else {
               this.av_int = this.av_int + this.e_byteArr[3535 + this.ao_int];
            }
         } else if (this.e_byteArr[3535 + this.ao_int] == 0) {
            if (this.aw_int == 4) {
               return false;
            }

            if (this.aw_int == 5) {
               if (this.e_byteArr[6565 + this.ao_int] == 1) {
                  return false;
               }

               if (this.e_byteArr[6565 + this.ao_int] == 9) {
                  return false;
               }

               this.av_int = this.av_int + this.e_byteArr[6565 + this.ao_int];
            } else if (this.aw_int == 8 && this.e_byteArr[6565 + this.ao_int] != 1) {
               return false;
            }
         }
      } else if (this.au_int == 1 && this.aw_int == 5) {
         if (this.e_byteArr[6565 + this.ao_int] == 9) {
            return false;
         }

         this.av_int = this.av_int + this.e_byteArr[6565 + this.ao_int];
      }

      return true;
   }

   // $VF: renamed from: q () void
   private void q() {
      if (!this.s_bool && this.am_int >= 0 && this.an_int >= 0 && this.v_byte == 1) {
         this.renderer
            .a_void7(
               this.Y_byte == 29 ? this.ao_int : 101 + this.ao_int,
               this.ap_int + this.j_byteArr2[12][this.am_int] + 4,
               this.aq_int + this.j_byteArr2[13][this.am_int]
            );
         if (this.Y_byte == 29 && this.ar_int > -1) {
            for (int loopIndex1 = 0; loopIndex1 < 30; loopIndex1++) {
               if (this.b_byteArr3[0][2][loopIndex1] == this.ao_int && this.b_byteArr3[0][1][loopIndex1] != 3) {
                  this.d_void(
                     65 + (1 - this.b_byteArr3[0][4][loopIndex1]) * 5 + this.b_byteArr3[0][1][loopIndex1],
                     this.ap_int + this.j_byteArr2[12][this.an_int],
                     this.aq_int + this.j_byteArr2[13][this.an_int],
                     this.f_int
                  );
                  break;
               }
            }

            if (this.e_byteArr[4646 + this.ao_int] == 1 && this.e_byteArr[2828 + this.ao_int] == 51 && this.e_byteArr[1313 + this.ao_int] > 0) {
               this.d_void(65, this.ap_int + this.j_byteArr2[12][this.an_int], this.aq_int + this.j_byteArr2[13][this.an_int], this.f_int);
            }

            if (this.e_byteArr[3333 + this.ao_int] > -1) {
               this.d_void(
                  77 + this.e_byteArr[3333 + this.ao_int],
                  this.ap_int + this.j_byteArr2[12][this.am_int],
                  this.aq_int + this.j_byteArr2[13][this.am_int],
                  (this.c_int - (this.ao_int & 7)) % 15
               );
            }

            if (this.e_byteArr[4646 + this.ao_int] < -1) {
               this.d_void(
                  -this.e_byteArr[4646 + this.ao_int],
                  this.ap_int + this.j_byteArr2[12][this.an_int],
                  this.aq_int + this.j_byteArr2[13][this.an_int],
                  this.e_byteArr[3030 + this.ao_int]
               );
            }

            if ((this.e_byteArr[7979 + this.ao_int] & 4) == 4) {
               this.d_void(
                  73, this.ap_int + this.j_byteArr2[12][this.am_int], this.aq_int + this.j_byteArr2[13][this.am_int], this.f_int + this.ao_int
               );
            }

            if ((this.e_byteArr[7979 + this.ao_int] & 8) == 8) {
               this.d_void(69, this.ap_int + this.j_byteArr2[12][this.an_int], this.aq_int + this.j_byteArr2[13][this.an_int], this.f_int);
            }

            if (this.ao_int <= 50) {
               if (this.aq_byte == 0
                  || this.aq_byte == 1
                     && (
                        this.ao_int == this.k_byte
                           || this.ao_int == this.W_byte
                           || this.e_byteArr[909 + this.ao_int] == this.F_byte
                           || this.ao_int == this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte]
                           || this.X_byte != 0
                              && -this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte] == this.e_byteArr[4444 + this.ao_int]
                     )) {
                  this.a_void7(
                     581 + this.e_byteArr[2222 + this.ao_int],
                     this.ap_int + this.j_byteArr2[12][this.am_int],
                     this.aq_int + this.j_byteArr2[13][this.am_int]
                  );
               }

               if (!this.F_bool
                  && this.e_byteArr[1919 + this.ao_int] > 0
                  && (
                     this.ao_int == this.k_byte
                        || this.ao_int == this.W_byte
                        || this.e_byteArr[909 + this.ao_int] == this.F_byte
                        || this.ao_int == this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte]
                        || this.e_byteArr[6767 + this.ao_int] / 3 * 2 > this.e_byteArr[1919 + this.ao_int]
                        || this.X_byte != 0
                           && -this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte] == this.e_byteArr[4444 + this.ao_int]
                  )) {
                  int intValue1 = this.e_byteArr[6767 + this.ao_int] / 20;
                  byte byteValue1 = 0;
                  if (this.e_byteArr[1616 + this.ao_int] >= 5 || this.e_byteArr[1717 + this.ao_int] >= 5 || this.e_byteArr[7575 + this.ao_int] > 5) {
                     byteValue1 = 2;
                     this.a_void7(
                        606
                           + (
                              this.e_byteArr[1616 + this.ao_int] > this.e_byteArr[1717 + this.ao_int]
                                 ? (
                                    this.e_byteArr[1616 + this.ao_int] > this.e_byteArr[7575 + this.ao_int]
                                       ? this.e_byteArr[1616 + this.ao_int]
                                       : (
                                          this.e_byteArr[1717 + this.ao_int] >= this.e_byteArr[7575 + this.ao_int]
                                             ? this.e_byteArr[1717 + this.ao_int]
                                             : this.e_byteArr[7575 + this.ao_int] - 1
                                       )
                                 )
                                 : (
                                    this.e_byteArr[1717 + this.ao_int] >= this.e_byteArr[7575 + this.ao_int]
                                       ? this.e_byteArr[1717 + this.ao_int]
                                       : this.e_byteArr[7575 + this.ao_int] - 1
                                 )
                           )
                           - 5,
                        this.ap_int + this.j_byteArr2[12][this.am_int] + 2 - intValue1 + 2 - 10,
                        this.aq_int + this.j_byteArr2[13][this.am_int]
                     );
                  }

                  this.a_void7(611 + intValue1, this.ap_int + this.j_byteArr2[12][this.am_int] + byteValue1, this.aq_int + this.j_byteArr2[13][this.am_int]);
                  frameGraphics[this.N_byte].setColor(this.e_intArr[(this.e_byteArr[1919 + this.ao_int] - 1) * 3 / this.e_byteArr[6767 + this.ao_int]]);
                  b_void8(
                     frameGraphics[this.N_byte],
                     this.ap_int + this.j_byteArr2[12][this.am_int] + 2 - intValue1 + byteValue1,
                     this.aq_int + this.j_byteArr2[13][this.am_int] - 4,
                     this.a_byteArr[this.a_shortArr[128] + intValue1] * this.e_byteArr[1919 + this.ao_int] / this.e_byteArr[6767 + this.ao_int],
                     2
                  );
               }
            }

            if ((this.F_bool || this.V_bool) && this.ao_int == this.l_byte) {
               this.d_void(
                  41, this.ap_int + this.j_byteArr2[12][this.an_int] - 1, this.aq_int + this.j_byteArr2[13][this.an_int] - 16 - 5, this.e_int
               );
            }
         }
      }
   }

   // $VF: renamed from: a (int, int, int, int) void
   final void a_void5(int intValue1, int intValue2, int intValue3, int intValue4) {
      for (int loopIndex1 = 0; loopIndex1 < 10; loopIndex1++) {
         if (this.d_byteArr2[0][loopIndex1] == 0) {
            this.d_byteArr2[1][loopIndex1] = 0;
            this.d_byteArr2[0][loopIndex1] = (byte)intValue4;
            this.d_byteArr2[2][loopIndex1] = (byte)intValue3;
            this.d_byteArr2[6][loopIndex1] = (byte)intValue2;
            this.d_byteArr2[5][loopIndex1] = (byte)intValue1;
            return;
         }
      }
   }

   // $VF: renamed from: r () void
   private void r() {
      boolean flag1 = false;
      int intValue1 = 0;
      int intValue2 = 0;
      byte byteValue1 = 0;
      int intValue3 = 0;
      short shortValue1 = 0;
      int intValue4 = 0;
      short shortValue2 = 0;
      this.ao_int = -1;

      try {
         for (int loopIndex1 = 0; loopIndex1 < 10; loopIndex1++) {
            if (this.d_byteArr2[0][loopIndex1] > 0) {
               byte byteValue2 = 29;
               this.ao_int = this.d_byteArr2[5][loopIndex1];
               if (this.d_byteArr2[6][loopIndex1] == 1) {
                  intValue1 = this.e_byteArr[0 + this.ao_int];
                  intValue2 = this.e_byteArr[101 + this.ao_int];
               } else if (this.d_byteArr2[6][loopIndex1] == 2) {
                  intValue1 = this.e_byteArr[9359 + this.ao_int];
                  intValue2 = this.e_byteArr[9381 + this.ao_int];
                  byteValue2 = 108;
                  this.d_byteArr2[2][loopIndex1] = 0;
               } else {
                  intValue1 = this.e_byteArr[8383 + this.ao_int] + (this.d_byteArr2[2][loopIndex1] & 15);
                  intValue2 = this.e_byteArr[8444 + this.ao_int] + (this.d_byteArr2[2][loopIndex1] >> 4 & 15);
               }

               if (!this.a_bool3(intValue1, intValue2)
                  || this.a_byte6(intValue1, intValue2) != 0
                  || this.e_byteArr[1919 + this.ao_int] <= 0 && this.d_byteArr2[6][loopIndex1] == 1) {
                  this.d_byteArr2[0][loopIndex1] = 0;
                  return;
               }

               intValue1 = (intValue1 - this.I_byte) * 22;
               intValue2 = (intValue2 - this.K_byte) * 16;
               if (this.d_byteArr2[6][loopIndex1] == 1 || this.d_byteArr2[6][loopIndex1] == 2) {
                  byteValue1 = this.e_byteArr[606 + this.ao_int];
                  byteValue1 = this.a_byteArr[this.a_shortArr[99]
                     + (this.b_shortArr2[3][this.e_byteArr[this.b_shortArr[byteValue2] + this.ao_int] & 255] >> 14 & 3) * 8
                     + byteValue1];
                  intValue3 = (this.b_shortArr2[2][this.e_byteArr[this.b_shortArr[byteValue2] + this.ao_int] & 255] & 4095)
                     + byteValue1 * this.j_byteArr2[4][this.e_byteArr[this.b_shortArr[byteValue2] + this.ao_int] & 255]
                     + this.e_byteArr[this.b_shortArr[byteValue2 + 1] + this.ao_int];
                  shortValue1 = this.b_shortArr2[4][intValue3];
                  intValue4 = 0;
                  shortValue2 = this.b_shortArr2[8][this.b_shortArr2[4][intValue3]];

                  for (short shortIndex1 = 0; shortIndex1 < this.j_byteArr2[15][shortValue1]; shortIndex1++) {
                     intValue4 = shortValue2 + shortIndex1;
                     if ((this.j_byteArr2[14][intValue4] & 15) == this.d_byteArr2[2][loopIndex1]) {
                        break;
                     }
                  }

                  if (this.d_byteArr2[6][loopIndex1] == 1) {
                     intValue1 += this.e_byteArr[202 + this.ao_int] + this.j_byteArr2[12][intValue4];
                     intValue2 += this.e_byteArr[303 + this.ao_int] + this.j_byteArr2[13][intValue4];
                  } else if (this.d_byteArr2[6][loopIndex1] == 2) {
                     intValue1 += this.e_byteArr[9403 + this.ao_int] + this.j_byteArr2[12][intValue4];
                     intValue2 += this.e_byteArr[9425 + this.ao_int] + this.j_byteArr2[13][intValue4];
                  }
               }

               this.d_void(this.d_byteArr2[0][loopIndex1], intValue1, intValue2, this.d_byteArr2[1][loopIndex1]);
               this.d_byteArr2[1][loopIndex1]++;
               if (this.d_byteArr2[1][loopIndex1] >= this.j_byteArr2[9][this.d_byteArr2[0][loopIndex1]]) {
                  this.d_byteArr2[0][loopIndex1] = 0;
               }
            }
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: a (int, int) void
   final void a_void6(int intValue1, int intValue2) {
      for (int loopIndex1 = 0; loopIndex1 < 30; loopIndex1++) {
         if (this.e_byteArr2[0][loopIndex1] == 0) {
            this.e_byteArr2[1][loopIndex1] = 0;
            this.e_byteArr2[2][loopIndex1] = (byte)intValue2;
            this.e_byteArr2[0][loopIndex1] = (byte)intValue1;
            return;
         }
      }
   }

   // $VF: renamed from: s () void
   private void s() {
      for (int loopIndex1 = 0; loopIndex1 < 30; loopIndex1++) {
         if (this.e_byteArr2[0][loopIndex1] != 0) {
            byte byteValue1 = this.e_byteArr2[0][loopIndex1];
            byte byteValue2 = this.e_byteArr[8383 + byteValue1];
            int intValue1 = this.e_byteArr[8444 + byteValue1] - 1;
            byte byteValue3 = this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + byteValue1]];
            byte byteValue4 = this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + byteValue1]];
            if (this.e_byteArr2[1][loopIndex1] >= 20) {
               this.e_byteArr2[0][loopIndex1] = 0;
               if (this.e_byteArr2[2][loopIndex1] == 3) {
                  this.c_void6(byteValue1, false);
                  this.e_byteArr[8627 + byteValue1] = 3;
               }

               this.c_void7(byteValue2, intValue1 + 1, byteValue3, byteValue4);
               this.d_void5(byteValue1);
            } else {
               for (byte byteIndex1 = 0; byteIndex1 < byteValue4 + 1; byteIndex1 += 2) {
                  for (byte byteIndex2 = 0; byteIndex2 < byteValue3; byteIndex2 += 2) {
                     if (this.a_bool3(byteValue2 + byteIndex2, intValue1 + byteIndex1)) {
                        this.d_void(
                           74, (byteValue2 + byteIndex2 - this.I_byte) * 22, (intValue1 + byteIndex1 - this.K_byte) * 16, (byteIndex2 * 2 + byteIndex1) * 2 + this.e_byteArr2[1][loopIndex1] - 1
                        );
                     }
                  }
               }
            }

            this.e_byteArr2[1][loopIndex1]++;
         }
      }
   }

   // $VF: renamed from: a (int, int) boolean
   private boolean a_bool3(int intValue1, int intValue2) {
      return intValue1 >= this.I_byte && intValue1 < this.I_byte + this.O_byte && intValue2 >= this.K_byte && intValue2 < this.K_byte + this.P_byte;
   }

   // $VF: renamed from: t () void
   private void t() {
      for (byte byteIndex1 = 0; byteIndex1 < 10; byteIndex1++) {
         this.d_byteArr2[0][byteIndex1] = 0;
      }
   }

   // $VF: renamed from: d (int, int, int, int) void
   private void d_void(int intValue1, int intValue2, int intValue3, int intValue4) {
      int intValue5 = this.b_shortArr2[5][intValue1] + intValue4 % this.j_byteArr2[9][intValue1];
      this.a_void7(this.b_shortArr2[6][intValue5], intValue2 + this.j_byteArr2[10][intValue5], intValue3 + this.j_byteArr2[11][intValue5]);
   }

   // $VF: renamed from: a (int, int, int) void
   final void a_void7(int intValue1, int intValue2, int intValue3) {
      int intValue4 = this.b_shortArr2[9][intValue1] & 8191;
      int intValue5;
      if ((intValue5 = (this.b_shortArr2[9][intValue1] & '\uffff') >> 14 & 3) != 0) {
         this.b_void2((intValue5 - 1) * 3 + 1, intValue2, intValue3);
      }

      for (int loopIndex1 = intValue4; loopIndex1 < intValue4 + (this.j_byteArr2[16][intValue1] & 63); loopIndex1++) {
         int intValue6 = this.b_shortArr2[10][loopIndex1] & 8191;
         int intValue7 = (this.b_shortArr2[10][loopIndex1] & '쀀') >> 14 << 7;
         if ((this.b_shortArr2[10][loopIndex1] & 8192) >> 13 == 0) {
            this.b_void2(intValue6, intValue2 + this.j_byteArr2[18][loopIndex1] + intValue7, intValue3 + this.j_byteArr2[19][loopIndex1]);
         } else {
            this.a_void7(intValue6, intValue2 + this.j_byteArr2[18][loopIndex1] + intValue7, intValue3 + this.j_byteArr2[19][loopIndex1]);
         }
      }
   }

   // $VF: renamed from: b (int, int, int) void
   private void b_void2(int intValue1, int intValue2, int intValue3) {
      if (intValue1 != 0) {
         int intValue4;
         if ((intValue4 = this.j_byteArr2[20][intValue1] & 31) < 27) {
            boolean flag1 = false;
            if (this.al_int > -1) {
               if (this.al_int == 0) {
                  if (intValue4 == 5) {
                     intValue4 = this.al_int;
                     flag1 = true;
                  }
               } else if (this.al_int == 4) {
                  if (intValue4 == 14) {
                     intValue4 = 4;
                     flag1 = true;
                  } else if (intValue4 == 15) {
                     intValue4 = 5;
                     flag1 = true;
                  }
               } else if (intValue4 == 9) {
                  intValue4 = this.al_int;
                  flag1 = true;
               }
            }

            if (!flag1) {
               a_bool6(
                  frameGraphics[this.N_byte],
                  this.spriteImages[0][intValue4],
                  this.j_byteArr2[21][intValue1] & 127,
                  this.j_byteArr2[22][intValue1],
                  this.j_byteArr2[23][intValue1],
                  this.j_byteArr2[24][intValue1],
                  intValue2,
                  intValue3,
                  20
               );
               return;
            }

            if (a_bool6(
               frameGraphics[this.N_byte],
               this.spriteImages[1][intValue4],
               this.j_byteArr2[21][intValue1] & 127,
               this.j_byteArr2[22][intValue1],
               this.j_byteArr2[23][intValue1],
               this.j_byteArr2[24][intValue1],
               intValue2,
               intValue3,
               20
            )) {
               return;
            }
         } else {
            int intValue5 = (this.j_byteArr2[20][intValue1] & 255) >> 5 | (this.j_byteArr2[21][intValue1] & 128) >> 4;
            frameGraphics[this.N_byte]
               .setColor(this.j_byteArr2[17][intValue5 * 3 + 0] & 255, this.j_byteArr2[17][intValue5 * 3 + 1] & 255, this.j_byteArr2[17][intValue5 * 3 + 2] & 255);
            if (intValue4 == 27) {
               d_void6(
                  frameGraphics[this.N_byte],
                  intValue2 + (this.j_byteArr2[21][intValue1] & 127),
                  intValue3 + this.j_byteArr2[22][intValue1],
                  intValue2 + this.j_byteArr2[23][intValue1],
                  intValue3 + this.j_byteArr2[24][intValue1]
               );
               return;
            }

            if (intValue4 == 28) {
               a_void20(
                  frameGraphics[this.N_byte],
                  intValue2 + (this.j_byteArr2[21][intValue1] & 127),
                  intValue3 + this.j_byteArr2[22][intValue1],
                  this.j_byteArr2[23][intValue1],
                  this.j_byteArr2[24][intValue1]
               );
               return;
            }

            if (intValue4 == 29) {
               b_void8(
                  frameGraphics[this.N_byte],
                  intValue2 + (this.j_byteArr2[21][intValue1] & 127) - 0,
                  intValue3 + this.j_byteArr2[22][intValue1] - 0,
                  this.j_byteArr2[23][intValue1],
                  this.j_byteArr2[24][intValue1]
               );
               return;
            }

            if (intValue4 == 30) {
               b_void8(
                  frameGraphics[this.N_byte],
                  intValue2 + (this.j_byteArr2[21][intValue1] & 127) * 4 - 0,
                  intValue3 + this.j_byteArr2[22][intValue1] * 4 - 0,
                  this.j_byteArr2[23][intValue1] * 4,
                  this.j_byteArr2[24][intValue1] * 4
               );
            }
         }
      }
   }

   // $VF: renamed from: i (int) void
   private void i_void2(int intValue1) {
      byte byteValue1 = 0;
      byte byteValue2 = 0;
      int intValue2 = 0;
      int intValue3 = 0;
      boolean flag1 = true;

      try {
         do {
            if (!flag1) {
               intValue1 = this.e_byteArr[6060 + intValue1];
            }

            flag1 = false;
            byteValue1 = this.e_byteArr[7676 + intValue1];
            intValue2 = 0 + (this.e_byteArr[5252 + intValue1] - this.I_byte) * 22 + 11 + this.e_byteArr[5454 + intValue1];
            intValue3 = 0
               + (this.e_byteArr[5353 + intValue1] - this.K_byte) * 16
               + 8
               + this.e_byteArr[5555 + intValue1]
               - this.h_byteArr2[this.e_byteArr[5858 + intValue1]][intValue1]
               - 10;
            if ((byteValue2 = this.e_byteArr[6565 + intValue1]) == 1 || byteValue2 == 2 || byteValue2 == 5) {
               this.a_void7(
                  292
                     + this.a_byteArr[this.a_shortArr[190 + this.a_byteArr[this.a_shortArr[77] + byteValue2]]
                        + byteValue1 * this.a_byteArr[this.a_shortArr[193] + 6 + byteValue2]
                        + this.i_byteArr2[this.e_byteArr[5858 + intValue1]][intValue1]]
                     + this.a_byteArr[this.a_shortArr[193] + byteValue2],
                  intValue2,
                  intValue3
               );
            }
         } while (this.e_byteArr[6060 + intValue1] != 0);
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: u () void
   private void u() {
      int intValue1 = 0;
      byte byteValue1 = 0;
      byte byteValue2 = 0;
      int intValue2 = 0;

      try {
         this.v();

         for (this.ag_int = 0; this.ag_int < this.P_byte + 3; this.ag_int++) {
            int intValue3;
            if ((intValue3 = this.ag_int + this.K_byte) < this.d_short) {
               for (this.af_int = this.O_byte - 1 + 0; this.af_int >= 0; this.af_int--) {
                  int intValue4 = this.af_int + this.I_byte;
                  if (!this.s_bool || intValue3 >= 0 && intValue3 < this.d_short && intValue4 >= 0 && intValue4 < this.c_short) {
                     intValue1 = this.af_int * 22;
                     byte byteValue3 = this.a_byte6(intValue4, intValue3);
                     if (this.s_bool && !this.J_bool) {
                        byteValue3 = 0;
                     }

                     byteValue2 = this.c_byteArr2[intValue3][intValue4];
                     intValue2 = this.b_byteArr2[intValue3][intValue4] & 255;
                     if (byteValue2 != 0) {
                        if (byteValue3 >= 2 || (intValue2 < 180 || intValue2 > 231) && intValue2 != 243) {
                           if (byteValue3 < 1 && byteValue2 >= 1 && byteValue2 <= 100 && (!this.s_bool || this.ao_byte != 9)) {
                              if (c_byte2(this.e_byteArr[4545 + byteValue2]) != 2) {
                                 this.a_void2(this.e_byteArr[4545 + byteValue2], (byte)1);
                              }

                              if (c_byte2(this.e_byteArr[4545 + byteValue2]) == 2 || this.e_byteArr[2929 + byteValue2] <= 14) {
                                 if (this.ag_int >= 0
                                    && this.af_int - 1 >= 0
                                    && this.e_byteArr[9833 + (this.c_byteArr2[intValue3][intValue4 - 1] + 61) * -1] == 5
                                    && c_bool3(this.c_byteArr2[intValue3][intValue4 - 1])) {
                                    if (this.af_int < this.O_byte) {
                                       this.g_byteArr2[this.ag_int][this.af_int] = 0;
                                    }

                                    this.af_int--;
                                    intValue4 = this.af_int + this.I_byte;
                                    this.a_void2(this.c_byteArr2[intValue3][intValue4], (byte)1);
                                 }

                                 if (a_byte2(byteValue2) == 0 || (this.e_byteArr[7979 + byteValue2] & 2) == 0) {
                                    this.a_void4(
                                       byteValue2, intValue1 + this.e_byteArr[202 + byteValue2], byteValue1 + this.e_byteArr[303 + byteValue2], this.e_byteArr[606 + byteValue2], (byte)29
                                    );
                                 }
                              }
                           } else if (byteValue2 <= -1 && byteValue2 >= -60 && (byteValue3 < 2 || this.e_byteArr[9176 + -byteValue2] > 0)) {
                              if ((this.e_byteArr[9176 + -byteValue2] & 4) != 0) {
                                 switch (byteValue3) {
                                    case 0:
                                       this.e_byteArr[9176 + -byteValue2] = 6;
                                       break;
                                    case 1:
                                       this.e_byteArr[9176 + -byteValue2] = 5;
                                 }
                              }

                              switch (this.e_byteArr[9176 + -byteValue2] & 3) {
                                 case 1:
                                    byteValue3 = 1;
                                    break;
                                 case 2:
                                    byteValue3 = 0;
                              }

                              if ((this.e_byteArr[8871 + -byteValue2] & 1) == 0) {
                                 this.a_void2(byteValue2, (byte)1);
                                 this.e_byteArr[8871 + -byteValue2] = (byte)(this.e_byteArr[8871 + -byteValue2] | 1);
                                 byte byteValue4 = this.e_byteArr[8749 + -byteValue2];
                                 byte byteValue5 = this.a_byteArr[this.a_shortArr[138] + 104 + byteValue4];
                                 byte byteValue6 = this.a_byteArr[this.a_shortArr[138] + 130 + byteValue4];
                                 if ((this.e_byteArr[9176 + -byteValue2] & 4) == 0) {
                                    this.engine.S_byte = 0;
                                    this.engine.a_void18(this.e_byteArr[8383 + -byteValue2], this.e_byteArr[8444 + -byteValue2], byteValue5, byteValue6);
                                    this.engine.S_byte = 1;
                                    this.e_byteArr[9176 + -byteValue2] = 4;
                                 }

                                 if (!this.s_bool && byteValue4 < 22) {
                                    if ((
                                          this.a_byteArr[this.a_shortArr[138] + 156 + byteValue4] != -1
                                             || this.e_byteArr[8627 + -byteValue2] == 1
                                             || this.e_byteArr[8627 + -byteValue2] == 2
                                       )
                                       && this.e_byteArr[8810 + -byteValue2] == 0
                                       && b_byte2(byteValue2) == 0) {
                                       this.d_void(
                                          40,
                                          (this.e_byteArr[8383 + -byteValue2] - this.I_byte) * 22 + byteValue5 * 11 - 11,
                                          (this.e_byteArr[8444 + -byteValue2] - this.K_byte) * 16 + byteValue6 * 8 - 8,
                                          this.e_int
                                       );
                                    }

                                    if ((
                                          this.e_byteArr[8505 + -byteValue2] > 0
                                                && (
                                                   byteValue2 == this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte]
                                                      || this.e_byteArr[8566 + -byteValue2] / 2 > this.e_byteArr[8505 + -byteValue2]
                                                )
                                             || this.e_byteArr[8627 + -byteValue2] == 1
                                             || this.e_byteArr[8627 + -byteValue2] == 2
                                             || byteValue4 >= 12
                                       )
                                       && b_byte2(byteValue2) == 0) {
                                       int intValue5 = this.e_byteArr[8566 + -byteValue2] / 80 + 6;
                                       int intValue6 = (this.e_byteArr[8383 + -byteValue2] - this.I_byte) * 22 + byteValue5 * 11 - 11;
                                       int intValue7 = byteValue1 - this.a_byteArr[this.a_shortArr[138] + 520 + byteValue4] * 8 - 5;
                                       this.a_void7(611 + intValue5, intValue6, intValue7);
                                       frameGraphics[this.N_byte]
                                          .setColor(this.e_intArr[(this.e_byteArr[8505 + -byteValue2] - 1) * 3 / this.e_byteArr[8566 + -byteValue2]]);
                                       b_void8(
                                          frameGraphics[this.N_byte],
                                          intValue6 + 1,
                                          intValue7 + 1,
                                          this.a_byteArr[this.a_shortArr[128] + intValue5] * this.e_byteArr[8505 + -byteValue2] / this.e_byteArr[8566 + -byteValue2],
                                          2
                                       );
                                       if (byteValue2 == this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte]) {
                                          byte byteValue7;
                                          int intValue8 = (byteValue7 = this.engine.a_byte5(-byteValue2)) >> 4 & 15;
                                          int intValue9 = byteValue7 & 15;
                                          int intValue10;
                                          if ((intValue10 = intValue8 + intValue9) > 0) {
                                             intValue6 = intValue6 + 1 + this.a_byteArr[this.a_shortArr[128] + intValue5] / 2 - 4 * intValue10 / 2 + 1;
                                             intValue7 += 6;
                                             frameGraphics[this.N_byte].setColor(0);
                                             b_void8(frameGraphics[this.N_byte], intValue6 - 0, intValue7 - 1, intValue10 * 4 - 1, 4);
                                             b_void8(frameGraphics[this.N_byte], intValue6 - 1, intValue7 - 0, intValue10 * 4 + 1, 2);

                                             for (byte byteIndex1 = 0; byteIndex1 < intValue10; byteIndex1++) {
                                                frameGraphics[this.N_byte].setColor(byteIndex1 < intValue9 ? 16164864 : 4207389);
                                                b_void8(frameGraphics[this.N_byte], intValue6 + byteIndex1 * 4, intValue7, 3, 2);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (byteValue3 < 1 && b_bool3(byteValue2)) {
                              int intValue11 = byteValue2 - 101;
                              this.a_void4(
                                 intValue11, intValue1 + this.e_byteArr[9403 + intValue11], byteValue1 + this.e_byteArr[9425 + intValue11], this.e_byteArr[9491 + intValue11], (byte)108
                              );
                           } else if (byteValue3 >= 2 || !c_bool3(byteValue2) && c_byte2(byteValue2) != 3) {
                              if (byteValue3 == 0 && byteValue2 <= -114 && byteValue2 > -117) {
                                 if (this.h_int >= 94 + intValue3 && this.h_int <= 100 + intValue3) {
                                    this.d_void(75, intValue1, byteValue1, this.h_int - (100 + intValue3) + 6);
                                 } else if ((this.h_int + this.af_int + this.ag_int) % 10 < 5) {
                                    this.a_void7(this.b_byteArr2[intValue3][intValue4] & 255, intValue1, byteValue1);
                                 }
                              }
                           } else {
                              this.a_void2(byteValue2, (byte)1);
                           }
                        } else {
                           this.a_void2(intValue2, (byte)1);
                        }
                     }

                     if (this.g_byteArr2[this.ag_int][this.af_int] > 0) {
                        this.i_void2(this.g_byteArr2[this.ag_int][this.af_int]);
                        this.g_byteArr2[this.ag_int][this.af_int] = 0;
                     }

                     if (byteValue3 == 1) {
                        this.b_void2(12, intValue1 - 2, byteValue1 - 4);
                     } else if (byteValue3 == 2) {
                        frameGraphics[this.c_byteArr[1]].setColor(0);
                        if (intValue4 != 0
                           && intValue4 != this.c_short - 1
                           && intValue3 != 0
                           && intValue3 != this.d_short - 1
                           && this.a_byte6(intValue4 - 1, intValue3) == 2
                           && this.a_byte6(intValue4 + 1, intValue3) == 2
                           && this.a_byte6(intValue4, intValue3 - 1) == 2
                           && this.a_byte6(intValue4, intValue3 + 1) == 2) {
                           b_void8(frameGraphics[this.c_byteArr[1]], intValue1, byteValue1, 22, 16);
                        } else {
                           this.b_void2(11, intValue1 - 3, byteValue1 - 2);
                        }
                     }

                     if (this.ag_int == this.A_byte && this.af_int == this.y_byte) {
                        this.Z_byte = byteValue3;
                     }
                  }
               }

               if ((this.L_bool || this.N_bool) && this.q_byteArr[1] - this.K_byte == this.ag_int) {
                  this.d_void(107, (this.q_byteArr[0] - this.I_byte) * 22, byteValue1, this.f_int);
               }

               byteValue1 += 16;
            }
         }

         this.r();
         this.s();
         if (!this.N_bool) {
            if (this.L_bool) {
               this.d_void(31, 298, 11, this.f_int);
            }

            return;
         }

         this.d_void(30, 298, 11, this.f_int);
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: v () void
   private void v() {
      for (int loopIndex1 = 1; loopIndex1 <= 60; loopIndex1++) {
         this.e_byteArr[8871 + loopIndex1] = (byte)(this.e_byteArr[8871 + loopIndex1] & 254);
         if (this.e_byteArr[9176 + loopIndex1] > 0) {
            this.e_byteArr[9176 + loopIndex1] = 5;
         }
      }

      byte byteValue1 = 0;

      for (int loopIndex2 = 0; loopIndex2 < 5; loopIndex2++) {
         if (this.c_byteArr3[byteValue1][loopIndex2][2] >= 0
            && this.c_byteArr3[byteValue1][loopIndex2][3] == 1
            && this.c_byteArr3[byteValue1][loopIndex2][0] >= this.I_byte - 1
            && this.c_byteArr3[byteValue1][loopIndex2][0] <= this.I_byte + this.O_byte + 1
            && this.c_byteArr3[byteValue1][loopIndex2][1] >= this.K_byte - 1
            && this.c_byteArr3[byteValue1][loopIndex2][1] <= this.K_byte + this.P_byte + 1) {
            for (int loopIndex3 = 0; loopIndex3 < 9; loopIndex3++) {
               if (this.a_byte6(
                     this.c_byteArr3[byteValue1][loopIndex2][0] + this.a_byteArr[this.a_shortArr[141] + 0 + loopIndex3],
                     this.c_byteArr3[byteValue1][loopIndex2][1] + this.a_byteArr[this.a_shortArr[141] + 9 + loopIndex3]
                  )
                  == 0) {
                  this.d_void(
                     68,
                     (this.c_byteArr3[byteValue1][loopIndex2][0] - this.I_byte + this.a_byteArr[this.a_shortArr[141] + 0 + loopIndex3]) * 22,
                     (this.c_byteArr3[byteValue1][loopIndex2][1] - this.K_byte + this.a_byteArr[this.a_shortArr[141] + 9 + loopIndex3]) * 16,
                     this.f_int
                  );
               }
            }
         }

         if (loopIndex2 == 4 && byteValue1 == 0) {
            loopIndex2 = 0;
            byteValue1 = 1;
         }
      }

      for (int loopIndex4 = 0; loopIndex4 < 30; loopIndex4++) {
         byte byteValue2 = this.b_byteArr3[0][2][loopIndex4];
         byte byteValue3 = this.b_byteArr3[0][3][loopIndex4];
         if (this.b_byteArr3[0][1][loopIndex4] == 3
            && this.b_byteArr3[0][0][loopIndex4] != 0
            && byteValue2 >= this.I_byte - 1
            && byteValue2 <= this.I_byte + this.O_byte + 1
            && byteValue3 >= this.K_byte - 1
            && byteValue3 <= this.K_byte + this.P_byte + 1
            && this.a_byte6(byteValue2, byteValue3) == 0) {
            this.d_void(68 + (1 - this.b_byteArr3[0][4][loopIndex4]) * 5, (byteValue2 - this.I_byte - 0) * 22, (byteValue3 - this.K_byte - 0) * 16, this.f_int);
         }
      }
   }

   // $VF: renamed from: w () void
   private void w() {
      if (this.u_bool) {
         this.Q_int = this.G_int - this.I_byte <= this.y_byte ? this.G_int - this.I_byte : this.y_byte;
         this.B_int = this.Q_int + this.I_byte - 1;
         this.R_int = this.H_int - this.K_byte <= this.A_byte ? this.H_int - this.K_byte : this.A_byte;
         this.C_int = this.R_int + this.K_byte - 1;
         this.Q_int *= 22;
         this.R_int *= 16;
         int intValue1 = this.I_byte + this.y_byte - this.G_int;
         int intValue2 = this.K_byte + this.A_byte - this.H_int;
         if (intValue1 < 0) {
            intValue1 *= -1;
         }

         this.D_int = intValue1 + 1;
         if (intValue2 < 0) {
            intValue2 *= -1;
         }

         this.E_int = intValue2 + 1;
         intValue1 = (intValue1 + 1) * 22;
         intValue2 = (intValue2 + 1) * 16;
         frameGraphics[this.c_byteArr[1]].setColor(0);
         a_void20(frameGraphics[this.c_byteArr[1]], 0 + this.Q_int + 1, 0 + this.R_int + 1, intValue1, intValue2);
         frameGraphics[this.c_byteArr[1]].setColor(1105252);
         a_void20(frameGraphics[this.c_byteArr[1]], 0 + this.Q_int, 0 + this.R_int, intValue1, intValue2);
      }

      byte byteValue1;
      if (b_byte2(byteValue1 = this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte]) == 0) {
         int intValue3 = (this.e_byteArr[8383 + -byteValue1] - this.I_byte) * 22;
         int intValue4 = (this.e_byteArr[8444 + -byteValue1] - this.K_byte) * 16;
         int intValue5 = this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + -byteValue1]] * 22;
         int intValue6 = this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + -byteValue1]] * 16;
         this.d_void(6, intValue3, intValue4, this.e_int);
         this.d_void(7, intValue3 + intValue5, intValue4, this.e_int);
         this.d_void(8, intValue3, intValue4 + intValue6, this.e_int);
         this.d_void(9, intValue3 + intValue5, intValue4 + intValue6, this.e_int);
      }
   }

   // $VF: renamed from: c (int, int) void
   private void c_void(int intValue1, int intValue2) {
      if (this.aa_byte != 0) {
         this.d_void(34 + this.aa_byte, (this.ab_byte - this.I_byte) * 22, (this.ac_byte - this.K_byte) * 16, this.e_int);
         if (this.e_int == 5) {
            this.aa_byte = 0;
         }
      }

      byte byteValue1 = this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte];
      if (this.w_byte != 2) {
         byte byteValue2 = -1;
         int intValue3 = 32;
         if (this.w_byte == 1) {
            if (this.k_byte != 0) {
               byteValue2 = 1;
            } else if (this.F_byte != -1) {
               byteValue2 = 0;

               for (int loopIndex1 = 0; loopIndex1 < 50; loopIndex1++) {
                  if (this.a_byteArr2[this.F_byte][loopIndex1] != 0) {
                     byteValue2++;
                  }
               }
            }

            intValue3 = this.Z_byte != 0 || b_byte2(byteValue1) != 1 && !b_bool3(byteValue1) && (a_byte2(byteValue1) != 1 || (this.e_byteArr[7979 + byteValue1] & 2) != 0)
               ? 33
               : 34;
         } else if (this.w_byte == 3) {
            int intValue4;
            if (this.s_int == 100) {
               this.r_bool = true;
               intValue4 = 107;
            } else if (this.s_int >= 0 && this.s_int > 3) {
               byte byteValue3 = this.a_byteArr[this.a_shortArr[138] + 104 + this.s_int];
               byte byteValue4 = this.a_byteArr[this.a_shortArr[138] + 130 + this.s_int];
               this.t_int = this.y_byte - byteValue3 / 2;
               this.u_int = this.A_byte - byteValue4 / 2;
               this.S_int = intValue1 - byteValue3 / 2 * 22;
               this.T_int = intValue2 - byteValue4 / 2 * 16 - 5 + this.e_int;
               this.a_void2(1000 + this.s_int + 1, (byte)2);
               this.r_bool = this.a_bool5(this.s_int, this.I_byte + this.t_int, this.K_byte + this.u_int, true);
               intValue4 = this.r_bool ? 41 : 40;
            } else if ((a_byte2(byteValue1) != 0 || this.e_byteArr[1414 + byteValue1] < 12)
               && (a_byte2(this.W_byte) != 0 || this.e_byteArr[1414 + this.W_byte] < 12)) {
               if (this.s_int == 3) {
                  this.r_bool = true;
                  intValue4 = 33;
               } else {
                  this.r_bool = false;
                  intValue4 = 32;
               }
            } else {
               this.r_int = this.W_byte;
               this.t_int = this.e_byteArr[0 + this.r_int];
               this.u_int = this.e_byteArr[101 + this.r_int];
               this.r_bool = true;
               intValue4 = 33;
            }

            intValue3 = intValue4;
         }

         if (this.E_bool && this.e_int < 2 && intValue3 <= 34) {
            intValue3 = (byte)(intValue3 + 5);
         }

         this.d_void(intValue3, intValue1, intValue2, this.e_int);
         if (byteValue2 > 0) {
            this.renderer.a_void3(intValue1 + 22, intValue2 + 8, 0, "" + byteValue2, 1);
            this.renderer.a_void6(frameGraphics[this.N_byte]);
         }

         if (this.aA > 0) {
            this.renderer.a_void3(intValue1 + 22, intValue2 + 8, 0, "" + this.aA, 1);
            this.renderer.a_void6(frameGraphics[this.N_byte]);
         }

         if (this.w_byte == 3) {
            if (this.s_int < 0) {
               this.a_void7(664 - this.s_int - 1, intValue1 + 11 + 5, intValue2 + 8 + 5);
            } else if (this.s_int <= 3) {
               this.d_void(this.s_int + 48, intValue1, intValue2, this.e_int);
            }
         }
      }

      int intValue5 = 0;
      if (this.w_byte == 1) {
         if (this.q_bool && this.aa_byte != 0) {
            intValue5 = 47;
            this.Z_byte = 0;
         } else if (byteValue1 == -124) {
            intValue5 = 44;
         } else if (byteValue1 == -125) {
            intValue5 = 45;
         } else if (b_byte2(byteValue1) == 0 && this.e_byteArr[8749 + -byteValue1] != 10) {
            intValue5 = 41;
         } else if (c_bool3(byteValue1)) {
            intValue5 = this.e_byteArr[9833 + (byteValue1 + 61) * -1] == 7 ? 46 : 43;
         } else if (b_bool3(byteValue1) && this.Z_byte == 0) {
            intValue5 = 43;
         }

         if (intValue5 != 0 && this.Z_byte != 2) {
            this.d_void(intValue5, intValue1, intValue2, this.e_int);
         }
      }
   }

   // $VF: renamed from: a (byte, int, int) void
   private void a_void8(byte byteValue1, int intValue1, int intValue2) {
      this.aB = byteValue1;

      try {
         boolean flag1 = this.c_bool2();
         if (this.b_boolArr[byteValue1]) {
            this.b_boolArr[17] = true;
            this.ae_byte = 0;
         } else if (flag1) {
            this.ae_byte = 1;
         } else {
            if (this.a_byteArr[this.a_shortArr[195] + 80 + byteValue1] != 1) {
               return;
            }

            this.ae_byte = 2;
         }

         this.N_byte = this.c_byteArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteValue1]];
         this.aC = this.a_byteArr[this.a_shortArr[195] + 60 + byteValue1];
         byte byteValue2 = this.a_byteArr[this.a_shortArr[195] + 40 + byteValue1];
         boolean flag2 = false;

         for (int loopIndex1 = this.b_shortArr2[0][byteValue2]; loopIndex1 < this.b_shortArr2[0][byteValue2] + this.j_byteArr2[0][byteValue2]; loopIndex1++) {
            int intValue3 = (this.j_byteArr2[3][loopIndex1] & 255) >> 6;
            int intValue4 = this.j_byteArr2[3][loopIndex1] & 7;
            this.aG = this.b_shortArr2[1][loopIndex1] & 4095;
            if (intValue3 >= this.ae_byte || flag2) {
               this.aD = 0;
               if (flag2) {
                  flag2 = false;
                  if (this.k_byteArr[this.aC] == 0 && this.ae_byte > 0 || this.k_byteArr[this.aC] < 0) {
                     this.aC++;
                     continue;
                  }

                  this.aD = this.d_shortArr[this.aC];
                  this.k_byteArr[this.aC] = 0;
                  this.aC++;
               } else if (intValue3 == 1) {
                  flag2 = true;
                  if (this.k_byteArr[this.aC] == 0 && this.ae_byte > 0
                     || this.aG == 0
                     || intValue3 < this.ae_byte
                     || this.k_byteArr[this.aC] < 0) {
                     continue;
                  }
               } else if (intValue3 == 2 && this.k_byteArr[this.aC] < 0) {
                  continue;
               }

               int intValue5 = (this.b_shortArr2[1][loopIndex1] >> 14 & 3) << 7;
               int intValue6 = (this.b_shortArr2[1][loopIndex1] >> 12 & 3) << 7;
               this.aH = this.j_byteArr2[1][loopIndex1];
               this.aI = this.j_byteArr2[2][loopIndex1];
               if (byteValue1 >= 13 && byteValue1 <= 16) {
                  this.aH += 110;
                  this.aI += 70;
               } else {
                  this.aH += intValue1;
                  this.aI += intValue2;
               }

               this.aH += intValue5;
               this.aI += intValue6;
               if (loopIndex1 == 1013) {
                  this.aG = this.b_shortArr2[1][1009] & 4095;
                  this.aD = this.d_shortArr[3];
                  this.d_void2(intValue4, 1009);
                  this.aG = 0;
               }

               if (loopIndex1 == 1012) {
                  this.a_void9(loopIndex1, this.ae_byte, this.aI);
               } else if (loopIndex1 == 1143) {
                  this.c_void2(loopIndex1, this.aH, this.aI);
               } else if (intValue4 == 0 && (this.j_byteArr2[3][loopIndex1] & 255) >> 6 == 3) {
                  frameGraphics[this.N_byte].setColor(0);
                  byte byteValue3 = 99;
                  if (loopIndex1 == 1034) {
                     byteValue3 = this.e_byteArr[6767 + this.l_byte];
                  }

                  if (this.aD >= 0) {
                     int intValue7 = this.j_byteArr2[23][this.aG] * this.aD / byteValue3;
                     b_void8(frameGraphics[this.N_byte], this.aH + intValue7 + 1, this.aI, this.j_byteArr2[23][this.aG] - intValue7, 4);
                  }
               } else if (intValue4 == 3 && this.aG >= 3 && this.aG <= 4) {
                  if (this.v_int != -1) {
                     if (this.b_boolArr[byteValue1] || this.v_int != this.w_int) {
                        this.renderer
                           .b_void3(
                              this.aE,
                              this.aF,
                              this.j_byteArr2[23][this.b_shortArr2[1][loopIndex1 - 1] & 4095] * 4,
                              this.j_byteArr2[24][this.b_shortArr2[1][loopIndex1 - 1] & 4095] * 4,
                              this.v_int,
                              (this.j_byteArr2[3][loopIndex1] & 255) >> 6,
                              this.aG - 3
                           );
                     }

                     if (this.w_int != this.v_int) {
                        this.w_int = this.v_int;
                        this.y_int = 0;
                     }

                     this.z_int = this.y_int;
                     this.renderer.a_void8(frameGraphics[this.N_byte], this.y_int);
                  }
               } else if (this.aG != 0) {
                  this.d_void2(intValue4, loopIndex1);
               }
            } else if (intValue3 == 1) {
               flag2 = true;
            }
         }

         this.renderer.a_void6(frameGraphics[this.N_byte]);
         this.b_boolArr[byteValue1] = false;
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: d (int, int) void
   private void d_void2(int intValue1, int intValue2) {
      if (intValue1 == 0) {
         this.b_void2(this.aG, this.aH, this.aI);
         this.aE = this.aH;
         this.aF = this.aI;
      } else if (intValue1 == 1) {
         this.j_void2(intValue2);
      } else if (intValue1 == 2) {
         if ((!this.Q_bool || this.aG != 4 && this.aG != 94)
            && (!this.R_bool || this.aG != 5 && this.aG != 95)
            && (this.T_bool || this.aG != 1)
            && (this.U_bool || this.aG != 2)) {
            if (intValue2 - 1 == 1209) {
               frameGraphics[M_byte].setColor(1105252);
               a_void20(
                  frameGraphics[M_byte],
                  0 + this.aH + (this.I_byte - this.W_int) * 7,
                  0 + this.aI + (this.K_byte - this.X_int + this.aJ) * 4,
                  this.O_byte * 7 - 1,
                  this.P_byte * 4 - 1
               );
               this.d_void(
                  this.aG,
                  this.aH + (this.y_byte + this.I_byte - this.W_int) * 7 - 11,
                  this.aI + (this.A_byte + this.K_byte - this.X_int + this.aJ) * 4 - 8,
                  this.f_int / this.k_int
               );
            } else {
               this.d_void(this.aG, this.aH, this.aI, this.f_int / this.k_int);
            }

            this.S_bool = true;
         }
      } else if (intValue1 == 3 && this.aG == 11) {
         a_bool6(
            frameGraphics[M_byte],
            frameBuffers[this.c_byteArr[1]],
            0,
            0,
            this.j_byteArr2[23][this.b_shortArr2[1][1188] & 4095] * 4,
            this.j_byteArr2[24][this.b_shortArr2[1][1188] & 4095] * 4,
            0 + this.aH,
            0 + this.aI,
            0
         );
      } else if (intValue1 == 3 && this.aG == 10) {
         try {
            this.c_void3(this.o_byte);
            frameGraphics[M_byte].drawImage(this.spriteImages[2][0], (0 + this.aH) * 1, (0 + this.aI) * 1, 3);
         } catch (Exception ignoredException1) {
         }
      } else if (intValue1 == 3 && this.aG <= 2) {
         this.k_void2(intValue2);
      } else if (intValue1 == 3 && this.aG <= 6) {
         if (intValue2 - 1 == 1134 && (this.u_byteArr[0] == 3 || this.u_byteArr[0] == 1)) {
            this.renderer
               .a_void5(
                  this.aH,
                  this.aI,
                  (this.j_byteArr2[3][intValue2] & 255) >> 6,
                  108 + this.e_byteArr[6868 + this.k_byteArr2[2][0]],
                  this.aD + (this.e_byteArr[1515 + this.k_byteArr2[2][0]] == 0 ? 0 : 1),
                  -1,
                  this.aG - 5
               );
         } else {
            this.renderer.a_void4(this.aH, this.aI, (this.j_byteArr2[3][intValue2] & 255) >> 6, this.aD, this.aG - 5);
         }
      } else {
         if (intValue1 == 4) {
            if (this.aG != 1) {
               int intValue3 = this.aG;
               this.bb = 0 + this.aH + (this.j_byteArr2[21][intValue3] & 127);
               this.bc = 0 + this.aI + this.j_byteArr2[22][intValue3];
               this.bd = this.j_byteArr2[23][intValue3];
               this.be = this.j_byteArr2[24][intValue3];
               c_void8(frameGraphics[this.N_byte], this.bb, this.bc, this.bd, this.be);
               return;
            }

            this.bb = 0;
            this.bc = 0;
            this.bd = 700;
            this.be = 544;
            c_void8(frameGraphics[this.N_byte], this.bb, this.bc, this.bd, this.be);
         }
      }
   }

   // $VF: renamed from: j (int) void
   private void j_void2(int intValue1) {
      if (intValue1 - 1 == 1123) {
         int intValue2 = this.r_byteArr[this.as_byte];
         if (this.ad_byte != 6) {
            intValue2 = intValue2 == 16 ? this.e_byteArr[8749 + this.q_int] : intValue2 + -6 + 20;
         }

         byte byteValue1 = this.a_byteArr[this.a_shortArr[138] + 468 + intValue2];
         int intValue3 = 0;

         for (int loopIndex1 = 0; loopIndex1 < 3; loopIndex1++) {
            if (this.a_byteArr[this.a_shortArr[138] + (10 + loopIndex1) * 26 + intValue2] != 0) {
               int intValue4 = this.aI - this.a_byteArr[this.a_shortArr[283] + 2] * (byteValue1 - 1) / 2 + (this.a_byteArr[this.a_shortArr[283] + 2] + 2) * intValue3;
               intValue3++;
               this.a_void7(632 + loopIndex1, this.aH - 10 + 3, intValue4);
               this.renderer
                  .a_void3(
                     this.aH + 19,
                     intValue4,
                     (this.j_byteArr2[3][intValue1] & 255) >> 6,
                     String.valueOf(this.a_byteArr[this.a_shortArr[138] + (10 + loopIndex1) * 26 + intValue2]),
                     0
                  );
            }
         }
      } else if (intValue1 - 1 == 1112) {
         int intValue5 = this.r_byteArr[this.as_byte] + 12;
         int intValue6 = 0;

         for (int loopIndex2 = 0; loopIndex2 < 3; loopIndex2++) {
            if (this.a_byteArr[this.a_shortArr[138] + (10 + loopIndex2) * 26 + intValue5] != 0) {
               int intValue7 = this.aH - 34 * (this.a_byteArr[this.a_shortArr[138] + 468 + intValue5] - 1) / 2 + 30 * intValue6;
               intValue6++;
               this.a_void7(632 + loopIndex2, intValue7 - 2 - 4, this.aI);
               this.renderer
                  .a_void3(
                     intValue7 + 15,
                     this.aI,
                     (this.j_byteArr2[3][intValue1] & 255) >> 6,
                     String.valueOf(this.a_byteArr[this.a_shortArr[138] + (10 + loopIndex2) * 26 + intValue5]),
                     0
                  );
            }
         }

         this.d_intArr[8] = 0;
         if (this.e_byteArr[8749 + this.q_int] == 6 && this.r_byteArr[this.as_byte] != 1) {
            this.d_intArr[8] = -20;
         }
      } else {
         switch (intValue1 - 1) {
            case 1077:
               this.aD /= 21;
            default:
               this.a_void7(this.aG + this.aD, this.aH, this.aI);
         }
      }
   }

   // $VF: renamed from: k (int) void
   private void k_void2(int intValue1) {
      switch (intValue1 - 1) {
         case 1047:
         case 1051:
         case 1055:
         case 1063:
         case 1067:
            if (this.aD < 0 || this.a_byteArr[this.a_shortArr[126] + this.aD] == -1) {
               return;
            }

            this.aD = this.e_byteArr[this.b_shortArr[this.a_byteArr[this.a_shortArr[126] + this.aD]] + this.l_byte]
               + this.a_byteArr[this.a_shortArr[127] + this.aD];
         case 1048:
         case 1049:
         case 1050:
         case 1052:
         case 1053:
         case 1054:
         case 1056:
         case 1057:
         case 1058:
         case 1060:
         case 1061:
         case 1062:
         case 1064:
         case 1065:
         case 1066:
         case 1068:
         case 1069:
         case 1070:
         default:
            break;
         case 1059:
            this.aD = (9 - this.aD) * 2 + 1;
            break;
         case 1071:
            if (this.aD == 0 || this.e_byteArr[3535 + this.l_byte] == 0 || this.e_byteArr[3535 + this.l_byte] == 15) {
               return;
            }
      }

      switch (intValue1 - 1) {
         case 1018:
            this.renderer
               .a_void3(
                  this.aH, this.aI, (this.j_byteArr2[3][intValue1] & 255) >> 6, this.aD + "/" + this.a_shortArr2[0][16], this.aG - 1
               );
            return;
         default:
            this.renderer.a_void3(this.aH, this.aI, (this.j_byteArr2[3][intValue1] & 255) >> 6, String.valueOf(this.aD), this.aG - 1);
      }
   }

   // $VF: renamed from: c () boolean
   private boolean c_bool2() {
      this.G_bool = false;
      if (this.aB == 0) {
         for (int loopIndex1 = 0; loopIndex1 < 5; loopIndex1++) {
            if (this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[146] + loopIndex1]] != this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + 0] + loopIndex1]) {
               this.G_bool = true;
               this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + 0] + loopIndex1] = this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[146] + loopIndex1]];
               this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + 0] + loopIndex1] = 1;
            }
         }
      } else if (this.aB == 1 || this.aB == 9) {
         this.x();
      } else if (this.aB == 2 || this.aB == 5) {
         this.z();
      } else if (this.aB == 4) {
         this.y();
      } else if (this.aB == 6) {
         this.A();
      } else if (this.aB == 7 || this.aB == 8) {
         if (this.d_shortArr[46] != this.r_byteArr[this.as_byte] || this.b_boolArr[this.aB]) {
            this.d_shortArr[46] = this.r_byteArr[this.as_byte];
            this.G_bool = true;
            if (this.r_byteArr[this.as_byte] < 10) {
               this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB]] = this.r_byteArr[this.as_byte];
               this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB] + 1] = this.a_byteArr[this.a_shortArr[138]
                  + 338
                  + this.r_byteArr[this.as_byte]
                  + 12];
               this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB] + 2] = this.a_byteArr[this.a_shortArr[138]
                  + 364
                  + this.r_byteArr[this.as_byte]
                  + 12];
            }
         }
      } else if (this.aB == 10) {
         if (this.Q_byte == 16 && this.z_int != this.y_int) {
            this.k_byteArr[53] = 1;
         }
      } else if (this.aB != 11) {
         if (this.aB == 15) {
            this.d_shortArr[73] = (short)(98 + this.m_byte);
            if (this.z_int != this.y_int) {
               this.k_byteArr[72] = 1;
               this.G_bool = true;
            }
         } else if (this.aB == 12) {
            if (this.am_byte >= 51 && this.q_byte <= 2) {
               this.am_byte = 51;
            }

            this.d_shortArr[57] = this.a_shortArr2[0][17] == this.am_byte ? 104 : (short)(108 + this.e_byteArr[6868 + this.am_byte]);
            if (this.Q_byte == 17 && this.al_byte == 3 && (this.ai_byte == 35 || this.ai_byte == 50 || this.ai_byte == 54)) {
               this.d_shortArr[57] = 105;
            }

            this.d_shortArr[58] = this.e_byteArr[2727 + this.am_byte];
            if (this.z_int != this.y_int) {
               this.k_byteArr[56] = 1;
               this.G_bool = true;
            }
         } else if (this.aB == 13) {
            this.d_shortArr[62] = (short)(82 + (this.q_byte == 7 ? 21 : this.a_byteArr[this.a_shortArr[248] + this.q_byte]));
            this.d_shortArr[63] = this.ak_byte;
            if (this.z_int != this.y_int) {
               this.k_byteArr[61] = 1;
               this.G_bool = true;
            }
         } else if (this.aB == 14) {
            this.T_bool = this.W_int != 0;
            this.U_bool = this.W_int + ag_byte < this.c_short;
            this.Q_bool = this.X_int == 0;
            this.R_bool = this.X_int + ah_byte >= this.d_short;
            if (this.d_shortArr[66] != this.W_int || this.d_shortArr[71] != this.X_int) {
               this.d_shortArr[66] = (short)this.W_int;
               this.d_shortArr[71] = (short)this.X_int;
               this.D();
            }

            this.k_byteArr[66] = 1;
            this.ad_int = this.ae_int = 0;
         } else if (this.aB == 17) {
            this.B();
         } else if (this.aB == 16) {
            if (this.z_int != this.y_int) {
               this.k_byteArr[76] = 1;
               this.G_bool = true;
            }
         } else if (this.aB == 18 || this.aB == 19) {
            for (int loopIndex2 = 0; loopIndex2 < this.a_byteArr[this.a_shortArr[307] + this.m_byte]; loopIndex2++) {
               this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB] + loopIndex2] = (byte)(loopIndex2 == this.Z_int ? 1 : 0);
            }
         }
      }

      return this.G_bool;
   }

   // $VF: renamed from: x () void
   private void x() {
      this.k_byteArr[47] = this.ay_byte;

      for (int loopIndex1 = 0; loopIndex1 < 2; loopIndex1++) {
         this.k_byteArr[48 + loopIndex1] = (byte)(this.F_byte == 2 + loopIndex1 ? 2 : (this.a_byteArr2[2 + loopIndex1][0] > 0 ? 1 : 0));
      }

      this.k_byteArr[50] = (byte)(41 + this.u_byteArr[0]);
      this.k_byteArr[51] = this.a_byteArr[this.a_shortArr[304] + this.u_byteArr[0]];

      for (int loopIndex2 = this.a_byteArr[this.a_shortArr[195] + 60 + 9]; loopIndex2 < this.a_byteArr[this.a_shortArr[195] + 60 + 9] + 5; loopIndex2++) {
         if (this.k_byteArr[loopIndex2] != -1) {
            if (this.d_shortArr[loopIndex2] != this.k_byteArr[loopIndex2]) {
               this.d_shortArr[loopIndex2] = this.k_byteArr[loopIndex2];
               this.k_byteArr[loopIndex2] = 1;
               this.G_bool = true;
            } else {
               this.k_byteArr[loopIndex2] = 0;
            }
         }
      }
   }

   // $VF: renamed from: y () void
   private void y() {
      for (int loopIndex1 = 0; loopIndex1 < 23; loopIndex1++) {
         if (this.e_byteArr[this.b_shortArr[this.a_byteArr[this.a_shortArr[147] + loopIndex1]] + this.l_byte]
            != this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + 4] + loopIndex1]) {
            this.G_bool = true;
            this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + 4] + loopIndex1] = this.e_byteArr[this.b_shortArr[this.a_byteArr[this.a_shortArr[147] + loopIndex1]]
               + this.l_byte];
            this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + 4] + loopIndex1] = 1;
         }
      }

      if (this.k_byteArr[11] == 1 || this.k_byteArr[12] == 1) {
         this.k_byteArr[11] = this.k_byteArr[12] = 1;
      }

      if (this.e_byteArr[3636 + this.l_byte] == 0) {
         this.d_shortArr[29] = 0;
      }

      this.d_shortArr[14] = (short)(108 + this.e_byteArr[6868 + this.l_byte]);
   }

   // $VF: renamed from: z () void
   private void z() {
      if (this.d_shortArr[4] > 0) {
         this.v_int = this.d_shortArr[4];
         this.k_byteArr[5] = this.k_byteArr[3] = -1;
         this.G_bool = true;
      } else {
         if (this.d_shortArr[5] != this.r_byteArr[this.as_byte] || this.b_boolArr[this.aB]) {
            this.d_shortArr[5] = this.r_byteArr[this.as_byte];
            this.k_byteArr[5] = this.k_byteArr[3] = 1;
            this.d_shortArr[3] = this.r_byteArr[this.as_byte] >= 10
               ? (short)(21 + this.r_byteArr[this.as_byte] - 10)
               : (
                  this.r_byteArr[this.as_byte] >= 0
                     ? (short)(12 + this.r_byteArr[this.as_byte])
                     : (this.K_bool ? 41 : (!this.F_bool && this.V_bool ? 29 : (short)(108 + this.e_byteArr[6868 + -this.r_byteArr[this.as_byte]])))
               );
            this.k_byteArr[4] = -1;
            this.G_bool = true;
         }
      }
   }

   // $VF: renamed from: A () void
   private void A() {
      if (this.d_shortArr[36] != this.r_byteArr[this.as_byte] || this.b_boolArr[this.aB]) {
         this.v_int = 0 + this.r_byteArr[this.as_byte];
         this.d_shortArr[36] = this.r_byteArr[this.as_byte];
         this.k_byteArr[36] = this.k_byteArr[38] = this.k_byteArr[34] = 1;
         this.k_byteArr[35] = this.k_byteArr[37] = 1;
         this.G_bool = true;
      }

      if (this.z_int != this.y_int) {
         this.k_byteArr[38] = 1;
         this.G_bool = true;
      }

      this.d_shortArr[34] = (short)(0 + this.r_byteArr[this.as_byte]);
   }

   // $VF: renamed from: B () void
   private void B() {
      if (this.v_byte == 1) {
         this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB]] = (byte)(this.w_byte != 3
               && this.Y_int != 4
               && (
                  this.q_int <= 0 || this.e_byteArr[8749 + this.q_int] != 0 || this.r_byteArr[this.as_byte] < 0 || this.r_byteArr[this.as_byte] > 5
               )
            ? (this.w_byte != 4 && this.w_byte != 2 ? 1 : 0)
            : 2);
         this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB] + 1] = (byte)(this.K_bool
            ? 2
            : (this.w_byte != 1 && this.F_byte == -1 && (this.ad_byte == 1 || this.ad_byte == 9) ? 1 : 0));
      } else if (this.Q_byte == 32) {
         this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB]] = 2;
         this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB] + 1] = 3;
      } else {
         this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB]] = this.a_byteArr[this.a_shortArr[153] + 116 + this.Q_byte];
         this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB] + 1] = this.a_byteArr[this.a_shortArr[153] + 145 + this.Q_byte];
      }

      for (int loopIndex1 = this.a_byteArr[this.a_shortArr[195] + 60 + 17]; loopIndex1 < this.a_byteArr[this.a_shortArr[195] + 60 + 17] + 2; loopIndex1++) {
         if (this.d_shortArr[loopIndex1] != this.k_byteArr[loopIndex1]) {
            this.d_shortArr[loopIndex1] = this.k_byteArr[loopIndex1];
            this.k_byteArr[loopIndex1] = 1;
            this.G_bool = true;
         } else {
            this.k_byteArr[loopIndex1] = 0;
         }
      }
   }

   // $VF: renamed from: a (int, byte, int) void
   private void a_void9(int intValue1, byte byteValue1, int intValue2) {
      boolean flag1 = false;

      for (int loopIndex1 = 0; loopIndex1 < this.aV; loopIndex1++) {
         this.N_int = intValue1;
         int intValue3 = aU * loopIndex1;
         byte byteValue2 = 1;
         if (this.aW + loopIndex1 == this.as_byte) {
            byteValue2 = 0;
         } else if (byteValue1 == 2) {
            continue;
         }

         this.b_void2(this.b_shortArr2[1][intValue1] & 4095, this.aX + intValue3, intValue2 - 1);
         this.a_void7(552 + byteValue2, this.aX + intValue3, intValue2);
         byte byteValue3;
         GameResources resourcesRef1;
         byte byteValue4;
         int intValue4;
         int intValue5;
         int intValue6;
         if ((byteValue3 = this.r_byteArr[this.aW + loopIndex1]) < 0) {
            this.a_void4(-byteValue3, this.aX + intValue3 - -1, intValue2 + 8 + 2 + 3, -8, (byte)29);
            if (!this.V_bool || this.F_bool || this.aW + loopIndex1 != this.as_byte) {
               continue;
            }

            resourcesRef1 = this;
            byteValue4 = 18;
            intValue4 = this.aX + intValue3;
            intValue5 = intValue2;
            intValue6 = this.f_int;
         } else {
            if (byteValue3 <= 8) {
               this.a_void7(664 + byteValue3, this.aX + intValue3, intValue2);
               byte byteValue5 = 0;
               byte byteValue6 = 0;
               if (this.e_byteArr[8749 + this.q_int] == 6) {
                  byteValue5 = -1;
                  byteValue6 = 6;
               }

               this.renderer
                  .a_void3(this.aX + intValue3 + 19 + byteValue5 + 6, intValue2 + 5 + byteValue6 + 2, 1, String.valueOf(this.s_byteArr[loopIndex1 + this.aW]), 0);
               if (this.e_byteArr[8749 + this.q_int] != 6 && this.aW + loopIndex1 < this.av_byte && this.aW + loopIndex1 == this.as_byte) {
                  this.d_void(3, this.aX + intValue3 + 6, intValue2 + 2 + 2, this.f_int);
                  this.S_bool = true;
               }
               continue;
            }

            resourcesRef1 = this;
            byteValue4 = byteValue3;
            intValue4 = this.aX + intValue3;
            intValue5 = intValue2;
            intValue6 = this.aW + loopIndex1 == this.as_byte ? this.f_int : 0;
         }

         resourcesRef1.d_void(byteValue4, intValue4, intValue5, intValue6);
      }

      if (this.T_bool) {
         this.d_void(1, this.aX - 9, intValue2 + 8 - 0, this.e_int);
      }

      if (this.U_bool) {
         this.d_void(2, this.aX + this.aY - 9 + 9, intValue2 + 8 - 0, this.e_int);
      }
   }

   // $VF: renamed from: c (int, int, int) void
   private void c_void2(int intValue1, int intValue2, int intValue3) {
      int intValue4 = this.a_byteArr[this.a_shortArr[283] + 2] + 6;
      int intValue5 = 0;
      this.ab_int = this.a_byteArr[this.a_shortArr[152] + this.Q_byte + 1] - this.a_byteArr[this.a_shortArr[152] + this.Q_byte];
      int intValue6 = intValue2 + this.j_byteArr2[23][this.b_shortArr2[1][intValue1] & 4095] / 2 * 4;
      int intValue7 = intValue3 - this.ab_int * intValue4 / 2 + intValue4 / 2;

      for (int loopIndex1 = 0; loopIndex1 < this.ab_int; loopIndex1++) {
         if (loopIndex1 == this.Z_int) {
            intValue5 = intValue7;
         }

         this.b_void2(this.b_shortArr2[1][intValue1] & 4095, intValue2, intValue7);
         this.renderer.a_void4(intValue6, intValue7, 1, 57 + this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + this.Q_byte] + loopIndex1], 0);
         intValue7 += intValue4;
      }

      this.renderer.a_void6(frameGraphics[this.N_byte]);
      this.d_void(2, intValue6 - 50 - 20, intValue5 + 4, this.e_int);
      this.d_void(1, intValue6 + 49 + 20, intValue5 + 4, this.e_int);
   }

   // $VF: renamed from: a (int) void
   final void a_void10(int intValue1) {
      af_byte = (byte)(af_byte + intValue1);
      if (af_byte > 98) {
         af_byte = 98;
      }

      this.n_byteArr[2] = this.n_byteArr[3] = this.n_byteArr[4] = af_byte;

      for (int loopIndex1 = 0; loopIndex1 < 5; loopIndex1++) {
         frameGraphics[M_byte].setColor(this.f_intArr[loopIndex1]);
         b_void8(frameGraphics[M_byte], 110 + this.l_byteArr[loopIndex1], 232 + this.m_byteArr[loopIndex1], this.n_byteArr[loopIndex1], this.o_byteArr[loopIndex1]);
      }

      if (!this.y_bool) {
         this.midlet.splashCanvas.a();
         Thread.yield();
      } else {
         this.l_void();
      }
   }

   // $VF: renamed from: c (byte) void
   private void c_void3(byte byteValue1) {
      boolean flag1 = false;

      try {
         System.gc();
         Thread.yield();
         DataInputStream dataInput1 = new DataInputStream(this.getClass().getResourceAsStream("/pi8"));

         byte byteValue2;
         for (byte byteIndex1 = 0; byteIndex1 < 12 && (byteValue2 = (byte)(dataInput1.readByte() & 255)) != 255; byteIndex1++) {
            short shortValue1;
            byte[] arrayValue1 = new byte[shortValue1 = (short)(byteValue2 << 8 | dataInput1.readByte() & 255)];
            dataInput1.read(arrayValue1, 0, shortValue1);
            if (byteIndex1 == byteValue1) {
               this.spriteImages[2][0] = Image.createImage(arrayValue1, 0, shortValue1);
               break;
            }
         }

         dataInput1.close();
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: C () void
   private void C() {
      this.aK = this.c_short > ag_byte ? ag_byte : this.c_short;
      this.aL = this.d_short > ah_byte ? ah_byte : this.d_short;
      this.N_byte = 1;
      this.b_void2(this.b_shortArr2[1][1188] & 4095, 0, 0);
      int intValue1 = 0;
      int intValue2 = 0;
      boolean flag1 = false;

      for (int loopIndex1 = 0; loopIndex1 < this.aL; loopIndex1++) {
         int intValue3 = 0;
         int intValue4 = -1;

         for (int loopIndex2 = 0; loopIndex2 <= this.aK; loopIndex2++) {
            if (loopIndex2 == this.aK) {
               flag1 = true;
            } else {
               this.e_void(this.W_int + loopIndex2, this.X_int + loopIndex1);
            }

            if (!flag1 && this.aM == intValue4) {
               intValue2++;
            } else {
               if (intValue2 > 0) {
                  frameGraphics[this.N_byte].setColor(intValue4);
                  b_void8(frameGraphics[this.N_byte], intValue3 * 7 - 0, (this.aJ + intValue1) * 4 - 0, intValue2 * 7, 4);
                  intValue2 = 0;
               }

               if (flag1) {
                  flag1 = false;
               } else {
                  intValue4 = this.aM;
                  intValue3 = loopIndex2;
                  intValue1 = loopIndex1;
                  intValue2 = 1;
               }
            }
         }
      }
   }

   // $VF: renamed from: D () void
   private void D() {
      this.N_byte = M_byte;
      int intValue1 = (this.b_shortArr2[1][1188] >> 12 & 3) << 7;
      this.b_void2(this.b_shortArr2[1][1188] & 4095, 160 + this.j_byteArr2[1][1188] + 0, 120 + this.j_byteArr2[2][1188] + 0 + intValue1);
      a_bool6(
         frameGraphics[M_byte],
         frameBuffers[this.c_byteArr[1]],
         (this.ad_int + 1) / 2 * 7,
         (this.ae_int + 1) / 2 * 4,
         7 * ag_byte,
         4 * ah_byte,
         160 + this.j_byteArr2[1][1188] + (-this.ad_int + 1) / 2 * 7,
         120 + this.j_byteArr2[2][1188] + (-this.ae_int + 1) / 2 * 4 + intValue1,
         0
      );
      frameGraphics[this.c_byteArr[1]]
         .drawImage(frameBuffers[this.c_byteArr[0]], -(160 + this.j_byteArr2[1][1188] + 0) * 1, -(120 + this.j_byteArr2[2][1188] + 0 + intValue1) * 1, 0);
      int intValue2 = (this.ad_int + 1 >> 1) * (this.aK - 1);
      int intValue3 = (this.ae_int + 1 >> 1) * (this.aL - 1);
      this.N_byte = 1;
      if (this.ae_int == 0) {
         frameGraphics[this.N_byte].setColor(11180356);
         b_void8(frameGraphics[this.N_byte], intValue2 * 7 - 0, intValue3 - 0, 7, ah_byte * 4);

         for (int loopIndex1 = 0; loopIndex1 < this.aL; loopIndex1++) {
            this.e_void(this.W_int + intValue2, this.X_int + loopIndex1);
            frameGraphics[this.N_byte].setColor(this.aM);
            b_void8(frameGraphics[this.N_byte], intValue2 * 7 - 0, (this.aJ + loopIndex1) * 4 - 0, 7, 4);
         }
      } else if (this.ad_int == 0) {
         for (int loopIndex2 = 0; loopIndex2 < this.aK; loopIndex2++) {
            this.e_void(this.W_int + loopIndex2, this.X_int + intValue3);
            frameGraphics[this.N_byte].setColor(this.aM);
            b_void8(frameGraphics[this.N_byte], loopIndex2 * 7 - 0, (this.aJ + intValue3) * 4 - 0, 7, 4);
         }
      }
   }

   // $VF: renamed from: e (int, int) void
   private void e_void(int intValue1, int intValue2) {
      this.aM = -1;
      byte byteValue1;
      if ((byteValue1 = this.a_byte6(intValue1, intValue2)) != 2) {
         if (this.c_byteArr2[intValue2][intValue1] <= 0) {
            if (this.c_byteArr2[intValue2][intValue1] < 0) {
               this.aM = this.b_intArr2[byteValue1][b_byte2(this.c_byteArr2[intValue2][intValue1]) + 9];
            }
         } else {
            this.aM = a_byte2(this.c_byteArr2[intValue2][intValue1]) == 1 && (this.e_byteArr[7979 + this.c_byteArr2[intValue2][intValue1]] & 2) != 0
               ? -1
               : this.b_intArr2[byteValue1][a_byte2(this.c_byteArr2[intValue2][intValue1]) + 6];
         }

         if (this.aM == -1) {
            this.aM = this.b_intArr2[byteValue1][this.a_byteArr[this.a_shortArr[194] + (this.b_byteArr2[intValue2][intValue1] & 255)]];
            return;
         }
      } else {
         this.aM = 6049325;
      }
   }

   // $VF: renamed from: E () void
   private void E() {
      this.W_int = this.I_byte - ag_byte / 2 + (this.O_byte >> 1);
      this.W_int = this.W_int < 0 ? 0 : (this.W_int + ag_byte >= this.c_short ? this.c_short - ag_byte : this.W_int);
      if (ah_byte > this.d_short) {
         this.aJ = ah_byte - this.d_short >> 1;
      } else {
         this.X_int = this.K_byte - ah_byte / 2 + (this.P_byte >> 1);
         this.X_int = this.X_int < 0 ? 0 : (this.X_int + ah_byte >= this.d_short ? this.d_short - ah_byte : this.X_int);
      }
   }

   // $VF: renamed from: F () void
   private void F() {
      if (this.c_int == -1 && this.a_byteArr[this.a_shortArr[153] + 0 + this.Q_byte] == 1) {
         this.G();
      } else if (this.a_byteArr[this.a_shortArr[153] + 0 + this.Q_byte] == 1) {
         this.H();
      } else if (this.Q_byte == 23) {
         this.I();
      } else if (this.Q_byte == 15) {
         this.J();
      } else if (this.Q_byte == 17) {
         this.P();
      } else if (this.Q_byte == 20) {
         this.K();
      } else if (this.Q_byte == 18) {
         if (this.H_bool) {
            this.H_bool = false;
            this.b_boolArr[13] = true;
            this.b_boolArr[11] = true;
            this.a_void8((byte)11, 0, 0);
            this.a_void8((byte)17, 0, 240);
         }

         this.a_void8((byte)13, 0, 0);
      } else if (this.Q_byte == 19) {
         this.L();
      } else if (this.Q_byte == 24) {
         if (this.H_bool) {
            this.H_bool = false;
            this.b_boolArr[11] = this.b_boolArr[16] = true;
            this.a_void8((byte)11, 0, 0);
            this.a_void8((byte)16, 0, 0);
            this.a_void8((byte)17, 0, 240);
         }
      } else if (this.Q_byte == 25) {
         this.M();
      } else if (this.Q_byte == 27) {
         this.N();
      } else if (this.Q_byte == 32 && this.H_bool) {
         this.H_bool = false;

         try {
            frameGraphics[M_byte].drawImage(Image.createImage("/l3"), 0, 0, 20);
         } catch (Exception ignoredException1) {
         }

         this.b_boolArr[17] = true;
         this.a_void8((byte)17, 0, 240);
      }

      this.N_byte = this.c_byteArr[1];
   }

   // $VF: renamed from: G () void
   private void G() {
      if (this.H_bool) {
         this.H_bool = false;
         this.N_byte = this.c_byteArr[1];
         frameGraphics[this.N_byte].setColor(9422847);
         b_void8(frameGraphics[this.N_byte], 0, 0, this.a_intArr[this.N_byte], this.b_intArr[this.N_byte]);
         frameGraphics[this.N_byte].setColor(940839);
         b_void8(frameGraphics[this.N_byte], 0, 0 + this.b_intArr[this.N_byte] - 64, this.a_intArr[this.N_byte], 64);
         this.S_int = 0;
         this.T_int = 160;
         this.a_void2(1118, (byte)2);
         if (this.Q_byte == this.U_byte
            || this.Q_byte == 3
            || this.Q_byte == 12
            || this.Q_byte == 13
            || this.Q_byte == 2
            || this.Q_byte == this.V_byte
            || this.Q_byte == 9
            || this.Q_byte == 14) {
            this.k_byteArr[53] = -1;
            this.k_byteArr[54] = 1;
         } else if (this.Q_byte == 16 || this.Q_byte == 21 || this.Q_byte == 22) {
            this.k_byteArr[53] = 1;
            this.k_byteArr[54] = -1;
         }

         this.k_byteArr[52] = -1;
      }

      this.N_byte = M_byte;
      frameGraphics[this.N_byte].drawImage(frameBuffers[this.c_byteArr[1]], 0, 240, 36);
      frameGraphics[this.N_byte].setColor(9422847);
      b_void8(frameGraphics[this.N_byte], 0, 0, this.a_intArr[this.N_byte], 80);

      for (int loopIndex1 = 0; loopIndex1 < 4; loopIndex1++) {
         if (this.a_intArr2[0][loopIndex1] > 320 || this.a_intArr2[0][3] == -1000) {
            this.a_intArr2[0][loopIndex1] = -88 - this.a_int2(65535, 80);
            this.a_intArr2[1][loopIndex1] = this.a_int2(65535, 48);
            this.a_intArr2[2][loopIndex1] = this.a_int2(255, 4);
         }

         this.a_void7(
            1674 + this.a_intArr2[2][loopIndex1],
            this.a_intArr2[0][loopIndex1] = this.a_intArr2[0][loopIndex1] + (this.a_intArr2[2][loopIndex1] + 2 >> 1),
            this.a_intArr2[1][loopIndex1] = this.a_intArr2[1][loopIndex1] + (this.a_int2(255, 5) == 0 ? this.a_int2(255, 3) - 1 : 0)
         );
      }

      if (this.Q_byte == this.U_byte
         || this.Q_byte == 12
         || this.Q_byte == 13
         || this.Q_byte == 2
         || this.Q_byte == this.V_byte
         || this.Q_byte == 9
         || this.Q_byte == 14) {
         this.k_byteArr[53] = -1;
         this.k_byteArr[54] = 1;
      } else if (this.Q_byte == 16 || this.Q_byte == 21 || this.Q_byte == 22) {
         this.k_byteArr[53] = 1;
         this.k_byteArr[54] = -1;
      }

      this.k_byteArr[52] = -1;
      this.b_boolArr[10] = true;
      this.a_void7(1672, 160, 0);
      this.S_int = 0;
      this.T_int = 192;
      this.a_void2(1118, (byte)1);
      this.a_void8((byte)10, 65, 54);
      this.b_boolArr[17] = true;
      this.a_void8((byte)17, 0, 240);
   }

   // $VF: renamed from: H () void
   private void H() {
      if (this.H_bool) {
         this.H_bool = false;
         this.O();
         if (this.Q_byte == 10 || this.Q_byte == 11 || this.Q_byte == 12 || this.Q_byte == 13) {
            this.k_byteArr[53] = -1;
            this.k_byteArr[54] = 1;
         } else if (this.Q_byte == 16 || this.Q_byte == 21 || this.Q_byte == 22) {
            this.k_byteArr[53] = 1;
            this.k_byteArr[54] = -1;
         }

         this.k_byteArr[52] = -1;
         this.b_boolArr[10] = true;
      }

      this.a_void8((byte)10, 65, 32);
      this.a_void8((byte)17, 0, 240);
   }

   // $VF: renamed from: I () void
   private void I() {
      if (this.H_bool) {
         this.H_bool = false;
         this.b_boolArr[11] = true;
         this.v_int = 69;
         this.k_byteArr[55] = 1;
         this.a_void8((byte)11, 0, 0);
         this.k_byteArr[55] = -1;
      }
   }

   // $VF: renamed from: J () void
   private void J() {
      if (this.H_bool) {
         this.H_bool = false;
         this.b_boolArr[11] = this.b_boolArr[15] = true;
         this.a_void8((byte)11, 0, 0);
         this.a_void8((byte)17, 0, 240);
      }

      this.a_void8((byte)15, 0, 0);
      this.a_void8((byte)17, 0, 240);
   }

   // $VF: renamed from: K () void
   private void K() {
      if (this.H_bool) {
         this.H_bool = false;
         this.A_bool = true;
         this.n();
         this.u();
         this.O();
         this.b_boolArr[12] = true;
      }

      this.a_void8((byte)12, 0, 0);
      this.a_void8((byte)17, 0, 240);
   }

   // $VF: renamed from: L () void
   private void L() {
      if (this.H_bool) {
         this.H_bool = false;
         this.b_boolArr[11] = true;
         this.a_void8((byte)11, 0, 0);
         this.b_boolArr[14] = true;
         this.C();
      }

      this.a_void8((byte)14, 160, 120);
      this.b_boolArr[17] = true;
      this.a_void8((byte)17, 0, 240);
   }

   // $VF: renamed from: M () void
   private void M() {
      if (this.H_bool) {
         this.H_bool = false;
         if (!this.I_bool) {
            this.O();
            frameGraphics[1].drawImage(frameBuffers[0], 0, 0, 0);
         }

         this.b_boolArr[2] = true;
      }

      a_bool6(frameGraphics[0], frameBuffers[1], 0, 0, 350, 240 - this.aZ, 0, 0, 0);
      this.a_void8((byte)(18 + this.m_byte), 0, 0);
      this.a_void8((byte)2, 0, this.d_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + 2]]);
      this.a_void8((byte)17, 0, 240);
      this.I_bool = true;
   }

   // $VF: renamed from: N () void
   private void N() {
      if (this.ab_bool) {
         this.ab_bool = false;
         this.x_int = this.v_int;
         this.v_int = 61;
         this.b_boolArr[11] = true;
         this.k_byteArr[55] = 1;
         this.a_void8((byte)11, 0, 0);
         this.k_byteArr[55] = -1;
         this.a_void8((byte)17, 0, 240);
      }
   }

   // $VF: renamed from: O () void
   private void O() {
      this.c_byteArr[9] = this.c_byteArr[8] = 0;
      a_bool6(frameGraphics[this.c_byteArr[0]], frameBuffers[this.c_byteArr[1]], 0, 0, 350, this.A_int, 0, this.ba - this.ax_byte + this.aP, 0);

      for (byte byteIndex1 = 0; byteIndex1 < 20; byteIndex1++) {
         if (this.a_boolArr[byteIndex1]) {
            this.b_boolArr[byteIndex1] = true;
            this.a_void8(byteIndex1, 0, this.d_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + byteIndex1]]);
            this.N_byte = this.c_byteArr[0];
            if (this.a_byteArr[this.a_shortArr[195] + 20 + byteIndex1] == 1 && this.Q_byte != 20) {
               this.a_void7(526, 0, 0 + this.ba);
            } else if (this.a_byteArr[this.a_shortArr[195] + 20 + byteIndex1] == 2) {
               this.a_void7(532, 0, 240 - this.aZ);
            }
         }
      }

      this.c_byteArr[9] = this.c_byteArr[8] = 2;
   }

   // $VF: renamed from: P () void
   private void P() {
      if (this.aN > 0 && !this.J_bool) {
         this.aN += 4;
         frameGraphics[M_byte].setColor(0);
         b_void8(frameGraphics[M_byte], 0, 0, 320, 16 + this.aN);
         b_void8(frameGraphics[M_byte], 0, 256 - this.aN, 320, this.aN);
         this.c_bool = true;
         if (this.aN - 4 <= 120) {
            return;
         }

         this.aN = -this.aN;
         this.c_bool = false;
         this.i_void();
      }

      if (this.H_bool && !this.J_bool) {
         this.b_boolArr[12] = true;
         frameGraphics[M_byte].setColor(0);
         b_void8(frameGraphics[M_byte], 0, 0, 320, 96);
         b_void8(frameGraphics[M_byte], 0, 192, 320, 64);
      }

      if (this.a_byteArr[this.a_shortArr[155] + 0 + this.aR] == 1) {
         if (this.aQ >= 0) {
            if (this.aQ >= this.a_byteArr[this.a_shortArr[155] + 84 + this.aR] && this.am_byte == 0) {
               if (this.am_byte == 0 && this.aR != 0) {
                  this.aQ = -1;
                  this.j_bool = true;
                  return;
               }
            } else {
               this.N_byte = 0;
               frameGraphics[M_byte].setColor(0);
               b_void8(frameGraphics[M_byte], 0, 96, 320, 96);
               this.d_void(100 + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR], 160, 136, this.am_byte == 0 ? this.aQ : this.f_int);
               this.d_void(106, 160, 136, this.f_int);
               this.aQ = this.am_byte == 0 ? this.aQ + 1 : this.aQ;
            }
         }
      } else if (this.a_byteArr[this.a_shortArr[155] + 0 + this.aR] >= 2 || this.a_byteArr[this.a_shortArr[155] + 0 + this.ao_byte] >= 2) {
         this.Q();
         this.R();
      }

      this.H_bool = false;
      if (this.aN < 0) {
         this.aN += 4;
         this.c_bool = true;
         if (this.aN >= -48) {
            this.aN = 0;
            this.c_bool = false;
            this.i_void();
         }
      }

      if (this.aN == 0 && this.al_byte != 0) {
         this.a_void8((byte)12, 0, 0);
         this.a_void8((byte)17, 0, 240);
      }
   }

   // $VF: renamed from: Q () void
   private void Q() {
      if (this.aR > 0 && this.aQ >= 0 && (this.aN == 0 || this.H_bool)) {
         if (this.aQ == 0 && this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] > 0) {
            for (int loopIndex1 = 0; loopIndex1 < this.p_byteArr.length; loopIndex1++) {
               if (this.p_byteArr[loopIndex1] != 0) {
                  int intValue1 = loopIndex1 > 6 ? 6 : loopIndex1;
                  if (this.a_byteArr[this.a_shortArr[196] + intValue1 * 33 + 0 + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3] != 0) {
                     this.e_byteArr[2929 + this.p_byteArr[loopIndex1]] = this.a_byteArr[this.a_shortArr[196]
                        + intValue1 * 33
                        + 0
                        + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3];
                     this.e_byteArr[1313 + this.p_byteArr[loopIndex1]] = this.a_byteArr[this.a_shortArr[196]
                        + intValue1 * 33
                        + 2
                        + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3];
                     this.e_byteArr[2828 + this.p_byteArr[loopIndex1]] = 105;
                  }

                  if (this.a_byteArr[this.a_shortArr[196] + intValue1 * 33 + 1 + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3] != 0) {
                     this.e_byteArr[606 + this.p_byteArr[loopIndex1]] = (byte)(
                        -10 + this.a_byteArr[this.a_shortArr[196] + intValue1 * 33 + 1 + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3]
                     );
                     this.e_byteArr[808 + this.p_byteArr[loopIndex1]] = 0;
                  }

                  this.e_byteArr[3030 + this.p_byteArr[loopIndex1]] = 0;
               }
            }
         }

         if (this.aQ >= this.a_byteArr[this.a_shortArr[155] + 84 + this.aR]) {
            this.aQ = -2;
            if (this.al_byte == 0) {
               this.j_bool = true;
               return;
            }
         }

         this.aQ++;
         if (this.aQ > 0) {
            this.j_void();
         }
      }
   }

   // $VF: renamed from: R () void
   private void R() {
      if (this.an_byte != 0 || this.a_byteArr[this.a_shortArr[155] + 84 + this.ao_byte] >= -1 || this.aQ > 0) {
         if (this.H_bool) {
            this.A_bool = true;
            this.N_byte = 1;
            this.n();
            this.aP = 0;
         }

         if (this.J_bool) {
            if (this.H_bool) {
               this.H_bool = false;
               this.A_bool = true;
               this.n();
               this.u();
               this.O();
               this.b_boolArr[12] = true;
               return;
            }
         } else if (this.aN == 0 || this.H_bool) {
            this.aO = 0;
            if (this.aR == 24) {
               this.aO = this.a_int2(255, 8);
            }

            a_bool6(frameGraphics[this.c_byteArr[0]], frameBuffers[this.c_byteArr[1]], 0, 96, 350, 96 - this.aO, 0, 96 + this.aO, 0);
            if (this.aR == 24) {
               frameGraphics[M_byte].setColor(0);
               b_void8(frameGraphics[M_byte], 88, 0, 320, 8);
               b_void8(frameGraphics[M_byte], 0, 192, 320, 16);
            }

            this.N_byte = 0;
            this.bb = 0;
            this.bc = 96;
            this.bd = 350;
            this.be = 96;
            c_void8(frameGraphics[this.N_byte], this.bb, this.bc, this.bd, this.be);
            this.u();
            this.bb = 0;
            this.bc = 0;
            this.bd = 700;
            this.be = 544;
            c_void8(frameGraphics[this.N_byte], this.bb, this.bc, this.bd, this.be);
         }
      }
   }

   // $VF: renamed from: b (int) void
   final void b_void3(int intValue1) {
      this.i_void();
      if (intValue1 >= 0) {
         this.ai_byte = (byte)intValue1;
         this.S();
         this.T();
      } else {
         if (this.ak_byte == this.aj_byte - 1) {
            this.U();
            return;
         }

         this.ak_byte++;
      }

      this.o_int = 0;
      this.v_int = 71 + this.ak_byte;
      this.o_byte = (byte)(this.a_byteArr[this.a_shortArr[154] + this.q_byte] + this.ak_byte);
      this.aR = this.a_byteArr[this.a_shortArr[311] + 229 + this.aS + this.ak_byte];
      this.aQ = this.a_byteArr[this.a_shortArr[155] + 84 + this.aR] < 0 ? -1 : 0;
      this.al_byte = this.a_byteArr[this.a_shortArr[311] + 0 + this.aS + this.ak_byte];
      this.am_byte = this.p_byteArr[this.al_byte];
      this.an_byte = this.a_byteArr[this.a_shortArr[311] + 458 + this.aS + this.ak_byte];
      if (this.an_byte > 100) {
         this.f_void3(this.an_byte, -2);
      } else if (this.an_byte == 99) {
         this.am_byte = this.p_byteArr[0];
         this.f_void3(this.am_byte, -2);
      } else if (this.an_byte > 0) {
         this.f_void3(this.p_byteArr[this.an_byte], -2);
      } else if (this.an_byte == -100) {
         if (this.ai_byte == 51) {
            this.I_byte = 8;
            this.K_byte = 67;
         }

         this.f_void3(-100, -2);
      } else if (this.an_byte < 0) {
         this.f_void3(this.an_byte, -3);
         if (this.ai_byte == 36 || this.ai_byte == 38) {
            this.I_byte = (byte)(this.I_byte + 4);
            this.K_byte--;
         }
      }

      this.H_bool = true;
   }

   // $VF: renamed from: S () void
   private void S() {
      this.aJ();
      this.t();
      this.ak_byte = 0;
      this.Z_int = 0;
      this.renderer.a_void2(this.ai_byte);
      this.aS = this.a_byteArr[this.a_shortArr[310] + 0 + this.ai_byte] & 255;
      this.ao_byte = this.a_byteArr[this.a_shortArr[311] + 229 + this.aS];
      if (this.ai_byte == 4 || this.ao_byte == 0) {
         this.a_byteArr[this.a_shortArr[311] + 229 + this.aS] = this.ao_byte = 27;
      }

      this.aj_byte = (byte)((this.a_byteArr[this.a_shortArr[310] + 0 + this.ai_byte + 1] & 255) - this.aS);
      this.J_bool = this.ao_byte >= 27;
      this.v_byte = 0;
      this.R_byte = this.Q_byte;
      this.Q_byte = 17;
      this.aN = this.a_byteArr[this.a_shortArr[155] + 56 + this.ao_byte];
      if (this.aN == 1) {
         this.O();
      }

      if (this.ao_byte != 9 && !this.J_bool && this.aN != 1) {
         this.K_byte--;
      }

      this.d_boolArr = new boolean[]{
         this.a_boolArr[0],
         this.a_boolArr[1],
         this.a_boolArr[2],
         this.a_boolArr[4],
         this.a_boolArr[5],
         this.a_boolArr[6],
         this.a_boolArr[7],
         this.a_boolArr[8],
         this.a_boolArr[9]
      };
      this.a_void17(true, true, false, false);
      this.s_bool = true;
      byte byteValue1 = this.a_byteArr[this.a_shortArr[310] + 71 + this.ai_byte];
      System.arraycopy(
         this.a_byteArr,
         this.a_shortArr[156] + this.a_byteArr[this.a_shortArr[157] + byteValue1],
         this.p_byteArr,
         0,
         this.a_byteArr[this.a_shortArr[157] + byteValue1 + 1] - this.a_byteArr[this.a_shortArr[157] + byteValue1]
      );
   }

   // $VF: renamed from: T () void
   private void T() {
      if (this.ai_byte == 3) {
         this.d_void3(5, 20, 2);
         this.e_byteArr[6161 + this.p_byteArr[2]] = 3;
         this.e_byteArr[2828 + this.p_byteArr[2]] = 105;
         this.e_byteArr[6262 + this.p_byteArr[2]] = 5;
         this.e_byteArr[6363 + this.p_byteArr[2]] = 10;
         this.e_byteArr[1313 + this.p_byteArr[2]] = 3;
         this.e_byteArr[5050 + this.p_byteArr[2]] = -1;
      } else if (this.ai_byte == 37) {
         this.engine.l_void2();
         this.aw_byte = 1;
         this.engine.a_void16(4, 46, 9, (byte)0, (byte)9);
         this.a_byte3((byte)0, (byte)48, (byte)9, (byte)3, (byte)0);
         this.e_byteArr[2934] = 14;
         this.e_byteArr[611] = 2;
         this.aw_byte = 2;
         this.engine.a_void16(1, 44, 9, (byte)1, (byte)2);
         this.engine.a_void16(1, 45, 11, (byte)1, (byte)2);
         this.e_byteArr[658] = 7;
         this.engine.a_void16(1, 48, 11, (byte)1, (byte)2);
         this.e_byteArr[659] = 5;
         this.engine.a_void16(2, 48, 9, (byte)1, (byte)2);
         this.a_shortArr2[0][17] = 0;
      } else if (this.ai_byte == 38) {
         this.engine.l_void2();
         this.a_byte4((byte)0, 2, 52, 18, 2, true, -1);
         this.a_byte4((byte)0, 2, 54, 16, 2, true, -1);
         this.a_byte4((byte)0, 2, 55, 19, 2, true, -1);
         this.a_byte4((byte)0, 2, 58, 19, 2, true, -1);
         this.aw_byte = 0;
         this.engine.a_void16(5, 60, 12, (byte)0, (byte)0);
         this.aw_byte = 2;
         this.d_void3(57, 17, 1);
         this.renderer.a_void();
      } else if (this.ai_byte == 43) {
         this.b_void5(52, 7);
      } else if (this.ai_byte == 45) {
         this.engine.m_void2();
         this.b_void5(57, 30);
         this.b_void7(1, 54, 30, 5);
         this.b_void7(1, 54, 31, 5);
         this.b_void7(1, 55, 31, 5);
         this.b_void7(1, 55, 32, 5);
      } else {
         if (this.ai_byte == 48) {
            this.q_byte = 2;
            this.aM();
            this.engine.f_byte = 6;
            this.aN();
            this.q_byte = 3;
            this.a_byte4((byte)0, 24, 18, 67, 2, true, -1);
            this.a_byte4((byte)0, 25, 19, 69, 2, true, -1);
            this.a_byte4((byte)0, 25, 21, 71, 2, true, -1);
            this.a_shortArr2[0][12] = 0;
            this.a_byte3((byte)0, (byte)26, (byte)69, (byte)60, (byte)0);
            this.a_shortArr2[0][17] = 1;
            this.engine.a_void16(7, 26, 69, (byte)0, (byte)2);
            this.d_void3(23, 69, 1);
            this.engine.a_void16(2, 1, 69, (byte)1, (byte)3);
            this.a_byte3((byte)1, (byte)21, (byte)69, (byte)60, (byte)0);
            this.e_byteArr[659] = 0;
            this.e_byteArr[2982] = 42;
            this.f_void3(53, -2);
            this.e_byteArr[657] = 0;
         }
      }
   }

   // $VF: renamed from: U () void
   private void U() {
      this.engine.d_void2();
      if (this.ai_byte == 26) {
         this.s_bool = false;
         this.c_void4();
         this.s_bool = true;
      }

      if (this.ao_byte == 9) {
         this.engine.f_void2();
      } else if (this.ai_byte == 28) {
         this.d_void3(5, 11, 0);
         this.engine.I_byte = (byte)(this.engine.I_byte & 254);
         this.engine.d_shortArr[this.a_byteArr[this.a_shortArr[292] + 4]] = 0;
      } else if (this.ai_byte == 34) {
         this.d_void3(48, 15, 5);
         this.engine.I_byte = 0;
      } else if (this.ai_byte == 38) {
         this.d_void3(65, 18, 1);
         this.u_byte = 1;
      } else if (this.ai_byte == 44) {
         for (int loopIndex1 = 0; loopIndex1 < 10; loopIndex1++) {
            this.e_byteArr[9601 + loopIndex1] = this.am_byte;
         }

         this.d_void3(53, 5, 0);
         this.f_void3(this.am_byte, -2);
         this.renderer.a_void();
      } else if (this.ai_byte == 48) {
         this.u_byte = 1;
         this.d_void3(45, 69, 6);
      }

      for (int loopIndex2 = 0; loopIndex2 < this.p_byteArr.length; loopIndex2++) {
         if (this.e_byteArr[2828 + this.p_byteArr[loopIndex2]] == 105) {
            if (this.e_byteArr[4646 + this.p_byteArr[loopIndex2]] < 0) {
               this.e_byteArr[2828 + this.p_byteArr[loopIndex2]] = 69;
            } else {
               this.e_byteArr[2828 + this.p_byteArr[loopIndex2]] = 57;
            }
         }

         this.p_byteArr[loopIndex2] = 0;
      }

      if (this.engine.f_byte >= 50) {
         this.engine.F_int = this.ai_byte == 15 ? 1000000 : this.c_int;
         this.engine.f_byte = (byte)(this.engine.f_byte - 49);
         this.engine.g_byte = this.a_byteArr[this.a_shortArr[294] + this.engine.f_byte - 1];
         this.engine.J_byte = 0;
      }

      if (this.ao_byte != 9) {
         this.J_byte = this.I_byte;
         this.L_byte = this.K_byte = this.J_bool && !this.d_boolArr[3] ? this.K_byte : (byte)(this.K_byte + 1);
      } else {
         this.I_byte = this.J_byte;
         this.K_byte = this.L_byte;
      }

      this.s_bool = false;
      this.aK();
      this.J_byte = this.I_byte;
      this.L_byte = this.K_byte;
      if (this.ai_byte != 0
         && this.ai_byte != 1
         && (this.ai_byte != 2 || this.p_byte == 0)
         && this.ai_byte != 32
         && this.ai_byte != 36
         && this.ai_byte != 37
         && this.ai_byte != 39
         && this.ai_byte != 46
         && this.ai_byte != 47
         && this.ai_byte != 49
         && this.ai_byte != 55) {
         if (this.ai_byte != 59) {
            this.v_byte = 1;
         }

         this.A_bool = true;
         this.a_void18(
            this.d_boolArr[0],
            this.d_boolArr[1],
            this.d_boolArr[2],
            this.d_boolArr[3],
            this.d_boolArr[4],
            this.d_boolArr[5],
            this.d_boolArr[6],
            this.d_boolArr[7],
            this.d_boolArr[8]
         );
         this.Q_byte = this.R_byte;
      } else {
         this.ai_byte++;
         this.Q_byte = 28;
         this.b_void3(this.ai_byte);
         if (this.ai_byte == 47) {
            this.Q_byte = 18;
            this.o_byte = this.a_byteArr[this.a_shortArr[154] + 8];
         }
      }
   }

   // $VF: renamed from: d (int, int, int) void
   private void d_void3(int intValue1, int intValue2, int intValue3) {
      for (int loopIndex1 = 0; loopIndex1 < this.p_byteArr.length; loopIndex1++) {
         if (loopIndex1 == intValue3 || loopIndex1 >= 6) {
            this.e_void2(intValue1, intValue2, this.p_byteArr[loopIndex1]);
         }
      }
   }

   // $VF: renamed from: e (int, int, int) void
   private void e_void2(int intValue1, int intValue2, int intValue3) {
      this.e_byteArr[2828 + intValue3] = 69;
      this.e_byteArr[3131 + intValue3] = (byte)intValue1;
      this.e_byteArr[3232 + intValue3] = (byte)intValue2;
      this.e_byteArr[6161 + intValue3] = 2;
      this.e_byteArr[4747 + intValue3] = 0;
      this.e_byteArr[7979 + intValue3] = (byte)(this.e_byteArr[7979 + intValue3] & 191);
   }

   // $VF: renamed from: c () void
   final void c_void4() {
      this.c_short = this.e_short;
      this.d_short = this.f_short;
      this.q_byte++;
      this.aP();
      this.engine.G_int = this.a_shortArr[219] + this.q_byte * 4;
   }

   // $VF: renamed from: a (byte, byte, byte) void
   final void a_void11(byte byteValue1, byte byteValue2, byte byteValue3) {
      if (byteValue1 >= 18 || this.l_int != 0 && this.Q_byte != 17 && (byteValue1 == 18 || !this.K_bool) && this.u_byte <= 0) {
         this.Z_int = 0;
         this.o_int = 0;
         this.i_void();
         this.ap_byte = byteValue1;
         this.v_byte = 0;
         this.Q_byte = 20;
         this.H_bool = true;
         this.v_int = 12 + byteValue1;
         this.am_byte = byteValue2;
         this.an_byte = byteValue3;
         this.d_boolArr = new boolean[]{
            this.a_boolArr[0],
            this.a_boolArr[1],
            this.a_boolArr[2],
            this.a_boolArr[4],
            this.a_boolArr[5],
            this.a_boolArr[6],
            this.a_boolArr[7],
            this.a_boolArr[8],
            this.a_boolArr[9]
         };
         this.a_void17(this.a_boolArr[0], true, false, this.a_boolArr[4]);
         this.A_bool = true;
         if (byteValue1 != 4 && byteValue1 != 5 && byteValue1 != 14 && byteValue1 != 15) {
            this.a_byteArr[this.a_shortArr[153] + 145 + 20] = 2;
         } else {
            this.a_byteArr[this.a_shortArr[153] + 145 + 20] = 0;
         }
      }
   }

   protected final void keyPressed(int intValue1) {
      if (!this.n_bool) {
         if (!this.o_bool) {
            this.o_bool = true;
            if (a_bool4(intValue1)) {
               this.j_byte = 0;
               if (intValue1 == a_int || intValue1 == -a_int || intValue1 == 117) {
                  l_bool = true;
               } else if (intValue1 != b_int && intValue1 != -b_int && intValue1 != 106) {
                  if (this.a_bool && this.y_bool) {
                     this.m_void2(intValue1);
                  }

                  switch (intValue1) {
                     case 106:
                     case 107:
                     case 108:
                     case 111:
                     case 112:
                     case 113:
                     case 115:
                     case 116:
                     case 117:
                     case 119:
                     case 120:
                     default:
                        try {
                           this.m_int = this.getGameAction(intValue1);
                        } catch (Exception ignoredException1) {
                           this.m_int = 666;
                        }

                        if (intValue1 == 103) {
                           this.i_bool = true;
                           this.t_bool = true;
                           this.n_int++;
                           if (!this.u_bool) {
                              this.E_byte = 0;
                           }

                           return;
                        } else if (intValue1 == 116) {
                           this.e_bool = true;
                           return;
                        } else if (intValue1 == 98) {
                           this.f_bool = true;
                           return;
                        } else if (intValue1 == 102) {
                           this.g_bool = true;
                           return;
                        } else if (intValue1 == 104) {
                           this.h_bool = true;
                           return;
                        } else {
                           if (this.m_int != 8 && intValue1 != 103) {
                              if (this.m_int == 1 || intValue1 == 116) {
                                 this.e_bool = true;
                                 return;
                              }

                              if (this.m_int == 6 || intValue1 == 98) {
                                 this.f_bool = true;
                                 return;
                              }

                              if (this.m_int == 2 || intValue1 == 102) {
                                 this.g_bool = true;
                                 return;
                              }

                              if (this.m_int == 5 || intValue1 == 104) {
                                 this.h_bool = true;
                              }
                           } else {
                              this.i_bool = true;
                              this.t_bool = true;
                              this.n_int++;
                              if (!this.u_bool) {
                                 this.E_byte = 0;
                                 return;
                              }
                           }

                           return;
                        }
                     case 109:
                        this.i_byte = 0;
                        return;
                     case 110:
                        this.i_byte = 9;
                        this.w_bool = true;
                        return;
                     case 114:
                        this.i_byte = 1;
                        this.w_bool = true;
                        return;
                     case 118:
                        this.i_byte = 7;
                        this.w_bool = true;
                        return;
                     case 121:
                        this.i_byte = 3;
                        this.w_bool = true;
                  }
               } else {
                  m_bool = true;
               }
            }
         }
      }
   }

   protected final void keyReleased(int intValue1) {
      if (!this.n_bool) {
         if (a_bool4(intValue1)) {
            this.j_byte = 0;
            switch (intValue1) {
               case 106:
               case 107:
               case 108:
               case 111:
               case 112:
               case 113:
               case 115:
               case 116:
               case 117:
               case 119:
               case 120:
               default:
                  try {
                     this.m_int = this.getGameAction(intValue1);
                  } catch (Exception ignoredException1) {
                     this.m_int = 666;
                  }

                  if (intValue1 == 103 || this.m_int == 8) {
                     this.t_bool = false;
                     if (this.E_byte < 4) {
                        this.v_bool = true;
                     }
                  }

                  if (this.o_bool) {
                     this.p_bool = true;
                     return;
                  } else if (intValue1 == 116) {
                     this.e_bool = false;
                     return;
                  } else if (intValue1 == 98) {
                     this.f_bool = false;
                     return;
                  } else if (intValue1 == 102) {
                     this.g_bool = false;
                     return;
                  } else if (intValue1 == 104) {
                     this.h_bool = false;
                     return;
                  } else {
                     if (intValue1 != 116 && this.m_int != 1) {
                        if (intValue1 != 98 && this.m_int != 6) {
                           if (intValue1 != 102 && this.m_int != 2) {
                              if (intValue1 == 104 || this.m_int == 5) {
                                 this.h_bool = false;
                              }

                              return;
                           }

                           this.g_bool = false;
                           return;
                        }

                        this.f_bool = false;
                        return;
                     }

                     this.e_bool = false;
                     return;
                  }
               case 109:
                  return;
               case 110:
                  this.w_bool = false;
                  return;
               case 114:
                  this.w_bool = false;
                  return;
               case 118:
                  this.w_bool = false;
                  return;
               case 121:
                  this.w_bool = false;
            }
         }
      }
   }

   // $VF: renamed from: a (int) boolean
   private static boolean a_bool4(int intValue1) {
      return intValue1 == -10 ? false : intValue1 != 100 && intValue1 != 107;
   }

   // $VF: renamed from: V () void
   private void V() {
      this.W();
      if (this.u_bool && this.i_bool) {
         this.i_bool = false;
         this.aF();
      } else if (this.t_bool && this.w_byte != 3) {
         this.i_bool = false;
         this.aE();
      } else {
         this.F_int = 0;
      }

      if (this.I_int >= 4 && this.w_byte == 1) {
         this.aG();
      } else if (this.I_int > 0 && this.I_int < 4 && !this.w_bool) {
         this.aH();
      }

      if (this.v_bool) {
         this.v_bool = false;
         this.E_byte = 4;
         this.i_bool = false;
         byte byteValue1 = this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte];
         if (this.w_byte == 1 && this.W_byte >= 51 && this.W_byte <= 100) {
            this.y_byte = (byte)(this.e_byteArr[0 + this.W_byte] - this.I_byte);
            this.A_byte = (byte)(this.e_byteArr[101 + this.W_byte] - this.K_byte);
            this.e_void3(this.W_byte);
         } else if (this.w_byte == 1 && a_byte2(byteValue1) != 0) {
            this.e_void3(byteValue1);
         } else if (this.w_byte == 3) {
            this.X();
         } else if (a_byte2(byteValue1) == 0) {
            this.d_void4(byteValue1);
         } else if (this.w_byte == 0 && b_byte2(byteValue1) == 0) {
            this.f_void2((byte)(-byteValue1));
         } else if (a_byte2(this.W_byte) == 0) {
            this.d_void4(this.W_byte);
            this.y_byte = (byte)(this.e_byteArr[0 + this.W_byte] - this.I_byte);
            this.A_byte = (byte)(this.e_byteArr[101 + this.W_byte] - this.K_byte);
         }

         this.E_bool = true;
         this.e_int = 0;
      }

      this.aL();
      if (this.ad_int == 0 && this.ae_int == 0 && !this.C_bool) {
         this.Y();
      }
   }

   // $VF: renamed from: W () void
   private void W() {
      if (l_bool) {
         l_bool = false;
         if (this.w_byte != 3) {
            this.a_void18(true, false, false, false, true, false, false, false, false);
            this.w_byte = 2;
            this.Z();
         }
      } else if (m_bool) {
         m_bool = false;
         if (this.w_byte != 3) {
            if (this.w_byte != 1 && this.F_byte == -1) {
               this.v_byte = 0;
               this.Q_byte = (byte)(this.q_byte < 7 ? (this.t_byte > -1 ? 10 : 11) : (this.W_bool ? 10 : 11));
               this.R_byte = 28;
               this.Z_int = 0;
               this.H_bool = true;
               this.X_bool = false;
               this.z_byte = this.y_byte;
               this.B_byte = this.A_byte;
               this.J_byte = this.I_byte;
               this.L_byte = this.K_byte;
               return;
            }

            this.k_bool = true;
            return;
         }

         this.s_int = 0;
         this.l_void2(-1);
      }

      if (this.i_byte == 1) {
         this.i_byte = -1;
         if (this.ay_byte == 1) {
            this.ay_byte = 0;
            this.y_byte = this.C_byte;
            this.I_byte = (byte)(this.k_byteArr2[0][0] - this.y_byte);
            this.A_byte = this.D_byte;
            this.K_byte = (byte)(this.k_byteArr2[1][0] - this.A_byte);
            this.aK();
            this.A_bool = true;
         }
      } else if (this.i_byte == 3) {
         this.i_byte = -1;
         if (this.q_byte == 3) {
            this.a_void11((byte)20, (byte)1, (byte)0);
         } else {
            this.v_byte = 0;
            this.Q_byte = 19;
            this.H_bool = true;
            this.v_int = -1;
            this.Q_bool = this.R_bool = true;
            this.c_bool = true;
            this.z_byte = this.y_byte;
            this.B_byte = this.A_byte;
            this.J_byte = this.I_byte;
            this.L_byte = this.K_byte;
            this.E();
            this.i_void();
         }
      }
   }

   // $VF: renamed from: X () void
   private void X() {
      if (this.r_bool) {
         if (this.s_int == 100) {
            if (this.O_bool) {
               this.N_bool = this.O_bool;
               this.L_bool = this.M_bool = false;
               this.engine.b_void3();
            } else if (this.M_bool) {
               this.L_bool = this.M_bool;
               this.engine.b_void3();
            }

            this.q_byteArr[0] = (byte)(this.I_byte + this.y_byte);
            this.q_byteArr[1] = (byte)(this.K_byte + this.A_byte);
            this.l_void2(-1);
            return;
         }

         if (this.s_int < 0) {
            this.e_byteArr[3131 + this.r_int] = this.e_byteArr[8383 + this.q_int];
            this.e_byteArr[3232 + this.r_int] = this.e_byteArr[8444 + this.q_int];
            this.e_byteArr[2828 + this.r_int] = (byte)(44 + -this.s_int - 1);
            this.e_byteArr[6161 + this.r_int] = 3;
            return;
         }

         if (this.s_int <= 3) {
            this.n_byte = 0;

            while (this.n_byte < 29 && this.b_byteArr3[0][0][this.n_byte] != 0) {
               this.n_byte++;
            }

            this.b_byteArr3[0][1][this.n_byte] = (byte)this.s_int;
            if (this.b_byteArr3[0][1][this.n_byte] == 3) {
               this.b_byteArr3[0][0][this.n_byte] = (byte)this.q_int;
               this.b_byteArr3[0][2][this.n_byte] = (byte)(this.I_byte + this.y_byte);
               this.b_byteArr3[0][3][this.n_byte] = (byte)(this.K_byte + this.A_byte);
               this.l_void2(-1);
               return;
            }

            if (a_byte2(this.r_int) == 0) {
               this.b_byteArr3[0][0][this.n_byte] = (byte)this.q_int;
               this.b_byteArr3[0][2][this.n_byte] = (byte)this.r_int;
               return;
            }
         } else if (this.b_bool4(this.I_byte + this.t_int, this.K_byte + this.u_int)
            && this.a_byte4((byte)0, this.s_int, this.I_byte + this.t_int, this.K_byte + this.u_int, 1, false, -1) > 0) {
            this.l_void2(-1);
            this.w_byte = 2;
         }
      }
   }

   // $VF: renamed from: d (byte) void
   private void d_void4(byte byteValue1) {
      if (this.n_int > 1) {
         this.n_int = 0;
         this.B_int = this.I_byte - 1;
         this.C_int = this.K_byte - 1;
         this.D_int = this.O_byte;
         this.E_int = this.P_byte;
         this.u_bool = true;
         this.t_bool = true;
         this.aF();
         this.a_void17(true, true, false, false);
         this.k_byte = this.l_byte = 0;
      } else {
         if (this.e_byteArr[1919 + byteValue1] > 0) {
            this.a_void17(false, true, false, true);
            this.w_byte = 1;
            this.k_byte = this.l_byte = byteValue1;
            this.F_byte = -1;
         }
      }
   }

   // $VF: renamed from: e (byte) void
   private void e_void3(byte byteValue1) {
      if (this.F_byte != -1) {
         for (int loopIndex1 = 0; loopIndex1 < 50; loopIndex1++) {
            if (this.a_byteArr2[this.F_byte][loopIndex1] > 0) {
               this.a_void12(this.a_byteArr2[this.F_byte][loopIndex1], byteValue1);
            }
         }
      } else {
         this.a_void12(this.k_byte, byteValue1);
      }

      this.n_int = 0;
   }

   // $VF: renamed from: a (byte, byte) void
   private void a_void12(byte byteValue1, byte byteValue2) {
      if (this.e_byteArr[505 + byteValue1] >= 10 || this.N_bool || this.L_bool && (this.e_byteArr[7979 + byteValue1] & 64) != 0) {
         if (b_byte2(byteValue2) == 0 && this.e_byteArr[8749 + -byteValue2] == 6) {
            this.a_void17(true, false, true, false);
            this.q_int = -byteValue2;
            this.w_byte = 2;
            this.Z();
         } else {
            if (this.n_int > 1
               || this.e_byteArr[3131 + byteValue1] == this.y_byte + this.I_byte && this.e_byteArr[3232 + byteValue1] == this.A_byte + this.K_byte) {
               this.q_bool = true;
               if (this.e_byteArr[7777 + byteValue1] == 0) {
                  this.e_byteArr[7777 + byteValue1] = 3;
                  this.engine.b_byte3(byteValue1);
                  if (this.e_byteArr[7777 + byteValue1] > 0) {
                     this.e_byteArr[1111 + byteValue1] = (byte)(
                        (this.e_byteArr[1111 + byteValue1] & 240)
                           + this.a_byteArr[this.a_shortArr[129 + (this.e_byteArr[606 + byteValue1] & 1) * 2]
                              + this.a_byteArr[this.a_shortArr[129 + (this.e_byteArr[606 + byteValue1] & 1) * 2 + 1] + this.e_byteArr[1010 + byteValue1] - 5]
                              + (this.e_byteArr[1111 + byteValue1] & 15)]
                     );
                  }
               }
            } else if (this.e_byteArr[7777 + byteValue1] > 0) {
               this.e_byteArr[1111 + byteValue1] = (byte)(
                  (this.e_byteArr[1111 + byteValue1] & 240)
                     + this.a_byteArr[this.a_shortArr[133 + (this.e_byteArr[606 + byteValue1] & 1) * 2]
                        + this.a_byteArr[this.a_shortArr[133 + (this.e_byteArr[606 + byteValue1] & 1) * 2 + 1] + this.e_byteArr[1010 + byteValue1] - 5]
                        + (this.e_byteArr[1111 + byteValue1] & 15)]
               );
               this.e_byteArr[7777 + byteValue1] = 0;
            }

            this.e_byteArr[3131 + byteValue1] = (byte)(this.y_byte + this.I_byte);
            this.e_byteArr[3232 + byteValue1] = (byte)(this.A_byte + this.K_byte);
            this.e_byteArr[7979 + byteValue1] = (byte)(this.e_byteArr[7979 + byteValue1] & 223);
            this.e_byteArr[6161 + byteValue1] = 2;
            this.e_byteArr[4747 + byteValue1] = byteValue2;
            this.ab_byte = (byte)(this.y_byte + this.I_byte);
            this.ac_byte = (byte)(this.A_byte + this.K_byte);
            this.aa_byte = (byte)((a_byte2(byteValue2) == 1 || b_byte2(byteValue2) == 1 || b_bool3(byteValue2))
                  && this.a_byte6(this.y_byte + this.I_byte, this.A_byte + this.K_byte) == 0
               ? 2
               : 1);
         }
      } else {
         this.engine.a_void19((byte)12, byteValue1, 0);
      }
   }

   // $VF: renamed from: c (int) void
   final void c_void5(int intValue1) {
      for (int loopIndex1 = (intValue1 - 1) / 50 * 30 + 1; loopIndex1 <= (intValue1 - 1) / 50 * 30 + 30; loopIndex1++) {
         if (this.e_byteArr[8810 + loopIndex1] == intValue1 && (this.e_byteArr[8749 + loopIndex1] != 2 || this.e_byteArr[8627 + loopIndex1] != 0)) {
            this.a_void13(loopIndex1, false);
            this.e_byteArr[8810 + loopIndex1] = 0;
            this.e_byteArr[9298 + loopIndex1] = 0;
            return;
         }

         if ((this.e_byteArr[8627 + loopIndex1] == 2 || this.e_byteArr[8627 + loopIndex1] == 1) && this.e_byteArr[9237 + loopIndex1] == intValue1) {
            this.e_byteArr[9237 + loopIndex1] = 0;
         }
      }
   }

   // $VF: renamed from: a (int, boolean) void
   final void a_void13(int intValue1, boolean flag1) {
      for (byte byteIndex1 = this.e_byteArr[8993 + intValue1]; byteIndex1 > 0; byteIndex1 = this.e_byteArr[4545 + byteIndex1]) {
         if ((this.e_byteArr[4646 + byteIndex1] != 0 || flag1)
            && (this.e_byteArr[8749 + intValue1] != 11 || this.e_byteArr[8627 + intValue1] != 0 || this.a_byteArr[this.a_shortArr[18] + this.e_byteArr[6565 + byteIndex1]] == 0)
            && this.e_byteArr[2929 + byteIndex1] != -108
            && this.e_byteArr[2929 + byteIndex1]
               != this.a_byteArr[this.a_shortArr[173] + this.a_byteArr[this.a_shortArr[174] + this.e_byteArr[8749 + intValue1]] + this.e_byteArr[4646 + byteIndex1]]
            && this.e_byteArr[2929 + byteIndex1]
               != this.a_byteArr[this.a_shortArr[176] + this.a_byteArr[this.a_shortArr[177] + this.e_byteArr[8749 + intValue1]] + this.e_byteArr[4646 + byteIndex1]]) {
            this.a_void15(byteIndex1, intValue1, false, false);
         }
      }
   }

   // $VF: renamed from: f (byte) void
   private void f_void2(byte byteValue1) {
      if (this.e_byteArr[8749 + byteValue1] == 3 && this.e_byteArr[8932 + byteValue1] == 0) {
         this.r_byteArr[0] = this.as_byte = 0;
         this.l_void2(4);
      } else {
         this.a_void17(true, false, true, false);
         this.q_int = byteValue1;
         this.w_byte = 2;
         this.k_byte = 0;
         this.Z();
      }
   }

   // $VF: renamed from: Y () void
   private void Y() {
      if (!this.B_bool) {
         if (this.g_bool) {
            if (this.y_byte > this.C_byte) {
               this.y_byte--;
               return;
            }

            if (this.I_byte > 0) {
               this.I_byte--;
               this.ad_int = -1;
               return;
            }

            if (this.y_byte > 0) {
               this.y_byte--;
               return;
            }
         } else if (this.h_bool) {
            if (this.y_byte < this.C_byte) {
               this.y_byte++;
               return;
            }

            if (this.I_byte < this.c_short - this.O_byte) {
               this.I_byte++;
               this.ad_int = 1;
               return;
            }

            if (this.I_byte + this.y_byte < this.c_short - 1 - 0) {
               this.y_byte++;
               return;
            }
         } else if (this.e_bool) {
            if (this.A_byte > this.D_byte) {
               this.A_byte--;
               return;
            }

            if (this.K_byte > 0 && !this.a_boolArr[4] || this.K_byte > 1 && this.a_boolArr[4]) {
               this.K_byte--;
               this.ae_int = -1;
               return;
            }

            if (this.A_byte > 0) {
               this.A_byte--;
               return;
            }
         } else if (this.f_bool) {
            if (this.A_byte < this.D_byte) {
               this.A_byte++;
               return;
            }

            if (this.K_byte < this.d_short - this.P_byte - 1 - (this.aZ >> 5)) {
               this.K_byte++;
               this.ae_int = 1;
               return;
            }

            if (this.K_byte + this.A_byte < this.d_short - 2 - 0 - (this.aZ >> 5)) {
               this.A_byte++;
            }
         }
      }
   }

   // $VF: renamed from: Z () void
   private void Z() {
      try {
         if (this.a_boolArr[2] || this.a_boolArr[5] || this.a_boolArr[6]) {
            this.ar_byte = 0;

            for (byte byteIndex1 = 0; byteIndex1 < this.r_byteArr.length; byteIndex1++) {
               this.r_byteArr[byteIndex1] = 0;
            }

            this.at_byte = 99;
            if (this.a_boolArr[2]) {
               this.aa();
               this.ab();
               this.ac();
            } else if (this.a_boolArr[5]) {
               this.ad();
            } else {
               if (!this.a_boolArr[6]) {
                  this.ah();
                  return;
               }

               int intValue1 = this.q_byte > 1 ? 11 : (this.ai_byte < 18 ? 3 : 6);

               for (byte byteIndex2 = 0; byteIndex2 < intValue1; byteIndex2++) {
                  this.r_byteArr[byteIndex2] = this.a_byteArr[this.a_shortArr[137] + byteIndex2];
                  this.ar_byte++;
               }
            }

            if (this.P_bool) {
               for (; this.aW + this.aV > this.ar_byte && this.as_byte != 0; this.as_byte--) {
                  if (this.aW > 0) {
                     this.aW--;
                  }
               }
            } else {
               this.as_byte = 0;
               this.aW = 0;
               this.l_byte = 0;
            }

            this.b_boolArr[this.ad_byte] = true;
            this.aV = aT;
            if (this.ar_byte < this.aV) {
               this.aV = this.ar_byte;
            }

            this.aY = aU * this.aV;
            this.aX = (320 - this.aY + 9) / 2;
            this.ai();
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: aa () void
   private void aa() {
      if (this.e_byteArr[8749 + this.q_int] == 0) {
         this.au_byte = 0;

         while (this.a_byteArr3[0][this.au_byte][11] != this.q_int) {
            this.au_byte++;
         }

         this.av_byte = -1;
         int intValue1 = this.e_byteArr[9115 + this.q_int] - 1;

         for (byte byteIndex1 = this.a_byteArr[this.a_shortArr[144] + intValue1]; byteIndex1 < this.a_byteArr[this.a_shortArr[144] + intValue1 + 1]; byteIndex1++) {
            if (0 + this.a_byteArr[this.a_shortArr[143] + byteIndex1] >= 6 && this.av_byte == -1) {
               this.av_byte = (byte)(byteIndex1 - this.a_byteArr[this.a_shortArr[144] + intValue1]);
            }

            this.r_byteArr[this.ar_byte] = this.a_byteArr[this.a_shortArr[143] + byteIndex1];
            this.s_byteArr[byteIndex1 - this.a_byteArr[this.a_shortArr[144] + intValue1]] = this.a_byteArr3[0][this.au_byte][this.a_byteArr[this.a_shortArr[143] + byteIndex1]];
            this.ar_byte++;
         }

         this.at_byte = 9;
      } else if (this.e_byteArr[8749 + this.q_int] == 6) {
         if (this.k_byte > 0) {
            if (this.e_byteArr[3636 + this.k_byte] > 0) {
               this.r_byteArr[this.ar_byte] = 29;
               this.ar_byte++;
            }
         } else if (this.F_byte != -1) {
            for (byte byteIndex2 = 0; this.a_byteArr2[this.F_byte][byteIndex2] != 0; byteIndex2++) {
               if (this.e_byteArr[3636 + this.a_byteArr2[this.F_byte][byteIndex2]] > 0) {
                  this.r_byteArr[this.ar_byte] = 29;
                  this.ar_byte++;
                  break;
               }
            }
         }

         this.a_shortArr2[0][6] = (short)(this.a_shortArr2[0][3] / 5);
         if (this.a_shortArr2[0][6] > this.at_byte) {
            this.a_shortArr2[0][6] = this.at_byte;
         }

         for (byte byteIndex3 = 0; byteIndex3 < 6; byteIndex3++) {
            if (this.a_shortArr2[0][5 + byteIndex3] > 0) {
               this.r_byteArr[this.ar_byte] = byteIndex3;
               this.s_byteArr[this.ar_byte] = (byte)this.a_shortArr2[0][5 + byteIndex3];
               this.ar_byte++;
            }
         }
      } else {
         if (this.e_byteArr[8749 + this.q_int] == 8) {
            for (byte byteIndex4 = 0; byteIndex4 < this.e_byteArr[9115 + this.q_int] * 2; byteIndex4++) {
               this.r_byteArr[this.ar_byte] = (byte)(19 + byteIndex4);
               this.ar_byte++;
            }
         }
      }
   }

   // $VF: renamed from: ab () void
   private void ab() {
      for (byte byteIndex1 = 0; byteIndex1 < 8; byteIndex1++) {
         this.j_byteArr[byteIndex1] = 0;
      }

      byte byteValue1 = 0;
      int intValue1 = 0;
      if (this.e_byteArr[8810 + this.q_int] > 0 && (this.e_byteArr[8749 + this.q_int] != 2 || this.e_byteArr[8627 + this.q_int] != 0)) {
         this.j_byteArr[0] = this.e_byteArr[8810 + this.q_int];
         intValue1++;
         byteValue1 = 1;
      }

      for (byte byteIndex2 = this.e_byteArr[8993 + this.q_int]; byteIndex2 > 0; byteIndex2 = this.e_byteArr[4545 + byteIndex2]) {
         if (this.e_byteArr[1313 + byteIndex2] > 0
            && (this.e_byteArr[8810 + this.q_int] != byteIndex2 || this.e_byteArr[8749 + this.q_int] == 2 && this.e_byteArr[8627 + this.q_int] == 0)) {
            this.j_byteArr[byteValue1 + this.e_byteArr[4646 + byteIndex2]] = byteIndex2;
            intValue1++;
         }
      }

      byte byteValue2 = 0;

      for (byte byteIndex3 = 0; byteIndex3 < intValue1; byteIndex3++) {
         while (this.j_byteArr[byteValue2] == 0) {
            byteValue2++;
         }

         this.r_byteArr[this.ar_byte] = (byte)(-this.j_byteArr[byteValue2]);
         this.ar_byte++;
         byteValue2++;
      }
   }

   // $VF: renamed from: ac () void
   private void ac() {
      if (this.e_byteArr[8627 + this.q_int] == 2) {
         this.r_byteArr[this.ar_byte] = 28;
         this.ar_byte++;
      } else if (this.e_byteArr[8627 + this.q_int] != 1
         && this.e_byteArr[8749 + this.q_int] < 12
         && this.e_byteArr[9115 + this.q_int] < this.f_byteArr[this.e_byteArr[8749 + this.q_int]]) {
         this.r_byteArr[this.ar_byte] = 16;
         this.ar_byte++;
      }

      if (this.e_byteArr[8627 + this.q_int] == 1) {
         this.r_byteArr[this.ar_byte] = 27;
         this.ar_byte++;
      } else if (this.e_byteArr[8505 + this.q_int] < this.e_byteArr[8566 + this.q_int] && this.e_byteArr[8749 + this.q_int] < 12) {
         this.r_byteArr[this.ar_byte] = 26;
         this.ar_byte++;
      }

      this.r_byteArr[this.ar_byte] = 17;
      this.ar_byte++;
   }

   // $VF: renamed from: ad () void
   private void ad() {
      if (!this.F_bool) {
         if (this.q_byte != 3) {
            this.r_byteArr[this.ar_byte] = 10;
            this.ar_byte++;
         }

         this.r_byteArr[this.ar_byte] = (byte)(this.N_bool ? 15 : 12);
         this.ar_byte++;
         if (!this.N_bool) {
            this.r_byteArr[this.ar_byte] = (byte)(this.L_bool ? 14 : 11);
            this.ar_byte++;
         }

         this.r_byteArr[this.ar_byte] = 13;
         this.ar_byte++;
         this.r_byteArr[this.ar_byte] = (byte)(this.aq_byte + 23);
         this.ar_byte++;
      } else {
         for (this.ao_int = 1; this.ao_int <= 50; this.ao_int++) {
            if (this.e_byteArr[1919 + this.ao_int] > 0 && this.e_byteArr[1414 + this.ao_int] >= 12) {
               this.r_byteArr[this.ar_byte] = (byte)(-this.ao_int);
               this.ar_byte++;
            }
         }

         if (!this.K_bool) {
            for (this.ao_int = 1; this.ao_int <= 50; this.ao_int++) {
               if (this.e_byteArr[1919 + this.ao_int] > 0 && this.e_byteArr[1414 + this.ao_int] < 12) {
                  this.r_byteArr[this.ar_byte] = (byte)(-this.ao_int);
                  this.ar_byte++;
               }
            }
         }

         this.a_void18(false, false, false, true, true, false, false, false, false);
      }
   }

   // $VF: renamed from: ae () void
   private void ae() {
      if (this.n_int > 1) {
         this.n_int = 0;
      } else {
         if (this.g_bool && this.j_byte != 1) {
            if (this.as_byte >= 0) {
               if (this.as_byte > 0) {
                  this.as_byte--;
               }

               if (this.as_byte < this.aW) {
                  this.aW--;
               }

               this.V_bool = false;
               this.ai();
               return;
            }
         } else if (this.h_bool && this.j_byte != 1) {
            if (this.as_byte < this.ar_byte - 1) {
               if (this.as_byte >= this.aV - 1 && this.as_byte - this.aW == this.aV - 1) {
                  this.aW++;
               }

               this.as_byte++;
               this.V_bool = false;
               this.ai();
               return;
            }
         } else if (this.e_bool && this.S_bool) {
            if (this.a_boolArr[6]) {
               if (!this.Q_bool) {
                  this.y_int--;
                  return;
               }
            } else if (this.s_byteArr[this.as_byte] < this.at_byte) {
               this.s_byteArr[this.as_byte]++;
               this.a_byteArr3[0][this.au_byte][this.r_byteArr[this.as_byte]] = this.s_byteArr[this.as_byte];
               return;
            }
         } else if (this.f_bool && this.S_bool) {
            if (this.a_boolArr[6]) {
               if (!this.R_bool) {
                  this.y_int++;
                  return;
               }
            } else if (this.s_byteArr[this.as_byte] > 0) {
               this.s_byteArr[this.as_byte]--;
               this.a_byteArr3[0][this.au_byte][this.r_byteArr[this.as_byte]] = this.s_byteArr[this.as_byte];
               return;
            }
         } else {
            if (this.i_bool || l_bool) {
               this.i_bool = false;
               l_bool = false;
               this.v_bool = false;
               this.E_byte = 4;
               if (this.w_byte == 4 && this.Y_int == 3) {
                  this.l_void2(-2);
                  return;
               }

               if (this.Y_int == 4) {
                  return;
               }

               this.af();
               return;
            }

            if (m_bool) {
               m_bool = false;
               this.ah();
               return;
            }
         }
      }
   }

   // $VF: renamed from: af () void
   private void af() {
      if (this.r_byteArr[this.as_byte] == 13) {
         this.aj();
      } else if (this.r_byteArr[this.as_byte] < 0) {
         if (this.F_bool) {
            if (this.k_byte == this.l_byte) {
               if (this.c_byteArr2[this.e_byteArr[101 + this.k_byte]][this.e_byteArr[0 + this.k_byte]] != this.k_byte) {
                  this.a_void15(this.k_byte, this.e_byteArr[4444 + this.k_byte], true, true);
               }

               if (this.K_bool) {
                  this.a_shortArr2[0][17] = this.k_byte;
                  this.K_bool = false;
                  this.engine.b_void8(this.k_byte);
               }

               this.d_void4(this.k_byte);
               this.F_bool = false;
            }

            this.k_byte = this.l_byte;
         } else if (this.V_bool) {
            this.a_void15(this.l_byte, this.q_int, true, true);
            this.V_bool = false;
         } else {
            this.V_bool = true;
            this.P_bool = true;
         }

         this.f_void3(
            this.e_byteArr[4646 + this.l_byte] >= 0 && this.e_byteArr[2828 + this.l_byte] != 92 && this.e_byteArr[2828 + this.l_byte] != 106
               ? -this.e_byteArr[4444 + this.l_byte]
               : this.l_byte,
            0
         );
      } else if (this.a_boolArr[6]) {
         this.aJ();
         this.l_void2(0);
         this.s_int = this.a_byteArr[this.a_shortArr[138] + 416 + this.r_byteArr[this.as_byte]];
      } else if (this.r_byteArr[this.as_byte] == 17) {
         this.l_void2(3);
      } else if (this.r_byteArr[this.as_byte] == 16 || this.r_byteArr[this.as_byte] == 26) {
         this.b_void4(this.q_int, this.r_byteArr[this.as_byte] == 16);
         this.a_void17(true, true, false, false);
         this.w_byte = 0;
      } else if (this.r_byteArr[this.as_byte] == 27) {
         this.e_byteArr[8566 + this.q_int] = this.a_byteArr[this.a_shortArr[138]
            + (7 + this.e_byteArr[9115 + this.q_int] - 1) * 26
            + this.e_byteArr[8749 + this.q_int]];
         if (this.e_byteArr[8505 + this.q_int] > this.e_byteArr[8566 + this.q_int]) {
            this.e_byteArr[8505 + this.q_int] = this.e_byteArr[8566 + this.q_int];
         }

         if (this.e_byteArr[8505 + this.q_int]
            > this.a_byteArr[this.a_shortArr[138] + (7 + this.e_byteArr[9115 + this.q_int] - 1) * 26 + this.e_byteArr[8749 + this.q_int]]) {
            this.e_byteArr[8505 + this.q_int] = this.a_byteArr[this.a_shortArr[138]
               + (7 + this.e_byteArr[9115 + this.q_int] - 1) * 26
               + this.e_byteArr[8749 + this.q_int]];
         }

         this.e_byteArr[9054 + this.q_int] = (byte)(this.e_byteArr[9054 + this.q_int] | 1);
         this.P_bool = true;
      } else if (this.r_byteArr[this.as_byte] == 28) {
         this.e_byteArr[9054 + this.q_int] = (byte)(this.e_byteArr[9054 + this.q_int] | 1);
         this.P_bool = true;
      } else if (this.r_byteArr[this.as_byte] == 10) {
         this.a_void18(true, false, false, false, false, true, false, false, false);
         this.P_bool = true;
      } else if (this.r_byteArr[this.as_byte] == 11) {
         this.M_bool = true;
         this.l_void2(2);
         this.s_int = 100;
         this.aJ();
      } else if (this.r_byteArr[this.as_byte] == 14) {
         this.L_bool = false;
         this.M_bool = false;
         this.engine.c_void();
         this.P_bool = true;
      } else if (this.r_byteArr[this.as_byte] == 12) {
         this.O_bool = true;
         this.l_void2(2);
         this.s_int = 100;
         this.aJ();
      } else if (this.r_byteArr[this.as_byte] == 15) {
         this.N_bool = false;
         this.O_bool = false;
         this.engine.c_void();
         this.P_bool = true;
      } else if (this.r_byteArr[this.as_byte] >= 23 && this.r_byteArr[this.as_byte] <= 25) {
         this.aq_byte++;
         if (this.aq_byte > 2) {
            this.aq_byte = 0;
         }

         this.P_bool = true;
      } else if (this.r_byteArr[this.as_byte] >= 6 && this.r_byteArr[this.as_byte] <= 8) {
         this.l_void2(2);
         this.s_int = 20 + this.r_byteArr[this.as_byte] - 6;
      } else if (this.r_byteArr[this.as_byte] >= 6 && this.r_byteArr[this.as_byte] != 29) {
         if (this.r_byteArr[this.as_byte] >= 19 && this.w_byte != 3) {
            this.l_void2(this.r_byteArr[this.as_byte] == 22 ? 2 : 1);
            this.s_int = (byte)(this.r_byteArr[this.as_byte] - 19);
         }
      } else {
         this.ag();
      }
   }

   // $VF: renamed from: ag () void
   private void ag() {
      if (this.e_byteArr[8749 + this.q_int] == 6) {
         byte byteValue1 = 3;
         if (this.r_byteArr[this.as_byte] == 29) {
            byteValue1 = 2;
         }

         if (this.k_byte > 0) {
            this.e_byteArr[3131 + this.k_byte] = (byte)(this.y_byte + this.I_byte);
            this.e_byteArr[3232 + this.k_byte] = (byte)(this.A_byte + this.K_byte);
            this.e_byteArr[2828 + this.k_byte] = (byte)(44 + this.r_byteArr[this.as_byte]);
            this.e_byteArr[6161 + this.k_byte] = byteValue1;
            this.a_void17(false, true, false, true);
            this.w_byte = 1;
         } else if (this.F_byte == -1) {
            this.l_void2(1);
            this.s_int = -this.r_byteArr[this.as_byte] - 1;
         } else {
            for (int loopIndex1 = 0; this.a_byteArr2[this.F_byte][loopIndex1] > 0; loopIndex1++) {
               this.e_byteArr[3131 + this.a_byteArr2[this.F_byte][loopIndex1]] = (byte)(this.y_byte + this.I_byte);
               this.e_byteArr[3232 + this.a_byteArr2[this.F_byte][loopIndex1]] = (byte)(this.A_byte + this.K_byte);
               this.e_byteArr[2828 + this.a_byteArr2[this.F_byte][loopIndex1]] = (byte)(44 + this.r_byteArr[this.as_byte]);
               this.e_byteArr[6161 + this.a_byteArr2[this.F_byte][loopIndex1]] = byteValue1;
            }

            this.a_void17(true, true, false, false);
            this.w_byte = 1;
         }

         this.l_byte = this.k_byte;
      }
   }

   // $VF: renamed from: ah () void
   private void ah() {
      if (!this.K_bool) {
         this.P_bool = false;
         if (this.w_byte == 4) {
            this.l_void2(-1);
         } else {
            if (this.k_byte != 0) {
               this.w_byte = 1;
               this.l_byte = this.k_byte;
               this.a_void17(false, true, false, true);
            } else if (this.F_byte != -1) {
               this.w_byte = 1;
               this.a_void17(true, true, false, false);
            } else {
               this.w_byte = 0;
               this.a_void17(true, true, false, false);
            }

            this.q_int = 0;
            this.F_bool = false;
            this.i_void();
            this.V_bool = false;
         }
      }
   }

   // $VF: renamed from: ai () void
   private void ai() {
      this.b_boolArr[2] = true;
      if (this.ad_byte == 6) {
         this.T_bool = this.as_byte > 0;
         this.U_bool = this.as_byte < this.ar_byte - 1;
      } else {
         this.T_bool = this.aW > 0;
         this.U_bool = this.aW + this.aV < this.ar_byte;
      }

      if (this.r_byteArr[this.as_byte] < 0) {
         this.l_byte = (byte)(-this.r_byteArr[this.as_byte]);
         this.a_void18(false, false, this.a_boolArr[2], true, this.a_boolArr[5], false, false, false, false);
      } else if (this.a_boolArr[4]) {
         this.l_byte = 0;
         this.a_void17(true, false, true, false);
      }

      this.a_boolArr[8] = false;
      this.a_boolArr[7] = false;
      if (this.ad_byte != 6 && (this.r_byteArr[this.as_byte] < 6 || this.r_byteArr[this.as_byte] > 8) && this.r_byteArr[this.as_byte] != 16) {
         if (this.r_byteArr[this.as_byte] >= 0 && this.r_byteArr[this.as_byte] < 6) {
            this.a_boolArr[7] = this.b_boolArr[7] = true;
         }
      } else {
         this.a_boolArr[8] = this.b_boolArr[8] = true;
      }
   }

   // $VF: renamed from: aj () void
   private void aj() {
      this.F_bool = true;
      this.aW = this.as_byte = 0;
      this.k_byte = 0;

      while (this.e_byteArr[1919 + this.l_byte] <= 0) {
         this.l_byte++;
      }

      this.P_bool = true;
   }

   // $VF: renamed from: l (int) void
   private void l_void2(int intValue1) {
      this.Y_int = intValue1;
      if (this.Y_int > -1) {
         this.d_shortArr[4] = (short)(33 + this.Y_int);
         this.k_byteArr[4] = 1;
         this.x_byte = this.w_byte;
         this.c_boolArr = new boolean[]{
            this.a_boolArr[0],
            this.a_boolArr[1],
            this.a_boolArr[2],
            this.a_boolArr[4],
            this.a_boolArr[5],
            this.a_boolArr[6],
            this.a_boolArr[7],
            this.a_boolArr[8],
            this.a_boolArr[9]
         };
         if (this.Y_int <= 5) {
            this.a_void17(true, false, true, false);
         } else {
            this.a_void18(
               this.a_boolArr[0], false, true, this.a_boolArr[4], this.a_boolArr[5], this.a_boolArr[6], this.a_boolArr[7], this.a_boolArr[8], this.a_boolArr[9]
            );
         }

         this.w_byte = (byte)(this.Y_int >= 3 ? 4 : 3);
         this.b_boolArr[2] = true;
      } else if (this.Y_int == -2) {
         this.c_void6(this.q_int, true);
         this.d_shortArr[4] = 0;
      } else {
         this.w_byte = this.x_byte;
         this.a_void18(
            this.c_boolArr[0],
            this.c_boolArr[1],
            this.c_boolArr[2],
            this.c_boolArr[3],
            this.c_boolArr[4],
            this.c_boolArr[5],
            this.c_boolArr[6],
            this.c_boolArr[7],
            this.c_boolArr[8]
         );
         this.d_shortArr[4] = 0;
         if (this.s_int == 100) {
            this.ah();
         } else {
            this.P_bool = true;
         }

         this.O_bool = this.M_bool = false;
      }

      this.s_int = 0;
   }

   // $VF: renamed from: d (int) void
   final void d_void5(int intValue1) {
      if (this.w_byte == 2 && intValue1 == this.q_int) {
         this.P_bool = true;
      }
   }

   // $VF: renamed from: b (int, boolean) void
   final void b_void4(int intValue1, boolean flag1) {
      this.engine.b_bool6((byte)intValue1);

      for (byte byteIndex1 = this.e_byteArr[8993 + intValue1]; byteIndex1 > 0; byteIndex1 = this.e_byteArr[4545 + byteIndex1]) {
         this.a_void15(byteIndex1, intValue1, false, false);
      }

      this.e_byteArr[8627 + intValue1] = (byte)(flag1 ? 1 : 2);
      if (flag1) {
         this.e_byteArr[8566 + intValue1] = this.a_byteArr[this.a_shortArr[138] + (7 + this.e_byteArr[9115 + intValue1]) * 26 + this.e_byteArr[8749 + intValue1]];
      }
   }

   // $VF: renamed from: ak () void
   private void ak() {
      if (this.Q_byte == 15 && this.m_byte == 0) {
         this.a_byteArr[this.a_shortArr[153] + 116 + 15] = (byte)(this.R_bool ? 0 : 9);
         this.b_boolArr[17] = true;
      }

      try {
         this.al();
         if (this.Q_byte == 22 || this.Q_byte == 23) {
            this.am();
         } else if (m_bool) {
            m_bool = false;
            this.an();
         } else if ((this.i_bool || l_bool || this.j_bool)
            && this.aQ <= 0
            && this.aN == 0
            && (this.Q_byte < 28 || this.Q_byte == 32)) {
            this.i_bool = this.j_bool = false;
            l_bool = false;
            this.v_bool = false;
            this.E_byte = 4;
            if (this.Q_byte == 32) {
               return;
            }

            this.ao();
         } else if (this.e_bool) {
            this.aB();
         } else if (this.f_bool) {
            this.aC();
         }

         this.aD();
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: al () void
   private void al() {
      if (this.Q_byte == 27 && (this.i_bool || l_bool)) {
         this.i_bool = false;
         l_bool = false;
         this.v_bool = false;
         this.E_byte = 4;
         this.i_void();
         this.Q_byte = this.R_byte;
         this.R_byte = this.S_byte;
         this.H_bool = true;
         this.v_int = this.x_int;
         if (this.e_byte > 0) {
            this.aQ();
         }
      }
   }

   // $VF: renamed from: am () void
   private void am() {
      this.Q_byte = this.R_byte;
      this.H_bool = true;
      if (this.T_byte == 0) {
         this.g_void3(this.q_byte);
         if (this.Q_byte == 18) {
            this.a_void17(true, true, false, false);
            this.m_byte = 0;
            this.Q_byte = 28;
            this.b_void3(this.a_byteArr[this.a_shortArr[303] + this.q_byte]);
            this.Q_byte = 18;
         }
      } else if (this.T_byte == 1) {
         if (this.u_byte > 0 && this.u_byte < 41) {
            this.t_byte++;
         }

         if (!this.e_bool2(this.q_byte < 7 ? 1 : 2)) {
            if (this.q_byte < 7) {
               this.t_byte = -1;
            } else {
               this.W_bool = false;
            }

            this.v_int = 66;
         } else {
            this.v_int = 67;
            this.e_bool2(0);
         }

         this.R_byte = (byte)(this.q_byte < 7 ? (this.t_byte > -1 ? 10 : 11) : (this.W_bool ? 10 : 11));
         this.A_bool = true;
         this.v_byte = 1;
         this.n();
         this.u();
         this.v_byte = 0;
      } else {
         if (this.T_byte == 2 && !this.d_bool2(this.q_byte < 7 ? 1 : 2)) {
            this.R_byte = this.Q_byte;
            this.T_byte = 0;
            this.Q_byte = 23;
         }
      }
   }

   // $VF: renamed from: an () void
   private void an() {
      if (this.Q_byte == 32) {
         this.Q_byte = this.U_byte;
         this.H_bool = true;
      } else {
         if (this.a_byteArr[this.a_shortArr[153] + 29 + this.Q_byte] == 1) {
            if (this.Q_byte == 25) {
               this.l_void2(-1);
               this.P_bool = false;
               this.I_bool = false;
            }

            this.Q_byte = 28;
         } else if (this.Q_byte == this.U_byte) {
            this.R_byte = this.Q_byte;
            this.Q_byte = 30;
         } else if (this.Q_byte == 20) {
            if (this.a_byteArr[this.a_shortArr[153] + 145 + 20] == 0) {
               this.z_byte = this.y_byte;
               this.B_byte = this.A_byte;
               this.J_byte = this.I_byte;
               this.L_byte = this.K_byte;
               this.Q_byte = 28;
               this.a_void18(
                  this.d_boolArr[0],
                  this.d_boolArr[1],
                  this.d_boolArr[2],
                  this.d_boolArr[3],
                  this.d_boolArr[4],
                  this.d_boolArr[5],
                  this.d_boolArr[6],
                  this.d_boolArr[7],
                  this.d_boolArr[8]
               );
            }
         } else if (this.Q_byte == 16 && this.v_int == 60) {
            this.T_byte = 0;
            this.Q_byte = 22;
            this.v_int = 69;
            this.R_byte = 18;
         } else if (this.Q_byte == 2) {
            this.Q_byte = this.U_byte;
            this.Z_int = 0;
         } else if (this.Q_byte == this.V_byte || this.Q_byte == 9) {
            this.Q_byte = 13;
            this.Z_int = 1;
         } else if (this.Q_byte == 14) {
            this.b_void();
         } else if (this.a_byteArr[this.a_shortArr[153] + 58 + this.Q_byte] == 1) {
            if (this.Q_byte == 12) {
               this.e_bool2(0);
            }

            this.Q_byte = this.R_byte;
            this.R_byte = this.S_byte;
            this.Z_int = this.aa_int;
            this.m_byte = 0;
            this.ac_bool = true;
         } else if (this.a_byteArr[this.a_shortArr[153] + 58 + this.Q_byte] > 1) {
            this.Q_byte = this.a_byteArr[this.a_shortArr[153] + 58 + this.Q_byte];
            this.R_byte = this.S_byte;
            this.Z_int = this.aa_int;
            this.m_byte = 0;
         }

         this.H_bool = true;
      }
   }

   // $VF: renamed from: ao () void
   private void ao() {
      byte byteValue1 = this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + this.Q_byte] + this.Z_int];
      if (this.af_bool) {
         this.V_byte = 8;
         this.r_byte = 4;
      }

      if (this.a_byteArr[this.a_shortArr[153] + 87 + this.Q_byte] == 1) {
         this.Q_byte = this.R_byte;
      } else if (this.Q_byte == 19) {
         this.z_byte = this.y_byte;
         this.B_byte = this.A_byte;
         this.J_byte = this.I_byte;
         this.L_byte = this.K_byte;
         this.Q_byte = 28;
      } else if (this.Q_byte == 20) {
         this.ap();
      } else if (this.Q_byte == 18 || this.Q_byte == 17) {
         this.b_void3(-1);
      } else if (this.Q_byte == 15) {
         this.aq();
      } else if (this.Q_byte == 16) {
         this.ar();
      } else if (this.Q_byte == 12) {
         this.as();
      } else if (this.Q_byte == 13) {
         this.at();
      } else if (this.Q_byte == this.V_byte) {
         this.au();
      } else if (this.Q_byte == 9) {
         this.q_byte = this.a_byteArr[this.a_shortArr[249] + byteValue1 - 25];
         this.T_byte = 0;
         this.Q_byte = 22;
         this.v_int = 69;
         this.R_byte = 29;
      } else if (this.Q_byte == 24) {
         this.av();
      } else if (this.Q_byte == 25) {
         this.Z_int++;
         if (this.Z_int >= this.a_byteArr[this.a_shortArr[307] + this.m_byte]) {
            this.Z_int = 0;
         }

         this.d_shortArr[4] = (short)(33 + this.a_byteArr[this.a_shortArr[305] + this.a_byteArr[this.a_shortArr[306] + this.m_byte] + this.Z_int]);
         this.b_boolArr[2] = true;
      } else if (this.Q_byte == 14) {
         a_byte = (byte)this.Z_int;
         this.renderer.b_void(0);
         this.renderer.b_void(1);
         this.Q_byte = 16;
      } else if (byteValue1 == 6) {
         this.Q_byte = 28;
      } else if (byteValue1 == 0) {
         this.R_byte = this.Q_byte;
         this.Q_byte = 2;
         this.aa_int = this.Z_int;
      } else if (byteValue1 == 12) {
         this.q_byte = 0;
         this.R_byte = this.Q_byte;
         if (this.s_byte > -1) {
            this.Q_byte = 3;
         } else {
            this.Q_byte = 13;
            this.Z_int = 1;
         }

         this.aa_int = 0;
      } else if (byteValue1 == 13) {
         this.aw();
      } else if (byteValue1 == 10) {
         this.ax();
      } else if (byteValue1 == 11) {
         this.Q_byte = 31;
      } else if (byteValue1 == 9) {
         this.ay();
      } else if (byteValue1 == 5) {
         this.R_byte = this.Q_byte;
         this.Q_byte = 30;
         this.aa_int = this.Z_int;
      } else if (byteValue1 == 1) {
         this.az();
         this.a_byteArr[this.a_shortArr[153] + 116 + this.Q_byte] = 4;
         this.m_byte = 1;
         this.renderer.a_void2(70);
      } else if (byteValue1 == 3) {
         this.az();
         this.a_byteArr[this.a_shortArr[153] + 116 + this.Q_byte] = 2;
         this.m_byte = 0;
         this.renderer.a_void2(74);
      } else if (byteValue1 == 2) {
         this.R_byte = this.Q_byte;
         this.Q_byte = 12;
         this.aa_int = this.Z_int;
         this.Z_int = 1;
         this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + 12] + 1] = (byte)(17 + this.e_byte / 2);
         this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + 12] + 3] = (byte)(17 + this.l_int);
      } else if (byteValue1 == 4) {
         try {
            this.midlet.platformRequest(this.midlet.getAppProperty("GameUrl-" + this.supportedLanguages[a_byte]));
            Thread.yield();
         } catch (Exception ignoredException1) {
         }
      } else if (byteValue1 == 7) {
         this.aA();
      } else if (byteValue1 == 8) {
         this.R_byte = this.Q_byte;
         this.Q_byte = 16;
         this.aa_int = this.Z_int;
         this.v_int = 63;
      }

      this.H_bool = true;
   }

   // $VF: renamed from: ap () void
   private void ap() {
      if (this.a_byteArr[this.a_shortArr[153] + 145 + 20] == 0) {
         if (this.ap_byte != 14 && this.ap_byte != 15) {
            this.f_void3(this.an_byte, 0);
         } else {
            this.e_void4(this.am_byte);
            this.f_void4(this.am_byte);
            this.engine.v_int = this.am_byte;
            this.engine.u_int = 0;
            if (this.engine.a_bool8(this.ap_byte == 14 ? 4 : 2)) {
               this.e_byteArr[6161 + this.am_byte] = 2;
            }
         }

         this.aJ();
         if (this.w_byte == 3) {
            this.l_void2(-1);
            this.ah();
         } else {
            this.a_void18(
               this.d_boolArr[0],
               this.d_boolArr[1],
               this.d_boolArr[2],
               this.d_boolArr[3],
               this.d_boolArr[4],
               this.d_boolArr[5],
               this.d_boolArr[6],
               this.d_boolArr[7],
               this.d_boolArr[8]
            );
         }
      } else {
         this.a_void18(
            this.d_boolArr[0],
            this.d_boolArr[1],
            this.d_boolArr[2],
            this.d_boolArr[3],
            this.d_boolArr[4],
            this.d_boolArr[5],
            this.d_boolArr[6],
            this.d_boolArr[7],
            this.d_boolArr[8]
         );
      }

      this.z_byte = this.y_byte;
      this.B_byte = this.A_byte;
      this.J_byte = this.I_byte;
      this.L_byte = this.K_byte;
      this.Q_byte = 28;
      if (this.K_bool) {
         this.o_int = 0;
         this.aJ();
         this.l_void2(-1);
         this.P_bool = false;
         this.a_void18(true, false, false, false, true, false, false, false, false);
         this.w_byte = 2;
         this.b_boolArr[4] = true;
         this.Z();
         this.aj();
      }
   }

   // $VF: renamed from: aq () void
   private void aq() {
      if (this.m_byte < 4) {
         if (this.m_byte > 0) {
            if (this.m_byte == 3) {
               this.a_byteArr[this.a_shortArr[153] + 116 + this.Q_byte] = 2;
            }

            this.renderer.a_void2(70 + this.m_byte);
            this.v_int = 71;
            this.m_byte++;
         } else if (this.R_bool && this.m_byte == 0) {
            try {
               this.midlet.platformRequest("http://wap.prehistoric-games.com/");
               Thread.yield();
            } catch (Exception ignoredException1) {
            }
         } else {
            if (this.m_byte == -1) {
               if (this.u_byte == 41) {
                  this.aM();
                  if (this.q_byte < 5) {
                     this.q_byte++;
                     this.T_byte = 0;
                     this.Q_byte = 23;
                     this.v_int = 69;
                     this.R_byte = 18;
                     this.s_byte = this.a_byteArr[this.a_shortArr[248] + this.q_byte];
                     if (this.r_byte < this.s_byte) {
                        this.r_byte = this.s_byte;
                     }

                     this.V_byte = (byte)(4 + this.r_byte);
                     this.e_bool2(0);
                  } else if (this.q_byte == 6) {
                     this.c_int = -1;
                     this.Q_byte = this.U_byte;
                     this.b_void3(59);
                     this.q_byte++;
                     this.Q_byte = 18;
                  } else {
                     this.c_int = -1;
                     this.Q_byte = this.U_byte;
                  }

                  this.Z_int = 0;
                  return;
               }

               if (this.q_byte == 1 || this.q_byte == 6) {
                  this.q_byte--;
               }

               this.aM();
               this.R_byte = this.U_byte;
               this.Q_byte = 16;
               this.v_int = 58;
               this.Z_int = 0;
               this.c_int = -1;
            }
         }
      }
   }

   // $VF: renamed from: ar () void
   private void ar() {
      if (this.v_int == 68) {
         this.b_void();
      } else if (this.v_int == 65) {
         this.aM();
         this.Q_byte = this.U_byte;
         this.Z_int = 0;
         this.c_int = -1;
         this.g_int = 0;
      } else if (this.v_int == 58) {
         this.T_byte = 0;
         this.Q_byte = 22;
         this.v_int = 69;
         this.R_byte = (byte)(this.q_byte < 7 ? 18 : 29);
      } else if (this.v_int == 59) {
         this.e_byte = 2;
         this.ac_bool = true;
         this.aQ();
         this.R_byte = this.Q_byte = this.U_byte;
      } else if (this.v_int == 64) {
         this.T_byte = 1;
         this.Q_byte = 22;
         this.v_int = 69;
         this.R_byte = 21;
      } else if (this.v_int == 63) {
         this.Q_byte = 31;
      } else if (this.v_int == 60) {
         this.p_byte = 1;
         this.T_byte = 0;
         this.Q_byte = 22;
         this.v_int = 69;
         this.R_byte = 18;
      } else {
         if (this.v_int == 62) {
            this.s_byte = -1;
            this.t_byte = -2;
            this.Q_byte = 13;
            this.R_byte = 2;
            this.Z_int = 1;
            this.e_bool2(0);
         }
      }
   }

   // $VF: renamed from: as () void
   private void as() {
      if (this.Z_int == 1) {
         this.e_byte = (byte)(this.e_byte == 0 ? 2 : 0);
         this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + 12] + 1] = (byte)(17 + this.e_byte / 2);
         if (this.soundPlayer != null) {
            this.soundPlayer.a_void2(this.e_byte);
         } else {
            this.aR();
            this.aQ();
         }
      } else {
         if (this.Z_int == 3) {
            this.l_int = this.l_int == 0 ? 1 : 0;
            this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + 12] + 3] = (byte)(17 + this.l_int);
         }
      }
   }

   // $VF: renamed from: at () void
   private void at() {
      this.b_byte = (byte)(this.Z_int / 2);
      if (this.q_byte >= 7) {
         this.Q_byte = 9;
         this.d_byte = this.b_byte;
      } else {
         if (this.r_byte == 0) {
            this.Q_byte = 16;
            this.v_int = 60;
            this.p_byte = 0;
            this.s_byte = 0;
         } else {
            this.Q_byte = this.V_byte;
         }

         this.c_byte = this.b_byte;
         this.e_bool2(0);
      }

      this.Z_int = 0;
   }

   // $VF: renamed from: au () void
   private void au() {
      this.q_byte = this.a_byteArr[this.a_shortArr[249]
         + this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + this.Q_byte] + this.Z_int]
         - 25];
      this.s_byte = this.a_byteArr[this.a_shortArr[248] + this.q_byte];
      if (this.q_byte == 0) {
         this.Q_byte = 16;
         this.v_int = 60;
         this.p_byte = 0;
      } else {
         this.T_byte = 0;
         this.Q_byte = 22;
         this.v_int = 69;
      }

      this.R_byte = 18;
      this.e_bool2(0);
   }

   // $VF: renamed from: av () void
   private void av() {
      this.Q_byte = 15;
      this.Z_int = 0;
      this.a_byteArr[this.a_shortArr[153] + 116 + this.Q_byte] = 0;
      this.a_byteArr[this.a_shortArr[153] + 145 + this.Q_byte] = 2;
      this.a_byteArr[this.a_shortArr[153] + 58 + this.Q_byte] = 0;
      this.renderer.a_void2(75);
      this.v_int = 71;
      this.m_byte = -1;

      for (int loopIndex1 = 0; loopIndex1 < 2; loopIndex1++) {
         for (int loopIndex2 = 0; loopIndex2 < 5; loopIndex2++) {
            this.a_shortArr2[loopIndex1][24] = (short)(this.a_shortArr2[loopIndex1][24] + this.a_shortArr2[loopIndex1][19 + loopIndex2] * this.a_byteArr[this.a_shortArr[112] + loopIndex2] / 10);
         }
      }
   }

   // $VF: renamed from: aw () void
   private void aw() {
      this.q_byte = 7;
      this.R_byte = this.Q_byte;
      if (this.W_bool) {
         this.Q_byte = 3;
         this.Z_int = 0;
      } else if (this.r_byte <= 0 && !this.af_bool) {
         this.v_int = 70;
         this.Q_byte = 21;
         this.Z_int = 0;
      } else {
         this.Q_byte = 13;
         this.Z_int = 1;
      }

      this.aa_int = 1;
   }

   // $VF: renamed from: ax () void
   private void ax() {
      this.Z_int = 0;
      this.R_byte = this.Q_byte;
      if (this.q_byte < 7) {
         if (this.s_byte > -1) {
            this.Q_byte = 16;
            this.v_int = 62;
         } else if (this.Q_byte == 4) {
            this.Q_byte = 16;
            this.v_int = 60;
            this.p_byte = 0;
         } else {
            this.Q_byte = this.V_byte;
         }
      } else {
         this.Q_byte = 13;
         this.Z_int = this.aa_int = 1;
      }
   }

   // $VF: renamed from: ay () void
   private void ay() {
      if (!this.X_bool) {
         this.R_byte = this.Q_byte;
         this.Q_byte = 16;
         this.v_int = 65;
      } else {
         this.aM();
         this.Q_byte = this.U_byte;
         this.Z_int = 0;
         this.c_int = -1;
         this.g_int = 0;
      }
   }

   // $VF: renamed from: az () void
   private void az() {
      this.R_byte = this.Q_byte;
      this.Q_byte = 15;
      this.aa_int = this.Z_int;
      this.v_int = 71;
      this.a_byteArr[this.a_shortArr[153] + 145 + this.Q_byte] = 0;
      this.a_byteArr[this.a_shortArr[153] + 58 + this.Q_byte] = 1;
   }

   // $VF: renamed from: aA () void
   private void aA() {
      this.R_byte = this.Q_byte;
      this.aa_int = this.Z_int;
      this.X_bool = true;
      if (this.q_byte < 7 ? this.t_byte <= -1 : !this.W_bool) {
         this.T_byte = 1;
         this.Q_byte = 22;
         this.v_int = 69;
         this.R_byte = 21;
      } else {
         this.Q_byte = 16;
         this.v_int = 64;
      }
   }

   // $VF: renamed from: aB () void
   private void aB() {
      if (this.a_byteArr[this.a_shortArr[153] + 174 + this.Q_byte] == 1) {
         if (!this.Q_bool) {
            this.y_int--;
            return;
         }
      } else {
         if (this.Q_byte == 12) {
            this.Z_int--;
         } else if (this.Q_byte == 13 && this.Z_int == 1) {
            this.Z_int--;
         }

         this.Z_int = this.Z_int > 0 ? this.Z_int - 1 : this.ab_int - 1;
      }
   }

   // $VF: renamed from: aC () void
   private void aC() {
      if (this.a_byteArr[this.a_shortArr[153] + 174 + this.Q_byte] == 1) {
         if (!this.R_bool) {
            this.y_int++;
            return;
         }
      } else {
         this.Z_int = this.Z_int < this.ab_int - 1 ? this.Z_int + 1 : 0;
         if (this.Q_byte == 12) {
            this.Z_int = this.Z_int / 2 * 2 + 1;
            return;
         }

         if (this.Q_byte == 13 && this.Z_int == 0) {
            this.Z_int++;
         }
      }
   }

   // $VF: renamed from: aD () void
   private void aD() {
      if (this.Q_byte == 31) {
         if (this.t_byte < this.s_byte && this.q_byte < 7) {
            this.q_byte = this.s_byte;
            if (this.q_byte >= 1) {
               this.q_byte++;
            }

            this.T_byte = 0;
            this.Q_byte = 22;
            this.v_int = 69;
            this.R_byte = 18;
         } else {
            this.T_byte = 2;
            this.Q_byte = 22;
            this.v_int = 69;
            this.R_byte = 28;
         }

         this.b_byte = this.c_byte;
      }

      if (this.Q_byte == 28) {
         this.a_void18(
            this.a_boolArr[0],
            this.a_boolArr[1],
            this.a_boolArr[2],
            this.a_boolArr[4],
            this.a_boolArr[5],
            this.a_boolArr[6],
            this.a_boolArr[7],
            this.a_boolArr[8],
            this.a_boolArr[9]
         );
         this.c_bool = false;
         this.y_byte = this.z_byte;
         this.A_byte = this.B_byte;
         this.I_byte = this.J_byte;
         this.K_byte = this.L_byte;
         this.A_bool = true;
         this.v_byte = 1;
         this.i_void();
      } else if (this.Q_byte == 19) {
         this.Y();
         this.E();
      } else if (this.Q_byte == 30) {
         this.Q_byte = 16;
         this.v_int = 68;
         this.H_bool = true;
      } else {
         if (this.Q_byte == 29) {
            this.a_void17(true, true, false, false);
            this.A_bool = true;
            this.Q_byte = 28;
         }
      }
   }

   // $VF: renamed from: aE () void
   private void aE() {
      this.F_int++;
      if (this.F_int > 4) {
         this.u_bool = true;
         this.t_bool = false;
         this.F_int = 0;
         this.F_byte = 4;
         this.k_byte = 0;
         this.a_void17(true, true, false, false);
         this.q_int = 0;
         this.G_int = this.y_byte + this.I_byte;
         this.H_int = this.A_byte + this.K_byte;
         this.aI();
      }
   }

   // $VF: renamed from: aF () void
   private void aF() {
      this.u_bool = false;
      this.t_bool = false;
      this.aI();
      this.L_int = 0;

      for (this.K_int = this.C_int + 1; this.K_int <= this.C_int + this.E_int; this.K_int++) {
         for (this.J_int = this.B_int + 1; this.J_int <= this.B_int + this.D_int; this.J_int++) {
            this.H_byte = this.c_byteArr2[this.K_int][this.J_int];
            if (this.H_byte >= 1 && this.H_byte <= 50 && this.e_byteArr[1919 + this.H_byte] > 0) {
               if (this.L_int < 50) {
                  this.a_byteArr2[4][this.L_int] = this.H_byte;
                  this.e_byteArr[909 + this.H_byte] = 4;
               }

               this.L_int++;
            }
         }
      }

      if (this.a_byteArr2[4][0] == 0) {
         this.w_byte = 0;
         this.k_byte = 0;
         this.F_byte = -1;
      } else if (this.a_byteArr2[4][1] == 0) {
         this.e_byteArr[909 + this.a_byteArr2[4][0]] = 0;
         this.d_void4(this.a_byteArr2[4][0]);
         this.a_byteArr2[4][0] = 0;
         this.F_byte = -1;
      } else {
         this.F_byte = 4;
         this.w_byte = 1;
         this.M_int = this.L_int;
         if (this.M_int > 50) {
            this.M_int = 50;
         }
      }

      this.B_int = this.C_int = this.D_int = this.E_int = 0;
   }

   // $VF: renamed from: aG () void
   private void aG() {
      this.w_bool = false;
      this.I_int = 0;
      switch (this.i_byte) {
         case 7:
            this.G_byte = 2;
            break;
         case 9:
            this.G_byte = 3;
            break;
         default:
            return;
      }

      for (this.L_int = 0; this.L_int < 50; this.L_int++) {
         this.H_byte = this.F_byte != -1 ? this.a_byteArr2[this.F_byte][this.L_int] : (this.L_int == 0 ? this.k_byte : 0);
         this.a_byteArr2[0][this.L_int] = this.H_byte;
         this.e_byteArr[909 + this.a_byteArr2[this.G_byte][this.L_int]] = 0;
         this.a_byteArr2[this.G_byte][this.L_int] = 0;
      }

      for (this.L_int = 0; this.L_int < 50; this.L_int++) {
         this.H_byte = this.a_byteArr2[0][this.L_int];
         if (this.H_byte != 0) {
            this.e_void4(this.H_byte);
            this.a_byteArr2[this.G_byte][this.L_int] = this.H_byte;
            this.e_byteArr[909 + this.H_byte] = this.G_byte;
         }
      }

      this.w_byte = 1;
      this.F_byte = this.G_byte;
      this.k_byte = 0;
      this.a_void17(true, true, false, false);
   }

   // $VF: renamed from: aH () void
   private void aH() {
      this.w_bool = false;
      this.I_int = 0;
      switch (this.i_byte) {
         case 7:
            this.G_byte = 2;
            break;
         case 9:
            this.G_byte = 3;
            break;
         default:
            return;
      }

      if (this.F_byte == this.G_byte) {
         this.f_void3(this.a_byteArr2[this.F_byte][0], 0);
      } else {
         if (this.a_byteArr2[this.G_byte][0] != 0) {
            this.F_byte = this.G_byte;
            this.aI();
            this.M_int = 0;

            for (this.L_int = 0; this.L_int < 50; this.L_int++) {
               if (this.a_byteArr2[this.F_byte][this.L_int] != 0) {
                  this.e_byteArr[909 + this.a_byteArr2[this.F_byte][this.L_int]] = this.F_byte;
                  this.M_int++;
               }
            }

            this.w_byte = 1;
            this.k_byte = 0;
            this.a_void17(true, true, false, false);
         }
      }
   }

   // $VF: renamed from: e (int) void
   final void e_void4(int intValue1) {
      for (int loopIndex1 = 0; loopIndex1 < 5; loopIndex1++) {
         byte byteValue1;
         if ((byteValue1 = loopIndex1 < 4 ? this.a_byteArr[this.a_shortArr[125] + loopIndex1] : 4) != -1) {
            for (int loopIndex2 = 0; loopIndex2 < 50; loopIndex2++) {
               if (this.a_byteArr2[byteValue1][loopIndex2] == intValue1) {
                  while (loopIndex2 < 50) {
                     this.a_byteArr2[byteValue1][loopIndex2] = loopIndex2 < 49 ? this.a_byteArr2[byteValue1][loopIndex2 + 1] : 0;
                     loopIndex2++;
                  }

                  if (this.a_byteArr2[byteValue1][0] == 0 && this.F_byte == this.e_byteArr[909 + intValue1]) {
                     if (this.w_byte == 1) {
                        this.w_byte = 0;
                     }

                     this.F_byte = -1;
                  }

                  this.e_byteArr[909 + intValue1] = 0;
                  return;
               }
            }
         }
      }
   }

   // $VF: renamed from: aI () void
   private void aI() {
      for (int loopIndex1 = 0; loopIndex1 < 50; loopIndex1++) {
         if (this.a_byteArr2[4][loopIndex1] != 0) {
            this.e_byteArr[909 + this.a_byteArr2[4][loopIndex1]] = 0;
            this.a_byteArr2[4][loopIndex1] = 0;
         }
      }
   }

   // $VF: renamed from: aJ () void
   private void aJ() {
      if (this.u_bool) {
         this.u_bool = false;
         this.F_byte = -1;
         this.k_byte = 0;
         this.B_int = this.C_int = this.D_int = this.E_int = 0;
      }
   }

   // $VF: renamed from: aK () void
   private void aK() {
      this.y_byte = this.C_byte;
      this.A_byte = this.D_byte;

      while (this.I_byte < 0) {
         this.I_byte++;
      }

      while (this.K_byte < 0 && !this.s_bool) {
         this.K_byte++;
      }

      while (this.I_byte + this.O_byte > this.c_short) {
         this.I_byte--;
      }

      while (this.K_byte + this.P_byte >= this.d_short - 1) {
         this.K_byte--;
      }
   }

   // $VF: renamed from: aL () void
   private void aL() {
      if (this.w_bool) {
         this.I_int++;
         if (this.I_int > 10) {
            this.w_bool = false;
            this.I_int = 0;
         }
      }
   }

   // $VF: renamed from: a (int) byte
   private static byte a_byte2(int intValue1) {
      if (intValue1 >= 1 && intValue1 <= 50) {
         return 0;
      } else {
         return (byte)(intValue1 >= 51 && intValue1 <= 100 ? 1 : 2);
      }
   }

   // $VF: renamed from: a (byte, byte, byte, byte, byte) byte
   final byte a_byte3(byte byteValue1, byte byteValue2, byte byteValue3, byte byteValue4, byte byteValue5) {
      byte byteValue6 = (byte)(1 + byteValue1 * 50);
      byte byteValue7 = 0;

      while (this.e_byteArr[1919 + byteValue6 + byteValue7] != 0) {
         byteValue7++;
      }

      if (byteValue7 >= 50) {
         return -1;
      } else {
         byteValue7 = (byte)(byteValue7 + byteValue6);
         if (this.F_bool) {
            this.P_bool = true;
         }

         this.e_byteArr[0 + byteValue7] = this.e_byteArr[6262 + byteValue7] = this.e_byteArr[3131 + byteValue7] = byteValue2;
         this.e_byteArr[101 + byteValue7] = this.e_byteArr[6363 + byteValue7] = this.e_byteArr[3232 + byteValue7] = byteValue3;
         this.e_byteArr[202 + byteValue7] = this.e_byteArr[303 + byteValue7] = 0;
         this.e_byteArr[808 + byteValue7] = 0;
         this.e_byteArr[909 + byteValue7] = 0;
         this.e_byteArr[1111 + byteValue7] = 0;
         this.e_byteArr[4949 + byteValue7] = (byte)(4 + (byteValue5 & 7));
         this.e_byteArr[606 + byteValue7] = 3;
         this.e_byteArr[1313 + byteValue7] = 0;
         this.e_byteArr[1414 + byteValue7] = byteValue4;
         this.e_byteArr[1616 + byteValue7] = (byte)((byteValue5 & 7) * 2 + this.a_int2(255, 2));
         this.e_byteArr[1717 + byteValue7] = (byte)((byteValue5 & 7) * 2 + this.a_int2(255, 2));
         this.e_byteArr[1818 + byteValue7] = (byte)(3 + (byteValue5 & 7));
         this.e_byteArr[2020 + byteValue7] = (byte)(50 + 25 * (1 - byteValue1) + this.a_int2(255, 25));
         this.e_byteArr[2121 + byteValue7] = (byte)(50 + 25 * (1 - byteValue1) + this.a_int2(255, 25));
         this.e_byteArr[505 + byteValue7] = (byte)(50 + 25 * (1 - byteValue1) + this.a_int2(255, 25));
         int intValue1 = (byteValue5 & 32) != 0 ? 3 : 0;
         int intValue2 = this.a_int2(255, 3);
         int intValue3 = this.a_int2(255, 3);
         this.e_byteArr[6969 + byteValue7] = (byte)(intValue2 == 0 ? 2 + this.a_int2(255, 2 + intValue1) : 1);
         this.e_byteArr[7070 + byteValue7] = (byte)(intValue2 == 1 ? 2 + this.a_int2(255, 2 + intValue1) : 1);
         this.e_byteArr[7272 + byteValue7] = (byte)(intValue2 == 2 ? 2 + this.a_int2(255, 2 + intValue1) : 1);
         this.e_byteArr[7171 + byteValue7] = (byte)(intValue3 == 0 ? 2 + this.a_int2(255, 2 + intValue1) : 1);
         this.e_byteArr[7373 + byteValue7] = (byte)(intValue3 == 1 ? 2 + byteValue1 + this.a_int2(255, 2 + intValue1) : 1 + byteValue1);
         this.e_byteArr[7474 + byteValue7] = (byte)(intValue3 == 2 ? 2 + this.a_int2(255, 2 + intValue1) : 1);
         this.e_byteArr[7575 + byteValue7] = (byte)(1 + (byteValue5 >> 3 & 3) * 3 + this.a_int2(255, 3));
         this.e_byteArr[6464 + byteValue7] = 69;
         this.e_byteArr[3434 + byteValue7] = -1;
         this.e_byteArr[3535 + byteValue7] = 0;
         this.e_byteArr[3636 + byteValue7] = 0;
         this.e_byteArr[3737 + byteValue7] = (byte)(2 + this.a_int2(255, 2));
         this.e_byteArr[3838 + byteValue7] = byteValue7;
         this.e_byteArr[4545 + byteValue7] = 0;
         this.e_byteArr[4646 + byteValue7] = -1;
         this.e_byteArr[4747 + byteValue7] = byteValue7;
         this.e_byteArr[4848 + byteValue7] = 0;
         int intValue4 = 0;
         int intValue5 = 0;
         intValue4 = this.a_int2(255, 3);
         intValue5 = this.a_int2(15, 4);
         this.e_byteArr[5151 + byteValue7] = (byte)(intValue5 << 2 | intValue4);
         if ((this.a_shortArr2[byteValue1][12] <= this.a_shortArr2[byteValue1][13] || this.aw_byte == 0) && this.aw_byte != 1) {
            this.e_byteArr[1515 + byteValue7] = 0;
            this.a_shortArr2[byteValue1][12]++;
         } else {
            this.e_byteArr[1515 + byteValue7] = 1;
            this.a_shortArr2[byteValue1][13]++;
         }

         if (byteValue4 < 12) {
            this.e_byteArr[2828 + byteValue7] = 17;
            this.e_byteArr[2929 + byteValue7] = 14;
            this.e_byteArr[6767 + byteValue7] = this.e_byteArr[1919 + byteValue7] = (byte)(5 + this.a_int2(255, 10));
            this.e_byteArr[1010 + byteValue7] = 8;
         } else {
            this.e_byteArr[2828 + byteValue7] = 69;
            this.e_byteArr[2929 + byteValue7] = 8;
            this.e_byteArr[6767 + byteValue7] = this.e_byteArr[1919 + byteValue7] = (byte)(
               (this.q_byte == 0 && byteValue1 == 1 ? 20 : 40) + (this.e_byteArr[1515 + byteValue7] - 1) * -10 + this.a_int2(255, 15)
            );
            this.e_byteArr[1010 + byteValue7] = (byte)((byteValue5 & 7) == 0 ? 8 : 9 - (byteValue5 & 7));
         }

         this.e_byteArr[4444 + byteValue7] = byteValue7;
         this.e_byteArr[6565 + byteValue7] = 9;
         if ((byteValue5 & 64) != 0) {
            this.e_byteArr[6565 + byteValue7] = (byte)this.a_int2(255, 4 + byteValue1 * 2);
         }

         if (this.q_byte == 3) {
            this.e_byteArr[6565 + byteValue7] = 0;
         }

         if ((this.q_byte == 4 || this.q_byte == 5) && this.e_byteArr[6565 + byteValue7] == 1) {
            this.e_byteArr[6565 + byteValue7] = 3;
         }

         this.e_byteArr[3333 + byteValue7] = -1;
         this.e_byteArr[7979 + byteValue7] = this.e_byteArr[8282 + byteValue7] = 0;
         this.e_byteArr[8080 + byteValue7] = 0;
         this.e_byteArr[2222 + byteValue7] = this.e_byteArr[2323 + byteValue7] = this.e_byteArr[2424 + byteValue7] = this.e_byteArr[2525 + byteValue7] = this.e_byteArr[2626 + byteValue7] = 0;
         this.g_void2(byteValue7);
         this.b_void6(byteValue7);
         if (this.c_byteArr2[byteValue3][byteValue2] == 0) {
            this.c_byteArr2[byteValue3][byteValue2] = byteValue7;
         }

         if (!this.s_bool) {
            this.a_shortArr2[byteValue1][11]++;
            if (byteValue1 == 0) {
               this.a_void19((byte)1, byteValue2, byteValue3, byteValue7);
            }

            this.a_shortArr2[byteValue1][19]++;
         }

         if (byteValue1 == 0) {
            this.engine.a_void17(this.e_byteArr[0 + byteValue7], this.e_byteArr[101 + byteValue7], this.e_byteArr[4949 + byteValue7]);
         }

         return byteValue7;
      }
   }

   // $VF: renamed from: a (byte) void
   final void a_void14(byte byteValue1) {
      byte byteValue2 = (byte)((byteValue1 - 1) / 50);
      int intValue1 = this.e_byteArr[0 + byteValue1] + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + byteValue1]];
      int intValue2 = this.e_byteArr[101 + byteValue1] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + byteValue1]];
      if ((this.e_byteArr[2929 + byteValue1] & 255) <= 7
         && (this.e_byteArr[1111 + byteValue1] & 15)
            < (this.a_byteArr[this.a_shortArr[15] + (this.e_byteArr[606 + byteValue1] & 1) * 9 + this.e_byteArr[1010 + byteValue1] - this.e_byteArr[7777 + byteValue1]] + 1) / 2
         && this.c_byteArr2[intValue2][intValue1] == -128) {
         this.c_byteArr2[intValue2][intValue1] = (byte)(this.e_byteArr[4545 + byteValue1] >= 111 ? -this.e_byteArr[4545 + byteValue1] : 0);
      }

      this.e_void4(byteValue1);
      this.f_void4(byteValue1);
      this.e_byteArr[1919 + byteValue1] = -1;
      this.c_void5(byteValue1);
      if (this.F_bool || byteValue1 == this.e_byteArr[8810 + this.q_int]) {
         this.P_bool = true;
      }

      if (!this.s_bool) {
         if (byteValue2 == 0) {
            this.a_void19((byte)3, this.e_byteArr[0 + byteValue1], this.e_byteArr[101 + byteValue1], byteValue1);
         }

         this.a_shortArr2[1 - byteValue2][22]++;
      }
   }

   // $VF: renamed from: f (int, int) void
   private void f_void3(int intValue1, int intValue2) {
      this.J_byte = this.I_byte;
      this.L_byte = this.K_byte;
      if (intValue1 > 100) {
         this.I_byte = (byte)(this.e_byteArr[9359 + intValue1 - 101] - this.C_byte);
         this.K_byte = (byte)(this.e_byteArr[9381 + intValue1 - 101] - this.D_byte + intValue2);
      } else if (intValue1 > 0) {
         this.I_byte = (byte)(this.e_byteArr[0 + intValue1] - this.C_byte);
         this.K_byte = (byte)(this.e_byteArr[101 + intValue1] - this.D_byte + intValue2);
      } else if (intValue1 == -100) {
         this.I_byte = (byte)(this.I_byte - this.C_byte);
         this.K_byte = (byte)(this.K_byte - (this.D_byte - intValue2));
      } else {
         if (intValue1 >= 0) {
            return;
         }

         this.I_byte = (byte)(
            this.e_byteArr[8383 + -intValue1] + (this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + -intValue1]] >> 1) - this.C_byte
         );
         this.K_byte = (byte)(
            this.e_byteArr[8444 + -intValue1] + (this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + -intValue1]] >> 1) - this.D_byte + intValue2
         );
      }

      this.aK();
      this.A_bool = true;
   }

   // $VF: renamed from: b (int, int) void
   final void b_void5(int intValue1, int intValue2) {
      for (byte byteIndex1 = 1; byteIndex1 <= 50; byteIndex1++) {
         if (this.e_byteArr[1919 + byteIndex1] > 0) {
            this.c_byteArr2[this.e_byteArr[101 + byteIndex1]][this.e_byteArr[0 + byteIndex1]] = 0;
         }
      }

      for (byte byteIndex2 = 1; byteIndex2 <= 50; byteIndex2++) {
         if (this.e_byteArr[1919 + byteIndex2] > 0) {
            if (this.c_byteArr2[intValue2][intValue1] != 0) {
               this.engine.v_int = 0;
               this.engine.a_bool4(1, 127, intValue1, intValue2);
               intValue1 = this.e_byteArr[3131];
               intValue2 = this.e_byteArr[3232];
            }

            if ((this.e_byteArr[2929 + byteIndex2] & 255) <= 7
               && (this.e_byteArr[1111 + byteIndex2] & 15)
                  < (this.a_byteArr[this.a_shortArr[15] + (this.e_byteArr[606 + byteIndex2] & 1) * 9 + this.e_byteArr[1010 + byteIndex2] - this.e_byteArr[7777 + byteIndex2]] + 1)
                     / 2
               && this.c_byteArr2[this.e_byteArr[101 + byteIndex2] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + byteIndex2]]][this.e_byteArr[0 + byteIndex2]
                     + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + byteIndex2]]]
                  == -128) {
               this.c_byteArr2[this.e_byteArr[101 + byteIndex2] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + byteIndex2]]][this.e_byteArr[0 + byteIndex2]
                  + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + byteIndex2]]] = 0;
            }

            this.e_byteArr[0 + byteIndex2] = this.e_byteArr[6262 + byteIndex2] = this.e_byteArr[3131 + byteIndex2] = (byte)intValue1;
            this.e_byteArr[101 + byteIndex2] = this.e_byteArr[6363 + byteIndex2] = this.e_byteArr[3232 + byteIndex2] = (byte)intValue2;
            this.e_byteArr[202 + byteIndex2] = this.e_byteArr[303 + byteIndex2] = 0;
            this.e_byteArr[808 + byteIndex2] = 0;
            this.e_byteArr[2828 + byteIndex2] = 69;
            this.e_byteArr[2929 + byteIndex2] = 8;
            this.e_byteArr[3030 + byteIndex2] = 0;
            this.e_byteArr[6161 + byteIndex2] = 0;
            this.c_byteArr2[this.e_byteArr[101 + byteIndex2]][this.e_byteArr[0 + byteIndex2]] = byteIndex2;
            this.engine.a_void17(this.e_byteArr[0 + byteIndex2], this.e_byteArr[101 + byteIndex2], this.e_byteArr[4949 + byteIndex2]);
         }
      }
   }

   // $VF: renamed from: f (int) void
   final void f_void4(int intValue1) {
      if (this.k_byte == intValue1) {
         this.k_byte = 0;
         if (this.w_byte == 1) {
            this.w_byte = 0;
            this.l_byte = 0;
            this.a_void17(true, true, false, false);
            return;
         }

         if (this.w_byte == 2 && this.e_byteArr[8749 + this.q_int] == 6) {
            this.w_byte = 0;
            this.a_void17(true, true, false, false);
         }
      }
   }

   // $VF: renamed from: b (byte) void
   final void b_void6(byte byteValue1) {
      int intValue1 = 2;
      if (byteValue1 >= 51) {
         intValue1 = byteValue1 == 51 ? 4 : 3;
      } else if (this.e_byteArr[1414 + byteValue1] < 12) {
         intValue1 = 0;
      } else if (this.e_byteArr[1414 + byteValue1] < 35) {
         intValue1 = 1;
      }

      this.e_byteArr[2727 + byteValue1] = (byte)(
         this.a_byteArr[this.a_shortArr[189] + this.e_byteArr[1515 + byteValue1] * 10 + intValue1 * 2]
            + this.a_int2(255, this.a_byteArr[this.a_shortArr[189] + this.e_byteArr[1515 + byteValue1] * 10 + intValue1 * 2 + 1])
      );
      if (byteValue1 == this.l_byte) {
         this.b_boolArr[4] = this.a_boolArr[4];
      }
   }

   // $VF: renamed from: g (int) void
   final void g_void2(int intValue1) {
      this.e_byteArr[6868 + intValue1] = intValue1 == 51 || intValue1 == 52
         ? -2
         : (intValue1 > 51 ? -1 : (byte)((intValue1 > 3 ? 1 + this.a_int2(65535, 58) : intValue1) % 60 + 60 * this.e_byteArr[1515 + intValue1] - 1));
   }

   // $VF: renamed from: b (int) byte
   private static byte b_byte2(int intValue1) {
      if (intValue1 <= -1 && intValue1 >= -30) {
         return 0;
      } else {
         return (byte)(intValue1 <= -31 && intValue1 >= -60 ? 1 : 2);
      }
   }

   // $VF: renamed from: a (byte, int, int, int, int, boolean, int) byte
   final byte a_byte4(byte byteValue1, int intValue1, int intValue2, int intValue3, int intValue4, boolean flag1, int intValue5) {
      byte byteValue2 = this.a_byteArr[this.a_shortArr[138] + 104 + intValue1];
      byte byteValue3 = this.a_byteArr[this.a_shortArr[138] + 130 + intValue1];
      byte byteValue4 = (byte)(1 + byteValue1 * 30);
      byte byteValue5 = 0;

      try {
         while (this.e_byteArr[8505 + byteValue4 + byteValue5] != 0) {
            byteValue5++;
         }

         if (byteValue5 >= 30) {
            if (byteValue1 == 0) {
               this.s_int = 100;
               this.l_void2(-1);
               this.u_byteArr[0] = 0;
               this.a_void19((byte)10, (byte)0, (byte)0, (byte)0);
            }

            return -1;
         } else {
            byteValue5 = (byte)(byteValue5 + byteValue4);
            if (intValue5 == -1) {
               if (!this.a_bool5(intValue1, intValue2, intValue3, !flag1)) {
                  return -2;
               }
            } else {
               byteValue5 = (byte)intValue5;
            }

            if (intValue1 >= 20 && intValue1 <= 22) {
               if (intValue5 == -1) {
                  byteValue5 = 0;

                  while (byteValue5 < 30 && this.f_byteArr2[0][byteValue5] != 0) {
                     byteValue5++;
                  }
               } else {
                  byteValue5 = (byte)intValue5;
               }

               if (byteValue5 == 30) {
                  return -1;
               } else {
                  this.f_byteArr2[0][byteValue5] = (byte)this.q_int;
                  this.f_byteArr2[2][byteValue5] = (byte)intValue2;
                  this.f_byteArr2[3][byteValue5] = (byte)intValue3;
                  this.f_byteArr2[1][byteValue5] = (byte)intValue1;
                  if (!flag1) {
                     this.a_byteArr3[0][this.au_byte][6 + this.s_int - 20]++;
                     this.c_byteArr2[intValue3][intValue2] = (byte)(byteValue1 == 0 ? -123 : -126);
                  } else {
                     this.c_byteArr2[intValue3][intValue2] = (byte)(20 - intValue1 - 111 - byteValue1 * 6);
                  }

                  this.c_void7(intValue2, intValue3, 1, 1);
                  return byteValue5;
               }
            } else {
               if (intValue1 == 0) {
                  byte byteValue6 = 0;

                  while (this.a_byteArr3[byteValue1][byteValue6][11] != 0) {
                     if (++byteValue6 > 10) {
                        return -1;
                     }
                  }

                  this.a_byteArr3[byteValue1][byteValue6][11] = byteValue5;
               }

               this.c_void7(intValue2, intValue3, byteValue2, byteValue3);
               this.e_byteArr[8383 + byteValue5] = (byte)intValue2;
               this.e_byteArr[8444 + byteValue5] = (byte)intValue3;
               this.e_byteArr[8749 + byteValue5] = (byte)intValue1;
               this.e_byteArr[8871 + byteValue5] = 0;
               this.e_byteArr[9176 + byteValue5] = 0;
               this.e_byteArr[8932 + byteValue5] = 0;
               this.e_byteArr[8993 + byteValue5] = 0;
               this.e_byteArr[9054 + byteValue5] = 0;
               if (intValue4 == 0) {
                  intValue4 = this.a_byteArr[this.a_shortArr[113] + (this.q_byte < 2 ? 0 : (this.q_byte == 2 ? 12 : 24)) + intValue1];
               }

               this.e_byteArr[9115 + byteValue5] = (byte)intValue4;
               this.e_byteArr[8810 + byteValue5] = 0;
               this.e_byteArr[8688 + byteValue5] = 5;
               this.e_byteArr[8627 + byteValue5] = 0;
               this.e_byteArr[8505 + byteValue5] = this.e_byteArr[8566 + byteValue5] = this.a_byteArr[this.a_shortArr[138] + 182 + intValue1];
               if (intValue1 >= 12 && intValue1 <= 19) {
                  if (!this.engine.a_bool12(byteValue5)) {
                     if (byteValue1 == 0) {
                        this.s_int = 100;
                        this.l_void2(-1);
                        this.u_byteArr[0] = 0;
                        this.a_void19((byte)10, (byte)0, (byte)0, (byte)0);
                     }

                     this.e_byteArr[8505 + byteValue5] = 0;
                     return -1;
                  }

                  this.e_byteArr[9237 + byteValue5] = (byte)(byteValue1 == 0 ? this.r_byteArr[this.as_byte] : this.engine.v_int);
                  this.e_byteArr[8566 + byteValue5] = this.a_byteArr[this.a_shortArr[138] + 182 + this.e_byteArr[9237 + byteValue5]];
                  this.e_byteArr[9115 + byteValue5] = 3;
               } else if (byteValue1 == 0) {
                  this.engine
                     .a_void17(
                        this.e_byteArr[8383 + byteValue5] + this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + byteValue5]] / 2,
                        this.e_byteArr[8444 + byteValue5] + this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + byteValue5]] / 2,
                        this.e_byteArr[8688 + byteValue5] & 15
                     );
               }

               for (int loopIndex1 = 0; loopIndex1 < byteValue3; loopIndex1++) {
                  for (int loopIndex2 = 0; loopIndex2 < byteValue2; loopIndex2++) {
                     this.c_byteArr2[intValue3 + loopIndex1][intValue2 + loopIndex2] = (byte)(-byteValue5);
                  }
               }

               if (intValue1 == 2) {
                  this.a_shortArr2[byteValue1][16] = (short)(this.a_shortArr2[byteValue1][16] + 4);
                  if (this.a_shortArr2[byteValue1][16] > 50) {
                     this.a_shortArr2[byteValue1][16] = 50;
                  }
               }

               if (!this.s_bool && intValue5 == -1) {
                  this.a_shortArr2[byteValue1][14]++;
                  this.a_shortArr2[byteValue1][20]++;
               }

               if (intValue1 == 2) {
                  this.engine.a_void10(byteValue5);
               }

               if (flag1 && byteValue1 == 0) {
                  this.a_void19((byte)5, (byte)intValue2, (byte)intValue3, (byte)0);
               }

               return byteValue5;
            }
         }
      } catch (Exception ignoredException1) {
         return -1;
      }
   }

   // $VF: renamed from: c (int, boolean) void
   final void c_void6(int intValue1, boolean flag1) {
      byte byteValue1 = this.e_byteArr[8749 + intValue1];
      byte byteValue2 = this.e_byteArr[8383 + intValue1];
      byte byteValue3 = this.e_byteArr[8444 + intValue1];
      byte byteValue4 = this.a_byteArr[this.a_shortArr[138] + 104 + byteValue1];
      byte byteValue5 = this.a_byteArr[this.a_shortArr[138] + 130 + byteValue1];
      int intValue2 = intValue1 < 31 ? 0 : 1;
      if (byteValue1 == 2) {
         this.engine.a_void10(intValue1);
      }

      try {
         if (flag1) {
            this.f_void3(intValue1 == 1 ? -1 : 0, 0);
            this.e_byteArr[8505 + intValue1] = -1;
            this.a_void6(intValue1, 3);

            for (byte byteIndex1 = this.e_byteArr[8993 + intValue1]; byteIndex1 > 0; byteIndex1 = this.e_byteArr[4545 + byteIndex1]) {
               this.a_void15(byteIndex1, intValue1, true, false);
            }

            if (this.e_byteArr[8810 + intValue1] > 1 && (this.e_byteArr[8749 + intValue1] != 2 || this.e_byteArr[8627 + intValue1] != 0)) {
               this.a_void15(this.e_byteArr[8810 + intValue1], intValue1, true, false);
            }

            if ((this.w_byte == 2 || this.w_byte == 4) && intValue1 == this.q_int) {
               this.w_byte = 0;
               this.q_int = 0;
               this.a_void17(true, true, false, false);
               return;
            }
         } else {
            this.e_byteArr[8505 + intValue1] = 0;
            this.e_byteArr[8627 + intValue1] = 3;

            for (int loopIndex1 = 0; loopIndex1 < byteValue5; loopIndex1++) {
               for (int loopIndex2 = 0; loopIndex2 < byteValue4; loopIndex2++) {
                  this.c_byteArr2[byteValue3 + loopIndex1][byteValue2 + loopIndex2] = 0;
               }
            }

            if (byteValue1 == 2) {
               this.a_shortArr2[intValue2][16] = (short)(this.a_shortArr2[intValue2][16] - 4);
               if (this.a_shortArr2[intValue2][16] < 0) {
                  this.a_shortArr2[intValue2][16] = 1;
               }

               for (int loopIndex3 = intValue2 * 50 + 1; loopIndex3 <= (intValue2 + 1) * 50; loopIndex3++) {
                  if (this.e_byteArr[3434 + loopIndex3] == intValue1) {
                     this.e_byteArr[3434 + loopIndex3] = 0;
                  }
               }
            }

            if (!this.s_bool) {
               this.a_shortArr2[intValue2][14]--;
               this.a_shortArr2[1 - intValue2][21]++;
            }

            if (byteValue1 == 0) {
               byte byteValue6 = 0;

               while (this.a_byteArr3[intValue2][byteValue6][11] != intValue1) {
                  if (++byteValue6 >= 10) {
                     byteValue6--;
                     break;
                  }
               }

               this.a_byteArr3[intValue2][byteValue6][11] = 0;
            }

            this.engine.c_void6(intValue1);
            if (intValue2 == 0) {
               this.a_void19((byte)8, (byte)byteValue2, (byte)byteValue3, (byte)0);
            }
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: a (int, int, int, boolean) boolean
   private boolean a_bool5(int intValue1, int intValue2, int intValue3, boolean flag1) {
      byte byteValue1 = this.a_byteArr[this.a_shortArr[138] + 104 + intValue1];
      byte byteValue2 = this.a_byteArr[this.a_shortArr[138] + 130 + intValue1];
      boolean flag2 = true;

      for (int loopIndex1 = 0; loopIndex1 < byteValue2; loopIndex1++) {
         for (int loopIndex2 = 0; loopIndex2 < byteValue1; loopIndex2++) {
            if (!this.b_bool4(intValue2 + loopIndex2, intValue3 + loopIndex1)
               || this.c_byteArr2[intValue3 + loopIndex1][intValue2 + loopIndex2] != 0
               || flag1 && this.a_byte6(intValue2 + loopIndex2, intValue3 + loopIndex1) != 0) {
               flag2 = false;
            }
         }
      }

      return flag2;
   }

   // $VF: renamed from: a (int, int, boolean, boolean) void
   private void a_void15(int intValue1, int intValue2, boolean flag1, boolean flag2) {
      if (this.e_byteArr[2828 + intValue1] == 93 || this.e_byteArr[2828 + intValue1] == 92 || this.e_byteArr[2828 + intValue1] == 106) {
         flag1 = true;
      }

      if (this.e_byteArr[8810 + intValue2] != intValue1 || this.e_byteArr[8749 + intValue2] == 2 && this.e_byteArr[8627 + intValue2] == 0) {
         if (!flag1
            || this.e_byteArr[8627 + intValue2] == 0
               && (this.e_byteArr[8749 + intValue2] == 2 || this.e_byteArr[8749 + intValue2] == 7 || this.e_byteArr[8749 + intValue2] == 4 || this.e_byteArr[8749 + intValue2] == 8)
            )
          {
            this.e_byteArr[2828 + intValue1] = 87;
            this.e_byteArr[6161 + intValue1] = 3;
            return;
         }

         this.e_byteArr[6161 + intValue1] = 2;
      } else {
         if (flag1) {
            this.e_byteArr[8810 + intValue2] = 0;
         }

         label42: {
            this.d_void5(intValue2);
            if (this.c_byteArr2[this.e_byteArr[101 + intValue1]][this.e_byteArr[0 + intValue1]] != intValue1) {
               if (flag1) {
                  this.e_byteArr[6161 + intValue1] = 2;
                  break label42;
               }

               this.e_byteArr[2828 + intValue1] = 87;
            } else {
               this.e_byteArr[3131 + intValue1] = this.e_byteArr[0 + intValue1];
               this.e_byteArr[3232 + intValue1] = this.e_byteArr[101 + intValue1];
               if (flag1) {
                  this.e_byteArr[6262 + intValue1] = this.e_byteArr[0 + intValue1];
                  this.e_byteArr[6363 + intValue1] = this.e_byteArr[101 + intValue1];
               }

               this.e_byteArr[2828 + intValue1] = 69;
               if (flag1) {
                  this.e_byteArr[6161 + intValue1] = 2;
                  this.e_byteArr[4747 + intValue1] = 0;
                  break label42;
               }
            }

            this.e_byteArr[6161 + intValue1] = 3;
         }

         if (flag2) {
            this.a_void13(intValue2, false);
            return;
         }
      }
   }

   // $VF: renamed from: h (int) void
   final void h_void2(int intValue1) {
      this.f_void4(intValue1);
      this.e_void4(intValue1);
   }

   // $VF: renamed from: a (int, byte) byte
   final byte a_byte5(int intValue1, byte byteValue1) {
      byte byteValue2 = 1;
      byte byteValue3 = 0;
      if (intValue1 >= 51) {
         byteValue2 = 31;
         byteValue3 = 1;
      }

      while (byteValue2 < 30) {
         if (this.e_byteArr[8810 + byteValue2 + 0] == intValue1) {
            byteValue2 = (byte)(byteValue2 + 0);
            break;
         }

         byteValue2++;
      }

      byte byteValue4;
      for (byteValue4 = 0; byteValue4 < 30; byteValue4++) {
         if (this.b_byteArr3[byteValue3][0][byteValue4] == byteValue2) {
            this.b_byteArr3[byteValue3][4][byteValue4] = byteValue1;
            break;
         }
      }

      return byteValue4;
   }

   // $VF: renamed from: b (int) boolean
   private static boolean b_bool3(int intValue1) {
      return intValue1 >= 101 && intValue1 <= 122;
   }

   // $VF: renamed from: b (int, int, int, int) void
   final void b_void7(int intValue1, int intValue2, int intValue3, int intValue4) {
      byte byteValue1;
      for (byteValue1 = 0; byteValue1 < 22; byteValue1++) {
         if (this.e_byteArr[9513 + byteValue1] == 0) {
            if (this.q_byte != 3) {
               this.t_byteArr[intValue4]++;
            }
            break;
         }
      }

      this.e_byteArr[9513 + byteValue1] = this.a_byteArr[this.a_shortArr[180] + intValue1];
      this.e_byteArr[9535 + byteValue1] = (byte)intValue1;
      this.e_byteArr[9359 + byteValue1] = this.e_byteArr[9645 + byteValue1] = (byte)intValue2;
      this.e_byteArr[9381 + byteValue1] = this.e_byteArr[9667 + byteValue1] = (byte)intValue3;
      this.e_byteArr[9403 + byteValue1] = this.e_byteArr[9425 + byteValue1] = 0;
      this.e_byteArr[9711 + byteValue1] = this.e_byteArr[9689 + byteValue1] = 0;
      this.e_byteArr[9601 + byteValue1] = 0;
      this.e_byteArr[9491 + byteValue1] = (byte)this.a_int2(255, 8);
      this.e_byteArr[9469 + byteValue1] = (byte)intValue4;
      this.e_byteArr[9557 + byteValue1] = this.a_byteArr[this.a_shortArr[184] + intValue1];
      this.e_byteArr[9579 + byteValue1] = 0;
      this.e_byteArr[9447 + byteValue1] = 0;
      this.c_byteArr2[intValue3][intValue2] = (byte)(101 + byteValue1);
   }

   // $VF: renamed from: c (int) boolean
   private static boolean c_bool3(int intValue1) {
      return intValue1 <= -61 && intValue1 >= -110;
   }

   // $VF: renamed from: a (int, int, int, byte) void
   final void a_void16(int intValue1, int intValue2, int intValue3, byte byteValue1) {
      byte byteValue2 = 0;

      while (byteValue2 < 50 && this.e_byteArr[9833 + byteValue2] != 0) {
         byteValue2++;
      }

      if (byteValue2 == 50) {
         byteValue2 = 0;

         while (this.e_byteArr[9833 + byteValue2] != 6 || this.e_byteArr[9833 + byteValue2] != 7) {
            byteValue2++;
         }

         this.c_byteArr2[this.e_byteArr[9783 + byteValue2]][this.e_byteArr[9733 + byteValue2]] = 0;
      }

      this.e_byteArr[9833 + byteValue2] = (byte)intValue1;
      this.e_byteArr[9733 + byteValue2] = (byte)intValue2;
      this.e_byteArr[9783 + byteValue2] = (byte)intValue3;
      this.e_byteArr[9883 + byteValue2] = byteValue1;
      this.c_byteArr2[intValue3][intValue2] = (byte)(-61 - byteValue2);
   }

   // $VF: renamed from: c (int) byte
   private static byte c_byte2(int intValue1) {
      if (intValue1 <= -111 && intValue1 >= -116) {
         return 0;
      } else if (intValue1 <= -117 && intValue1 >= -122) {
         return 1;
      } else {
         return (byte)(intValue1 == -123 ? 3 : 2);
      }
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean b_bool4(int intValue1, int intValue2) {
      return intValue1 >= 0 && intValue2 >= 0 && intValue1 < this.c_short && intValue2 < this.d_short;
   }

   // $VF: renamed from: a (int, int) byte
   private byte a_byte6(int intValue1, int intValue2) {
      if ((this.a_intArr3[0][intValue1 >> 5][intValue2] >> intValue1 & 31 & 1) == 0) {
         return 2;
      } else {
         return (byte)((this.a_intArr3[1][intValue1 >> 5][intValue2] >> intValue1 & 31 & 1) == 0 ? 1 : 0);
      }
   }

   // $VF: renamed from: c (int, int, int, int) void
   final void c_void7(int intValue1, int intValue2, int intValue3, int intValue4) {
      for (int loopIndex1 = intValue2; loopIndex1 < intValue2 + intValue4; loopIndex1++) {
         for (int loopIndex2 = intValue1; loopIndex2 < intValue1 + intValue3; loopIndex2++) {
            if (this.a_bool3(loopIndex2, loopIndex1)) {
               this.a_boolArr2[loopIndex1 - this.K_byte][loopIndex2 - this.I_byte] = true;
            }
         }
      }

      this.B_bool = true;
   }

   // $VF: renamed from: a (boolean, boolean, boolean, boolean) void
   private void a_void17(boolean flag1, boolean flag2, boolean flag3, boolean flag4) {
      this.a_void18(flag1, flag2, flag3, flag4, false, false, false, false, false);
   }

   // $VF: renamed from: a (boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean) void
   private void a_void18(boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, boolean flag7, boolean flag8, boolean flag9) {
      this.b_boolArr[0] = this.a_boolArr[0] = flag1;
      this.b_boolArr[1] = this.a_boolArr[1] = flag2;
      this.b_boolArr[2] = this.a_boolArr[2] = flag3;
      this.b_boolArr[4] = this.a_boolArr[4] = flag4;
      this.b_boolArr[5] = this.a_boolArr[5] = flag5;
      this.b_boolArr[6] = this.a_boolArr[6] = flag6;
      this.b_boolArr[7] = this.a_boolArr[7] = flag7;
      this.b_boolArr[8] = this.a_boolArr[8] = flag8;
      this.b_boolArr[9] = this.a_boolArr[9] = flag9;
      this.b_boolArr[17] = this.a_boolArr[17] = true;
      if (flag2) {
         if (this.u_byteArr[0] == 0) {
            this.b_boolArr[1] = this.a_boolArr[1] = true;
            this.b_boolArr[9] = this.a_boolArr[9] = false;
         } else if (this.u_byteArr[0] != 0) {
            this.b_boolArr[9] = this.a_boolArr[9] = true;
            this.b_boolArr[1] = this.a_boolArr[1] = false;
         }
      }

      int intValue1 = this.ba;
      if (this.a_boolArr[4]) {
         this.ba = 48;
         this.ax_byte = this.d_byteArr[3];
      } else {
         this.ba = 22;
         this.ax_byte = this.d_byteArr[2];
      }

      if (intValue1 < this.ba && this.ae_int == 0 && this.K_byte < this.d_short - 1) {
         this.ae_int = 1;
         this.K_byte++;
         this.A_byte--;
         if (this.K_byte < this.d_short - 1) {
            this.K_byte++;
            this.A_byte--;
            this.A_bool = true;
         }
      } else if (intValue1 > this.ba && !flag4 && this.ae_int == 0 && this.K_byte > 0) {
         this.ae_int = -1;
         this.K_byte--;
         this.A_byte++;
         if (this.K_byte > 0) {
            this.K_byte--;
            this.A_byte++;
            this.A_bool = true;
         }
      }

      if (this.a_boolArr[1]) {
         this.ad_byte = 1;
      } else if (this.a_boolArr[2]) {
         this.ad_byte = 2;
      } else if (this.a_boolArr[5]) {
         this.ad_byte = 5;
      } else if (this.a_boolArr[6]) {
         this.ad_byte = 6;
      } else if (this.a_boolArr[9]) {
         this.ad_byte = 9;
      }

      this.aZ = this.b_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + this.ad_byte]];
      byte byteValue1 = this.P_byte;
      this.P_byte = (byte)((239 - this.ba - this.aZ + this.ax_byte) / 16 + 1);
      if (this.P_byte > byteValue1) {
         this.C_bool = true;
      }

      this.A_int = this.P_byte * 16;
      this.c_intArr[2] = this.c_intArr[3] = this.A_int;
      this.c_intArr[4] = this.c_intArr[5] = this.c_intArr[7] = this.c_intArr[10] = this.A_int + this.ba;
      this.c_intArr[11] = this.c_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + this.ad_byte]]
         + this.b_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + this.ad_byte]];
   }

   // $VF: renamed from: a (byte, byte, byte, byte) void
   final void a_void19(byte byteValue1, byte byteValue2, byte byteValue3, byte byteValue4) {
      if (this.c_int != 0 && this.u_byte <= 0) {
         boolean flag1 = false;
         if (byteValue1 != 100) {
            flag1 = true;

            for (int loopIndex1 = 0; loopIndex1 < 10; loopIndex1++) {
               if (this.u_byteArr[loopIndex1] == 0) {
                  this.u_byteArr[loopIndex1] = byteValue1;
                  this.k_byteArr2[0][loopIndex1] = byteValue2;
                  this.k_byteArr2[1][loopIndex1] = byteValue3;
                  this.k_byteArr2[2][loopIndex1] = byteValue4;
                  this.g_intArr[loopIndex1] = 0;
                  break;
               }
            }
         } else if (this.u_byteArr[0] != 0) {
            boolean flag2 = false;
            flag1 = true;
            this.ay_byte = 0;

            for (int loopIndex2 = 0; loopIndex2 < 9; loopIndex2++) {
               this.g_intArr[loopIndex2]++;
            }

            if (this.u_byteArr[1] != 0) {
               if (this.g_intArr[0] > 1) {
                  flag2 = true;
               }
            } else if (this.g_intArr[0] > 4) {
               flag2 = true;
            }

            if (flag2) {
               for (int loopIndex3 = 0; loopIndex3 < 9; loopIndex3++) {
                  this.u_byteArr[loopIndex3] = this.u_byteArr[loopIndex3 + 1];
                  this.k_byteArr2[0][loopIndex3] = this.k_byteArr2[0][loopIndex3 + 1];
                  this.k_byteArr2[1][loopIndex3] = this.k_byteArr2[1][loopIndex3 + 1];
                  this.k_byteArr2[2][loopIndex3] = this.k_byteArr2[2][loopIndex3 + 1];
                  this.g_intArr[loopIndex3] = this.g_intArr[loopIndex3 + 1];
                  this.u_byteArr[loopIndex3 + 1] = 0;
               }

               if (this.u_byteArr[0] != 0 && this.u_byteArr[1] == 0) {
                  this.g_intArr[0] = 0;
               }
            }
         }

         if (flag1 && (this.a_boolArr[1] || this.a_boolArr[9])) {
            this.a_void17(this.a_boolArr[0], true, false, this.a_boolArr[4]);
            this.ay_byte = (byte)(this.k_byteArr2[0][0] == 0 && this.k_byteArr2[1][0] == 0 ? 0 : 1);
         }
      }
   }

   // $VF: renamed from: g (byte) void
   private void g_void3(byte byteValue1) {
      try {
         this.q_byte = byteValue1;
         this.aM();
         this.aN();
         this.aO();
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: aM () void
   private void aM() {
      this.u_bool = false;
      this.t_bool = false;
      this.F_byte = -1;

      for (int loopIndex1 = 0; loopIndex1 < this.b_shortArr[121]; loopIndex1++) {
         this.e_byteArr[loopIndex1] = 0;
      }

      for (int loopIndex2 = 0; loopIndex2 <= 100; loopIndex2++) {
         this.e_byteArr[4040 + loopIndex2] = -100;
         this.e_byteArr[4242 + loopIndex2] = 1;
         this.e_byteArr[4343 + loopIndex2] = -1;
      }

      for (int loopIndex3 = 0; loopIndex3 < 50; loopIndex3++) {
         this.a_byteArr2[2][loopIndex3] = this.a_byteArr2[3][loopIndex3] = this.a_byteArr2[4][loopIndex3] = 0;
      }

      for (int loopIndex4 = 0; loopIndex4 < 10; loopIndex4++) {
         this.u_byteArr[loopIndex4] = 0;
      }

      for (int loopIndex5 = 0; loopIndex5 < 5; loopIndex5++) {
         this.c_byteArr3[0][loopIndex5][2] = -1;
      }

      for (byte byteIndex1 = 0; byteIndex1 < 30; byteIndex1++) {
         this.e_byteArr2[0][byteIndex1] = 0;
      }

      for (byte byteIndex2 = 0; byteIndex2 < 3; byteIndex2++) {
         for (byte byteIndex3 = 0; byteIndex3 < 96; byteIndex3++) {
            this.a_intArr3[0][byteIndex2][byteIndex3] = 0;
         }
      }

      for (byte byteIndex4 = 0; byteIndex4 < 10; byteIndex4++) {
         for (byte byteIndex5 = 0; byteIndex5 < 12; byteIndex5++) {
            this.a_byteArr3[0][byteIndex4][byteIndex5] = 0;
            this.a_byteArr3[1][byteIndex4][byteIndex5] = 0;
         }
      }

      for (byte byteIndex6 = 0; byteIndex6 < 30; byteIndex6++) {
         for (byte byteIndex7 = 0; byteIndex7 < 4; byteIndex7++) {
            this.f_byteArr2[byteIndex7][byteIndex6] = 0;
         }

         for (byte byteIndex8 = 0; byteIndex8 < 5; byteIndex8++) {
            this.b_byteArr3[0][byteIndex8][byteIndex6] = this.b_byteArr3[1][byteIndex8][byteIndex6] = 0;
         }
      }

      for (int loopIndex6 = 0; loopIndex6 < 96; loopIndex6++) {
         for (int loopIndex7 = 0; loopIndex7 < 96; loopIndex7++) {
            this.c_byteArr2[loopIndex6][loopIndex7] = this.b_byteArr2[loopIndex6][loopIndex7] = 0;
         }
      }

      for (int loopIndex8 = 0; loopIndex8 < this.P_byte + 3; loopIndex8++) {
         for (int loopIndex9 = 0; loopIndex9 < this.O_byte; loopIndex9++) {
            this.g_byteArr2[loopIndex8][loopIndex9] = 0;
         }
      }

      if (!this.s_bool) {
         for (byte byteIndex9 = 0; byteIndex9 < 26; byteIndex9++) {
            this.a_shortArr2[0][byteIndex9] = this.a_shortArr2[1][byteIndex9] = 0;
         }

         this.a_shortArr2[0][17] = 0;
      }

      this.a_shortArr2[0][16] = 1;
      this.t();
      this.c_int = 0;
      this.h_int = 0;
      this.L_bool = this.N_bool = false;
      this.F_bool = false;
      this.K_bool = false;
      this.W_int = this.X_int = 0;
      this.aJ = 0;
      this.u_byte = 0;
      this.ay_byte = 0;
      this.engine.a_void2();
      this.i_void();
      this.k_bool = true;
   }

   // $VF: renamed from: aN () void
   private void aN() {
      int intValue1 = 0;

      try {
         System.gc();
         Thread.yield();
         Object unusedObject = null;
         int intValue2 = 0;
         this.c_short = this.e_short = this.a_byteArr[this.a_shortArr[149] + this.q_byte * 2];
         this.d_short = this.f_short = this.a_byteArr[this.a_shortArr[149] + this.q_byte * 2 + 1];
         if (this.q_byte == 0) {
            this.c_short = 40;
            this.d_short = 32;
         } else if (this.q_byte == 5) {
            this.c_short = (short)(this.c_short - 32);
         }

         int intValue3 = 0;
         int intValue4 = 10;

         for (int loopIndex1 = 0; loopIndex1 < this.f_short; loopIndex1++) {
            for (int loopIndex2 = 0; loopIndex2 < this.e_short; loopIndex2++) {
               if (intValue4 >= this.a_byteArr[this.a_shortArr[197] + 0 + intValue3]) {
                  intValue1 = (short)(this.v_byteArr[this.h_intArr[this.a_byteArr[this.a_shortArr[248] + this.q_byte]] + intValue2] & 255);
                  intValue2++;
                  if (intValue1 >= 250) {
                     intValue4 = 0;
                     intValue3 = intValue1 - 250;
                     intValue1 = this.a_byteArr[this.a_shortArr[197] + 6 + intValue3] & 255;
                  }
               }

               intValue4++;
               int intValue5 = intValue1;
               if (intValue1 <= 8) {
                  intValue5 = intValue1 + this.a_int2(3, 3);
               }

               this.b_byteArr2[loopIndex1][loopIndex2] = (byte)intValue5;
               int intValue6 = (this.b_shortArr2[9][intValue5] & '\uffff') >> 13 & 1;
               if ((intValue5 >= 175 || intValue6 == 1) && this.c_byteArr2[loopIndex1][loopIndex2] != -127) {
                  this.c_byteArr2[loopIndex1][loopIndex2] = -126;
               } else if (this.c_byteArr2[loopIndex1][loopIndex2] == -126) {
                  this.c_byteArr2[loopIndex1][loopIndex2] = 0;
               }

               if (this.q_byte != 3) {
                  if (((this.j_byteArr2[16][intValue5] & '\uffff') >> 6 & 3) == 2) {
                     this.c_byteArr2[loopIndex1][loopIndex2] = -125;
                  }

                  if (intValue5 >= 180 && intValue5 <= 231) {
                     this.c_byteArr2[loopIndex1][loopIndex2] = -124;
                  } else if (intValue5 >= 175 && intValue5 <= 179) {
                     this.a_void16(intValue5 - 175 + 1, loopIndex2, loopIndex1, this.a_byteArr[this.a_shortArr[110] + intValue5 - 175 + 1]);
                  }
               }

               if (loopIndex1 == 0 || loopIndex1 == this.f_short - 1 || loopIndex2 == this.e_short - 1) {
                  this.c_byteArr2[loopIndex1][loopIndex2] = -126;
               }
            }
         }

         for (int loopIndex3 = 0; loopIndex3 < this.d_short; loopIndex3++) {
            for (int loopIndex4 = 1; loopIndex4 < this.c_short - 1; loopIndex4++) {
               if (c_bool3(this.c_byteArr2[loopIndex3][loopIndex4]) && this.e_byteArr[9833 + (this.c_byteArr2[loopIndex3][loopIndex4] + 61) * -1] == 5) {
                  byte byteValue1;
                  if ((byteValue1 = this.b_byteArr2[loopIndex3][loopIndex4 - 1]) == 33 || byteValue1 == 34 || byteValue1 == 37 || byteValue1 == 38) {
                     this.c_byteArr2[loopIndex3][loopIndex4 - 1] = -127;
                  }

                  if ((byteValue1 = this.b_byteArr2[loopIndex3][loopIndex4 + 1]) == 33 || byteValue1 == 34 || byteValue1 == 37 || byteValue1 == 38) {
                     this.c_byteArr2[loopIndex3][loopIndex4 + 1] = -127;
                  }
               }
            }
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: aO () void
   private void aO() {
      this.aP();
      this.a_shortArr2[0][17] = (short)(this.q_byte == 3 ? 0 : 1);
      this.y_byte = this.C_byte;
      this.A_byte = this.D_byte;
      this.I_byte = this.J_byte = (byte)(this.a_byteArr[this.a_shortArr[150] + this.q_byte * 2] - this.y_byte);
      this.K_byte = this.L_byte = (byte)(this.a_byteArr[this.a_shortArr[150] + this.q_byte * 2 + 1] - this.A_byte);
      this.aK();
      this.J_byte = this.I_byte;
      this.L_byte = this.K_byte;
      this.z_byte = this.y_byte;
      this.B_byte = this.A_byte;
      this.engine.d_void2();
   }

   // $VF: renamed from: aP () void
   private void aP() {
      if (this.q_byte == 3) {
         this.aw_byte = 0;
      }

      short shortValue1 = this.a_shortArr[250 + this.q_byte];
      byte byteValue1 = this.a_byteArr[this.a_shortArr[262] + this.q_byte];

      for (byte byteIndex1 = 0; byteIndex1 < byteValue1; byteIndex1++) {
         if (this.a_byteArr[shortValue1 + 0 * byteValue1 + byteIndex1] != -1) {
            if (this.a_byteArr[shortValue1 + 1 * byteValue1 + byteIndex1] >= 0) {
               this.a_byte4(
                  this.a_byteArr[shortValue1 + 0 * byteValue1 + byteIndex1],
                  this.a_byteArr[shortValue1 + 1 * byteValue1 + byteIndex1],
                  this.a_byteArr[shortValue1 + 2 * byteValue1 + byteIndex1],
                  this.a_byteArr[shortValue1 + 3 * byteValue1 + byteIndex1],
                  this.a_byteArr[shortValue1 + 4 * byteValue1 + byteIndex1],
                  true,
                  -1
               );
            } else if (this.a_byteArr[shortValue1 + 1 * byteValue1 + byteIndex1] == -1) {
               this.a_byte3(
                  (byte)(this.a_byteArr[shortValue1 + 0 * byteValue1 + byteIndex1] & 1),
                  this.a_byteArr[shortValue1 + 2 * byteValue1 + byteIndex1],
                  this.a_byteArr[shortValue1 + 3 * byteValue1 + byteIndex1],
                  this.a_byteArr[shortValue1 + 4 * byteValue1 + byteIndex1],
                  (byte)((this.a_byteArr[shortValue1 + 0 * byteValue1 + byteIndex1] >> 1) + ((this.a_byteArr[shortValue1 + 0 * byteValue1 + byteIndex1] & 1) != 0 ? this.b_byte : 0))
               );
            } else if (this.a_byteArr[shortValue1 + 1 * byteValue1 + byteIndex1] == -2) {
               this.b_void7(1, this.a_byteArr[shortValue1 + 2 * byteValue1 + byteIndex1], this.a_byteArr[shortValue1 + 3 * byteValue1 + byteIndex1], this.a_byteArr[shortValue1 + 0 * byteValue1 + byteIndex1]);
            }

            if (byteIndex1 <= 10 && this.q_byte != 1 && this.q_byte != 6) {
               this.a_shortArr2[0][byteIndex1] = this.a_byteArr[this.a_shortArr[263] + 11 * this.q_byte * 2 + byteIndex1];
               this.a_shortArr2[1][byteIndex1] = (short)(this.a_byteArr[this.a_shortArr[263] + 11 * (this.q_byte * 2 + 1) + byteIndex1] * 20);
            }
         }
      }

      if (this.q_byte == 0) {
         this.e_byteArr[7476] = 4;
         this.e_byteArr[7479] = 5;
      } else {
         if (this.q_byte == 3) {
            this.aw_byte = 2;
         }
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, javax.microedition.lcdui.Image, int, int, int, int, int, int, int) boolean
   static boolean a_bool6(Graphics graphics1, Image image1, int intValue1, int intValue2, int intValue3, int intValue4, int intValue5, int intValue6, int intValue7) {
      try {
         graphics1.drawRegion(image1, intValue1, intValue2, intValue3, intValue4, 0, intValue5, intValue6, intValue7);
         return true;
      } catch (Exception ignoredException1) {
         return false;
      }
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void b_void8(Graphics graphics1, int intValue1, int intValue2, int intValue3, int intValue4) {
      graphics1.fillRect(0 + intValue1, 0 + intValue2, intValue3, intValue4 + 0);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   static void a_void20(Graphics graphics1, int intValue1, int intValue2, int intValue3, int intValue4) {
      graphics1.drawRect(intValue1, intValue2, intValue3, intValue4);
   }

   // $VF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void c_void8(Graphics graphics1, int intValue1, int intValue2, int intValue3, int intValue4) {
      graphics1.setClip(intValue1, intValue2, intValue3, intValue4);
   }

   // $VF: renamed from: d (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void d_void6(Graphics graphics1, int intValue1, int intValue2, int intValue3, int intValue4) {
      graphics1.drawLine(intValue1, intValue2, intValue3, intValue4);
   }

   // $VF: renamed from: d (int) boolean
   private boolean d_bool2(int intValue1) {
      boolean flag1 = false;

      try {
         System.gc();
         Thread.yield();
         RecordStore recordStore1;
         if ((recordStore1 = RecordStore.openRecordStore(this.b_obj_String + intValue1, true)).getNumRecords() <= 0) {
            recordStore1.closeRecordStore();
            return false;
         } else {
            DataInputStream dataInput1 = new DataInputStream(new ByteArrayInputStream(recordStore1.getRecord(1)));

            try {
               if (intValue1 == 0) {
                  this.l_int = dataInput1.readInt();
                  this.W_bool = dataInput1.readBoolean();
                  this.r_byte = dataInput1.readByte();
                  this.V_byte = (byte)(4 + this.r_byte);
                  this.s_byte = dataInput1.readByte();
                  this.t_byte = dataInput1.readByte();
                  this.c_byte = dataInput1.readByte();
                  this.p_byte = dataInput1.readByte();
               } else {
                  this.q_byte = dataInput1.readByte();
                  this.aM();
                  this.p_byte = dataInput1.readByte();
                  this.d_byte = dataInput1.readByte();
                  if (intValue1 == 2) {
                     this.b_byte = this.d_byte;
                  }

                  this.aN();
                  dataInput1.read(this.e_byteArr);
                  dataInput1.read(this.q_byteArr);
                  dataInput1.read(this.a_byteArr2[0]);
                  dataInput1.read(this.a_byteArr2[1]);
                  dataInput1.read(this.a_byteArr2[2]);
                  dataInput1.read(this.a_byteArr2[3]);

                  for (int loopIndex1 = 0; loopIndex1 < 26; loopIndex1++) {
                     this.a_shortArr2[0][loopIndex1] = dataInput1.readShort();
                     this.a_shortArr2[1][loopIndex1] = dataInput1.readShort();
                  }

                  dataInput1.read(this.e_byteArr2[0]);
                  dataInput1.read(this.e_byteArr2[1]);
                  dataInput1.read(this.e_byteArr2[2]);

                  for (int loopIndex2 = 0; loopIndex2 < 10; loopIndex2++) {
                     for (int loopIndex3 = 0; loopIndex3 < 12; loopIndex3++) {
                        this.a_byteArr3[0][loopIndex2][loopIndex3] = dataInput1.readByte();
                        this.a_byteArr3[1][loopIndex2][loopIndex3] = dataInput1.readByte();
                     }
                  }

                  dataInput1.read(this.f_byteArr2[0]);
                  dataInput1.read(this.f_byteArr2[1]);
                  dataInput1.read(this.f_byteArr2[2]);
                  dataInput1.read(this.f_byteArr2[3]);

                  for (int loopIndex4 = 0; loopIndex4 < 5; loopIndex4++) {
                     dataInput1.read(this.b_byteArr3[0][loopIndex4]);
                     dataInput1.read(this.b_byteArr3[1][loopIndex4]);
                     dataInput1.read(this.c_byteArr3[0][loopIndex4]);
                     dataInput1.read(this.c_byteArr3[1][loopIndex4]);
                  }

                  this.aq_byte = dataInput1.readByte();
                  this.y_byte = this.z_byte = dataInput1.readByte();
                  this.A_byte = this.B_byte = dataInput1.readByte();
                  this.I_byte = this.J_byte = dataInput1.readByte();
                  this.K_byte = this.L_byte = dataInput1.readByte();
                  this.h_byte = dataInput1.readByte();
                  this.ai_byte = dataInput1.readByte();
                  this.c_int = dataInput1.readInt();
                  this.L_bool = dataInput1.readBoolean();
                  this.N_bool = dataInput1.readBoolean();

                  for (int loopIndex5 = 0; loopIndex5 < 3; loopIndex5++) {
                     for (int loopIndex6 = 0; loopIndex6 < 96; loopIndex6++) {
                        this.a_intArr3[0][loopIndex5][loopIndex6] = dataInput1.readInt();
                     }
                  }

                  dataInput1.read(this.engine.c_byteArr2[0]);
                  dataInput1.read(this.engine.c_byteArr2[1]);
                  dataInput1.read(this.engine.c_byteArr2[2]);
                  dataInput1.read(this.engine.c_byteArr2[3]);
                  dataInput1.read(this.engine.c_byteArr2[4]);
                  dataInput1.read(this.engine.c_byteArr2[5]);
                  this.engine.f_byte = dataInput1.readByte();
                  this.engine.K_byte = dataInput1.readByte();
                  this.engine.R_byte = dataInput1.readByte();
                  this.engine.L_byte = dataInput1.readByte();
                  this.engine.aQ = dataInput1.readInt();
                  dataInput1.read(this.engine.f_byteArr2[0]);
                  dataInput1.read(this.engine.f_byteArr2[1]);
                  dataInput1.read(this.engine.g_byteArr2[0]);
                  dataInput1.read(this.engine.g_byteArr2[1]);
                  dataInput1.read(this.engine.g_byteArr2[2]);
                  dataInput1.read(this.engine.j_byteArr);
                  this.engine.N_byte = dataInput1.readByte();
                  this.engine.O_byte = dataInput1.readByte();
                  this.engine.g_byte = dataInput1.readByte();
                  this.engine.J_byte = dataInput1.readByte();
                  this.engine.I_byte = dataInput1.readByte();
                  dataInput1.read(this.t_byteArr);
                  int intValue2 = -111;

                  while (intValue2 >= -122) {
                     byte byteValue1;
                     if ((byteValue1 = dataInput1.readByte()) == 127) {
                        intValue2--;
                     } else {
                        byte byteValue2 = dataInput1.readByte();
                        this.c_byteArr2[byteValue2][byteValue1] = (byte)intValue2;
                     }
                  }

                  for (int loopIndex7 = 0; loopIndex7 < 30; loopIndex7++) {
                     if (this.f_byteArr2[0][loopIndex7] != 0) {
                        this.c_byteArr2[this.f_byteArr2[3][loopIndex7]][this.f_byteArr2[2][loopIndex7]] = (byte)(this.f_byteArr2[0][loopIndex7] <= 30 ? -123 : -126);
                     }
                  }

                  for (int loopIndex8 = 0; loopIndex8 < 50; loopIndex8++) {
                     if (this.e_byteArr[9833 + loopIndex8] >= 6) {
                        this.c_byteArr2[this.e_byteArr[9783 + loopIndex8]][this.e_byteArr[9733 + loopIndex8]] = (byte)(-61 - loopIndex8);
                     }
                  }

                  for (int loopIndex9 = 1; loopIndex9 <= 100; loopIndex9++) {
                     if (this.e_byteArr[1919 + loopIndex9] != 0) {
                        this.e_byteArr[808 + loopIndex9] = 0;
                        if (this.e_byteArr[4646 + loopIndex9] < 0) {
                           this.c_byteArr2[this.e_byteArr[101 + loopIndex9]][this.e_byteArr[0 + loopIndex9]] = (byte)loopIndex9;
                           if ((this.e_byteArr[2929 + loopIndex9] & 255) <= 7
                              && (this.e_byteArr[1111 + loopIndex9] & 15)
                                 < (
                                       this.a_byteArr[this.a_shortArr[15]
                                             + (this.e_byteArr[606 + loopIndex9] & 1) * 9
                                             + this.e_byteArr[1010 + loopIndex9]
                                             - this.e_byteArr[7777 + loopIndex9]]
                                          + 1
                                    )
                                    / 2
                              && this.c_byteArr2[this.e_byteArr[101 + loopIndex9] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + loopIndex9]]][this.e_byteArr[0
                                       + loopIndex9]
                                    + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + loopIndex9]]]
                                 == 0) {
                              this.c_byteArr2[this.e_byteArr[101 + loopIndex9] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + loopIndex9]]][this.e_byteArr[0
                                    + loopIndex9]
                                 + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + loopIndex9]]] = -128;
                           }
                        }
                     }
                  }

                  for (int loopIndex10 = 0; loopIndex10 < 22; loopIndex10++) {
                     this.e_byteArr[9689 + loopIndex10] = 0;
                     if (this.e_byteArr[9513 + loopIndex10] != 0) {
                        this.c_byteArr2[this.e_byteArr[9381 + loopIndex10]][this.e_byteArr[9359 + loopIndex10]] = (byte)(101 + loopIndex10);
                        if ((this.e_byteArr[9557 + loopIndex10] & 255) <= 7
                           && (this.e_byteArr[9623 + loopIndex10] & 15)
                              < (
                                    this.a_byteArr[this.a_shortArr[15]
                                          + (this.e_byteArr[9491 + loopIndex10] & 1) * 9
                                          + this.a_byteArr[this.a_shortArr[179] + this.e_byteArr[9535 + loopIndex10]]]
                                       + 1
                                 )
                                 / 2
                           && this.c_byteArr2[this.e_byteArr[9381 + loopIndex10] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[9491 + loopIndex10]]][this.e_byteArr[9359
                                    + loopIndex10]
                                 + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[9491 + loopIndex10]]]
                              == 0) {
                           this.c_byteArr2[this.e_byteArr[9381 + loopIndex10] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[9491 + loopIndex10]]][this.e_byteArr[9359
                                 + loopIndex10]
                              + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[9491 + loopIndex10]]] = -128;
                        }
                     }
                  }

                  for (int loopIndex11 = 1; loopIndex11 <= 60; loopIndex11++) {
                     if (this.e_byteArr[8505 + loopIndex11] != 0) {
                        for (int loopIndex12 = 0; loopIndex12 < this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + loopIndex11]]; loopIndex12++) {
                           for (int loopIndex13 = 0; loopIndex13 < this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + loopIndex11]]; loopIndex13++) {
                              this.c_byteArr2[this.e_byteArr[8444 + loopIndex11] + loopIndex12][this.e_byteArr[8383 + loopIndex11] + loopIndex13] = (byte)(-loopIndex11);
                           }
                        }
                     }
                  }

                  this.engine.n_void2();
                  this.engine.j_void2();
                  this.engine.d_void2();
                  this.aK();
                  this.J_byte = this.I_byte;
                  this.L_byte = this.K_byte;
               }

               flag1 = true;
            } catch (Exception ignoredException1) {
            }

            dataInput1.close();
            recordStore1.closeRecordStore();
            if (!flag1) {
               RecordStore.deleteRecordStore(this.b_obj_String + intValue1);
               this.d_bool2(intValue1);
            }

            return flag1;
         }
      } catch (Exception ignoredException2) {
         return false;
      }
   }

   // $VF: renamed from: e (int) boolean
   private boolean e_bool2(int intValue1) {
      boolean flag1 = false;

      try {
         RecordStore recordStore1 = null;
         ByteArrayOutputStream byteOutput1 = null;
         DataOutputStream dataOutput1 = null;

         try {
            RecordStore.deleteRecordStore(this.b_obj_String + intValue1);
            recordStore1 = RecordStore.openRecordStore(this.b_obj_String + intValue1, true);
            byteOutput1 = new ByteArrayOutputStream();
            dataOutput1 = new DataOutputStream(byteOutput1);
            if (intValue1 == 0) {
               dataOutput1.writeInt(this.l_int);
               dataOutput1.writeBoolean(this.W_bool);
               dataOutput1.writeByte(this.r_byte);
               dataOutput1.writeByte(this.s_byte);
               dataOutput1.writeByte(this.t_byte);
               dataOutput1.writeByte(this.c_byte);
               dataOutput1.writeByte(this.p_byte);
            } else {
               if (intValue1 == 2) {
                  this.W_bool = true;
               } else if (intValue1 == 1) {
                  this.t_byte = this.a_byteArr[this.a_shortArr[248] + this.q_byte];
               }

               dataOutput1.writeByte(this.q_byte);
               dataOutput1.writeByte(this.p_byte);
               dataOutput1.writeByte(this.d_byte);
               dataOutput1.write(this.e_byteArr);
               dataOutput1.write(this.q_byteArr);
               dataOutput1.write(this.a_byteArr2[0]);
               dataOutput1.write(this.a_byteArr2[1]);
               dataOutput1.write(this.a_byteArr2[2]);
               dataOutput1.write(this.a_byteArr2[3]);

               for (int loopIndex1 = 0; loopIndex1 < 26; loopIndex1++) {
                  dataOutput1.writeShort(this.a_shortArr2[0][loopIndex1]);
                  dataOutput1.writeShort(this.a_shortArr2[1][loopIndex1]);
               }

               dataOutput1.write(this.e_byteArr2[0]);
               dataOutput1.write(this.e_byteArr2[1]);
               dataOutput1.write(this.e_byteArr2[2]);

               for (int loopIndex2 = 0; loopIndex2 < 10; loopIndex2++) {
                  for (int loopIndex3 = 0; loopIndex3 < 12; loopIndex3++) {
                     dataOutput1.writeByte(this.a_byteArr3[0][loopIndex2][loopIndex3]);
                     dataOutput1.writeByte(this.a_byteArr3[1][loopIndex2][loopIndex3]);
                  }
               }

               dataOutput1.write(this.f_byteArr2[0]);
               dataOutput1.write(this.f_byteArr2[1]);
               dataOutput1.write(this.f_byteArr2[2]);
               dataOutput1.write(this.f_byteArr2[3]);

               for (int loopIndex4 = 0; loopIndex4 < 5; loopIndex4++) {
                  dataOutput1.write(this.b_byteArr3[0][loopIndex4]);
                  dataOutput1.write(this.b_byteArr3[1][loopIndex4]);
                  dataOutput1.write(this.c_byteArr3[0][loopIndex4]);
                  dataOutput1.write(this.c_byteArr3[1][loopIndex4]);
               }

               dataOutput1.writeByte(this.aq_byte);
               dataOutput1.writeByte(this.y_byte);
               dataOutput1.writeByte(this.A_byte);
               dataOutput1.writeByte(this.I_byte);
               dataOutput1.writeByte(this.K_byte);
               dataOutput1.writeByte(this.h_byte);
               dataOutput1.writeByte(this.ai_byte);
               dataOutput1.writeInt(this.c_int);
               dataOutput1.writeBoolean(this.L_bool);
               dataOutput1.writeBoolean(this.N_bool);

               for (int loopIndex5 = 0; loopIndex5 < 3; loopIndex5++) {
                  for (int loopIndex6 = 0; loopIndex6 < 96; loopIndex6++) {
                     dataOutput1.writeInt(this.a_intArr3[0][loopIndex5][loopIndex6]);
                  }
               }

               dataOutput1.write(this.engine.c_byteArr2[0]);
               dataOutput1.write(this.engine.c_byteArr2[1]);
               dataOutput1.write(this.engine.c_byteArr2[2]);
               dataOutput1.write(this.engine.c_byteArr2[3]);
               dataOutput1.write(this.engine.c_byteArr2[4]);
               dataOutput1.write(this.engine.c_byteArr2[5]);
               dataOutput1.writeByte(this.engine.f_byte);
               dataOutput1.writeByte(this.engine.K_byte);
               dataOutput1.writeByte(this.engine.R_byte);
               dataOutput1.writeByte(this.engine.L_byte);
               dataOutput1.writeInt(this.engine.aQ);
               dataOutput1.write(this.engine.f_byteArr2[0]);
               dataOutput1.write(this.engine.f_byteArr2[1]);
               dataOutput1.write(this.engine.g_byteArr2[0]);
               dataOutput1.write(this.engine.g_byteArr2[1]);
               dataOutput1.write(this.engine.g_byteArr2[2]);
               dataOutput1.write(this.engine.j_byteArr);
               dataOutput1.writeByte(this.engine.N_byte);
               dataOutput1.writeByte(this.engine.O_byte);
               dataOutput1.writeByte(this.engine.g_byte);
               dataOutput1.writeByte(this.engine.J_byte);
               dataOutput1.writeByte(this.engine.I_byte);
               dataOutput1.write(this.t_byteArr);

               for (int loopIndex7 = -111; loopIndex7 >= -122; loopIndex7--) {
                  for (int loopIndex8 = 0; loopIndex8 < this.c_short; loopIndex8++) {
                     for (int loopIndex9 = 0; loopIndex9 < this.d_short; loopIndex9++) {
                        if (this.c_byteArr2[loopIndex9][loopIndex8] == loopIndex7) {
                           dataOutput1.writeByte(loopIndex8);
                           dataOutput1.writeByte(loopIndex9);
                        }
                     }
                  }

                  dataOutput1.writeByte(127);
               }
            }

            recordStore1.addRecord(byteOutput1.toByteArray(), 0, byteOutput1.size());
            flag1 = true;
         } catch (Exception ignoredException1) {
         }

         if (recordStore1 != null) {
            recordStore1.closeRecordStore();
         }

         if (byteOutput1 != null) {
            byteOutput1.close();
         }

         if (dataOutput1 != null) {
            dataOutput1.close();
         }
      } catch (Exception ignoredException2) {
      }

      return flag1;
   }

   // $VF: renamed from: a (int, int) int
   final int a_int2(int intValue1, int intValue2) {
      return (this.a_obj_Random.nextInt() & intValue1) % intValue2;
   }

   // $VF: renamed from: a () long
   private static long a_long() {
      return System.currentTimeMillis();
   }

   public final void hideNotify() {
      this.d_void7();
   }

   public final void showNotify() {
      this.e_void5();
   }

   // $VF: renamed from: d () void
   public final void d_void7() {
      this.Y_bool = true;
      this.Z_bool = true;
      if (this.aa_bool && !this.ad_bool) {
         this.aR();
      }

      this.ad_bool = true;
   }

   // $VF: renamed from: e () void
   public final void e_void5() {
      this.Y_bool = false;
   }

   // $VF: renamed from: aQ () void
   private void aQ() {
      this.engine.k_void2();
      f_byte = this.b_byteArr[this.h_byte * 2 + this.a_int2(255, 2)];
      if (this.soundPlayer == null || this.soundPlayer.a_int() <= 100 || f_byte != g_byte) {
         g_byte = f_byte;
         this.aR();
         new StringBuffer().append("/s").append(f_byte).toString();
         this.soundPlayer = new SoundPlayer("audio/midi");
      }

      this.soundPlayer.a_void2(this.e_byte);
   }

   // $VF: renamed from: aR () void
   private void aR() {
      if (this.soundPlayer != null) {
         this.soundPlayer.a_void();
         this.soundPlayer.b();
         this.soundPlayer = null;
      }
   }

   // $VF: renamed from: aS () void
   private void aS() {
      if (this.Z_bool) {
         if (this.Q_byte != 27 && this.ac_bool) {
            this.ab_bool = true;
            this.v_byte = 0;
            this.S_byte = this.R_byte;
            this.R_byte = this.Q_byte;
            this.Q_byte = 27;
            this.z_byte = this.y_byte;
            this.B_byte = this.A_byte;
            this.J_byte = this.I_byte;
            this.L_byte = this.K_byte;
         }

         while (this.Y_bool) {
            this.n_bool = false;
            Thread.yield();
            MainMIDlet.a(10);
         }
      }

      this.Z_bool = false;
      this.ad_bool = false;
      if (this.Q_byte != 27 && this.e_byte == 2 && (this.soundPlayer == null || this.soundPlayer != null && this.soundPlayer.a_int() != 400)) {
         this.aQ();
      }

      MainMIDlet.a(10);
   }

   // $VF: renamed from: m (int) void
   private void m_void2(int intValue1) {
      if (intValue1 == this.j_intArr[0]) {
         for (int loopIndex1 = 0; loopIndex1 < 6; loopIndex1++) {
            this.i_intArr[loopIndex1] = 0;
         }

         this.i_intArr[0] = this.j_intArr[0];
      } else {
         if (this.i_intArr[0] == this.j_intArr[0]) {
            for (int loopIndex2 = 0; loopIndex2 < 6; loopIndex2++) {
               if (this.i_intArr[loopIndex2] == 0) {
                  this.i_intArr[loopIndex2] = intValue1;
                  break;
               }
            }

            this.ae_bool = true;

            for (int loopIndex3 = 0; loopIndex3 < 5; loopIndex3++) {
               if (this.i_intArr[loopIndex3] != this.j_intArr[loopIndex3]) {
                  this.ae_bool = false;
                  break;
               }
            }

            if (this.ae_bool && this.i_intArr[5] != 0) {
               switch (this.i_intArr[5]) {
                  case 110:
                     this.u_byte = 1;
                     if (this.q_byte == 0) {
                        this.q_byte++;
                     }
                     break;
                  case 114:
                     this.af_bool = true;
                     break;
                  case 118:
                     this.a_shortArr2[0][0] = (short)(this.a_shortArr2[0][0] + 100);
                     this.a_shortArr2[0][1] = (short)(this.a_shortArr2[0][1] + 100);
                     this.a_shortArr2[0][2] = (short)(this.a_shortArr2[0][2] + 100);
                     this.a_shortArr2[0][3] = (short)(this.a_shortArr2[0][3] + 100);
                     this.a_shortArr2[0][4] = (short)(this.a_shortArr2[0][4] + 100);
                     this.a_shortArr2[0][5] = (short)(this.a_shortArr2[0][5] + 3);
                     this.a_shortArr2[0][8] = (short)(this.a_shortArr2[0][8] + 3);
                     this.a_shortArr2[0][10] = (short)(this.a_shortArr2[0][10] + 3);
                     break;
                  case 121:
                     this.ag_bool = true;
               }

               this.i_intArr[0] = 0;
            }
         }
      }
   }
}
