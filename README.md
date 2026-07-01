# Bộ Lạc Thời Tiền Sử (GAME_AOE_JAVA)

Dự án này là mã nguồn dịch ngược (decompiled) và được tổ chức lại của tựa game di động J2ME nổi tiếng **Bộ Lạc Thời Tiền Sử** (được phân phối bởi các wapsite game di động đời đầu tại Việt Nam như *Hayso1.vn* / *GiaiTri321.Pro*). 

Mục tiêu của dự án này là cung cấp môi trường lập trình giả lập Java SE hiện đại để các nhà phát triển hoặc những người đam mê có thể dễ dàng nghiên cứu kiến trúc game di động cổ điển, phân tích tài nguyên nhị phân, viết các bản mod (cheat, tối ưu hóa AI) và chỉnh sửa dữ liệu bản đồ hay chỉ số trong game.

---

## 📌 Tổng quan về Game

*   **Tên game:** Bộ Lạc Thời Tiền Sử (phiên bản 0.1.30)
*   **Thể loại:** Chiến thuật thời gian thực (RTS - Age of Empires / AOE) trên điện thoại di động sử dụng phím số.
*   **Nền tảng đích:** J2ME (MIDP-2.0 / CLDC-1.0)
*   **Nhà phát triển / Phân phối gốc:** GiaiTri321.Pro / Hayso1.vn
*   **Đặc điểm nổi bật của dự án này:** 
    *   Mã nguồn đã dịch ngược hoàn chỉnh sang Java Standard Edition (định hướng chạy & build trên Java 8 trở lên).
    *   Bổ sung các lớp wrapper hướng đối tượng (OOP helper) thân thiện để tránh việc thao tác trực tiếp với mảng byte phẳng gốc của J2ME.
    *   Tài nguyên game nhị phân đã được giải mã sẵn sang định dạng JSON để dễ dàng can thiệp chỉnh sửa dữ liệu tĩnh.

---

## 📁 Cấu trúc Thư mục & Vai trò của các File

### 1. Mã nguồn Java (`src/`)
Thư mục [src/](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src) chứa toàn bộ logic xử lý của game:

*   **Lớp Khởi chạy & Vòng đời:**
    *   [MainMIDlet.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/MainMIDlet.java): Điểm bắt đầu của ứng dụng J2ME (MIDlet). Quản lý việc chuyển đổi giữa màn hình Splash (logo giới thiệu) và khởi tạo luồng tài nguyên game chính.
*   **Đồ họa & Render:**
    *   [GameCanvas.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameCanvas.java): Kế thừa từ `javax.microedition.lcdui.Canvas`. Lớp này thực hiện nhận tín hiệu từ màn hình đệm và vẽ lên màn hình thiết bị. Đặc biệt, file này tích hợp thuật toán vẽ nội suy lân cận gần nhất (**Nearest-Neighbor Scaling**) giúp co giãn đồ họa game sắc nét trên các màn hình máy tính có độ phân giải cao hơn độ phân giải gốc (320x240).
    *   [GameRenderer.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameRenderer.java): Đảm nhận nhiệm vụ vẽ chi tiết từng sprite hoạt ảnh của nhân vật, công trình, nền đất từ dữ liệu đồ họa nạp vào.
*   **Xử lý Logic & Quản lý Tài nguyên:**
    *   [GameEngine.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameEngine.java): Trọng tâm xử lý logic của game. Quản lý AI của bộ lạc, đường đi của quân lính, cơ chế khai thác tài nguyên (thức ăn, gỗ, đá, vàng) và các điều kiện thắng/thua của màn chơi.
    *   [GameResources.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameResources.java): Đóng vai trò là game loop (vòng lặp game chính chạy trên một luồng riêng biệt) và lưu trữ trạng thái tài nguyên đồ họa/mảng dữ liệu thô của toàn bộ game.
    *   [GameData.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameData.java): Thực hiện việc đọc và giải mã các file dữ liệu nhị phân static (`/pd0`, `/a`, `/ma`) khi khởi tạo game để điền vào các mảng dữ liệu trong `GameResources`.
    *   [SoundPlayer.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/SoundPlayer.java): Quản lý luồng âm thanh và phát các bản nhạc nền định dạng MIDI (`/sounds/sound_*.mid`).

### 2. Bộ Wrapper Hướng đối tượng hỗ trợ Mod (`src/` Helper classes)
Để giảm bớt độ phức tạp khi tương tác với các cấu trúc mảng phẳng tối ưu bộ nhớ của J2ME gốc, dự án đã cung cấp một tầng API hướng đối tượng thân thiện:
*   [GameHelper.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameHelper.java): Cung cấp một điểm truy cập tập trung để lấy các đối tượng trên bản đồ.
*   [GameMap.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameMap.java): Cung cấp các phương thức get/set tile trực quan trên ma trận bản đồ 96x96 thay vì truy cập mảng byte hai chiều thô.
*   [Mob.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/Mob.java): Lớp bọc thông tin thực thể di động (quân lính, thú hoang, nông dân). Giúp lấy/sửa tọa độ `getX()`, `getY()`, lượng máu `getHP()`, kiểm tra trạng thái sống chết `isAlive()` và mục tiêu di chuyển `getTargetX()`, `getTargetY()`.
*   [ResourceObject.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/ResourceObject.java): Lớp bọc thông tin tài nguyên xuất hiện trên bản đồ (rừng cây, mỏ đá). Cung cấp API để kiểm tra loại tài nguyên `getType()` (Gỗ = 6, Đá = 7) và trữ lượng còn lại `getStock()`.

### 3. File Dữ liệu và Bản Giải mã JSON (`src/` Data files)
Dữ liệu của game được lưu dưới dạng nhị phân tối ưu trong thư mục gốc của tài nguyên nhưng cũng đi kèm phiên bản JSON tương ứng đã giải mã phục vụ việc nghiên cứu chỉnh sửa:
*   `a` (Gốc nhị phân) & [a_decoded.json](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/a_decoded.json): Chứa thông số chiều rộng ký tự font chữ và siêu dữ liệu cho các sprite hoạt ảnh.
*   `ma` (Gốc nhị phân) & [ma_decoded.json](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/ma_decoded.json): Chứa dữ liệu các bản đồ của từng màn chơi (`stage_0` đến `stage_4`).
*   `pd0` (Gốc nhị phân) & [pd0_decoded.json](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/pd0_decoded.json): Chứa các mảng dữ liệu tĩnh quy định chỉ số nhân vật, thời gian, nâng cấp công trình và các cấu hình cân bằng trong game.

### 4. Thư mục Công cụ Dữ liệu (`ToolEditData/`)
Thư mục [ToolEditData/](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/ToolEditData) là một dự án Maven riêng biệt ([ToolEditData/pom.xml](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/ToolEditData/pom.xml)) được thiết lập để phát triển công cụ giải mã và mã hóa các tệp tin dữ liệu của game (`a`, `ma`, `pd0`). Hiện tại dự án này chứa tài nguyên thô của game ở thư mục [ToolEditData/Data](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/ToolEditData/Data) phục vụ cho việc nghiên cứu.

### 5. Thư viện Giả lập (`lib/`)
Các file `.jar` trong thư mục [lib/](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/lib) đóng vai trò mock các API của J2ME trên môi trường SE:
*   `midp_2.0.jar` & `cldc_1.0.jar`: Giả lập các gói UI, Threading và IO chuẩn.
*   `jsr135_1.2.jar` & `jsr120_1.1.jar`: Cung cấp API giả lập âm thanh đa phương tiện và tin nhắn SMS.
*   `asm-9.5.jar`: Thư viện thao tác trên bytecode Java.

---

## 🛠️ Hướng dẫn Thiết lập Môi trường & Build Dự án

### Yêu cầu
*   **Java Development Kit (JDK):** Khuyến nghị sử dụng **JDK 8 (1.8)** hoặc mới hơn. Trong cấu hình dự án (`project.properties`), cờ đích biên dịch được đặt là `1.8`.
*   **Apache Ant:** Dùng để chạy build script.
*   **IDE khuyên dùng:** NetBeans IDE (dự án đã được cấu hình sẵn định dạng NetBeans Project).

### Các bước biên dịch dự án bằng Ant
Mở terminal tại thư mục gốc của dự án và chạy:

1.  **Dọn dẹp các tệp tin build cũ:**
    ```bash
    ant clean
    ```
2.  **Biên dịch và đóng gói game:**
    ```bash
    ant jar
    ```
    Sau khi chạy xong, file game được đóng gói `.jar` sẽ xuất hiện tại thư mục `dist/BoLacThoiTienSu.jar`.

---

## 🎮 Hướng dẫn Chạy thử Nghiệm game
Bạn có thể chạy thử trực tiếp tệp tin game sau khi đóng gói bằng cách sử dụng công cụ giả lập được đính kèm ở thư mục gốc:
1.  Chạy tệp tin **[AngelChipEmulator_AutoSleep.jar](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/AngelChipEmulator_AutoSleep.jar)** (đây là một phần mềm giả lập J2ME trên nền Windows).
2.  Kéo thả file `dist/BoLacThoiTienSu.jar` đã build vào cửa sổ emulator để khởi động game.
3.  Sử dụng bàn phím ảo hoặc các phím điều hướng số trên máy tính để trải nghiệm và debug các tính năng của game.

---

## 💡 Hướng dẫn Mod và Lập trình Bổ sung

### Cách 1: Thay đổi chỉ số game tĩnh qua JSON
1.  Chỉnh sửa các giá trị mong muốn trong các tệp tin [ma_decoded.json](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/ma_decoded.json) (để đổi map) hoặc [pd0_decoded.json](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/pd0_decoded.json) (để thay đổi chỉ số lính, máu, lực công kích, hoặc lượng tài nguyên khai thác).
2.  Sử dụng công cụ mã hóa trong `ToolEditData` (hoặc viết script Python/Java tùy chọn) để chuyển đổi lại từ cấu trúc JSON sang định dạng nhị phân thô tương ứng (`ma`, `pd0`).
3.  Ghi đè file nhị phân mới vào thư mục `src/` và chạy build lại dự án.

### Cách 2: Lập trình chức năng mod động (Java code)
Sử dụng lớp bọc [GameHelper.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameHelper.java) để can thiệp trực tiếp vào mã nguồn:
*   **Hack máu lính/nông dân:**
    ```java
    // Lấy mob số 1 và hồi đầy máu cho thực thể đó
    Mob myMob = gameResources.helper.getMob(1);
    if (myMob != null && myMob.isAlive()) {
        myMob.setHP(100); 
    }
    ```
*   **Thay đổi tài nguyên trên map:**
    ```java
    // Thay đổi trữ lượng của tài nguyên ở slot 0
    ResourceObject res = gameResources.helper.getResourceObject(0);
    if (res != null) {
        res.setStock(255); // Tăng số gỗ/đá lên tối đa
    }
    ```
*   Tích hợp các đoạn mã xử lý này vào vòng lặp game chính trong [GameResources.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameResources.java) hoặc logic cập nhật của [GameEngine.java](file:///c:/Users/NamTien/Downloads/ProjectBoLacThoiTienSu/src/GameEngine.java) để tạo ra các tính năng tự động (auto-play), hỗ trợ cheats hoặc nâng cấp AI cho các đối thủ máy.
s