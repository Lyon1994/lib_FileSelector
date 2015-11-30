package org.lyon_yan.app.android.lib.FileSelector.view;

import java.io.File;

import org.lyon_yan.app.android.lib.FileSelector.FileSelectedHandler;
import org.lyon_yan.app.android.lib.FileSelector.data.DataSource;
import org.lyon_yan.app.android.lib.FileSelector.viewController.RecylerViewAdapter_yn_fs;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * 
 * @author Lyon_Yan <br/>
 *         <b>time</b>: 2015年11月30日 下午2:21:00
 */
public class RecylerView_yn_fs extends RecyclerView {
	private static File current_dir = DataSource.getRootFile();
	private FileSelectedHandler fileSelectedHandler = null;

	public RecylerView_yn_fs(Context arg0, AttributeSet arg1, int arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
		init();
	}

	public RecylerView_yn_fs(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		init();
	}

	public RecylerView_yn_fs(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		initView();
	}

	/**
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午2:21:22
	 * @param layoutManager
	 */
	public void initLayoutManager(LayoutManager layoutManager) {
		// TODO Auto-generated method stub
		setLayoutManager(layoutManager);
	}

	private void initView() {
		// TODO Auto-generated method stub
		initLayoutManager(new LinearLayoutManager(getContext()));
		setAdapter(new RecylerViewAdapter_yn_fs(this));
	}

	/**
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午2:21:27
	 * @return
	 */
	public File getCurrent_dir() {
		return RecylerView_yn_fs.current_dir;
	}

	/**
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午2:21:31
	 * @param current_dir
	 */
	public void setCurrent_dir(File current_dir) {
		RecylerView_yn_fs.current_dir = current_dir;
	}

	/**
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午2:21:34
	 * @return
	 */
	public String[] list() {
		return getCurrent_dir().list();
	}

	public FileSelectedHandler getFileSelectedHandler() {
		return fileSelectedHandler;
	}

	public void setFileSelectedHandler(FileSelectedHandler fileSelectedHandler) {
		this.fileSelectedHandler = fileSelectedHandler;
	}
}
