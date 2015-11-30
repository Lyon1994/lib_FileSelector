package org.lyon_yan.app.android.lib.FileSelector.viewController;

import java.io.File;

import org.lyon_yan.app.android.lib.FileSelector.view.RecylerViewItem_yn_fs;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.View;

/**
 * 
 * @author Lyon_Yan <br/>
 *         <b>time</b>: 2015年11月30日 下午2:16:19
 */
public class Item extends ViewHolder {

	public Item(View itemView) {
		super(itemView);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午2:17:55
	 * @param file_name
	 */
	public void initData(String file_name) {
		Log.v("lyon8", "Init file_path:" + file_name);
		getObject().initData(new File(file_name));
	}

	/**
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午2:17:52
	 * @return
	 */
	public RecylerViewItem_yn_fs getObject() {
		return itemView == null ? null : (RecylerViewItem_yn_fs) itemView;
	}
}
