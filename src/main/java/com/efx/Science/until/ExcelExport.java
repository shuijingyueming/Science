package com.efx.Science.until;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import com.efx.Science.model.cdyha;
import com.efx.Science.service.CdyhaService;
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
		String fpath = ExcelExport.class.getClass().getResource("/").getPath();
		fpath =fpath.substring(1,fpath.length())+"static/upload/xyqewm/";
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
