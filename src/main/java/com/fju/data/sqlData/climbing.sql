-- --------------------------------------------------------
-- 主機:                           127.0.0.1
-- 伺服器版本:                        10.6.1-MariaDB - mariadb.org binary distribution
-- 伺服器作業系統:                      Win64
-- HeidiSQL 版本:                  11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- 傾印 climbing 的資料庫結構
CREATE DATABASE IF NOT EXISTS `climbing` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `climbing`;

-- 傾印  資料表 climbing.internet 結構
CREATE TABLE IF NOT EXISTS `internet` (
  `name` longtext NOT NULL,
  `url` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- 正在傾印表格  climbing.internet 的資料：~22 rows (近似值)
/*!40000 ALTER TABLE `internet` DISABLE KEYS */;
INSERT INTO `internet` (`name`, `url`) VALUES
	('Java Swing 測試 : 捲軸面板 JScrollPane', 'http://yhhuang1966.blogspot.com/2014/05/java-swing-jscrollpane.html'),
	('在JAVA應用按鈕實現超連結', 'https://www.itread01.com/p/274982.html'),
	('SwingUtilities類中的invokeLater()和invokeAndWait()方法理解', 'https://www.itread01.com/content/1546616537.html'),
	('設計模式與遊戲開發的完美結合', 'https://www.books.com.tw/products/0010703628'),
	('textarea怎么禁止输入', 'https://zhidao.baidu.com/question/312159368.html'),
	('IntelliJ IDEA 新增 spring 庫 以及 匯入資料庫', 'https://www.itread01.com/p/1408297.html'),
	('【從零開始學 Java 程式設計】JButton 按鈕元件與 Event Listener 事件監聽', 'http://tw-hkt.blogspot.com/2019/05/java-jbutton.html'),
	('如何在java中製作倒數計時器', 'http://hk.uwenku.com/question/p-hbjnzjml-ov.html'),
	('解決 MySQL 中文亂碼的煩腦', 'https://kknews.cc/code/2lv56az.html'),
	('MySQL 資料型態', 'https://www.itread01.com/study/mysql-data-types.html'),
	('關於MySQL的AUTO_INCREMENT(自動遞增)的設定', 'https://www.itread01.com/p/1144471.html'),
	('MySQL VARCHAR最大長度限制(maximum length)', 'https://matthung0807.blogspot.com/2019/06/mysql-varcharmaximum-length.html'),
	('MySQL/MariaDB 新增資料庫、建立使用者帳號與資料表指令教學', 'https://blog.gtwang.org/linux/mysql-create-database-add-user-table-tutorial/'),
	('Java滑鼠事件MouseEvent', 'https://www.itread01.com/content/1542818596.html'),
	('連猴子都能懂得Git入門指南', 'https://backlog.com/git-tutorial/tw/reference/remote.html'),
	('Java簡單操作資料庫', 'https://ethan-imagination.blogspot.com/2018/12/javase-gettingstarted-023.html'),
	('Java資料庫環境架設', 'https://ethan-imagination.blogspot.com/2018/12/javase-gettingstarted-022.html'),
	('关于java的GUI简单切换界面', 'https://blog.csdn.net/qq_43919694/article/details/88828453'),
	('Java 彈出對話方塊的幾種方式', 'https://www.itread01.com/content/1547206088.html'),
	('MySQL 語法匯整', 'http://note.drx.tw/2012/12/mysql-syntax.html'),
	('MySQL指令大全', 'https://aa1218bb.pixnet.net/blog/post/12109430'),
	('MySQL 教程', 'https://www.itread01.com/study/mysql-tutorial.html');
/*!40000 ALTER TABLE `internet` ENABLE KEYS */;

-- 傾印  資料表 climbing.qa_depository 結構
CREATE TABLE IF NOT EXISTS `qa_depository` (
  `number` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(600) NOT NULL,
  `a` varchar(60) NOT NULL,
  `b` varchar(60) NOT NULL,
  `c` varchar(60) NOT NULL,
  `d` varchar(60) NOT NULL,
  `answer` varchar(12) NOT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- 正在傾印表格  climbing.qa_depository 的資料：~5 rows (近似值)
/*!40000 ALTER TABLE `qa_depository` DISABLE KEYS */;
INSERT INTO `qa_depository` (`number`, `question`, `a`, `b`, `c`, `d`, `answer`) VALUES
	(1, '以下何者非高海拔腦水腫發作時，所該做的事?', '繼續登山不管病情', '馬上下撤到低海拔地帶', '給予患者氧氣', '藥物治療', 'A'),
	(2, '何者為常見的山難原因?', '失溫', '迷路', '墜崖與滑落', '以上皆是', 'D'),
	(3, '那些為常見的高山症藥物?', '丹木斯', '威而剛', 'Nifedipine(鈣離子通道阻斷劑)', '以上皆是', 'D'),
	(4, '在登山前，以下哪個選項為必須裝備?', '化妝品', '頭燈', '照相機', '書', 'B'),
	(5, '拿到等高線地圖後首先要看的是什麼?', '找出溪谷、溪流 (水線)', '找出主稜、支稜、鞍部', '找出目標山區最高點（山頂or三角點）', '從等高線圖推想山容', 'C'),
	(6, '以下何者為迷路的SOP?', 'Stop->Think->Observe->Plan', 'Plan->Stop->Observe->Think', 'Think->Observe->Plan->Stop', 'Observe->Plan->Stop->Think', 'A');
/*!40000 ALTER TABLE `qa_depository` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
