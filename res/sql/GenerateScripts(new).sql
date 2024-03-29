USE [master]
GO
/****** Object:  Database [MiniStore]    Script Date: 12/6/2022 1:03:20 AM ******/
CREATE DATABASE [MiniStore]
GO

ALTER DATABASE [MiniStore] SET COMPATIBILITY_LEVEL = 150
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [MiniStore].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [MiniStore] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [MiniStore] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [MiniStore] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [MiniStore] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [MiniStore] SET ARITHABORT OFF 
GO
ALTER DATABASE [MiniStore] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [MiniStore] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [MiniStore] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [MiniStore] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [MiniStore] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [MiniStore] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [MiniStore] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [MiniStore] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [MiniStore] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [MiniStore] SET  ENABLE_BROKER 
GO
ALTER DATABASE [MiniStore] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [MiniStore] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [MiniStore] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [MiniStore] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [MiniStore] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [MiniStore] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [MiniStore] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [MiniStore] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [MiniStore] SET  MULTI_USER 
GO
ALTER DATABASE [MiniStore] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [MiniStore] SET DB_CHAINING OFF 
GO
ALTER DATABASE [MiniStore] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [MiniStore] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [MiniStore] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [MiniStore] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [MiniStore] SET QUERY_STORE = OFF
GO

USE [MiniStore]
GO

/****** Object:  Table [dbo].[CaLamViec]    Script Date: 12/6/2022 1:03:20 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[CaLamViec](
	[maCa] [nchar](50) NOT NULL,
	[tenCa] [nvarchar](50) NOT NULL,
	[khungGio] [varchar](50) NOT NULL,
 CONSTRAINT [PK_CaLamViec] PRIMARY KEY CLUSTERED
(
	[maCa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 12/6/2022 1:03:20 AM ******/
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
/****** Object:  Table [dbo].[CTHD]    Script Date: 12/6/2022 1:03:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTHD](
	[maHD] [nchar](50) NOT NULL,
	[maMH] [nchar](50) NOT NULL,
	[soLuong] [int] NOT NULL,
 CONSTRAINT [PK_CTHD] PRIMARY KEY CLUSTERED 
(
	[maHD] ASC,
	[maMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTPN]    Script Date: 12/6/2022 1:03:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTPN](
	[maPhieuNhap] [nchar](50) NOT NULL,
	[maMH] [nchar](50) NOT NULL,
	[soLuong] [int] NOT NULL,
 CONSTRAINT [PK_CTPN] PRIMARY KEY CLUSTERED 
(
	[maPhieuNhap] ASC,
	[maMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 12/6/2022 1:03:20 AM ******/
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
/****** Object:  Table [dbo].[KhachHang]    Script Date: 12/6/2022 1:03:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [nchar](50) NOT NULL,
	[tenKH] [nvarchar](50) NOT NULL,
	[SDT] [nchar](30) NOT NULL,
	[status] [smallint] NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiMatHang]    Script Date: 12/6/2022 1:03:20 AM ******/
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
/****** Object:  Table [dbo].[MatHang]    Script Date: 12/6/2022 1:03:20 AM ******/
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
	[status] [smallint] NULL,
 CONSTRAINT [PK_MatHang] PRIMARY KEY CLUSTERED 
(
	[maMH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 12/6/2022 1:03:20 AM ******/
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
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/6/2022 1:03:20 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [nchar](50) NOT NULL,
	[maCV] [nchar](50) NOT NULL,
	[maCa] [nchar](50) NOT NULL,
	[tenNV] [nvarchar](50) NOT NULL,
	[pwd] [nvarchar](50) NOT NULL,
	[cccd] [nvarchar](50) NOT NULL,
	[sdt] [nvarchar](50) NULL,
	[status] [smallint] NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuGiamGia]    Script Date: 12/6/2022 1:03:20 AM ******/
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
/****** Object:  Table [dbo].[PhieuNhapHang]    Script Date: 12/6/2022 1:03:20 AM ******/
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
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [khungGio]) VALUES (N'FU1', N'Fulltime Sáng', '7-15')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [khungGio]) VALUES (N'FU2', N'Fulltime Chiều', '15-23')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [khungGio]) VALUES (N'PA1', N'Parttime Sáng 1', '7-11')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [khungGio]) VALUES (N'PA2', N'Parttime Sáng 2', '11-15')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [khungGio]) VALUES (N'PA3', N'Partime Chiều 1', '15-19')
INSERT [dbo].[CaLamViec] ([maCa], [tenCa], [khungGio]) VALUES (N'PA4', N'Partime Chiều 2', '19-23')

GO
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'AD', N'Chủ Cửa Hàng')
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'QL', N'Quản lý')
INSERT [dbo].[ChucVu] ([maCV], [tenCV]) VALUES (N'NV', N'Nhân viên')
GO
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'CAN002', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'DRI001', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'DRI002', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'DRI017', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'FRU004', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426082650', N'HOH005', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426090130', N'DRI023', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'DRI018', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'MIL006', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'SNA002', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'STU001', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426091315', N'STU002', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426093059', N'SNA001', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426093059', N'WAT005', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426094840', N'RIC003', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426100200', N'STU009', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102039', N'WAT007', 6)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'DRI023', 6)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'FRU002', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'HOH011', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'MIL013', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102116', N'STU003', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426102510', N'DRI014', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'BEE023', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'BEE024', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'BEE025', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'BEE026', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'SNA001', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'SNA005', 4)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426103512', N'SNA006', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426110121', N'WAT002', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426111454', N'DRI021', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426115610', N'WAT005', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426123039', N'DRI010', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426134122', N'DRI001', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426140734', N'DRI017', 20)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426140734', N'DRI018', 20)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426162054', N'BEE022', 4)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426170030', N'HOH006', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426170030', N'HOH008', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426181022', N'BEE001', 48)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426181022', N'BEE013', 48)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426191124', N'MIL009', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426201934', N'HOH010', 3)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426211200', N'WAT014', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426211522', N'FRU003', 3)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426212833', N'HOH001', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426213030', N'BEA003', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426213030', N'FRU001', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426213030', N'FRU005', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220426213030', N'VEG001', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220509072103', N'BEE005', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220509083021', N'BEE008', 1)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220518051346', N'BEE023', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20220518051346', N'BEE024', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20221206125930', N'BEA002', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20221206125930', N'BEA003', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20221206125930', N'BEE007', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20221206125930', N'BEE010', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20221206125930', N'BEE011', 2)
INSERT [dbo].[CTHD] ([maHD], [maMH], [soLuong]) VALUES (N'HD20221206125930', N'BEE012', 2)
GO
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU001', 12)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU002', 46)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU003', 12)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU004', 25)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU005', 10)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU006', 8)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU007', 12)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU008', 10)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH001', N'STU009', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI001', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI002', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI003', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI004', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI005', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI006', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI007', 72)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI008', 72)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI009', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI010', 72)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI011', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI012', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI013', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI014', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI015', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI016', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI017', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI018', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI019', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI020', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI021', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI022', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI023', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI024', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'DRI025', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT001', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT002', 576)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT003', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT004', 576)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT005', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT006', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT007', 12)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT008', 38)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT009', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT010', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT011', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT012', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT013', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT014', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT015', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT016', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT017', 36)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT018', 15)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT019', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT020', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT021', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH002', N'WAT022', 10)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL001', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL002', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL003', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL004', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL005', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL006', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL007', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL008', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL009', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL010', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL011', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL012', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL013', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'MIL014', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'SNA001', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'SNA002', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'SNA003', 36)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'SNA004', 36)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'SNA005', 35)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH003', N'SNA006', 30)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE001', 76)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE002', 576)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE003', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE004', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE005', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE006', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE007', 576)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE008', 576)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE009', 576)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE010', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE011', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE012', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE013', 576)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE014', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE015', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE016', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE017', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE018', 192)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE019', 48)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE020', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE021', 72)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH004', N'BEE022', 96)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'BEA001', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'BEA002', 20)
GO
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'BEA003', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'FRU001', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'FRU002', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'FRU003', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'FRU004', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'FRU005', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'RIC001', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'RIC002', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'RIC003', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'VEG001', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'VEG002', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'VEG003', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'VEG004', 10)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'VEG005', 15)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH005', N'VEG006', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'CAN001', 18)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'CAN002', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'CAN003', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'CAN004', 19)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'CAN005', 15)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH001', 20)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH002', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH003', 7)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH004', 3)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH005', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH006', 3)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH007', 5)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH008', 9)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH009', 10)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH010', 25)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH006', N'HOH011', 6)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH007', N'BEE023', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH007', N'BEE024', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH007', N'BEE025', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'NH007', N'BEE026', 24)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'PN20221206125805', N'BEA001', 9880)
INSERT [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong]) VALUES (N'PN20221206125805', N'BEE001', 14)
GO
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426082650', N'NV004', N'KH001', N'NOTSHOCK', 193000, CAST(N'2022-04-26T08:26:50.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426090130', N'NV002', N'KH001', N'NOTSHOCK', 18000, CAST(N'2022-04-26T09:01:20.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426091315', N'NV002', N'KH002', N'NOTSHOCK', 56000, CAST(N'2022-04-26T09:13:15.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426093059', N'NV002', N'KH001', N'NOTSHOCK', 20100, CAST(N'2022-04-26T09:30:59.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426094840', N'NV004', N'KH003', N'SHOCK20P', 88000, CAST(N'2022-04-26T09:48:40.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426100200', N'NV002', N'KH004', N'NOTSHOCK', 546000, CAST(N'2022-04-26T10:02:00.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426102039', N'NV002', N'KH005', N'NOTSHOCK', 132000, CAST(N'2022-04-26T10:20:39.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426102116', N'NV004', N'KH006', N'NOTSHOCK', 134200, CAST(N'2022-04-26T10:21:16.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426102510', N'NV002', N'KH007', N'BIG15P', 16960, CAST(N'2022-04-26T10:25:10.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426103512', N'NV002', N'KH008', N'NOTSHOCK', 123200, CAST(N'2022-04-26T10:35:12.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426110121', N'NV002', N'KH009', N'NOTSHOCK', 8600, CAST(N'2022-04-26T11:01:21.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426111454', N'NV004', N'KH010', N'NOTSHOCK', 60000, CAST(N'2022-04-26T11:14:54.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426115610', N'NV002', N'KH011', N'NOTSHOCK', 8100, CAST(N'2022-04-26T11:56:10.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426123039', N'NV002', N'KH012', N'NOTSHOCK', 10000, CAST(N'2022-04-26T12:30:39.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426134122', N'NV002', N'KH013', N'NOTSHOCK', 20000, CAST(N'2022-04-26T13:41:22.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426140734', N'NV007', N'KH014', N'NOTSHOCK', 400000, CAST(N'2022-04-26T14:07:34.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426162054', N'NV008', N'KH015', N'NOTSHOCK', 114400, CAST(N'2022-04-26T16:20:54.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426170030', N'NV003', N'KH016', N'NOTSHOCK', 459000, CAST(N'2022-04-26T17:00:30.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426181022', N'NV003', N'KH022', N'SHOCK5P', 1167360, CAST(N'2022-04-26T18:10:22.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426191124', N'NV003', N'KH017', N'NOTSHOCK', 66800, CAST(N'2022-04-26T19:11:24.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426201934', N'NV008', N'KH018', N'NOTSHOCK', 27000, CAST(N'2022-04-26T20:19:34.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426211200', N'NV007', N'KH019', N'NOTSHOCK', 9200, CAST(N'2022-04-26T21:12:00.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426211522', N'NV007', N'KH020', N'BIG10P', 40500, CAST(N'2022-04-26T21:15:22.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426212833', N'NV003', N'KH021', N'NOTSHOCK', 12000, CAST(N'2022-04-26T21:28:33.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220426213030', N'NV008', N'KH022', N'NOTSHOCK', 96000, CAST(N'2022-04-26T21:30:30.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220509072103', N'ad', N'---', N'NOTSHOCK', 20000, CAST(N'2022-05-09T07:21:03.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220509083021', N'ad', N'---', N'NOTSHOCK', 11600, CAST(N'2022-05-09T08:30:21.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20220518051346', N'ad', N'KH014', N'BIG15P', 70040, CAST(N'2022-05-18T05:13:46.000' AS DateTime))
INSERT [dbo].[HoaDon] ([maHD], [maNV], [maKH], [maGiamGia], [tongHoaDon], [ngayBan]) VALUES (N'HD20221206125930', N'NV001', N'---', N'NOTSHOCK', 174400, CAST(N'2022-12-06T12:59:30.000' AS DateTime))
GO
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'---', N'Khách vãng lại', N'0936423459', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH001', N'Lê Như Tâm', N'0937698412', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH002', N'Huỳnh Đức Hoa', N'0849494948', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH003', N'Trần Tuấn', N'0896156165', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH004', N'Trần Vũ Luân', N'0986256262', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH005', N'James Mark', N'0933444567', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH006', N'Vũ Xuân Hoa', N'0964115616', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH007', N'Trần Văn Lộc', N'0832675475', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH008', N'Lê Bảo Tài', N'0973457347', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH009', N'Huỳnh Minh Quân', N'0934657345', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH010', N'Phạm Minh Quân', N'0935486754', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH011', N'Trịnh Hùng Thái', N'0936745375', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH012', N'Lê Quốc Thái', N'0934564333', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH013', N'Lê Bảo An', N'0933571122', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH014', N'John Wick', N'0914561566', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH015', N'Hạ Phan Như Ý', N'0973123743', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH016', N'Trần Đình Công', N'0978797899', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH017', N'Võ Thị Vui', N'0782151616', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH018', N'Lê Ki Ma', N'0943578512', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH019', N'Anna Hennson', N'0942357437', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH020', N'Lê Bảo Tân', N'0923786334', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH021', N'Trần Ngọc Kim Thanh', N'0936423455', 1)
INSERT [dbo].[KhachHang] ([maKH], [tenKH], [SDT], [status]) VALUES (N'KH022', N'Nguyễn Quốc Siêu', N'0942367427', 1)
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
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'STUDIES', N'Văn phòng phẩm')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'VEGATABLE', N'Rau, củ')
INSERT [dbo].[LoaiMatHang] ([maLMH], [tenLMH]) VALUES (N'WATER', N'Nước giải khát')
GO
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEA001', N'BEAN', N'Đậu xanh', 18000, 9900, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEA002', N'BEAN', N'Đậu đen', 18000, 18, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEA003', N'BEAN', N'Đậu phộng', 18000, 18, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEA004', N'BEAN', N'Đậu xanh 1/2', 180000, 20, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE001', N'BEER', N'Bia 333', 11600, 90, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE002', N'BEER', N'Bia Tiger', 17000, 576, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE003', N'BEER', N'Bia Tiger Crystal', 19000, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE004', N'BEER', N'Bia Heineken', 20000, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE005', N'BEER', N'Bia Heineken Silver', 20000, 191, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE006', N'BEER', N'Bia Heineken 0 độ', 19300, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE007', N'BEER', N'Bia Việt', 11600, 574, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE008', N'BEER', N'Bia Larue', 11600, 575, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE009', N'BEER', N'Bia Larue Special', 11300, 576, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE010', N'BEER', N'Bia Huda', 11600, 190, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE011', N'BEER', N'Bia Huda Gold', 14000, 190, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE012', N'BEER', N'Bia Huda Blast', 14000, 190, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE013', N'BEER', N'Bia Sài Gòn Special', 14000, 576, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE014', N'BEER', N'Bia Sài Gòn Sleek', 15000, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE015', N'BEER', N'Bia Sài Gòn Chill', 17000, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE016', N'BEER', N'Bia Sài Gòn Lager', 11600, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE017', N'BEER', N'Bia Sài Gòn Export', 11600, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE018', N'BEER', N'Bia Sapporo 330ml', 18000, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE019', N'BEER', N'Bia Sapporo 500ml', 29600, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE020', N'BEER', N'Bia Sapporo 650ml', 70000, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE021', N'BEER', N'Bia Budweiser 330ml', 18000, 72, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE022', N'BEER', N'Bia Budweiser 500ml', 28600, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE023', N'BEER', N'Strongbow táo', 20600, 22, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE024', N'BEER', N'Strongbow dâu', 20600, 22, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE025', N'BEER', N'Strongbow mật ong', 20600, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'BEE026', N'BEER', N'Strongbow đào', 20600, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'CAN001', N'CAN', N'Thịt hộp cá sốt cà', 16000, 18, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'CAN002', N'CAN', N'Thịt hộp bò hầm', 25000, 20, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'CAN003', N'CAN', N'Thịt hộp pate heo', 24000, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'CAN004', N'CAN', N'Thịt hộp heo hầm', 23000, 19, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'CAN005', N'CAN', N'Thịt hộp bò xay', 24000, 15, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI001', N'DRINK', N'Pepsi 330ml', 10000, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI002', N'DRINK', N'CocaCola 330ml', 8000, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI003', N'DRINK', N'Fanta xá xị 330ml', 8500, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI004', N'DRINK', N'Mirinda soda kem 330ml', 8000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI005', N'DRINK', N'Sprite 330ml', 7500, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI006', N'DRINK', N'Fanta cam 330ml', 8500, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI007', N'DRINK', N'Pepsi 0 calo 330ml', 10600, 72, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI008', N'DRINK', N'Pepsi 0 calo chanh 330ml', 9600, 72, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI009', N'DRINK', N'CocaCola 0 330ml', 10400, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI010', N'DRINK', N'CocaCola light 330ml', 10000, 72, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI011', N'DRINK', N'Mirinda cam 330ml', 8400, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI012', N'DRINK', N'Mirinda xá xị 330ml', 8500, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI013', N'DRINK', N'Mirinda đá me 330ml', 11000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI014', N'DRINK', N'7Up 330ml', 10600, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI015', N'DRINK', N'Fanta soda kem 330ml', 8600, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI016', N'DRINK', N'Fanta việt quốc 330ml', 8800, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI017', N'DRINK', N'Redbull', 10000, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI018', N'DRINK', N'Lipovitan', 10000, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI019', N'DRINK', N'Sting dâu', 10600, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI020', N'DRINK', N'Sting gold', 9000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI021', N'DRINK', N'Monster', 30000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI022', N'DRINK', N'Monster energy ultra', 30000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI023', N'DRINK', N'Wake up 247', 9000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI024', N'DRINK', N'Warrior dâu 300ml', 9500, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'DRI025', N'DRINK', N'Warritor nho 330ml', 9500, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'FRU001', N'FRUIT', N'Dưa hấu Long An (trái)', 20000, 20, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'FRU002', N'FRUIT', N'Chuối sứ (nải)', 15000, 20, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'FRU003', N'FRUIT', N'Dừa (trái)', 15000, 20, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'FRU004', N'FRUIT', N'Thơm (trái)', 20000, 20, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'FRU005', N'FRUIT', N'Ổi (trái)', 10000, 20, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH001', N'HOUSEHOLD', N'Bộ nồi 3 đáy', 1490000, 10, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH002', N'HOUSEHOLD', N'Bình giữ nhiệt Xiaomi', 379000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH003', N'HOUSEHOLD', N'Chảo inox chống dính', 599000, 7, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH004', N'HOUSEHOLD', N'Ấm đun nước', 299000, 3, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH005', N'HOUSEHOLD', N'Bộ dao 4 món', 85000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH006', N'HOUSEHOLD', N'Thùng đá 45L', 450000, 3, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH007', N'HOUSEHOLD', N'Thớt kháng khuẩn', 105000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH008', N'HOUSEHOLD', N'50 găng nilon', 9000, 9, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH009', N'HOUSEHOLD', N'Khăn giấy', 20500, 10, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH010', N'HOUSEHOLD', N'Cước cọ nồi', 9000, 15, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'HOH011', N'HOUSEHOLD', N'Kéo đa năng', 12000, 6, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL001', N'MILK', N'Vinamilk cđ (lốc)', 30800, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL002', N'MILK', N'TH True Milk cđ (lốc)', 34000, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL003', N'MILK', N'Vinamilk socola (lốc)', 30800, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL004', N'MILK', N'Vinamilk kđ (lốc)', 30800, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL005', N'MILK', N'Vinamilk dâu (lốc)', 30800, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL006', N'MILK', N'TH True Milk kđ (lốc)', 34000, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL007', N'MILK', N'TH True Milk dâu (lốc)', 34000, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL008', N'MILK', N'TH True Milk socola (lốc)', 34000, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL009', N'MILK', N'Dutch Lady cđ (lốc)', 33400, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL010', N'MILK', N'Dutch Lady kđ (lốc)', 33400, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL011', N'MILK', N'Dutch Lady dâu (lốc)', 33400, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL012', N'MILK', N'Dutch Lady socola (lốc)', 33400, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL013', N'MILK', N'Dalat Milk cđ (lốc)', 31800, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'MIL014', N'MILK', N'Dalat Milk it (lốc)', 31800, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'RIC001', N'RICE', N'Gạo ST25 (túi 5kg)', 142000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'RIC002', N'RICE', N'Gạo Nhật (túi 5kg)', 123000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'RIC003', N'RICE', N'Gạo ST21 (túi 5kg)', 110000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'SNA001', N'SNACK', N'Lays wavy', 6000, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'SNA002', N'SNACK', N'Oishi Tôm', 5000, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'SNA003', N'SNACK', N'Snack cua', 6200, 36, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'SNA004', N'SNACK', N'Toonies phô mai', 6400, 36, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'SNA005', N'SNACK', N'Oishi Tomati', 5400, 35, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'SNA006', N'SNACK', N'O''Star', 6600, 30, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU001', N'STUDIES', N'Gôm Pentel', 3000, 12, 1)
GO
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU002', N'STUDIES', N'Bút bi TL-079', 4000, 46, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU003', N'STUDIES', N'Hồ dán', 3200, 12, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU004', N'STUDIES', N'Bút chì 2B', 5000, 25, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU005', N'STUDIES', N'Sổ lò xo 100 trang', 22000, 10, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU006', N'STUDIES', N'Sổ caro', 46000, 8, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU007', N'STUDIES', N'Thước dẻo 20cm', 3000, 12, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU008', N'STUDIES', N'Giấy note 5 màu', 6000, 10, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'STU009', N'STUDIES', N'Casio FX-570 VN Plus', 546000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'VEG001', N'VEGATABLE', N'Cà rốt', 30000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'VEG002', N'VEGATABLE', N'Củ cải trắng', 20000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'VEG003', N'VEGATABLE', N'Khổ qua', 30000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'VEG004', N'VEGATABLE', N'Củ sắn', 30000, 10, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'VEG005', N'VEGATABLE', N'Đậu que', 25000, 15, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'VEG006', N'VEGATABLE', N'Khoai môn', 30000, 5, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT001', N'WATER', N'Aquafina 355ml', 4200, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT002', N'WATER', N'Aquafina 500ml', 4300, 576, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT003', N'WATER', N'Aquafina 1,5L', 9300, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT004', N'WATER', N'LaVie 500ml', 4000, 576, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT005', N'WATER', N'LaVie 750ml', 8100, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT006', N'WATER', N'LaVie 1,5L', 10600, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT007', N'WATER', N'LaVie 6L', 22000, 12, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT008', N'WATER', N'LaVie 350ml', 4500, 38, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT009', N'WATER', N'Dasani 350ml', 4000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT010', N'WATER', N'Dasani 500ml', 5000, 192, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT011', N'WATER', N'Dasani 1,5L', 9300, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT012', N'WATER', N'Vĩnh Hảo 500ml', 5000, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT013', N'WATER', N'Vĩnh Hảo 1,5L', 9000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT014', N'WATER', N'Vivant 500ml', 4600, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT015', N'WATER', N'I-on Life 330ml', 4500, 24, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT016', N'WATER', N'I-on Life 450ml', 5500, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT017', N'WATER', N'I-on Life 1,25L', 11600, 36, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT018', N'WATER', N'I-on Life 4,5L', 31000, 15, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT019', N'WATER', N'Fujiwa 300ml', 5000, 48, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT020', N'WATER', N'Fujiwa 450ml', 6000, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT021', N'WATER', N'Fujiwa 680ml', 9000, 96, 1)
INSERT [dbo].[MatHang] ([maMH], [maLMH], [tenMatHang], [thanhTien], [soLuong], [status]) VALUES (N'WAT022', N'WATER', N'Fujiwa 1,25L', 12600, 10, 1)
GO
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'AGGA', N'AGONGA', N'0453245312')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'DA', N'Đông Á', N'0909090909')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'KON', N'Konosuba', N'0342354252')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'SEGGG', N'SHIELDHERO', N'0969696969')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'VLEG', N'VietLEO', N'0931244325')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [SDT]) VALUES (N'VNG', N'Đông Lào', N'0975624372')
GO
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'ad', N'AD', N'FU1', N'Admin', N'ad123', N'079202034777', N'0707029548', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV001', N'QL', N'FU2', N'Trần Nguyên Lộc', N'user1', N'079165969975', N'0936446546', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV002', N'QL', N'FU1', N'Võ Đăng Quang', N'user2', N'079641561656', N'0934464886', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV003', N'NV', N'PA1', N'Nguyễn Văn Tấn Quân', N'user3', N'079255161337', N'0946131122', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV004', N'NV', N'PA2', N'Nguyễn Thanh Thảo', N'user4', N'079211132164', N'0996562332', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV005', N'NV', N'PA3', N'Nguyễn Văn Công', N'user5', N'079622562620', N'0944566632', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV006', N'NV', N'PA4', N'Đặng Văn Mến', N'user6', N'079231515612', N'0836564921', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV007', N'NV', N'PA2', N'Lê Minh Thư', N'user7', N'079615563323', N'0834568326', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV008', N'NV', N'FU1', N'Lê Minh Tâm', N'user8', N'079615563324', N'0834568326', 1)
INSERT [dbo].[NhanVien] ([maNV], [maCV], [maCa], [tenNV], [pwd], [cccd], [sdt], [status]) VALUES (N'NV009', N'NV', N'FU2', N'Trần Thị Kim Thanh', N'user9', N'079328472971', N'0904327363', 1)
GO
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'NOTSHOCK', N'---', N'Không giảm', 0)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'BIG10P', N'Giảm 10%', N'Giảm 10% trên tổng hoá đơn', 0.1)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'BIG15P', N'Giảm 15%', N'Giảm 15% trên tổng hoá đơn', 0.15)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'SHOCK20P', N'Giảm 20%', N'Giảm 20% trên tổng hoá đơn', 0.2)
INSERT [dbo].[PhieuGiamGia] ([maGiamGia], [tenGiamGia], [noiDung], [tileGiam]) VALUES (N'SHOCK5P', N'Giảm 5%', N'Giảm 5% trên tổng hoá đơn', 0.05)
GO
INSERT [dbo].[PhieuNhapHang] ([maPhieuNhap], [maNCC], [ngayNhap]) VALUES (N'NH001', N'AGGA', CAST(N'2022-04-24' AS Date))
INSERT [dbo].[PhieuNhapHang] ([maPhieuNhap], [maNCC], [ngayNhap]) VALUES (N'NH002', N'VNG', CAST(N'2022-04-24' AS Date))
INSERT [dbo].[PhieuNhapHang] ([maPhieuNhap], [maNCC], [ngayNhap]) VALUES (N'NH003', N'VLEG', CAST(N'2022-04-24' AS Date))
INSERT [dbo].[PhieuNhapHang] ([maPhieuNhap], [maNCC], [ngayNhap]) VALUES (N'NH004', N'SEGGG', CAST(N'2022-04-24' AS Date))
INSERT [dbo].[PhieuNhapHang] ([maPhieuNhap], [maNCC], [ngayNhap]) VALUES (N'NH005', N'KON', CAST(N'2022-04-24' AS Date))
INSERT [dbo].[PhieuNhapHang] ([maPhieuNhap], [maNCC], [ngayNhap]) VALUES (N'NH006', N'DA', CAST(N'2022-04-25' AS Date))
INSERT [dbo].[PhieuNhapHang] ([maPhieuNhap], [maNCC], [ngayNhap]) VALUES (N'NH007', N'SEGGG', CAST(N'2022-04-25' AS Date))
INSERT [dbo].[PhieuNhapHang] ([maPhieuNhap], [maNCC], [ngayNhap]) VALUES (N'PN20221206125805', N'KON', CAST(N'2022-12-06' AS Date))
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
USE [master]
GO
ALTER DATABASE [MiniStore] SET  READ_WRITE 
GO
