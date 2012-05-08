/*
 * Copyright 2012 jMethods, Inc. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.myjavaworld.util;

import java.util.EventObject;

/**
 * 
 * @author Sai Pullabhotla
 * 
 */
public class ProgressEvent extends EventObject {

	private int progress = 0;

	public ProgressEvent(Object source, int progress) {
		super(source);
		this.progress = progress;
	}

	public int getProgress() {
		return progress;
	}
}