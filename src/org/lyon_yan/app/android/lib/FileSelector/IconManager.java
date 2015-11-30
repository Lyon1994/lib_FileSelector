package org.lyon_yan.app.android.lib.FileSelector;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import android.support.annotation.NonNull;

/**
 * 
 * @author Lyon_Yan <br/>
 *         <b>time</b>: 2015年11月30日 上午10:18:43
 */
public class IconManager {

	private static final String DEFAULT = "default";
	private static Map<String, Integer> map = new HashMap<>();
	static {
		/**
		 * zip
		 */
		map.put("rar", R.string.fa_file_archive_o);
		map.put("zip", R.string.fa_file_zip_o);
		map.put("7z", R.string.fa_file_archive_o);
		/**
		 * image file
		 */
		map.put("jpg", R.string.fa_file_image_o);
		map.put("png", R.string.fa_file_image_o);
		map.put("gif", R.string.fa_file_image_o);
		map.put("bmp", R.string.fa_file_image_o);
		map.put("jpeg", R.string.fa_file_image_o);
		/**
		 * video
		 */
		map.put("mp4", R.string.fa_file_video_o);
		map.put("rmvb", R.string.fa_file_video_o);
		map.put("avi", R.string.fa_file_video_o);
		map.put("swf", R.string.fa_file_video_o);
		/**
		 * sound
		 */
		map.put("mp3", R.string.fa_file_sound_o);
		map.put("ogg", R.string.fa_file_sound_o);
		/**
		 * word
		 */
		map.put("doc", R.string.fa_file_word_o);
		map.put("docx", R.string.fa_file_word_o);
		map.put("wps", R.string.fa_file_word_o);

		/**
		 * txt
		 */
		map.put("txt", R.string.fa_file_text_o);
		map.put("css", R.string.fa_file_text_o);
		map.put("js", R.string.fa_file_text_o);
		map.put("json", R.string.fa_file_text_o);
		map.put("c", R.string.fa_file_text_o);
		map.put("cpp", R.string.fa_file_text_o);
		map.put("conf", R.string.fa_file_text_o);
		/**
		 * xml
		 */
		map.put("xml", R.string.fa_file_code_o);
		map.put("html", R.string.fa_file_code_o);
		map.put("htm", R.string.fa_file_code_o);
		map.put("asp", R.string.fa_file_text_o);
		map.put("aspx", R.string.fa_file_text_o);
		map.put("jsp", R.string.fa_file_text_o);
		map.put("php", R.string.fa_file_text_o);
		/**
		 * excel
		 */
		map.put("xls", R.string.fa_file_excel_o);
		/**
		 * ppt
		 */
		map.put("ppt", R.string.fa_file_powerpoint_o);
		map.put("pptx", R.string.fa_file_powerpoint_o);
		/**
		 * pdf
		 */
		map.put("docx", R.string.fa_file_pdf_o);
		/**
		 * apk
		 */
		map.put("apk", R.string.fa_android);
		/**
		 * others
		 */
		map.put("", R.string.fa_file_o);
		map.put(DEFAULT, R.string.fa_file_o);
	}

	/**
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 上午11:32:33
	 * @param file_name
	 * @return
	 */
	public static int getIconByFileName(String file_name) {
		// TODO Auto-generated method stub
		return map.get(getSuffix(file_name));
	}

	/**
	 * 获取后缀名
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 上午11:06:29
	 * @param file_name
	 * @return
	 */
	private static String getSuffix(@NonNull String file_name) {
		if (file_name == null)
			return DEFAULT;
		if (file_name.contains(".")) {
			file_name.substring(file_name.lastIndexOf(".") + 1);
			return DEFAULT;
		} else {
			return DEFAULT;
		}
	}

	public static int getIconByFile(File file) {
		// TODO Auto-generated method stub
		return getIconByFileName(file.getName());
	}

	public static int getIconByFloder() {
		// TODO Auto-generated method stub
		return R.string.fa_folder_o;
	}

	public static int getIconByFloderOpen() {
		// TODO Auto-generated method stub
		return R.string.fa_folder_open_o;
	}
}
