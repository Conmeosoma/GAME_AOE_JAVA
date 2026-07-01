package Project.src;

import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

// $VF: renamed from: a
public final class SoundPlayer implements PlayerListener {
   VolumeControl volumeControl;
   Player player;

   public SoundPlayer(String contentType) {
      try {
         java.io.InputStream soundStream = this.getClass().getResourceAsStream("/sounds/sound_" + GameResources.f_byte + ".mid");
         this.player = Manager.createPlayer(soundStream, contentType);
         this.player.realize();
         this.player.addPlayerListener(this);
      } catch (Exception ignoredException1) {
         System.err.println("Failed to load sound: " + GameResources.f_byte);
      }
   }

   // $VF: renamed from: c () void
   private void c() {
      try {
         if (this.player != null) {
            if (this.player.getState() == 300) {
               this.a_void();
            }

            if (this.player.getState() != 400) {
               this.player.getState();
               this.player.prefetch();
               this.player.start();
            }
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: a () void
   final void a_void() {
      try {
         if (this.player != null) {
            if (this.player.getState() == 400) {
               this.player.setMediaTime(0L);
               this.player.stop();
            }
         }
      } catch (Exception ignoredException1) {
      }
   }

   // $VF: renamed from: a () int
   final int a_int() {
      return this.player == null ? -1 : this.player.getState();
   }

   // $VF: renamed from: b () void
   final void b() {
      if (this.player != null) {
         if (this.player.getState() != 0) {
            this.player.close();
         }
      }
   }

   // $VF: renamed from: a (int) void
   final void a_void2(int volumeLevel) {
      try {
         if (this.player == null) {
            return;
         }

         this.volumeControl = (VolumeControl)this.player.getControl("VolumeControl");
         if (volumeLevel != 0) {
            this.volumeControl.setLevel(volumeLevel * 20);
            if (this.player.getState() != 400) {
               this.c();
            }

            return;
         }

         this.a_void();
      } catch (Exception ignoredException1) {
      }
   }

   public final void playerUpdate(Player player, String event, Object eventData) {
      if (event.equals("deviceUnavailable")) {
         this.a_void();
         System.currentTimeMillis();
      }

      if (event.equals("deviceAvailable")) {
         this.c();
      }
   }
}
