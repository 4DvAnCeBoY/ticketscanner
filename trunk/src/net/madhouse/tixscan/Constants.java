/*
 *  Copyright 2010 Brian C. Young and listed contributors
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may 
 *  not use this file except in compliance with the License. You may obtain a 
 *  copy of the License at 
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0 
 *  
 *  Unless required by applicable law or agreed to in writing, software 
 *  distributed under the License is distributed on an "AS IS" BASIS, 
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 *  See the License for the specific language governing permissions and 
 *  limitations under the License. 
 */
package net.madhouse.tixscan;


public final class Constants {
	public static final String PREFS_FILE = "TixScanPrefs";
	
	public static final String PREF_DUPLICATE_BEHAVIOUR = "DuplicateBehaviour";
	public static final int DUP_ACCEPT_CONTINUE = 0;
	public static final int DUP_ACCEPT_PAUSE = 1;
	public static final int DUP_REJECT_CONTINUE = 2;
	public static final int DUP_REJECT_PAUSE = 3;
	
	public static final String MIME_TYPE_DIR = "vnd.android.cursor.dir/net.madhouse.tixscan.list";
	public static final String MIME_TYPE_ITEM = "vnd.android.cursor.item/net.madhouse.tixscan.list";
	
	private Constants() {}
}
