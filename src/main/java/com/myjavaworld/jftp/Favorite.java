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
package com.myjavaworld.jftp;

/**
 * Objects of this class encapsulate the information of FTP site parameters.
 * 
 * @author Sai Pullabhotla, psai [at] jMethods [dot] com
 * @version 2.0
 * 
 */
public class Favorite extends RemoteHost implements java.io.Serializable,
		Comparable {

	private static final long serialVersionUID = -8742993458243896488L;

	/**
	 * Creates a new instance of Favorite
	 */
	public Favorite() {
		super();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Favorite)) {
			return false;
		}
		Favorite that = (Favorite) obj;
		return this.name.equalsIgnoreCase(that.name);
	}

	public int hashcode() {
		return name.hashCode();
	}

	@Override
	public int compareTo(Object obj) {
		Favorite that = (Favorite) obj;
		return this.name.toUpperCase().compareTo(that.name.toUpperCase());
	}
}
