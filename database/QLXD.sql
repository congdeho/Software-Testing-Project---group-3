Create Database QLXD
USE QLXD

CREATE TABLE [TaiKhoan] (
  [MaTK] int IDENTITY(1,1) PRIMARY KEY,
  [TenTK] nvarchar(20) UNIQUE NOT NULL,
  [MatKhau] nvarchar(20) DEFAULT (NULL),
  [MaQuyen] int NOT NULL,
  [NgayTao] date DEFAULT (NULL),
  [TinhTrang] BIT 
)
GO

CREATE TABLE [TheLoai] (
  [MaTL] int IDENTITY(1,1) Primary key,
  [TenTL] nvarchar(50) DEFAULT (NULL),
  [TinhTrang] BIT 
)
GO

CREATE TABLE [HoaDon] (
  [MaHD] int IDENTITY(1,1) Primary key,
  [TenTK] nvarchar(20) DEFAULT (NULL),
  [NgayTao] date DEFAULT (NULL),
  [TongTien] float DEFAULT (NULL),
)
GO



CREATE TABLE [ChiTietHoaDon] (
  [MaHD] int ,
  [MaSP] int ,
  [DonGia] float DEFAULT (NULL),
  [SoLuong] int DEFAULT (NULL),
  Primary key([MaSP],[MaHD])
)
GO

CREATE TABLE [PhieuNhap] (
  [MaPN] int IDENTITY(1,1) Primary key,
  [MaNCC] int DEFAULT (NULL),
  [TenTK] nvarchar(20) DEFAULT (NULL),
  [NgayTao] date DEFAULT (NULL),
  [TongTien] float DEFAULT (NULL),
  [TinhTrang] BIT 
)
GO

CREATE TABLE [ChiTietPhieuNhap] (
  [MaPN]  int,
  [MaSP] int,
  [DonGiaNhap] float DEFAULT (NULL),
  [SoLuong] int DEFAULT (NULL),
  Primary key([MaSP],[MaPN]),
  [TinhTrang] BIT,
)
GO

CREATE TABLE [ChucNang] (
  [MaCN] int IDENTITY(1,1) PRIMARY KEY,
  [TenCN] nvarchar(50) DEFAULT (NULL),
  [TinhTrang] BIT DEFAULT (NULL),
  [Them] int NULL,
  [Sua] int NULL,
  [Xoa] int NULL,
  [Doc] int NULL
);
GO

CREATE TABLE [SanPham] (
  [MaSP] int IDENTITY(1,1) Primary key,
  [MaTL] int  DEFAULT (NULL),
  [TenSP] nvarchar(50) DEFAULT (NULL),
  [HinhAnh] nvarchar(255) DEFAULT (NULL),
  [DonGia] float DEFAULT (NULL),
  [SoLuong] int DEFAULT (NULL),
  [NhaSanXuat] nvarchar(255),
  [TinhTrang] BIT DEFAULT (NULL)
)
GO

CREATE TABLE [NhomQuyen] (
  [MaNQ] int IDENTITY(1,1) Primary key,
  [TenNQ] nvarchar(50) DEFAULT (NULL),
  [MoTa] nvarchar(255) DEFAULT (NULL),
  [TinhTrang] BIT NOT NULL
)
GO

CREATE TABLE [ChiTietQuyen] (
  [MaCTQ] int IDENTITY(1,1) Primary key,
  [MaQuyen] int,
  [MaCN] int,
  [HanhDong] nvarchar(100) DEFAULT (NULL),
  [TinhTrang] BIT DEFAULT (NULL) 
)
GO

CREATE TABLE [NhanVien] (
  [MaNV] nvarchar(20) PRIMARY KEY NOT NULL,
  [TenNV] nvarchar(50) DEFAULT (NULL),
  [SDT] nvarchar(11) DEFAULT (NULL),
  [GioiTinh] nvarchar(10) DEFAULT (NULL),
  [DiaChi] nvarchar(255) DEFAULT (NULL),
  [Email] nvarchar(100) DEFAULT (NULL),  
  [TinhTrang] nvarchar(30)
)
GO

CREATE TABLE [NhaCungCap] (
  [MaNCC] int IDENTITY(1,1) Primary key,
  [TenNCC] nvarchar(255) DEFAULT (NULL),
  [SDT] nvarchar(11) DEFAULT (NULL),
  [DiaChi] nvarchar(355) DEFAULT (NULL),
  [TinhTrang] BIT DEFAULT (NULL)
)
GO

ALTER TABLE [SanPham] ADD FOREIGN KEY ([MaTL]) REFERENCES [TheLoai] ([MaTL])
GO

ALTER TABLE [PhieuNhap] ADD FOREIGN KEY ([MaNCC]) REFERENCES [NhaCungCap] ([MaNCC])
GO

ALTER TABLE [PhieuNhap] ADD FOREIGN KEY ([TenTK]) REFERENCES [TaiKhoan] ([TenTK])
GO

ALTER TABLE [ChiTietPhieuNhap] ADD FOREIGN KEY ([MaSP]) REFERENCES [SanPham] ([MaSP])
GO

ALTER TABLE [ChiTietHoaDon] ADD FOREIGN KEY ([MaSP]) REFERENCES [SanPham] ([MaSP])
GO

ALTER TABLE [ChiTietPhieuNhap] ADD FOREIGN KEY ([MaPN]) REFERENCES [PhieuNhap] ([MaPN])
GO

ALTER TABLE [ChiTietHoaDon] ADD FOREIGN KEY ([MaHD]) REFERENCES [HoaDon] ([MaHD])
GO

ALTER TABLE [HoaDon] ADD FOREIGN KEY ([TenTK]) REFERENCES [TaiKhoan] ([TenTK])
GO

ALTER TABLE [TaiKhoan] ADD FOREIGN KEY ([TenTK]) REFERENCES [NhanVien] ([MaNV])
GO

ALTER TABLE [TaiKhoan] ADD FOREIGN KEY ([MaQuyen]) REFERENCES [NhomQuyen] ([MaNQ])
GO

ALTER TABLE [ChiTietQuyen] ADD FOREIGN KEY ([MaQuyen]) REFERENCES [NhomQuyen] ([MaNQ])
GO

ALTER TABLE [ChiTietQuyen] ADD FOREIGN KEY ([MaCN]) REFERENCES [ChucNang] ([MaCN])
GO

INSERT INTO TaiKhoan(TenTK, MatKhau, MaQuyen, NgayTao, TinhTrang)
VALUES
('NV001', '123456', 1, '2024-03-22', 1), --admin
('NV002', '123456', 2, '2024-04-22', 1), --Quản lý
('NV003', '123456', 2, '2024-04-22', 1),
('NV004', '123456', 3, '2024-04-22', 1), --Bán hàng
('NV005', '123456', 3, '2024-04-26', 1),
('NV006', '123456', 3, '2024-05-27', 0),
('NV007', '123456', 4, '2024-05-28', 1), --Thủ kho
('NV008', '123456', 4, '2024-05-29', 1),
('NV009', '123456', 4, '2024-05-22', 1),
('NV010', '123456', 4, '2024-05-22', 0);

INSERT INTO TheLoai(TenTL, TinhTrang)
VALUES
(N'Vật liệu thô', 1),
(N'Vật liệu hoàn hiện', 1),
(N'Vật liệu nội thất', 1);


INSERT INTO HoaDon(TenTK, NgayTao, TongTien)
VALUES
('NV004', '2024-03-30', 140.000),
('NV002', '2024-04-23', 340.000),
('NV004', '2024-04-24', 130.000),
('NV004', '2024-03-25', 310.000),
('NV004', '2024-01-26', 230.000),
('NV004', '2024-05-27', 180.000),
('NV004', '2024-02-28', 480.000),
('NV004', '2024-03-29', 210.000);


INSERT INTO ChiTietHoaDon(MaHD,MaSP, DonGia, SoLuong)
VALUES
(2, 1, 140.000, 1),
(3, 2, 340.000, 1),
(4, 3, 130.000, 1),
(5, 4, 310.000, 1),
(6, 5, 230.000, 1),
(7, 6, 180.000, 1),
(8, 7, 480.000, 1);


INSERT INTO PhieuNhap(MaNCC, TenTK, NgayTao, TongTien, TinhTrang)
VALUES
(1, 'NV007', '2022-09-22', 2500.000, 1),
(2, 'NV009', '2022-09-23', 1800.000, 1),
(3, 'NV008', '2022-09-24', 3600.000, 1),
(4, 'NV007', '2022-09-25', 2000.000, 1),
(5, 'NV009', '2022-09-26', 3500.000, 1),
(6, 'NV008', '2022-09-27', 4800.000, 1),
(3, 'NV007', '2022-09-28', 2800.000, 1),
(4, 'NV009', '2022-09-29', 1800.000, 1);



INSERT INTO ChiTietPhieuNhap(MaSP, MaPN, DonGiaNhap, SoLuong)
VALUES
(2, 1, 250.000, 10),
(6, 2, 180.000, 10),
(15, 3, 180.00, 20),
(8, 4, 200.000, 10),
(9, 5, 350.000, 10),
(22, 6, 180.000, 30),
(26, 7, 140.000, 20);

INSERT INTO SanPham(MaTL, TenSP, HinhAnh, DonGia, SoLuong,NhaSanXuat,TinhTrang)
VALUES
(1, N'Cát', N'sp01.jpg', 140.000, 50, N'Công Ty Becamex IDC Corporation' ,1),
(1, N'Đá ', N'sp02.jpg', 340.000, 40, N'Tập đoàn Viglacera. Viglacera ', 1),
(1, N'Sắt', N'sp03.jpg', 130.000, 60, N'Tập đoàn Hòa Phát', 1),
(1, N'Thép', N'sp04.jpg', 310.000, 30, N'Tập đoàn Hòa Phát',  0),
(1, N'Gạch Óng', N'sp05.jpg', 230.000, 70, N'Viglacera Corporation', 1),
(1, N'Xi Măng', N'sp06.jpg', 180.000, 45, N'Tập đoàn Xi măng Vicem',  1),
(2, N'Nước Sơn', N'sp07.jpg', 480.000, 55, N'Jotun Vietnam', 0),
(1, N'Gỗ Xây dựng', N'sp08.jpg', 210.00, 38, N'Tập đoàn Trường Thành', 1),
(2, N'Tôn', N'sp09.jpg', 500.000, 48, N'Tập đoàn Hoa Sen', 1),
(2, N'Tấm Cách Nhiệt', N'sp10.jpg', 310.000, 42, N'Tập đoàn Hoa Sen', 0),
(2, N'Óng Nước', N'sp11.jpg', 340.000, 50, N'Tập đoàn Binh Minh ',1),
(2, N'Kính Cường Lực', N'sp12.jpg', 340.000, 40, N'Công ty TNHH Sản xuất Kính Mặt Trời',1),
(2, N'La Phông', N'sp13.jpg', 230.000, 60, N'Công ty Cổ phần Ván phong An Hòa', 1),
(1, N'Đá Hoa Cương', N'sp14.jpg', 370.000, 30, N'Công ty TNHH MTV Đá mỹ nghệ Việt Nam' ,0),
(1, N'Óc Vít', N'sp15.jpg', 230.000, 70, N'Công ty TNHH Một thành viên ốc vít Việt Nam', 1),
(2, N'Thạch Cao', N'sp16.jpg', 180.000, 45, N'Công ty TNHH Khoáng sản và Vật liệu Xây dựng Vinavico' ,1),
(1, N'Gỗ lót Sàn', N'sp17.jpg', 480.000, 55, N'Công ty TNHH Một thành viên Gỗ Việt Nam' ,0),
(2, N'Máy Trộn Hồ', N'sp18.jpg', 210.000, 38, N'Công ty TNHH Phúc Thành',1),
(3, N'Đèn Trang Trí', N'sp19.jpg', 500.000, 48, N'Công ty TNHH Đèn Trang Trí Philips Việt Nam', 1),
(3, N'Bồn Tắm', N'sp20.jpg', 310.000, 42, N'TOTO Việt Nam',1),
(3, N'Bộ Bàn Ghế', N'sp21.jpg', 230.000, 70, N'Nhà Máy Nội Thất Hòa Phát', 0),
(3, N'Tủ Quần Áo', N'sp22.jpg', 180.000, 45, N'Công ty TNHH SX TM Nội thất Hòa Phát' ,1),
(3, N'Bồn Rửa Tay', N'sp23.jpg', 480.000, 55, N'Công ty TNHH Viglacera Hạ Long' ,0),
(2, N'Vòi Sen', N'sp24.jpg', 210.000, 38, N'Công ty TNHH Toto Việt Nam',1),
(2, N'Cửa Nhà Gỗ', N'sp25.jpg', 500.000, 48, N'Công ty Cổ phần Đầu tư Xây dựng và Thương mại Hoàng Gia',1),
(1, N'Gạch Men', N'sp26.jpg', 140.000, 50, N'Công ty TNHH Viglacera Sơn Hà',1);


INSERT INTO NhomQuyen(TenNQ, MoTa, TinhTrang)
VALUES
(N'Quản trị viên', N'Quản trị hệ thống', 1),
(N'Quản lý', N'Vai trò quản lý', 1),
(N'Nhân viên bán hàng', N'Vai trò bán hàng', 1),
(N'Nhân viên thủ kho', N'Vai trò quản lý kho', 1)

INSERT INTO ChucNang(TenCN, TinhTrang, Them, Sua, Xoa, Doc)
VALUES
(N'Tài khoản', 1, 1, 1, 1, 1),		--1
(N'Phân quyền', 1, 1, 1, 1, 1),		--2		
(N'Sản phẩm', 1, 1, 1, 1, 1),		--3
(N'Nhập hàng', 1, 1, 1, 1, 1),		--4
(N'Bán hàng', 1, 1, 1, 1, 1),		--5
(N'Phiếu nhập', 1, 1, 1, 1, 1),		--6
(N'Hóa đơn', 1, 1, 1, 1, 1),		--7
(N'Nhân viên', 1, 1, 1, 1, 1),		--8
(N'Nhà cung cấp', 1, 1, 1, 1, 1),	--9
(N'Thống kê', 1, 1, 1, 1, 1);		--10

INSERT INTO ChiTietQuyen(MaQuyen, MaCN, HanhDong, TinhTrang)
VALUES
--Hành Động
--Đọc: 1
--Thêm: 2
--Xóa: 3
--Sửa: 4

--Quyền admin
(1,1, N'Đọc', 1), --Tài Khoản
(1,1, N'Thêm', 1),
(1,1, N'Xóa', 1),
(1,1, N'Sửa', 1),
(1,2, N'Đọc', 1), --Phân quyền
(1,2, N'Thêm', 1),
(1,2, N'Xóa', 1),
(1,2, N'Sửa', 1),

--Quyền thủ kho
(4,3,N'Đọc', 1), --Sản phẩm
(4,3,N'Thêm', 1),
(4,3,N'Xóa', 1),
(4,3,N'Sửa', 1),
(4,4,N'Đọc', 1), --Nhập hàng
(4,9, N'Đọc', 1), --nhà cung cấp
(4,9, N'Thêm', 1), 
(4,9, N'Xóa', 1), 
(4,9, N'Sửa', 1), 

--Quyền bán hàng
(3,3,N'Đọc  ', 1), --Sản phẩm
(3,5,N'Đọc ', 1), --bán hàng

--Quyền quản lý
(2,6,N'Đọc', 1), --Phiếu Nhập
(2,6,N'Sửa', 1),
(2,6,N'Xóa',1),
(2,7,N'Đọc',1),--Hóa đơn
(2,8,N'Đọc', 1),-- Nhân viên
(2,8,N'Thêm', 1),		
(2,8,N'Xóa', 1),					
(2,8,N'Sửa', 1),					
(2, 10, N'Đọc', 1); --Thống kê

INSERT INTO NhanVien(MaNV, TenNV, SDT, GioiTinh, DiaChi, Email, TinhTrang)
VALUES
('NV001', N'Trần Hoài Bảo', '0987123456', N'Nữ', N'123 Đường Lê Lợi, Quận 1, TP.HCM', 'hoaibao01@gmail.com', N'Đang làm việc'),
('NV002', N'Hồ Công Đệ', '0903456789', N'Nam', N'456 Đường Nguyễn Huệ, Quận 1, TP.HCM', 'congde0304@gmail.com', N'Đang làm việc'),
('NV003', N'Lê Thanh Minh', '0912345678', N'Nam', N'789 Đường Võ Văn Tần, Quận 3, TP.HCM', 'le_minh99@gmail.com', N'Đang làm việc'),
('NV004', N'Võ Thị Nga', '0976987654', N'Nữ', N'321 Đường Lê Duẩn, Quận Tân Bình, TP.HCM', 'nga0nga1@gmail.com', N'Đang làm việc'),
('NV005', N'Phạm Hồng Đức', '0938123789', N'Nam', N'654 Đường Phan Xích Long, Quận Phú Nhuận, TP.HCM', 'duc_day111@gmail.com', N'Đang làm việc'),
('NV006', N'Nguyễn Hoàng Quyên', '0945678901', N'Nữ', N'987 Đường Nguyễn Thị Minh Khai, Quận 3, TP.HCM', 'hoangduyen1@gmail.com', N'Đang làm việc'),
('NV007', N'Bùi Thanh', '0963234567', N'Nam', N'234 Đường Nguyễn Đình Chính, Quận Bình Thạnh, TP.HCM', 'thanh.ai123@gmail.com', N'Đang làm việc'),
('NV008', N'Nguyễn Thanh Lân', '0914567890', N'Nam', N'567 Đường Cách Mạng Tháng Tám, Quận 10, TP.HCM', 'lanvaban123@gmail.com', N'Đang làm việc'),
('NV009', N'Nguyễn Trần Vĩnh Khoa', '0985123789', N'Nam', N'210 Đường Hùng Vương, Quận 5, TP.HCM', 'khoadep_trai9@gmail.com', N'Đang làm việc'),
('NV010', N'Đỗ Lê Viết Văn', '0909345678', N'Nam', N'543 Đường Bến Vân Đồn, Quận 4, TP.HCM', 'viet.van86@gmail.com', N'Đang làm việc');

INSERT INTO NhaCungCap(TenNCC, SDT, DiaChi, TinhTrang)
VALUES
(N'CÔNG TY VICOSTONE', '0302229082', N'KCN Bình Hòa, Huyện Thạch Thất, Thành phố Hà Nội, Việt Nam', 1),
(N'CÔNG TY VIGLACERA CORPORATION', '0247309338', N'Số 1, Đại lộ Lê Nin, Phường Trần Hưng Đạo, Thành phố Hà Nội, Việt Nam', 1),
(N'CÔNG TY BECAMEX IDC CORPORATION', '1900571595', N' Khu công nghiệp Mỹ Phước, Thị xã Bến Cát, Tỉnh Bình Dương, Việt Nam', 1),
(N'CÔNG TY HOÀNG MAI BRICK AND TILE COMPANY ', '0903262626', N'Thôn Phố, Xã Hoàng Đông, Huyện Hoàng Mai, Tỉnh Nghệ An, Việt Nam', 1),
(N'CÔNG TY DONG TAM GROUP', '0283891074', N' KCN Đồng Tâm, Xã Bắc Hồng, Huyện Thường Tín, Thành phố Hà Nội, Việt Nam', 0),
(N' CÔNG TY PHU TAI CORPORATION ', '0903244248', N' 288 Điện Biên Phủ, Phường 15, Quận Bình Thạnh, Thành phố Hồ Chí Minh, Việt Nam', 1);
