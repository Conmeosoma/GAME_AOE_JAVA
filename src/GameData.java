package Project.src;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

// $VF: renamed from: e
public final class GameData {
   // $VF: renamed from: a f
   GameResources a_obj_f;
   // $VF: renamed from: a short[]
   short[] a_shortArr = new short[]{
      119,
      1308,
      162,
      162,
      2782,
      146,
      1071,
      6903,
      823,
      1729,
      5573,
      119,
      1308,
      1308,
      1308,
      162,
      162,
      162,
      2782,
      2782,
      146,
      1071,
      1071,
      6903,
      6903,
      6903,
      823,
      1729,
      42,
      5573,
      5573,
      1829,
      1829,
      1829,
      1829,
      1829
   };
   // $VF: renamed from: a byte
   byte a_byte;
   // $VF: renamed from: a byte[]
   byte[] a_byteArr = new byte[]{31, 6, 12};
   // $VF: renamed from: a java.lang.String[]
   String[] a_obj_StringArr = new String[]{"/pi0", "/pi9", "/pi8"};

   public GameData(GameResources var1) {
      this.a_obj_f = var1;
      this.a();
      this.c();
      this.i();
      this.a_byte = 0;
      this.d();
      this.a_byte = 1;
      this.d();
      this.b();
      this.f();
      this.e();
      this.g();
      this.h();
   }

   // $VF: renamed from: a () void
   private void a() {
      System.gc();
      Thread.yield();
      int var1 = 0;
      this.a_obj_f.b_shortArr2 = new short[11][];
      this.a_obj_f.j_byteArr2 = new byte[25][];

      for (int var2 = 0; var2 <= 24; var2++) {
         this.a_obj_f.j_byteArr2[var2] = new byte[this.a_shortArr[var1 + 10 + 1]];
         if (var2 <= 10) {
            this.a_obj_f.b_shortArr2[var2] = new short[this.a_shortArr[var1]];
         }

         var1++;
      }

      System.gc();
      Thread.yield();
      this.a_obj_f.a_obj_ImageArr2 = new Image[3][];
      this.a_obj_f.a_obj_ImageArr2[2] = new Image[1];
   }

   // $VF: renamed from: b () void
   private void b() {
      System.gc();
      Thread.yield();

      try {
         DataInputStream var1;
         (var1 = new DataInputStream(this.getClass().getResourceAsStream("/pd0"))).readByte();
         int var2 = 0;

         for (int var3 = 0; var3 <= 10; var3++) {
            for (int var4 = 0; var4 < this.a_shortArr[var2]; var4++) {
               this.a_obj_f.b_shortArr2[var3][var4] = var1.readShort();
            }

            var2++;
            this.a_obj_f.a_void10(1);
         }

         for (int var7 = 0; var7 <= 24; var7++) {
            for (int var5 = 0; var5 < this.a_shortArr[var2]; var5++) {
               this.a_obj_f.j_byteArr2[var7][var5] = var1.readByte();
            }

            var2++;
            this.a_obj_f.a_void10(1);
         }

         var1.close();
         GameResources.aU = this.a_obj_f.j_byteArr2[23][this.a_obj_f.b_shortArr2[10][this.a_obj_f.b_shortArr2[9][552] & 8191] & 8191] + 9;
         GameResources.aT = (320 - this.a_obj_f.j_byteArr2[1][1012] * 2) / GameResources.aU;
      } catch (Exception var6) {
      }
   }

   // $VF: renamed from: c () void
   private void c() {
      try {
         System.gc();
         Thread.yield();
         this.a_obj_f.A_int = 208;
         this.a_obj_f.O_byte = 15;
         this.a_obj_f.P_byte = (byte)((this.a_obj_f.A_int - 1) / 16 + 1);
         boolean var1 = false;
         this.a_obj_f.y_byte = (byte)((this.a_obj_f.O_byte >> 1) - 0);
         this.a_obj_f.A_byte = (byte)((this.a_obj_f.P_byte >> 1) - 0);
         this.a_obj_f.C_byte = this.a_obj_f.y_byte;
         this.a_obj_f.D_byte = this.a_obj_f.A_byte;
         this.a_obj_f.a_intArr = new int[]{350, 350, 320, 320, 320, 320, 68, 320, 68, 63, 320, 320, 320};
         this.a_obj_f.b_intArr = new int[]{272, 208, 22, 48, 22, 48, 55, 86, 49, 55, 38, 0, 0};
         this.a_obj_f.c_intArr = new int[]{0, 0, 208, 208, 230, 230, 0, 230, 0, 0, 230, 0, 0};
         this.a_obj_f.d_intArr = new int[]{0, 16, 0, 0, 218, 192, 0, 154, 0, 0, 202, 240, 0};
         this.a_obj_f.c_byteArr = new byte[]{0, 1, 0, 0, 0, 0, 2, 0, 2, 2, 0, 0, 0};
         this.a_obj_f.d_byteArr = new byte[]{0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         GameResources.a_obj_ImageArr[this.a_obj_f.c_byteArr[1]] = Image.createImage(350, 208);
         GameResources.a_obj_GraphicsArr[this.a_obj_f.c_byteArr[1]] = GameResources.a_obj_ImageArr[this.a_obj_f.c_byteArr[1]].getGraphics();
         GameResources.a_obj_ImageArr[this.a_obj_f.c_byteArr[6]] = Image.createImage(68, 55);
         GameResources.a_obj_GraphicsArr[this.a_obj_f.c_byteArr[6]] = GameResources.a_obj_ImageArr[this.a_obj_f.c_byteArr[6]].getGraphics();
         this.a_obj_f.ba = this.a_obj_f.b_intArr[2];
      } catch (Exception var10) {
      }
   }

   // $VF: renamed from: d () void
   private void d() {
      byte var1 = this.a_byteArr[this.a_byte];
      String dirName = this.a_obj_StringArr[this.a_byte]; // e.g. "/pi0", "/pi9"
      this.a_obj_f.a_obj_ImageArr2[this.a_byte] = new Image[var1];
      
      for (byte var3 = 0; var3 < var1; var3++) {
         try {
            this.a_obj_f.a_obj_ImageArr2[this.a_byte][var3] = Image.createImage(dirName + "/image_" + var3 + ".png");
         } catch (Exception var10) {
            System.err.println("Failed to load: " + dirName + "/image_" + var3 + ".png");
         }
         this.a_obj_f.a_void10(2);
      }
   }

   // $VF: renamed from: e () void
   private void e() {
      System.gc();
      Thread.yield();
      this.a_obj_f.a_obj_c = new GameRenderer(this.a_obj_f);
      this.a_obj_f.a_obj_c.f_byteArr = new byte[122];
      this.a_obj_f.a_obj_c.e_byteArr = new byte[33];
      this.a_obj_f.a_obj_c.b_byteArr2 = new byte[33][25];
      this.a_obj_f.a_obj_c.c_byteArr2 = new byte[33][25];
      this.a_obj_f.a_obj_c.d_byteArr = new byte[33];
      this.a_obj_f.a_obj_c.d_shortArr = new short[33];
      this.a_obj_f.a_obj_c.e_shortArr = new short[33];
      this.a_obj_f.a_obj_c.f_shortArr = new short[33];
      this.a_obj_f.a_obj_c.g_shortArr = new short[250];
      this.a_obj_f.a_obj_c.h_shortArr = new short[250];
      this.a_obj_f.a_obj_c.b_void(0);
   }

   // $VF: renamed from: f () void
   private void f() {
      System.gc();
      Thread.yield();
      this.a_obj_f.a_byteArr = new byte[17638];
      this.a_obj_f.a_shortArr = new short[312];
      this.a_obj_f.b_shortArr = new short[570];
      this.a_obj_f.c_shortArr = new short[5];
      InputStream var1 = null;

      try {
         if ((var1 = this.getClass().getResourceAsStream("/a")) != null) {
            this.a_obj_f.a_shortArr[0] = this.a_obj_f.c_shortArr[0] = 0;

            for (int var2 = 0; var2 < 312; var2++) {
               int var3 = var1.read() & 0xFF;
               int var5 = ((var1.read() & 0xFF) << 8) + var3;
               if (var2 < 311) {
                  this.a_obj_f.a_shortArr[var2 + 1] = (short)(this.a_obj_f.a_shortArr[var2] + var5);
               }

               if (var5 > 0) {
                  var1.read(this.a_obj_f.a_byteArr, this.a_obj_f.a_shortArr[var2], var5);
               }
            }

            for (int var9 = 0; var9 < 5; var9++) {
               int var10 = var1.read() & 0xFF;
               int var12 = ((var1.read() & 0xFF) << 8) + var10;
               if (var9 < 4) {
                  this.a_obj_f.c_shortArr[var9 + 1] = (short)(this.a_obj_f.c_shortArr[var9] + var12);
               }

               for (int var11 = 0; var11 < var12; var11++) {
                  int var4 = var1.read() & 0xFF;
                  this.a_obj_f.b_shortArr[this.a_obj_f.c_shortArr[var9] + var11] = (short)(((var1.read() & 0xFF) << 8) + var4);
               }
            }
         }

         if (var1 != null) {
            var1.close();
         }
      } catch (IOException var7) {
      }
   }

   // $VF: renamed from: g () void
   private void g() {
      try {
         GameResources.e_shortArr = new short[]{8014, 6315, 5648, 3405, 3234};
         GameResources.f_shortArr = new short[]{0, 8014, 14329, 19977, 23382};
         this.a_obj_f.b_byteArr = new byte[]{0, 1, 2, 3, 4, 4};
      } catch (Exception var2) {
      }
   }

   // $VF: renamed from: h () void
   private void h() {
      try {
         System.gc();
         Thread.yield();
         this.a_obj_f.h_intArr = new int[]{0, 2545, 6965, 10649, 15487, 22633, 27261, 31708, 35466, 39214};
         this.a_obj_f.v_byteArr = new byte[42381];
         InputStream var1;
         (var1 = this.getClass().getResourceAsStream("/ma")).read(this.a_obj_f.v_byteArr, 0, 42381);
         var1.close();
      } catch (Exception var2) {
      }
   }

   // $VF: renamed from: i () void
   private void i() {
      System.gc();
      Thread.yield();
      this.a_obj_f.e_byteArr = new byte[9983];
      this.a_obj_f.b_byteArr2 = new byte[96][96];
      this.a_obj_f.c_byteArr2 = new byte[96][96];
      this.a_obj_f.a_intArr2 = new int[3][4];

      try {
         this.a_obj_f.a_obj_String = this.a_obj_f.a_obj_tribes.getAppProperty("MIDlet-Version");
         this.a_obj_f.d_bool = this.a_obj_f.a_obj_tribes.getAppProperty("GameLinkEnabled").equals("true");
         this.a_obj_f.a_bool = this.a_obj_f.a_obj_tribes.getAppProperty("Cheat-Support").equals("on");
      } catch (Exception var2) {
      }

      if (this.a_obj_f.d_bool) {
         this.a_obj_f.U_byte = 1;
      }
   }
}
