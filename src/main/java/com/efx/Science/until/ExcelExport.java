package com.efx.Science.until;

import com.efx.Science.model.*;
import com.efx.Science.service.CduseService;
import com.efx.Science.service.CdyhaService;
import com.efx.Science.service.CdyhbService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.apache.poi.ss.usermodel.CellStyle.ALIGN_CENTER;


/**
 * 导出并下载EXCL文件
 * 王新苗
 * 2021-06-10
 */
public class ExcelExport {
	private static SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static SimpleDateFormat sdf1= new SimpleDateFormat("yyMMddHHmmss");
	private static SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy年MM月dd日");

	private FileOutputStream out = null;

	private static OutputStream outt = null;
	String path = null;
	public static void getByExcellevel(InputStream in, String fileName, CdyhaService yhaService) throws Exception {
		ExcelImport exc = new ExcelImport();
		// 创建Excel工作薄
		Workbook work = exc.getWorkbook(in, fileName);
		if (null == work) {
			throw new Exception("创建Excel工作薄为空！");
		}
		Sheet sheet = null; // 页数
		Row row = null; // 行数
		//Cell cell = null; // 列数
		sheet = work.getSheetAt(0);
		String name="";
		String num="";
		String fee="";
		String yfee="";
		cdyha item = new cdyha();
		for (int row_num = 1; row_num < sheet.getPhysicalNumberOfRows(); row_num++) {
			row = sheet.getRow(row_num);
			if (row != null) {
				name = getValue(row.getCell(0)).replaceAll(" ", "");
				num = getValue(row.getCell(1)).replaceAll(" ", "");
				fee = getValue(row.getCell(2)).replaceAll(" ", "");
				yfee = getValue(row.getCell(3)).replaceAll(" ", "");
				if (!name.isEmpty()) {
					item=yhaService.selectByName(name);
					if(item==null){
						item=new cdyha();
						item.setYha002(name);
						if(!num.isEmpty())item.setYha004(Integer.valueOf(num));
						if(!fee.isEmpty())item.setYha005(Float.valueOf(fee));
						item.setYha006(yfee.isEmpty()?item.getYha004(): Integer.valueOf(yfee));
						item = yhaService.insert(item);
					}else{
						if(!num.isEmpty())item.setYha004(Integer.valueOf(num));
						if(!fee.isEmpty())item.setYha005(Float.valueOf(fee));
						item.setYha006(yfee.isEmpty()?item.getYha004(): Integer.valueOf(yfee));
						yhaService.update(item);
					}
				}
			}
		}
	}

	public static void getByExcelchose(InputStream in, String fileName, CduseService useService, CdyhbService yhbService, Integer id) throws Exception {
		ExcelImport exc = new ExcelImport();
		// 创建Excel工作薄
		Workbook work = exc.getWorkbook(in, fileName);
		if (null == work) {
			throw new Exception("创建Excel工作薄为空！");
		}
		Sheet sheet = null; // 页数
		Row row = null; // 行数
		//Cell cell = null; // 列数
		sheet = work.getSheetAt(0);
		String zhname="";
		String zhzname="";
		String zhphone="";
		String name="";
		String dress="";
		String lxname="";
		String phone="";
		String num="";
		String fee="";
		cdyhb item = new cdyhb();
		for (int row_num = 1; row_num < sheet.getPhysicalNumberOfRows(); row_num++) {
			row = sheet.getRow(row_num);
			if (row != null) {
				name = getValue(row.getCell(0)).replaceAll(" ", "");
				dress = getValue(row.getCell(1)).replaceAll(" ", "");
				lxname = getValue(row.getCell(2)).replaceAll(" ", "");
				phone = getValue(row.getCell(3)).replaceAll(" ", "");
				num = getValue(row.getCell(4)).replaceAll(" ", "");
				fee = getValue(row.getCell(5)).replaceAll(" ", "");
				zhname = getValue(row.getCell(6)).replaceAll(" ", "");
				zhzname = getValue(row.getCell(7)).replaceAll(" ", "");
				zhphone = getValue(row.getCell(8)).replaceAll(" ", "");
				if (!name.isEmpty()) {
					item=yhbService.selectByName(name,id);
					if(item==null){
						item=new cdyhb();
						item.setYhb002(id);
						item.setYhb004(name);
						if(!dress.isEmpty())item.setYhb005(dress);
						if(!lxname.isEmpty())item.setYhb006(lxname);
						if(!phone.isEmpty())item.setYhb007(phone);
						if(!num.isEmpty())item.setYhb016(Integer.valueOf(num));
						if(!fee.isEmpty())item.setYhb017(Float.valueOf(fee));
						item.setYhb012(0);
						item.setYhb013(0);
						item.setYhb014(0);
						item.setYhb015(0);
						item.setYhb011(new Date());
						item = yhbService.insert(item);
						if(!zhname.isEmpty()){
							cduse use = useService.selectByName(zhname,"C",item.getYhb001());
							if(use==null){
								use=new cduse();
								use.setUse002(zhname);
								use.setUse003(EncrpytUtil.getSHA256("123456"));
								if(!zhzname.isEmpty())use.setUse004(zhzname);
								if(!zhphone.isEmpty())use.setUse005(zhphone);
								use.setUse013("M");
								use.setUse009("C");
								use.setUse011(item.getYhb001());
								useService.insert(use);
							}else{
								if(!zhzname.isEmpty())use.setUse004(zhzname);
								if(!zhphone.isEmpty())use.setUse005(zhphone);
								useService.update(use);
							}
						}
					}else{
						if(!dress.isEmpty())item.setYhb005(dress);
						if(!lxname.isEmpty())item.setYhb006(lxname);
						if(!phone.isEmpty())item.setYhb007(phone);
						if(!num.isEmpty())item.setYhb016(Integer.valueOf(num));
						if(!fee.isEmpty())item.setYhb017(Float.valueOf(fee));
						yhbService.update(item);
						if(!zhname.isEmpty()){
							cduse use = useService.selectByName(zhname,"C",item.getYhb001());
							if(use==null){
								use=new cduse();
								use.setUse002(zhname);
								use.setUse003(EncrpytUtil.getSHA256("123456"));
								if(!zhzname.isEmpty())use.setUse004(zhzname);
								if(!zhphone.isEmpty())use.setUse005(zhphone);
								use.setUse013("M");
								use.setUse009("C");
								use.setUse011(item.getYhb001());
								useService.insert(use);
							}else{
								if(!zhzname.isEmpty())use.setUse004(zhzname);
								if(!zhphone.isEmpty())use.setUse005(zhphone);
								useService.update(use);
							}
						}
					}
				}
			}
		}
	}

	/**
	 * 描述：对表格中数值进行格式化
	 * @param cell
	 * @return
	 */
	//解决excel类型问题，获得数值
	public static  String getValue(Cell cell) {
		String value = "";
		if(null==cell){
			return value;
		}
		switch (cell.getCellType()) {
			//数值型
			case Cell.CELL_TYPE_NUMERIC:
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					//如果是date类型则 ，获取该cell的date值
					Date date = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
					value = format.format(date);;
				}else {// 纯数字
					BigDecimal big=new BigDecimal(cell.getNumericCellValue());
					value = big.toString();
					//解决1234.0  去掉后面的.0
					if(null!=value&&!"".equals(value.trim())){
						String[] item = value.split("[.]");
						if(1<item.length&&"0".equals(item[1])){
							value=item[0];
						}
					}
				}
				break;
			//字符串类型
			case Cell.CELL_TYPE_STRING:
				value = cell.getStringCellValue().toString();
				break;
			// 公式类型
			case Cell.CELL_TYPE_FORMULA:
				//读公式计算值
				value = String.valueOf(cell.getNumericCellValue());
				if (value.equals("NaN")) {// 如果获取的数据值为非法值,则转换为获取字符串
					value = cell.getStringCellValue().toString();
				}
				break;
			// 布尔类型
			case Cell.CELL_TYPE_BOOLEAN:
				value = " "+ cell.getBooleanCellValue();
				break;
			default:
				value = cell.getStringCellValue().toString();
		}
		if("null".endsWith(value.trim())){
			value="";
		}
		return value;
	}


	public void ExcelexportyYYMX(HttpServletRequest request, HttpServletResponse response, PageBean pb, String name) throws Exception {
		// web浏览通过MIME类型判断文件是excel类型
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		String fileName =name+"预约明细.xls";// 下载的时候的文件名
		String file=name+"预约明细";

		final String userAgent = request.getHeader("USER-AGENT");
		String finalFileName = null;
		try {
			outt = response.getOutputStream();
			if (StringUtils.contains(userAgent, "MSIE")) {// IE浏览器
				finalFileName = URLEncoder.encode(fileName, "UTF8");
			} else if (StringUtils.contains(userAgent, "Mozilla")) {// google,火狐浏览器
				finalFileName = new String(fileName.getBytes(), "ISO8859-1");
			} else {
				finalFileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		// Content-disposition属性设置成以附件方式进行下载
		response.setHeader("Content-disposition", "attachment;filename="
				+ finalFileName);

		try {
			outt = response.getOutputStream();
		} catch (IOException e) {

			e.printStackTrace();
		}
		// 声明一个工作簿
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet(file);
		sheet.setDefaultColumnWidth(25);
		sheet.setDefaultRowHeightInPoints(20);
		HSSFRow row = sheet.createRow(0);
		HSSFCellStyle cellStyle4 = wb.createCellStyle();
		// 字体
		HSSFFont fontStyle4 = wb.createFont();
		fontStyle4.setFontName("宋体");
		fontStyle4.setFontHeightInPoints((short) 26);
		fontStyle4.setBold(true);//粗体显示
		cellStyle4.setFont(fontStyle4);
		cellStyle4.setAlignment(ALIGN_CENTER);//水平居中
		cellStyle4.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中
		CellRangeAddress sv1 = new CellRangeAddress((short) 0, (short) 0,(short) 0, (short) (pb.getOthersql3()==null?17:20));
		sheet.addMergedRegion(sv1);
		HSSFCell cells = row.createCell((short) 0);// 合并单元格示例
		cells.setCellValue(file);
		cells.setCellStyle(cellStyle4);
		row.setHeight((short) 800);
		// 字体
		HSSFFont fontStyle = wb.createFont();
		fontStyle.setFontHeightInPoints((short) 11);
		HSSFCellStyle cellStyle = wb.createCellStyle();
//		cellStyle.setLocked(true);
		// 这里仅设置了底边边框，左边框、右边框和顶边框同理可设
		cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
		cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
		cellStyle.setFont(fontStyle);
		cellStyle.setWrapText(true);// 自动换行

		row=sheet.createRow(1);
//		row.createCell(0).setCellValue("统计条件："+file);
		if(pb.getOthersql1()!=null)row.createCell(0).setCellValue("开始时间："+pb.getOthersql1());
		if(pb.getOthersql2()!=null)row.createCell(1).setCellValue("结束时间："+pb.getOthersql2());

		row = sheet.createRow(2);
		// 创建HSSFCell对象
		HSSFCell cell = row.createCell(0);
		if(pb.getOthersql3()==null){
			String[] s={"序号","授课方名称","选课方名称","课程名称","服务时间","服务地点","服务人次","交通补贴金额","课程金额"
					,"内容科学性","内容丰富性","内容与人的相应度","内容时长设置","课前准备","讲师场控能力","课堂互动","总体评价","其他意见或建议"};
			for(int j=0;j<=17;j++){
				cell = row.createCell(j);
				cell.setCellValue(s[j]);
				cell.setCellStyle(cellStyle);
			}
		}else{
			String[] s={"序号","姓名","身份证号码","银行卡号","开户行","选课方名称","课程名称","服务时间","服务地点","服务人次","交通补贴金额","课程金额"
					,"内容科学性","内容丰富性","内容与人的相应度","内容时长设置","课前准备","讲师场控能力","课堂互动","总体评价","其他意见或建议"};
			for(int j=0;j<=20;j++){
				cell = row.createCell(j);
				cell.setCellValue(s[j]);
				cell.setCellStyle(cellStyle);
			}
		}

		int rowNum=3;
		List<cdyhe> list=pb.getResultList();
		for (int j = 0; j<list.size(); j++) {
			row = sheet.createRow(rowNum);
			if(pb.getOthersql3()==null){
				String[] s1={String.valueOf(j),name,
						list.get(j).getYhb().getYhb004(),
						list.get(j).getHba().getHba002(),
						sdf2.format(list.get(j).getYhe008()),
						list.get(j).getYhe009(),
						list.get(j).getYhe016()!=null?list.get(j).getYhe016().toString():"",
						list.get(j).getYhe018()!=null?list.get(j).getYhe018().toString():"",
						list.get(j).getYhe012().toString(),
						list.get(j).getYhe021()==null?"":(list.get(j).getYhe021().equals("A")?"强":(list.get(j).getYhe021().equals("B")?"较强":(list.get(j).getYhe021().equals("C")?"一般":""))),
						list.get(j).getYhe022()==null?"":(list.get(j).getYhe022().equals("A")?"很丰富":(list.get(j).getYhe022().equals("B")?"较好":(list.get(j).getYhe022().equals("C")?"一般":""))),
						list.get(j).getYhe023()==null?"":(list.get(j).getYhe023().equals("A")?">很相应":(list.get(j).getYhe023().equals("B")?"参差不一":(list.get(j).getYhe023().equals("C")?"不相应":""))),
						list.get(j).getYhe024()==null?"":(list.get(j).getYhe024().equals("A")?"合理":(list.get(j).getYhe024().equals("B")?"偏短":(list.get(j).getYhe024().equals("C")?"偏长":""))),
						list.get(j).getYhe025()==null?"":(list.get(j).getYhe025().equals("A")?"充分":(list.get(j).getYhe025().equals("B")?"一般":(list.get(j).getYhe025().equals("C")?"不充分":""))),
						list.get(j).getYhe026()==null?"":(list.get(j).getYhe026().equals("A")?"很强":(list.get(j).getYhe026().equals("B")?"一般":(list.get(j).getYhe026().equals("C")?"较弱":""))),
						list.get(j).getYhe027()==null?"":(list.get(j).getYhe027().equals("A")?"较多":(list.get(j).getYhe027().equals("B")?"弱":(list.get(j).getYhe027().equals("C")?"没有":""))),
						list.get(j).getYhe028()==null?"":(list.get(j).getYhe028().equals("A")?"非常满意":(list.get(j).getYhe028().equals("B")?"满意":(list.get(j).getYhe028().equals("C")?"一般":(list.get(j).getYhe028().equals("D")?"不满意":"")))),
						list.get(j).getYhe029()};
				for(int a=0;a<=17;a++){
					cell = row.createCell(a);
					cell.setCellValue(s1[a]);
					cell.setCellStyle(cellStyle);
				}
			}else{
				String[] s1={String.valueOf(j),name,
						list.get(j).getSmd().getSmd004(),
						list.get(j).getSmd().getSmd006(),
						list.get(j).getSmd().getSmd005(),
						list.get(j).getYhb().getYhb004(),
						list.get(j).getHba().getHba002(),
						sdf2.format(list.get(j).getYhe008()),
						list.get(j).getYhe009(),
						list.get(j).getYhe016()!=null?list.get(j).getYhe016().toString():"",
						list.get(j).getYhe018()!=null?list.get(j).getYhe018().toString():"",
						list.get(j).getYhe012().toString(),
						list.get(j).getYhe021()==null?"":(list.get(j).getYhe021().equals("A")?"强":(list.get(j).getYhe021().equals("B")?"较强":(list.get(j).getYhe021().equals("C")?"一般":""))),
						list.get(j).getYhe022()==null?"":(list.get(j).getYhe022().equals("A")?"很丰富":(list.get(j).getYhe022().equals("B")?"较好":(list.get(j).getYhe022().equals("C")?"一般":""))),
						list.get(j).getYhe023()==null?"":(list.get(j).getYhe023().equals("A")?">很相应":(list.get(j).getYhe023().equals("B")?"参差不一":(list.get(j).getYhe023().equals("C")?"不相应":""))),
						list.get(j).getYhe024()==null?"":(list.get(j).getYhe024().equals("A")?"合理":(list.get(j).getYhe024().equals("B")?"偏短":(list.get(j).getYhe024().equals("C")?"偏长":""))),
						list.get(j).getYhe025()==null?"":(list.get(j).getYhe025().equals("A")?"充分":(list.get(j).getYhe025().equals("B")?"一般":(list.get(j).getYhe025().equals("C")?"不充分":""))),
						list.get(j).getYhe026()==null?"":(list.get(j).getYhe026().equals("A")?"很强":(list.get(j).getYhe026().equals("B")?"一般":(list.get(j).getYhe026().equals("C")?"较弱":""))),
						list.get(j).getYhe027()==null?"":(list.get(j).getYhe027().equals("A")?"较多":(list.get(j).getYhe027().equals("B")?"弱":(list.get(j).getYhe027().equals("C")?"没有":""))),
						list.get(j).getYhe028()==null?"":(list.get(j).getYhe028().equals("A")?"非常满意":(list.get(j).getYhe028().equals("B")?"满意":(list.get(j).getYhe028().equals("C")?"一般":(list.get(j).getYhe028().equals("D")?"不满意":"")))),
						list.get(j).getYhe029()};
				for(int a=0;a<=20;a++){
					cell = row.createCell(a);
					cell.setCellValue(s1[a]);
					cell.setCellStyle(cellStyle);
				}
			}

			rowNum ++;
		}
		try {
			wb.write(outt);
			outt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ExcelexportyYYMX1(HttpServletRequest request, HttpServletResponse response, PageBean pb, String name) throws Exception {
		// web浏览通过MIME类型判断文件是excel类型
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		String fileName =name+"预约明细.xls";// 下载的时候的文件名
		String file=name+"预约明细";

		final String userAgent = request.getHeader("USER-AGENT");
		String finalFileName = null;
		try {
			outt = response.getOutputStream();
			if (StringUtils.contains(userAgent, "MSIE")) {// IE浏览器
				finalFileName = URLEncoder.encode(fileName, "UTF8");
			} else if (StringUtils.contains(userAgent, "Mozilla")) {// google,火狐浏览器
				finalFileName = new String(fileName.getBytes(), "ISO8859-1");
			} else {
				finalFileName = URLEncoder.encode(fileName, "UTF8");// 其他浏览器
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		// Content-disposition属性设置成以附件方式进行下载
		response.setHeader("Content-disposition", "attachment;filename="
				+ finalFileName);

		try {
			outt = response.getOutputStream();
		} catch (IOException e) {

			e.printStackTrace();
		}
		// 声明一个工作簿
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet(file);
		sheet.setDefaultColumnWidth(25);
		sheet.setDefaultRowHeightInPoints(20);
		HSSFRow row = sheet.createRow(0);
		HSSFCellStyle cellStyle4 = wb.createCellStyle();
		// 字体
		HSSFFont fontStyle4 = wb.createFont();
		fontStyle4.setFontName("宋体");
		fontStyle4.setFontHeightInPoints((short) 26);
		fontStyle4.setBold(true);//粗体显示
		cellStyle4.setFont(fontStyle4);
		cellStyle4.setAlignment(ALIGN_CENTER);//水平居中
		cellStyle4.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中
		CellRangeAddress sv1 = new CellRangeAddress((short) 0, (short) 0,(short) 0, (short) 10);
		sheet.addMergedRegion(sv1);
		HSSFCell cells = row.createCell((short) 0);// 合并单元格示例
		cells.setCellValue(file);
		cells.setCellStyle(cellStyle4);
		row.setHeight((short) 800);
		// 字体
		HSSFFont fontStyle = wb.createFont();
		fontStyle.setFontHeightInPoints((short) 11);
		HSSFCellStyle cellStyle = wb.createCellStyle();
//		cellStyle.setLocked(true);
		// 这里仅设置了底边边框，左边框、右边框和顶边框同理可设
		cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
		cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);
		cellStyle.setFont(fontStyle);
		cellStyle.setWrapText(true);// 自动换行

		row=sheet.createRow(1);
//		row.createCell(0).setCellValue("统计条件："+file);
//		if(pb.getOthersql1()!=null)row.createCell(0).setCellValue("开始时间："+pb.getOthersql1());
//		if(pb.getOthersql2()!=null)row.createCell(1).setCellValue("结束时间："+pb.getOthersql2());

		row = sheet.createRow(2);
		// 创建HSSFCell对象
		HSSFCell cell = row.createCell(0);
		if(pb.getOthersql3().equals("C")){
			String[] s={"序号","课程名称","课程代码","授课方","授课地点","活动日期","预约日期备注","活动人数","其他说明","联系人","联系电话"};
			for(int j=0;j<=10;j++){
				cell = row.createCell(j);
				cell.setCellValue(s[j]);
				cell.setCellStyle(cellStyle);
			}
		}else{
			String[] s={"序号","课程名称","课程代码","选课方","授课地点","活动日期","预约日期备注","活动人数","其他说明","联系人","联系电话"};
				for(int j=0;j<=10;j++){
				cell = row.createCell(j);
				cell.setCellValue(s[j]);
				cell.setCellStyle(cellStyle);
			}
		}

		int rowNum=3;
		List<cdyhe> list=pb.getResultList();
		for (int j = 0; j<list.size(); j++) {
			row = sheet.createRow(rowNum);
			if(pb.getOthersql3().equals("C")){
				String[] s1={String.valueOf(j),list.get(j).getHba().getHba002(),list.get(j).getHba().getHba035(),
						list.get(j).getSmd().getSmd003(),
						list.get(j).getYhe009(),
						sdf2.format(list.get(j).getYhe008()),
						list.get(j).getYhe042(),
						list.get(j).getYhe010().toString(),
						list.get(j).getYhe043(),
						list.get(j).getHba().getHba016(),
						list.get(j).getHba().getHba017()
						};
				for(int a=0;a<=10;a++){
					cell = row.createCell(a);
					cell.setCellValue(s1[a]);
					cell.setCellStyle(cellStyle);
				}
			}else{
				String[] s1={String.valueOf(j),list.get(j).getHba().getHba002(),list.get(j).getHba().getHba035(),
						list.get(j).getYhb().getYhb004(),
						list.get(j).getYhe009(),
						sdf2.format(list.get(j).getYhe008()),
						list.get(j).getYhe042(),
						list.get(j).getYhe010().toString(),
						list.get(j).getYhe043(),
						list.get(j).getYhe044()!=null?list.get(j).getYhe044():list.get(j).getYhb().getYhb006(),
						list.get(j).getYhe045()!=null?list.get(j).getYhe045():list.get(j).getYhb().getYhb007()
				};
				for(int a=0;a<=10;a++){
					cell = row.createCell(a);
					cell.setCellValue(s1[a]);
					cell.setCellStyle(cellStyle);
				}
			}

			rowNum ++;
		}
		try {
			wb.write(outt);
			outt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
