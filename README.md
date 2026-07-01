# Bo Lac Thoi Tien Su

Du an ma nguon Java cua game di dong **Bo Lac Thoi Tien Su** phien ban `0.1.30`, duoc to chuc lai tu ma J2ME/MIDP. Repo nay phu hop de nghien cuu co che game Java ME cu, build lai file MIDlet, chay bang emulator va thu nghiem chinh sua tai nguyen/gameplay.

> Luu y: phan lon ma nguon co dau vet decompiled/obfuscated, vi vay nhieu ten bien va ten ham van dang ngan gon nhu `a_void`, `b_int`, `a_byteArr2`. Mot so lop helper da duoc them vao de thao tac voi du lieu game de hon.

## Tong Quan

| Muc | Gia tri |
| --- | --- |
| Ten game | Bo Lac Thoi Tien Su |
| MIDlet version | `0.1.30` |
| MIDlet vendor | `GiaiTri321.Pro` |
| Entry point | `Project.src.MainMIDlet` |
| Nen tang goc | Java ME, MIDP 2.0, CLDC 1.0 |
| Kieu du an | NetBeans Java SE project dung Ant |
| JDK cau hinh | Source/target `1.8` |
| File build ra | `dist/BoLacThoiTienSu.jar` |

## Cau Truc Thu Muc

```text
.
|-- build.xml                         # Ant build script chinh, import nbproject/build-impl.xml
|-- manifest.mf                       # MIDlet metadata
|-- AngelChipEmulator_AutoSleep.jar   # Emulator J2ME di kem de chay thu
|-- lib/                              # Thu vien MIDP/CLDC/JSR va ASM
|-- nbproject/                        # Cau hinh NetBeans/Ant
|-- src/                              # Ma nguon va tai nguyen game
|   |-- MainMIDlet.java               # MIDlet entry point
|   |-- GameCanvas.java               # Man hinh, splash, ve buffer va scale hinh
|   |-- GameResources.java            # Trang thai tong, game loop va vong doi game
|   |-- GameEngine.java               # Logic gameplay chinh
|   |-- GameRenderer.java             # Render sprite/map/UI
|   |-- GameData.java                 # Nap du lieu nhi phan va sprite/resource
|   |-- SoundPlayer.java              # Phat am thanh MIDI
|   |-- GameHelper.java               # API helper de truy cap mob/map/resource
|   |-- GameMap.java                  # Wrapper thao tac tile map
|   |-- Mob.java                      # Wrapper thao tac thuc the di dong
|   |-- ResourceObject.java           # Wrapper thao tac tai nguyen tren map
|   |-- a, ma, pd0                    # File du lieu nhi phan game
|   |-- *_decoded.json                # Ban JSON da giai ma de tham khao/chinh sua
|   |-- pi0/, pi8/, pi9/              # Sprite/image resources
|   |-- sounds/                       # File MIDI
|   `-- 0/ .. 4/                      # Du lieu tung man/map dang text
`-- ToolEditData/
    |-- pom.xml                       # Du an Maven phu, compiler Java 22
    `-- Data/                         # Ban sao/du lieu tho phuc vu nghien cuu tai nguyen
```

## Thanh Phan Chinh

### Vong doi ung dung

- `MainMIDlet.java` la diem khoi dong cua MIDlet. Lop nay tao `GameCanvas`, hien thi cac man splash `l0`, `l1`, `l2`, sau do khoi tao `GameResources`.
- `GameResources.java` giu phan lon trang thai game, quan ly game loop, xu ly pause/resume/destroy va dieu phoi cac thanh phan logic, render, am thanh.
- `GameCanvas.java` ke thua `javax.microedition.lcdui.Canvas`, tao offscreen buffer va scale hinh anh bang nearest-neighbor de game hien thi ro hon tren man hinh lon.

### Du lieu va tai nguyen

- `GameData.java` nap cac resource bang `getResourceAsStream()` va `Image.createImage()`. Cac duong dan quan trong gom `/pd0`, `/a`, `/ma`, `/pi0/...`, `/pi8/...`, `/pi9/...`.
- `a` chua du lieu font/sprite metadata dang nhi phan; `a_decoded.json` la ban giai ma de doc.
- `ma` chua du lieu map/man cho cac stage; `ma_decoded.json` la ban giai ma.
- `pd0` chua nhieu bang du lieu tinh nhu chi so, cau hinh don vi/cong trinh/can bang gameplay; `pd0_decoded.json` la ban giai ma.
- `sounds/sound_0.mid` den `sounds/sound_4.mid` la nhac/am thanh nen dang MIDI.

### Helper phuc vu mod

Repo co mot lop API nho de tranh thao tac truc tiep voi cac mang byte kho doc:

- `GameHelper` gom `getMob(id)`, `getResourceObject(slotId)`, `getMap()`.
- `Mob` doc/sua vi tri, HP va toa do muc tieu cua mob theo slot.
- `ResourceObject` doc/sua loai tai nguyen, tru luong va vi tri.
- `GameMap` doc/sua tile tren map qua `getTileAt(x, y)` va `setTileAt(x, y, value)`.

## Yeu Cau Moi Truong

Can cai:

- JDK 8. Repo dang cau hinh `javac.source=1.8` va `javac.target=1.8`.
- Apache Ant neu muon build bang terminal.
- NetBeans neu muon mo project truc tiep bang IDE.
- Emulator J2ME de chay file `.jar`. Repo co san `AngelChipEmulator_AutoSleep.jar`.

Kiem tra nhanh:

```powershell
java -version
ant -version
```

Trong moi truong hien tai cua repo nay, Java 8 da co san, nhung `ant` chua co trong PATH. Neu `ant -version` bao khong nhan lenh, hay cai Apache Ant hoac build bang NetBeans.

## Build Bang Ant

Tai thu muc goc du an:

```powershell
ant clean
ant jar
```

Sau khi build thanh cong, file JAR nam tai:

```text
dist/BoLacThoiTienSu.jar
```

Neu dung NetBeans:

1. Mo thu muc du an bang NetBeans.
2. Chon project `BoLacThoiTienSu`.
3. Chay `Clean and Build`.
4. Lay file output trong `dist/`.

## Chay Game Bang Emulator

1. Build game de tao `dist/BoLacThoiTienSu.jar`.
2. Mo `AngelChipEmulator_AutoSleep.jar`.
3. Keo tha `dist/BoLacThoiTienSu.jar` vao emulator, hoac mo file JAR tu menu cua emulator neu co.
4. Dung phim dieu huong/phim so cua emulator de choi va debug.

Manifest cua game:

```text
MIDlet-Name: Bo Lac Thoi Tien Su
MIDlet-Version: 0.1.30
MIDlet-Vendor: GiaiTri321.Pro
MIDlet-1: Bo Lac Thoi Tien Su, icon.png, Project.src.MainMIDlet
MicroEdition-Profile: MIDP-2.0
MicroEdition-Configuration: CLDC-1.0
```

## Chinh Sua Va Mod

### 1. Chinh sua bang Java code

Co the them logic vao game loop trong `GameResources.java` hoac cac diem xu ly cua `GameEngine.java`. Khi can thao tac voi mob, map hoac resource, uu tien dung helper:

```java
Mob mob = gameResources.helper.getMob(1);
if (mob != null && mob.isAlive()) {
    mob.setHP(100);
}
```

```java
ResourceObject resource = gameResources.helper.getResourceObject(0);
if (resource != null) {
    resource.setStock(255);
}
```

```java
GameMap map = gameResources.helper.getMap();
if (map.isValidCoordinate(10, 12)) {
    map.setTileAt(10, 12, 6);
}
```

Luu y: cac wrapper nay doc/ghi truc tiep vao mang byte noi bo cua game. Hay kiem tra gioi han index va gia tri truoc khi thay doi hang loat.

### 2. Chinh sua du lieu tinh

Co the doc cac file JSON da giai ma:

- `src/a_decoded.json`
- `src/ma_decoded.json`
- `src/pd0_decoded.json`

Quy trinh thuong dung:

1. Chinh sua JSON hoac file text map trong `src/0` den `src/4`.
2. Ma hoa/chuyen doi lai ve dinh dang nhi phan tuong ung (`a`, `ma`, `pd0`).
3. Ghi de file nhi phan trong `src/`.
4. Build lai JAR.

`ToolEditData/` la khu vuc phu de phat trien cong cu doc/ghi du lieu. `pom.xml` cua tool nay dang cau hinh Java 22:

```xml
<maven.compiler.source>22</maven.compiler.source>
<maven.compiler.target>22</maven.compiler.target>
```

Neu may chi co JDK 8, phan game chinh van phu hop, nhung tool Maven nay can JDK 22 hoac can ha cau hinh compiler neu ban muon build tool.

## Cac File Tai Nguyen Quan Trong

| File/thu muc | Vai tro |
| --- | --- |
| `src/icon.png` | Icon MIDlet |
| `src/l0`, `src/l1`, `src/l2` | Splash resources duoc load bang `/l0`, `/l1`, `/l2` |
| `src/l0.png`, `src/l1.png`, `src/l2.png` | Ban anh PNG tham khao/cung cap kem |
| `src/pi0/` | Nhom sprite chinh, `GameData` dang ky 31 slot |
| `src/pi9/` | Nhom sprite phu, `GameData` dang ky 6 slot |
| `src/pi8/` | Nhom sprite phu, `GameData` dang ky 12 slot |
| `src/sounds/` | Am thanh MIDI |
| `src/a` | Du lieu nhi phan cho font/sprite metadata |
| `src/ma` | Du lieu nhi phan map/stage |
| `src/pd0` | Du lieu nhi phan gameplay/static tables |

## Loi Thuong Gap

### `ant` is not recognized

Ant chua duoc cai hoac chua them vao PATH. Cai Apache Ant, them `ANT_HOME` va `%ANT_HOME%\bin` vao PATH, sau do mo terminal moi va kiem tra lai:

```powershell
ant -version
```

### Khong load duoc hinh hoac am thanh

Kiem tra file resource co nam dung trong `src/` va co duong dan dung khong. Code load resource theo dang tuyet doi trong classpath, vi du:

```java
Image.createImage("/pi0/image_0.png");
getClass().getResourceAsStream("/sounds/sound_0.mid");
```

Neu doi ten file hoac doi thu muc, can sua duong dan trong code.

### Build duoc nhung emulator khong chay

Kiem tra `manifest.mf`, dac biet dong:

```text
MIDlet-1: Bo Lac Thoi Tien Su, icon.png, Project.src.MainMIDlet
```

Class `MainMIDlet` phai nam dung package `Project.src`, va file JAR phai gom du resource trong `src/`.

### ToolEditData khong build duoc bang JDK 8

Tool phu dang dat Java 22 trong `ToolEditData/pom.xml`. Dung JDK 22 cho tool, hoac sua `maven.compiler.source/target` neu code tool khong dung tinh nang Java moi.

## Ghi Chu Phat Trien

- Dung UTF-8 khi sua tai lieu va ma nguon moi.
- Han che doi ten hang loat trong cac file decompiled neu chua co test/emulator de kiem tra.
- Khi sua cac mang byte trong gameplay, nen ghi lai offset va y nghia cua offset vao comment ngan gon.
- Nen build va chay emulator sau moi thay doi lien quan den `GameData`, `GameResources`, `GameEngine` hoac resource trong `src/`.
- Repo hien chua co test tu dong trong `test/`, vi vay emulator la kenh kiem thu quan trong nhat.

## Trang Thai Kiem Tra

- Da doc cau hinh NetBeans/Ant trong `build.xml`, `nbproject/project.properties`, `nbproject/project.xml`.
- Da doc manifest MIDlet trong `manifest.mf`.
- Da doc cac lop chinh trong `src/`, gom entrypoint, canvas, resource loader, sound va helper.
- Da kiem tra Java tren may hien tai: co Java 8.
- Chua chay duoc `ant jar` trong moi truong hien tai vi lenh `ant` chua co trong PATH.
