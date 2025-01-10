package com.efx.Science.until;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import com.efx.Science.model.cduse;
import com.efx.Science.model.cdyha;
import com.efx.Science.model.cdyhb;
import com.efx.Science.service.CduseService;
import com.efx.Science.service.CdyhaService;
import com.efx.Science.service.CdyhbService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


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
		cdyha item = new cdyha();
		for (int row_num = 1; row_num < sheet.getPhysicalNumberOfRows(); row_num++) {
			row = sheet.getRow(row_num);
			if (row != null) {
				name = getValue(row.getCell(0)).replaceAll(" ", "");
				num = getValue(row.getCell(1)).replaceAll(" ", "");
				fee = getValue(row.getCell(2)).replaceAll(" ", "");
				if (!name.isEmpty()) {
					item=yhaService.selectByName(name);
					if(item==null){
						item=new cdyha();
						item.setYha002(name);
						if(!num.isEmpty())item.setYha004(Integer.valueOf(num));
						if(!fee.isEmpty())item.setYha005(Float.valueOf(fee));
						item.setYha006(0);
						item = yhaService.insert(item);
					}else{
						if(!num.isEmpty())item.setYha004(Integer.valueOf(num));
						if(!fee.isEmpty())item.setYha005(Float.valueOf(fee));
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
		String lxphone="";
		String date="";
		String num="";
		String fee="";
		cdyhb item = new cdyhb();
		for (int row_num = 1; row_num < sheet.getPhysicalNumberOfRows(); row_num++) {
			row = sheet.getRow(row_num);
			if (row != null) {
				zhname = getValue(row.getCell(0)).replaceAll(" ", "");
				zhzname = getValue(row.getCell(1)).replaceAll(" ", "");
				zhphone = getValue(row.getCell(2)).replaceAll(" ", "");
				name = getValue(row.getCell(3)).replaceAll(" ", "");
				dress = getValue(row.getCell(4)).replaceAll(" ", "");
				lxname = getValue(row.getCell(5)).replaceAll(" ", "");
				lxphone = getValue(row.getCell(6)).replaceAll(" ", "");
				date = getValue(row.getCell(7)).replaceAll(" ", "");
				num = getValue(row.getCell(8)).replaceAll(" ", "");
				fee = getValue(row.getCell(9)).replaceAll(" ", "");
				if (!name.isEmpty()) {
					item=yhbService.selectByName(name,id);
					if(item==null){
						item=new cdyhb();
						item.setYhb002(id);
						item.setYhb004(name);
						if(!dress.isEmpty())item.setYhb005(dress);
						if(!lxname.isEmpty())item.setYhb006(lxname);
						if(!lxphone.isEmpty())item.setYhb007(lxphone);
						if(!num.isEmpty())item.setYhb016(Integer.valueOf(num));
						if(!fee.isEmpty())item.setYhb017(Float.valueOf(fee));
						if(!date.isEmpty())item.setYhb011(sdf2.parse(date));
						item.setYhb012(0);
						item.setYhb013(0);
						item.setYhb014(0);
						item.setYhb015(0);
						item = yhbService.insert(item);
						if(!zhname.isEmpty()){
							cduse use = useService.selectByName(zhname,item.getYhb001());
							if(use==null){
								use=new cduse();
								use.setUse002(zhname);
								use.setUse004(zhzname);
								use.setUse005(zhphone);
								use.setUse003(EncrpytUtil.getSHA256("123456"));
								use.setUse009("C");
								use.setUse011(item.getYhb001());
								use.setUse013("M");
								useService.insert(use);
							}else{
								use.setUse004(zhzname);
								use.setUse005(zhphone);
								useService.update(use);
							}
						}
					}else{
						if(!dress.isEmpty())item.setYhb005(dress);
						if(!lxname.isEmpty())item.setYhb006(lxname);
						if(!lxphone.isEmpty())item.setYhb007(lxphone);
						if(!num.isEmpty())item.setYhb016(Integer.valueOf(num));
						if(!fee.isEmpty())item.setYhb017(Float.valueOf(fee));
						if(!date.isEmpty())item.setYhb011(sdf2.parse(date));
						yhbService.update(item);
						if(!zhname.isEmpty()){
							cduse use = useService.selectByName(zhname,item.getYhb001());
							if(use==null){
								use=new cduse();
								use.setUse002(zhname);
								use.setUse004(zhzname);
								use.setUse005(zhphone);
								use.setUse003(EncrpytUtil.getSHA256("123456"));
								use.setUse009("C");
								use.setUse011(item.getYhb001());
								use.setUse013("M");
								useService.insert(use);
							}else{
								use.setUse004(zhzname);
								use.setUse005(zhphone);
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

}
