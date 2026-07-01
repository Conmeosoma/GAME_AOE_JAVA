package Project.src;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

// $VF: renamed from: e
public final class GameData {
   // $VF: renamed from: a f
   GameResources resources;
   // $VF: renamed from: a short[]
   short[] pd0SectionLengths = new short[]{
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
   byte imageGroupIndex;
   // $VF: renamed from: a byte[]
   byte[] imageGroupCounts = new byte[]{31, 6, 12};
   // $VF: renamed from: a java.lang.String[]
   String[] imageGroupPaths = new String[]{"/pi0", "/pi9", "/pi8"};

   public GameData(GameResources resourcesRef1) {
      this.resources = resourcesRef1;
      this.a();
      this.c();
      this.i();
      this.imageGroupIndex = 0;
      this.d();
      this.imageGroupIndex = 1;
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
      int intValue1 = 0;
      this.resources.b_shortArr2 = new short[11][];
      this.resources.j_byteArr2 = new byte[25][];

      for (int loopIndex1 = 0; loopIndex1 <= 24; loopIndex1++) {
         this.resources.j_byteArr2[loopIndex1] = new byte[this.pd0SectionLengths[intValue1 + 10 + 1]];
         if (loopIndex1 <= 10) {
            this.resources.b_shortArr2[loopIndex1] = new short[this.pd0SectionLengths[intValue1]];
         }

         intValue1++;
      }

      System.gc();
      Thread.yield();
      this.resources.spriteImages = new Image[3][];
      this.resources.spriteImages[2] = new Image[1];
   }

   // $VF: renamed from: b () void
   private void b() {
      System.gc();
      Thread.yield();

      try {
         DataInputStream dataInput1;
         (dataInput1 = new DataInputStream(this.getClass().getResourceAsStream("/pd0"))).readByte();
         int intValue1 = 0;

         for (int loopIndex1 = 0; loopIndex1 <= 10; loopIndex1++) {
            for (int loopIndex2 = 0; loopIndex2 < this.pd0SectionLengths[intValue1]; loopIndex2++) {
               this.resources.b_shortArr2[loopIndex1][loopIndex2] = dataInput1.readShort();
            }

            intValue1++;
            this.resources.a_void10(1);
         }

         for (int loopIndex3 = 0; loopIndex3 <= 24; loopIndex3++) {
            for (int loopIndex4 = 0; loopIndex4 < this.pd0SectionLengths[intValue1]; loopIndex4++) {
               this.resources.j_byteArr2[loopIndex3][loopIndex4] = dataInput1.readByte();
            }

            intValue1++;
            this.resources.a_void10(1);
         }

         dataInput1.close();
         GameResources.aU = this.resources.j_byteArr2[23][this.resources.b_shortArr2[10][this.resources.b_shortArr2[9][552] & 8191] & 8191] + 9;
         GameResources.aT = (320 - this.resources.j_byteArr2[1][1012] * 2) / GameResources.aU;
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: c () void
   private void c() {
      try {
         System.gc();
         Thread.yield();
         this.resources.A_int = 208;
         this.resources.O_byte = 15;
         this.resources.P_byte = (byte)((this.resources.A_int - 1) / 16 + 1);
         boolean flag1 = false;
         this.resources.y_byte = (byte)((this.resources.O_byte >> 1) - 0);
         this.resources.A_byte = (byte)((this.resources.P_byte >> 1) - 0);
         this.resources.C_byte = this.resources.y_byte;
         this.resources.D_byte = this.resources.A_byte;
         this.resources.a_intArr = new int[]{350, 350, 320, 320, 320, 320, 68, 320, 68, 63, 320, 320, 320};
         this.resources.b_intArr = new int[]{272, 208, 22, 48, 22, 48, 55, 86, 49, 55, 38, 0, 0};
         this.resources.c_intArr = new int[]{0, 0, 208, 208, 230, 230, 0, 230, 0, 0, 230, 0, 0};
         this.resources.d_intArr = new int[]{0, 16, 0, 0, 218, 192, 0, 154, 0, 0, 202, 240, 0};
         this.resources.c_byteArr = new byte[]{0, 1, 0, 0, 0, 0, 2, 0, 2, 2, 0, 0, 0};
         this.resources.d_byteArr = new byte[]{0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         GameResources.frameBuffers[this.resources.c_byteArr[1]] = Image.createImage(350, 208);
         GameResources.frameGraphics[this.resources.c_byteArr[1]] = GameResources.frameBuffers[this.resources.c_byteArr[1]].getGraphics();
         GameResources.frameBuffers[this.resources.c_byteArr[6]] = Image.createImage(68, 55);
         GameResources.frameGraphics[this.resources.c_byteArr[6]] = GameResources.frameBuffers[this.resources.c_byteArr[6]].getGraphics();
         this.resources.ba = this.resources.b_intArr[2];
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: d () void
   private void d() {
      byte byteValue1 = this.imageGroupCounts[this.imageGroupIndex];
      String dirName = this.imageGroupPaths[this.imageGroupIndex];
      this.resources.spriteImages[this.imageGroupIndex] = new Image[byteValue1];

      for (byte byteIndex1 = 0; byteIndex1 < byteValue1; byteIndex1++) {
         try {
            this.resources.spriteImages[this.imageGroupIndex][byteIndex1] = Image.createImage(dirName + "/image_" + byteIndex1 + ".png");
         } catch (Exception ignoredException1) {
            System.err.println("Failed to load: " + dirName + "/image_" + byteIndex1 + ".png");
         }
         this.resources.a_void10(2);
      }
   }

   // $VF: renamed from: e () void
   private void e() {
      System.gc();
      Thread.yield();
      this.resources.renderer = new GameRenderer(this.resources);
      this.resources.renderer.f_byteArr = new byte[122];
      this.resources.renderer.e_byteArr = new byte[33];
      this.resources.renderer.b_byteArr2 = new byte[33][25];
      this.resources.renderer.c_byteArr2 = new byte[33][25];
      this.resources.renderer.d_byteArr = new byte[33];
      this.resources.renderer.d_shortArr = new short[33];
      this.resources.renderer.e_shortArr = new short[33];
      this.resources.renderer.f_shortArr = new short[33];
      this.resources.renderer.g_shortArr = new short[250];
      this.resources.renderer.h_shortArr = new short[250];
      this.resources.renderer.b_void(0);
   }

   // $VF: renamed from: f () void
   private void f() {
      System.gc();
      Thread.yield();
      this.resources.a_byteArr = new byte[17638];
      this.resources.a_shortArr = new short[312];
      this.resources.b_shortArr = new short[570];
      this.resources.c_shortArr = new short[5];
      InputStream inputStream1 = null;

      try {
         if ((inputStream1 = this.getClass().getResourceAsStream("/a")) != null) {
            this.resources.a_shortArr[0] = this.resources.c_shortArr[0] = 0;

            for (int loopIndex1 = 0; loopIndex1 < 312; loopIndex1++) {
               int intValue1 = inputStream1.read() & 0xFF;
               int intValue2 = ((inputStream1.read() & 0xFF) << 8) + intValue1;
               if (loopIndex1 < 311) {
                  this.resources.a_shortArr[loopIndex1 + 1] = (short)(this.resources.a_shortArr[loopIndex1] + intValue2);
               }

               if (intValue2 > 0) {
                  inputStream1.read(this.resources.a_byteArr, this.resources.a_shortArr[loopIndex1], intValue2);
               }
            }

            for (int loopIndex2 = 0; loopIndex2 < 5; loopIndex2++) {
               int intValue3 = inputStream1.read() & 0xFF;
               int intValue4 = ((inputStream1.read() & 0xFF) << 8) + intValue3;
               if (loopIndex2 < 4) {
                  this.resources.c_shortArr[loopIndex2 + 1] = (short)(this.resources.c_shortArr[loopIndex2] + intValue4);
               }

               for (int loopIndex3 = 0; loopIndex3 < intValue4; loopIndex3++) {
                  int intValue5 = inputStream1.read() & 0xFF;
                  this.resources.b_shortArr[this.resources.c_shortArr[loopIndex2] + loopIndex3] = (short)(((inputStream1.read() & 0xFF) << 8) + intValue5);
               }
            }
         }

         if (inputStream1 != null) {
            inputStream1.close();
         }
      } catch (IOException ignoredException1) {
      }
   }

   // $VF: renamed from: g () void
   private void g() {
      try {
         System.gc();
         Thread.yield();
         GameResources.e_shortArr = new short[]{8014, 6315, 5648, 3405, 3234};
         GameResources.f_shortArr = new short[]{0, 8014, 14329, 19977, 23382};
         GameResources.w_byteArr = new byte[26616];
         this.resources.b_byteArr = new byte[]{0, 1, 2, 3, 4, 4};
         InputStream inputStream1;
         (inputStream1 = this.getClass().getResourceAsStream("/sa")).read(GameResources.w_byteArr, 0, 26616);
         inputStream1.close();
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: h () void
   private void h() {
      try {
         System.gc();
         Thread.yield();
         this.resources.h_intArr = new int[]{0, 2545, 6965, 10649, 15487, 22633, 27261, 31708, 35466, 39214};
         this.resources.v_byteArr = new byte[42381];
         InputStream inputStream1;
         (inputStream1 = this.getClass().getResourceAsStream("/ma")).read(this.resources.v_byteArr, 0, 42381);
         inputStream1.close();
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: i () void
   private void i() {
      System.gc();
      Thread.yield();
      this.resources.e_byteArr = new byte[9983];
      this.resources.b_byteArr2 = new byte[96][96];
      this.resources.c_byteArr2 = new byte[96][96];
      this.resources.a_intArr2 = new int[3][4];

      try {
         this.resources.midletVersion = this.resources.midlet.getAppProperty("MIDlet-Version");
         this.resources.d_bool = this.resources.midlet.getAppProperty("GameLinkEnabled").equals("true");
         this.resources.a_bool = this.resources.midlet.getAppProperty("Cheat-Support").equals("on");
      } catch (Exception ignoredException1) {
      }

      if (this.resources.d_bool) {
         this.resources.U_byte = 1;
      }
   }
}
