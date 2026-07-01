package Project.src;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;

// $VF: renamed from: c
public final class GameRenderer {
   // $VF: renamed from: a f
   GameResources resources;
   // $VF: renamed from: a byte[]
   byte[] spriteData;
   // $VF: renamed from: a short[]
   short[] spriteOffsets;
   // $VF: renamed from: b byte[]
   byte[] b_byteArr = new byte[1671];
   // $VF: renamed from: b short[]
   short[] b_shortArr = new short[230];
   // $VF: renamed from: c byte[]
   byte[] c_byteArr = new byte[37456];
   // $VF: renamed from: c short[]
   short[] c_shortArr = new short[310];
   // $VF: renamed from: a byte[][]
   byte[][] a_byteArr2 = new byte[][]{this.b_byteArr, this.c_byteArr, this.c_byteArr};
   // $VF: renamed from: a short[][]
   short[][] a_shortArr2 = new short[][]{this.b_shortArr, this.c_shortArr, this.c_shortArr};
   // $VF: renamed from: a java.lang.String[]
   String[] mapResourceSuffixes = new String[]{"/s", "/t", "/d"};
   // $VF: renamed from: b byte[][]
   byte[][] b_byteArr2;
   // $VF: renamed from: c byte[][]
   byte[][] c_byteArr2;
   // $VF: renamed from: d byte[]
   byte[] d_byteArr;
   // $VF: renamed from: d short[]
   short[] d_shortArr;
   // $VF: renamed from: e short[]
   short[] e_shortArr;
   // $VF: renamed from: f short[]
   short[] f_shortArr;
   // $VF: renamed from: e byte[]
   byte[] e_byteArr;
   // $VF: renamed from: a byte
   byte a_byte = 0;
   // $VF: renamed from: b byte
   byte b_byte;
   // $VF: renamed from: c byte
   byte c_byte;
   // $VF: renamed from: f byte[]
   byte[] f_byteArr;
   // $VF: renamed from: a int
   int a_int;
   // $VF: renamed from: a java.io.InputStream
   InputStream resourceStream = null;
   // $VF: renamed from: b int
   int b_int;
   // $VF: renamed from: c int
   int c_int;
   // $VF: renamed from: d int
   int d_int;
   // $VF: renamed from: e int
   int e_int;
   // $VF: renamed from: f int
   int f_int = -1;
   // $VF: renamed from: g int
   int g_int;
   // $VF: renamed from: h int
   int h_int;
   // $VF: renamed from: d byte
   byte d_byte;
   // $VF: renamed from: i int
   int i;
   // $VF: renamed from: j int
   int j;
   // $VF: renamed from: k int
   int k;
   // $VF: renamed from: l int
   int l;
   // $VF: renamed from: m int
   int m;
   // $VF: renamed from: n int
   int n;
   // $VF: renamed from: o int
   int o;
   // $VF: renamed from: p int
   int p;
   // $VF: renamed from: q int
   int q;
   // $VF: renamed from: g short[]
   short[] g_shortArr;
   // $VF: renamed from: h short[]
   short[] h_shortArr;
   // $VF: renamed from: r int
   int r;
   // $VF: renamed from: s int
   int s;
   // $VF: renamed from: t int
   int t;
   // $VF: renamed from: u int
   int u;
   // $VF: renamed from: v int
   int v;
   // $VF: renamed from: w int
   int w;
   // $VF: renamed from: x int
   int x;
   // $VF: renamed from: y int
   int y;
   // $VF: renamed from: z int
   int z;
   // $VF: renamed from: A int
   int A;

   public GameRenderer(GameResources resourcesRef1) {
      this.resources = resourcesRef1;
      this.spriteData = this.resources.a_byteArr;
      this.spriteOffsets = this.resources.a_shortArr;
   }

   // $VF: renamed from: a () void
   final void a_void() {
      for (this.k = 13; this.k < 33; this.k++) {
         this.f_shortArr[this.k] = 0;
      }

      this.b_byte = 0;
      this.c_byte = 0;

      for (this.k = 0; this.k < 122; this.k++) {
         this.f_byteArr[this.k] = 0;
      }
   }

   // $VF: renamed from: a (int) void
   final void a_void2(int intValue1) {
      this.resources.w_int = -1;
      this.g_int = intValue1;

      for (this.c_int = this.spriteOffsets[308]; this.c_int < this.spriteOffsets[309]; this.c_int++) {
         if (intValue1 < this.spriteData[this.c_int]) {
            this.c_int = this.c_int - this.spriteOffsets[308];
            break;
         }
      }

      if (this.f_int != this.c_int) {
         this.f_int = this.c_int;
         this.b_void(2);
      }
   }

   // $VF: renamed from: b (int) void
   final void b_void(int intValue1) {
      try {
         try {
            this.resourceStream = this.getClass()
               .getResourceAsStream("/" + GameResources.a_byte + this.mapResourceSuffixes[intValue1] + (intValue1 == 2 ? String.valueOf(this.f_int) : "") + ".txt");
            if (this.resourceStream != null) {
               if (intValue1 < 2) {
                  this.d_int = 0;
                  this.a_shortArr2[intValue1][0] = 0;
                  this.c_int = 0;
               } else {
                  this.d_int = 71;
                  this.c_int = this.a_shortArr2[1][71];
               }

               while ((this.b_int = this.resourceStream.read()) != -1) {
                  if (this.b_int == 124) {
                     this.d_int++;
                     this.a_shortArr2[intValue1][this.d_int] = (short)this.c_int;
                  } else {
                     if (this.b_int == 31) {
                        for (this.e_int = 0; this.e_int < this.resources.midletVersion.length(); this.c_int++) {
                           this.a_byteArr2[intValue1][this.c_int] = this.spriteData[this.spriteOffsets[280] + (byte)this.resources.midletVersion.charAt(this.e_int)];
                           this.e_int++;
                        }

                        this.c_int--;
                     } else {
                        this.a_byteArr2[intValue1][this.c_int] = this.spriteData[this.spriteOffsets[280] + this.b_int];
                     }

                     this.c_int++;
                  }
               }
            }

            if (this.resourceStream != null) {
               this.resourceStream.close();
            }
            this.resourceStream = null;
         } catch (IOException ignoredException1) {
            return;
         }
      } catch (Exception ignoredException2) {
      }
   }

   // $VF: renamed from: a (int, int, int, java.lang.String, int) void
   final void a_void3(int intValue1, int intValue2, int intValue3, String text1, int intValue4) {
      for (this.a_int = 0; this.a_int < text1.length(); this.a_int++) {
         this.b_byteArr[this.b_shortArr[228] + this.a_int] = this.spriteData[this.spriteOffsets[280] + (byte)text1.charAt(this.a_int)];
      }

      this.b_shortArr[229] = (short)(this.b_shortArr[228] + text1.length());
      this.a_void4(intValue1, intValue2, intValue3, 228, intValue4);
   }

   // $VF: renamed from: a (int, int, int, int, int) void
   final void a_void4(int intValue1, int intValue2, int intValue3, int intValue4, int intValue5) {
      this.h_int = intValue2 == -100 ? 13 + this.b_byte : this.a_byte;
      if (this.h_int < 13 || this.f_shortArr[this.h_int] == 0) {
         this.d_byteArr[this.h_int] = (byte)(this.b_shortArr[intValue4 + 1] - this.b_shortArr[intValue4]);
         this.e_byteArr[this.h_int] = (byte)intValue5;
         if (this.h_int >= 13) {
            intValue5 = 1;
         }

         this.d_shortArr[this.h_int] = (short)((this.d_byteArr[this.h_int] - 1) * (0 + intValue5));
         this.f_shortArr[this.h_int] = (short)intValue1;
         this.e_shortArr[this.h_int] = (short)(this.h_int >= 13 ? 0 : intValue2);

         for (this.a_int = 0; this.a_int < this.d_byteArr[this.h_int]; this.a_int++) {
            this.d_byte = this.b_byteArr[this.b_shortArr[intValue4] + this.a_int];
            if (this.d_byte == 126) {
               this.c_byteArr2[this.h_int][this.a_int] = this.d_byte;
               this.d_shortArr[this.h_int] = (short)(this.d_shortArr[this.h_int] - ((0 + intValue5) * 2 + 2));
            } else {
               this.c_byteArr2[this.h_int][this.a_int] = (byte)(this.d_byte / 30);
               this.b_byteArr2[this.h_int][this.a_int] = (byte)(this.d_byte % 30);
               if (this.d_byte / 30 != 0 || this.d_byte % 30 < 14) {
                  this.d_shortArr[this.h_int] = (short)(
                     this.d_shortArr[this.h_int]
                        + (
                           (
                                 this.spriteData[this.spriteOffsets[281 + intValue5]
                                       + this.c_byteArr2[this.h_int][this.a_int] * 21
                                       + this.b_byteArr2[this.h_int][this.a_int]
                                       + 1]
                                    & 255
                              )
                              - (
                                 this.spriteData[this.spriteOffsets[281 + intValue5]
                                       + this.c_byteArr2[this.h_int][this.a_int] * 21
                                       + this.b_byteArr2[this.h_int][this.a_int]]
                                    & 255
                              )
                        )
                  );
               }
            }
         }

         if (intValue4 == 97) {
            this.resources.a_void7(1047, 34, intValue2 - 2);
            this.resources.a_void7(1053, 283, intValue2 - 2);
         }

         if (this.h_int < 13) {
            this.f_shortArr[this.h_int] = (short)(this.f_shortArr[this.h_int] - this.d_shortArr[this.h_int] * intValue3 / 2);
            this.a_byte++;
         } else {
            this.b_byte++;
            if (this.b_byte >= 20) {
               this.b_byte = 0;
            }
         }
      }
   }

   // $VF: renamed from: a (int, int, int, int, int, int, int) void
   final void a_void5(int intValue1, int intValue2, int intValue3, int intValue4, int intValue5, int intValue6, int intValue7) {
      if (intValue4 >= 0) {
         this.a_void4(intValue1, intValue2, 0, intValue4, intValue7);
         this.i = this.d_shortArr[this.h_int] + 1;
         this.j = this.h_int;
      }

      if (intValue5 >= 0) {
         this.a_void4(intValue1 + this.i, intValue2, 0, intValue5, intValue7);
         this.i = this.i + this.d_shortArr[this.h_int] + 1;
      }

      if (intValue6 >= 0) {
         this.a_void4(intValue1 + this.i, intValue2, 0, intValue6, intValue7);
         this.i = this.i + this.d_shortArr[this.h_int];
      }

      while (this.j < this.a_byte) {
         this.f_shortArr[this.j] = (short)(this.f_shortArr[this.j] - this.i * intValue3 / 2);
         this.j++;
      }
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics) void
   final void a_void6(Graphics graphics1) {
      for (this.k = 0; this.k < this.a_byte; this.k++) {
         this.m = this.f_shortArr[this.k];

         for (this.l = 0; this.l < this.d_byteArr[this.k]; this.l++) {
            if (this.c_byteArr2[this.k][this.l] == 126) {
               this.m = this.m - (0 + this.e_byteArr[this.k] + 2);
            } else {
               this.n = this.e_shortArr[this.k];
               this.q = this.m;
               this.o = (
                     this.spriteData[this.spriteOffsets[281 + this.e_byteArr[this.k]]
                           + this.c_byteArr2[this.k][this.l] * 21
                           + this.b_byteArr2[this.k][this.l]
                           + 1]
                        & 255
                  )
                  - (
                     this.spriteData[this.spriteOffsets[281 + this.e_byteArr[this.k]]
                           + this.c_byteArr2[this.k][this.l] * 21
                           + this.b_byteArr2[this.k][this.l]]
                        & 255
                  );
               if (this.c_byteArr2[this.k][this.l] == 0 && this.b_byteArr2[this.k][this.l] >= 14) {
                  this.n = this.n - this.spriteData[this.spriteOffsets[285] + this.b_byteArr2[this.k][this.l] - 14];
                  this.q = this.q - (0 + (this.o + this.p) / 2);
               }

               GameResources.a_bool6(
                  graphics1,
                  this.resources.spriteImages[0][25 + this.e_byteArr[this.k]],
                  this.spriteData[this.spriteOffsets[281 + this.e_byteArr[this.k]]
                        + this.c_byteArr2[this.k][this.l] * 21
                        + this.b_byteArr2[this.k][this.l]]
                     & 255,
                  this.spriteData[this.spriteOffsets[284] + this.e_byteArr[this.k] * 3 + this.c_byteArr2[this.k][this.l]],
                  this.o,
                  this.spriteData[this.spriteOffsets[283] + this.e_byteArr[this.k] * 3 + this.c_byteArr2[this.k][this.l]],
                  0 + this.q,
                  0 + this.n,
                  20
               );
               if (this.c_byteArr2[this.k][this.l] != 0 || this.b_byteArr2[this.k][this.l] < 14) {
                  this.m = this.m + this.o + 0 + this.e_byteArr[this.k];
               }

               this.p = this.o;
            }
         }
      }

      this.a_byte = 0;
   }

   // $VF: renamed from: b () void
   final void b_void2() {
      for (this.k = 13 + this.c_byte; this.k != 13 + this.b_byte; this.k++) {
         this.e_shortArr[this.k] = (short)(this.e_shortArr[this.k] + this.e_shortArr[this.k] / 4 + 1);
         if (this.e_shortArr[this.k] >= 15) {
            this.f_shortArr[this.k] = 0;
            this.c_byte++;
            if (this.c_byte >= 20) {
               this.c_byte = 0;
            }
         }

         if (this.k == 32) {
            this.k = 12;
         }
      }

      for (this.k = 0; this.k < 122; this.k++) {
         if (this.f_byteArr[this.k] != 0 && this.k % 3 == this.resources.c_int % 3) {
            this.a_void3(
               this.k,
               -100,
               0,
               (this.f_byteArr[this.k] > 0 ? "+" : "") + this.f_byteArr[this.k],
               this.f_byteArr[this.k] > 0 ? 2 : (this.k <= 50 ? 1 : 0)
            );
            this.f_byteArr[this.k] = 0;
         }
      }
   }

   // $VF: renamed from: a (int, int, int) void
   final void a_void7(int intValue1, int intValue2, int intValue3) {
      for (this.k = 13 + this.c_byte; this.k != 13 + this.b_byte; this.k++) {
         if (this.f_shortArr[this.k] == intValue1) {
            this.m = intValue2 - this.d_shortArr[this.k] / 2 + this.resources.a_int2(255, 5) - 2;
            this.n = intValue3 - 5 - this.e_shortArr[this.k] * 2;

            for (this.l = 0; this.l < this.d_byteArr[this.k]; this.l++) {
               this.o = (
                     this.spriteData[this.spriteOffsets[282] + this.c_byteArr2[this.k][this.l] * 21 + this.b_byteArr2[this.k][this.l] + 1] & 255
                  )
                  - (this.spriteData[this.spriteOffsets[282] + this.c_byteArr2[this.k][this.l] * 21 + this.b_byteArr2[this.k][this.l]] & 255);
               GameResources.a_bool6(
                  GameResources.frameGraphics[1],
                  this.resources.spriteImages[0][26],
                  this.spriteData[this.spriteOffsets[282] + this.c_byteArr2[this.k][this.l] * 21 + this.b_byteArr2[this.k][this.l]] & 255,
                  this.spriteData[this.spriteOffsets[284] + 3 + this.c_byteArr2[this.k][this.l]]
                     + this.spriteData[this.spriteOffsets[283] + 3 + 0] * this.e_byteArr[this.k],
                  this.o,
                  this.spriteData[this.spriteOffsets[283] + 3 + this.c_byteArr2[this.k][this.l]],
                  0 + this.m,
                  0 + this.n,
                  20
               );
               this.m = this.m + this.o + 0 + 1;
            }
         }

         if (this.k >= 32) {
            this.k = 12;
         }
      }
   }

   // $VF: renamed from: b (int, int, int, int, int, int, int) void
   final void b_void3(int intValue1, int intValue2, int intValue3, int intValue4, int intValue5, int intValue6, int intValue7) {
      intValue1++;
      intValue3 -= 2;
      intValue2 += 4;
      intValue4 -= 4;
      if (intValue5 >= 71) {
         intValue5 += this.spriteData[this.spriteOffsets[309] + this.g_int] & 255;
      }

      this.w = 0;
      this.u = 0;
      this.g_shortArr[0] = this.a_shortArr2[1][intValue5];
      this.x = 0;

      for (this.v = this.a_shortArr2[1][intValue5] & '\uffff'; this.v < (this.a_shortArr2[1][intValue5 + 1] & '\uffff'); this.v++) {
         if (this.a_byteArr2[1][this.v] == 42 && (this.a_byteArr2[1][this.v + 1] < 90 || this.a_byteArr2[1][this.v + 1] >= 112)
            || this.a_byteArr2[1][this.v] == 127) {
            this.w = this.v + 1;
            this.y = this.x;
         }

         if (this.a_byteArr2[1][this.v] == 126) {
            this.x -= 0 + intValue7 + 2;
         } else if (this.a_byteArr2[1][this.v] < 127 && (this.a_byteArr2[1][this.v] / 30 != 0 || this.a_byteArr2[1][this.v] % 30 < 14)) {
            this.x += 0 + intValue7;
            this.x = this.x
               + (
                  this.a_byteArr2[1][this.v] >= 90
                     ? 15
                     : (this.spriteData[this.spriteOffsets[281 + intValue7] + this.a_byteArr2[1][this.v] / 30 * 21 + this.a_byteArr2[1][this.v] % 30 + 1] & 255)
                        - (this.spriteData[this.spriteOffsets[281 + intValue7] + this.a_byteArr2[1][this.v] / 30 * 21 + this.a_byteArr2[1][this.v] % 30] & 255)
               );
         }

         if (this.x > intValue3 && this.w > (this.g_shortArr[this.u] & '\uffff') || this.a_byteArr2[1][this.v] == 127) {
            this.u++;
            this.g_shortArr[this.u] = (short)this.w;
            this.h_shortArr[this.u - 1] = (short)(intValue1 + (intValue3 - this.y) * (intValue6 & 1) / 2);
            this.v = this.w - 1;
            this.x = 0;
         }

         if (this.a_byteArr2[1][this.v] == 70 || this.a_byteArr2[1][this.v] == 73 || this.a_byteArr2[1][this.v] == 78) {
            this.w = this.v + 1;
            this.y = this.x;
         }
      }

      if (this.x > 0) {
         this.u++;
         this.h_shortArr[this.u - 1] = (short)(intValue1 + (intValue3 - this.x) * (intValue6 & 1) / 2);
         this.g_shortArr[this.u] = this.a_shortArr2[1][intValue5 + 1];
      }

      this.r = intValue2 + (intValue6 == 3 && this.u * 17 < intValue4 ? (intValue4 - this.u * 17) / 2 : 0);
      this.s = intValue7;
      this.t = intValue4 / 17;
   }

   // $VF: renamed from: a (javax.microedition.lcdui.Graphics, int) void
   final void a_void8(Graphics graphics1, int intValue1) {
      try {
         for (this.k = intValue1; this.k < intValue1 + this.t && this.k < this.u; this.k++) {
            this.m = this.h_shortArr[this.k];

            for (this.l = this.g_shortArr[this.k] & '\uffff'; this.l < (this.g_shortArr[this.k + 1] & '\uffff'); this.l++) {
               if (this.a_byteArr2[1][this.l] != 127) {
                  if (this.a_byteArr2[1][this.l] == 126) {
                     this.m = this.m - (0 + this.s + 2);
                  } else {
                     this.n = this.r + (this.k - intValue1) * 17;
                     if (this.a_byteArr2[1][this.l] > 112) {
                        this.z = this.a_byteArr2[1][this.l] - 112 - 1 + 19;
                        this.a_void3(
                           32,
                           this.n,
                           0,
                           String.valueOf(
                              this.z == 24
                                 ? this.resources.a_shortArr2[0][this.z] * 10 + this.resources.a_int2(65535, 10)
                                 : this.resources.a_shortArr2[0][this.z]
                           ),
                           0
                        );
                        this.a_void3(
                           288,
                           this.n,
                           2,
                           String.valueOf(
                              this.z == 24
                                 ? this.resources.a_shortArr2[1][this.z] * 10 + this.resources.a_int2(65535, 10)
                                 : this.resources.a_shortArr2[1][this.z]
                           ),
                           0
                        );
                     } else {
                        this.z = this.a_byteArr2[1][this.l] / 30;
                        this.A = this.a_byteArr2[1][this.l] % 30;
                        this.o = this.z >= 3
                           ? 15
                           : (this.spriteData[this.spriteOffsets[281 + this.s] + this.z * 21 + this.A + 1] & 255)
                              - (this.spriteData[this.spriteOffsets[281 + this.s] + this.z * 21 + this.A] & 255);
                        this.q = this.m;
                        if (this.z >= 3) {
                           this.resources.a_void7(564 + this.a_byteArr2[1][this.l] - 90, this.q, this.n + -1);
                        } else {
                           if (this.z == 0 && this.A >= 14) {
                              this.n = this.n - this.spriteData[this.spriteOffsets[285] + this.A - 14];
                              this.q = this.q - (0 + (this.o + this.p) / 2);
                           }

                           GameResources.a_bool6(
                              graphics1,
                              this.resources.spriteImages[0][25 + this.s],
                              this.spriteData[this.spriteOffsets[281 + this.s] + this.z * 21 + this.A] & 255,
                              this.spriteData[this.spriteOffsets[284] + this.s * 3 + this.z],
                              this.o,
                              this.spriteData[this.spriteOffsets[283] + this.s * 3 + this.z],
                              0 + this.q,
                              0 + this.n,
                              20
                           );
                        }

                        if (this.z != 0 || this.A < 14) {
                           this.m = this.m + this.o + 0 + this.s;
                        }

                        this.p = this.o;
                     }
                  }
               }
            }

            if (this.k >= this.u - 2 && this.resources.Q_byte == 15 && this.resources.m_byte == 0 && intValue1 + this.t >= this.u) {
               graphics1.setColor(2829233);
               GameResources.a_void20(graphics1, 0 + this.h_shortArr[this.k], 0 + this.n + 17 - 4, this.m - this.h_shortArr[this.k], 0);
            }
         }

         if (intValue1 == 0) {
            this.resources.Q_bool = true;
         } else {
            this.resources.Q_bool = false;
         }

         if (intValue1 + this.t < this.u) {
            this.resources.R_bool = false;
            return;
         }

         this.resources.R_bool = true;
      } catch (Exception ignoredException1) {
      }
   }
}
