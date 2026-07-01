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
   MainMIDlet a_obj_tribes;
   // $VF: renamed from: a b
   GameEngine a_obj_b;
   // $VF: renamed from: a c
   GameRenderer a_obj_c;
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
   String a_obj_String;
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
   final String[] a_obj_StringArr = new String[]{"en", "fr", "it", "de", "es"};
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
   SoundPlayer a_obj_a;
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
   static final Image[] a_obj_ImageArr = new Image[4];
   // $VF: renamed from: a javax.microedition.lcdui.Graphics[]
   static final Graphics[] a_obj_GraphicsArr = new Graphics[4];
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
   Image[][] a_obj_ImageArr2;
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

   public GameResources(MainMIDlet var1) {
      this.setFullScreenMode(true);
      this.a_obj_tribes = var1;
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
      this.a_obj_tribes.notifyDestroyed();
   }

   // $VF: renamed from: f () void
   private void f_void() {
      this.a_obj_b = new GameEngine();
      System.gc();
      Thread.yield();
      new GameData(this);
      af_byte = 98;
      this.a_void10(0);
      this.a_obj_tribes.a_obj_Display.setCurrent(this);
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
      this.a_obj_b.a_byteArr3 = new byte[2][101][65];
      this.a_obj_b.b_byteArr3 = new byte[2][22][5];
      this.a_obj_b.c_byteArr3 = new byte[5][6][6];
      this.a_obj_b.a_byteArr2 = new byte[5][50];
      this.a_obj_b.c_byteArr = new byte[2];
      this.a_obj_b.d_byteArr = new byte[6];
      this.a_obj_b.e_byteArr = new byte[3];
      this.a_obj_b.f_byteArr = new byte[3];
      this.a_obj_b.d_byteArr3 = new byte[3][2][96];
      this.a_obj_b.g_byteArr = new byte[3];
      this.a_obj_b.e_byteArr3 = new byte[2][3][10];
      this.a_obj_b.h_byteArr = new byte[10];
      this.a_obj_b.c_byteArr2 = new byte[6][10];
      this.a_obj_b.a_boolArr = new boolean[3];
      this.a_obj_b.d_byteArr2 = new byte[2][50];
      this.a_obj_b.d_shortArr = new short[6];
      this.a_obj_b.i_byteArr = new byte[8];
      this.a_obj_b.e_byteArr2 = new byte[4][8];
      this.a_obj_b.f_byteArr2 = new byte[2][10];
      this.a_obj_b.g_byteArr2 = new byte[3][20];
      this.a_obj_b.j_byteArr = new byte[50];
      this.a_obj_b.k_byteArr = new byte[4];
      this.i_intArr = new int[6];
      this.j_intArr = new int[]{98, 118, 121, 110, 114};
      this.t_byteArr = new byte[3];
   }

   // $VF: renamed from: run () void
   public final void run() {
      try {
         this.f_void();
         this.g_void();
         this.a_obj_b.a_void(this);
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

            long var1 = a_long();
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

            long var5 = a_long() - var1;
            if ((var5 = this.i_int - var5) < 0L || var5 > this.i_int) {
               var5 = 0L;
            }

            MainMIDlet.a((int)var5);
         }
      } catch (Exception var8) {
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
                  if (this.a_byteArr[this.a_shortArr[296] + this.a_obj_b.g_byte] == 3) {
                     this.a_obj_b.J_byte = (byte)(120 - this.a_byteArr[this.a_shortArr[298] + this.a_obj_b.g_byte]);
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
         this.a_obj_b.g_void2();
         this.a_obj_b.e_void2();
         this.a_obj_b.h_void2();
         this.a_obj_b.i_void2();
      } catch (Exception var3) {
      }

      this.c_int++;
      this.h_int++;
      if (this.h_int >= 100) {
         int var1;
         if ((var1 = this.h_int - 100) >= this.d_short - 1) {
            this.h_int = 0;
         }

         for (int var2 = 0; var2 < this.c_short; var2++) {
            if (this.c_byteArr2[var1][var2] <= -114 && this.c_byteArr2[var1][var2] > -117) {
               this.c_byteArr2[var1][var2] = 0;
               this.c_void7(var2, var1, 1, 1);
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
      int var1 = this.I_byte + this.y_byte;
      int var2 = this.K_byte + this.A_byte;

      try {
         byte var3 = this.c_byteArr2[var2][var1];
         if (this.u_bool || var3 <= -1 && var3 >= -30) {
            this.W_byte = 0;
            return;
         }

         boolean var4 = false;
         if ((var3 < 51 || this.w_byte != 1) && (var3 < 1 || var3 > 50)) {
            for (int var9 = -1; var9 <= 1; var9++) {
               for (int var10 = -1; var10 <= 1; var10++) {
                  if (var1 + var10 >= 0
                     && var2 + var9 >= 0
                     && var1 + var10 < this.c_short
                     && var2 + var9 < this.d_short
                     && ((var3 = this.c_byteArr2[var2 + var9][var1 + var10]) >= 51 && this.w_byte == 1 || var3 >= 1 && var3 <= 50)) {
                     int var7 = this.e_byteArr[202 + var3];
                     int var8 = this.e_byteArr[303 + var3];
                     var8 = var9 < 0 ? 16 - var8 : (var9 == 0 ? 0 : 16 + var8);
                     int var13;
                     var7 = (var13 = var10 < 0 ? 22 - var7 : (var10 == 0 ? 0 : 22 + var7)) * var13;
                     int var16;
                     int var6 = ((var16 = var8 * var8) + var7) / 2;
                     if (this.W_byte == var3 && (var6 < 13 || var3 <= 50)) {
                        this.ac_int = var6;
                        var4 = true;
                     }

                     if (var6 < this.ac_int && (var6 < 13 || var3 <= 50)) {
                        this.ac_int = var6;
                        this.W_byte = var3;
                        var4 = true;
                     }
                  }
               }
            }

            if (!var4) {
               this.W_byte = 0;
               this.ac_int = 1000;
            }
         } else {
            this.W_byte = var3;
         }

         if (this.W_byte < 50 && this.w_byte == 1) {
            this.W_byte = 0;
         }
      } catch (Exception var11) {
      }
   }

   // $VF: renamed from: l () void
   private void l_void() {
      this.z_bool = true;
      this.repaint();
      Thread.yield();
   }

   protected final void paint(Graphics var1) {
      if (this.v_byte == 1) {
         a_bool6(var1, a_obj_ImageArr[this.c_byteArr[1]], 0, 0, 320, this.A_int, this.a_short - 0, this.b_short - 0 + this.ba - this.ax_byte, 0);

         for (byte var2 = 0; var2 < 20; var2++) {
            if (this.a_boolArr[var2]) {
               a_bool6(
                  var1,
                  a_obj_ImageArr[this.c_byteArr[this.a_byteArr[this.a_shortArr[195] + 0 + var2]]],
                  0,
                  this.c_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var2]],
                  this.a_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var2]] + 0,
                  this.b_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var2]],
                  this.a_short - 0,
                  this.b_short + this.d_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var2]] + 0,
                  0
               );
            }
         }
      } else {
         a_bool6(var1, a_obj_ImageArr[M_byte], 0, 0, 320, 240, this.a_short - 0, this.b_short - 0 + 0, 0);
         if (this.s_bool && !this.J_bool && this.aN < 0) {
            var1.setColor(0);
            b_void8(var1, this.a_short - 0, this.b_short - 0 + 0, 320, 16 + -this.aN);
            b_void8(var1, this.a_short - 0, this.b_short - 0 + 16 + 240 - -this.aN + 0, 320, -this.aN);
         }
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

         for (byte var1 = 0; var1 < 20; var1++) {
            if (this.a_boolArr[var1]) {
               this.a_void8(var1, 0, this.c_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var1]] - 0);
               this.N_byte = this.c_byteArr[1];
               if (var1 == 8 || var1 == 7) {
                  int var2 = this.b_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var1]]
                     - 55
                     + this.d_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var1]]
                     + 11;
                  this.a_void7(560, this.a_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var1]] - 68, var2);
               }

               if (this.a_byteArr[this.a_shortArr[195] + 20 + var1] == 1) {
                  this.a_void7(526, 0, this.ax_byte);
               } else if (this.a_byteArr[this.a_shortArr[195] + 20 + var1] == 2) {
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

            a_bool6(a_obj_GraphicsArr[this.c_byteArr[1]], a_obj_ImageArr[this.c_byteArr[0]], 0, 0, 350, this.A_int, this.ah_int, this.ai_int, 0);
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
            a_bool6(a_obj_GraphicsArr[this.c_byteArr[0]], a_obj_ImageArr[this.c_byteArr[1]], 0, 0, 350, this.A_int, 0, 0, 0);
         }
      } catch (Exception var2) {
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
               int var1;
               if ((var1 = this.b_byteArr2[this.ag_int + this.K_byte][this.af_int + this.I_byte] & 255) < 175) {
                  this.a_void7(var1, this.af_int * 22, this.ag_int * 16);
               } else {
                  this.a_void2(var1, (byte)0);
               }

               byte var2;
               if ((var2 = this.c_byteArr2[this.ag_int + this.K_byte][this.af_int + this.I_byte]) < 0 && var2 >= -123) {
                  this.a_void2(var2, (byte)0);
               }
            }
         }
      }
   }

   // $VF: renamed from: a (int, byte) void
   private void a_void2(int var1, byte var2) {
      int var3 = -var1;
      int var4 = 0;
      byte var5 = 0;
      byte var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = this.af_int * 22;
      int var11 = this.ag_int * 16;
      if (b_byte2(var1) != 2) {
         var4 = this.e_byteArr[8749 + var3];
         var5 = this.a_byteArr[this.a_shortArr[138] + 104 + var4];
         var7 = this.e_byteArr[9115 + var3];
         var8 = this.af_int + this.I_byte - this.e_byteArr[8383 + var3];
         var9 = this.ag_int + this.K_byte - this.e_byteArr[8444 + var3];
         var10 -= var8 * 22;
         var11 -= var9 * 16;
         this.N_int = this.b_shortArr2[0][var4 + 1];
         this.O_int = this.j_byteArr2[0][var4 + 1];
         if (var2 == 0) {
            int var13 = 0;
            int var12 = var5 * var9 + var8;

            while (true) {
               if ((this.j_byteArr2[3][this.N_int] & 255) >> 6 == 0) {
                  if (var13 == var12) {
                     break;
                  }

                  var13++;
               }

               if ((this.j_byteArr2[3][this.N_int] & 7) != 0) {
                  break;
               }

               this.N_int++;
               this.O_int--;
            }
         } else {
            for (byte var15 = this.e_byteArr[8993 + var3]; var15 > 0; var15 = this.e_byteArr[4545 + var15]) {
               this.g_byteArr[this.e_byteArr[4646 + var15]] = (byte)var15;
            }
         }
      } else if (c_bool3(var1)) {
         var3 -= 61;
         var4 = this.e_byteArr[9833 + var3];
         var7 = this.e_byteArr[9933 + var3];
         this.N_int = this.b_shortArr2[0][var4 + 27 - 1];
         this.O_int = this.j_byteArr2[0][var4 + 27 - 1];
      } else if (c_byte2(var1) != 2) {
         if (c_byte2(var1) != 3) {
            this.g_byteArr[0] = this.c_byteArr2[this.K_byte + this.ag_int][this.I_byte + this.af_int];
            if (c_byte2(this.g_byteArr[0]) != 2) {
               if (c_byte2(this.g_byteArr[0]) == 1) {
                  var2 = -1;
               }

               var4 = 20 - (this.g_byteArr[0] + 111);
               var7 = 1;
            } else if (c_byte2(this.e_byteArr[4545 + this.g_byteArr[0]]) != 2) {
               var4 = 20 - (this.e_byteArr[4545 + this.g_byteArr[0]] + 111);
               var7 = 2;
            }

            while (var4 > 22) {
               var4 -= 3;
            }
         } else {
            var4 = 23;
            var7 = 0;
         }

         this.N_int = this.b_shortArr2[0][var4 + 1];
         this.O_int = this.j_byteArr2[0][var4 + 1];
         var3 = 0;
      } else if (var1 >= 1000) {
         var10 = this.S_int;
         var11 = this.T_int;
         var4 = var1 - 1000;
         this.N_int = this.b_shortArr2[0][var4];
         this.O_int = this.j_byteArr2[0][var4];
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

         var7 = 0;
         var3 = 0;
      } else if (var1 >= 175) {
         var4 = var1 - 180 + 34;
         this.N_int = this.b_shortArr2[0][var4];
         this.O_int = this.j_byteArr2[0][var4];
         var11 += this.aO;
         var7 = 0;
         var3 = 0;
      }

      if (var2 == 0) {
         do {
            this.P_int = (this.j_byteArr2[3][this.N_int] & 255) >> 6;
            if (this.P_int <= var7) {
               this.a_void7(
                  this.b_shortArr2[1][this.N_int] & 4095,
                  (this.af_int - var8) * 22 + this.j_byteArr2[1][this.N_int],
                  (this.ag_int - var9) * 16 + this.j_byteArr2[2][this.N_int]
               );
            }

            this.N_int++;
         } while ((this.j_byteArr2[3][this.N_int] & 7) == 0 && (this.j_byteArr2[3][this.N_int] & 255) >> 6 != 0);
      } else {
         this.a_void3(var3, var7, (byte)var4, var10, var11, var2);
      }

      for (byte var16 = 0; var16 < 8; var16++) {
         this.g_byteArr[var16] = this.h_byteArr[var16] = this.i_byteArr[var16] = 0;
      }
   }

   // $VF: renamed from: a (int, byte, byte, int, int, byte) void
   private void a_void3(int var1, byte var2, byte var3, int var4, int var5, byte var6) {
      int var9 = 0;
      int var10 = this.f_int;
      byte var11 = 0;
      this.U_int = 0;

      try {
         for (int var15 = 0; var15 < this.O_int; var15++) {
            int var8 = this.j_byteArr2[3][this.N_int] & 7;
            var11 = (byte)((this.j_byteArr2[3][this.N_int] & 63) >> 3);
            this.P_int = (this.j_byteArr2[3][this.N_int] & 255) >> 6;
            this.X_byte = this.g_byteArr[var11];
            boolean var12 = false;
            int var14 = (this.b_shortArr2[1][this.N_int] & '쀀') >> 14 << 7;
            if (var8 == 0 && var6 == 2 && this.P_int == var2) {
               this.a_void7(
                  this.b_shortArr2[1][this.N_int] & 4095, var4 + this.j_byteArr2[1][this.N_int] + var14, var5 + this.j_byteArr2[2][this.N_int]
               );
            } else if (var8 == 1 && this.P_int <= var2) {
               if (var3 == 6 && this.U_int < 5) {
                  this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[142]]] = (byte)(
                     this.a_shortArr2[0][5] + this.a_shortArr2[0][8] + this.a_shortArr2[0][5] + this.a_shortArr2[0][9] + this.a_shortArr2[0][10]
                  );
                  if (this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[142] + this.U_int]] > 0 || var1 >= 31) {
                     this.V_int = this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[142] + this.U_int]] / 7 / (this.U_int == 0 ? 1 : 10);
                     if (this.V_int >= 5 || var1 >= 31) {
                        this.V_int = 4;
                     }

                     this.a_void7(
                        (this.b_shortArr2[1][this.N_int] & 4095) + this.V_int,
                        var4 + this.j_byteArr2[1][this.N_int] + var14,
                        var5 + this.j_byteArr2[2][this.N_int]
                     );
                  }

                  this.U_int++;
               } else if (var3 == 4 && this.U_int < 1) {
                  if (var1 >= 31) {
                     this.a_void7(
                        (this.b_shortArr2[1][this.N_int] & 4095) + 2,
                        var4 + this.j_byteArr2[1][this.N_int] + var14,
                        var5 + this.j_byteArr2[2][this.N_int]
                     );
                  } else if (this.a_shortArr2[0][0] >= 5) {
                     this.V_int = this.a_shortArr2[0][0] > 35 ? 2 : (this.a_shortArr2[0][0] - 5) / 15;
                     this.a_void7(
                        (this.b_shortArr2[1][this.N_int] & 4095) + this.V_int,
                        var4 + this.j_byteArr2[1][this.N_int] + var14,
                        var5 + this.j_byteArr2[2][this.N_int]
                     );
                  }

                  this.U_int++;
               } else {
                  this.a_void7(
                     this.b_shortArr2[1][this.N_int] & 4095, var4 + this.j_byteArr2[1][this.N_int] + var14, var5 + this.j_byteArr2[2][this.N_int]
                  );
               }
            } else if ((var8 == 2 || var8 == 4 || var8 == 6) && var6 != 2) {
               if (this.P_int == 0 || this.P_int <= var2) {
                  int var7 = this.N_int;
                  var9 = this.b_shortArr2[1][this.N_int] & 4095;
                  if (var8 == 6) {
                     var10 += this.K_byte + this.ag_int + this.N_int * 2;

                     while (var10 >= 120) {
                        var10 -= 120;
                     }

                     if (var11 == 1 || var11 == 2 && (this.e_byteArr[8627 + var1] == 1 || this.e_byteArr[8627 + var1] == 2)) {
                        if (var1 >= 31) {
                           var9++;
                        }

                        var12 = true;
                     } else if (var11 != 2) {
                        var12 = true;
                     }
                  } else if (this.q_byte == 3 && var1 == 31 && var11 == 0) {
                     if (var9 == 118 && var8 == 4) {
                        var12 = true;
                        var10 = 0;
                     }
                  } else if (var8 == 2 && (this.e_byteArr[1313 + this.X_byte] <= 0 || this.e_byteArr[1313 + this.X_byte] >= 50)) {
                     var12 = true;
                     if (this.e_byteArr[1313 + this.X_byte] == 51) {
                        this.i_byteArr[var11] = 1;
                     }
                  } else if (var8 == 4
                     && this.i_byteArr[var11] == 0
                     && this.e_byteArr[1313 + this.X_byte] >= 1
                     && this.e_byteArr[1313 + this.X_byte] != 50) {
                     var9 = this.b_shortArr2[1][this.N_int + this.e_byteArr[1313 + this.X_byte] - 1] & 4095;
                     var10 = this.e_byteArr[3030 + this.X_byte];
                     var12 = true;
                     this.i_byteArr[var11] = 1;
                     if (this.e_byteArr[8749 + var1] == 2 && this.e_byteArr[1313 + this.X_byte] == 2) {
                        this.d_void(90, var4 + this.j_byteArr2[1][var7] + var14, var5 + this.j_byteArr2[2][var7], this.f_int);
                     }
                  }

                  if (var12) {
                     this.d_void(var9, var4 + this.j_byteArr2[1][var7] + var14, var5 + this.j_byteArr2[2][var7], var10);
                  }
               }
            } else if ((var8 == 3 || var8 == 5 || var8 == 7) && this.h_byteArr[var11] == 0 && this.X_byte > 0 && var6 != 2) {
               byte var13 = 0;
               if (var1 < 31 || (this.e_byteArr[9176 + var1] & 3) >= 2) {
                  if (var8 == 7 && this.e_byteArr[1313 + this.X_byte] == 50) {
                     var12 = true;
                  } else if (var8 == 3 && this.e_byteArr[1313 + this.X_byte] >= 1 && this.e_byteArr[1313 + this.X_byte] != 50) {
                     switch (var13 = this.a_byteArr[this.a_shortArr[139] + this.a_byteArr[this.a_shortArr[140] + var3] + var11]) {
                        case -1:
                           var13 = this.e_byteArr[606 + this.X_byte];
                        default:
                           var12 = true;
                     }
                  } else if (var8 == 5 && this.e_byteArr[1313 + this.X_byte] <= 0) {
                     var12 = true;
                     if ((this.e_byteArr[3535 + this.X_byte] != 0 || this.e_byteArr[6565 + this.X_byte] == 1) && var3 != 10 && var3 != 11) {
                        this.x_bool = true;
                     }

                     if (this.v_byte == 0) {
                        var13 = this.e_byteArr[606 + this.X_byte];
                     }
                  }
               }

               if (var12) {
                  this.a_void4(this.X_byte, var4 + this.j_byteArr2[1][this.N_int] + var14, var5 + this.j_byteArr2[2][this.N_int], var13, (byte)29);
                  this.h_byteArr[var11] = 1;
               }
            }

            this.N_int++;
         }
      } catch (Exception var16) {
      }

      this.X_byte = 0;
   }

   // $VF: renamed from: a (int, int, int, int, byte) void
   private void a_void4(int var1, int var2, int var3, int var4, byte var5) {
      try {
         this.ao_int = var1;
         this.ap_int = var2;
         this.aq_int = var3;
         this.ar_int = var4;
         this.Y_byte = var5;
         this.at_int = this.e_byteArr[this.b_shortArr[this.Y_byte] + this.ao_int] & 255;
         int var6 = 0;
         if (this.ar_int >= 0) {
            this.ar_int = this.a_byteArr[this.a_shortArr[99] + ((this.b_shortArr2[3][this.at_int] >> 14 & 3) << 3) + this.ar_int];
            var6 = (this.b_shortArr2[2][this.at_int] & 4095)
               + this.ar_int * this.j_byteArr2[4][this.at_int]
               + this.e_byteArr[this.b_shortArr[this.Y_byte + 1] + this.ao_int];
            this.as_int = this.b_shortArr2[4][var6];
            this.ap_int = this.ap_int + this.j_byteArr2[7][var6];
            this.aq_int = this.aq_int + this.j_byteArr2[8][var6] + this.aO;
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
      } catch (Exception var7) {
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

         for (int var1 = this.C_int + 1; var1 <= this.C_int + this.E_int; var1++) {
            for (int var2 = this.B_int + 1; var2 <= this.B_int + this.D_int; var2++) {
               byte var3;
               if ((var3 = this.c_byteArr2[var1][var2]) >= 1 && var3 <= 50 && this.e_byteArr[1919 + var3] > 0) {
                  this.aA++;
                  if (var3 == this.ao_int) {
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
         this.a_obj_c
            .a_void7(
               this.Y_byte == 29 ? this.ao_int : 101 + this.ao_int,
               this.ap_int + this.j_byteArr2[12][this.am_int] + 4,
               this.aq_int + this.j_byteArr2[13][this.am_int]
            );
         if (this.Y_byte == 29 && this.ar_int > -1) {
            for (int var1 = 0; var1 < 30; var1++) {
               if (this.b_byteArr3[0][2][var1] == this.ao_int && this.b_byteArr3[0][1][var1] != 3) {
                  this.d_void(
                     65 + (1 - this.b_byteArr3[0][4][var1]) * 5 + this.b_byteArr3[0][1][var1],
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
                  int var3 = this.e_byteArr[6767 + this.ao_int] / 20;
                  byte var2 = 0;
                  if (this.e_byteArr[1616 + this.ao_int] >= 5 || this.e_byteArr[1717 + this.ao_int] >= 5 || this.e_byteArr[7575 + this.ao_int] > 5) {
                     var2 = 2;
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
                        this.ap_int + this.j_byteArr2[12][this.am_int] + 2 - var3 + 2 - 10,
                        this.aq_int + this.j_byteArr2[13][this.am_int]
                     );
                  }

                  this.a_void7(611 + var3, this.ap_int + this.j_byteArr2[12][this.am_int] + var2, this.aq_int + this.j_byteArr2[13][this.am_int]);
                  a_obj_GraphicsArr[this.N_byte].setColor(this.e_intArr[(this.e_byteArr[1919 + this.ao_int] - 1) * 3 / this.e_byteArr[6767 + this.ao_int]]);
                  b_void8(
                     a_obj_GraphicsArr[this.N_byte],
                     this.ap_int + this.j_byteArr2[12][this.am_int] + 2 - var3 + var2,
                     this.aq_int + this.j_byteArr2[13][this.am_int] - 4,
                     this.a_byteArr[this.a_shortArr[128] + var3] * this.e_byteArr[1919 + this.ao_int] / this.e_byteArr[6767 + this.ao_int],
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
   final void a_void5(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < 10; var5++) {
         if (this.d_byteArr2[0][var5] == 0) {
            this.d_byteArr2[1][var5] = 0;
            this.d_byteArr2[0][var5] = (byte)var4;
            this.d_byteArr2[2][var5] = (byte)var3;
            this.d_byteArr2[6][var5] = (byte)var2;
            this.d_byteArr2[5][var5] = (byte)var1;
            return;
         }
      }
   }

   // $VF: renamed from: r () void
   private void r() {
      boolean var1 = false;
      int var2 = 0;
      int var3 = 0;
      byte var4 = 0;
      int var5 = 0;
      short var6 = 0;
      int var7 = 0;
      short var8 = 0;
      this.ao_int = -1;

      try {
         for (int var12 = 0; var12 < 10; var12++) {
            if (this.d_byteArr2[0][var12] > 0) {
               byte var9 = 29;
               this.ao_int = this.d_byteArr2[5][var12];
               if (this.d_byteArr2[6][var12] == 1) {
                  var2 = this.e_byteArr[0 + this.ao_int];
                  var3 = this.e_byteArr[101 + this.ao_int];
               } else if (this.d_byteArr2[6][var12] == 2) {
                  var2 = this.e_byteArr[9359 + this.ao_int];
                  var3 = this.e_byteArr[9381 + this.ao_int];
                  var9 = 108;
                  this.d_byteArr2[2][var12] = 0;
               } else {
                  var2 = this.e_byteArr[8383 + this.ao_int] + (this.d_byteArr2[2][var12] & 15);
                  var3 = this.e_byteArr[8444 + this.ao_int] + (this.d_byteArr2[2][var12] >> 4 & 15);
               }

               if (!this.a_bool3(var2, var3)
                  || this.a_byte6(var2, var3) != 0
                  || this.e_byteArr[1919 + this.ao_int] <= 0 && this.d_byteArr2[6][var12] == 1) {
                  this.d_byteArr2[0][var12] = 0;
                  return;
               }

               var2 = (var2 - this.I_byte) * 22;
               var3 = (var3 - this.K_byte) * 16;
               if (this.d_byteArr2[6][var12] == 1 || this.d_byteArr2[6][var12] == 2) {
                  var4 = this.e_byteArr[606 + this.ao_int];
                  var4 = this.a_byteArr[this.a_shortArr[99]
                     + (this.b_shortArr2[3][this.e_byteArr[this.b_shortArr[var9] + this.ao_int] & 255] >> 14 & 3) * 8
                     + var4];
                  var5 = (this.b_shortArr2[2][this.e_byteArr[this.b_shortArr[var9] + this.ao_int] & 255] & 4095)
                     + var4 * this.j_byteArr2[4][this.e_byteArr[this.b_shortArr[var9] + this.ao_int] & 255]
                     + this.e_byteArr[this.b_shortArr[var9 + 1] + this.ao_int];
                  var6 = this.b_shortArr2[4][var5];
                  var7 = 0;
                  var8 = this.b_shortArr2[8][this.b_shortArr2[4][var5]];

                  for (short var10 = 0; var10 < this.j_byteArr2[15][var6]; var10++) {
                     var7 = var8 + var10;
                     if ((this.j_byteArr2[14][var7] & 15) == this.d_byteArr2[2][var12]) {
                        break;
                     }
                  }

                  if (this.d_byteArr2[6][var12] == 1) {
                     var2 += this.e_byteArr[202 + this.ao_int] + this.j_byteArr2[12][var7];
                     var3 += this.e_byteArr[303 + this.ao_int] + this.j_byteArr2[13][var7];
                  } else if (this.d_byteArr2[6][var12] == 2) {
                     var2 += this.e_byteArr[9403 + this.ao_int] + this.j_byteArr2[12][var7];
                     var3 += this.e_byteArr[9425 + this.ao_int] + this.j_byteArr2[13][var7];
                  }
               }

               this.d_void(this.d_byteArr2[0][var12], var2, var3, this.d_byteArr2[1][var12]);
               this.d_byteArr2[1][var12]++;
               if (this.d_byteArr2[1][var12] >= this.j_byteArr2[9][this.d_byteArr2[0][var12]]) {
                  this.d_byteArr2[0][var12] = 0;
               }
            }
         }
      } catch (Exception var11) {
      }
   }

   // $VF: renamed from: a (int, int) void
   final void a_void6(int var1, int var2) {
      for (int var3 = 0; var3 < 30; var3++) {
         if (this.e_byteArr2[0][var3] == 0) {
            this.e_byteArr2[1][var3] = 0;
            this.e_byteArr2[2][var3] = (byte)var2;
            this.e_byteArr2[0][var3] = (byte)var1;
            return;
         }
      }
   }

   // $VF: renamed from: s () void
   private void s() {
      for (int var6 = 0; var6 < 30; var6++) {
         if (this.e_byteArr2[0][var6] != 0) {
            byte var1 = this.e_byteArr2[0][var6];
            byte var2 = this.e_byteArr[8383 + var1];
            int var3 = this.e_byteArr[8444 + var1] - 1;
            byte var4 = this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + var1]];
            byte var5 = this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + var1]];
            if (this.e_byteArr2[1][var6] >= 20) {
               this.e_byteArr2[0][var6] = 0;
               if (this.e_byteArr2[2][var6] == 3) {
                  this.c_void6(var1, false);
                  this.e_byteArr[8627 + var1] = 3;
               }

               this.c_void7(var2, var3 + 1, var4, var5);
               this.d_void5(var1);
            } else {
               for (byte var7 = 0; var7 < var5 + 1; var7 += 2) {
                  for (byte var8 = 0; var8 < var4; var8 += 2) {
                     if (this.a_bool3(var2 + var8, var3 + var7)) {
                        this.d_void(
                           74, (var2 + var8 - this.I_byte) * 22, (var3 + var7 - this.K_byte) * 16, (var8 * 2 + var7) * 2 + this.e_byteArr2[1][var6] - 1
                        );
                     }
                  }
               }
            }

            this.e_byteArr2[1][var6]++;
         }
      }
   }

   // $VF: renamed from: a (int, int) boolean
   private boolean a_bool3(int var1, int var2) {
      return var1 >= this.I_byte && var1 < this.I_byte + this.O_byte && var2 >= this.K_byte && var2 < this.K_byte + this.P_byte;
   }

   // $VF: renamed from: t () void
   private void t() {
      for (byte var1 = 0; var1 < 10; var1++) {
         this.d_byteArr2[0][var1] = 0;
      }
   }

   // $VF: renamed from: d (int, int, int, int) void
   private void d_void(int var1, int var2, int var3, int var4) {
      int var5 = this.b_shortArr2[5][var1] + var4 % this.j_byteArr2[9][var1];
      this.a_void7(this.b_shortArr2[6][var5], var2 + this.j_byteArr2[10][var5], var3 + this.j_byteArr2[11][var5]);
   }

   // $VF: renamed from: a (int, int, int) void
   final void a_void7(int var1, int var2, int var3) {
      int var4 = this.b_shortArr2[9][var1] & 8191;
      int var5;
      if ((var5 = (this.b_shortArr2[9][var1] & '\uffff') >> 14 & 3) != 0) {
         this.b_void2((var5 - 1) * 3 + 1, var2, var3);
      }

      for (int var8 = var4; var8 < var4 + (this.j_byteArr2[16][var1] & 63); var8++) {
         int var6 = this.b_shortArr2[10][var8] & 8191;
         int var7 = (this.b_shortArr2[10][var8] & '쀀') >> 14 << 7;
         if ((this.b_shortArr2[10][var8] & 8192) >> 13 == 0) {
            this.b_void2(var6, var2 + this.j_byteArr2[18][var8] + var7, var3 + this.j_byteArr2[19][var8]);
         } else {
            this.a_void7(var6, var2 + this.j_byteArr2[18][var8] + var7, var3 + this.j_byteArr2[19][var8]);
         }
      }
   }

   // $VF: renamed from: b (int, int, int) void
   private void b_void2(int var1, int var2, int var3) {
      if (var1 != 0) {
         int var4;
         if ((var4 = this.j_byteArr2[20][var1] & 31) < 27) {
            boolean var5 = false;
            if (this.al_int > -1) {
               if (this.al_int == 0) {
                  if (var4 == 5) {
                     var4 = this.al_int;
                     var5 = true;
                  }
               } else if (this.al_int == 4) {
                  if (var4 == 14) {
                     var4 = 4;
                     var5 = true;
                  } else if (var4 == 15) {
                     var4 = 5;
                     var5 = true;
                  }
               } else if (var4 == 9) {
                  var4 = this.al_int;
                  var5 = true;
               }
            }

            if (!var5) {
               a_bool6(
                  a_obj_GraphicsArr[this.N_byte],
                  this.a_obj_ImageArr2[0][var4],
                  this.j_byteArr2[21][var1] & 127,
                  this.j_byteArr2[22][var1],
                  this.j_byteArr2[23][var1],
                  this.j_byteArr2[24][var1],
                  var2,
                  var3,
                  20
               );
               return;
            }

            if (a_bool6(
               a_obj_GraphicsArr[this.N_byte],
               this.a_obj_ImageArr2[1][var4],
               this.j_byteArr2[21][var1] & 127,
               this.j_byteArr2[22][var1],
               this.j_byteArr2[23][var1],
               this.j_byteArr2[24][var1],
               var2,
               var3,
               20
            )) {
               return;
            }
         } else {
            int var6 = (this.j_byteArr2[20][var1] & 255) >> 5 | (this.j_byteArr2[21][var1] & 128) >> 4;
            a_obj_GraphicsArr[this.N_byte]
               .setColor(this.j_byteArr2[17][var6 * 3 + 0] & 255, this.j_byteArr2[17][var6 * 3 + 1] & 255, this.j_byteArr2[17][var6 * 3 + 2] & 255);
            if (var4 == 27) {
               d_void6(
                  a_obj_GraphicsArr[this.N_byte],
                  var2 + (this.j_byteArr2[21][var1] & 127),
                  var3 + this.j_byteArr2[22][var1],
                  var2 + this.j_byteArr2[23][var1],
                  var3 + this.j_byteArr2[24][var1]
               );
               return;
            }

            if (var4 == 28) {
               a_void20(
                  a_obj_GraphicsArr[this.N_byte],
                  var2 + (this.j_byteArr2[21][var1] & 127),
                  var3 + this.j_byteArr2[22][var1],
                  this.j_byteArr2[23][var1],
                  this.j_byteArr2[24][var1]
               );
               return;
            }

            if (var4 == 29) {
               b_void8(
                  a_obj_GraphicsArr[this.N_byte],
                  var2 + (this.j_byteArr2[21][var1] & 127) - 0,
                  var3 + this.j_byteArr2[22][var1] - 0,
                  this.j_byteArr2[23][var1],
                  this.j_byteArr2[24][var1]
               );
               return;
            }

            if (var4 == 30) {
               b_void8(
                  a_obj_GraphicsArr[this.N_byte],
                  var2 + (this.j_byteArr2[21][var1] & 127) * 4 - 0,
                  var3 + this.j_byteArr2[22][var1] * 4 - 0,
                  this.j_byteArr2[23][var1] * 4,
                  this.j_byteArr2[24][var1] * 4
               );
            }
         }
      }
   }

   // $VF: renamed from: i (int) void
   private void i_void2(int var1) {
      byte var4 = 0;
      byte var5 = 0;
      int var6 = 0;
      int var7 = 0;
      boolean var8 = true;

      try {
         do {
            if (!var8) {
               var1 = this.e_byteArr[6060 + var1];
            }

            var8 = false;
            var4 = this.e_byteArr[7676 + var1];
            var6 = 0 + (this.e_byteArr[5252 + var1] - this.I_byte) * 22 + 11 + this.e_byteArr[5454 + var1];
            var7 = 0
               + (this.e_byteArr[5353 + var1] - this.K_byte) * 16
               + 8
               + this.e_byteArr[5555 + var1]
               - this.h_byteArr2[this.e_byteArr[5858 + var1]][var1]
               - 10;
            if ((var5 = this.e_byteArr[6565 + var1]) == 1 || var5 == 2 || var5 == 5) {
               this.a_void7(
                  292
                     + this.a_byteArr[this.a_shortArr[190 + this.a_byteArr[this.a_shortArr[77] + var5]]
                        + var4 * this.a_byteArr[this.a_shortArr[193] + 6 + var5]
                        + this.i_byteArr2[this.e_byteArr[5858 + var1]][var1]]
                     + this.a_byteArr[this.a_shortArr[193] + var5],
                  var6,
                  var7
               );
            }
         } while (this.e_byteArr[6060 + var1] != 0);
      } catch (Exception var10) {
      }
   }

   // $VF: renamed from: u () void
   private void u() {
      int var1 = 0;
      byte var2 = 0;
      byte var4 = 0;
      int var5 = 0;

      try {
         this.v();

         for (this.ag_int = 0; this.ag_int < this.P_byte + 3; this.ag_int++) {
            int var7;
            if ((var7 = this.ag_int + this.K_byte) < this.d_short) {
               for (this.af_int = this.O_byte - 1 + 0; this.af_int >= 0; this.af_int--) {
                  int var8 = this.af_int + this.I_byte;
                  if (!this.s_bool || var7 >= 0 && var7 < this.d_short && var8 >= 0 && var8 < this.c_short) {
                     var1 = this.af_int * 22;
                     byte var3 = this.a_byte6(var8, var7);
                     if (this.s_bool && !this.J_bool) {
                        var3 = 0;
                     }

                     var4 = this.c_byteArr2[var7][var8];
                     var5 = this.b_byteArr2[var7][var8] & 255;
                     if (var4 != 0) {
                        if (var3 >= 2 || (var5 < 180 || var5 > 231) && var5 != 243) {
                           if (var3 < 1 && var4 >= 1 && var4 <= 100 && (!this.s_bool || this.ao_byte != 9)) {
                              if (c_byte2(this.e_byteArr[4545 + var4]) != 2) {
                                 this.a_void2(this.e_byteArr[4545 + var4], (byte)1);
                              }

                              if (c_byte2(this.e_byteArr[4545 + var4]) == 2 || this.e_byteArr[2929 + var4] <= 14) {
                                 if (this.ag_int >= 0
                                    && this.af_int - 1 >= 0
                                    && this.e_byteArr[9833 + (this.c_byteArr2[var7][var8 - 1] + 61) * -1] == 5
                                    && c_bool3(this.c_byteArr2[var7][var8 - 1])) {
                                    if (this.af_int < this.O_byte) {
                                       this.g_byteArr2[this.ag_int][this.af_int] = 0;
                                    }

                                    this.af_int--;
                                    var8 = this.af_int + this.I_byte;
                                    this.a_void2(this.c_byteArr2[var7][var8], (byte)1);
                                 }

                                 if (a_byte2(var4) == 0 || (this.e_byteArr[7979 + var4] & 2) == 0) {
                                    this.a_void4(
                                       var4, var1 + this.e_byteArr[202 + var4], var2 + this.e_byteArr[303 + var4], this.e_byteArr[606 + var4], (byte)29
                                    );
                                 }
                              }
                           } else if (var4 <= -1 && var4 >= -60 && (var3 < 2 || this.e_byteArr[9176 + -var4] > 0)) {
                              if ((this.e_byteArr[9176 + -var4] & 4) != 0) {
                                 switch (var3) {
                                    case 0:
                                       this.e_byteArr[9176 + -var4] = 6;
                                       break;
                                    case 1:
                                       this.e_byteArr[9176 + -var4] = 5;
                                 }
                              }

                              switch (this.e_byteArr[9176 + -var4] & 3) {
                                 case 1:
                                    var3 = 1;
                                    break;
                                 case 2:
                                    var3 = 0;
                              }

                              if ((this.e_byteArr[8871 + -var4] & 1) == 0) {
                                 this.a_void2(var4, (byte)1);
                                 this.e_byteArr[8871 + -var4] = (byte)(this.e_byteArr[8871 + -var4] | 1);
                                 byte var9 = this.e_byteArr[8749 + -var4];
                                 byte var10 = this.a_byteArr[this.a_shortArr[138] + 104 + var9];
                                 byte var11 = this.a_byteArr[this.a_shortArr[138] + 130 + var9];
                                 if ((this.e_byteArr[9176 + -var4] & 4) == 0) {
                                    this.a_obj_b.S_byte = 0;
                                    this.a_obj_b.a_void18(this.e_byteArr[8383 + -var4], this.e_byteArr[8444 + -var4], var10, var11);
                                    this.a_obj_b.S_byte = 1;
                                    this.e_byteArr[9176 + -var4] = 4;
                                 }

                                 if (!this.s_bool && var9 < 22) {
                                    if ((
                                          this.a_byteArr[this.a_shortArr[138] + 156 + var9] != -1
                                             || this.e_byteArr[8627 + -var4] == 1
                                             || this.e_byteArr[8627 + -var4] == 2
                                       )
                                       && this.e_byteArr[8810 + -var4] == 0
                                       && b_byte2(var4) == 0) {
                                       this.d_void(
                                          40,
                                          (this.e_byteArr[8383 + -var4] - this.I_byte) * 22 + var10 * 11 - 11,
                                          (this.e_byteArr[8444 + -var4] - this.K_byte) * 16 + var11 * 8 - 8,
                                          this.e_int
                                       );
                                    }

                                    if ((
                                          this.e_byteArr[8505 + -var4] > 0
                                                && (
                                                   var4 == this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte]
                                                      || this.e_byteArr[8566 + -var4] / 2 > this.e_byteArr[8505 + -var4]
                                                )
                                             || this.e_byteArr[8627 + -var4] == 1
                                             || this.e_byteArr[8627 + -var4] == 2
                                             || var9 >= 12
                                       )
                                       && b_byte2(var4) == 0) {
                                       int var12 = this.e_byteArr[8566 + -var4] / 80 + 6;
                                       int var13 = (this.e_byteArr[8383 + -var4] - this.I_byte) * 22 + var10 * 11 - 11;
                                       int var14 = var2 - this.a_byteArr[this.a_shortArr[138] + 520 + var9] * 8 - 5;
                                       this.a_void7(611 + var12, var13, var14);
                                       a_obj_GraphicsArr[this.N_byte]
                                          .setColor(this.e_intArr[(this.e_byteArr[8505 + -var4] - 1) * 3 / this.e_byteArr[8566 + -var4]]);
                                       b_void8(
                                          a_obj_GraphicsArr[this.N_byte],
                                          var13 + 1,
                                          var14 + 1,
                                          this.a_byteArr[this.a_shortArr[128] + var12] * this.e_byteArr[8505 + -var4] / this.e_byteArr[8566 + -var4],
                                          2
                                       );
                                       if (var4 == this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte]) {
                                          byte var15;
                                          int var16 = (var15 = this.a_obj_b.a_byte5(-var4)) >> 4 & 15;
                                          int var17 = var15 & 15;
                                          int var18;
                                          if ((var18 = var16 + var17) > 0) {
                                             var13 = var13 + 1 + this.a_byteArr[this.a_shortArr[128] + var12] / 2 - 4 * var18 / 2 + 1;
                                             var14 += 6;
                                             a_obj_GraphicsArr[this.N_byte].setColor(0);
                                             b_void8(a_obj_GraphicsArr[this.N_byte], var13 - 0, var14 - 1, var18 * 4 - 1, 4);
                                             b_void8(a_obj_GraphicsArr[this.N_byte], var13 - 1, var14 - 0, var18 * 4 + 1, 2);

                                             for (byte var22 = 0; var22 < var18; var22++) {
                                                a_obj_GraphicsArr[this.N_byte].setColor(var22 < var17 ? 16164864 : 4207389);
                                                b_void8(a_obj_GraphicsArr[this.N_byte], var13 + var22 * 4, var14, 3, 2);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           } else if (var3 < 1 && b_bool3(var4)) {
                              int var6 = var4 - 101;
                              this.a_void4(
                                 var6, var1 + this.e_byteArr[9403 + var6], var2 + this.e_byteArr[9425 + var6], this.e_byteArr[9491 + var6], (byte)108
                              );
                           } else if (var3 >= 2 || !c_bool3(var4) && c_byte2(var4) != 3) {
                              if (var3 == 0 && var4 <= -114 && var4 > -117) {
                                 if (this.h_int >= 94 + var7 && this.h_int <= 100 + var7) {
                                    this.d_void(75, var1, var2, this.h_int - (100 + var7) + 6);
                                 } else if ((this.h_int + this.af_int + this.ag_int) % 10 < 5) {
                                    this.a_void7(this.b_byteArr2[var7][var8] & 255, var1, var2);
                                 }
                              }
                           } else {
                              this.a_void2(var4, (byte)1);
                           }
                        } else {
                           this.a_void2(var5, (byte)1);
                        }
                     }

                     if (this.g_byteArr2[this.ag_int][this.af_int] > 0) {
                        this.i_void2(this.g_byteArr2[this.ag_int][this.af_int]);
                        this.g_byteArr2[this.ag_int][this.af_int] = 0;
                     }

                     if (var3 == 1) {
                        this.b_void2(12, var1 - 2, var2 - 4);
                     } else if (var3 == 2) {
                        a_obj_GraphicsArr[this.c_byteArr[1]].setColor(0);
                        if (var8 != 0
                           && var8 != this.c_short - 1
                           && var7 != 0
                           && var7 != this.d_short - 1
                           && this.a_byte6(var8 - 1, var7) == 2
                           && this.a_byte6(var8 + 1, var7) == 2
                           && this.a_byte6(var8, var7 - 1) == 2
                           && this.a_byte6(var8, var7 + 1) == 2) {
                           b_void8(a_obj_GraphicsArr[this.c_byteArr[1]], var1, var2, 22, 16);
                        } else {
                           this.b_void2(11, var1 - 3, var2 - 2);
                        }
                     }

                     if (this.ag_int == this.A_byte && this.af_int == this.y_byte) {
                        this.Z_byte = var3;
                     }
                  }
               }

               if ((this.L_bool || this.N_bool) && this.q_byteArr[1] - this.K_byte == this.ag_int) {
                  this.d_void(107, (this.q_byteArr[0] - this.I_byte) * 22, var2, this.f_int);
               }

               var2 += 16;
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
      } catch (Exception var23) {
      }
   }

   // $VF: renamed from: v () void
   private void v() {
      for (int var1 = 1; var1 <= 60; var1++) {
         this.e_byteArr[8871 + var1] = (byte)(this.e_byteArr[8871 + var1] & 254);
         if (this.e_byteArr[9176 + var1] > 0) {
            this.e_byteArr[9176 + var1] = 5;
         }
      }

      byte var5 = 0;

      for (int var2 = 0; var2 < 5; var2++) {
         if (this.c_byteArr3[var5][var2][2] >= 0
            && this.c_byteArr3[var5][var2][3] == 1
            && this.c_byteArr3[var5][var2][0] >= this.I_byte - 1
            && this.c_byteArr3[var5][var2][0] <= this.I_byte + this.O_byte + 1
            && this.c_byteArr3[var5][var2][1] >= this.K_byte - 1
            && this.c_byteArr3[var5][var2][1] <= this.K_byte + this.P_byte + 1) {
            for (int var3 = 0; var3 < 9; var3++) {
               if (this.a_byte6(
                     this.c_byteArr3[var5][var2][0] + this.a_byteArr[this.a_shortArr[141] + 0 + var3],
                     this.c_byteArr3[var5][var2][1] + this.a_byteArr[this.a_shortArr[141] + 9 + var3]
                  )
                  == 0) {
                  this.d_void(
                     68,
                     (this.c_byteArr3[var5][var2][0] - this.I_byte + this.a_byteArr[this.a_shortArr[141] + 0 + var3]) * 22,
                     (this.c_byteArr3[var5][var2][1] - this.K_byte + this.a_byteArr[this.a_shortArr[141] + 9 + var3]) * 16,
                     this.f_int
                  );
               }
            }
         }

         if (var2 == 4 && var5 == 0) {
            var2 = 0;
            var5 = 1;
         }
      }

      for (int var6 = 0; var6 < 30; var6++) {
         byte var7 = this.b_byteArr3[0][2][var6];
         byte var4 = this.b_byteArr3[0][3][var6];
         if (this.b_byteArr3[0][1][var6] == 3
            && this.b_byteArr3[0][0][var6] != 0
            && var7 >= this.I_byte - 1
            && var7 <= this.I_byte + this.O_byte + 1
            && var4 >= this.K_byte - 1
            && var4 <= this.K_byte + this.P_byte + 1
            && this.a_byte6(var7, var4) == 0) {
            this.d_void(68 + (1 - this.b_byteArr3[0][4][var6]) * 5, (var7 - this.I_byte - 0) * 22, (var4 - this.K_byte - 0) * 16, this.f_int);
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
         int var1 = this.I_byte + this.y_byte - this.G_int;
         int var2 = this.K_byte + this.A_byte - this.H_int;
         if (var1 < 0) {
            var1 *= -1;
         }

         this.D_int = var1 + 1;
         if (var2 < 0) {
            var2 *= -1;
         }

         this.E_int = var2 + 1;
         var1 = (var1 + 1) * 22;
         var2 = (var2 + 1) * 16;
         a_obj_GraphicsArr[this.c_byteArr[1]].setColor(0);
         a_void20(a_obj_GraphicsArr[this.c_byteArr[1]], 0 + this.Q_int + 1, 0 + this.R_int + 1, var1, var2);
         a_obj_GraphicsArr[this.c_byteArr[1]].setColor(1105252);
         a_void20(a_obj_GraphicsArr[this.c_byteArr[1]], 0 + this.Q_int, 0 + this.R_int, var1, var2);
      }

      byte var8;
      if (b_byte2(var8 = this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte]) == 0) {
         int var10 = (this.e_byteArr[8383 + -var8] - this.I_byte) * 22;
         int var3 = (this.e_byteArr[8444 + -var8] - this.K_byte) * 16;
         int var4 = this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + -var8]] * 22;
         int var5 = this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + -var8]] * 16;
         this.d_void(6, var10, var3, this.e_int);
         this.d_void(7, var10 + var4, var3, this.e_int);
         this.d_void(8, var10, var3 + var5, this.e_int);
         this.d_void(9, var10 + var4, var3 + var5, this.e_int);
      }
   }

   // $VF: renamed from: c (int, int) void
   private void c_void(int var1, int var2) {
      if (this.aa_byte != 0) {
         this.d_void(34 + this.aa_byte, (this.ab_byte - this.I_byte) * 22, (this.ac_byte - this.K_byte) * 16, this.e_int);
         if (this.e_int == 5) {
            this.aa_byte = 0;
         }
      }

      byte var4 = this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte];
      if (this.w_byte != 2) {
         byte var5 = -1;
         int var3 = 32;
         if (this.w_byte == 1) {
            if (this.k_byte != 0) {
               var5 = 1;
            } else if (this.F_byte != -1) {
               var5 = 0;

               for (int var9 = 0; var9 < 50; var9++) {
                  if (this.a_byteArr2[this.F_byte][var9] != 0) {
                     var5++;
                  }
               }
            }

            var3 = this.Z_byte != 0 || b_byte2(var4) != 1 && !b_bool3(var4) && (a_byte2(var4) != 1 || (this.e_byteArr[7979 + var4] & 2) != 0)
               ? 33
               : 34;
         } else if (this.w_byte == 3) {
            int var10000;
            if (this.s_int == 100) {
               this.r_bool = true;
               var10000 = 107;
            } else if (this.s_int >= 0 && this.s_int > 3) {
               byte var6 = this.a_byteArr[this.a_shortArr[138] + 104 + this.s_int];
               byte var7 = this.a_byteArr[this.a_shortArr[138] + 130 + this.s_int];
               this.t_int = this.y_byte - var6 / 2;
               this.u_int = this.A_byte - var7 / 2;
               this.S_int = var1 - var6 / 2 * 22;
               this.T_int = var2 - var7 / 2 * 16 - 5 + this.e_int;
               this.a_void2(1000 + this.s_int + 1, (byte)2);
               this.r_bool = this.a_bool5(this.s_int, this.I_byte + this.t_int, this.K_byte + this.u_int, true);
               var10000 = this.r_bool ? 41 : 40;
            } else if ((a_byte2(var4) != 0 || this.e_byteArr[1414 + var4] < 12)
               && (a_byte2(this.W_byte) != 0 || this.e_byteArr[1414 + this.W_byte] < 12)) {
               if (this.s_int == 3) {
                  this.r_bool = true;
                  var10000 = 33;
               } else {
                  this.r_bool = false;
                  var10000 = 32;
               }
            } else {
               this.r_int = this.W_byte;
               this.t_int = this.e_byteArr[0 + this.r_int];
               this.u_int = this.e_byteArr[101 + this.r_int];
               this.r_bool = true;
               var10000 = 33;
            }

            var3 = var10000;
         }

         if (this.E_bool && this.e_int < 2 && var3 <= 34) {
            var3 = (byte)(var3 + 5);
         }

         this.d_void(var3, var1, var2, this.e_int);
         if (var5 > 0) {
            this.a_obj_c.a_void3(var1 + 22, var2 + 8, 0, "" + var5, 1);
            this.a_obj_c.a_void6(a_obj_GraphicsArr[this.N_byte]);
         }

         if (this.aA > 0) {
            this.a_obj_c.a_void3(var1 + 22, var2 + 8, 0, "" + this.aA, 1);
            this.a_obj_c.a_void6(a_obj_GraphicsArr[this.N_byte]);
         }

         if (this.w_byte == 3) {
            if (this.s_int < 0) {
               this.a_void7(664 - this.s_int - 1, var1 + 11 + 5, var2 + 8 + 5);
            } else if (this.s_int <= 3) {
               this.d_void(this.s_int + 48, var1, var2, this.e_int);
            }
         }
      }

      int var8 = 0;
      if (this.w_byte == 1) {
         if (this.q_bool && this.aa_byte != 0) {
            var8 = 47;
            this.Z_byte = 0;
         } else if (var4 == -124) {
            var8 = 44;
         } else if (var4 == -125) {
            var8 = 45;
         } else if (b_byte2(var4) == 0 && this.e_byteArr[8749 + -var4] != 10) {
            var8 = 41;
         } else if (c_bool3(var4)) {
            var8 = this.e_byteArr[9833 + (var4 + 61) * -1] == 7 ? 46 : 43;
         } else if (b_bool3(var4) && this.Z_byte == 0) {
            var8 = 43;
         }

         if (var8 != 0 && this.Z_byte != 2) {
            this.d_void(var8, var1, var2, this.e_int);
         }
      }
   }

   // $VF: renamed from: a (byte, int, int) void
   private void a_void8(byte var1, int var2, int var3) {
      this.aB = var1;

      try {
         boolean var4 = this.c_bool2();
         if (this.b_boolArr[var1]) {
            this.b_boolArr[17] = true;
            this.ae_byte = 0;
         } else if (var4) {
            this.ae_byte = 1;
         } else {
            if (this.a_byteArr[this.a_shortArr[195] + 80 + var1] != 1) {
               return;
            }

            this.ae_byte = 2;
         }

         this.N_byte = this.c_byteArr[this.a_byteArr[this.a_shortArr[195] + 0 + var1]];
         this.aC = this.a_byteArr[this.a_shortArr[195] + 60 + var1];
         byte var5 = this.a_byteArr[this.a_shortArr[195] + 40 + var1];
         boolean var6 = false;

         for (int var7 = this.b_shortArr2[0][var5]; var7 < this.b_shortArr2[0][var5] + this.j_byteArr2[0][var5]; var7++) {
            int var8 = (this.j_byteArr2[3][var7] & 255) >> 6;
            int var9 = this.j_byteArr2[3][var7] & 7;
            this.aG = this.b_shortArr2[1][var7] & 4095;
            if (var8 >= this.ae_byte || var6) {
               this.aD = 0;
               if (var6) {
                  var6 = false;
                  if (this.k_byteArr[this.aC] == 0 && this.ae_byte > 0 || this.k_byteArr[this.aC] < 0) {
                     this.aC++;
                     continue;
                  }

                  this.aD = this.d_shortArr[this.aC];
                  this.k_byteArr[this.aC] = 0;
                  this.aC++;
               } else if (var8 == 1) {
                  var6 = true;
                  if (this.k_byteArr[this.aC] == 0 && this.ae_byte > 0
                     || this.aG == 0
                     || var8 < this.ae_byte
                     || this.k_byteArr[this.aC] < 0) {
                     continue;
                  }
               } else if (var8 == 2 && this.k_byteArr[this.aC] < 0) {
                  continue;
               }

               int var10 = (this.b_shortArr2[1][var7] >> 14 & 3) << 7;
               int var11 = (this.b_shortArr2[1][var7] >> 12 & 3) << 7;
               this.aH = this.j_byteArr2[1][var7];
               this.aI = this.j_byteArr2[2][var7];
               if (var1 >= 13 && var1 <= 16) {
                  this.aH += 110;
                  this.aI += 70;
               } else {
                  this.aH += var2;
                  this.aI += var3;
               }

               this.aH += var10;
               this.aI += var11;
               if (var7 == 1013) {
                  this.aG = this.b_shortArr2[1][1009] & 4095;
                  this.aD = this.d_shortArr[3];
                  this.d_void2(var9, 1009);
                  this.aG = 0;
               }

               if (var7 == 1012) {
                  this.a_void9(var7, this.ae_byte, this.aI);
               } else if (var7 == 1143) {
                  this.c_void2(var7, this.aH, this.aI);
               } else if (var9 == 0 && (this.j_byteArr2[3][var7] & 255) >> 6 == 3) {
                  a_obj_GraphicsArr[this.N_byte].setColor(0);
                  byte var12 = 99;
                  if (var7 == 1034) {
                     var12 = this.e_byteArr[6767 + this.l_byte];
                  }

                  if (this.aD >= 0) {
                     int var13 = this.j_byteArr2[23][this.aG] * this.aD / var12;
                     b_void8(a_obj_GraphicsArr[this.N_byte], this.aH + var13 + 1, this.aI, this.j_byteArr2[23][this.aG] - var13, 4);
                  }
               } else if (var9 == 3 && this.aG >= 3 && this.aG <= 4) {
                  if (this.v_int != -1) {
                     if (this.b_boolArr[var1] || this.v_int != this.w_int) {
                        this.a_obj_c
                           .b_void3(
                              this.aE,
                              this.aF,
                              this.j_byteArr2[23][this.b_shortArr2[1][var7 - 1] & 4095] * 4,
                              this.j_byteArr2[24][this.b_shortArr2[1][var7 - 1] & 4095] * 4,
                              this.v_int,
                              (this.j_byteArr2[3][var7] & 255) >> 6,
                              this.aG - 3
                           );
                     }

                     if (this.w_int != this.v_int) {
                        this.w_int = this.v_int;
                        this.y_int = 0;
                     }

                     this.z_int = this.y_int;
                     this.a_obj_c.a_void8(a_obj_GraphicsArr[this.N_byte], this.y_int);
                  }
               } else if (this.aG != 0) {
                  this.d_void2(var9, var7);
               }
            } else if (var8 == 1) {
               var6 = true;
            }
         }

         this.a_obj_c.a_void6(a_obj_GraphicsArr[this.N_byte]);
         this.b_boolArr[var1] = false;
      } catch (Exception var14) {
      }
   }

   // $VF: renamed from: d (int, int) void
   private void d_void2(int var1, int var2) {
      if (var1 == 0) {
         this.b_void2(this.aG, this.aH, this.aI);
         this.aE = this.aH;
         this.aF = this.aI;
      } else if (var1 == 1) {
         this.j_void2(var2);
      } else if (var1 == 2) {
         if ((!this.Q_bool || this.aG != 4 && this.aG != 94)
            && (!this.R_bool || this.aG != 5 && this.aG != 95)
            && (this.T_bool || this.aG != 1)
            && (this.U_bool || this.aG != 2)) {
            if (var2 - 1 == 1209) {
               a_obj_GraphicsArr[M_byte].setColor(1105252);
               a_void20(
                  a_obj_GraphicsArr[M_byte],
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
      } else if (var1 == 3 && this.aG == 11) {
         a_bool6(
            a_obj_GraphicsArr[M_byte],
            a_obj_ImageArr[this.c_byteArr[1]],
            0,
            0,
            this.j_byteArr2[23][this.b_shortArr2[1][1188] & 4095] * 4,
            this.j_byteArr2[24][this.b_shortArr2[1][1188] & 4095] * 4,
            0 + this.aH,
            0 + this.aI,
            0
         );
      } else if (var1 == 3 && this.aG == 10) {
         try {
            this.c_void3(this.o_byte);
            a_obj_GraphicsArr[M_byte].drawImage(this.a_obj_ImageArr2[2][0], (0 + this.aH) * 1, (0 + this.aI) * 1, 3);
         } catch (Exception var4) {
         }
      } else if (var1 == 3 && this.aG <= 2) {
         this.k_void2(var2);
      } else if (var1 == 3 && this.aG <= 6) {
         if (var2 - 1 == 1134 && (this.u_byteArr[0] == 3 || this.u_byteArr[0] == 1)) {
            this.a_obj_c
               .a_void5(
                  this.aH,
                  this.aI,
                  (this.j_byteArr2[3][var2] & 255) >> 6,
                  108 + this.e_byteArr[6868 + this.k_byteArr2[2][0]],
                  this.aD + (this.e_byteArr[1515 + this.k_byteArr2[2][0]] == 0 ? 0 : 1),
                  -1,
                  this.aG - 5
               );
         } else {
            this.a_obj_c.a_void4(this.aH, this.aI, (this.j_byteArr2[3][var2] & 255) >> 6, this.aD, this.aG - 5);
         }
      } else {
         if (var1 == 4) {
            if (this.aG != 1) {
               int var3 = this.aG;
               this.bb = 0 + this.aH + (this.j_byteArr2[21][var3] & 127);
               this.bc = 0 + this.aI + this.j_byteArr2[22][var3];
               this.bd = this.j_byteArr2[23][var3];
               this.be = this.j_byteArr2[24][var3];
               c_void8(a_obj_GraphicsArr[this.N_byte], this.bb, this.bc, this.bd, this.be);
               return;
            }

            this.bb = 0;
            this.bc = 0;
            this.bd = 700;
            this.be = 544;
            c_void8(a_obj_GraphicsArr[this.N_byte], this.bb, this.bc, this.bd, this.be);
         }
      }
   }

   // $VF: renamed from: j (int) void
   private void j_void2(int var1) {
      if (var1 - 1 == 1123) {
         int var7 = this.r_byteArr[this.as_byte];
         if (this.ad_byte != 6) {
            var7 = var7 == 16 ? this.e_byteArr[8749 + this.q_int] : var7 + -6 + 20;
         }

         byte var8 = this.a_byteArr[this.a_shortArr[138] + 468 + var7];
         int var9 = 0;

         for (int var6 = 0; var6 < 3; var6++) {
            if (this.a_byteArr[this.a_shortArr[138] + (10 + var6) * 26 + var7] != 0) {
               int var10 = this.aI - this.a_byteArr[this.a_shortArr[283] + 2] * (var8 - 1) / 2 + (this.a_byteArr[this.a_shortArr[283] + 2] + 2) * var9;
               var9++;
               this.a_void7(632 + var6, this.aH - 10 + 3, var10);
               this.a_obj_c
                  .a_void3(
                     this.aH + 19,
                     var10,
                     (this.j_byteArr2[3][var1] & 255) >> 6,
                     String.valueOf(this.a_byteArr[this.a_shortArr[138] + (10 + var6) * 26 + var7]),
                     0
                  );
            }
         }
      } else if (var1 - 1 == 1112) {
         int var2 = this.r_byteArr[this.as_byte] + 12;
         int var3 = 0;

         for (int var5 = 0; var5 < 3; var5++) {
            if (this.a_byteArr[this.a_shortArr[138] + (10 + var5) * 26 + var2] != 0) {
               int var4 = this.aH - 34 * (this.a_byteArr[this.a_shortArr[138] + 468 + var2] - 1) / 2 + 30 * var3;
               var3++;
               this.a_void7(632 + var5, var4 - 2 - 4, this.aI);
               this.a_obj_c
                  .a_void3(
                     var4 + 15,
                     this.aI,
                     (this.j_byteArr2[3][var1] & 255) >> 6,
                     String.valueOf(this.a_byteArr[this.a_shortArr[138] + (10 + var5) * 26 + var2]),
                     0
                  );
            }
         }

         this.d_intArr[8] = 0;
         if (this.e_byteArr[8749 + this.q_int] == 6 && this.r_byteArr[this.as_byte] != 1) {
            this.d_intArr[8] = -20;
         }
      } else {
         switch (var1 - 1) {
            case 1077:
               this.aD /= 21;
            default:
               this.a_void7(this.aG + this.aD, this.aH, this.aI);
         }
      }
   }

   // $VF: renamed from: k (int) void
   private void k_void2(int var1) {
      switch (var1 - 1) {
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

      switch (var1 - 1) {
         case 1018:
            this.a_obj_c
               .a_void3(
                  this.aH, this.aI, (this.j_byteArr2[3][var1] & 255) >> 6, this.aD + "/" + this.a_shortArr2[0][16], this.aG - 1
               );
            return;
         default:
            this.a_obj_c.a_void3(this.aH, this.aI, (this.j_byteArr2[3][var1] & 255) >> 6, String.valueOf(this.aD), this.aG - 1);
      }
   }

   // $VF: renamed from: c () boolean
   private boolean c_bool2() {
      this.G_bool = false;
      if (this.aB == 0) {
         for (int var1 = 0; var1 < 5; var1++) {
            if (this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[146] + var1]] != this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + 0] + var1]) {
               this.G_bool = true;
               this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + 0] + var1] = this.a_shortArr2[0][this.a_byteArr[this.a_shortArr[146] + var1]];
               this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + 0] + var1] = 1;
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
            for (int var2 = 0; var2 < this.a_byteArr[this.a_shortArr[307] + this.m_byte]; var2++) {
               this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + this.aB] + var2] = (byte)(var2 == this.Z_int ? 1 : 0);
            }
         }
      }

      return this.G_bool;
   }

   // $VF: renamed from: x () void
   private void x() {
      this.k_byteArr[47] = this.ay_byte;

      for (int var1 = 0; var1 < 2; var1++) {
         this.k_byteArr[48 + var1] = (byte)(this.F_byte == 2 + var1 ? 2 : (this.a_byteArr2[2 + var1][0] > 0 ? 1 : 0));
      }

      this.k_byteArr[50] = (byte)(41 + this.u_byteArr[0]);
      this.k_byteArr[51] = this.a_byteArr[this.a_shortArr[304] + this.u_byteArr[0]];

      for (int var2 = this.a_byteArr[this.a_shortArr[195] + 60 + 9]; var2 < this.a_byteArr[this.a_shortArr[195] + 60 + 9] + 5; var2++) {
         if (this.k_byteArr[var2] != -1) {
            if (this.d_shortArr[var2] != this.k_byteArr[var2]) {
               this.d_shortArr[var2] = this.k_byteArr[var2];
               this.k_byteArr[var2] = 1;
               this.G_bool = true;
            } else {
               this.k_byteArr[var2] = 0;
            }
         }
      }
   }

   // $VF: renamed from: y () void
   private void y() {
      for (int var1 = 0; var1 < 23; var1++) {
         if (this.e_byteArr[this.b_shortArr[this.a_byteArr[this.a_shortArr[147] + var1]] + this.l_byte]
            != this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + 4] + var1]) {
            this.G_bool = true;
            this.d_shortArr[this.a_byteArr[this.a_shortArr[195] + 60 + 4] + var1] = this.e_byteArr[this.b_shortArr[this.a_byteArr[this.a_shortArr[147] + var1]]
               + this.l_byte];
            this.k_byteArr[this.a_byteArr[this.a_shortArr[195] + 60 + 4] + var1] = 1;
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

      for (int var1 = this.a_byteArr[this.a_shortArr[195] + 60 + 17]; var1 < this.a_byteArr[this.a_shortArr[195] + 60 + 17] + 2; var1++) {
         if (this.d_shortArr[var1] != this.k_byteArr[var1]) {
            this.d_shortArr[var1] = this.k_byteArr[var1];
            this.k_byteArr[var1] = 1;
            this.G_bool = true;
         } else {
            this.k_byteArr[var1] = 0;
         }
      }
   }

   // $VF: renamed from: a (int, byte, int) void
   private void a_void9(int var1, byte var2, int var3) {
      boolean var4 = false;

      for (int var10 = 0; var10 < this.aV; var10++) {
         this.N_int = var1;
         int var7 = aU * var10;
         byte var5 = 1;
         if (this.aW + var10 == this.as_byte) {
            var5 = 0;
         } else if (var2 == 2) {
            continue;
         }

         this.b_void2(this.b_shortArr2[1][var1] & 4095, this.aX + var7, var3 - 1);
         this.a_void7(552 + var5, this.aX + var7, var3);
         byte var6;
         GameResources var10000;
         byte var10001;
         int var10002;
         int var10003;
         int var10004;
         if ((var6 = this.r_byteArr[this.aW + var10]) < 0) {
            this.a_void4(-var6, this.aX + var7 - -1, var3 + 8 + 2 + 3, -8, (byte)29);
            if (!this.V_bool || this.F_bool || this.aW + var10 != this.as_byte) {
               continue;
            }

            var10000 = this;
            var10001 = 18;
            var10002 = this.aX + var7;
            var10003 = var3;
            var10004 = this.f_int;
         } else {
            if (var6 <= 8) {
               this.a_void7(664 + var6, this.aX + var7, var3);
               byte var8 = 0;
               byte var9 = 0;
               if (this.e_byteArr[8749 + this.q_int] == 6) {
                  var8 = -1;
                  var9 = 6;
               }

               this.a_obj_c
                  .a_void3(this.aX + var7 + 19 + var8 + 6, var3 + 5 + var9 + 2, 1, String.valueOf(this.s_byteArr[var10 + this.aW]), 0);
               if (this.e_byteArr[8749 + this.q_int] != 6 && this.aW + var10 < this.av_byte && this.aW + var10 == this.as_byte) {
                  this.d_void(3, this.aX + var7 + 6, var3 + 2 + 2, this.f_int);
                  this.S_bool = true;
               }
               continue;
            }

            var10000 = this;
            var10001 = var6;
            var10002 = this.aX + var7;
            var10003 = var3;
            var10004 = this.aW + var10 == this.as_byte ? this.f_int : 0;
         }

         var10000.d_void(var10001, var10002, var10003, var10004);
      }

      if (this.T_bool) {
         this.d_void(1, this.aX - 9, var3 + 8 - 0, this.e_int);
      }

      if (this.U_bool) {
         this.d_void(2, this.aX + this.aY - 9 + 9, var3 + 8 - 0, this.e_int);
      }
   }

   // $VF: renamed from: c (int, int, int) void
   private void c_void2(int var1, int var2, int var3) {
      int var6 = this.a_byteArr[this.a_shortArr[283] + 2] + 6;
      int var7 = 0;
      this.ab_int = this.a_byteArr[this.a_shortArr[152] + this.Q_byte + 1] - this.a_byteArr[this.a_shortArr[152] + this.Q_byte];
      int var4 = var2 + this.j_byteArr2[23][this.b_shortArr2[1][var1] & 4095] / 2 * 4;
      int var5 = var3 - this.ab_int * var6 / 2 + var6 / 2;

      for (int var8 = 0; var8 < this.ab_int; var8++) {
         if (var8 == this.Z_int) {
            var7 = var5;
         }

         this.b_void2(this.b_shortArr2[1][var1] & 4095, var2, var5);
         this.a_obj_c.a_void4(var4, var5, 1, 57 + this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + this.Q_byte] + var8], 0);
         var5 += var6;
      }

      this.a_obj_c.a_void6(a_obj_GraphicsArr[this.N_byte]);
      this.d_void(2, var4 - 50 - 20, var7 + 4, this.e_int);
      this.d_void(1, var4 + 49 + 20, var7 + 4, this.e_int);
   }

   // $VF: renamed from: a (int) void
   final void a_void10(int var1) {
      af_byte = (byte)(af_byte + var1);
      if (af_byte > 98) {
         af_byte = 98;
      }

      this.n_byteArr[2] = this.n_byteArr[3] = this.n_byteArr[4] = af_byte;

      for (int var2 = 0; var2 < 5; var2++) {
         a_obj_GraphicsArr[M_byte].setColor(this.f_intArr[var2]);
         b_void8(a_obj_GraphicsArr[M_byte], 110 + this.l_byteArr[var2], 232 + this.m_byteArr[var2], this.n_byteArr[var2], this.o_byteArr[var2]);
      }

      if (!this.y_bool) {
         this.a_obj_tribes.a_obj_d.a();
         Thread.yield();
      } else {
         this.l_void();
      }
   }

   // $VF: renamed from: c (byte) void
   private void c_void3(byte var1) {
      boolean var5 = false;

      try {
         System.gc();
         Thread.yield();
         DataInputStream var8 = new DataInputStream(this.getClass().getResourceAsStream("/pi8"));

         byte var4;
         for (byte var10 = 0; var10 < 12 && (var4 = (byte)(var8.readByte() & 255)) != 255; var10++) {
            short var6;
            byte[] var7 = new byte[var6 = (short)(var4 << 8 | var8.readByte() & 255)];
            var8.read(var7, 0, var6);
            if (var10 == var1) {
               this.a_obj_ImageArr2[2][0] = Image.createImage(var7, 0, var6);
               break;
            }
         }

         var8.close();
      } catch (Exception var9) {
      }
   }

   // $VF: renamed from: C () void
   private void C() {
      this.aK = this.c_short > ag_byte ? ag_byte : this.c_short;
      this.aL = this.d_short > ah_byte ? ah_byte : this.d_short;
      this.N_byte = 1;
      this.b_void2(this.b_shortArr2[1][1188] & 4095, 0, 0);
      int var3 = 0;
      int var4 = 0;
      boolean var5 = false;

      for (int var6 = 0; var6 < this.aL; var6++) {
         int var2 = 0;
         int var1 = -1;

         for (int var7 = 0; var7 <= this.aK; var7++) {
            if (var7 == this.aK) {
               var5 = true;
            } else {
               this.e_void(this.W_int + var7, this.X_int + var6);
            }

            if (!var5 && this.aM == var1) {
               var4++;
            } else {
               if (var4 > 0) {
                  a_obj_GraphicsArr[this.N_byte].setColor(var1);
                  b_void8(a_obj_GraphicsArr[this.N_byte], var2 * 7 - 0, (this.aJ + var3) * 4 - 0, var4 * 7, 4);
                  var4 = 0;
               }

               if (var5) {
                  var5 = false;
               } else {
                  var1 = this.aM;
                  var2 = var7;
                  var3 = var6;
                  var4 = 1;
               }
            }
         }
      }
   }

   // $VF: renamed from: D () void
   private void D() {
      this.N_byte = M_byte;
      int var2 = (this.b_shortArr2[1][1188] >> 12 & 3) << 7;
      this.b_void2(this.b_shortArr2[1][1188] & 4095, 160 + this.j_byteArr2[1][1188] + 0, 120 + this.j_byteArr2[2][1188] + 0 + var2);
      a_bool6(
         a_obj_GraphicsArr[M_byte],
         a_obj_ImageArr[this.c_byteArr[1]],
         (this.ad_int + 1) / 2 * 7,
         (this.ae_int + 1) / 2 * 4,
         7 * ag_byte,
         4 * ah_byte,
         160 + this.j_byteArr2[1][1188] + (-this.ad_int + 1) / 2 * 7,
         120 + this.j_byteArr2[2][1188] + (-this.ae_int + 1) / 2 * 4 + var2,
         0
      );
      a_obj_GraphicsArr[this.c_byteArr[1]]
         .drawImage(a_obj_ImageArr[this.c_byteArr[0]], -(160 + this.j_byteArr2[1][1188] + 0) * 1, -(120 + this.j_byteArr2[2][1188] + 0 + var2) * 1, 0);
      int var3 = (this.ad_int + 1 >> 1) * (this.aK - 1);
      int var4 = (this.ae_int + 1 >> 1) * (this.aL - 1);
      this.N_byte = 1;
      if (this.ae_int == 0) {
         a_obj_GraphicsArr[this.N_byte].setColor(11180356);
         b_void8(a_obj_GraphicsArr[this.N_byte], var3 * 7 - 0, var4 - 0, 7, ah_byte * 4);

         for (int var6 = 0; var6 < this.aL; var6++) {
            this.e_void(this.W_int + var3, this.X_int + var6);
            a_obj_GraphicsArr[this.N_byte].setColor(this.aM);
            b_void8(a_obj_GraphicsArr[this.N_byte], var3 * 7 - 0, (this.aJ + var6) * 4 - 0, 7, 4);
         }
      } else if (this.ad_int == 0) {
         for (int var5 = 0; var5 < this.aK; var5++) {
            this.e_void(this.W_int + var5, this.X_int + var4);
            a_obj_GraphicsArr[this.N_byte].setColor(this.aM);
            b_void8(a_obj_GraphicsArr[this.N_byte], var5 * 7 - 0, (this.aJ + var4) * 4 - 0, 7, 4);
         }
      }
   }

   // $VF: renamed from: e (int, int) void
   private void e_void(int var1, int var2) {
      this.aM = -1;
      byte var3;
      if ((var3 = this.a_byte6(var1, var2)) != 2) {
         if (this.c_byteArr2[var2][var1] <= 0) {
            if (this.c_byteArr2[var2][var1] < 0) {
               this.aM = this.b_intArr2[var3][b_byte2(this.c_byteArr2[var2][var1]) + 9];
            }
         } else {
            this.aM = a_byte2(this.c_byteArr2[var2][var1]) == 1 && (this.e_byteArr[7979 + this.c_byteArr2[var2][var1]] & 2) != 0
               ? -1
               : this.b_intArr2[var3][a_byte2(this.c_byteArr2[var2][var1]) + 6];
         }

         if (this.aM == -1) {
            this.aM = this.b_intArr2[var3][this.a_byteArr[this.a_shortArr[194] + (this.b_byteArr2[var2][var1] & 255)]];
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
            a_obj_GraphicsArr[M_byte].drawImage(Image.createImage("/l3"), 0, 0, 20);
         } catch (Exception var2) {
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
         a_obj_GraphicsArr[this.N_byte].setColor(9422847);
         b_void8(a_obj_GraphicsArr[this.N_byte], 0, 0, this.a_intArr[this.N_byte], this.b_intArr[this.N_byte]);
         a_obj_GraphicsArr[this.N_byte].setColor(940839);
         b_void8(a_obj_GraphicsArr[this.N_byte], 0, 0 + this.b_intArr[this.N_byte] - 64, this.a_intArr[this.N_byte], 64);
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
      a_obj_GraphicsArr[this.N_byte].drawImage(a_obj_ImageArr[this.c_byteArr[1]], 0, 240, 36);
      a_obj_GraphicsArr[this.N_byte].setColor(9422847);
      b_void8(a_obj_GraphicsArr[this.N_byte], 0, 0, this.a_intArr[this.N_byte], 80);

      for (int var1 = 0; var1 < 4; var1++) {
         if (this.a_intArr2[0][var1] > 320 || this.a_intArr2[0][3] == -1000) {
            this.a_intArr2[0][var1] = -88 - this.a_int2(65535, 80);
            this.a_intArr2[1][var1] = this.a_int2(65535, 48);
            this.a_intArr2[2][var1] = this.a_int2(255, 4);
         }

         this.a_void7(
            1674 + this.a_intArr2[2][var1],
            this.a_intArr2[0][var1] = this.a_intArr2[0][var1] + (this.a_intArr2[2][var1] + 2 >> 1),
            this.a_intArr2[1][var1] = this.a_intArr2[1][var1] + (this.a_int2(255, 5) == 0 ? this.a_int2(255, 3) - 1 : 0)
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
            a_obj_GraphicsArr[1].drawImage(a_obj_ImageArr[0], 0, 0, 0);
         }

         this.b_boolArr[2] = true;
      }

      a_bool6(a_obj_GraphicsArr[0], a_obj_ImageArr[1], 0, 0, 350, 240 - this.aZ, 0, 0, 0);
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
      a_bool6(a_obj_GraphicsArr[this.c_byteArr[0]], a_obj_ImageArr[this.c_byteArr[1]], 0, 0, 350, this.A_int, 0, this.ba - this.ax_byte + this.aP, 0);

      for (byte var1 = 0; var1 < 20; var1++) {
         if (this.a_boolArr[var1]) {
            this.b_boolArr[var1] = true;
            this.a_void8(var1, 0, this.d_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + var1]]);
            this.N_byte = this.c_byteArr[0];
            if (this.a_byteArr[this.a_shortArr[195] + 20 + var1] == 1 && this.Q_byte != 20) {
               this.a_void7(526, 0, 0 + this.ba);
            } else if (this.a_byteArr[this.a_shortArr[195] + 20 + var1] == 2) {
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
         a_obj_GraphicsArr[M_byte].setColor(0);
         b_void8(a_obj_GraphicsArr[M_byte], 0, 0, 320, 16 + this.aN);
         b_void8(a_obj_GraphicsArr[M_byte], 0, 256 - this.aN, 320, this.aN);
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
         a_obj_GraphicsArr[M_byte].setColor(0);
         b_void8(a_obj_GraphicsArr[M_byte], 0, 0, 320, 96);
         b_void8(a_obj_GraphicsArr[M_byte], 0, 192, 320, 64);
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
               a_obj_GraphicsArr[M_byte].setColor(0);
               b_void8(a_obj_GraphicsArr[M_byte], 0, 96, 320, 96);
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
            for (int var2 = 0; var2 < this.p_byteArr.length; var2++) {
               if (this.p_byteArr[var2] != 0) {
                  int var1 = var2 > 6 ? 6 : var2;
                  if (this.a_byteArr[this.a_shortArr[196] + var1 * 33 + 0 + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3] != 0) {
                     this.e_byteArr[2929 + this.p_byteArr[var2]] = this.a_byteArr[this.a_shortArr[196]
                        + var1 * 33
                        + 0
                        + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3];
                     this.e_byteArr[1313 + this.p_byteArr[var2]] = this.a_byteArr[this.a_shortArr[196]
                        + var1 * 33
                        + 2
                        + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3];
                     this.e_byteArr[2828 + this.p_byteArr[var2]] = 105;
                  }

                  if (this.a_byteArr[this.a_shortArr[196] + var1 * 33 + 1 + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3] != 0) {
                     this.e_byteArr[606 + this.p_byteArr[var2]] = (byte)(
                        -10 + this.a_byteArr[this.a_shortArr[196] + var1 * 33 + 1 + this.a_byteArr[this.a_shortArr[155] + 28 + this.aR] * 3]
                     );
                     this.e_byteArr[808 + this.p_byteArr[var2]] = 0;
                  }

                  this.e_byteArr[3030 + this.p_byteArr[var2]] = 0;
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

            a_bool6(a_obj_GraphicsArr[this.c_byteArr[0]], a_obj_ImageArr[this.c_byteArr[1]], 0, 96, 350, 96 - this.aO, 0, 96 + this.aO, 0);
            if (this.aR == 24) {
               a_obj_GraphicsArr[M_byte].setColor(0);
               b_void8(a_obj_GraphicsArr[M_byte], 88, 0, 320, 8);
               b_void8(a_obj_GraphicsArr[M_byte], 0, 192, 320, 16);
            }

            this.N_byte = 0;
            this.bb = 0;
            this.bc = 96;
            this.bd = 350;
            this.be = 96;
            c_void8(a_obj_GraphicsArr[this.N_byte], this.bb, this.bc, this.bd, this.be);
            this.u();
            this.bb = 0;
            this.bc = 0;
            this.bd = 700;
            this.be = 544;
            c_void8(a_obj_GraphicsArr[this.N_byte], this.bb, this.bc, this.bd, this.be);
         }
      }
   }

   // $VF: renamed from: b (int) void
   final void b_void3(int var1) {
      this.i_void();
      if (var1 >= 0) {
         this.ai_byte = (byte)var1;
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
      this.a_obj_c.a_void2(this.ai_byte);
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
      byte var1 = this.a_byteArr[this.a_shortArr[310] + 71 + this.ai_byte];
      System.arraycopy(
         this.a_byteArr,
         this.a_shortArr[156] + this.a_byteArr[this.a_shortArr[157] + var1],
         this.p_byteArr,
         0,
         this.a_byteArr[this.a_shortArr[157] + var1 + 1] - this.a_byteArr[this.a_shortArr[157] + var1]
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
         this.a_obj_b.l_void2();
         this.aw_byte = 1;
         this.a_obj_b.a_void16(4, 46, 9, (byte)0, (byte)9);
         this.a_byte3((byte)0, (byte)48, (byte)9, (byte)3, (byte)0);
         this.e_byteArr[2934] = 14;
         this.e_byteArr[611] = 2;
         this.aw_byte = 2;
         this.a_obj_b.a_void16(1, 44, 9, (byte)1, (byte)2);
         this.a_obj_b.a_void16(1, 45, 11, (byte)1, (byte)2);
         this.e_byteArr[658] = 7;
         this.a_obj_b.a_void16(1, 48, 11, (byte)1, (byte)2);
         this.e_byteArr[659] = 5;
         this.a_obj_b.a_void16(2, 48, 9, (byte)1, (byte)2);
         this.a_shortArr2[0][17] = 0;
      } else if (this.ai_byte == 38) {
         this.a_obj_b.l_void2();
         this.a_byte4((byte)0, 2, 52, 18, 2, true, -1);
         this.a_byte4((byte)0, 2, 54, 16, 2, true, -1);
         this.a_byte4((byte)0, 2, 55, 19, 2, true, -1);
         this.a_byte4((byte)0, 2, 58, 19, 2, true, -1);
         this.aw_byte = 0;
         this.a_obj_b.a_void16(5, 60, 12, (byte)0, (byte)0);
         this.aw_byte = 2;
         this.d_void3(57, 17, 1);
         this.a_obj_c.a_void();
      } else if (this.ai_byte == 43) {
         this.b_void5(52, 7);
      } else if (this.ai_byte == 45) {
         this.a_obj_b.m_void2();
         this.b_void5(57, 30);
         this.b_void7(1, 54, 30, 5);
         this.b_void7(1, 54, 31, 5);
         this.b_void7(1, 55, 31, 5);
         this.b_void7(1, 55, 32, 5);
      } else {
         if (this.ai_byte == 48) {
            this.q_byte = 2;
            this.aM();
            this.a_obj_b.f_byte = 6;
            this.aN();
            this.q_byte = 3;
            this.a_byte4((byte)0, 24, 18, 67, 2, true, -1);
            this.a_byte4((byte)0, 25, 19, 69, 2, true, -1);
            this.a_byte4((byte)0, 25, 21, 71, 2, true, -1);
            this.a_shortArr2[0][12] = 0;
            this.a_byte3((byte)0, (byte)26, (byte)69, (byte)60, (byte)0);
            this.a_shortArr2[0][17] = 1;
            this.a_obj_b.a_void16(7, 26, 69, (byte)0, (byte)2);
            this.d_void3(23, 69, 1);
            this.a_obj_b.a_void16(2, 1, 69, (byte)1, (byte)3);
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
      this.a_obj_b.d_void2();
      if (this.ai_byte == 26) {
         this.s_bool = false;
         this.c_void4();
         this.s_bool = true;
      }

      if (this.ao_byte == 9) {
         this.a_obj_b.f_void2();
      } else if (this.ai_byte == 28) {
         this.d_void3(5, 11, 0);
         this.a_obj_b.I_byte = (byte)(this.a_obj_b.I_byte & 254);
         this.a_obj_b.d_shortArr[this.a_byteArr[this.a_shortArr[292] + 4]] = 0;
      } else if (this.ai_byte == 34) {
         this.d_void3(48, 15, 5);
         this.a_obj_b.I_byte = 0;
      } else if (this.ai_byte == 38) {
         this.d_void3(65, 18, 1);
         this.u_byte = 1;
      } else if (this.ai_byte == 44) {
         for (int var1 = 0; var1 < 10; var1++) {
            this.e_byteArr[9601 + var1] = this.am_byte;
         }

         this.d_void3(53, 5, 0);
         this.f_void3(this.am_byte, -2);
         this.a_obj_c.a_void();
      } else if (this.ai_byte == 48) {
         this.u_byte = 1;
         this.d_void3(45, 69, 6);
      }

      for (int var2 = 0; var2 < this.p_byteArr.length; var2++) {
         if (this.e_byteArr[2828 + this.p_byteArr[var2]] == 105) {
            if (this.e_byteArr[4646 + this.p_byteArr[var2]] < 0) {
               this.e_byteArr[2828 + this.p_byteArr[var2]] = 69;
            } else {
               this.e_byteArr[2828 + this.p_byteArr[var2]] = 57;
            }
         }

         this.p_byteArr[var2] = 0;
      }

      if (this.a_obj_b.f_byte >= 50) {
         this.a_obj_b.F_int = this.ai_byte == 15 ? 1000000 : this.c_int;
         this.a_obj_b.f_byte = (byte)(this.a_obj_b.f_byte - 49);
         this.a_obj_b.g_byte = this.a_byteArr[this.a_shortArr[294] + this.a_obj_b.f_byte - 1];
         this.a_obj_b.J_byte = 0;
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
   private void d_void3(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.p_byteArr.length; var4++) {
         if (var4 == var3 || var4 >= 6) {
            this.e_void2(var1, var2, this.p_byteArr[var4]);
         }
      }
   }

   // $VF: renamed from: e (int, int, int) void
   private void e_void2(int var1, int var2, int var3) {
      this.e_byteArr[2828 + var3] = 69;
      this.e_byteArr[3131 + var3] = (byte)var1;
      this.e_byteArr[3232 + var3] = (byte)var2;
      this.e_byteArr[6161 + var3] = 2;
      this.e_byteArr[4747 + var3] = 0;
      this.e_byteArr[7979 + var3] = (byte)(this.e_byteArr[7979 + var3] & 191);
   }

   // $VF: renamed from: c () void
   final void c_void4() {
      this.c_short = this.e_short;
      this.d_short = this.f_short;
      this.q_byte++;
      this.aP();
      this.a_obj_b.G_int = this.a_shortArr[219] + this.q_byte * 4;
   }

   // $VF: renamed from: a (byte, byte, byte) void
   final void a_void11(byte var1, byte var2, byte var3) {
      if (var1 >= 18 || this.l_int != 0 && this.Q_byte != 17 && (var1 == 18 || !this.K_bool) && this.u_byte <= 0) {
         this.Z_int = 0;
         this.o_int = 0;
         this.i_void();
         this.ap_byte = var1;
         this.v_byte = 0;
         this.Q_byte = 20;
         this.H_bool = true;
         this.v_int = 12 + var1;
         this.am_byte = var2;
         this.an_byte = var3;
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
         if (var1 != 4 && var1 != 5 && var1 != 14 && var1 != 15) {
            this.a_byteArr[this.a_shortArr[153] + 145 + 20] = 2;
         } else {
            this.a_byteArr[this.a_shortArr[153] + 145 + 20] = 0;
         }
      }
   }

   protected final void keyPressed(int var1) {
      if (!this.n_bool) {
         if (!this.o_bool) {
            this.o_bool = true;
            if (a_bool4(var1)) {
               this.j_byte = 0;
               if (var1 == a_int || var1 == -a_int || var1 == 117) {
                  l_bool = true;
               } else if (var1 != b_int && var1 != -b_int && var1 != 106) {
                  if (this.a_bool && this.y_bool) {
                     this.m_void2(var1);
                  }

                  switch (var1) {
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
                           this.m_int = this.getGameAction(var1);
                        } catch (Exception var3) {
                           this.m_int = 666;
                        }

                        if (var1 == 103) {
                           this.i_bool = true;
                           this.t_bool = true;
                           this.n_int++;
                           if (!this.u_bool) {
                              this.E_byte = 0;
                           }

                           return;
                        } else if (var1 == 116) {
                           this.e_bool = true;
                           return;
                        } else if (var1 == 98) {
                           this.f_bool = true;
                           return;
                        } else if (var1 == 102) {
                           this.g_bool = true;
                           return;
                        } else if (var1 == 104) {
                           this.h_bool = true;
                           return;
                        } else {
                           if (this.m_int != 8 && var1 != 103) {
                              if (this.m_int == 1 || var1 == 116) {
                                 this.e_bool = true;
                                 return;
                              }

                              if (this.m_int == 6 || var1 == 98) {
                                 this.f_bool = true;
                                 return;
                              }

                              if (this.m_int == 2 || var1 == 102) {
                                 this.g_bool = true;
                                 return;
                              }

                              if (this.m_int == 5 || var1 == 104) {
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

   protected final void keyReleased(int var1) {
      if (!this.n_bool) {
         if (a_bool4(var1)) {
            this.j_byte = 0;
            switch (var1) {
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
                     this.m_int = this.getGameAction(var1);
                  } catch (Exception var3) {
                     this.m_int = 666;
                  }

                  if (var1 == 103 || this.m_int == 8) {
                     this.t_bool = false;
                     if (this.E_byte < 4) {
                        this.v_bool = true;
                     }
                  }

                  if (this.o_bool) {
                     this.p_bool = true;
                     return;
                  } else if (var1 == 116) {
                     this.e_bool = false;
                     return;
                  } else if (var1 == 98) {
                     this.f_bool = false;
                     return;
                  } else if (var1 == 102) {
                     this.g_bool = false;
                     return;
                  } else if (var1 == 104) {
                     this.h_bool = false;
                     return;
                  } else {
                     if (var1 != 116 && this.m_int != 1) {
                        if (var1 != 98 && this.m_int != 6) {
                           if (var1 != 102 && this.m_int != 2) {
                              if (var1 == 104 || this.m_int == 5) {
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
   private static boolean a_bool4(int var0) {
      return var0 == -10 ? false : var0 != 100 && var0 != 107;
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
         byte var1 = this.c_byteArr2[this.K_byte + this.A_byte][this.I_byte + this.y_byte];
         if (this.w_byte == 1 && this.W_byte >= 51 && this.W_byte <= 100) {
            this.y_byte = (byte)(this.e_byteArr[0 + this.W_byte] - this.I_byte);
            this.A_byte = (byte)(this.e_byteArr[101 + this.W_byte] - this.K_byte);
            this.e_void3(this.W_byte);
         } else if (this.w_byte == 1 && a_byte2(var1) != 0) {
            this.e_void3(var1);
         } else if (this.w_byte == 3) {
            this.X();
         } else if (a_byte2(var1) == 0) {
            this.d_void4(var1);
         } else if (this.w_byte == 0 && b_byte2(var1) == 0) {
            this.f_void2((byte)(-var1));
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
               this.a_obj_b.b_void3();
            } else if (this.M_bool) {
               this.L_bool = this.M_bool;
               this.a_obj_b.b_void3();
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
   private void d_void4(byte var1) {
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
         if (this.e_byteArr[1919 + var1] > 0) {
            this.a_void17(false, true, false, true);
            this.w_byte = 1;
            this.k_byte = this.l_byte = var1;
            this.F_byte = -1;
         }
      }
   }

   // $VF: renamed from: e (byte) void
   private void e_void3(byte var1) {
      if (this.F_byte != -1) {
         for (int var2 = 0; var2 < 50; var2++) {
            if (this.a_byteArr2[this.F_byte][var2] > 0) {
               this.a_void12(this.a_byteArr2[this.F_byte][var2], var1);
            }
         }
      } else {
         this.a_void12(this.k_byte, var1);
      }

      this.n_int = 0;
   }

   // $VF: renamed from: a (byte, byte) void
   private void a_void12(byte var1, byte var2) {
      if (this.e_byteArr[505 + var1] >= 10 || this.N_bool || this.L_bool && (this.e_byteArr[7979 + var1] & 64) != 0) {
         if (b_byte2(var2) == 0 && this.e_byteArr[8749 + -var2] == 6) {
            this.a_void17(true, false, true, false);
            this.q_int = -var2;
            this.w_byte = 2;
            this.Z();
         } else {
            if (this.n_int > 1
               || this.e_byteArr[3131 + var1] == this.y_byte + this.I_byte && this.e_byteArr[3232 + var1] == this.A_byte + this.K_byte) {
               this.q_bool = true;
               if (this.e_byteArr[7777 + var1] == 0) {
                  this.e_byteArr[7777 + var1] = 3;
                  this.a_obj_b.b_byte3(var1);
                  if (this.e_byteArr[7777 + var1] > 0) {
                     this.e_byteArr[1111 + var1] = (byte)(
                        (this.e_byteArr[1111 + var1] & 240)
                           + this.a_byteArr[this.a_shortArr[129 + (this.e_byteArr[606 + var1] & 1) * 2]
                              + this.a_byteArr[this.a_shortArr[129 + (this.e_byteArr[606 + var1] & 1) * 2 + 1] + this.e_byteArr[1010 + var1] - 5]
                              + (this.e_byteArr[1111 + var1] & 15)]
                     );
                  }
               }
            } else if (this.e_byteArr[7777 + var1] > 0) {
               this.e_byteArr[1111 + var1] = (byte)(
                  (this.e_byteArr[1111 + var1] & 240)
                     + this.a_byteArr[this.a_shortArr[133 + (this.e_byteArr[606 + var1] & 1) * 2]
                        + this.a_byteArr[this.a_shortArr[133 + (this.e_byteArr[606 + var1] & 1) * 2 + 1] + this.e_byteArr[1010 + var1] - 5]
                        + (this.e_byteArr[1111 + var1] & 15)]
               );
               this.e_byteArr[7777 + var1] = 0;
            }

            this.e_byteArr[3131 + var1] = (byte)(this.y_byte + this.I_byte);
            this.e_byteArr[3232 + var1] = (byte)(this.A_byte + this.K_byte);
            this.e_byteArr[7979 + var1] = (byte)(this.e_byteArr[7979 + var1] & 223);
            this.e_byteArr[6161 + var1] = 2;
            this.e_byteArr[4747 + var1] = var2;
            this.ab_byte = (byte)(this.y_byte + this.I_byte);
            this.ac_byte = (byte)(this.A_byte + this.K_byte);
            this.aa_byte = (byte)((a_byte2(var2) == 1 || b_byte2(var2) == 1 || b_bool3(var2))
                  && this.a_byte6(this.y_byte + this.I_byte, this.A_byte + this.K_byte) == 0
               ? 2
               : 1);
         }
      } else {
         this.a_obj_b.a_void19((byte)12, var1, 0);
      }
   }

   // $VF: renamed from: c (int) void
   final void c_void5(int var1) {
      for (int var2 = (var1 - 1) / 50 * 30 + 1; var2 <= (var1 - 1) / 50 * 30 + 30; var2++) {
         if (this.e_byteArr[8810 + var2] == var1 && (this.e_byteArr[8749 + var2] != 2 || this.e_byteArr[8627 + var2] != 0)) {
            this.a_void13(var2, false);
            this.e_byteArr[8810 + var2] = 0;
            this.e_byteArr[9298 + var2] = 0;
            return;
         }

         if ((this.e_byteArr[8627 + var2] == 2 || this.e_byteArr[8627 + var2] == 1) && this.e_byteArr[9237 + var2] == var1) {
            this.e_byteArr[9237 + var2] = 0;
         }
      }
   }

   // $VF: renamed from: a (int, boolean) void
   final void a_void13(int var1, boolean var2) {
      for (byte var3 = this.e_byteArr[8993 + var1]; var3 > 0; var3 = this.e_byteArr[4545 + var3]) {
         if ((this.e_byteArr[4646 + var3] != 0 || var2)
            && (this.e_byteArr[8749 + var1] != 11 || this.e_byteArr[8627 + var1] != 0 || this.a_byteArr[this.a_shortArr[18] + this.e_byteArr[6565 + var3]] == 0)
            && this.e_byteArr[2929 + var3] != -108
            && this.e_byteArr[2929 + var3]
               != this.a_byteArr[this.a_shortArr[173] + this.a_byteArr[this.a_shortArr[174] + this.e_byteArr[8749 + var1]] + this.e_byteArr[4646 + var3]]
            && this.e_byteArr[2929 + var3]
               != this.a_byteArr[this.a_shortArr[176] + this.a_byteArr[this.a_shortArr[177] + this.e_byteArr[8749 + var1]] + this.e_byteArr[4646 + var3]]) {
            this.a_void15(var3, var1, false, false);
         }
      }
   }

   // $VF: renamed from: f (byte) void
   private void f_void2(byte var1) {
      if (this.e_byteArr[8749 + var1] == 3 && this.e_byteArr[8932 + var1] == 0) {
         this.r_byteArr[0] = this.as_byte = 0;
         this.l_void2(4);
      } else {
         this.a_void17(true, false, true, false);
         this.q_int = var1;
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

            for (byte var1 = 0; var1 < this.r_byteArr.length; var1++) {
               this.r_byteArr[var1] = 0;
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

               int var4 = this.q_byte > 1 ? 11 : (this.ai_byte < 18 ? 3 : 6);

               for (byte var2 = 0; var2 < var4; var2++) {
                  this.r_byteArr[var2] = this.a_byteArr[this.a_shortArr[137] + var2];
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
      } catch (Exception var3) {
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
         int var5 = this.e_byteArr[9115 + this.q_int] - 1;

         for (byte var2 = this.a_byteArr[this.a_shortArr[144] + var5]; var2 < this.a_byteArr[this.a_shortArr[144] + var5 + 1]; var2++) {
            if (0 + this.a_byteArr[this.a_shortArr[143] + var2] >= 6 && this.av_byte == -1) {
               this.av_byte = (byte)(var2 - this.a_byteArr[this.a_shortArr[144] + var5]);
            }

            this.r_byteArr[this.ar_byte] = this.a_byteArr[this.a_shortArr[143] + var2];
            this.s_byteArr[var2 - this.a_byteArr[this.a_shortArr[144] + var5]] = this.a_byteArr3[0][this.au_byte][this.a_byteArr[this.a_shortArr[143] + var2]];
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
            for (byte var3 = 0; this.a_byteArr2[this.F_byte][var3] != 0; var3++) {
               if (this.e_byteArr[3636 + this.a_byteArr2[this.F_byte][var3]] > 0) {
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

         for (byte var4 = 0; var4 < 6; var4++) {
            if (this.a_shortArr2[0][5 + var4] > 0) {
               this.r_byteArr[this.ar_byte] = var4;
               this.s_byteArr[this.ar_byte] = (byte)this.a_shortArr2[0][5 + var4];
               this.ar_byte++;
            }
         }
      } else {
         if (this.e_byteArr[8749 + this.q_int] == 8) {
            for (byte var1 = 0; var1 < this.e_byteArr[9115 + this.q_int] * 2; var1++) {
               this.r_byteArr[this.ar_byte] = (byte)(19 + var1);
               this.ar_byte++;
            }
         }
      }
   }

   // $VF: renamed from: ab () void
   private void ab() {
      for (byte var1 = 0; var1 < 8; var1++) {
         this.j_byteArr[var1] = 0;
      }

      byte var5 = 0;
      int var2 = 0;
      if (this.e_byteArr[8810 + this.q_int] > 0 && (this.e_byteArr[8749 + this.q_int] != 2 || this.e_byteArr[8627 + this.q_int] != 0)) {
         this.j_byteArr[0] = this.e_byteArr[8810 + this.q_int];
         var2++;
         var5 = 1;
      }

      for (byte var3 = this.e_byteArr[8993 + this.q_int]; var3 > 0; var3 = this.e_byteArr[4545 + var3]) {
         if (this.e_byteArr[1313 + var3] > 0
            && (this.e_byteArr[8810 + this.q_int] != var3 || this.e_byteArr[8749 + this.q_int] == 2 && this.e_byteArr[8627 + this.q_int] == 0)) {
            this.j_byteArr[var5 + this.e_byteArr[4646 + var3]] = var3;
            var2++;
         }
      }

      byte var6 = 0;

      for (byte var4 = 0; var4 < var2; var4++) {
         while (this.j_byteArr[var6] == 0) {
            var6++;
         }

         this.r_byteArr[this.ar_byte] = (byte)(-this.j_byteArr[var6]);
         this.ar_byte++;
         var6++;
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
                  this.a_obj_b.b_void8(this.k_byte);
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
         this.a_obj_b.c_void();
         this.P_bool = true;
      } else if (this.r_byteArr[this.as_byte] == 12) {
         this.O_bool = true;
         this.l_void2(2);
         this.s_int = 100;
         this.aJ();
      } else if (this.r_byteArr[this.as_byte] == 15) {
         this.N_bool = false;
         this.O_bool = false;
         this.a_obj_b.c_void();
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
         byte var1 = 3;
         if (this.r_byteArr[this.as_byte] == 29) {
            var1 = 2;
         }

         if (this.k_byte > 0) {
            this.e_byteArr[3131 + this.k_byte] = (byte)(this.y_byte + this.I_byte);
            this.e_byteArr[3232 + this.k_byte] = (byte)(this.A_byte + this.K_byte);
            this.e_byteArr[2828 + this.k_byte] = (byte)(44 + this.r_byteArr[this.as_byte]);
            this.e_byteArr[6161 + this.k_byte] = var1;
            this.a_void17(false, true, false, true);
            this.w_byte = 1;
         } else if (this.F_byte == -1) {
            this.l_void2(1);
            this.s_int = -this.r_byteArr[this.as_byte] - 1;
         } else {
            for (int var2 = 0; this.a_byteArr2[this.F_byte][var2] > 0; var2++) {
               this.e_byteArr[3131 + this.a_byteArr2[this.F_byte][var2]] = (byte)(this.y_byte + this.I_byte);
               this.e_byteArr[3232 + this.a_byteArr2[this.F_byte][var2]] = (byte)(this.A_byte + this.K_byte);
               this.e_byteArr[2828 + this.a_byteArr2[this.F_byte][var2]] = (byte)(44 + this.r_byteArr[this.as_byte]);
               this.e_byteArr[6161 + this.a_byteArr2[this.F_byte][var2]] = var1;
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
   private void l_void2(int var1) {
      this.Y_int = var1;
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
   final void d_void5(int var1) {
      if (this.w_byte == 2 && var1 == this.q_int) {
         this.P_bool = true;
      }
   }

   // $VF: renamed from: b (int, boolean) void
   final void b_void4(int var1, boolean var2) {
      this.a_obj_b.b_bool6((byte)var1);

      for (byte var3 = this.e_byteArr[8993 + var1]; var3 > 0; var3 = this.e_byteArr[4545 + var3]) {
         this.a_void15(var3, var1, false, false);
      }

      this.e_byteArr[8627 + var1] = (byte)(var2 ? 1 : 2);
      if (var2) {
         this.e_byteArr[8566 + var1] = this.a_byteArr[this.a_shortArr[138] + (7 + this.e_byteArr[9115 + var1]) * 26 + this.e_byteArr[8749 + var1]];
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
      } catch (Exception var2) {
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
      byte var1 = this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + this.Q_byte] + this.Z_int];
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
         this.q_byte = this.a_byteArr[this.a_shortArr[249] + var1 - 25];
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
         this.a_obj_c.b_void(0);
         this.a_obj_c.b_void(1);
         this.Q_byte = 16;
      } else if (var1 == 6) {
         this.Q_byte = 28;
      } else if (var1 == 0) {
         this.R_byte = this.Q_byte;
         this.Q_byte = 2;
         this.aa_int = this.Z_int;
      } else if (var1 == 12) {
         this.q_byte = 0;
         this.R_byte = this.Q_byte;
         if (this.s_byte > -1) {
            this.Q_byte = 3;
         } else {
            this.Q_byte = 13;
            this.Z_int = 1;
         }

         this.aa_int = 0;
      } else if (var1 == 13) {
         this.aw();
      } else if (var1 == 10) {
         this.ax();
      } else if (var1 == 11) {
         this.Q_byte = 31;
      } else if (var1 == 9) {
         this.ay();
      } else if (var1 == 5) {
         this.R_byte = this.Q_byte;
         this.Q_byte = 30;
         this.aa_int = this.Z_int;
      } else if (var1 == 1) {
         this.az();
         this.a_byteArr[this.a_shortArr[153] + 116 + this.Q_byte] = 4;
         this.m_byte = 1;
         this.a_obj_c.a_void2(70);
      } else if (var1 == 3) {
         this.az();
         this.a_byteArr[this.a_shortArr[153] + 116 + this.Q_byte] = 2;
         this.m_byte = 0;
         this.a_obj_c.a_void2(74);
      } else if (var1 == 2) {
         this.R_byte = this.Q_byte;
         this.Q_byte = 12;
         this.aa_int = this.Z_int;
         this.Z_int = 1;
         this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + 12] + 1] = (byte)(17 + this.e_byte / 2);
         this.a_byteArr[this.a_shortArr[151] + this.a_byteArr[this.a_shortArr[152] + 12] + 3] = (byte)(17 + this.l_int);
      } else if (var1 == 4) {
         try {
            this.a_obj_tribes.platformRequest(this.a_obj_tribes.getAppProperty("GameUrl-" + this.a_obj_StringArr[a_byte]));
            Thread.yield();
         } catch (Exception var3) {
         }
      } else if (var1 == 7) {
         this.aA();
      } else if (var1 == 8) {
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
            this.a_obj_b.v_int = this.am_byte;
            this.a_obj_b.u_int = 0;
            if (this.a_obj_b.a_bool8(this.ap_byte == 14 ? 4 : 2)) {
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

            this.a_obj_c.a_void2(70 + this.m_byte);
            this.v_int = 71;
            this.m_byte++;
         } else if (this.R_bool && this.m_byte == 0) {
            try {
               this.a_obj_tribes.platformRequest("http://wap.prehistoric-games.com/");
               Thread.yield();
            } catch (Exception var2) {
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
         if (this.a_obj_a != null) {
            this.a_obj_a.a_void2(this.e_byte);
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
      this.a_obj_c.a_void2(75);
      this.v_int = 71;
      this.m_byte = -1;

      for (int var1 = 0; var1 < 2; var1++) {
         for (int var2 = 0; var2 < 5; var2++) {
            this.a_shortArr2[var1][24] = (short)(this.a_shortArr2[var1][24] + this.a_shortArr2[var1][19 + var2] * this.a_byteArr[this.a_shortArr[112] + var2] / 10);
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
   final void e_void4(int var1) {
      for (int var5 = 0; var5 < 5; var5++) {
         byte var6;
         if ((var6 = var5 < 4 ? this.a_byteArr[this.a_shortArr[125] + var5] : 4) != -1) {
            for (int var4 = 0; var4 < 50; var4++) {
               if (this.a_byteArr2[var6][var4] == var1) {
                  while (var4 < 50) {
                     this.a_byteArr2[var6][var4] = var4 < 49 ? this.a_byteArr2[var6][var4 + 1] : 0;
                     var4++;
                  }

                  if (this.a_byteArr2[var6][0] == 0 && this.F_byte == this.e_byteArr[909 + var1]) {
                     if (this.w_byte == 1) {
                        this.w_byte = 0;
                     }

                     this.F_byte = -1;
                  }

                  this.e_byteArr[909 + var1] = 0;
                  return;
               }
            }
         }
      }
   }

   // $VF: renamed from: aI () void
   private void aI() {
      for (int var1 = 0; var1 < 50; var1++) {
         if (this.a_byteArr2[4][var1] != 0) {
            this.e_byteArr[909 + this.a_byteArr2[4][var1]] = 0;
            this.a_byteArr2[4][var1] = 0;
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
   private static byte a_byte2(int var0) {
      if (var0 >= 1 && var0 <= 50) {
         return 0;
      } else {
         return (byte)(var0 >= 51 && var0 <= 100 ? 1 : 2);
      }
   }

   // $VF: renamed from: a (byte, byte, byte, byte, byte) byte
   final byte a_byte3(byte var1, byte var2, byte var3, byte var4, byte var5) {
      byte var7 = (byte)(1 + var1 * 50);
      byte var6 = 0;

      while (this.e_byteArr[1919 + var7 + var6] != 0) {
         var6++;
      }

      if (var6 >= 50) {
         return -1;
      } else {
         var6 = (byte)(var6 + var7);
         if (this.F_bool) {
            this.P_bool = true;
         }

         this.e_byteArr[0 + var6] = this.e_byteArr[6262 + var6] = this.e_byteArr[3131 + var6] = var2;
         this.e_byteArr[101 + var6] = this.e_byteArr[6363 + var6] = this.e_byteArr[3232 + var6] = var3;
         this.e_byteArr[202 + var6] = this.e_byteArr[303 + var6] = 0;
         this.e_byteArr[808 + var6] = 0;
         this.e_byteArr[909 + var6] = 0;
         this.e_byteArr[1111 + var6] = 0;
         this.e_byteArr[4949 + var6] = (byte)(4 + (var5 & 7));
         this.e_byteArr[606 + var6] = 3;
         this.e_byteArr[1313 + var6] = 0;
         this.e_byteArr[1414 + var6] = var4;
         this.e_byteArr[1616 + var6] = (byte)((var5 & 7) * 2 + this.a_int2(255, 2));
         this.e_byteArr[1717 + var6] = (byte)((var5 & 7) * 2 + this.a_int2(255, 2));
         this.e_byteArr[1818 + var6] = (byte)(3 + (var5 & 7));
         this.e_byteArr[2020 + var6] = (byte)(50 + 25 * (1 - var1) + this.a_int2(255, 25));
         this.e_byteArr[2121 + var6] = (byte)(50 + 25 * (1 - var1) + this.a_int2(255, 25));
         this.e_byteArr[505 + var6] = (byte)(50 + 25 * (1 - var1) + this.a_int2(255, 25));
         int var8 = (var5 & 32) != 0 ? 3 : 0;
         int var9 = this.a_int2(255, 3);
         int var10 = this.a_int2(255, 3);
         this.e_byteArr[6969 + var6] = (byte)(var9 == 0 ? 2 + this.a_int2(255, 2 + var8) : 1);
         this.e_byteArr[7070 + var6] = (byte)(var9 == 1 ? 2 + this.a_int2(255, 2 + var8) : 1);
         this.e_byteArr[7272 + var6] = (byte)(var9 == 2 ? 2 + this.a_int2(255, 2 + var8) : 1);
         this.e_byteArr[7171 + var6] = (byte)(var10 == 0 ? 2 + this.a_int2(255, 2 + var8) : 1);
         this.e_byteArr[7373 + var6] = (byte)(var10 == 1 ? 2 + var1 + this.a_int2(255, 2 + var8) : 1 + var1);
         this.e_byteArr[7474 + var6] = (byte)(var10 == 2 ? 2 + this.a_int2(255, 2 + var8) : 1);
         this.e_byteArr[7575 + var6] = (byte)(1 + (var5 >> 3 & 3) * 3 + this.a_int2(255, 3));
         this.e_byteArr[6464 + var6] = 69;
         this.e_byteArr[3434 + var6] = -1;
         this.e_byteArr[3535 + var6] = 0;
         this.e_byteArr[3636 + var6] = 0;
         this.e_byteArr[3737 + var6] = (byte)(2 + this.a_int2(255, 2));
         this.e_byteArr[3838 + var6] = var6;
         this.e_byteArr[4545 + var6] = 0;
         this.e_byteArr[4646 + var6] = -1;
         this.e_byteArr[4747 + var6] = var6;
         this.e_byteArr[4848 + var6] = 0;
         int var11 = 0;
         int var12 = 0;
         var11 = this.a_int2(255, 3);
         var12 = this.a_int2(15, 4);
         this.e_byteArr[5151 + var6] = (byte)(var12 << 2 | var11);
         if ((this.a_shortArr2[var1][12] <= this.a_shortArr2[var1][13] || this.aw_byte == 0) && this.aw_byte != 1) {
            this.e_byteArr[1515 + var6] = 0;
            this.a_shortArr2[var1][12]++;
         } else {
            this.e_byteArr[1515 + var6] = 1;
            this.a_shortArr2[var1][13]++;
         }

         if (var4 < 12) {
            this.e_byteArr[2828 + var6] = 17;
            this.e_byteArr[2929 + var6] = 14;
            this.e_byteArr[6767 + var6] = this.e_byteArr[1919 + var6] = (byte)(5 + this.a_int2(255, 10));
            this.e_byteArr[1010 + var6] = 8;
         } else {
            this.e_byteArr[2828 + var6] = 69;
            this.e_byteArr[2929 + var6] = 8;
            this.e_byteArr[6767 + var6] = this.e_byteArr[1919 + var6] = (byte)(
               (this.q_byte == 0 && var1 == 1 ? 20 : 40) + (this.e_byteArr[1515 + var6] - 1) * -10 + this.a_int2(255, 15)
            );
            this.e_byteArr[1010 + var6] = (byte)((var5 & 7) == 0 ? 8 : 9 - (var5 & 7));
         }

         this.e_byteArr[4444 + var6] = var6;
         this.e_byteArr[6565 + var6] = 9;
         if ((var5 & 64) != 0) {
            this.e_byteArr[6565 + var6] = (byte)this.a_int2(255, 4 + var1 * 2);
         }

         if (this.q_byte == 3) {
            this.e_byteArr[6565 + var6] = 0;
         }

         if ((this.q_byte == 4 || this.q_byte == 5) && this.e_byteArr[6565 + var6] == 1) {
            this.e_byteArr[6565 + var6] = 3;
         }

         this.e_byteArr[3333 + var6] = -1;
         this.e_byteArr[7979 + var6] = this.e_byteArr[8282 + var6] = 0;
         this.e_byteArr[8080 + var6] = 0;
         this.e_byteArr[2222 + var6] = this.e_byteArr[2323 + var6] = this.e_byteArr[2424 + var6] = this.e_byteArr[2525 + var6] = this.e_byteArr[2626 + var6] = 0;
         this.g_void2(var6);
         this.b_void6(var6);
         if (this.c_byteArr2[var3][var2] == 0) {
            this.c_byteArr2[var3][var2] = var6;
         }

         if (!this.s_bool) {
            this.a_shortArr2[var1][11]++;
            if (var1 == 0) {
               this.a_void19((byte)1, var2, var3, var6);
            }

            this.a_shortArr2[var1][19]++;
         }

         if (var1 == 0) {
            this.a_obj_b.a_void17(this.e_byteArr[0 + var6], this.e_byteArr[101 + var6], this.e_byteArr[4949 + var6]);
         }

         return var6;
      }
   }

   // $VF: renamed from: a (byte) void
   final void a_void14(byte var1) {
      byte var2 = (byte)((var1 - 1) / 50);
      int var3 = this.e_byteArr[0 + var1] + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + var1]];
      int var4 = this.e_byteArr[101 + var1] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + var1]];
      if ((this.e_byteArr[2929 + var1] & 255) <= 7
         && (this.e_byteArr[1111 + var1] & 15)
            < (this.a_byteArr[this.a_shortArr[15] + (this.e_byteArr[606 + var1] & 1) * 9 + this.e_byteArr[1010 + var1] - this.e_byteArr[7777 + var1]] + 1) / 2
         && this.c_byteArr2[var4][var3] == -128) {
         this.c_byteArr2[var4][var3] = (byte)(this.e_byteArr[4545 + var1] >= 111 ? -this.e_byteArr[4545 + var1] : 0);
      }

      this.e_void4(var1);
      this.f_void4(var1);
      this.e_byteArr[1919 + var1] = -1;
      this.c_void5(var1);
      if (this.F_bool || var1 == this.e_byteArr[8810 + this.q_int]) {
         this.P_bool = true;
      }

      if (!this.s_bool) {
         if (var2 == 0) {
            this.a_void19((byte)3, this.e_byteArr[0 + var1], this.e_byteArr[101 + var1], var1);
         }

         this.a_shortArr2[1 - var2][22]++;
      }
   }

   // $VF: renamed from: f (int, int) void
   private void f_void3(int var1, int var2) {
      this.J_byte = this.I_byte;
      this.L_byte = this.K_byte;
      if (var1 > 100) {
         this.I_byte = (byte)(this.e_byteArr[9359 + var1 - 101] - this.C_byte);
         this.K_byte = (byte)(this.e_byteArr[9381 + var1 - 101] - this.D_byte + var2);
      } else if (var1 > 0) {
         this.I_byte = (byte)(this.e_byteArr[0 + var1] - this.C_byte);
         this.K_byte = (byte)(this.e_byteArr[101 + var1] - this.D_byte + var2);
      } else if (var1 == -100) {
         this.I_byte = (byte)(this.I_byte - this.C_byte);
         this.K_byte = (byte)(this.K_byte - (this.D_byte - var2));
      } else {
         if (var1 >= 0) {
            return;
         }

         this.I_byte = (byte)(
            this.e_byteArr[8383 + -var1] + (this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + -var1]] >> 1) - this.C_byte
         );
         this.K_byte = (byte)(
            this.e_byteArr[8444 + -var1] + (this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + -var1]] >> 1) - this.D_byte + var2
         );
      }

      this.aK();
      this.A_bool = true;
   }

   // $VF: renamed from: b (int, int) void
   final void b_void5(int var1, int var2) {
      for (byte var3 = 1; var3 <= 50; var3++) {
         if (this.e_byteArr[1919 + var3] > 0) {
            this.c_byteArr2[this.e_byteArr[101 + var3]][this.e_byteArr[0 + var3]] = 0;
         }
      }

      for (byte var4 = 1; var4 <= 50; var4++) {
         if (this.e_byteArr[1919 + var4] > 0) {
            if (this.c_byteArr2[var2][var1] != 0) {
               this.a_obj_b.v_int = 0;
               this.a_obj_b.a_bool4(1, 127, var1, var2);
               var1 = this.e_byteArr[3131];
               var2 = this.e_byteArr[3232];
            }

            if ((this.e_byteArr[2929 + var4] & 255) <= 7
               && (this.e_byteArr[1111 + var4] & 15)
                  < (this.a_byteArr[this.a_shortArr[15] + (this.e_byteArr[606 + var4] & 1) * 9 + this.e_byteArr[1010 + var4] - this.e_byteArr[7777 + var4]] + 1)
                     / 2
               && this.c_byteArr2[this.e_byteArr[101 + var4] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + var4]]][this.e_byteArr[0 + var4]
                     + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + var4]]]
                  == -128) {
               this.c_byteArr2[this.e_byteArr[101 + var4] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + var4]]][this.e_byteArr[0 + var4]
                  + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + var4]]] = 0;
            }

            this.e_byteArr[0 + var4] = this.e_byteArr[6262 + var4] = this.e_byteArr[3131 + var4] = (byte)var1;
            this.e_byteArr[101 + var4] = this.e_byteArr[6363 + var4] = this.e_byteArr[3232 + var4] = (byte)var2;
            this.e_byteArr[202 + var4] = this.e_byteArr[303 + var4] = 0;
            this.e_byteArr[808 + var4] = 0;
            this.e_byteArr[2828 + var4] = 69;
            this.e_byteArr[2929 + var4] = 8;
            this.e_byteArr[3030 + var4] = 0;
            this.e_byteArr[6161 + var4] = 0;
            this.c_byteArr2[this.e_byteArr[101 + var4]][this.e_byteArr[0 + var4]] = var4;
            this.a_obj_b.a_void17(this.e_byteArr[0 + var4], this.e_byteArr[101 + var4], this.e_byteArr[4949 + var4]);
         }
      }
   }

   // $VF: renamed from: f (int) void
   final void f_void4(int var1) {
      if (this.k_byte == var1) {
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
   final void b_void6(byte var1) {
      int var2 = 2;
      if (var1 >= 51) {
         var2 = var1 == 51 ? 4 : 3;
      } else if (this.e_byteArr[1414 + var1] < 12) {
         var2 = 0;
      } else if (this.e_byteArr[1414 + var1] < 35) {
         var2 = 1;
      }

      this.e_byteArr[2727 + var1] = (byte)(
         this.a_byteArr[this.a_shortArr[189] + this.e_byteArr[1515 + var1] * 10 + var2 * 2]
            + this.a_int2(255, this.a_byteArr[this.a_shortArr[189] + this.e_byteArr[1515 + var1] * 10 + var2 * 2 + 1])
      );
      if (var1 == this.l_byte) {
         this.b_boolArr[4] = this.a_boolArr[4];
      }
   }

   // $VF: renamed from: g (int) void
   final void g_void2(int var1) {
      this.e_byteArr[6868 + var1] = var1 == 51 || var1 == 52
         ? -2
         : (var1 > 51 ? -1 : (byte)((var1 > 3 ? 1 + this.a_int2(65535, 58) : var1) % 60 + 60 * this.e_byteArr[1515 + var1] - 1));
   }

   // $VF: renamed from: b (int) byte
   private static byte b_byte2(int var0) {
      if (var0 <= -1 && var0 >= -30) {
         return 0;
      } else {
         return (byte)(var0 <= -31 && var0 >= -60 ? 1 : 2);
      }
   }

   // $VF: renamed from: a (byte, int, int, int, int, boolean, int) byte
   final byte a_byte4(byte var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      byte var8 = this.a_byteArr[this.a_shortArr[138] + 104 + var2];
      byte var9 = this.a_byteArr[this.a_shortArr[138] + 130 + var2];
      byte var11 = (byte)(1 + var1 * 30);
      byte var10 = 0;

      try {
         while (this.e_byteArr[8505 + var11 + var10] != 0) {
            var10++;
         }

         if (var10 >= 30) {
            if (var1 == 0) {
               this.s_int = 100;
               this.l_void2(-1);
               this.u_byteArr[0] = 0;
               this.a_void19((byte)10, (byte)0, (byte)0, (byte)0);
            }

            return -1;
         } else {
            var10 = (byte)(var10 + var11);
            if (var7 == -1) {
               if (!this.a_bool5(var2, var3, var4, !var6)) {
                  return -2;
               }
            } else {
               var10 = (byte)var7;
            }

            if (var2 >= 20 && var2 <= 22) {
               if (var7 == -1) {
                  var10 = 0;

                  while (var10 < 30 && this.f_byteArr2[0][var10] != 0) {
                     var10++;
                  }
               } else {
                  var10 = (byte)var7;
               }

               if (var10 == 30) {
                  return -1;
               } else {
                  this.f_byteArr2[0][var10] = (byte)this.q_int;
                  this.f_byteArr2[2][var10] = (byte)var3;
                  this.f_byteArr2[3][var10] = (byte)var4;
                  this.f_byteArr2[1][var10] = (byte)var2;
                  if (!var6) {
                     this.a_byteArr3[0][this.au_byte][6 + this.s_int - 20]++;
                     this.c_byteArr2[var4][var3] = (byte)(var1 == 0 ? -123 : -126);
                  } else {
                     this.c_byteArr2[var4][var3] = (byte)(20 - var2 - 111 - var1 * 6);
                  }

                  this.c_void7(var3, var4, 1, 1);
                  return var10;
               }
            } else {
               if (var2 == 0) {
                  byte var12 = 0;

                  while (this.a_byteArr3[var1][var12][11] != 0) {
                     if (++var12 > 10) {
                        return -1;
                     }
                  }

                  this.a_byteArr3[var1][var12][11] = var10;
               }

               this.c_void7(var3, var4, var8, var9);
               this.e_byteArr[8383 + var10] = (byte)var3;
               this.e_byteArr[8444 + var10] = (byte)var4;
               this.e_byteArr[8749 + var10] = (byte)var2;
               this.e_byteArr[8871 + var10] = 0;
               this.e_byteArr[9176 + var10] = 0;
               this.e_byteArr[8932 + var10] = 0;
               this.e_byteArr[8993 + var10] = 0;
               this.e_byteArr[9054 + var10] = 0;
               if (var5 == 0) {
                  var5 = this.a_byteArr[this.a_shortArr[113] + (this.q_byte < 2 ? 0 : (this.q_byte == 2 ? 12 : 24)) + var2];
               }

               this.e_byteArr[9115 + var10] = (byte)var5;
               this.e_byteArr[8810 + var10] = 0;
               this.e_byteArr[8688 + var10] = 5;
               this.e_byteArr[8627 + var10] = 0;
               this.e_byteArr[8505 + var10] = this.e_byteArr[8566 + var10] = this.a_byteArr[this.a_shortArr[138] + 182 + var2];
               if (var2 >= 12 && var2 <= 19) {
                  if (!this.a_obj_b.a_bool12(var10)) {
                     if (var1 == 0) {
                        this.s_int = 100;
                        this.l_void2(-1);
                        this.u_byteArr[0] = 0;
                        this.a_void19((byte)10, (byte)0, (byte)0, (byte)0);
                     }

                     this.e_byteArr[8505 + var10] = 0;
                     return -1;
                  }

                  this.e_byteArr[9237 + var10] = (byte)(var1 == 0 ? this.r_byteArr[this.as_byte] : this.a_obj_b.v_int);
                  this.e_byteArr[8566 + var10] = this.a_byteArr[this.a_shortArr[138] + 182 + this.e_byteArr[9237 + var10]];
                  this.e_byteArr[9115 + var10] = 3;
               } else if (var1 == 0) {
                  this.a_obj_b
                     .a_void17(
                        this.e_byteArr[8383 + var10] + this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + var10]] / 2,
                        this.e_byteArr[8444 + var10] + this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + var10]] / 2,
                        this.e_byteArr[8688 + var10] & 15
                     );
               }

               for (int var17 = 0; var17 < var9; var17++) {
                  for (int var13 = 0; var13 < var8; var13++) {
                     this.c_byteArr2[var4 + var17][var3 + var13] = (byte)(-var10);
                  }
               }

               if (var2 == 2) {
                  this.a_shortArr2[var1][16] = (short)(this.a_shortArr2[var1][16] + 4);
                  if (this.a_shortArr2[var1][16] > 50) {
                     this.a_shortArr2[var1][16] = 50;
                  }
               }

               if (!this.s_bool && var7 == -1) {
                  this.a_shortArr2[var1][14]++;
                  this.a_shortArr2[var1][20]++;
               }

               if (var2 == 2) {
                  this.a_obj_b.a_void10(var10);
               }

               if (var6 && var1 == 0) {
                  this.a_void19((byte)5, (byte)var3, (byte)var4, (byte)0);
               }

               return var10;
            }
         }
      } catch (Exception var14) {
         return -1;
      }
   }

   // $VF: renamed from: c (int, boolean) void
   final void c_void6(int var1, boolean var2) {
      byte var3 = this.e_byteArr[8749 + var1];
      byte var4 = this.e_byteArr[8383 + var1];
      byte var5 = this.e_byteArr[8444 + var1];
      byte var6 = this.a_byteArr[this.a_shortArr[138] + 104 + var3];
      byte var7 = this.a_byteArr[this.a_shortArr[138] + 130 + var3];
      int var8 = var1 < 31 ? 0 : 1;
      if (var3 == 2) {
         this.a_obj_b.a_void10(var1);
      }

      try {
         if (var2) {
            this.f_void3(var1 == 1 ? -1 : 0, 0);
            this.e_byteArr[8505 + var1] = -1;
            this.a_void6(var1, 3);

            for (byte var14 = this.e_byteArr[8993 + var1]; var14 > 0; var14 = this.e_byteArr[4545 + var14]) {
               this.a_void15(var14, var1, true, false);
            }

            if (this.e_byteArr[8810 + var1] > 1 && (this.e_byteArr[8749 + var1] != 2 || this.e_byteArr[8627 + var1] != 0)) {
               this.a_void15(this.e_byteArr[8810 + var1], var1, true, false);
            }

            if ((this.w_byte == 2 || this.w_byte == 4) && var1 == this.q_int) {
               this.w_byte = 0;
               this.q_int = 0;
               this.a_void17(true, true, false, false);
               return;
            }
         } else {
            this.e_byteArr[8505 + var1] = 0;
            this.e_byteArr[8627 + var1] = 3;

            for (int var9 = 0; var9 < var7; var9++) {
               for (int var10 = 0; var10 < var6; var10++) {
                  this.c_byteArr2[var5 + var9][var4 + var10] = 0;
               }
            }

            if (var3 == 2) {
               this.a_shortArr2[var8][16] = (short)(this.a_shortArr2[var8][16] - 4);
               if (this.a_shortArr2[var8][16] < 0) {
                  this.a_shortArr2[var8][16] = 1;
               }

               for (int var12 = var8 * 50 + 1; var12 <= (var8 + 1) * 50; var12++) {
                  if (this.e_byteArr[3434 + var12] == var1) {
                     this.e_byteArr[3434 + var12] = 0;
                  }
               }
            }

            if (!this.s_bool) {
               this.a_shortArr2[var8][14]--;
               this.a_shortArr2[1 - var8][21]++;
            }

            if (var3 == 0) {
               byte var13 = 0;

               while (this.a_byteArr3[var8][var13][11] != var1) {
                  if (++var13 >= 10) {
                     var13--;
                     break;
                  }
               }

               this.a_byteArr3[var8][var13][11] = 0;
            }

            this.a_obj_b.c_void6(var1);
            if (var8 == 0) {
               this.a_void19((byte)8, (byte)var4, (byte)var5, (byte)0);
            }
         }
      } catch (Exception var11) {
      }
   }

   // $VF: renamed from: a (int, int, int, boolean) boolean
   private boolean a_bool5(int var1, int var2, int var3, boolean var4) {
      byte var5 = this.a_byteArr[this.a_shortArr[138] + 104 + var1];
      byte var6 = this.a_byteArr[this.a_shortArr[138] + 130 + var1];
      boolean var7 = true;

      for (int var8 = 0; var8 < var6; var8++) {
         for (int var9 = 0; var9 < var5; var9++) {
            if (!this.b_bool4(var2 + var9, var3 + var8)
               || this.c_byteArr2[var3 + var8][var2 + var9] != 0
               || var4 && this.a_byte6(var2 + var9, var3 + var8) != 0) {
               var7 = false;
            }
         }
      }

      return var7;
   }

   // $VF: renamed from: a (int, int, boolean, boolean) void
   private void a_void15(int var1, int var2, boolean var3, boolean var4) {
      if (this.e_byteArr[2828 + var1] == 93 || this.e_byteArr[2828 + var1] == 92 || this.e_byteArr[2828 + var1] == 106) {
         var3 = true;
      }

      if (this.e_byteArr[8810 + var2] != var1 || this.e_byteArr[8749 + var2] == 2 && this.e_byteArr[8627 + var2] == 0) {
         if (!var3
            || this.e_byteArr[8627 + var2] == 0
               && (this.e_byteArr[8749 + var2] == 2 || this.e_byteArr[8749 + var2] == 7 || this.e_byteArr[8749 + var2] == 4 || this.e_byteArr[8749 + var2] == 8)
            )
          {
            this.e_byteArr[2828 + var1] = 87;
            this.e_byteArr[6161 + var1] = 3;
            return;
         }

         this.e_byteArr[6161 + var1] = 2;
      } else {
         if (var3) {
            this.e_byteArr[8810 + var2] = 0;
         }

         label42: {
            this.d_void5(var2);
            if (this.c_byteArr2[this.e_byteArr[101 + var1]][this.e_byteArr[0 + var1]] != var1) {
               if (var3) {
                  this.e_byteArr[6161 + var1] = 2;
                  break label42;
               }

               this.e_byteArr[2828 + var1] = 87;
            } else {
               this.e_byteArr[3131 + var1] = this.e_byteArr[0 + var1];
               this.e_byteArr[3232 + var1] = this.e_byteArr[101 + var1];
               if (var3) {
                  this.e_byteArr[6262 + var1] = this.e_byteArr[0 + var1];
                  this.e_byteArr[6363 + var1] = this.e_byteArr[101 + var1];
               }

               this.e_byteArr[2828 + var1] = 69;
               if (var3) {
                  this.e_byteArr[6161 + var1] = 2;
                  this.e_byteArr[4747 + var1] = 0;
                  break label42;
               }
            }

            this.e_byteArr[6161 + var1] = 3;
         }

         if (var4) {
            this.a_void13(var2, false);
            return;
         }
      }
   }

   // $VF: renamed from: h (int) void
   final void h_void2(int var1) {
      this.f_void4(var1);
      this.e_void4(var1);
   }

   // $VF: renamed from: a (int, byte) byte
   final byte a_byte5(int var1, byte var2) {
      byte var4 = 1;
      byte var5 = 0;
      if (var1 >= 51) {
         var4 = 31;
         var5 = 1;
      }

      while (var4 < 30) {
         if (this.e_byteArr[8810 + var4 + 0] == var1) {
            var4 = (byte)(var4 + 0);
            break;
         }

         var4++;
      }

      byte var3;
      for (var3 = 0; var3 < 30; var3++) {
         if (this.b_byteArr3[var5][0][var3] == var4) {
            this.b_byteArr3[var5][4][var3] = var2;
            break;
         }
      }

      return var3;
   }

   // $VF: renamed from: b (int) boolean
   private static boolean b_bool3(int var0) {
      return var0 >= 101 && var0 <= 122;
   }

   // $VF: renamed from: b (int, int, int, int) void
   final void b_void7(int var1, int var2, int var3, int var4) {
      byte var5;
      for (var5 = 0; var5 < 22; var5++) {
         if (this.e_byteArr[9513 + var5] == 0) {
            if (this.q_byte != 3) {
               this.t_byteArr[var4]++;
            }
            break;
         }
      }

      this.e_byteArr[9513 + var5] = this.a_byteArr[this.a_shortArr[180] + var1];
      this.e_byteArr[9535 + var5] = (byte)var1;
      this.e_byteArr[9359 + var5] = this.e_byteArr[9645 + var5] = (byte)var2;
      this.e_byteArr[9381 + var5] = this.e_byteArr[9667 + var5] = (byte)var3;
      this.e_byteArr[9403 + var5] = this.e_byteArr[9425 + var5] = 0;
      this.e_byteArr[9711 + var5] = this.e_byteArr[9689 + var5] = 0;
      this.e_byteArr[9601 + var5] = 0;
      this.e_byteArr[9491 + var5] = (byte)this.a_int2(255, 8);
      this.e_byteArr[9469 + var5] = (byte)var4;
      this.e_byteArr[9557 + var5] = this.a_byteArr[this.a_shortArr[184] + var1];
      this.e_byteArr[9579 + var5] = 0;
      this.e_byteArr[9447 + var5] = 0;
      this.c_byteArr2[var3][var2] = (byte)(101 + var5);
   }

   // $VF: renamed from: c (int) boolean
   private static boolean c_bool3(int var0) {
      return var0 <= -61 && var0 >= -110;
   }

   // $VF: renamed from: a (int, int, int, byte) void
   final void a_void16(int var1, int var2, int var3, byte var4) {
      byte var5 = 0;

      while (var5 < 50 && this.e_byteArr[9833 + var5] != 0) {
         var5++;
      }

      if (var5 == 50) {
         var5 = 0;

         while (this.e_byteArr[9833 + var5] != 6 || this.e_byteArr[9833 + var5] != 7) {
            var5++;
         }

         this.c_byteArr2[this.e_byteArr[9783 + var5]][this.e_byteArr[9733 + var5]] = 0;
      }

      this.e_byteArr[9833 + var5] = (byte)var1;
      this.e_byteArr[9733 + var5] = (byte)var2;
      this.e_byteArr[9783 + var5] = (byte)var3;
      this.e_byteArr[9883 + var5] = var4;
      this.c_byteArr2[var3][var2] = (byte)(-61 - var5);
   }

   // $VF: renamed from: c (int) byte
   private static byte c_byte2(int var0) {
      if (var0 <= -111 && var0 >= -116) {
         return 0;
      } else if (var0 <= -117 && var0 >= -122) {
         return 1;
      } else {
         return (byte)(var0 == -123 ? 3 : 2);
      }
   }

   // $VF: renamed from: b (int, int) boolean
   private boolean b_bool4(int var1, int var2) {
      return var1 >= 0 && var2 >= 0 && var1 < this.c_short && var2 < this.d_short;
   }

   // $VF: renamed from: a (int, int) byte
   private byte a_byte6(int var1, int var2) {
      if ((this.a_intArr3[0][var1 >> 5][var2] >> var1 & 31 & 1) == 0) {
         return 2;
      } else {
         return (byte)((this.a_intArr3[1][var1 >> 5][var2] >> var1 & 31 & 1) == 0 ? 1 : 0);
      }
   }

   // $VF: renamed from: c (int, int, int, int) void
   final void c_void7(int var1, int var2, int var3, int var4) {
      for (int var5 = var2; var5 < var2 + var4; var5++) {
         for (int var6 = var1; var6 < var1 + var3; var6++) {
            if (this.a_bool3(var6, var5)) {
               this.a_boolArr2[var5 - this.K_byte][var6 - this.I_byte] = true;
            }
         }
      }

      this.B_bool = true;
   }

   // $VF: renamed from: a (boolean, boolean, boolean, boolean) void
   private void a_void17(boolean var1, boolean var2, boolean var3, boolean var4) {
      this.a_void18(var1, var2, var3, var4, false, false, false, false, false);
   }

   // $VF: renamed from: a (boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean) void
   private void a_void18(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      this.b_boolArr[0] = this.a_boolArr[0] = var1;
      this.b_boolArr[1] = this.a_boolArr[1] = var2;
      this.b_boolArr[2] = this.a_boolArr[2] = var3;
      this.b_boolArr[4] = this.a_boolArr[4] = var4;
      this.b_boolArr[5] = this.a_boolArr[5] = var5;
      this.b_boolArr[6] = this.a_boolArr[6] = var6;
      this.b_boolArr[7] = this.a_boolArr[7] = var7;
      this.b_boolArr[8] = this.a_boolArr[8] = var8;
      this.b_boolArr[9] = this.a_boolArr[9] = var9;
      this.b_boolArr[17] = this.a_boolArr[17] = true;
      if (var2) {
         if (this.u_byteArr[0] == 0) {
            this.b_boolArr[1] = this.a_boolArr[1] = true;
            this.b_boolArr[9] = this.a_boolArr[9] = false;
         } else if (this.u_byteArr[0] != 0) {
            this.b_boolArr[9] = this.a_boolArr[9] = true;
            this.b_boolArr[1] = this.a_boolArr[1] = false;
         }
      }

      int var10 = this.ba;
      if (this.a_boolArr[4]) {
         this.ba = 48;
         this.ax_byte = this.d_byteArr[3];
      } else {
         this.ba = 22;
         this.ax_byte = this.d_byteArr[2];
      }

      if (var10 < this.ba && this.ae_int == 0 && this.K_byte < this.d_short - 1) {
         this.ae_int = 1;
         this.K_byte++;
         this.A_byte--;
         if (this.K_byte < this.d_short - 1) {
            this.K_byte++;
            this.A_byte--;
            this.A_bool = true;
         }
      } else if (var10 > this.ba && !var4 && this.ae_int == 0 && this.K_byte > 0) {
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
      byte var11 = this.P_byte;
      this.P_byte = (byte)((239 - this.ba - this.aZ + this.ax_byte) / 16 + 1);
      if (this.P_byte > var11) {
         this.C_bool = true;
      }

      this.A_int = this.P_byte * 16;
      this.c_intArr[2] = this.c_intArr[3] = this.A_int;
      this.c_intArr[4] = this.c_intArr[5] = this.c_intArr[7] = this.c_intArr[10] = this.A_int + this.ba;
      this.c_intArr[11] = this.c_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + this.ad_byte]]
         + this.b_intArr[this.a_byteArr[this.a_shortArr[195] + 0 + this.ad_byte]];
   }

   // $VF: renamed from: a (byte, byte, byte, byte) void
   final void a_void19(byte var1, byte var2, byte var3, byte var4) {
      if (this.c_int != 0 && this.u_byte <= 0) {
         boolean var5 = false;
         if (var1 != 100) {
            var5 = true;

            for (int var6 = 0; var6 < 10; var6++) {
               if (this.u_byteArr[var6] == 0) {
                  this.u_byteArr[var6] = var1;
                  this.k_byteArr2[0][var6] = var2;
                  this.k_byteArr2[1][var6] = var3;
                  this.k_byteArr2[2][var6] = var4;
                  this.g_intArr[var6] = 0;
                  break;
               }
            }
         } else if (this.u_byteArr[0] != 0) {
            boolean var8 = false;
            var5 = true;
            this.ay_byte = 0;

            for (int var7 = 0; var7 < 9; var7++) {
               this.g_intArr[var7]++;
            }

            if (this.u_byteArr[1] != 0) {
               if (this.g_intArr[0] > 1) {
                  var8 = true;
               }
            } else if (this.g_intArr[0] > 4) {
               var8 = true;
            }

            if (var8) {
               for (int var9 = 0; var9 < 9; var9++) {
                  this.u_byteArr[var9] = this.u_byteArr[var9 + 1];
                  this.k_byteArr2[0][var9] = this.k_byteArr2[0][var9 + 1];
                  this.k_byteArr2[1][var9] = this.k_byteArr2[1][var9 + 1];
                  this.k_byteArr2[2][var9] = this.k_byteArr2[2][var9 + 1];
                  this.g_intArr[var9] = this.g_intArr[var9 + 1];
                  this.u_byteArr[var9 + 1] = 0;
               }

               if (this.u_byteArr[0] != 0 && this.u_byteArr[1] == 0) {
                  this.g_intArr[0] = 0;
               }
            }
         }

         if (var5 && (this.a_boolArr[1] || this.a_boolArr[9])) {
            this.a_void17(this.a_boolArr[0], true, false, this.a_boolArr[4]);
            this.ay_byte = (byte)(this.k_byteArr2[0][0] == 0 && this.k_byteArr2[1][0] == 0 ? 0 : 1);
         }
      }
   }

   // $VF: renamed from: g (byte) void
   private void g_void3(byte var1) {
      try {
         this.q_byte = var1;
         this.aM();
         this.aN();
         this.aO();
      } catch (Exception var3) {
      }
   }

   // $VF: renamed from: aM () void
   private void aM() {
      this.u_bool = false;
      this.t_bool = false;
      this.F_byte = -1;

      for (int var1 = 0; var1 < this.b_shortArr[121]; var1++) {
         this.e_byteArr[var1] = 0;
      }

      for (int var3 = 0; var3 <= 100; var3++) {
         this.e_byteArr[4040 + var3] = -100;
         this.e_byteArr[4242 + var3] = 1;
         this.e_byteArr[4343 + var3] = -1;
      }

      for (int var4 = 0; var4 < 50; var4++) {
         this.a_byteArr2[2][var4] = this.a_byteArr2[3][var4] = this.a_byteArr2[4][var4] = 0;
      }

      for (int var5 = 0; var5 < 10; var5++) {
         this.u_byteArr[var5] = 0;
      }

      for (int var6 = 0; var6 < 5; var6++) {
         this.c_byteArr3[0][var6][2] = -1;
      }

      for (byte var7 = 0; var7 < 30; var7++) {
         this.e_byteArr2[0][var7] = 0;
      }

      for (byte var8 = 0; var8 < 3; var8++) {
         for (byte var2 = 0; var2 < 96; var2++) {
            this.a_intArr3[0][var8][var2] = 0;
         }
      }

      for (byte var9 = 0; var9 < 10; var9++) {
         for (byte var14 = 0; var14 < 12; var14++) {
            this.a_byteArr3[0][var9][var14] = 0;
            this.a_byteArr3[1][var9][var14] = 0;
         }
      }

      for (byte var10 = 0; var10 < 30; var10++) {
         for (byte var15 = 0; var15 < 4; var15++) {
            this.f_byteArr2[var15][var10] = 0;
         }

         for (byte var16 = 0; var16 < 5; var16++) {
            this.b_byteArr3[0][var16][var10] = this.b_byteArr3[1][var16][var10] = 0;
         }
      }

      for (int var11 = 0; var11 < 96; var11++) {
         for (int var17 = 0; var17 < 96; var17++) {
            this.c_byteArr2[var11][var17] = this.b_byteArr2[var11][var17] = 0;
         }
      }

      for (int var12 = 0; var12 < this.P_byte + 3; var12++) {
         for (int var18 = 0; var18 < this.O_byte; var18++) {
            this.g_byteArr2[var12][var18] = 0;
         }
      }

      if (!this.s_bool) {
         for (byte var13 = 0; var13 < 26; var13++) {
            this.a_shortArr2[0][var13] = this.a_shortArr2[1][var13] = 0;
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
      this.a_obj_b.a_void2();
      this.i_void();
      this.k_bool = true;
   }

   // $VF: renamed from: aN () void
   private void aN() {
      int var1 = 0;

      try {
         System.gc();
         Thread.yield();
         Object var4 = null;
         int var5 = 0;
         this.c_short = this.e_short = this.a_byteArr[this.a_shortArr[149] + this.q_byte * 2];
         this.d_short = this.f_short = this.a_byteArr[this.a_shortArr[149] + this.q_byte * 2 + 1];
         if (this.q_byte == 0) {
            this.c_short = 40;
            this.d_short = 32;
         } else if (this.q_byte == 5) {
            this.c_short = (short)(this.c_short - 32);
         }

         int var8 = 0;
         int var7 = 10;

         for (int var3 = 0; var3 < this.f_short; var3++) {
            for (int var2 = 0; var2 < this.e_short; var2++) {
               if (var7 >= this.a_byteArr[this.a_shortArr[197] + 0 + var8]) {
                  var1 = (short)(this.v_byteArr[this.h_intArr[this.a_byteArr[this.a_shortArr[248] + this.q_byte]] + var5] & 255);
                  var5++;
                  if (var1 >= 250) {
                     var7 = 0;
                     var8 = var1 - 250;
                     var1 = this.a_byteArr[this.a_shortArr[197] + 6 + var8] & 255;
                  }
               }

               var7++;
               int var6 = var1;
               if (var1 <= 8) {
                  var6 = var1 + this.a_int2(3, 3);
               }

               this.b_byteArr2[var3][var2] = (byte)var6;
               int var9 = (this.b_shortArr2[9][var6] & '\uffff') >> 13 & 1;
               if ((var6 >= 175 || var9 == 1) && this.c_byteArr2[var3][var2] != -127) {
                  this.c_byteArr2[var3][var2] = -126;
               } else if (this.c_byteArr2[var3][var2] == -126) {
                  this.c_byteArr2[var3][var2] = 0;
               }

               if (this.q_byte != 3) {
                  if (((this.j_byteArr2[16][var6] & '\uffff') >> 6 & 3) == 2) {
                     this.c_byteArr2[var3][var2] = -125;
                  }

                  if (var6 >= 180 && var6 <= 231) {
                     this.c_byteArr2[var3][var2] = -124;
                  } else if (var6 >= 175 && var6 <= 179) {
                     this.a_void16(var6 - 175 + 1, var2, var3, this.a_byteArr[this.a_shortArr[110] + var6 - 175 + 1]);
                  }
               }

               if (var3 == 0 || var3 == this.f_short - 1 || var2 == this.e_short - 1) {
                  this.c_byteArr2[var3][var2] = -126;
               }
            }
         }

         for (int var13 = 0; var13 < this.d_short; var13++) {
            for (int var12 = 1; var12 < this.c_short - 1; var12++) {
               if (c_bool3(this.c_byteArr2[var13][var12]) && this.e_byteArr[9833 + (this.c_byteArr2[var13][var12] + 61) * -1] == 5) {
                  byte var14;
                  if ((var14 = this.b_byteArr2[var13][var12 - 1]) == 33 || var14 == 34 || var14 == 37 || var14 == 38) {
                     this.c_byteArr2[var13][var12 - 1] = -127;
                  }

                  if ((var14 = this.b_byteArr2[var13][var12 + 1]) == 33 || var14 == 34 || var14 == 37 || var14 == 38) {
                     this.c_byteArr2[var13][var12 + 1] = -127;
                  }
               }
            }
         }
      } catch (Exception var11) {
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
      this.a_obj_b.d_void2();
   }

   // $VF: renamed from: aP () void
   private void aP() {
      if (this.q_byte == 3) {
         this.aw_byte = 0;
      }

      short var1 = this.a_shortArr[250 + this.q_byte];
      byte var2 = this.a_byteArr[this.a_shortArr[262] + this.q_byte];

      for (byte var3 = 0; var3 < var2; var3++) {
         if (this.a_byteArr[var1 + 0 * var2 + var3] != -1) {
            if (this.a_byteArr[var1 + 1 * var2 + var3] >= 0) {
               this.a_byte4(
                  this.a_byteArr[var1 + 0 * var2 + var3],
                  this.a_byteArr[var1 + 1 * var2 + var3],
                  this.a_byteArr[var1 + 2 * var2 + var3],
                  this.a_byteArr[var1 + 3 * var2 + var3],
                  this.a_byteArr[var1 + 4 * var2 + var3],
                  true,
                  -1
               );
            } else if (this.a_byteArr[var1 + 1 * var2 + var3] == -1) {
               this.a_byte3(
                  (byte)(this.a_byteArr[var1 + 0 * var2 + var3] & 1),
                  this.a_byteArr[var1 + 2 * var2 + var3],
                  this.a_byteArr[var1 + 3 * var2 + var3],
                  this.a_byteArr[var1 + 4 * var2 + var3],
                  (byte)((this.a_byteArr[var1 + 0 * var2 + var3] >> 1) + ((this.a_byteArr[var1 + 0 * var2 + var3] & 1) != 0 ? this.b_byte : 0))
               );
            } else if (this.a_byteArr[var1 + 1 * var2 + var3] == -2) {
               this.b_void7(1, this.a_byteArr[var1 + 2 * var2 + var3], this.a_byteArr[var1 + 3 * var2 + var3], this.a_byteArr[var1 + 0 * var2 + var3]);
            }

            if (var3 <= 10 && this.q_byte != 1 && this.q_byte != 6) {
               this.a_shortArr2[0][var3] = this.a_byteArr[this.a_shortArr[263] + 11 * this.q_byte * 2 + var3];
               this.a_shortArr2[1][var3] = (short)(this.a_byteArr[this.a_shortArr[263] + 11 * (this.q_byte * 2 + 1) + var3] * 20);
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
   static boolean a_bool6(Graphics var0, Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         var0.drawRegion(var1, var2, var3, var4, var5, 0, var6, var7, var8);
         return true;
      } catch (Exception var10) {
         return false;
      }
   }

   // $VF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void b_void8(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.fillRect(0 + var1, 0 + var2, var3, var4 + 0);
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   static void a_void20(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawRect(var1, var2, var3, var4);
   }

   // $VF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void c_void8(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setClip(var1, var2, var3, var4);
   }

   // $VF: renamed from: d (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void d_void6(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawLine(var1, var2, var3, var4);
   }

   // $VF: renamed from: d (int) boolean
   private boolean d_bool2(int var1) {
      boolean var2 = false;

      try {
         System.gc();
         Thread.yield();
         RecordStore var4;
         if ((var4 = RecordStore.openRecordStore(this.b_obj_String + var1, true)).getNumRecords() <= 0) {
            var4.closeRecordStore();
            return false;
         } else {
            DataInputStream var3 = new DataInputStream(new ByteArrayInputStream(var4.getRecord(1)));

            try {
               if (var1 == 0) {
                  this.l_int = var3.readInt();
                  this.W_bool = var3.readBoolean();
                  this.r_byte = var3.readByte();
                  this.V_byte = (byte)(4 + this.r_byte);
                  this.s_byte = var3.readByte();
                  this.t_byte = var3.readByte();
                  this.c_byte = var3.readByte();
                  this.p_byte = var3.readByte();
               } else {
                  this.q_byte = var3.readByte();
                  this.aM();
                  this.p_byte = var3.readByte();
                  this.d_byte = var3.readByte();
                  if (var1 == 2) {
                     this.b_byte = this.d_byte;
                  }

                  this.aN();
                  var3.read(this.e_byteArr);
                  var3.read(this.q_byteArr);
                  var3.read(this.a_byteArr2[0]);
                  var3.read(this.a_byteArr2[1]);
                  var3.read(this.a_byteArr2[2]);
                  var3.read(this.a_byteArr2[3]);

                  for (int var5 = 0; var5 < 26; var5++) {
                     this.a_shortArr2[0][var5] = var3.readShort();
                     this.a_shortArr2[1][var5] = var3.readShort();
                  }

                  var3.read(this.e_byteArr2[0]);
                  var3.read(this.e_byteArr2[1]);
                  var3.read(this.e_byteArr2[2]);

                  for (int var12 = 0; var12 < 10; var12++) {
                     for (int var6 = 0; var6 < 12; var6++) {
                        this.a_byteArr3[0][var12][var6] = var3.readByte();
                        this.a_byteArr3[1][var12][var6] = var3.readByte();
                     }
                  }

                  var3.read(this.f_byteArr2[0]);
                  var3.read(this.f_byteArr2[1]);
                  var3.read(this.f_byteArr2[2]);
                  var3.read(this.f_byteArr2[3]);

                  for (int var13 = 0; var13 < 5; var13++) {
                     var3.read(this.b_byteArr3[0][var13]);
                     var3.read(this.b_byteArr3[1][var13]);
                     var3.read(this.c_byteArr3[0][var13]);
                     var3.read(this.c_byteArr3[1][var13]);
                  }

                  this.aq_byte = var3.readByte();
                  this.y_byte = this.z_byte = var3.readByte();
                  this.A_byte = this.B_byte = var3.readByte();
                  this.I_byte = this.J_byte = var3.readByte();
                  this.K_byte = this.L_byte = var3.readByte();
                  this.h_byte = var3.readByte();
                  this.ai_byte = var3.readByte();
                  this.c_int = var3.readInt();
                  this.L_bool = var3.readBoolean();
                  this.N_bool = var3.readBoolean();

                  for (int var14 = 0; var14 < 3; var14++) {
                     for (int var21 = 0; var21 < 96; var21++) {
                        this.a_intArr3[0][var14][var21] = var3.readInt();
                     }
                  }

                  var3.read(this.a_obj_b.c_byteArr2[0]);
                  var3.read(this.a_obj_b.c_byteArr2[1]);
                  var3.read(this.a_obj_b.c_byteArr2[2]);
                  var3.read(this.a_obj_b.c_byteArr2[3]);
                  var3.read(this.a_obj_b.c_byteArr2[4]);
                  var3.read(this.a_obj_b.c_byteArr2[5]);
                  this.a_obj_b.f_byte = var3.readByte();
                  this.a_obj_b.K_byte = var3.readByte();
                  this.a_obj_b.R_byte = var3.readByte();
                  this.a_obj_b.L_byte = var3.readByte();
                  this.a_obj_b.aQ = var3.readInt();
                  var3.read(this.a_obj_b.f_byteArr2[0]);
                  var3.read(this.a_obj_b.f_byteArr2[1]);
                  var3.read(this.a_obj_b.g_byteArr2[0]);
                  var3.read(this.a_obj_b.g_byteArr2[1]);
                  var3.read(this.a_obj_b.g_byteArr2[2]);
                  var3.read(this.a_obj_b.j_byteArr);
                  this.a_obj_b.N_byte = var3.readByte();
                  this.a_obj_b.O_byte = var3.readByte();
                  this.a_obj_b.g_byte = var3.readByte();
                  this.a_obj_b.J_byte = var3.readByte();
                  this.a_obj_b.I_byte = var3.readByte();
                  var3.read(this.t_byteArr);
                  int var7 = -111;

                  while (var7 >= -122) {
                     byte var15;
                     if ((var15 = var3.readByte()) == 127) {
                        var7--;
                     } else {
                        byte var22 = var3.readByte();
                        this.c_byteArr2[var22][var15] = (byte)var7;
                     }
                  }

                  for (int var16 = 0; var16 < 30; var16++) {
                     if (this.f_byteArr2[0][var16] != 0) {
                        this.c_byteArr2[this.f_byteArr2[3][var16]][this.f_byteArr2[2][var16]] = (byte)(this.f_byteArr2[0][var16] <= 30 ? -123 : -126);
                     }
                  }

                  for (int var17 = 0; var17 < 50; var17++) {
                     if (this.e_byteArr[9833 + var17] >= 6) {
                        this.c_byteArr2[this.e_byteArr[9783 + var17]][this.e_byteArr[9733 + var17]] = (byte)(-61 - var17);
                     }
                  }

                  for (int var18 = 1; var18 <= 100; var18++) {
                     if (this.e_byteArr[1919 + var18] != 0) {
                        this.e_byteArr[808 + var18] = 0;
                        if (this.e_byteArr[4646 + var18] < 0) {
                           this.c_byteArr2[this.e_byteArr[101 + var18]][this.e_byteArr[0 + var18]] = (byte)var18;
                           if ((this.e_byteArr[2929 + var18] & 255) <= 7
                              && (this.e_byteArr[1111 + var18] & 15)
                                 < (
                                       this.a_byteArr[this.a_shortArr[15]
                                             + (this.e_byteArr[606 + var18] & 1) * 9
                                             + this.e_byteArr[1010 + var18]
                                             - this.e_byteArr[7777 + var18]]
                                          + 1
                                    )
                                    / 2
                              && this.c_byteArr2[this.e_byteArr[101 + var18] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + var18]]][this.e_byteArr[0
                                       + var18]
                                    + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + var18]]]
                                 == 0) {
                              this.c_byteArr2[this.e_byteArr[101 + var18] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[606 + var18]]][this.e_byteArr[0
                                    + var18]
                                 + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[606 + var18]]] = -128;
                           }
                        }
                     }
                  }

                  for (int var19 = 0; var19 < 22; var19++) {
                     this.e_byteArr[9689 + var19] = 0;
                     if (this.e_byteArr[9513 + var19] != 0) {
                        this.c_byteArr2[this.e_byteArr[9381 + var19]][this.e_byteArr[9359 + var19]] = (byte)(101 + var19);
                        if ((this.e_byteArr[9557 + var19] & 255) <= 7
                           && (this.e_byteArr[9623 + var19] & 15)
                              < (
                                    this.a_byteArr[this.a_shortArr[15]
                                          + (this.e_byteArr[9491 + var19] & 1) * 9
                                          + this.a_byteArr[this.a_shortArr[179] + this.e_byteArr[9535 + var19]]]
                                       + 1
                                 )
                                 / 2
                           && this.c_byteArr2[this.e_byteArr[9381 + var19] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[9491 + var19]]][this.e_byteArr[9359
                                    + var19]
                                 + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[9491 + var19]]]
                              == 0) {
                           this.c_byteArr2[this.e_byteArr[9381 + var19] + this.a_byteArr[this.a_shortArr[1] + 8 + this.e_byteArr[9491 + var19]]][this.e_byteArr[9359
                                 + var19]
                              + this.a_byteArr[this.a_shortArr[1] + this.e_byteArr[9491 + var19]]] = -128;
                        }
                     }
                  }

                  for (int var20 = 1; var20 <= 60; var20++) {
                     if (this.e_byteArr[8505 + var20] != 0) {
                        for (int var8 = 0; var8 < this.a_byteArr[this.a_shortArr[138] + 130 + this.e_byteArr[8749 + var20]]; var8++) {
                           for (int var9 = 0; var9 < this.a_byteArr[this.a_shortArr[138] + 104 + this.e_byteArr[8749 + var20]]; var9++) {
                              this.c_byteArr2[this.e_byteArr[8444 + var20] + var8][this.e_byteArr[8383 + var20] + var9] = (byte)(-var20);
                           }
                        }
                     }
                  }

                  this.a_obj_b.n_void2();
                  this.a_obj_b.j_void2();
                  this.a_obj_b.d_void2();
                  this.aK();
                  this.J_byte = this.I_byte;
                  this.L_byte = this.K_byte;
               }

               var2 = true;
            } catch (Exception var10) {
            }

            var3.close();
            var4.closeRecordStore();
            if (!var2) {
               RecordStore.deleteRecordStore(this.b_obj_String + var1);
               this.d_bool2(var1);
            }

            return var2;
         }
      } catch (Exception var11) {
         return false;
      }
   }

   // $VF: renamed from: e (int) boolean
   private boolean e_bool2(int var1) {
      boolean var2 = false;

      try {
         RecordStore var3 = null;
         ByteArrayOutputStream var4 = null;
         DataOutputStream var5 = null;

         try {
            RecordStore.deleteRecordStore(this.b_obj_String + var1);
            var3 = RecordStore.openRecordStore(this.b_obj_String + var1, true);
            var4 = new ByteArrayOutputStream();
            var5 = new DataOutputStream(var4);
            if (var1 == 0) {
               var5.writeInt(this.l_int);
               var5.writeBoolean(this.W_bool);
               var5.writeByte(this.r_byte);
               var5.writeByte(this.s_byte);
               var5.writeByte(this.t_byte);
               var5.writeByte(this.c_byte);
               var5.writeByte(this.p_byte);
            } else {
               if (var1 == 2) {
                  this.W_bool = true;
               } else if (var1 == 1) {
                  this.t_byte = this.a_byteArr[this.a_shortArr[248] + this.q_byte];
               }

               var5.writeByte(this.q_byte);
               var5.writeByte(this.p_byte);
               var5.writeByte(this.d_byte);
               var5.write(this.e_byteArr);
               var5.write(this.q_byteArr);
               var5.write(this.a_byteArr2[0]);
               var5.write(this.a_byteArr2[1]);
               var5.write(this.a_byteArr2[2]);
               var5.write(this.a_byteArr2[3]);

               for (int var6 = 0; var6 < 26; var6++) {
                  var5.writeShort(this.a_shortArr2[0][var6]);
                  var5.writeShort(this.a_shortArr2[1][var6]);
               }

               var5.write(this.e_byteArr2[0]);
               var5.write(this.e_byteArr2[1]);
               var5.write(this.e_byteArr2[2]);

               for (int var11 = 0; var11 < 10; var11++) {
                  for (int var7 = 0; var7 < 12; var7++) {
                     var5.writeByte(this.a_byteArr3[0][var11][var7]);
                     var5.writeByte(this.a_byteArr3[1][var11][var7]);
                  }
               }

               var5.write(this.f_byteArr2[0]);
               var5.write(this.f_byteArr2[1]);
               var5.write(this.f_byteArr2[2]);
               var5.write(this.f_byteArr2[3]);

               for (int var12 = 0; var12 < 5; var12++) {
                  var5.write(this.b_byteArr3[0][var12]);
                  var5.write(this.b_byteArr3[1][var12]);
                  var5.write(this.c_byteArr3[0][var12]);
                  var5.write(this.c_byteArr3[1][var12]);
               }

               var5.writeByte(this.aq_byte);
               var5.writeByte(this.y_byte);
               var5.writeByte(this.A_byte);
               var5.writeByte(this.I_byte);
               var5.writeByte(this.K_byte);
               var5.writeByte(this.h_byte);
               var5.writeByte(this.ai_byte);
               var5.writeInt(this.c_int);
               var5.writeBoolean(this.L_bool);
               var5.writeBoolean(this.N_bool);

               for (int var13 = 0; var13 < 3; var13++) {
                  for (int var15 = 0; var15 < 96; var15++) {
                     var5.writeInt(this.a_intArr3[0][var13][var15]);
                  }
               }

               var5.write(this.a_obj_b.c_byteArr2[0]);
               var5.write(this.a_obj_b.c_byteArr2[1]);
               var5.write(this.a_obj_b.c_byteArr2[2]);
               var5.write(this.a_obj_b.c_byteArr2[3]);
               var5.write(this.a_obj_b.c_byteArr2[4]);
               var5.write(this.a_obj_b.c_byteArr2[5]);
               var5.writeByte(this.a_obj_b.f_byte);
               var5.writeByte(this.a_obj_b.K_byte);
               var5.writeByte(this.a_obj_b.R_byte);
               var5.writeByte(this.a_obj_b.L_byte);
               var5.writeInt(this.a_obj_b.aQ);
               var5.write(this.a_obj_b.f_byteArr2[0]);
               var5.write(this.a_obj_b.f_byteArr2[1]);
               var5.write(this.a_obj_b.g_byteArr2[0]);
               var5.write(this.a_obj_b.g_byteArr2[1]);
               var5.write(this.a_obj_b.g_byteArr2[2]);
               var5.write(this.a_obj_b.j_byteArr);
               var5.writeByte(this.a_obj_b.N_byte);
               var5.writeByte(this.a_obj_b.O_byte);
               var5.writeByte(this.a_obj_b.g_byte);
               var5.writeByte(this.a_obj_b.J_byte);
               var5.writeByte(this.a_obj_b.I_byte);
               var5.write(this.t_byteArr);

               for (int var8 = -111; var8 >= -122; var8--) {
                  for (int var14 = 0; var14 < this.c_short; var14++) {
                     for (int var16 = 0; var16 < this.d_short; var16++) {
                        if (this.c_byteArr2[var16][var14] == var8) {
                           var5.writeByte(var14);
                           var5.writeByte(var16);
                        }
                     }
                  }

                  var5.writeByte(127);
               }
            }

            var3.addRecord(var4.toByteArray(), 0, var4.size());
            var2 = true;
         } catch (Exception var9) {
         }

         if (var3 != null) {
            var3.closeRecordStore();
         }

         if (var4 != null) {
            var4.close();
         }

         if (var5 != null) {
            var5.close();
         }
      } catch (Exception var10) {
      }

      return var2;
   }

   // $VF: renamed from: a (int, int) int
   final int a_int2(int var1, int var2) {
      return (this.a_obj_Random.nextInt() & var1) % var2;
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
      this.a_obj_b.k_void2();
      f_byte = this.b_byteArr[this.h_byte * 2 + this.a_int2(255, 2)];
      if (this.a_obj_a == null || this.a_obj_a.a_int() <= 100 || f_byte != g_byte) {
         g_byte = f_byte;
         this.aR();
         new StringBuffer().append("/s").append(f_byte).toString();
         this.a_obj_a = new SoundPlayer("audio/midi");
      }

      this.a_obj_a.a_void2(this.e_byte);
   }

   // $VF: renamed from: aR () void
   private void aR() {
      if (this.a_obj_a != null) {
         this.a_obj_a.a_void();
         this.a_obj_a.b();
         this.a_obj_a = null;
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
      if (this.Q_byte != 27 && this.e_byte == 2 && (this.a_obj_a == null || this.a_obj_a != null && this.a_obj_a.a_int() != 400)) {
         this.aQ();
      }

      MainMIDlet.a(10);
   }

   // $VF: renamed from: m (int) void
   private void m_void2(int var1) {
      if (var1 == this.j_intArr[0]) {
         for (int var4 = 0; var4 < 6; var4++) {
            this.i_intArr[var4] = 0;
         }

         this.i_intArr[0] = this.j_intArr[0];
      } else {
         if (this.i_intArr[0] == this.j_intArr[0]) {
            for (int var2 = 0; var2 < 6; var2++) {
               if (this.i_intArr[var2] == 0) {
                  this.i_intArr[var2] = var1;
                  break;
               }
            }

            this.ae_bool = true;

            for (int var3 = 0; var3 < 5; var3++) {
               if (this.i_intArr[var3] != this.j_intArr[var3]) {
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
