package org.lyon_yan.app.android.lib.FileSelector.view;

import org.lyon_yan.android.lib_FontAwesome.FontManager;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * 
 * @author Lyon_Yan <br/>
 *         <b>time</b>: 2015年11月28日 下午4:25:22
 */
public class FontAwesomeTextView_yn_fs extends AppCompatTextView {

	public FontAwesomeTextView_yn_fs(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
		init();
	}

	public FontAwesomeTextView_yn_fs(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		init();
	}

	public FontAwesomeTextView_yn_fs(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		if (!isInEditMode()) {
			FontManager.markAsIconContainer(this,
					FontManager.getTypeface(getContext()));
		}
	}
}
