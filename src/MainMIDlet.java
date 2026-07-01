package Project.src;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MainMIDlet extends MIDlet implements Runnable {
   // $VF: renamed from: a f
   GameResources a_obj_f;
   // $VF: renamed from: a d
   GameCanvas a_obj_d;
   // $VF: renamed from: a javax.microedition.lcdui.Display
   Display a_obj_Display;

   public void startApp() {
      if (this.a_obj_f != null) {
         this.a_obj_f.e_void5();
      } else {
         this.a_obj_Display = Display.getDisplay(this);
         new Thread(this).start();
      }
   }

   public void pauseApp() {
      if (this.a_obj_f != null) {
         this.a_obj_f.d_void7();
      }
   }

   public void destroyApp(boolean var1) {
      if (this.a_obj_f != null) {
         this.a_obj_f.b_void();
      }
   }

   // $VF: renamed from: run () void
   public void run() {
      System.gc();
      Thread.yield();
      this.a_obj_d = new GameCanvas(this);
      this.a_obj_d.a();
      this.a_obj_d.a_byte = 0;
      this.a_obj_Display.setCurrent(this.a_obj_d);
      a(1000);
      this.a_obj_d.a();
      a(2000);
      this.a_obj_d.a_byte = 1;
      this.a_obj_d.a();
      System.gc();
      Thread.yield();
      a(2000);
      this.a_obj_d.a_byte = 2;
      this.a_obj_d.a();
      Thread.yield();
      this.a_obj_d.a_byte = 5;
      this.a_obj_f = new GameResources(this);
      this.a_obj_f.a_void();
   }

   // $VF: renamed from: a (int) void
   static void a(int var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var2) {
      }
   }
}
