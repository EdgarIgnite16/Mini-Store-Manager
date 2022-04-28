CREATE DATABASE [MiniStore]
GO

USE [MiniStore]
GO
/****** Object:  Table [dbo].[CaLamViec]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CaLamViec](
	[maCa] [nchar](50) NOT NULL,
	[tenCa] [nvarchar](50) NOT NULL,
	[thoiGian] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_CaLamViec] PRIMARY KEY CLUSTERED 
(
	[maCa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[maCV] [nchar](50) NOT NULL,
	[tenCV] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[maCV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTHD]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTHD](
	[maHD] [nchar](50) NOT NULL,
	[maMH] [nchar](50) NOT NULL,
	[soLuong] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTPN]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPN](
	[maPhieuNhap] [nchar](50) NOT NULL,
	[maMH] [nchar](50) NOT NULL,
	[soLuong] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHD] [nchar](50) NOT NULL,
	[maNV] [nchar](50) NOT NULL,
	[maKH] [nchar](50) NOT NULL,
	[maGiamGia] [nchar](50) NOT NULL,
	[tongHoaDon] [float] NOT NULL,
	[ngayBan] [datetime] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [nchar](50) NOT NULL,
	[tenKH] [nvarchar](50) NOT NULL,
	[SDT] [nchar](30) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiMatHang]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiMatHang](
	[maLMH] [nchar](50) NOT NULL,
	[tenLMH] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LoaiMatHang] PRIMARY KEY CLUSTERED 
(
	[maLMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MatHang]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MatHang](
	[maMH] [nchar](50) NOT NULL,
	[maLMH] [nchar](50) NOT NULL,
	[tenMatHang] [nvarchar](50) NOT NULL,
	[thanhTien] [float] NOT NULL,
	[soLuong] [int] NOT NULL,
 CONSTRAINT [PK_MatHang] PRIMARY KEY CLUSTERED 
(
	[maMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[maNCC] [nchar](50) NOT NULL,
	[tenNCC] [nchar](50) NOT NULL,
	[SDT] [nchar](30) NOT NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[maNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [nchar](50) NOT NULL,
	[maCV] [nchar](50) NOT NULL,
	[maCa] [nchar](50) NOT NULL,
	[tenNV] [nvarchar](50) NOT NULL,
	[cmnd] [nvarchar](50) NOT NULL,
	[sdt] [nvarchar](50) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuGiamGia]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuGiamGia](
	[maGiamGia] [nchar](50) NOT NULL,
	[tenGiamGia] [nvarchar](50) NOT NULL,
	[noiDung] [nvarchar](50) NOT NULL,
	[tileGiam] [float] NOT NULL,
 CONSTRAINT [PK_PhieuGiamGia] PRIMARY KEY CLUSTERED 
(
	[maGiamGia] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhapHang]    Script Date: 4/28/2022 2:52:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhapHang](
	[maPhieuNhap] [nchar](50) NOT NULL,
	[maNCC] [nchar](50) NOT NULL,
	[ngayNhap] [date] NOT NULL,
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[maPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [thoiGian]) VALUES (N'FU1', N'Full Sáng', N'6:00-14:00')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [thoiGian]) VALUES (N'FU2', N'Full Chiều', N'14:00-22:00')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [thoiGian]) VALUES (N'PA1', N'Parttime Sáng', N'8:00-14:00')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [thoiGian]) VALUES (N'PA2', N'Partime Chiều', N'16:00-22:00')
GO
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'BV', N'Bảo vệ')
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'NV', N'Nhân viên')
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'QL', N'Quản lý')
GO
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'CAN02', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'DRI01', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'DRI02', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'DRI17', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'FRU04', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'HOH05', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426090130', N'DRI23', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'MIL06', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'SNA02', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'STU01', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'STU02', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'DRI18', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426093059', N'WAT05', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426093059', N'SNA01', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426094840', N'RIC03', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426100200', N'STU09', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102039', N'WAT07', 6)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'STU03', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'MIL13', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'HOH11', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'FRU02', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'DRI23', 6)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102510', N'DRI14', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'SNA06', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'SNA01', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'SNA05', 4)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'BEE23', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'BEE24', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'BEE25', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'BEE26', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426110121', N'WAT02', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426111454', N'DRI21', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426181022', N'BEE01', 48)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426181022', N'BEE13', 48)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426213030', N'FRU01', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426213030', N'FRU05', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426213030', N'VEG01', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426213030', N'BEA03', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426115610', N'WAT05', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426123039', N'DRI10', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426134122', N'DRI01', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426140734', N'DRI17', 20)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426140734', N'DRI18', 20)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426162054', N'BEE22', 4)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426170030', N'HOH08', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426170030', N'HOH06', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426191124', N'MIL09', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426201934', N'HOH10', 3)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426211200', N'WAT14', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426211522', N'FRU03', 3)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426212833', N'HOH01', 1)
GO
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426082650', N'NV04', N'KH001', N'NOTSHOCK', 193000, CAST(N'2022-04-26T08:26:50.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426090130', N'NV02', N'KH001', N'NOTSHOCK', 18000, CAST(N'2022-04-26T09:01:20.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426091315', N'NV02', N'KH002', N'NOTSHOCK', 56000, CAST(N'2022-04-26T09:13:15.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426093059', N'NV02', N'KH001', N'NOTSHOCK', 20100, CAST(N'2022-04-26T09:30:59.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426094840', N'NV04', N'KH003', N'SHOCK20P', 88000, CAST(N'2022-04-26T09:48:40.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426100200', N'NV02', N'KH004', N'NOTSHOCK', 546000, CAST(N'2022-04-26T10:02:00.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426102039', N'NV02', N'KH005', N'NOTSHOCK', 132000, CAST(N'2022-04-26T10:20:39.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426102116', N'NV04', N'KH006', N'NOTSHOCK', 134200, CAST(N'2022-04-26T10:21:16.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426102510', N'NV02', N'KH007', N'BIG15P', 16960, CAST(N'2022-04-26T10:25:10.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426103512', N'NV02', N'KH008', N'NOTSHOCK', 123200, CAST(N'2022-04-26T10:35:12.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426110121', N'NV02', N'KH009', N'NOTSHOCK', 8600, CAST(N'2022-04-26T11:01:21.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426111454', N'NV04', N'KH010', N'NOTSHOCK', 60000, CAST(N'2022-04-26T11:14:54.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426115610', N'NV02', N'KH011', N'NOTSHOCK', 8100, CAST(N'2022-04-26T11:56:10.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426123039', N'NV02', N'KH012', N'NOTSHOCK', 10000, CAST(N'2022-04-26T12:30:39.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426134122', N'NV02', N'KH013', N'NOTSHOCK', 20000, CAST(N'2022-04-26T13:41:22.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426140734', N'NV07', N'KH014', N'NOTSHOCK', 400000, CAST(N'2022-04-26T14:07:34.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426162054', N'NV08', N'KH015', N'NOTSHOCK', 114400, CAST(N'2022-04-26T16:20:54.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426170030', N'NV03', N'KH016', N'NOTSHOCK', 459000, CAST(N'2022-04-26T17:00:30.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426181022', N'NV03', N'KH022', N'SHOCK5P ', 1167360, CAST(N'2022-04-26T18:10:22.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426191124', N'NV03', N'KH017', N'NOTSHOCK', 66800, CAST(N'2022-04-26T19:11:24.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426201934', N'NV08', N'KH018', N'NOTSHOCK', 27000, CAST(N'2022-04-26T20:19:34.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426211200', N'NV07', N'KH019', N'NOTSHOCK', 9200, CAST(N'2022-04-26T21:12:00.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426211522', N'NV07', N'KH020', N'BIG10P', 40500, CAST(N'2022-04-26T21:15:22.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426212833', N'NV03', N'KH021', N'NOTSHOCK', 12000, CAST(N'2022-04-26T21:28:33.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426213030', N'NV08', N'KH022', N'NOTSHOCK', 96000, CAST(N'2022-04-26T21:30:30.000' AS DateTime))
GO
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'---', N'Khách vãng lại', N'0936423459 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH001', N'Lê Như Tâm', N'0937698412 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH002', N'Huỳnh Đức Hoa', N'0849494948 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH003', N'Trần Tuấn', N'0896156165 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH004', N'Trần Vũ Luân', N'0986256262 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH005', N'James Mark', N'0933444567 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH006', N'Vũ Xuân Hoa', N'0935478563 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH007', N'Trần Văn Lộc', N'0832675475 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH008', N'Lê Bảo Tài', N'0973457347 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH009', N'Huỳnh Minh Quân', N'0934657345 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH010', N'Phạm Minh Quân', N'0935486754 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH011', N'Trịnh Hùng Thái', N'0936745375 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH012', N'Lê Quốc Thái', N'0934564333 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH013', N'Lê Bảo An', N'0933571122 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH014', N'John Wick', N'01247238412')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH015', N'Hạ Phan Như Ý', N'0973123743 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH016', N'Trần Đình Công', N'0978797899 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH017', N'Võ Thị Vui', N'0942347546 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH018', N'Lê Ki Ma', N'0943578512 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH019', N'Anna Hennson', N'0942357437 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH020', N'Lê Bảo Tân', N'0923786334 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH021', N'Trần Ngọc Kim Thanh', N'0936423454 ')
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT]) VALUES (N'KH022', N'Nguyễn Quốc Siêu', N'0943437664 ')
GO
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'BEAN', N'Các loại đậu')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'BEER', N'Đồ uống có cồn')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'CAN', N'Thực phẩm đóng hộp')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'DRINK', N'Nước ngọt')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'FRUIT', N'Trái cây')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'HOUSEHOLD', N'Đồ gia dụng')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'MILK', N'Các sản phẩm từ sữa')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'RICE', N'Gạo')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'SNACK', N'Đồ ăn vặt')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'STUDIES ', N'Văn phòng phẩm')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'VEGATABLE', N'Rau, củ')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'WATER', N'Nước giải khát')
GO
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEA01', N'BEAN', N'Đậu xanh', 18000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEA02', N'BEAN', N'Đậu đen', 18000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEA03', N'BEAN', N'Đậu phộng', 18000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE01', N'BEER', N'Bia 333', 11600, 576)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE02', N'BEER', N'Bia Tiger', 17000, 576)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE03', N'BEER', N'Bia Tiger Crystal', 19000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE04', N'BEER', N'Bia Heineken', 20000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE05', N'BEER', N'Bia Heineken Silver', 20000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE06', N'BEER', N'Bia Heineken 0 độ', 19300, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE07', N'BEER', N'Bia Việt', 11600, 576)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE08', N'BEER', N'Bia Larue', 11600, 576)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE09', N'BEER', N'Bia Larue Special', 11300, 576)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE10', N'BEER', N'Bia Huda', 11600, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE11', N'BEER', N'Bia Huda Gold', 14000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE12', N'BEER', N'Bia Huda Blast', 14000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE13', N'BEER', N'Bia Sài Gòn Special', 14000, 576)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE14', N'BEER', N'Bia Sài Gòn Sleek', 15000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE15', N'BEER', N'Bia Sài Gòn Chill', 17000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE16', N'BEER', N'Bia Sài Gòn Lager', 11600, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE17', N'BEER', N'Bia Sài Gòn Export', 11600, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE18', N'BEER', N'Bia Sapporo 330ml', 18000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE19', N'BEER', N'Bia Sapporo 500ml', 29600, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE20', N'BEER', N'Bia Sapporo 650ml', 70000, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE21', N'BEER', N'Bia Budweiser 330ml', 18000, 72)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE22', N'BEER', N'Bia Budweiser 500ml', 28600, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE23', N'BEER', N'Strongbow táo', 20600, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE24', N'BEER', N'Strongbow dâu', 20600, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE25', N'BEER', N'Strongbow mật ong', 20600, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'BEE26', N'BEER', N'Strongbow đào', 20600, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'CAN01', N'CAN', N'Thịt hộp cá sốt cà', 16000, 18)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'CAN02', N'CAN', N'Thịt hộp bò hầm', 25000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'CAN03', N'CAN', N'Thịt hộp pate heo', 24000, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'CAN04', N'CAN', N'Thịt hộp heo hầm', 23000, 19)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'CAN05', N'CAN', N'Thịt hộp bò xay', 24000, 15)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI01', N'DRINK', N'Pepsi 330ml', 10000, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI02', N'DRINK', N'CocaCola 330ml', 8000, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI03', N'DRINK', N'Fanta xá xị 330ml', 8500, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI04', N'DRINK', N'Mirinda soda kem 330ml', 8000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI05', N'DRINK', N'Sprite 330ml', 7500, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI06', N'DRINK', N'Fanta cam 330ml', 8500, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI07', N'DRINK', N'Pepsi 0 calo 330ml', 10600, 72)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI08', N'DRINK', N'Pepsi 0 calo chanh 330ml', 9600, 72)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI09', N'DRINK', N'CocaCola 0 330ml', 10400, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI10', N'DRINK', N'CocaCola light 330ml', 10000, 72)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI11', N'DRINK', N'Mirinda cam 330ml', 8400, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI12', N'DRINK', N'Mirinda xá xị 330ml', 8500, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI13', N'DRINK', N'Mirinda đá me 330ml', 11000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI14', N'DRINK', N'7Up 330ml', 10600, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI15', N'DRINK', N'Fanta soda kem 330ml', 8600, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI16', N'DRINK', N'Fanta việt quốc 330ml', 8800, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI17', N'DRINK', N'Redbull', 10000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI18', N'DRINK', N'Lipovitan', 10000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI19', N'DRINK', N'Sting dâu', 10600, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI20', N'DRINK', N'Sting gold', 9000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI21', N'DRINK', N'Monster', 30000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI22', N'DRINK', N'Monster energy ultra', 30000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI23', N'DRINK', N'Wake up 247', 9000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI24', N'DRINK', N'Warrior dâu 300ml', 9500, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'DRI25', N'DRINK', N'Warritor nho 330ml', 9500, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'FRU01', N'FRUIT', N'Dưa hấu Long An (trái)', 20000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'FRU02', N'FRUIT', N'Chuối sứ (nải)', 15000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'FRU03', N'FRUIT', N'Dừa (trái)', 15000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'FRU04', N'FRUIT', N'Thơm (trái)', 20000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'FRU05', N'FRUIT', N'Ổi (trái)', 10000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH01', N'HOUSEHOLD', N'CloseUp lửa băng', 12000, 20)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH02', N'HOUSEHOLD', N'Bình giữ nhiệt Xiaomi', 379000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH03', N'HOUSEHOLD', N'Chảo inox chống dính', 599000, 7)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH04', N'HOUSEHOLD', N'Ấm đun nước', 299000, 3)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH05', N'HOUSEHOLD', N'Bộ dao 4 món', 85000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH06', N'HOUSEHOLD', N'Thùng đá 45L', 450000, 3)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH07', N'HOUSEHOLD', N'Thớt kháng khuẩn', 105000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH08', N'HOUSEHOLD', N'50 găng nilon', 9000, 9)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH09', N'HOUSEHOLD', N'Khăn giấy', 20500, 10)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH10', N'HOUSEHOLD', N'Cước cọ nồi', 9000, 15)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'HOH11', N'HOUSEHOLD', N'Kéo đa năng', 12000, 6)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL01', N'MILK', N'Vinamilk cđ (lốc)', 30800, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL02', N'MILK', N'TH True Milk cđ (lốc)', 34000, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL03', N'MILK', N'Vinamilk socola (lốc)', 30800, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL04', N'MILK', N'Vinamilk kđ (lốc)', 30800, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL05', N'MILK', N'Vinamilk dâu (lốc)', 30800, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL06', N'MILK', N'TH True Milk kđ (lốc)', 34000, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL07', N'MILK', N'TH True Milk dâu (lốc)', 34000, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL08', N'MILK', N'TH True Milk socola (lốc)', 34000, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL09', N'MILK', N'Dutch Lady cđ (lốc)', 33400, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL10', N'MILK', N'Dutch Lady kđ (lốc)', 33400, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL11', N'MILK', N'Dutch Lady dâu (lốc)', 33400, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL12', N'MILK', N'Dutch Lady socola (lốc)', 33400, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL13', N'MILK', N'Dalat Milk cđ (lốc)', 31800, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'MIL14', N'MILK', N'Dalat Milk it (lốc)', 31800, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'RIC01', N'RICE', N'Gạo ST25 (túi 5kg)', 142000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'RIC02', N'RICE', N'Gạo Nhật (túi 5kg)', 123000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'RIC03', N'RICE', N'Gạo ST21 (túi 5kg)', 110000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'SNA01', N'SNACK', N'Lays wavy', 6000, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'SNA02', N'SNACK', N'Oishi Tôm', 5000, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'SNA03', N'SNACK', N'Snack cua', 6200, 36)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'SNA04', N'SNACK', N'Toonies phô mai', 6400, 36)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'SNA05', N'SNACK', N'Oishi Tomati', 5400, 35)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'SNA06', N'SNACK', N'O''Star', 6600, 30)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU01', N'STUDIES ', N'Gôm Pentel', 3000, 12)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU02', N'STUDIES ', N'Bút bi TL-079', 4000, 46)
GO
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU03', N'STUDIES ', N'Hồ dán', 3200, 12)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU04', N'STUDIES ', N'Bút chì 2B', 5000, 25)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU05', N'STUDIES ', N'Sổ lò xo 100 trang', 22000, 10)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU06', N'STUDIES ', N'Sổ caro', 46000, 8)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU07', N'STUDIES ', N'Thước dẻo 20cm', 3000, 12)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU08', N'STUDIES ', N'Giấy note 5 màu', 6000, 10)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'STU09', N'STUDIES ', N'Casio FX-570 VN Plus', 546000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'VEG01', N'VEGATABLE', N'Cà rốt', 30000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'VEG02', N'VEGATABLE', N'Củ cải trắng', 20000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'VEG03', N'VEGATABLE', N'Khổ qua', 30000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'VEG04', N'VEGATABLE', N'Củ sắn', 30000, 10)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'VEG05', N'VEGATABLE', N'Đậu que', 25000, 15)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'VEG06', N'VEGATABLE', N'Khoai môn', 30000, 5)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT01', N'WATER', N'Aquafina 355ml', 4200, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT02', N'WATER', N'Aquafina 500ml', 4300, 576)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT03', N'WATER', N'Aquafina 1,5L', 9300, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT04', N'WATER', N'LaVie 500ml', 4000, 576)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT05', N'WATER', N'LaVie 750ml', 8100, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT06', N'WATER', N'LaVie 1,5L', 10600, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT07', N'WATER', N'LaVie 6L', 22000, 12)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT08', N'WATER', N'LaVie 350ml', 4500, 38)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT09', N'WATER', N'Dasani 350ml', 4000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT10', N'WATER', N'Dasani 500ml', 5000, 192)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT11', N'WATER', N'Dasani 1,5L', 9300, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT12', N'WATER', N'Vĩnh Hảo 500ml', 5000, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT13', N'WATER', N'Vĩnh Hảo 1,5L', 9000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT14', N'WATER', N'Vivant 500ml', 4600, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT15', N'WATER', N'I-on Life 330ml', 4500, 24)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT16', N'WATER', N'I-on Life 450ml', 5500, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT17', N'WATER', N'I-on Life 1,25L', 11600, 36)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT18', N'WATER', N'I-on Life 4,5L', 31000, 15)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT19', N'WATER', N'Fujiwa 300ml', 5000, 48)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT20', N'WATER', N'Fujiwa 450ml', 6000, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT21', N'WATER', N'Fujiwa 680ml', 9000, 96)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong]) VALUES (N'WAT22', N'WATER', N'Fujiwa 1,25L', 12600, 10)
GO
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'AGGA ', N'AGONGA', N'0453245312 ')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'DA   ', N'Đông Á', N'0909090909 ')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'KON  ', N'Konosuba', N'0342354252 ')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'SEGGG', N'SHIELDHERO', N'0969696969 ')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'VLEG ', N'VietLEO', N'0931244325 ')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'VNG  ', N'Đông Lào', N'0975624372 ')
GO
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'ad', N'QL', N'FU1', N'Admin', N'079202034777', N'0707029548')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV01', N'NV', N'FU2', N'Trần Nguyên Lộc', N'07916596997', N'0936446546')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV02', N'NV', N'FU1', N'Võ Đăng Quang', N'07964156165', N'0934464886')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV03', N'NV', N'FU2', N'Nguyễn Văn Tấn Quân', N'07925516133', N'0946131122')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV04', N'NV', N'PA1', N'Nguyễn Thanh Thảo', N'07921113216', N'0996562332')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV05', N'BV', N'FU1', N'Nguyễn Văn Công', N'07962256262', N'0944566632')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV06', N'BV', N'FU2', N'Đặng Văn Mến', N'07923151561', N'0836564921')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV07', N'NV', N'PA2', N'Lê Minh Thư', N'07961556332', N'0834568326')
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [cmnd], [sdt]) VALUES (N'NV08', N'NV', N'PA2', N'Lê Minh Tâm', N'07961556332', N'0834568326')
GO
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'BIG10P', N'Giảm 10%', N'Giảm 10% trên tổng hoá đơn', 0.1)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'BIG15P', N'Giảm 15%', N'Giảm 15% trên tổng hoá đơn', 0.15)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'NOTSHOCK', N'---', N'Không giảm', 0)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'SHOCK20P', N'Giảm 20%', N'Giảm 20% trên tổng hoá đơn', 0.2)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'SHOCK5P', N'Giảm 5%', N'Giảm 5% trên tổng hoá đơn', 0.05)
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_HoaDon] FOREIGN KEY([maHD])
REFERENCES [dbo].[HoaDon] ([maHD])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FK_CTHD_HoaDon]
GO
ALTER TABLE [dbo].[CTHD]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_MatHang] FOREIGN KEY([maMH])
REFERENCES [dbo].[MatHang] ([maMH])
GO
ALTER TABLE [dbo].[CTHD] CHECK CONSTRAINT [FK_CTHD_MatHang]
GO
ALTER TABLE [dbo].[CTPN]  WITH CHECK ADD  CONSTRAINT [FK_CTPN_MatHang] FOREIGN KEY([maMH])
REFERENCES [dbo].[MatHang] ([maMH])
GO
ALTER TABLE [dbo].[CTPN] CHECK CONSTRAINT [FK_CTPN_MatHang]
GO
ALTER TABLE [dbo].[CTPN]  WITH CHECK ADD  CONSTRAINT [FK_CTPN_PhieuNhapHang] FOREIGN KEY([maPhieuNhap])
REFERENCES [dbo].[PhieuNhapHang] ([maPhieuNhap])
GO
ALTER TABLE [dbo].[CTPN] CHECK CONSTRAINT [FK_CTPN_PhieuNhapHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_PhieuGiamGia] FOREIGN KEY([maGiamGia])
REFERENCES [dbo].[PhieuGiamGia] ([maGiamGia])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_PhieuGiamGia]
GO
ALTER TABLE [dbo].[MatHang]  WITH CHECK ADD  CONSTRAINT [FK_MatHang_LoaiMatHang] FOREIGN KEY([maLMH])
REFERENCES [dbo].[LoaiMatHang] ([maLMH])
GO
ALTER TABLE [dbo].[MatHang] CHECK CONSTRAINT [FK_MatHang_LoaiMatHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_CaLamViec] FOREIGN KEY([maCa])
REFERENCES [dbo].[CaLamViec] ([maCa])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_CaLamViec]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_ChucVu] FOREIGN KEY([maCV])
REFERENCES [dbo].[ChucVu] ([maCV])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_ChucVu]
GO
ALTER TABLE [dbo].[PhieuNhapHang]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhapHang_NhaCungCap] FOREIGN KEY([maNCC])
REFERENCES [dbo].[NhaCungCap] ([maNCC])
GO
ALTER TABLE [dbo].[PhieuNhapHang] CHECK CONSTRAINT [FK_PhieuNhapHang_NhaCungCap]
GO
