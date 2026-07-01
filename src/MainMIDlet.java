package Project.src;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MainMIDlet extends MIDlet implements Runnable {
   GameResources gameResources;
   GameCanvas splashCanvas;
   Display display;

   public void startApp() {
      if (this.gameResources != null) {
         this.gameResources.e_void5();
      } else {
         this.display = Display.getDisplay(this);
         new Thread(this).start();
      }
   }

   public void pauseApp() {
      if (this.gameResources != null) {
         this.gameResources.d_void7();
      }
   }

   public void destroyApp(boolean flag1) {
      if (this.gameResources != null) {
         this.gameResources.b_void();
      }
   }

   // $VF: renamed from: run () void
   public void run() {
      System.gc();
      Thread.yield();
      this.splashCanvas = new GameCanvas(this);
      this.splashCanvas.a();
      this.splashCanvas.splashFrameIndex = 0;
      this.display.setCurrent(this.splashCanvas);
      a(1000);
      this.splashCanvas.a();
      a(2000);
      this.splashCanvas.splashFrameIndex = 1;
      this.splashCanvas.a();
      System.gc();
      Thread.yield();
      a(2000);
      this.splashCanvas.splashFrameIndex = 2;
      this.splashCanvas.a();
      Thread.yield();
      this.splashCanvas.splashFrameIndex = 5;
      this.gameResources = new GameResources(this);
      this.gameResources.a_void();
   }

   // $VF: renamed from: a (int) void
   static void a(int delayMillis) {
      try {
         Thread.sleep(delayMillis);
      } catch (InterruptedException ignoredException1) {
      }
   }
}
