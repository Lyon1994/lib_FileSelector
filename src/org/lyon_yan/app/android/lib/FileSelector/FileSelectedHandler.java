package org.lyon_yan.app.android.lib.FileSelector;

import java.io.File;

/**
 * 
 * @author Lyon_Yan <br/>
 *         <b>time</b>: 2015年11月30日 下午5:37:30
 */
public abstract class FileSelectedHandler {
	public abstract void handleMessage(File file);

	public void sendFile(File file) {
		handleMessage(file);
	}
}
