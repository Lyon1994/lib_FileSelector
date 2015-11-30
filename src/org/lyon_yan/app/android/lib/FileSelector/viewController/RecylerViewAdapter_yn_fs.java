package org.lyon_yan.app.android.lib.FileSelector.viewController;

import java.io.File;

import org.lyon_yan.app.android.lib.FileSelector.view.RecylerViewItem_yn_fs;
import org.lyon_yan.app.android.lib.FileSelector.view.RecylerView_yn_fs;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;

/**
 * 
 * @author Lyon_Yan <br/>
 *         <b>time</b>: 2015年11月30日 下午2:30:55
 */
public class RecylerViewAdapter_yn_fs extends Adapter<Item> {
	private RecylerView_yn_fs recylerView_yn_fs = null;

	public RecylerViewAdapter_yn_fs(RecylerView_yn_fs recylerView_yn_fs) {
		// TODO Auto-generated constructor stub
		setRecylerView(recylerView_yn_fs);
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return getRecylerView().list().length;
	}

	@Override
	public void onBindViewHolder(Item arg0, int arg1) {
		// TODO Auto-generated method stub
		arg0.initData(getRecylerView().getCurrent_dir().getAbsolutePath()
				+ getRecylerView().list()[arg1]);
	}

	private OnClickListener onItemClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			RecylerViewItem_yn_fs fs = (RecylerViewItem_yn_fs) v;
			File file = fs.getFile();
			if (file.isDirectory()) {
				recylerView_yn_fs.setCurrent_dir(file);
				notifyDataSetChanged();
			} else {
				if (recylerView_yn_fs.getFileSelectedHandler() != null) {
					recylerView_yn_fs.getFileSelectedHandler().sendFile(file);
				}
			}
		}
	};

	@SuppressLint("InlinedApi")
	@Override
	public Item onCreateViewHolder(ViewGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		RecylerViewItem_yn_fs fs = new RecylerViewItem_yn_fs(getRecylerView()
				.getContext());
		LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.WRAP_CONTENT);
		fs.setLayoutParams(layoutParams);
		fs.setOnClickListener(onItemClickListener);
		return new Item(fs);
	}

	public RecylerView_yn_fs getRecylerView() {
		return recylerView_yn_fs;
	}

	public void setRecylerView(RecylerView_yn_fs recylerView_yn_fs) {
		this.recylerView_yn_fs = recylerView_yn_fs;
	}
}
