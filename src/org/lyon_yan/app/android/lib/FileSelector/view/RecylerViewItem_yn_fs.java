package org.lyon_yan.app.android.lib.FileSelector.view;

import java.io.File;

import org.lyon_yan.android.utils.widget.ShadowWaveUtils;
import org.lyon_yan.app.android.lib.FileSelector.IconManager;
import org.lyon_yan.app.android.lib.FileSelector.R;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * 
 * @author Lyon_Yan <br/>
 *         <b>time</b>: 2015年11月30日 下午1:17:43
 */
public class RecylerViewItem_yn_fs extends LinearLayout {
	private File file = null;
	private ShadowWaveUtils shadowWaveUtils = null;

	public RecylerViewItem_yn_fs(Context context, AttributeSet attrs,
			int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		// TODO Auto-generated constructor stub
		shadowWaveUtils = ShadowWaveUtils.BindView(this, attrs, defStyleAttr);
		init();
	}

	/**
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午4:30:18
	 * @param textColor
	 */
	public void setTextColor(int textColor) {
		// TODO Auto-generated method stub
		textView_file_name.setTextColor(textColor);
		fontAwesomeTextView_yn_fs.setTextColor(textColor);
	}

	public RecylerViewItem_yn_fs(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		shadowWaveUtils = ShadowWaveUtils.BindView(this, attrs, defStyleAttr);
		init();
	}

	public RecylerViewItem_yn_fs(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		shadowWaveUtils = ShadowWaveUtils.BindView(this, attrs);
		init();
	}

	public RecylerViewItem_yn_fs(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		shadowWaveUtils = ShadowWaveUtils.BindView(this);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		LayoutInflater.from(getContext()).inflate(
				R.layout.yn_fs_recyler_view_item, this, true);
		initView();
	}

	private FontAwesomeTextView_yn_fs fontAwesomeTextView_yn_fs = null;
	private TextView textView_file_name = null;

	private void initView() {
		// TODO Auto-generated method stub
		fontAwesomeTextView_yn_fs = (FontAwesomeTextView_yn_fs) findViewById(R.id.fontAwesomeTextViewynfs);
		textView_file_name = (TextView) findViewById(R.id.textView_file_name);
	}

	/**
	 * 初始化数据
	 * 
	 * @author Lyon_Yan <br/>
	 *         <b>time</b>: 2015年11月30日 下午1:35:26
	 * @param file
	 */
	public void initData(@NonNull File file) {
		// TODO Auto-generated method stub
		setFile(file);
		Log.d("lyon8", "Init file(" + file.getName()
				+ ") is null or not exists?:" + file != null
				&& file.exists() ? "Yes" : "No");
		if (file != null && file.exists()) {
			if (file.isDirectory()) {
				fontAwesomeTextView_yn_fs.setText(getResources().getString(
						IconManager.getIconByFloder()));
			} else {
				fontAwesomeTextView_yn_fs.setText(getResources().getString(
						IconManager.getIconByFile(file)));
			}
			textView_file_name.setText(file.getName());
		} else {
			fontAwesomeTextView_yn_fs.setText(getResources().getString(
					IconManager.getIconByFileName("")));
			textView_file_name.setText("unknow");
		}
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		shadowWaveUtils.BindOnDraw(canvas);
		super.onDraw(canvas);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		shadowWaveUtils.BindWaveMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return shadowWaveUtils.BindOnTouchEvent(event);
	}
}
