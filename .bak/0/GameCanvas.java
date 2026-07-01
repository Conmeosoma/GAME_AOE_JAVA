import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $VF: renamed from: d
public final class GameCanvas extends Canvas {
   // $VF: renamed from: a byte
   byte a_byte = 0;
   // $VF: renamed from: a boolean
   boolean a_bool;

   public GameCanvas(MainMIDlet var1) {
      this.setFullScreenMode(true);
   }

   public final void paint(Graphics var1) {
      var1.drawImage(GameResources.a_obj_ImageArr[0], 0, 0, 0);
   }

   // $VF: renamed from: a () void
   final void a() {
      if (!this.a_bool) {
         this.a_bool = true;
         GameResources.a_obj_ImageArr[0] = Image.createImage(350, 272);
         GameResources.a_obj_GraphicsArr[0] = GameResources.a_obj_ImageArr[0].getGraphics();
      }

      try {
         if (this.a_byte < 4) {
            GameResources.a_obj_GraphicsArr[0].setColor(16777215);
            b();
            GameResources.a_obj_GraphicsArr[0].drawImage(Image.createImage("/l" + this.a_byte), 160, 120, 3);
         }
      } catch (Exception var2) {
      }

      this.repaint();
   }

   // $VF: renamed from: b () void
   private static void b() {
      GameResources.a_obj_GraphicsArr[0].fillRect(0, 0, 320, 241);
   }

   protected final void keyPressed(int var1) {
   }
}
