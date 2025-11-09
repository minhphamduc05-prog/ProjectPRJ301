INSERT INTO [dbo].[Users]([name],[email],[password],[phone],[address],[role])
VALUES
('Admin1','admin1@gmail.com','admin123','999999999','VietNam','Admin'),
('Admin2','admin2@gmail.com','admin456','999999999','VietNam','Admin'),
('Pham Duc Minh','minhpd123@gmail.com','123456','0829698987',Null,'User'),
('Kiet Ha Doan','kiethd123@gmail.com','123456','069696969',Null,'User'),
('Hoang Minh Tu','tuhm123@gmail.com','123456','036363636','Thach That','User'),
('Hong Thai','thaihp123@gmail.com','123456','018181818',Null,'User');

INSERT INTO [dbo].[Categories](catName)
VALUES ('LAPTOP'),('SMARTPHONE'),('ACCESSORY');

INSERT INTO [dbo].[Factories](factoryName)
VALUES ('ASUS'),('LENOVO'),('GIGABYTE'),
	('APPLE'),('SAMSUNG'),('OPPO');

INSERT INTO [dbo].[Products]([productName],[price],[quantity],[image],[description],[catID],[factoryID])
VALUES
('ASUS VivoBook 15', 17800000, 10, 'asus_vivobook15.jpg',
'Màn hình: 15.6", Full HD (1920 x 1080) | CPU: Ryzen 5 7520U, 2.80 GHz (Lên đến 4.30 GHz khi tải nặng)
| Card: Radeon | Chất liệu: Vỏ nhựa | Khối lượng: 1.63 kg', 1, 1),

('ASUS TUF Gaming F15', 18900000, 8, 'asus_tufgamingf15.jpg',
'Màn hình: 16", Full HD+, 144Hz | CPU: Core i5-210H, 2.20 GHz (Lên đến 4.80 GHz khi tải nặng)
| Card: RTX 3050 6GB | Chất liệu: Vỏ nhựa - nắp lưng bằng kim loại | Khối lượng: 2.2 kg', 1, 1),

('ASUS VivoBook 16', 19500000, 5, 'asus_vivobook16.jpg',
'Màn hình: 16", WUXGA (1920 x 1200), 144Hz | CPU: i5-13420H, 2.10 GHz (Lên đến 4.60 GHz khi tải nặng)
| Card: RTX 3050 4GB | Chất liệu: Vỏ nhựa - nắp lưng bằng kim loại | Khối lượng: 1.8 kg', 1, 1),


-- LENOVO (factoryID = 2)
('Lenovo IdeaPad 3', 15000000, 12, 'lenovo_ideapad3.jpg',
'Màn hình: 15.3", WUXGA (1920 x 1200) | CPU: i5-13420H, 2.10 GHz (Lên đến 4.60 GHz khi tải nặng)
| Card: Intel UHD | Chất liệu: Vỏ nhựa - nắp lưng bằng kim loại | Khối lượng: 1.63 kg', 1, 2),

('Lenovo Gaming LOQ', 20900000, 6, 'lenovo_gamingloq.jpg',
'Màn hình: 15.6", Full HD (1920 x 1080), 144Hz | CPU: i5-12450HX, Lên đến 4.40 GHz khi tải nặng
| Card: RTX 3050 6GB | Chất liệu: Vỏ nhựa | Khối lượng: 1.77 kg', 1, 2),

('Lenovo Legion 5', 12000000, 7, 'lenovo_legion5.jpg',
'Màn hình: 14", Full HD (1920 x 1080) | CPU: Ryzen 5 7520U, 2.80 GHz (Lên đến 4.30 GHz khi tải nặng)
| Card: Radeon | Chất liệu: Vỏ nhựa | Khối lượng: 1.37 kg', 1, 2),


-- GIGABYTE (factoryID = 3)
('Gigabyte G5 Gaming', 21700000, 9, 'gigabyte_g5gaming.jpg',
'Màn hình: 15.6", Full HD (1920 x 1080), 144Hz | CPU: i5-13500H, 2.60 GHz (Lên đến 4.70 GHz khi tải nặng)
| Card: RTX 4050 6GB | Chất liệu: Vỏ nhựa | Khối lượng: 2.115 kg', 1, 3),

('Gigabyte A16', 23390000, 3, 'gigabyte_a16.jpg',
'Màn hình: 16", WUXGA (1920 x 1200), 165Hz | CPU: i5-13420H, 2.10 GHz (Lên đến 4.60 GHz khi tải nặng)
| Card: RTX 4050 6GB | Chất liệu: Vỏ nhựa | Khối lượng: 2.2 kg', 1, 3),

('Gigabyte AORUS 15', 24000000, 6, 'gigabyte_aorus15.jpg',
'Màn hình: 16", WUXGA (1920 x 1200), 165Hz | CPU: i7-13620H, 2.40 GHz (Lên đến 4.90 GHz khi tải nặng)
| Card: RTX 4050 6GB | Chất liệu: Vỏ nhựa | Khối lượng: 2.292 kg', 1, 3),

-- iPhone (factoryID = 4)
('iPhone 14 Pro Max', 29990000, 10, 'iphone14promax.jpg',
'Chip A16 Bionic | RAM: 6 GB | Dung lượng: 128 GB | Camera sau: Chính 48 MP & Phụ 12 MP, 12 MP | Camera trước: 12 MP | Pin 4323 mAh, Sạc 27 W',2, 4),

('iPhone 13', 18990000, 15, 'iphone13.jpg',
'Chip A15 Bionic | RAM: 4 GB | Dung lượng: 128 GB | Camera sau: Chính 12 MP & Phụ 12 MP | Camera trước: 12 MP | Pin 3240 mAh, Sạc 20 W', 2, 4),

('iPhone SE 2022', 11990000, 20, 'iphonese2022.jpg',
'Chip A15 Bionic | RAM: 4 GB | Dung lượng: 64 GB | Camera sau: Chính 12 MP | Camera trước: 7 MP | Pin 2018 mAh, Sạc 20 W', 2, 4),


-- Samsung (factoryID = 5)
('Samsung Galaxy S23 Ultra', 26990000, 12, 's23ultra.jpg',
'Chip Snapdragon 8 Gen 2 | RAM: 8 GB | Dung lượng: 256 GB | Camera sau: Chính 200 MP & Phụ 12 MP, 10 MP, 10 MP | Camera trước: 12 MP | Pin 5000 mAh, Sạc 45 W', 2, 5),

('Samsung Galaxy A54', 8990000, 18, 'galaxya54.jpg',
'Chip Exynos 1380 8 nhân | RAM: 8 GB | Dung lượng: 128 GB | Camera sau: Chính 50 MP & Phụ 12 MP, 5 MP | Camera trước: 32 MP | Pin 5000 mAh, Sạc 25 W', 2, 5),

('Samsung Galaxy Z Flip5', 22990000, 8, 'zflip5.jpg',
'Chip Snapdragon 8 Gen 2 | RAM: 8 GB | Dung lượng: 256 GB | Camera sau: Chính 12 MP & Phụ 12 MP | Camera trước: 10 MP | Pin 3700 mAh, Sạc 25 W', 2, 5),


-- Oppo (factoryID = 6)
('OPPO Find X5 Pro', 20990000, 10, 'findx5pro.jpg',
'Chip Snapdragon 8 Gen 1 | RAM: 12 GB | Dung lượng: 256 GB | Camera sau: Chính 50 MP & Phụ 50 MP, 13 MP | Camera trước: 32 MP | Pin 5000 mAh, Sạc 80 W', 2, 6),

('OPPO Reno10 Pro+', 15990000, 14, 'reno10pro+.jpg',
'Chip Snapdragon 8+ Gen 1 | RAM: 12 GB | Dung lượng: 256 GB | Camera sau: Chính 50 MP & Phụ 64 MP, 8 MP | Camera trước: 32 MP | Pin 4700 mAh, Sạc 100 W', 2, 6),

('OPPO A78', 6490000, 25, 'oppoa78.jpg',
'Chip Snapdragon 680 | RAM: 8 GB | Dung lượng: 256 GB | Camera sau: Chính 50 MP & Phụ 2 MP | Camera trước: 8 MP | Pin 5000 mAh, Sạc 67 W', 2, 6),


-- ASUS (factoryID = 1)
('ASUS ROG Cetra II Core', 1490000, 20, 'asus_rogetcraiicore.jpg',
'Tai nghe gaming in-ear | Kết nối 3.5mm | Driver 9mm | Micro chống ồn AI | Phụ kiện cho game thủ', 3, 1),

('ASUS ROG Delta S', 4290000, 12, 'asus_rogdeltas.jpg',
'Tai nghe gaming công nghệ MQA | USB-C | Âm thanh vòm 7.1 | Micro AI Noise-Canceling', 3, 1),

('ASUS ROG Strix Go BT', 3490000, 15, 'asus_rogstrixgobt.jpg',
'Tai nghe Bluetooth gaming | Pin 45 giờ | Chống ồn AI | Hỗ trợ PC/Console/Mobile', 3, 1),


-- APPLE (factoryID = 4)
('Apple AirPods 3', 4190000, 25, 'airpods3.jpg',
'Tai nghe Bluetooth | Âm thanh Spatial Audio | Pin 6 giờ | Sạc MagSafe', 3, 4),

('Apple AirPods Pro 2', 5990000, 18, 'airpodspro2.jpg',
'Tai nghe Bluetooth chống ồn chủ động ANC | Adaptive Audio | Pin 6 giờ | Sạc MagSafe/USB-C', 3, 4),

('Apple HomePod Mini', 2990000, 10, 'homepodmini.jpg',
'Loa thông minh Siri | Âm thanh 360° | Wi-Fi | Kết nối đa phòng | Tương thích HomeKit', 3, 4),


-- SAMSUNG (factoryID = 5)
('Samsung Galaxy Buds FE', 1990000, 22, 'galaxybudsfe.jpg',
'Tai nghe Bluetooth | Chống ồn ANC | Pin 30 giờ | Tương thích Android & iOS', 3, 5),

('Samsung Galaxy Buds 2 Pro', 4490000, 14, 'galaxybuds2pro.jpg',
'Tai nghe Bluetooth Hi-Fi 24bit | ANC thông minh | Pin 29 giờ | Chống nước IPX7', 3, 5),

('Samsung Soundbar HW-C450', 3990000, 8, 'samsung_soundbar_c450.jpg',
'Loa soundbar 2.1 kênh | Công suất 300W | Bluetooth | Hỗ trợ Game Mode & Bass Boost', 3, 5);



