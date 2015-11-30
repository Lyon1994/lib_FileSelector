package org.lyon_yan.app.android.lib.FileSelector.data;

import java.io.File;

import android.os.Environment;

/**
 * 获取root权限
 * 
 * @author Lyon_Yan <br/>
 *         <b>time</b>: 2015年11月30日 下午1:45:41
 */
public class DataSource {
	/**
	 * 获取主目录的文件夹
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午1:46:24
	 */
	public static File getRootFile() {
		// TODO Auto-generated method stub
		return new File("/");
	}

	/**
	 * 获取内置SD卡路径
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午1:50:49
	 * @return
	 */
	public static File getInnerSDCardPath() {
		return Environment.getExternalStorageDirectory();
	}
	
	/**
     * 获取外置SD卡路径
	 * @author Lyon_Yan
	 * <br/><b>time</b>: 2015年11月30日 下午1:53:07
     * @return  应该就一条记录或空
	 */
//    public static List<File> getExtSDCardPath(){
//    	
//    }
}
