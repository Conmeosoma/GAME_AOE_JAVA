package Project.src;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: d
public final class GameCanvas extends Canvas {
   byte a_byte = 0;
   boolean a_bool;

   private Image offscreenImage = null;
   private Graphics offscreenGraphics = null;

   public GameCanvas(MainMIDlet var1) {
      this.setFullScreenMode(true);
      if (GameResources.a_obj_ImageArr[0] == null) {
         GameResources.a_obj_ImageArr[0] = Image.createImage(350, 272);
         GameResources.a_obj_GraphicsArr[0] = GameResources.a_obj_ImageArr[0].getGraphics();
      }
   }

   public final void paint(Graphics var1) {
      int screenW = this.getWidth();
      int screenH = this.getHeight();
      if (screenW <= 0 || screenH <= 0) {
         screenW = 320;
         screenH = 240;
      }
      
      if (GameResources.a_obj_ImageArr[0] != null) {
         drawScaledImage(var1, GameResources.a_obj_ImageArr[0], 0, 0, screenW, screenH);
      }
   }

   // $VF: renamed from: a () void
   final void a() {
      if (!this.a_bool) {
         this.a_bool = true;
         if (GameResources.a_obj_ImageArr[0] == null) {
            GameResources.a_obj_ImageArr[0] = Image.createImage(350, 272);
            GameResources.a_obj_GraphicsArr[0] = GameResources.a_obj_ImageArr[0].getGraphics();
         }
      }
      
      try {
         if (this.a_byte < 4) {
            GameResources.a_obj_GraphicsArr[0].setColor(16777215);
            GameResources.a_obj_GraphicsArr[0].fillRect(0, 0, 320, 241);
            GameResources.a_obj_GraphicsArr[0].drawImage(Image.createImage("/l" + this.a_byte), 160, 120, 3);
         }
      } catch (Exception e) {
      }
      
      this.repaint();
   }

   protected final void keyPressed(int var1) {
   }

   // High quality Nearest-Neighbor Scaling Helper
   public static void drawScaledImage(Graphics g, Image img, int dx, int dy, int dw, int dh) {
      int sw = img.getWidth();
      int sh = img.getHeight();
      if (sw == dw && sh == dh) {
         g.drawImage(img, dx, dy, 0);
         return;
      }
      int[] raw = new int[sw * sh];
      img.getRGB(raw, 0, sw, 0, 0, sw, sh);
      int[] scaled = new int[dw * dh];
      for (int y = 0; y < dh; y++) {
         int srcY = (y * sh) / dh;
         int srcRowOffset = srcY * sw;
         int destRowOffset = y * dw;
         for (int x = 0; x < dw; x++) {
            int srcX = (x * sw) / dw;
            scaled[destRowOffset + x] = raw[srcRowOffset + srcX];
         }
      }
      g.drawRGB(scaled, 0, dw, dx, dy, dw, dh, true);
   }
}