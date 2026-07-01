package Project.src;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: d
public final class GameCanvas extends Canvas {
   byte splashFrameIndex = 0;
   boolean initialized;

   private Image offscreenImage = null;
   private Graphics offscreenGraphics = null;

   public GameCanvas(MainMIDlet midlet) {
      this.setFullScreenMode(true);
      if (GameResources.frameBuffers[0] == null) {
         GameResources.frameBuffers[0] = Image.createImage(350, 272);
         GameResources.frameGraphics[0] = GameResources.frameBuffers[0].getGraphics();
      }
   }

   public final void paint(Graphics graphics) {
      int screenW = this.getWidth();
      int screenH = this.getHeight();
      if (screenW <= 0 || screenH <= 0) {
         screenW = 320;
         screenH = 240;
      }

      if (GameResources.frameBuffers[0] != null) {
         drawScaledImage(graphics, GameResources.frameBuffers[0], 0, 0, screenW, screenH);
      }
   }

   // $VF: renamed from: a () void
   final void a() {
      if (!this.initialized) {
         this.initialized = true;
         if (GameResources.frameBuffers[0] == null) {
            GameResources.frameBuffers[0] = Image.createImage(350, 272);
            GameResources.frameGraphics[0] = GameResources.frameBuffers[0].getGraphics();
         }
      }

      try {
         if (this.splashFrameIndex < 4) {
            GameResources.frameGraphics[0].setColor(16777215);
            GameResources.frameGraphics[0].fillRect(0, 0, 320, 241);
            GameResources.frameGraphics[0].drawImage(Image.createImage("/l" + this.splashFrameIndex), 160, 120, 3);
         }
      } catch (Exception e) {
      }

      this.repaint();
   }

   protected final void keyPressed(int keyCode) {
   }

   public static void drawScaledImage(Graphics graphics, Image image, int destX, int destY, int destWidth, int destHeight) {
      int sourceWidth = image.getWidth();
      int sourceHeight = image.getHeight();
      if (sourceWidth == destWidth && sourceHeight == destHeight) {
         graphics.drawImage(image, destX, destY, 0);
         return;
      }

      int[] sourcePixels = new int[sourceWidth * sourceHeight];
      image.getRGB(sourcePixels, 0, sourceWidth, 0, 0, sourceWidth, sourceHeight);
      int[] scaledPixels = new int[destWidth * destHeight];
      for (int y = 0; y < destHeight; y++) {
         int sourceY = (y * sourceHeight) / destHeight;
         int sourceRowOffset = sourceY * sourceWidth;
         int destRowOffset = y * destWidth;
         for (int x = 0; x < destWidth; x++) {
            int sourceX = (x * sourceWidth) / destWidth;
            scaledPixels[destRowOffset + x] = sourcePixels[sourceRowOffset + sourceX];
         }
      }

      graphics.drawRGB(scaledPixels, 0, destWidth, destX, destY, destWidth, destHeight, true);
   }
}
