import java.io.ByteArrayInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

// $VF: renamed from: a
public final class SoundPlayer implements PlayerListener {
   // $VF: renamed from: a javax.microedition.media.control.VolumeControl
   VolumeControl a_obj_VolumeControl;
   // $VF: renamed from: a javax.microedition.media.Player
   Player a_obj_Player;

   public SoundPlayer(String var1) {
      try {
         ByteArrayInputStream var2 = new ByteArrayInputStream(GameResources.w_byteArr, GameResources.f_shortArr[GameResources.f_byte], GameResources.e_shortArr[GameResources.f_byte]);
         this.a_obj_Player = Manager.createPlayer(var2, var1);
         var2.close();
         this.a_obj_Player.realize();
         this.a_obj_Player.addPlayerListener(this);
      } catch (Exception var3) {
      }
   }

   // $VF: renamed from: c () void
   private void c() {
      try {
         if (this.a_obj_Player != null) {
            if (this.a_obj_Player.getState() == 300) {
               this.a_void();
            }

            if (this.a_obj_Player.getState() != 400) {
               this.a_obj_Player.getState();
               this.a_obj_Player.prefetch();
               this.a_obj_Player.start();
            }
         }
      } catch (Exception var2) {
      }
   }

   // $VF: renamed from: a () void
   final void a_void() {
      try {
         if (this.a_obj_Player != null) {
            if (this.a_obj_Player.getState() == 400) {
               this.a_obj_Player.setMediaTime(0L);
               this.a_obj_Player.stop();
            }
         }
      } catch (Exception var2) {
      }
   }

   // $VF: renamed from: a () int
   final int a_int() {
      return this.a_obj_Player == null ? -1 : this.a_obj_Player.getState();
   }

   // $VF: renamed from: b () void
   final void b() {
      if (this.a_obj_Player != null) {
         if (this.a_obj_Player.getState() != 0) {
            this.a_obj_Player.close();
         }
      }
   }

   // $VF: renamed from: a (int) void
   final void a_void2(int var1) {
      try {
         if (this.a_obj_Player == null) {
            return;
         }

         this.a_obj_VolumeControl = (VolumeControl)this.a_obj_Player.getControl("VolumeControl");
         if (var1 != 0) {
            this.a_obj_VolumeControl.setLevel(var1 * 20);
            if (this.a_obj_Player.getState() != 400) {
               this.c();
            }

            return;
         }

         this.a_void();
      } catch (Exception var3) {
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (var2.equals("deviceUnavailable")) {
         this.a_void();
         System.currentTimeMillis();
      }

      if (var2.equals("deviceAvailable")) {
         this.c();
      }
   }
}
